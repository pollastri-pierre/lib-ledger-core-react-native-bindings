// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

#import "RCTCoreLGCosmosGasLimitRequest.h"
#import "LGCosmosGasLimitRequest.h"

@implementation RCTCoreLGCosmosGasLimitRequest

//Export module
RCT_EXPORT_MODULE(RCTCoreLGCosmosGasLimitRequest)

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
RCT_REMAP_METHOD(init, initWithMemo:(nonnull NSString *)memo
                           messages:(NSArray <NSDictionary *> *)messages
                          amplifier:(nonnull NSNumber *)amplifier withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    NSMutableDictionary *implementationsData = [[NSMutableDictionary alloc] init];
    NSMutableArray *field_1 = [[NSMutableArray alloc] init];

    NSMutableArray *field_1_data = [[NSMutableArray alloc] init];

    for (id messages_elem in messages)
    {
        RCTCoreLGCosmosLikeMessage *rctParam_messages_elem = (RCTCoreLGCosmosLikeMessage *)[self.bridge moduleForName:@"CoreLGCosmosLikeMessage"];
        LGCosmosLikeMessage *field_1_elem = (LGCosmosLikeMessage *)[rctParam_messages_elem.objcImplementations objectForKey:messages_elem[@"uid"]];
        [field_1_data addObject:messages_elem[@"uid"]];
        [field_1 addObject:field_1_elem];

    }
    [implementationsData setObject:field_1_data forKey:@"messages"];



    LGCosmosGasLimitRequest * finalResult = [[LGCosmosGasLimitRequest alloc] initWithMemo:memo messages:field_1 amplifier:amplifier];
    NSString *uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGCosmosGasLimitRequest *rctImpl = (RCTCoreLGCosmosGasLimitRequest *)[self.bridge moduleForName:@"CoreLGCosmosGasLimitRequest"];
    NSArray *finalResultArray = [[NSArray alloc] initWithObjects:finalResult, uuid, nil];
    [rctImpl baseSetObject:finalResultArray];
    NSDictionary *result = @{@"type" : @"CoreLGCosmosGasLimitRequest", @"uid" : uuid };
    if (result)
    {
        [self.implementationsData setObject:implementationsData forKey:uuid];
        resolve(result);
    }
}

-(void)mapImplementationsData:(NSDictionary *)currentInstance
{
    LGCosmosGasLimitRequest *objcImpl = (LGCosmosGasLimitRequest *)[self.objcImplementations objectForKey:currentInstance[@"uid"]];
    NSMutableDictionary *implementationsData = [[NSMutableDictionary alloc] init];
    id field_1 = objcImpl.messages;
    NSMutableArray *converted_field_1 = [[NSMutableArray alloc] init];
    for (id field_1_elem in field_1)
    {
        NSString *field_1_elem_uuid = [[NSUUID UUID] UUIDString];
        RCTCoreLGCosmosLikeMessage *rctImpl_field_1_elem = (RCTCoreLGCosmosLikeMessage *)[self.bridge moduleForName:@"CoreLGCosmosLikeMessage"];
        NSArray *field_1_elem_array = [[NSArray alloc] initWithObjects:field_1_elem, field_1_elem_uuid, nil];
        [rctImpl_field_1_elem baseSetObject:field_1_elem_array];
        NSDictionary *converted_field_1_elem = @{@"type" : @"CoreLGCosmosLikeMessage", @"uid" : field_1_elem_uuid };
        [converted_field_1 addObject:converted_field_1_elem];
    }
    [implementationsData setObject:converted_field_1 forKey:@"messages"];
    [self.implementationsData setObject:implementationsData forKey:currentInstance[@"uid"]];
}
RCT_REMAP_METHOD(getMemo, getMemo:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)rejecter)
{
    LGCosmosGasLimitRequest *objcImpl = (LGCosmosGasLimitRequest *)[self.objcImplementations objectForKey:currentInstance[@"uid"]];
    NSDictionary *result = @{@"value" : objcImpl.memo};
    resolve(result);
}

RCT_REMAP_METHOD(getMessages, getMessages:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)rejecter)
{
    NSDictionary *data = (NSDictionary *)[self.implementationsData objectForKey:currentInstance[@"uid"]];
    if (!data)
    {
        [self mapImplementationsData:currentInstance];
        data = (NSDictionary *)[self.implementationsData objectForKey:currentInstance[@"uid"]];
    }
    NSArray<NSDictionary *> *result = [data objectForKey:@"messages"];
    resolve(result);
}

RCT_REMAP_METHOD(getAmplifier, getAmplifier:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)rejecter)
{
    LGCosmosGasLimitRequest *objcImpl = (LGCosmosGasLimitRequest *)[self.objcImplementations objectForKey:currentInstance[@"uid"]];
    NSDictionary *result = @{@"value" : objcImpl.amplifier};
    resolve(result);
}

@end