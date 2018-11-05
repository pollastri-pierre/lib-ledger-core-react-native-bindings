// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from currency.djinni

package com.ledger.reactnative;

import co.ledger.core.CurrencyUnit;
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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/**Structure of cryptocurrency unit */
public class RCTCoreCurrencyUnit extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;
    private Map<String, CurrencyUnit> javaObjects;
    public Map<String, CurrencyUnit> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreCurrencyUnit(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, CurrencyUnit>();
        WritableNativeMap.setUseNativeAccessor(true);
    }

    @Override
    public String getName()
    {
        return "RCTCoreCurrencyUnit";
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
            promise.reject("Failed to release instance of RCTCoreCurrencyUnit", "First parameter of RCTCoreCurrencyUnit::release should be an instance of RCTCoreCurrencyUnit");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, CurrencyUnit> elem : this.javaObjects.entrySet())
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
    public void init(String name, String symbol, String code, int numberOfDecimal, Promise promise) {
        CurrencyUnit javaResult = new CurrencyUnit(name, symbol, code, numberOfDecimal);

        String uuid = UUID.randomUUID().toString();
        this.javaObjects.put(uuid, javaResult);
        WritableNativeMap finalResult = new WritableNativeMap();
        finalResult.putString("type","RCTCoreCurrencyUnit");
        finalResult.putString("uid",uuid);
        promise.resolve(finalResult);
    }
    @ReactMethod
    public void getName(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            CurrencyUnit javaObj = this.javaObjects.get(uid);
            String result = javaObj.getName();
            WritableNativeMap resultMap = new WritableNativeMap();
            resultMap.putString("value", result);
            promise.resolve(resultMap);
        }
        else
        {
            promise.reject("Failed to call RCTCoreCurrencyUnit::getName", "First parameter of RCTCoreCurrencyUnit::getName should be an instance of RCTCoreCurrencyUnit");
        }
    }

    @ReactMethod
    public void getSymbol(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            CurrencyUnit javaObj = this.javaObjects.get(uid);
            String result = javaObj.getSymbol();
            WritableNativeMap resultMap = new WritableNativeMap();
            resultMap.putString("value", result);
            promise.resolve(resultMap);
        }
        else
        {
            promise.reject("Failed to call RCTCoreCurrencyUnit::getSymbol", "First parameter of RCTCoreCurrencyUnit::getSymbol should be an instance of RCTCoreCurrencyUnit");
        }
    }

    @ReactMethod
    public void getCode(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            CurrencyUnit javaObj = this.javaObjects.get(uid);
            String result = javaObj.getCode();
            WritableNativeMap resultMap = new WritableNativeMap();
            resultMap.putString("value", result);
            promise.resolve(resultMap);
        }
        else
        {
            promise.reject("Failed to call RCTCoreCurrencyUnit::getCode", "First parameter of RCTCoreCurrencyUnit::getCode should be an instance of RCTCoreCurrencyUnit");
        }
    }

    @ReactMethod
    public void getNumberOfDecimal(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            CurrencyUnit javaObj = this.javaObjects.get(uid);
            int result = javaObj.getNumberOfDecimal();
            WritableNativeMap resultMap = new WritableNativeMap();
            resultMap.putInt("value", result);
            promise.resolve(resultMap);
        }
        else
        {
            promise.reject("Failed to call RCTCoreCurrencyUnit::getNumberOfDecimal", "First parameter of RCTCoreCurrencyUnit::getNumberOfDecimal should be an instance of RCTCoreCurrencyUnit");
        }
    }

}
