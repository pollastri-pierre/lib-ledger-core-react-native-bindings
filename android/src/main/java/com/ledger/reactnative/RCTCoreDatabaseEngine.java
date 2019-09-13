// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from database.djinni

package com.ledger.reactnative;

import co.ledger.core.DatabaseConnectionPool;
import co.ledger.core.DatabaseEngine;
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

/** An interface to implement a custom SQL backend on host side instead of using a native backend. */
@ReactModule(name = "RCTCoreDatabaseEngine")
public class RCTCoreDatabaseEngine extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, DatabaseEngineImpl> javaObjects;
    public Map<String, DatabaseEngineImpl> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreDatabaseEngine(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, DatabaseEngineImpl>();
        WritableNativeMap.setUseNativeAccessor(true);
    }

    @Override
    public String getName()
    {
        return "RCTCoreDatabaseEngine";
    }
    @ReactMethod
    public void newInstance(Promise promise)
    {
        DatabaseEngineImpl newInstance = new DatabaseEngineImpl(this.reactContext);
        String uuid = UUID.randomUUID().toString();
        this.javaObjects.put(uuid, newInstance);
        WritableNativeMap finalResult = new WritableNativeMap();
        finalResult.putString("type","RCTCoreDatabaseEngine");
        finalResult.putString("uid",uuid);
        promise.resolve(finalResult);
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
            promise.reject("Failed to release instance of RCTCoreDatabaseEngine", "First parameter of RCTCoreDatabaseEngine::release should be an instance of RCTCoreDatabaseEngine");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, DatabaseEngineImpl> elem : this.javaObjects.entrySet())
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
     * Open a connection to a database using the given database name.
     * @params databaseName The name of the database to open
     * @return A connection pool to the given database
     */
    @ReactMethod
    public void connect(ReadableMap currentInstance, String databaseName, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DatabaseEngineImpl currentInstanceObj = this.javaObjects.get(sUid);

            DatabaseConnectionPool javaResult = currentInstanceObj.connect(databaseName);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreDatabaseConnectionPool rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDatabaseConnectionPool.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, (DatabaseConnectionPoolImpl)javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreDatabaseConnectionPool");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Get the maximum number of concurrent connection on a single database.
     * @return the maximum number of concurrent connection that the engine is able to open on a single database.
     */
    @ReactMethod
    public void getPoolSize(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DatabaseEngineImpl currentInstanceObj = this.javaObjects.get(sUid);

            int javaResult = currentInstanceObj.getPoolSize();
            WritableNativeMap result = new WritableNativeMap();
            result.putInt("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
