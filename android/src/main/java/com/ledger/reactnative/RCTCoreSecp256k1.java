// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from secp256k1.djinni

package com.ledger.reactnative;

import co.ledger.core.Secp256k1;
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

/**Class implementing secp256k1 used in Bitcoin */
public class RCTCoreSecp256k1 extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, Secp256k1> javaObjects;
    public Map<String, Secp256k1> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreSecp256k1(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, Secp256k1>();
        WritableNativeMap.setUseNativeAccessor(true);
    }

    @Override
    public String getName()
    {
        return "RCTCoreSecp256k1";
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
            promise.reject("Failed to release instance of RCTCoreSecp256k1", "First parameter of RCTCoreSecp256k1::release should be an instance of RCTCoreSecp256k1");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, Secp256k1> elem : this.javaObjects.entrySet())
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
    static final String HEXES = "0123456789ABCDEF";
    public static String byteArrayToHexString( byte [] data)
    {
        if (data == null)
        {
            return null;
        }
        final StringBuilder hexStringBuilder = new StringBuilder( 2 * data.length );
        for ( final byte b : data )
        {
            hexStringBuilder.append(HEXES.charAt((b & 0xF0) >> 4)).append(HEXES.charAt((b & 0x0F)));
        }
        return hexStringBuilder.toString();
    }

    /**
     * Create an instance of Secp256k1
     * @return Secp256k1 instance
     */
    @ReactMethod
    public void createInstance(Promise promise) {
        try
        {
            Secp256k1 javaResult = Secp256k1.createInstance();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreSecp256k1 rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreSecp256k1.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreSecp256k1");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Generates public key from private key.
     * @param privKey 32 byte private key
     * @param compress get compressed (35 bytes) or uncompressed (65 bytes)
     * @return public key can be compressed (35 bytes starting with 02 or 03) or un compressed (65 bytes starting with 04)
     */
    @ReactMethod
    public void computePubKey(ReadableMap currentInstance, String privKey, boolean compress, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Secp256k1 currentInstanceObj = this.javaObjects.get(sUid);

            byte [] javaParam_0 = hexStringToByteArray(privKey);

            byte[] javaResult = currentInstanceObj.computePubKey(javaParam_0, compress);
            WritableNativeMap result = new WritableNativeMap();
            String finalJavaResult = new String(javaResult);
            result.putString("value", finalJavaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Signs message using a given private key
     * @param privKey 32 bytes private key
     * @param data 32 bytes message to sign
     * @return 32 bytes signed message
     */
    @ReactMethod
    public void sign(ReadableMap currentInstance, String privKey, String data, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Secp256k1 currentInstanceObj = this.javaObjects.get(sUid);

            byte [] javaParam_0 = hexStringToByteArray(privKey);

            byte [] javaParam_1 = hexStringToByteArray(data);

            byte[] javaResult = currentInstanceObj.sign(javaParam_0, javaParam_1);
            WritableNativeMap result = new WritableNativeMap();
            String finalJavaResult = new String(javaResult);
            result.putString("value", finalJavaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Check if message was signed with given signature and public key
     * @param data 32 bytes signed message
     * @param signature 32 bytes signature (generated from private key)
     * @param oubkey 32 bytes public key
     * @return true if message was signed with signature and public key (both issued from same private key)
     */
    @ReactMethod
    public void verify(ReadableMap currentInstance, String data, String signature, String pubKey, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Secp256k1 currentInstanceObj = this.javaObjects.get(sUid);

            byte [] javaParam_0 = hexStringToByteArray(data);

            byte [] javaParam_1 = hexStringToByteArray(signature);

            byte [] javaParam_2 = hexStringToByteArray(pubKey);

            boolean javaResult = currentInstanceObj.verify(javaParam_0, javaParam_1, javaParam_2);
            WritableNativeMap result = new WritableNativeMap();
            result.putBoolean("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void newInstance(Promise promise) {
        try
        {
            Secp256k1 javaResult = Secp256k1.newInstance();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreSecp256k1 rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreSecp256k1.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreSecp256k1");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
