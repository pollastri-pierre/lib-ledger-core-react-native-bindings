// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

package com.ledger.reactnative;

import co.ledger.core.CosmosLikeMessage;
import co.ledger.core.CosmosLikeOperation;
import co.ledger.core.CosmosLikeTransaction;
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

/**Class representing a Cosmos Operation */
@ReactModule(name = "RCTCoreCosmosLikeOperation")
public class RCTCoreCosmosLikeOperation extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, CosmosLikeOperation> javaObjects;
    public Map<String, CosmosLikeOperation> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreCosmosLikeOperation(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, CosmosLikeOperation>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreCosmosLikeOperation";
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
            promise.reject("Failed to release instance of RCTCoreCosmosLikeOperation", "First parameter of RCTCoreCosmosLikeOperation::release should be an instance of RCTCoreCosmosLikeOperation");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, CosmosLikeOperation> elem : this.javaObjects.entrySet())
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

    /**
     *Get operation's transaction
     *@return CosmosLikeTransaction object
     */
    @ReactMethod
    public void getTransaction(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            CosmosLikeOperation currentInstanceObj = this.javaObjects.get(sUid);

            CosmosLikeTransaction javaResult = currentInstanceObj.getTransaction();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreCosmosLikeTransaction rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreCosmosLikeTransaction.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreCosmosLikeTransaction");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Get message which created this operation
     * @return CosmosLikeMessage object
     */
    @ReactMethod
    public void getMessage(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            CosmosLikeOperation currentInstanceObj = this.javaObjects.get(sUid);

            CosmosLikeMessage javaResult = currentInstanceObj.getMessage();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreCosmosLikeMessage rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreCosmosLikeMessage.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreCosmosLikeMessage");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
