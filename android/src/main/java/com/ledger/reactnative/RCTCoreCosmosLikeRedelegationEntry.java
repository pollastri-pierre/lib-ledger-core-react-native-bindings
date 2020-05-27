// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

package com.ledger.reactnative;

import co.ledger.core.BigInt;
import co.ledger.core.CosmosLikeRedelegationEntry;
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

@ReactModule(name = "RCTCoreCosmosLikeRedelegationEntry")
public class RCTCoreCosmosLikeRedelegationEntry extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, CosmosLikeRedelegationEntry> javaObjects;
    public Map<String, CosmosLikeRedelegationEntry> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreCosmosLikeRedelegationEntry(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, CosmosLikeRedelegationEntry>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreCosmosLikeRedelegationEntry";
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
            promise.reject("Failed to release instance of RCTCoreCosmosLikeRedelegationEntry", "First parameter of RCTCoreCosmosLikeRedelegationEntry::release should be an instance of RCTCoreCosmosLikeRedelegationEntry");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, CosmosLikeRedelegationEntry> elem : this.javaObjects.entrySet())
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

    /** Block height of the begin redelegate request */
    @ReactMethod
    public void getCreationHeight(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            CosmosLikeRedelegationEntry currentInstanceObj = this.javaObjects.get(sUid);

            BigInt javaResult = currentInstanceObj.getCreationHeight();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreBigInt rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBigInt.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreBigInt");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Timestamp of the redelegation completion */
    @ReactMethod
    public void getCompletionTime(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            CosmosLikeRedelegationEntry currentInstanceObj = this.javaObjects.get(sUid);

            Date javaResult = currentInstanceObj.getCompletionTime();
            WritableNativeMap result = new WritableNativeMap();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
            dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String finalJavaResult = dateFormat.format(javaResult);
            result.putString("value", finalJavaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Balance requested to redelegate */
    @ReactMethod
    public void getInitialBalance(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            CosmosLikeRedelegationEntry currentInstanceObj = this.javaObjects.get(sUid);

            BigInt javaResult = currentInstanceObj.getInitialBalance();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreBigInt rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBigInt.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreBigInt");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Current amount being redelegated (i.e. less than initialBalance if slashed) */
    @ReactMethod
    public void getBalance(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            CosmosLikeRedelegationEntry currentInstanceObj = this.javaObjects.get(sUid);

            BigInt javaResult = currentInstanceObj.getBalance();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreBigInt rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBigInt.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreBigInt");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}