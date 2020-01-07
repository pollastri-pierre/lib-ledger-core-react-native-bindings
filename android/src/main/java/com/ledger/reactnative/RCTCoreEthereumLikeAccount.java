// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from ethereum_like_wallet.djinni

package com.ledger.reactnative;

import co.ledger.core.BigIntCallback;
import co.ledger.core.BigIntListCallback;
import co.ledger.core.ERC20LikeAccount;
import co.ledger.core.EthereumLikeAccount;
import co.ledger.core.EthereumLikeTransaction;
import co.ledger.core.EthereumLikeTransactionBuilder;
import co.ledger.core.StringCallback;
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

/** Class representing a Ethereum account. */
@ReactModule(name = "RCTCoreEthereumLikeAccount")
public class RCTCoreEthereumLikeAccount extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, EthereumLikeAccount> javaObjects;
    public Map<String, EthereumLikeAccount> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreEthereumLikeAccount(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, EthereumLikeAccount>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreEthereumLikeAccount";
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
            promise.reject("Failed to release instance of RCTCoreEthereumLikeAccount", "First parameter of RCTCoreEthereumLikeAccount::release should be an instance of RCTCoreEthereumLikeAccount");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, EthereumLikeAccount> elem : this.javaObjects.entrySet())
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

    /** Send a raw (binary) transaction on the Ethereum blockchain. */
    @ReactMethod
    public void broadcastRawTransaction(ReadableMap currentInstance, String transaction, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            EthereumLikeAccount currentInstanceObj = this.javaObjects.get(sUid);

            byte [] javaParam_0 = hexStringToByteArray(transaction);

            RCTCoreStringCallback javaParam_1 = RCTCoreStringCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.broadcastRawTransaction(javaParam_0, javaParam_1);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Send a transaction on the Ethereum blockchain. */
    @ReactMethod
    public void broadcastTransaction(ReadableMap currentInstance, ReadableMap transaction, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            EthereumLikeAccount currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreEthereumLikeTransaction rctParam_transaction = this.reactContext.getNativeModule(RCTCoreEthereumLikeTransaction.class);
            EthereumLikeTransaction javaParam_0 = rctParam_transaction.getJavaObjects().get(transaction.getString("uid"));
            RCTCoreStringCallback javaParam_1 = RCTCoreStringCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.broadcastTransaction(javaParam_0, javaParam_1);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Get a builder object to construct transactions. */
    @ReactMethod
    public void buildTransaction(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            EthereumLikeAccount currentInstanceObj = this.javaObjects.get(sUid);

            EthereumLikeTransactionBuilder javaResult = currentInstanceObj.buildTransaction();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreEthereumLikeTransactionBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreEthereumLikeTransactionBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreEthereumLikeTransactionBuilder");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Get the list of ERC20 accounts associated with this Ethereum account. */
    @ReactMethod
    public void getERC20Accounts(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            EthereumLikeAccount currentInstanceObj = this.javaObjects.get(sUid);

            ArrayList<ERC20LikeAccount> javaResult = currentInstanceObj.getERC20Accounts();

            WritableNativeArray result = new WritableNativeArray();
            for (ERC20LikeAccount javaResult_elem : javaResult)
            {
                String javaResult_elem_uuid = UUID.randomUUID().toString();
                RCTCoreERC20LikeAccount rctImpl_javaResult_elem = this.reactContext.getNativeModule(RCTCoreERC20LikeAccount.class);
                rctImpl_javaResult_elem.getJavaObjects().put(javaResult_elem_uuid, javaResult_elem);
                WritableNativeMap result_elem = new WritableNativeMap();
                result_elem.putString("type","RCTCoreERC20LikeAccount");
                result_elem.putString("uid",javaResult_elem_uuid);
                result.pushMap(result_elem);
            }

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Get gas price from network
     * Note: it would have been better to have this method on EthereumLikeWallet
     * but since EthereumLikeWallet is not used anywhere, it's better to keep all
     * specific methods under the same specific class so it will be easy to segratate
     * when the right time comes !
     */
    @ReactMethod
    public void getGasPrice(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            EthereumLikeAccount currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreBigIntCallback javaParam_0 = RCTCoreBigIntCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.getGasPrice(javaParam_0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Get estimated gas limit to set so the transaction will succeed
     * The passed address could be EOA or contract
     * This estimation is based on X last incoming txs (to address) that succeeded
     * Note: same note as above
     */
    @ReactMethod
    public void getEstimatedGasLimit(ReadableMap currentInstance, String address, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            EthereumLikeAccount currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreBigIntCallback javaParam_1 = RCTCoreBigIntCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.getEstimatedGasLimit(address, javaParam_1);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Get balance of ERC20 token
     * The passed address is an ERC20 account
     * Note: same note as above
     */
    @ReactMethod
    public void getERC20Balance(ReadableMap currentInstance, String erc20Address, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            EthereumLikeAccount currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreBigIntCallback javaParam_1 = RCTCoreBigIntCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.getERC20Balance(erc20Address, javaParam_1);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Get balance of ERC20 tokens
     * The passed addresses are ERC20 accounts
     * Note: same note as above
     */
    @ReactMethod
    public void getERC20Balances(ReadableMap currentInstance, ReadableArray erc20Addresses, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            EthereumLikeAccount currentInstanceObj = this.javaObjects.get(sUid);

            ArrayList<String> javaParam_0 = new ArrayList<String>();
            for (int i = 0; i <  erc20Addresses.size(); i++)
            {
                String erc20Addresses_elem = erc20Addresses.getString(i);
                javaParam_0.add(erc20Addresses_elem);
            }
            RCTCoreBigIntListCallback javaParam_1 = RCTCoreBigIntListCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.getERC20Balances(javaParam_0, javaParam_1);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
