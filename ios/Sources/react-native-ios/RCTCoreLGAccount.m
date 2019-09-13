// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

#import "RCTCoreLGAccount.h"


@implementation RCTCoreLGAccount
//Export module
RCT_EXPORT_MODULE(RCTCoreLGAccount)

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

/**
 * Get index of account in user's wallet
 * 32-bit integer
 */
RCT_REMAP_METHOD(getIndex,getIndex:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAccount::getIndex, first argument should be an instance of LGAccount", nil);
        return;
    }
    LGAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAccount::getIndex, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    NSInteger objcResult = [currentInstanceObj getIndex];
    NSDictionary *result = @{@"value" : @(objcResult)};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGAccount::getIndex", nil);
        return;
    }

}

/** Get the list of all operations. */
RCT_REMAP_METHOD(queryOperations,queryOperations:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAccount::queryOperations, first argument should be an instance of LGAccount", nil);
        return;
    }
    LGAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAccount::queryOperations, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGOperationQuery * objcResult = [currentInstanceObj queryOperations];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGOperationQuery *rctImpl_objcResult = (RCTCoreLGOperationQuery *)[self.bridge moduleForName:@"CoreLGOperationQuery"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGOperationQuery", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGAccount::queryOperations", nil);
        return;
    }

}

/**
 * Get balance of account.
 * @param callback, if getBalacne, Callback returning an Amount object which represents account's balance
 */
RCT_REMAP_METHOD(getBalance,getBalance:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAccount::getBalance, first argument should be an instance of LGAccount", nil);
        return;
    }
    LGAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAccount::getBalance, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    RCTCoreLGAmountCallback *objcParam_0 = [[RCTCoreLGAmountCallback alloc] initWithResolver:resolve rejecter:reject andBridge:self.bridge];
    [currentInstanceObj getBalance:objcParam_0];

}

/**
 * Get balance of account at a precise interval with a certain granularity.
 * @param start, lower bound of search range
 * @param end, upper bound of search range
 * @param precision, granularity at which we want results
 * @param callback, ListCallback returning a list of Amount object which represents account's balance
 */
RCT_REMAP_METHOD(getBalanceHistory,getBalanceHistory:(NSDictionary *)currentInstance withParams:(nonnull NSString *)start
                                                                                            end:(nonnull NSString *)end
                                                                                         period:(int)period withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAccount::getBalanceHistory, first argument should be an instance of LGAccount", nil);
        return;
    }
    LGAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAccount::getBalanceHistory, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    RCTCoreLGAmountListCallback *objcParam_3 = [[RCTCoreLGAmountListCallback alloc] initWithResolver:resolve rejecter:reject andBridge:self.bridge];
    [currentInstanceObj getBalanceHistory:start end:end period:(LGTimePeriod)period callback:objcParam_3];

}

/**
 * Get synchronization status of account.
 * @return bool
 */
RCT_REMAP_METHOD(isSynchronizing,isSynchronizing:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAccount::isSynchronizing, first argument should be an instance of LGAccount", nil);
        return;
    }
    LGAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAccount::isSynchronizing, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    BOOL objcResult = [currentInstanceObj isSynchronizing];
    NSDictionary *result = @{@"value" : @(objcResult)};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGAccount::isSynchronizing", nil);
        return;
    }

}

/**
 * Start synchronization of account.
 * @return EventBus, handler will be notified of synchronization outcome
 */
RCT_REMAP_METHOD(synchronize,synchronize:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAccount::synchronize, first argument should be an instance of LGAccount", nil);
        return;
    }
    LGAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAccount::synchronize, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGEventBus * objcResult = [currentInstanceObj synchronize];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGEventBus *rctImpl_objcResult = (RCTCoreLGEventBus *)[self.bridge moduleForName:@"CoreLGEventBus"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGEventBus", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGAccount::synchronize", nil);
        return;
    }

}

/**
 * Return account's preferences.
 * @return Preferences object
 */
RCT_REMAP_METHOD(getPreferences,getPreferences:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAccount::getPreferences, first argument should be an instance of LGAccount", nil);
        return;
    }
    LGAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAccount::getPreferences, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGPreferences * objcResult = [currentInstanceObj getPreferences];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGPreferences *rctImpl_objcResult = (RCTCoreLGPreferences *)[self.bridge moduleForName:@"CoreLGPreferences"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGPreferences", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGAccount::getPreferences", nil);
        return;
    }

}

/**
 * Return account's logger which provides all needed (e.g. database) logs.
 * @return Logger Object
 */
RCT_REMAP_METHOD(getLogger,getLogger:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAccount::getLogger, first argument should be an instance of LGAccount", nil);
        return;
    }
    LGAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAccount::getLogger, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGLogger * objcResult = [currentInstanceObj getLogger];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGLogger *rctImpl_objcResult = (RCTCoreLGLogger *)[self.bridge moduleForName:@"CoreLGLogger"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGLogger", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGAccount::getLogger", nil);
        return;
    }

}

/**
 * Return operation for a specific operation.
 * @param uid, string of operation id
 */
RCT_REMAP_METHOD(getOperationPreferences,getOperationPreferences:(NSDictionary *)currentInstance withParams:(nonnull NSString *)uid withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAccount::getOperationPreferences, first argument should be an instance of LGAccount", nil);
        return;
    }
    LGAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAccount::getOperationPreferences, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGPreferences * objcResult = [currentInstanceObj getOperationPreferences:uid];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGPreferences *rctImpl_objcResult = (RCTCoreLGPreferences *)[self.bridge moduleForName:@"CoreLGPreferences"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGPreferences", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGAccount::getOperationPreferences", nil);
        return;
    }

}

/**
 * Turn the account into an Bitcoin one, allowing operations to be performed on the Bitcoin
 * network.
 */
RCT_REMAP_METHOD(asBitcoinLikeAccount,asBitcoinLikeAccount:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAccount::asBitcoinLikeAccount, first argument should be an instance of LGAccount", nil);
        return;
    }
    LGAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAccount::asBitcoinLikeAccount, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGBitcoinLikeAccount * objcResult = [currentInstanceObj asBitcoinLikeAccount];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGBitcoinLikeAccount *rctImpl_objcResult = (RCTCoreLGBitcoinLikeAccount *)[self.bridge moduleForName:@"CoreLGBitcoinLikeAccount"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGBitcoinLikeAccount", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGAccount::asBitcoinLikeAccount", nil);
        return;
    }

}

/**
 * Turn the account into an Ethereum one, allowing operations to be performrd on the Ethereum
 * network.
 */
RCT_REMAP_METHOD(asEthereumLikeAccount,asEthereumLikeAccount:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAccount::asEthereumLikeAccount, first argument should be an instance of LGAccount", nil);
        return;
    }
    LGAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAccount::asEthereumLikeAccount, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGEthereumLikeAccount * objcResult = [currentInstanceObj asEthereumLikeAccount];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGEthereumLikeAccount *rctImpl_objcResult = (RCTCoreLGEthereumLikeAccount *)[self.bridge moduleForName:@"CoreLGEthereumLikeAccount"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGEthereumLikeAccount", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGAccount::asEthereumLikeAccount", nil);
        return;
    }

}

/** Turn the account into a Ripple one, allowing operations to be performed on the Ripple network. */
RCT_REMAP_METHOD(asRippleLikeAccount,asRippleLikeAccount:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAccount::asRippleLikeAccount, first argument should be an instance of LGAccount", nil);
        return;
    }
    LGAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAccount::asRippleLikeAccount, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGRippleLikeAccount * objcResult = [currentInstanceObj asRippleLikeAccount];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGRippleLikeAccount *rctImpl_objcResult = (RCTCoreLGRippleLikeAccount *)[self.bridge moduleForName:@"CoreLGRippleLikeAccount"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGRippleLikeAccount", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGAccount::asRippleLikeAccount", nil);
        return;
    }

}

/** Turn the account into a Tezos one, allowing operations to be performed on the Tezos network. */
RCT_REMAP_METHOD(asTezosLikeAccount,asTezosLikeAccount:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAccount::asTezosLikeAccount, first argument should be an instance of LGAccount", nil);
        return;
    }
    LGAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAccount::asTezosLikeAccount, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGTezosLikeAccount * objcResult = [currentInstanceObj asTezosLikeAccount];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGTezosLikeAccount *rctImpl_objcResult = (RCTCoreLGTezosLikeAccount *)[self.bridge moduleForName:@"CoreLGTezosLikeAccount"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGTezosLikeAccount", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGAccount::asTezosLikeAccount", nil);
        return;
    }

}

/**
 * Check if account is a Bitcoin one.
 * @return bool
 */
RCT_REMAP_METHOD(isInstanceOfBitcoinLikeAccount,isInstanceOfBitcoinLikeAccount:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAccount::isInstanceOfBitcoinLikeAccount, first argument should be an instance of LGAccount", nil);
        return;
    }
    LGAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAccount::isInstanceOfBitcoinLikeAccount, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    BOOL objcResult = [currentInstanceObj isInstanceOfBitcoinLikeAccount];
    NSDictionary *result = @{@"value" : @(objcResult)};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGAccount::isInstanceOfBitcoinLikeAccount", nil);
        return;
    }

}

/**
 * Check if account is an Ethereum one.
 * @return bool
 */
RCT_REMAP_METHOD(isInstanceOfEthereumLikeAccount,isInstanceOfEthereumLikeAccount:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAccount::isInstanceOfEthereumLikeAccount, first argument should be an instance of LGAccount", nil);
        return;
    }
    LGAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAccount::isInstanceOfEthereumLikeAccount, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    BOOL objcResult = [currentInstanceObj isInstanceOfEthereumLikeAccount];
    NSDictionary *result = @{@"value" : @(objcResult)};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGAccount::isInstanceOfEthereumLikeAccount", nil);
        return;
    }

}

/**
 * Check if account is a Ripple one.
 * @return bool
 */
RCT_REMAP_METHOD(isInstanceOfRippleLikeAccount,isInstanceOfRippleLikeAccount:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAccount::isInstanceOfRippleLikeAccount, first argument should be an instance of LGAccount", nil);
        return;
    }
    LGAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAccount::isInstanceOfRippleLikeAccount, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    BOOL objcResult = [currentInstanceObj isInstanceOfRippleLikeAccount];
    NSDictionary *result = @{@"value" : @(objcResult)};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGAccount::isInstanceOfRippleLikeAccount", nil);
        return;
    }

}

/**TODO */
RCT_REMAP_METHOD(getFreshPublicAddresses,getFreshPublicAddresses:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAccount::getFreshPublicAddresses, first argument should be an instance of LGAccount", nil);
        return;
    }
    LGAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAccount::getFreshPublicAddresses, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    RCTCoreLGAddressListCallback *objcParam_0 = [[RCTCoreLGAddressListCallback alloc] initWithResolver:resolve rejecter:reject andBridge:self.bridge];
    [currentInstanceObj getFreshPublicAddresses:objcParam_0];

}

/**
 * Get type of wallet to which account belongs.
 * @return WalletType object
 */
RCT_REMAP_METHOD(getWalletType,getWalletType:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAccount::getWalletType, first argument should be an instance of LGAccount", nil);
        return;
    }
    LGAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAccount::getWalletType, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGWalletType objcResult = [currentInstanceObj getWalletType];
    NSDictionary *result = @{@"value" : @(objcResult)};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGAccount::getWalletType", nil);
        return;
    }

}

/**
 * Get event bus through which account is notified on synchronization status.
 * @return EventBus object
 */
RCT_REMAP_METHOD(getEventBus,getEventBus:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAccount::getEventBus, first argument should be an instance of LGAccount", nil);
        return;
    }
    LGAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAccount::getEventBus, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGEventBus * objcResult = [currentInstanceObj getEventBus];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGEventBus *rctImpl_objcResult = (RCTCoreLGEventBus *)[self.bridge moduleForName:@"CoreLGEventBus"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGEventBus", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGAccount::getEventBus", nil);
        return;
    }

}

/** Start observing blockchain on which account synchronizes and send/receive transactions. */
RCT_REMAP_METHOD(startBlockchainObservation,startBlockchainObservation:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAccount::startBlockchainObservation, first argument should be an instance of LGAccount", nil);
        return;
    }
    LGAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAccount::startBlockchainObservation, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    [currentInstanceObj startBlockchainObservation];
    resolve(@(YES));

}

/** Stop observing blockchain. */
RCT_REMAP_METHOD(stopBlockchainObservation,stopBlockchainObservation:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAccount::stopBlockchainObservation, first argument should be an instance of LGAccount", nil);
        return;
    }
    LGAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAccount::stopBlockchainObservation, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    [currentInstanceObj stopBlockchainObservation];
    resolve(@(YES));

}

/**
 * Get account's observation status.
 * @return boolean
 */
RCT_REMAP_METHOD(isObservingBlockchain,isObservingBlockchain:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAccount::isObservingBlockchain, first argument should be an instance of LGAccount", nil);
        return;
    }
    LGAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAccount::isObservingBlockchain, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    BOOL objcResult = [currentInstanceObj isObservingBlockchain];
    NSDictionary *result = @{@"value" : @(objcResult)};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGAccount::isObservingBlockchain", nil);
        return;
    }

}

/**
 * Get Last block of blockchain on which account operates.
 * @param callback, Callback returning, if getLastBlock succeeds, a Block object
 */
RCT_REMAP_METHOD(getLastBlock,getLastBlock:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAccount::getLastBlock, first argument should be an instance of LGAccount", nil);
        return;
    }
    LGAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAccount::getLastBlock, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    RCTCoreLGBlockCallback *objcParam_0 = [[RCTCoreLGBlockCallback alloc] initWithResolver:resolve rejecter:reject andBridge:self.bridge];
    [currentInstanceObj getLastBlock:objcParam_0];

}

/** Get the key used to generate the account. */
RCT_REMAP_METHOD(getRestoreKey,getRestoreKey:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAccount::getRestoreKey, first argument should be an instance of LGAccount", nil);
        return;
    }
    LGAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAccount::getRestoreKey, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    NSString * objcResult = [currentInstanceObj getRestoreKey];
    NSDictionary *result = @{@"value" : objcResult};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGAccount::getRestoreKey", nil);
        return;
    }

}

/**
 * Erase data (in user's DB) relative to wallet since given date.
 * @param date, start date of data deletion
 */
RCT_REMAP_METHOD(eraseDataSince,eraseDataSince:(NSDictionary *)currentInstance withParams:(nonnull NSDate *)date withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAccount::eraseDataSince, first argument should be an instance of LGAccount", nil);
        return;
    }
    LGAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAccount::eraseDataSince, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    RCTCoreLGErrorCodeCallback *objcParam_1 = [[RCTCoreLGErrorCodeCallback alloc] initWithResolver:resolve rejecter:reject andBridge:self.bridge];
    [currentInstanceObj eraseDataSince:date callback:objcParam_1];

}
@end
