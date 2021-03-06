// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from idl.djinni

package com.ledger.reactnative;

import co.ledger.core.AlgorandPaymentInfo;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.TimeZone;
import java.util.UUID;

@ReactModule(name = "RCTCoreAlgorandPaymentInfo")
public class RCTCoreAlgorandPaymentInfo extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;
    private Map<String, AlgorandPaymentInfo> javaObjects;
    public Map<String, AlgorandPaymentInfo> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreAlgorandPaymentInfo(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, AlgorandPaymentInfo>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreAlgorandPaymentInfo";
    }
    @ReactMethod
    public void release(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            this.javaObjects.remove(uid);
            promise.resolve(0);
        }
        else
        {
            promise.reject("Failed to release instance of RCTCoreAlgorandPaymentInfo", "First parameter of RCTCoreAlgorandPaymentInfo::release should be an instance of RCTCoreAlgorandPaymentInfo");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, AlgorandPaymentInfo> elem : this.javaObjects.entrySet())
        {
            result.pushString(elem.getKey());
        }
        promise.resolve(result);
    }
    @ReactMethod
    public void flush(Promise promise)
    {
        this.javaObjects.clear();
        promise.resolve(0);
    }
    @ReactMethod
    public void isNull(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            if (this.javaObjects.get(uid) == null)
            {
                promise.resolve(true);
                return;
            }
            else
            {
                promise.resolve(false);
                return;
            }
        }
        promise.resolve(true);
    }

    @ReactMethod
    public void init(String recipientAddress, String amount, String closeAddress, String closeAmount, Promise promise) {
        AlgorandPaymentInfo javaResult = new AlgorandPaymentInfo(recipientAddress, amount, closeAddress, closeAmount);

        String uuid = UUID.randomUUID().toString();
        this.javaObjects.put(uuid, javaResult);
        WritableNativeMap finalResult = new WritableNativeMap();
        finalResult.putString("type","RCTCoreAlgorandPaymentInfo");
        finalResult.putString("uid",uuid);
        promise.resolve(finalResult);
    }
    @ReactMethod
    public void getRecipientAddress(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            AlgorandPaymentInfo javaObj = this.javaObjects.get(uid);
            String result = javaObj.getRecipientAddress();
            WritableNativeMap resultMap = new WritableNativeMap();
            resultMap.putString("value", result);
            promise.resolve(resultMap);
        }
        else
        {
            promise.reject("Failed to call RCTCoreAlgorandPaymentInfo::getRecipientAddress", "First parameter of RCTCoreAlgorandPaymentInfo::getRecipientAddress should be an instance of RCTCoreAlgorandPaymentInfo");
        }
    }

    @ReactMethod
    public void getAmount(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            AlgorandPaymentInfo javaObj = this.javaObjects.get(uid);
            String result = javaObj.getAmount();
            WritableNativeMap resultMap = new WritableNativeMap();
            resultMap.putString("value", result);
            promise.resolve(resultMap);
        }
        else
        {
            promise.reject("Failed to call RCTCoreAlgorandPaymentInfo::getAmount", "First parameter of RCTCoreAlgorandPaymentInfo::getAmount should be an instance of RCTCoreAlgorandPaymentInfo");
        }
    }

    @ReactMethod
    public void getCloseAddress(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            AlgorandPaymentInfo javaObj = this.javaObjects.get(uid);
            String result = javaObj.getCloseAddress();
            WritableNativeMap resultMap = new WritableNativeMap();
            resultMap.putString("value", result);
            promise.resolve(resultMap);
        }
        else
        {
            promise.reject("Failed to call RCTCoreAlgorandPaymentInfo::getCloseAddress", "First parameter of RCTCoreAlgorandPaymentInfo::getCloseAddress should be an instance of RCTCoreAlgorandPaymentInfo");
        }
    }

    @ReactMethod
    public void getCloseAmount(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            AlgorandPaymentInfo javaObj = this.javaObjects.get(uid);
            String result = javaObj.getCloseAmount();
            WritableNativeMap resultMap = new WritableNativeMap();
            resultMap.putString("value", result);
            promise.resolve(resultMap);
        }
        else
        {
            promise.reject("Failed to call RCTCoreAlgorandPaymentInfo::getCloseAmount", "First parameter of RCTCoreAlgorandPaymentInfo::getCloseAmount should be an instance of RCTCoreAlgorandPaymentInfo");
        }
    }

}
