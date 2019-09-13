// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from callback.djinni

package com.ledger.reactnative;

import co.ledger.core.BitcoinLikeOutput;
import co.ledger.core.BitcoinLikeOutputListCallback;
import co.ledger.core.Error;
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

/** Callback triggered by main completed task, returning optional result as list of template type T. */
public class RCTCoreBitcoinLikeOutputListCallback extends BitcoinLikeOutputListCallback {
    public Promise promise;
    public ReactApplicationContext reactContext;
    public static RCTCoreBitcoinLikeOutputListCallback initWithPromise(Promise promise, ReactApplicationContext reactContext)
    {
        RCTCoreBitcoinLikeOutputListCallback callback = new RCTCoreBitcoinLikeOutputListCallback();
        callback.promise = promise;
        callback.reactContext = reactContext;
        return callback;
    }
    /**
     * Method triggered when main task complete.
     * @params result optional of type list<T>, non null if main task failed
     * @params error optional of type Error, non null if main task succeeded
     */
    public void onCallback(ArrayList<BitcoinLikeOutput> result, Error error) {
        try
        {
            if (error != null && error.getMessage().length() > 0)
            {
                this.promise.reject(error.toString(), error.getMessage());
            }
            else
            {
                WritableNativeArray converted_result = new WritableNativeArray();
                for (BitcoinLikeOutput result_elem : result)
                {
                    String result_elem_uuid = UUID.randomUUID().toString();
                    RCTCoreBitcoinLikeOutput rctImpl_result_elem = this.reactContext.getNativeModule(RCTCoreBitcoinLikeOutput.class);
                    rctImpl_result_elem.getJavaObjects().put(result_elem_uuid, result_elem);
                    WritableNativeMap converted_result_elem = new WritableNativeMap();
                    converted_result_elem.putString("type","RCTCoreBitcoinLikeOutput");
                    converted_result_elem.putString("uid",result_elem_uuid);
                    converted_result.pushMap(converted_result_elem);
                }

                this.promise.resolve(converted_result);
            }
        }
        catch(Exception e)
        {
            this.promise.reject(e.toString(), e.getMessage());
        }
    }
}
