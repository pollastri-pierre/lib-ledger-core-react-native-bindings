// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from amount.djinni

package com.ledger.reactnative;

import co.ledger.core.Amount;
import co.ledger.core.BigInt;
import co.ledger.core.Currency;
import co.ledger.core.CurrencyUnit;
import co.ledger.core.FormatRules;
import co.ledger.core.Locale;
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

/**Class representing amount of transaction, output, inputs ... */
public class RCTCoreAmount extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, Amount> javaObjects;
    public Map<String, Amount> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreAmount(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, Amount>();
        WritableNativeMap.setUseNativeAccessor(true);
    }

    @Override
    public String getName()
    {
        return "RCTCoreAmount";
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
            promise.reject("Failed to release instance of RCTCoreAmount", "First parameter of RCTCoreAmount::release should be an instance of RCTCoreAmount");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, Amount> elem : this.javaObjects.entrySet())
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
     *Get amount as a BitInt
     *@return BitInt
     */
    @ReactMethod
    public void toBigInt(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Amount currentInstanceObj = this.javaObjects.get(sUid);

            BigInt javaResult = currentInstanceObj.toBigInt();

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
    /**
     *Get currency in which amount was computed
     *@return Currency object
     */
    @ReactMethod
    public void getCurrency(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Amount currentInstanceObj = this.javaObjects.get(sUid);

            Currency javaResult = currentInstanceObj.getCurrency();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreCurrency rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreCurrency.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreCurrency");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get currency unit in which amount was computed
     *@return CurrencyUnit object
     */
    @ReactMethod
    public void getUnit(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Amount currentInstanceObj = this.javaObjects.get(sUid);

            CurrencyUnit javaResult = currentInstanceObj.getUnit();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreCurrencyUnit rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreCurrencyUnit.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreCurrencyUnit");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Convert amount in another currency unit
     *@param CurrencyUnit object, target currency unit
     *@return Amount object, amount in target currency unit
     */
    @ReactMethod
    public void toUnit(ReadableMap currentInstance, ReadableMap unit, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Amount currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreCurrencyUnit rctParam_unit = this.reactContext.getNativeModule(RCTCoreCurrencyUnit.class);
            CurrencyUnit javaParam_0 = rctParam_unit.getJavaObjects().get(unit.getString("uid"));
            Amount javaResult = currentInstanceObj.toUnit(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreAmount rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreAmount.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreAmount");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**TODO */
    @ReactMethod
    public void toMagnitude(ReadableMap currentInstance, int magnitude, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Amount currentInstanceObj = this.javaObjects.get(sUid);

            Amount javaResult = currentInstanceObj.toMagnitude(magnitude);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreAmount rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreAmount.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreAmount");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get amount as string
     *@return string
     */
    @ReactMethod
    public void toString(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Amount currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.toString();
            WritableNativeMap result = new WritableNativeMap();
            result.putString("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get amount as long
     *@reutrn 64 bits integer
     */
    @ReactMethod
    public void toLong(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Amount currentInstanceObj = this.javaObjects.get(sUid);

            long javaResult = currentInstanceObj.toLong();
            WritableNativeMap result = new WritableNativeMap();
            result.putDouble("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get amount as double
     *@return double
     */
    @ReactMethod
    public void toDouble(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Amount currentInstanceObj = this.javaObjects.get(sUid);

            double javaResult = currentInstanceObj.toDouble();
            WritableNativeMap result = new WritableNativeMap();
            result.putDouble("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**TODO */
    @ReactMethod
    public void format(ReadableMap currentInstance, ReadableMap locale, Optional<ReadableMap> rules, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Amount currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreLocale rctParam_locale = this.reactContext.getNativeModule(RCTCoreLocale.class);
            Locale javaParam_0 = rctParam_locale.getJavaObjects().get(locale.getString("uid"));
            RCTCoreFormatRules rctParam_rules = this.reactContext.getNativeModule(RCTCoreFormatRules.class);
            FormatRules javaParam_1 = rctParam_rules.getJavaObjects().get(rules.get().getString("uid"));
            String javaResult = currentInstanceObj.format(javaParam_0, javaParam_1);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void fromHex(ReadableMap currency, String hex, Promise promise) {
        try
        {
            RCTCoreCurrency rctParam_currency = this.reactContext.getNativeModule(RCTCoreCurrency.class);
            Currency javaParam_0 = rctParam_currency.getJavaObjects().get(currency.getString("uid"));
            Amount javaResult = Amount.fromHex(javaParam_0, hex);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreAmount rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreAmount.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreAmount");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void fromLong(ReadableMap currency, long value, Promise promise) {
        try
        {
            RCTCoreCurrency rctParam_currency = this.reactContext.getNativeModule(RCTCoreCurrency.class);
            Currency javaParam_0 = rctParam_currency.getJavaObjects().get(currency.getString("uid"));
            Amount javaResult = Amount.fromLong(javaParam_0, value);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreAmount rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreAmount.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreAmount");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
