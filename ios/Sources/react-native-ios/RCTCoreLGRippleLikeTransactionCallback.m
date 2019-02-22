// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from callback.djinni

#import "RCTCoreLGRippleLikeTransactionCallback.h"


@implementation RCTCoreLGRippleLikeTransactionCallback
-(instancetype)initWithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock) reject andBridge: (RCTBridge *) bridge
{
    self = [super init];
    if(self)
    {
        self.resolve = resolve;
        self.reject = reject;
        self.bridge = bridge;
    }
    return self;
}

/**
 * Method triggered when main task complete.
 * @params result optional of type T, non null if main task failed
 * @params error optional of type Error, non null if main task succeeded
 */
- (void)onCallback:(nullable LGRippleLikeTransaction *)result
             error:(nullable LGError *)error {
    if (error)
    {
        self.reject(@"RCTCoreLGRippleLikeTransactionCallback Error", error.message, nil);
        return;
    }

    NSString *result_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGRippleLikeTransaction *rctImpl_result = (RCTCoreLGRippleLikeTransaction *)[self.bridge moduleForName:@"CoreLGRippleLikeTransaction"];
    if (result)
    {
        NSArray *result_array = [[NSArray alloc] initWithObjects:result, result_uuid, nil];
        [rctImpl_result baseSetObject:result_array];
    }
    NSDictionary *converted_result = @{@"type" : @"CoreLGRippleLikeTransaction", @"uid" : result_uuid };

    self.resolve(converted_result);

}
@end
