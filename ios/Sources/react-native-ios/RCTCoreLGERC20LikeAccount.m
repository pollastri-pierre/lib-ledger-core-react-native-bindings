// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from erc20.djinni

#import "RCTCoreLGERC20LikeAccount.h"


@implementation RCTCoreLGERC20LikeAccount
//Export module
RCT_EXPORT_MODULE(RCTCoreLGERC20LikeAccount)

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

/** Get an ERC20 token. */
RCT_REMAP_METHOD(getToken,getToken:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGERC20LikeAccount::getToken, first argument should be an instance of LGERC20LikeAccount", nil);
        return;
    }
    LGERC20LikeAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGERC20LikeAccount::getToken, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGERC20Token * objcResult = [currentInstanceObj getToken];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGERC20Token *rctImpl_objcResult = (RCTCoreLGERC20Token *)[self.bridge moduleForName:@"CoreLGERC20Token"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGERC20Token", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGERC20LikeAccount::getToken", nil);
        return;
    }

}

/** Get the address of this ERC20 account. */
RCT_REMAP_METHOD(getAddress,getAddress:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGERC20LikeAccount::getAddress, first argument should be an instance of LGERC20LikeAccount", nil);
        return;
    }
    LGERC20LikeAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGERC20LikeAccount::getAddress, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    NSString * objcResult = [currentInstanceObj getAddress];
    NSDictionary *result = @{@"value" : objcResult};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGERC20LikeAccount::getAddress", nil);
        return;
    }

}

/** Get the current balance of this ERC20 account. */
RCT_REMAP_METHOD(getBalance,getBalance:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGERC20LikeAccount::getBalance, first argument should be an instance of LGERC20LikeAccount", nil);
        return;
    }
    LGERC20LikeAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGERC20LikeAccount::getBalance, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGBigInt * objcResult = [currentInstanceObj getBalance];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGBigInt *rctImpl_objcResult = (RCTCoreLGBigInt *)[self.bridge moduleForName:@"CoreLGBigInt"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGBigInt", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGERC20LikeAccount::getBalance", nil);
        return;
    }

}

/**
 * Get the balance history of this ERC20 account from a starting date (included) to an ending
 * date (included).
 */
RCT_REMAP_METHOD(getBalanceHistoryFor,getBalanceHistoryFor:(NSDictionary *)currentInstance withParams:(nonnull NSDate *)start
                                                                                                  end:(nonnull NSDate *)end
                                                                                               period:(int)period withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGERC20LikeAccount::getBalanceHistoryFor, first argument should be an instance of LGERC20LikeAccount", nil);
        return;
    }
    LGERC20LikeAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGERC20LikeAccount::getBalanceHistoryFor, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    NSArray<LGBigInt *> * objcResult = [currentInstanceObj getBalanceHistoryFor:start end:end period:(LGTimePeriod)period];

    NSMutableArray *result = [[NSMutableArray alloc] init];
    for (id objcResult_elem in objcResult)
    {
        NSString *objcResult_elem_uuid = [[NSUUID UUID] UUIDString];
        RCTCoreLGBigInt *rctImpl_objcResult_elem = (RCTCoreLGBigInt *)[self.bridge moduleForName:@"CoreLGBigInt"];
        NSArray *objcResult_elem_array = [[NSArray alloc] initWithObjects:objcResult_elem, objcResult_elem_uuid, nil];
        [rctImpl_objcResult_elem baseSetObject:objcResult_elem_array];
        NSDictionary *result_elem = @{@"type" : @"CoreLGBigInt", @"uid" : objcResult_elem_uuid };
        [result addObject:result_elem];
    }

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGERC20LikeAccount::getBalanceHistoryFor", nil);
        return;
    }

}

/** Get the list of operations performed on this ERC20 account. */
RCT_REMAP_METHOD(getOperations,getOperations:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGERC20LikeAccount::getOperations, first argument should be an instance of LGERC20LikeAccount", nil);
        return;
    }
    LGERC20LikeAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGERC20LikeAccount::getOperations, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    NSArray<LGERC20LikeOperation *> * objcResult = [currentInstanceObj getOperations];

    NSMutableArray *result = [[NSMutableArray alloc] init];
    for (id objcResult_elem in objcResult)
    {
        NSString *objcResult_elem_uuid = [[NSUUID UUID] UUIDString];
        RCTCoreLGERC20LikeOperation *rctImpl_objcResult_elem = (RCTCoreLGERC20LikeOperation *)[self.bridge moduleForName:@"CoreLGERC20LikeOperation"];
        NSArray *objcResult_elem_array = [[NSArray alloc] initWithObjects:objcResult_elem, objcResult_elem_uuid, nil];
        [rctImpl_objcResult_elem baseSetObject:objcResult_elem_array];
        NSDictionary *result_elem = @{@"type" : @"CoreLGERC20LikeOperation", @"uid" : objcResult_elem_uuid };
        [result addObject:result_elem];
    }

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGERC20LikeAccount::getOperations", nil);
        return;
    }

}

/** Retrieve raw data concerning a transaction of a given amount to a given address. */
RCT_REMAP_METHOD(getTransferToAddressData,getTransferToAddressData:(NSDictionary *)currentInstance withParams:(NSDictionary *)amount
                                                                                                      address:(nonnull NSString *)address withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGERC20LikeAccount::getTransferToAddressData, first argument should be an instance of LGERC20LikeAccount", nil);
        return;
    }
    LGERC20LikeAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGERC20LikeAccount::getTransferToAddressData, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    RCTCoreLGBigInt *rctParam_amount = (RCTCoreLGBigInt *)[self.bridge moduleForName:@"CoreLGBigInt"];
    LGBigInt *objcParam_0 = (LGBigInt *)[rctParam_amount.objcImplementations objectForKey:amount[@"uid"]];
    NSData * objcResult = [currentInstanceObj getTransferToAddressData:objcParam_0 address:address];
    NSDictionary *result = @{@"value" : objcResult.description};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGERC20LikeAccount::getTransferToAddressData", nil);
        return;
    }

}

RCT_REMAP_METHOD(queryOperations,queryOperations:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGERC20LikeAccount::queryOperations, first argument should be an instance of LGERC20LikeAccount", nil);
        return;
    }
    LGERC20LikeAccount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGERC20LikeAccount::queryOperations, instance of uid %@ not found", currentInstance[@"uid"]];
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
        reject(@"impl_call_error", @"Error while calling LGERC20LikeAccount::queryOperations", nil);
        return;
    }

}
@end