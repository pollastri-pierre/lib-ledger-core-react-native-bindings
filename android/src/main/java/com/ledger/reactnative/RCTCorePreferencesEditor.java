// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from preferences.djinni

package com.ledger.reactnative;

import co.ledger.core.PreferencesEditor;
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

/** Interface for editting Preferences. All changes to the editor are persisted to the disk only when comitted. */
public class RCTCorePreferencesEditor extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, PreferencesEditor> javaObjects;
    public Map<String, PreferencesEditor> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCorePreferencesEditor(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, PreferencesEditor>();
        WritableNativeMap.setUseNativeAccessor(true);
    }

    @Override
    public String getName()
    {
        return "RCTCorePreferencesEditor";
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
            promise.reject("Failed to release instance of RCTCorePreferencesEditor", "First parameter of RCTCorePreferencesEditor::release should be an instance of RCTCorePreferencesEditor");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, PreferencesEditor> elem : this.javaObjects.entrySet())
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
    public static byte[] hexStringToByteArray(String hexString)
    {
        int hexStringLength = hexString.length();
        byte[] data = new byte[hexStringLength / 2];
        for (int i = 0; i < hexStringLength; i += 2)
        {
            data[i / 2] = (byte) ((Character.digit(hexString.charAt(i), 16) << 4) + Character.digit(hexString.charAt(i+1), 16));
        }
        return data;
    }

    /**
     * Sets the value to the given key in the Preferences.
     * @param key The data key.
     * @param value The value to store
     * @return The reference of self in order to chain the call to the editor.
     */
    @ReactMethod
    public void putString(ReadableMap currentInstance, String key, String value, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            PreferencesEditor currentInstanceObj = this.javaObjects.get(sUid);

            PreferencesEditor javaResult = currentInstanceObj.putString(key, value);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCorePreferencesEditor rctImpl_javaResult = this.reactContext.getNativeModule(RCTCorePreferencesEditor.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCorePreferencesEditor");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Sets the value to the given key in the Preferences.
     * @param key The data key.
     * @param value The value to store
     * @return The reference of self in order to chain the call to the editor.
     */
    @ReactMethod
    public void putInt(ReadableMap currentInstance, String key, int value, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            PreferencesEditor currentInstanceObj = this.javaObjects.get(sUid);

            PreferencesEditor javaResult = currentInstanceObj.putInt(key, value);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCorePreferencesEditor rctImpl_javaResult = this.reactContext.getNativeModule(RCTCorePreferencesEditor.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCorePreferencesEditor");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Sets the value to the given key in the Preferences.
     * @param key The data key.
     * @param value The value to store
     * @return The reference of self in order to chain the call to the editor.
     */
    @ReactMethod
    public void putLong(ReadableMap currentInstance, String key, long value, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            PreferencesEditor currentInstanceObj = this.javaObjects.get(sUid);

            PreferencesEditor javaResult = currentInstanceObj.putLong(key, value);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCorePreferencesEditor rctImpl_javaResult = this.reactContext.getNativeModule(RCTCorePreferencesEditor.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCorePreferencesEditor");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Sets the value to the given key in the Preferences.
     * @param key The data key.
     * @param value The value to store
     * @return The reference of self in order to chain the call to the editor.
     */
    @ReactMethod
    public void putBoolean(ReadableMap currentInstance, String key, boolean value, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            PreferencesEditor currentInstanceObj = this.javaObjects.get(sUid);

            PreferencesEditor javaResult = currentInstanceObj.putBoolean(key, value);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCorePreferencesEditor rctImpl_javaResult = this.reactContext.getNativeModule(RCTCorePreferencesEditor.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCorePreferencesEditor");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Sets the value to the given key in the Preferences.
     * @param key The data key.
     * @param value The value to store
     * @return The reference of self in order to chain the call to the editor.
     */
    @ReactMethod
    public void putStringArray(ReadableMap currentInstance, String key, ReadableArray value, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            PreferencesEditor currentInstanceObj = this.javaObjects.get(sUid);

            ArrayList<String> javaParam_1 = new ArrayList<String>();
            for (int i = 0; i <  value.size(); i++)
            {
                String value_elem = value.getString(i);
                javaParam_1.add(value_elem);
            }
            PreferencesEditor javaResult = currentInstanceObj.putStringArray(key, javaParam_1);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCorePreferencesEditor rctImpl_javaResult = this.reactContext.getNativeModule(RCTCorePreferencesEditor.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCorePreferencesEditor");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Sets the value to the given key in the Preferences.
     * @param key The data key.
     * @param value The value to store
     * @return The reference of self in order to chain the call to the editor.
     */
    @ReactMethod
    public void putData(ReadableMap currentInstance, String key, String value, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            PreferencesEditor currentInstanceObj = this.javaObjects.get(sUid);

            byte [] javaParam_1 = hexStringToByteArray(value);

            PreferencesEditor javaResult = currentInstanceObj.putData(key, javaParam_1);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCorePreferencesEditor rctImpl_javaResult = this.reactContext.getNativeModule(RCTCorePreferencesEditor.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCorePreferencesEditor");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Removes the data associated with the given key.
     * @param key The key to remove from the Preferences
     * @return The reference of self in order to chain the call to the editor.
     */
    @ReactMethod
    public void remove(ReadableMap currentInstance, String key, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            PreferencesEditor currentInstanceObj = this.javaObjects.get(sUid);

            PreferencesEditor javaResult = currentInstanceObj.remove(key);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCorePreferencesEditor rctImpl_javaResult = this.reactContext.getNativeModule(RCTCorePreferencesEditor.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCorePreferencesEditor");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Persists the changes to the Preferences. */
    @ReactMethod
    public void commit(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            PreferencesEditor currentInstanceObj = this.javaObjects.get(sUid);

            currentInstanceObj.commit();
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
