// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from currency.djinni

package com.ledger.reactnative;

import co.ledger.core.BitcoinLikeNetworkParameters;
import co.ledger.core.Currency;
import co.ledger.core.CurrencyUnit;
import co.ledger.core.WalletType;
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

/**Structure of cryptocurrency */
public class RCTCoreCurrency extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;
    private Map<String, Currency> javaObjects;
    private WritableNativeMap implementationsData;
    public Map<String, Currency> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreCurrency(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, Currency>();
        WritableNativeMap.setUseNativeAccessor(true);
        this.implementationsData = new WritableNativeMap();
    }

    @Override
    public String getName()
    {
        return "RCTCoreCurrency";
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
            promise.reject("Failed to release instance of RCTCoreCurrency", "First parameter of RCTCoreCurrency::release should be an instance of RCTCoreCurrency");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, Currency> elem : this.javaObjects.entrySet())
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
    public void init(int walletType, String name, int bip44CoinType, String paymentUriScheme, ReadableArray units, Optional<ReadableMap> bitcoinLikeNetworkParameters, Promise promise) {
        WritableNativeMap implementationsData = new WritableNativeMap();
        if (walletType < 0 || WalletType.values().length <= walletType)
        {
            promise.reject("Enum error", "Failed to get enum WalletType");
            return;
        }
        WalletType javaParam_0 = WalletType.values()[walletType];
        ArrayList<CurrencyUnit> javaParam_4 = new ArrayList<CurrencyUnit>();
        WritableNativeArray javaParam_4_data = new WritableNativeArray();

        for (int i = 0; i <  units.size(); i++)
        {
            ReadableMap units_elem = units.getMap(i);
            RCTCoreCurrencyUnit rctParam_units_elem = this.reactContext.getNativeModule(RCTCoreCurrencyUnit.class);
            CurrencyUnit javaParam_4_elem = rctParam_units_elem.getJavaObjects().get(units_elem.getString("uid"));
            javaParam_4_data.pushString(units_elem.getString("uid"));
            javaParam_4.add(javaParam_4_elem);
        }
        implementationsData.putArray("units", javaParam_4_data);

        RCTCoreBitcoinLikeNetworkParameters rctParam_bitcoinLikeNetworkParameters = this.reactContext.getNativeModule(RCTCoreBitcoinLikeNetworkParameters.class);
        BitcoinLikeNetworkParameters javaParam_5 = rctParam_bitcoinLikeNetworkParameters.getJavaObjects().get(bitcoinLikeNetworkParameters.get().getString("uid"));
        implementationsData.putString("bitcoinLikeNetworkParameters", bitcoinLikeNetworkParameters.get().getString("uid"));
        Currency javaResult = new Currency(javaParam_0, name, bip44CoinType, paymentUriScheme, javaParam_4, javaParam_5);

        String uuid = UUID.randomUUID().toString();
        this.javaObjects.put(uuid, javaResult);
        WritableNativeMap finalResult = new WritableNativeMap();
        finalResult.putString("type","RCTCoreCurrency");
        finalResult.putString("uid",uuid);
        this.implementationsData.putMap(uuid, implementationsData);
        promise.resolve(finalResult);
    }
    public void mapImplementationsData(ReadableMap currentInstance)
    {
        String currentInstanceUid = currentInstance.getString("uid");
        Currency javaImpl = this.javaObjects.get(currentInstanceUid);
        WritableNativeMap implementationsData = new WritableNativeMap();
        ArrayList<CurrencyUnit> field_4 = javaImpl.getUnits();
        WritableNativeArray converted_field_4 = new WritableNativeArray();
        for (CurrencyUnit field_4_elem : field_4)
        {
            String field_4_elem_uuid = UUID.randomUUID().toString();
            RCTCoreCurrencyUnit rctImpl_field_4_elem = this.reactContext.getNativeModule(RCTCoreCurrencyUnit.class);
            rctImpl_field_4_elem.getJavaObjects().put(field_4_elem_uuid, field_4_elem);
            WritableNativeMap converted_field_4_elem = new WritableNativeMap();
            converted_field_4_elem.putString("type","RCTCoreCurrencyUnit");
            converted_field_4_elem.putString("uid",field_4_elem_uuid);
            converted_field_4.pushMap(converted_field_4_elem);
        }
        implementationsData.putArray("units", converted_field_4);
        BitcoinLikeNetworkParameters field_5 = javaImpl.getBitcoinLikeNetworkParameters();
        String field_5_uuid = UUID.randomUUID().toString();
        RCTCoreBitcoinLikeNetworkParameters rctImpl_field_5 = this.reactContext.getNativeModule(RCTCoreBitcoinLikeNetworkParameters.class);
        rctImpl_field_5.getJavaObjects().put(field_5_uuid, field_5);
        WritableNativeMap converted_field_5 = new WritableNativeMap();
        converted_field_5.putString("type","RCTCoreBitcoinLikeNetworkParameters");
        converted_field_5.putString("uid",field_5_uuid);
        implementationsData.putMap("bitcoinLikeNetworkParameters", converted_field_5);
        this.implementationsData.putMap(currentInstanceUid, implementationsData);
    }
    @ReactMethod
    public void getWalletType(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            Currency javaObj = this.javaObjects.get(uid);
            WalletType result = javaObj.getWalletType();
            WritableNativeMap resultMap = new WritableNativeMap();
            resultMap.putInt("value", result.ordinal());
            promise.resolve(resultMap);
        }
        else
        {
            promise.reject("Failed to call RCTCoreCurrency::getWalletType", "First parameter of RCTCoreCurrency::getWalletType should be an instance of RCTCoreCurrency");
        }
    }

    @ReactMethod
    public void getName(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            Currency javaObj = this.javaObjects.get(uid);
            String result = javaObj.getName();
            WritableNativeMap resultMap = new WritableNativeMap();
            resultMap.putString("value", result);
            promise.resolve(resultMap);
        }
        else
        {
            promise.reject("Failed to call RCTCoreCurrency::getName", "First parameter of RCTCoreCurrency::getName should be an instance of RCTCoreCurrency");
        }
    }

    @ReactMethod
    public void getBip44CoinType(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            Currency javaObj = this.javaObjects.get(uid);
            int result = javaObj.getBip44CoinType();
            WritableNativeMap resultMap = new WritableNativeMap();
            resultMap.putInt("value", result);
            promise.resolve(resultMap);
        }
        else
        {
            promise.reject("Failed to call RCTCoreCurrency::getBip44CoinType", "First parameter of RCTCoreCurrency::getBip44CoinType should be an instance of RCTCoreCurrency");
        }
    }

    @ReactMethod
    public void getPaymentUriScheme(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            Currency javaObj = this.javaObjects.get(uid);
            String result = javaObj.getPaymentUriScheme();
            WritableNativeMap resultMap = new WritableNativeMap();
            resultMap.putString("value", result);
            promise.resolve(resultMap);
        }
        else
        {
            promise.reject("Failed to call RCTCoreCurrency::getPaymentUriScheme", "First parameter of RCTCoreCurrency::getPaymentUriScheme should be an instance of RCTCoreCurrency");
        }
    }

    @ReactMethod
    public void getUnits(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            if (!this.implementationsData.hasKey(uid))
            {
                this.mapImplementationsData(currentInstance);
            }
            ReadableNativeMap data = this.implementationsData.getMap(uid);
            ReadableArray resultTmp = data.getArray("units");
            WritableNativeArray result = new WritableNativeArray();
            for (int i = 0; i < resultTmp.size(); i++)
            {
                WritableNativeMap result_elem = new WritableNativeMap();
                result_elem.merge(resultTmp.getMap(i));
                result.pushMap(result_elem);
            }
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreCurrency::getUnits", "First parameter of RCTCoreCurrency::getUnits should be an instance of RCTCoreCurrency");
        }
    }

    @ReactMethod
    public void getBitcoinLikeNetworkParameters(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            if (!this.implementationsData.hasKey(uid))
            {
                this.mapImplementationsData(currentInstance);
            }
            ReadableNativeMap data = this.implementationsData.getMap(uid);
            WritableNativeMap result = new WritableNativeMap();
            result.merge(data.getMap("bitcoinLikeNetworkParameters"));
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreCurrency::getBitcoinLikeNetworkParameters", "First parameter of RCTCoreCurrency::getBitcoinLikeNetworkParameters should be an instance of RCTCoreCurrency");
        }
    }

}
