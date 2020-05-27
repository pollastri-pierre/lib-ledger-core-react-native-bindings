// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from stellar_like_wallet.djinni

package com.ledger.reactnative;

import co.ledger.core.BoolCallback;
import co.ledger.core.StellarLikeWallet;
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

@ReactModule(name = "RCTCoreStellarLikeWallet")
public class RCTCoreStellarLikeWallet extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, StellarLikeWallet> javaObjects;
    public Map<String, StellarLikeWallet> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreStellarLikeWallet(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, StellarLikeWallet>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreStellarLikeWallet";
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
            promise.reject("Failed to release instance of RCTCoreStellarLikeWallet", "First parameter of RCTCoreStellarLikeWallet::release should be an instance of RCTCoreStellarLikeWallet");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, StellarLikeWallet> elem : this.javaObjects.entrySet())
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
    public void exists(ReadableMap currentInstance, String address, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            StellarLikeWallet currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreBoolCallback javaParam_1 = RCTCoreBoolCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.exists(address, javaParam_1);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}