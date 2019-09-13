// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from addresses.djinni

package com.ledger.reactnative;

import co.ledger.core.TezosLikeAddress;
import co.ledger.core.TezosLikeNetworkParameters;
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

/** Helper class for manipulating Tezos like addresses. */
@ReactModule(name = "RCTCoreTezosLikeAddress")
public class RCTCoreTezosLikeAddress extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, TezosLikeAddress> javaObjects;
    public Map<String, TezosLikeAddress> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreTezosLikeAddress(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, TezosLikeAddress>();
        WritableNativeMap.setUseNativeAccessor(true);
    }

    @Override
    public String getName()
    {
        return "RCTCoreTezosLikeAddress";
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
            promise.reject("Failed to release instance of RCTCoreTezosLikeAddress", "First parameter of RCTCoreTezosLikeAddress::release should be an instance of RCTCoreTezosLikeAddress");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, TezosLikeAddress> elem : this.javaObjects.entrySet())
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
     * Gets the version of the address.
     * @return The version of the address
     */
    @ReactMethod
    public void getVersion(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            TezosLikeAddress currentInstanceObj = this.javaObjects.get(sUid);

            byte[] javaResult = currentInstanceObj.getVersion();
            WritableNativeMap result = new WritableNativeMap();
            String finalJavaResult = byteArrayToHexString(javaResult);
            result.putString("value", finalJavaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Gets the raw hash160 of the public key
     * @return The 20 bytes of the public key hash160
     */
    @ReactMethod
    public void getHash160(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            TezosLikeAddress currentInstanceObj = this.javaObjects.get(sUid);

            byte[] javaResult = currentInstanceObj.getHash160();
            WritableNativeMap result = new WritableNativeMap();
            String finalJavaResult = byteArrayToHexString(javaResult);
            result.putString("value", finalJavaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Gets the network parameters used for serializing the address.
     * @return The network parameters of the address
     */
    @ReactMethod
    public void getNetworkParameters(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            TezosLikeAddress currentInstanceObj = this.javaObjects.get(sUid);

            TezosLikeNetworkParameters javaResult = currentInstanceObj.getNetworkParameters();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreTezosLikeNetworkParameters rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreTezosLikeNetworkParameters.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreTezosLikeNetworkParameters");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Encodes to Base58.
     * @return The Base58 encoding
     */
    @ReactMethod
    public void toBase58(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            TezosLikeAddress currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.toBase58();
            WritableNativeMap result = new WritableNativeMap();
            result.putString("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
