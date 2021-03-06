// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from messages.djinni

#import "RCTCoreLGCosmosLikeAmount.h"
#import "LGCosmosLikeAmount.h"

@implementation RCTCoreLGCosmosLikeAmount

//Export module
RCT_EXPORT_MODULE(RCTCoreLGCosmosLikeAmount)

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
RCT_REMAP_METHOD(init, initWithAmount:(nonnull NSString *)amount
                                denom:(nonnull NSString *)denom withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {


    LGCosmosLikeAmount * finalResult = [[LGCosmosLikeAmount alloc] initWithAmount:amount denom:denom];
    NSString *uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGCosmosLikeAmount *rctImpl = (RCTCoreLGCosmosLikeAmount *)[self.bridge moduleForName:@"CoreLGCosmosLikeAmount"];
    NSArray *finalResultArray = [[NSArray alloc] initWithObjects:finalResult, uuid, nil];
    [rctImpl baseSetObject:finalResultArray];
    NSDictionary *result = @{@"type" : @"CoreLGCosmosLikeAmount", @"uid" : uuid };
    if (result)
    {
        resolve(result);
    }
}

RCT_REMAP_METHOD(getAmount, getAmount:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)rejecter)
{
    LGCosmosLikeAmount *objcImpl = (LGCosmosLikeAmount *)[self.objcImplementations objectForKey:currentInstance[@"uid"]];
    NSDictionary *result = @{@"value" : objcImpl.amount};
    resolve(result);
}

RCT_REMAP_METHOD(getDenom, getDenom:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)rejecter)
{
    LGCosmosLikeAmount *objcImpl = (LGCosmosLikeAmount *)[self.objcImplementations objectForKey:currentInstance[@"uid"]];
    NSDictionary *result = @{@"value" : objcImpl.denom};
    resolve(result);
}

@end
