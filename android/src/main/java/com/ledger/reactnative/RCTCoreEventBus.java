// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from emitter.djinni

package com.ledger.reactnative;

import co.ledger.core.EventBus;
import co.ledger.core.EventReceiver;
import co.ledger.core.ExecutionContext;
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

/**Class representing an event bus through which a receiver gets notified */
public class RCTCoreEventBus extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, EventBus> javaObjects;
    public Map<String, EventBus> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreEventBus(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, EventBus>();
        WritableNativeMap.setUseNativeAccessor(true);
    }

    @Override
    public String getName()
    {
        return "RCTCoreEventBus";
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
            promise.reject("Failed to release instance of RCTCoreEventBus", "First parameter of RCTCoreEventBus::release should be an instance of RCTCoreEventBus");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, EventBus> elem : this.javaObjects.entrySet())
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

    /**
     *Subscribe an event receiver to the event bus
     *@param context, ExecutionContext object, execution context in which receiver will be notified
     *@param reveiver, EventReceiver object, receiver that event bu will notify
     */
    @ReactMethod
    public void subscribe(ReadableMap currentInstance, ReadableMap context, ReadableMap receiver, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            EventBus currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreExecutionContext rctParam_context = this.reactContext.getNativeModule(RCTCoreExecutionContext.class);
            ExecutionContext javaParam_0 = rctParam_context.getJavaObjects().get(context.getString("uid"));
            ExecutionContextImpl javaParam_0_java = (ExecutionContextImpl)javaParam_0;
            javaParam_0_java.setPromise(promise);
            RCTCoreEventReceiver rctParam_receiver = this.reactContext.getNativeModule(RCTCoreEventReceiver.class);
            EventReceiver javaParam_1 = rctParam_receiver.getJavaObjects().get(receiver.getString("uid"));
            EventReceiverImpl javaParam_1_java = (EventReceiverImpl)javaParam_1;
            javaParam_1_java.setPromise(promise);
            currentInstanceObj.subscribe(javaParam_0, javaParam_1);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Unsubscribe an event receiver from the event bus
     *@param receiver, EventReceiver object, receiver to unsubscribe
     */
    @ReactMethod
    public void unsubscribe(ReadableMap currentInstance, ReadableMap receiver, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            EventBus currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreEventReceiver rctParam_receiver = this.reactContext.getNativeModule(RCTCoreEventReceiver.class);
            EventReceiver javaParam_0 = rctParam_receiver.getJavaObjects().get(receiver.getString("uid"));
            EventReceiverImpl javaParam_0_java = (EventReceiverImpl)javaParam_0;
            javaParam_0_java.setPromise(promise);
            currentInstanceObj.unsubscribe(javaParam_0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
