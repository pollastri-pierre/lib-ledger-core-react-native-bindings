// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from idl.djinni

#import "RCTCoreLGAlgorandAccount.h"


@implementation RCTCoreLGAlgorandAccount
//Export module
RCT_EXPORT_MODULE(RCTCoreLGAlgorandAccount)

@synthesize bridge = _bridge;


+ (BOOL)requiresMainQueueSetup
{
    return NO;
}
RCT_REMAP_METHOD(release, release:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    [self baseRelease:currentInstance withResolver: resolve rejecter:reject];
}
RCT_REMAP_METHOD(log, logWithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    [self baseLogWithResolver:resolve rejecter:reject];
}
RCT_REMAP_METHOD(flush, flushWithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    [self baseFlushWithResolver:resolve rejecter:reject];
}
RCT_REMAP_METHOD(isNull, isNull:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    [self baseIsNull:currentInstance withResolver:resolve rejecter:reject];
}
-(NSData *) hexStringToData: (NSString *)hexString 
{
    NSMutableData *data= [[NSMutableData alloc] init];
    unsigned char byte;
    char byteChars[3] = {'\0','\0','\0'};
    for (int i = 0; i < ([hexString length] / 2); i++)
    {
        byteChars[0] = [hexString characterAtIndex: i*2];
        byteChars[1] = [hexString characterAtIndex: i*2 + 1];
        byte = strtol(byteChars, NULL, 16);
        [data appendBytes:&byte length:1];
    }
    return data;
}
-(NSString *) dataToHexString: (NSData *)data 
{
    const unsigned char *bytes = (const unsigned char *)data.bytes;
    NSMutableString *hex = [NSMutableString new];
    for (NSInteger i = 0; i < data.length; i++)
    {
        [hex appendFormat:@"%02x", bytes[i]];
    }
    return [hex copy];
}

/**
 * Get the maximum amount spendable in one transaction
 * @param callback, Callback returning the maximum amount spendable
 * @param operationType, the type of the operation
 */
RCT_REMAP_METHOD(getSpendableBalance,getSpendableBalance:(NSDictionary *)currentInstance withParams:(int)operationType withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAlgorandAccount::getSpendableBalance, first argument should be an instance of LGAlgorandAccount", nil);
        return;
    }
    LGAlgorandAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAlgorandAccount::getSpendableBalance, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    RCTCoreLGAmountCallback *objcParam_1 = [[RCTCoreLGAmountCallback alloc] initWithResolver:resolve rejecter:reject andBridge:self.bridge];
    [currentInstanceObj getSpendableBalance:(LGAlgorandOperationType)operationType callback:objcParam_1];

}

/**
 * Get information about a specific asset
 * @param assetId, the unique identifier of the asset to look for
 * @param callback, Callback returning the information about the queried asset
 */
RCT_REMAP_METHOD(getAsset,getAsset:(NSDictionary *)currentInstance withParams:(nonnull NSString *)assetId withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAlgorandAccount::getAsset, first argument should be an instance of LGAlgorandAccount", nil);
        return;
    }
    LGAlgorandAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAlgorandAccount::getAsset, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    RCTCoreLGAlgorandAssetParamsCallback *objcParam_1 = [[RCTCoreLGAlgorandAssetParamsCallback alloc] initWithResolver:resolve rejecter:reject andBridge:self.bridge];
    [currentInstanceObj getAsset:assetId callback:objcParam_1];

}

/**
 * Check if address has a specific asset
 * @param address, the address to check
 * @param assetId, the unique identifier of the asset to look for
 * @param callback, Callback returning the true if the address hold the asset
 */
RCT_REMAP_METHOD(hasAsset,hasAsset:(NSDictionary *)currentInstance withParams:(nonnull NSString *)address
                                                                      assetId:(nonnull NSString *)assetId withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAlgorandAccount::hasAsset, first argument should be an instance of LGAlgorandAccount", nil);
        return;
    }
    LGAlgorandAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAlgorandAccount::hasAsset, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    RCTCoreLGBoolCallback *objcParam_2 = [[RCTCoreLGBoolCallback alloc] initWithResolver:resolve rejecter:reject andBridge:self.bridge];
    [currentInstanceObj hasAsset:address assetId:assetId callback:objcParam_2];

}

/**
 * Check if address can receive the given amount:
 * it may not be enough to reach the minimum balance, if the account has 0 ALGO
 * @param address, the address to check
 * @param amount, the amount to test
 * @param callback, Callback returning the true if the address hold the asset
 */
RCT_REMAP_METHOD(isAmountValid,isAmountValid:(NSDictionary *)currentInstance withParams:(nonnull NSString *)address
                                                                                 amount:(nonnull NSString *)amount withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAlgorandAccount::isAmountValid, first argument should be an instance of LGAlgorandAccount", nil);
        return;
    }
    LGAlgorandAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAlgorandAccount::isAmountValid, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    RCTCoreLGBoolCallback *objcParam_2 = [[RCTCoreLGBoolCallback alloc] initWithResolver:resolve rejecter:reject andBridge:self.bridge];
    [currentInstanceObj isAmountValid:address amount:amount callback:objcParam_2];

}

/**
 * Get balance of account for a particular asset.
 * @param assetId, the unique identifier of the asset on the algorand network
 * @param callback, if getAssetBalance succeeds, Callback returning an Amount object which represents account's balance
 */
RCT_REMAP_METHOD(getAssetBalance,getAssetBalance:(NSDictionary *)currentInstance withParams:(nonnull NSString *)assetId withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAlgorandAccount::getAssetBalance, first argument should be an instance of LGAlgorandAccount", nil);
        return;
    }
    LGAlgorandAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAlgorandAccount::getAssetBalance, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    RCTCoreLGAlgorandAssetAmountCallback *objcParam_1 = [[RCTCoreLGAlgorandAssetAmountCallback alloc] initWithResolver:resolve rejecter:reject andBridge:self.bridge];
    [currentInstanceObj getAssetBalance:assetId callback:objcParam_1];

}

/**
 * Get balance of account for a particular asset at a precise interval with a certain granularity
 * @param assetId, the unique identifier of the asset on the algorand network
 * @param start, lower bound of search range
 * @param end, upper bound of search range
 * @param precision, granularity at which we want results
 * @param callback, ListCallback returning a list of Amount objects which represents account's balance
 */
RCT_REMAP_METHOD(getAssetBalanceHistory,getAssetBalanceHistory:(NSDictionary *)currentInstance withParams:(nonnull NSString *)assetId
                                                                                                    start:(nonnull NSString *)start
                                                                                                      end:(nonnull NSString *)end
                                                                                                   period:(int)period withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAlgorandAccount::getAssetBalanceHistory, first argument should be an instance of LGAlgorandAccount", nil);
        return;
    }
    LGAlgorandAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAlgorandAccount::getAssetBalanceHistory, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    RCTCoreLGAlgorandAssetAmountListCallback *objcParam_4 = [[RCTCoreLGAlgorandAssetAmountListCallback alloc] initWithResolver:resolve rejecter:reject andBridge:self.bridge];
    [currentInstanceObj getAssetBalanceHistory:assetId start:start end:end period:(LGTimePeriod)period callback:objcParam_4];

}

/**
 * Get balances of all assets to which account is registered
 * @param callback, ListCallback returning a list of AlgorandAssetAmount objects representing the different balances
 */
RCT_REMAP_METHOD(getAssetsBalances,getAssetsBalances:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAlgorandAccount::getAssetsBalances, first argument should be an instance of LGAlgorandAccount", nil);
        return;
    }
    LGAlgorandAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAlgorandAccount::getAssetsBalances, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    RCTCoreLGAlgorandAssetAmountListCallback *objcParam_0 = [[RCTCoreLGAlgorandAssetAmountListCallback alloc] initWithResolver:resolve rejecter:reject andBridge:self.bridge];
    [currentInstanceObj getAssetsBalances:objcParam_0];

}

/**
 * Get information about the assets created by account
 * @param callback, ListCallback returning a list of AlgorandAssetParams objects representing the assets created by account
 */
RCT_REMAP_METHOD(getCreatedAssets,getCreatedAssets:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAlgorandAccount::getCreatedAssets, first argument should be an instance of LGAlgorandAccount", nil);
        return;
    }
    LGAlgorandAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAlgorandAccount::getCreatedAssets, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    RCTCoreLGAlgorandAssetParamsListCallback *objcParam_0 = [[RCTCoreLGAlgorandAssetParamsListCallback alloc] initWithResolver:resolve rejecter:reject andBridge:self.bridge];
    [currentInstanceObj getCreatedAssets:objcParam_0];

}

/**
 * Get the pending rewards for account
 * @param callback, Callback returning the amount of pending rewards in MicroAlgos
 */
RCT_REMAP_METHOD(getPendingRewards,getPendingRewards:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAlgorandAccount::getPendingRewards, first argument should be an instance of LGAlgorandAccount", nil);
        return;
    }
    LGAlgorandAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAlgorandAccount::getPendingRewards, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    RCTCoreLGAmountCallback *objcParam_0 = [[RCTCoreLGAmountCallback alloc] initWithResolver:resolve rejecter:reject andBridge:self.bridge];
    [currentInstanceObj getPendingRewards:objcParam_0];

}

/**
 * Get the total rewards of MicroAlgos account has received, including pending rewards.
 * @param callback, Callback returning the total rewards in MicroAlgos.
 */
RCT_REMAP_METHOD(getTotalRewards,getTotalRewards:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAlgorandAccount::getTotalRewards, first argument should be an instance of LGAlgorandAccount", nil);
        return;
    }
    LGAlgorandAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAlgorandAccount::getTotalRewards, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    RCTCoreLGAmountCallback *objcParam_0 = [[RCTCoreLGAmountCallback alloc] initWithResolver:resolve rejecter:reject andBridge:self.bridge];
    [currentInstanceObj getTotalRewards:objcParam_0];

}

/**
 * Get an estimation (in MicroAlgos) of the fees needed to broadcast a given transaction to the algorand network
 * @param transaction, the transaction for which fees are estimated
 * @param callback, Callback returning the fees in MicroAlgos for the specified transaction
 */
RCT_REMAP_METHOD(getFeeEstimate,getFeeEstimate:(NSDictionary *)currentInstance withParams:(NSDictionary *)transaction withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAlgorandAccount::getFeeEstimate, first argument should be an instance of LGAlgorandAccount", nil);
        return;
    }
    LGAlgorandAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAlgorandAccount::getFeeEstimate, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    RCTCoreLGAlgorandTransaction *rctParam_transaction = (RCTCoreLGAlgorandTransaction *)[self.bridge moduleForName:@"CoreLGAlgorandTransaction"];
    LGAlgorandTransaction *objcParam_0 = (LGAlgorandTransaction *)[rctParam_transaction.objcImplementations objectForKey:transaction[@"uid"]];
    RCTCoreLGAmountCallback *objcParam_1 = [[RCTCoreLGAmountCallback alloc] initWithResolver:resolve rejecter:reject andBridge:self.bridge];
    [currentInstanceObj getFeeEstimate:objcParam_0 callback:objcParam_1];

}

/**
 * Build a raw signed transaction from a raw unsigned transaction and the signature
 * @param rawUnsignedTransaction, the msgpack-encoded unsigned transaction
 * @param signature, the signature of the transaction
 * @return binary, the msgpack-encoded signed transaction
 */
RCT_REMAP_METHOD(buildRawSignedTransaction,buildRawSignedTransaction:(NSDictionary *)currentInstance withParams:(NSString *)rawUnsignedTransaction
                                                                                                      signature:(NSString *)signature withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAlgorandAccount::buildRawSignedTransaction, first argument should be an instance of LGAlgorandAccount", nil);
        return;
    }
    LGAlgorandAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAlgorandAccount::buildRawSignedTransaction, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    NSData *objcParam_0 = [self hexStringToData:rawUnsignedTransaction];

    NSData *objcParam_1 = [self hexStringToData:signature];

    NSData * objcResult = [currentInstanceObj buildRawSignedTransaction:objcParam_0 signature:objcParam_1];
    NSString *objcResultData = [self dataToHexString:objcResult];
    NSDictionary *result = @{@"value" : objcResultData};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGAlgorandAccount::buildRawSignedTransaction", nil);
        return;
    }

}

/**
 * Broadcast a raw transaction to the algorand network
 * @param transaction, the msgpack-encoded transaction
 * @param callback, Callback returning the id of the transaction in case of success, an error message otherwise
 */
RCT_REMAP_METHOD(broadcastRawTransaction,broadcastRawTransaction:(NSDictionary *)currentInstance withParams:(NSString *)transaction withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAlgorandAccount::broadcastRawTransaction, first argument should be an instance of LGAlgorandAccount", nil);
        return;
    }
    LGAlgorandAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAlgorandAccount::broadcastRawTransaction, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    NSData *objcParam_0 = [self hexStringToData:transaction];

    RCTCoreLGStringCallback *objcParam_1 = [[RCTCoreLGStringCallback alloc] initWithResolver:resolve rejecter:reject andBridge:self.bridge];
    [currentInstanceObj broadcastRawTransaction:objcParam_0 callback:objcParam_1];

}

/**
 * Broadcast an AlgorandTransaction object to the algorand network
 * @param transaction, the transaction to broadcast
 * @param callback, Callback returning the fees in MicroAlgos for the specified transaction
 */
RCT_REMAP_METHOD(broadcastTransaction,broadcastTransaction:(NSDictionary *)currentInstance withParams:(NSDictionary *)transaction withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAlgorandAccount::broadcastTransaction, first argument should be an instance of LGAlgorandAccount", nil);
        return;
    }
    LGAlgorandAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAlgorandAccount::broadcastTransaction, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    RCTCoreLGAlgorandTransaction *rctParam_transaction = (RCTCoreLGAlgorandTransaction *)[self.bridge moduleForName:@"CoreLGAlgorandTransaction"];
    LGAlgorandTransaction *objcParam_0 = (LGAlgorandTransaction *)[rctParam_transaction.objcImplementations objectForKey:transaction[@"uid"]];
    RCTCoreLGStringCallback *objcParam_1 = [[RCTCoreLGStringCallback alloc] initWithResolver:resolve rejecter:reject andBridge:self.bridge];
    [currentInstanceObj broadcastTransaction:objcParam_0 callback:objcParam_1];

}

/**
 * Create a new transaction
 * @param callback, The new transaction
 */
RCT_REMAP_METHOD(createTransaction,createTransaction:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAlgorandAccount::createTransaction, first argument should be an instance of LGAlgorandAccount", nil);
        return;
    }
    LGAlgorandAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAlgorandAccount::createTransaction, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    RCTCoreLGAlgorandTransactionCallback *objcParam_0 = [[RCTCoreLGAlgorandTransactionCallback alloc] initWithResolver:resolve rejecter:reject andBridge:self.bridge];
    [currentInstanceObj createTransaction:objcParam_0];

}
@end
