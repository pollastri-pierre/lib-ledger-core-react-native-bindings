// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet_pool.djinni

package com.ledger.reactnative;

import co.ledger.core.DatabaseBackend;
import co.ledger.core.DynamicObject;
import co.ledger.core.HttpClient;
import co.ledger.core.LogPrinter;
import co.ledger.core.PathResolver;
import co.ledger.core.RandomNumberGenerator;
import co.ledger.core.ThreadDispatcher;
import co.ledger.core.WalletPoolBuilder;
import co.ledger.core.WalletPoolCallback;
import co.ledger.core.WebSocketClient;
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

/** Class representing a wallet pool builder (to instanciate a wallet pool). */
@ReactModule(name = "RCTCoreWalletPoolBuilder")
public class RCTCoreWalletPoolBuilder extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, WalletPoolBuilder> javaObjects;
    public Map<String, WalletPoolBuilder> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreWalletPoolBuilder(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, WalletPoolBuilder>();
        WritableNativeMap.setUseNativeAccessor(true);
    }

    @Override
    public String getName()
    {
        return "RCTCoreWalletPoolBuilder";
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
            promise.reject("Failed to release instance of RCTCoreWalletPoolBuilder", "First parameter of RCTCoreWalletPoolBuilder::release should be an instance of RCTCoreWalletPoolBuilder");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, WalletPoolBuilder> elem : this.javaObjects.entrySet())
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
     * Set http client to be used for wallet pool build.
     * @param client, HttpClient
     * @return WalletPoolBuilder object, instance with wallet pool http client set
     */
    @ReactMethod
    public void setHttpClient(ReadableMap currentInstance, ReadableMap client, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            WalletPoolBuilder currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreHttpClient rctParam_client = this.reactContext.getNativeModule(RCTCoreHttpClient.class);
            HttpClient javaParam_0 = rctParam_client.getJavaObjects().get(client.getString("uid"));
            WalletPoolBuilder javaResult = currentInstanceObj.setHttpClient(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreWalletPoolBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreWalletPoolBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreWalletPoolBuilder");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Set web socket client, through which wallet pool will listen and get notified (by explorers, DBs...).
     * @param client, WebSocketClient object
     * @reutnr WalletPoolBuilder object, instance with wallet pool web socket client set
     */
    @ReactMethod
    public void setWebsocketClient(ReadableMap currentInstance, ReadableMap client, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            WalletPoolBuilder currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreWebSocketClient rctParam_client = this.reactContext.getNativeModule(RCTCoreWebSocketClient.class);
            WebSocketClient javaParam_0 = rctParam_client.getJavaObjects().get(client.getString("uid"));
            WalletPoolBuilder javaResult = currentInstanceObj.setWebsocketClient(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreWalletPoolBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreWalletPoolBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreWalletPoolBuilder");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Set path resolver that will be used for wallet pool creation to resolve wallet pool's (DB's, logs, preferences ...) paths.
     * @param pathResolver, Pathresolver object
     * @param WalletPoolBuilder object, instance with wallet pool path resolver set
     */
    @ReactMethod
    public void setPathResolver(ReadableMap currentInstance, ReadableMap pathResolver, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            WalletPoolBuilder currentInstanceObj = this.javaObjects.get(sUid);

            RCTCorePathResolver rctParam_pathResolver = this.reactContext.getNativeModule(RCTCorePathResolver.class);
            PathResolver javaParam_0 = rctParam_pathResolver.getJavaObjects().get(pathResolver.getString("uid"));
            WalletPoolBuilder javaResult = currentInstanceObj.setPathResolver(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreWalletPoolBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreWalletPoolBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreWalletPoolBuilder");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Set log printer that will be used for wallet pool creation to dump wallet pool's logs (for debug purposes).
     * @param printer, LogPrinter object
     * @param WalletPoolBuilder object, instance with wallet pool logger set
     */
    @ReactMethod
    public void setLogPrinter(ReadableMap currentInstance, ReadableMap printer, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            WalletPoolBuilder currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreLogPrinter rctParam_printer = this.reactContext.getNativeModule(RCTCoreLogPrinter.class);
            LogPrinter javaParam_0 = rctParam_printer.getJavaObjects().get(printer.getString("uid"));
            WalletPoolBuilder javaResult = currentInstanceObj.setLogPrinter(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreWalletPoolBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreWalletPoolBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreWalletPoolBuilder");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Set thread dispatcher that will be used for wallet pool creation to dispatch wallet pool's tasks through different threads.
     * @param dispatcher, ThreadDispatcher object
     * @param WalletPoolBuilder object, instance with wallet pool thread dispatcher set
     */
    @ReactMethod
    public void setThreadDispatcher(ReadableMap currentInstance, ReadableMap dispatcher, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            WalletPoolBuilder currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreThreadDispatcher rctParam_dispatcher = this.reactContext.getNativeModule(RCTCoreThreadDispatcher.class);
            ThreadDispatcher javaParam_0 = rctParam_dispatcher.getJavaObjects().get(dispatcher.getString("uid"));
            WalletPoolBuilder javaResult = currentInstanceObj.setThreadDispatcher(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreWalletPoolBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreWalletPoolBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreWalletPoolBuilder");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Set name that will be used for wallet pool creation.
     * @param name, string
     * @return WalletPoolBuilder object, instance with wallet pool name set
     */
    @ReactMethod
    public void setName(ReadableMap currentInstance, String name, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            WalletPoolBuilder currentInstanceObj = this.javaObjects.get(sUid);

            WalletPoolBuilder javaResult = currentInstanceObj.setName(name);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreWalletPoolBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreWalletPoolBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreWalletPoolBuilder");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Set password that will be used for wallet pool creation.
     * @param password, string
     * @return WalletPoolBuilder object, with wallet pool password set
     */
    @ReactMethod
    public void setPassword(ReadableMap currentInstance, String password, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            WalletPoolBuilder currentInstanceObj = this.javaObjects.get(sUid);

            WalletPoolBuilder javaResult = currentInstanceObj.setPassword(password);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreWalletPoolBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreWalletPoolBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreWalletPoolBuilder");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Set random number generator that will be used for wallet pool creation.
     * @param rng, RandomNumberGenerator object
     * @return WalletPoolBuilder object, with wallet pool random number generator set
     */
    @ReactMethod
    public void setRandomNumberGenerator(ReadableMap currentInstance, ReadableMap rng, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            WalletPoolBuilder currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreRandomNumberGenerator rctParam_rng = this.reactContext.getNativeModule(RCTCoreRandomNumberGenerator.class);
            RandomNumberGenerator javaParam_0 = rctParam_rng.getJavaObjects().get(rng.getString("uid"));
            WalletPoolBuilder javaResult = currentInstanceObj.setRandomNumberGenerator(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreWalletPoolBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreWalletPoolBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreWalletPoolBuilder");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Set database that will be used for wallet pool creation, it will store all wallet pool's data (created wallets, accounts, preferences ...).
     * @param backend, DatabaseBackend object
     * @return WalletPoolBuilder object, with wallet pool database set
     */
    @ReactMethod
    public void setDatabaseBackend(ReadableMap currentInstance, ReadableMap backend, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            WalletPoolBuilder currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreDatabaseBackend rctParam_backend = this.reactContext.getNativeModule(RCTCoreDatabaseBackend.class);
            DatabaseBackend javaParam_0 = rctParam_backend.getJavaObjects().get(backend.getString("uid"));
            WalletPoolBuilder javaResult = currentInstanceObj.setDatabaseBackend(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreWalletPoolBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreWalletPoolBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreWalletPoolBuilder");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Set configuration that will be used for wallet pool creation.
     * @param configuration, DynamicObject object
     * @return WalletPoolBuilder object, with wallet pool configuration set
     */
    @ReactMethod
    public void setConfiguration(ReadableMap currentInstance, ReadableMap configuration, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            WalletPoolBuilder currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreDynamicObject rctParam_configuration = this.reactContext.getNativeModule(RCTCoreDynamicObject.class);
            DynamicObject javaParam_0 = rctParam_configuration.getJavaObjects().get(configuration.getString("uid"));
            WalletPoolBuilder javaResult = currentInstanceObj.setConfiguration(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreWalletPoolBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreWalletPoolBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreWalletPoolBuilder");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Create wallet pool.
     * @param callback, Callback object returning a WalletPool instance
     */
    @ReactMethod
    public void build(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            WalletPoolBuilder currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreWalletPoolCallback javaParam_0 = RCTCoreWalletPoolCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.build(javaParam_0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Create an instance of the wallet pool builder.
     * @return WalletPoolBuilder object
     */
    @ReactMethod
    public void createInstance(Promise promise) {
        try
        {
            WalletPoolBuilder javaResult = WalletPoolBuilder.createInstance();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreWalletPoolBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreWalletPoolBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreWalletPoolBuilder");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
