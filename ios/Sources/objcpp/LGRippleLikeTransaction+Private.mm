// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from ripple_like_wallet.djinni

#import "LGRippleLikeTransaction+Private.h"
#import "LGRippleLikeTransaction.h"
#import "DJICppWrapperCache+Private.h"
#import "DJIError.h"
#import "DJIMarshal+Private.h"
#import "LGAmount+Private.h"
#import "LGBigInt+Private.h"
#import "LGRippleLikeAddress+Private.h"
#include <exception>
#include <stdexcept>
#include <utility>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@interface LGRippleLikeTransaction ()

- (id)initWithCpp:(const std::shared_ptr<::ledger::core::api::RippleLikeTransaction>&)cppRef;

@end

@implementation LGRippleLikeTransaction {
    ::djinni::CppProxyCache::Handle<std::shared_ptr<::ledger::core::api::RippleLikeTransaction>> _cppRefHandle;
}

- (id)initWithCpp:(const std::shared_ptr<::ledger::core::api::RippleLikeTransaction>&)cppRef
{
    if (self = [super init]) {
        _cppRefHandle.assign(cppRef);
    }
    return self;
}

- (nonnull NSString *)getHash {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getHash();
        return ::djinni::String::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nullable LGAmount *)getFees {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getFees();
        return ::djinni_generated::Amount::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nullable LGRippleLikeAddress *)getReceiver {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getReceiver();
        return ::djinni_generated::RippleLikeAddress::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nullable LGRippleLikeAddress *)getSender {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getSender();
        return ::djinni_generated::RippleLikeAddress::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nullable LGAmount *)getValue {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getValue();
        return ::djinni_generated::Amount::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nonnull NSData *)serialize {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->serialize();
        return ::djinni::Binary::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (void)setSignature:(nonnull NSData *)rSignature
          sSignature:(nonnull NSData *)sSignature {
    try {
        _cppRefHandle.get()->setSignature(::djinni::Binary::toCpp(rSignature),
                                          ::djinni::Binary::toCpp(sSignature));
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (void)setDERSignature:(nonnull NSData *)signature {
    try {
        _cppRefHandle.get()->setDERSignature(::djinni::Binary::toCpp(signature));
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nonnull NSDate *)getDate {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getDate();
        return ::djinni::Date::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nullable LGBigInt *)getSequence {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getSequence();
        return ::djinni_generated::BigInt::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nullable LGBigInt *)getLedgerSequence {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getLedgerSequence();
        return ::djinni_generated::BigInt::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nonnull NSData *)getSigningPubKey {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getSigningPubKey();
        return ::djinni::Binary::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

namespace djinni_generated {

auto RippleLikeTransaction::toCpp(ObjcType objc) -> CppType
{
    if (!objc) {
        return nullptr;
    }
    return objc->_cppRefHandle.get();
}

auto RippleLikeTransaction::fromCppOpt(const CppOptType& cpp) -> ObjcType
{
    if (!cpp) {
        return nil;
    }
    return ::djinni::get_cpp_proxy<LGRippleLikeTransaction>(cpp);
}

}  // namespace djinni_generated

@end
