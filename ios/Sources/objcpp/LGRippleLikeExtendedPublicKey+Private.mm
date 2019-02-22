// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from addresses.djinni

#import "LGRippleLikeExtendedPublicKey+Private.h"
#import "LGRippleLikeExtendedPublicKey.h"
#import "DJICppWrapperCache+Private.h"
#import "DJIError.h"
#import "DJIMarshal+Private.h"
#import "LGRippleLikeAddress+Private.h"
#include <exception>
#include <stdexcept>
#include <utility>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@interface LGRippleLikeExtendedPublicKey ()

- (id)initWithCpp:(const std::shared_ptr<::ledger::core::api::RippleLikeExtendedPublicKey>&)cppRef;

@end

@implementation LGRippleLikeExtendedPublicKey {
    ::djinni::CppProxyCache::Handle<std::shared_ptr<::ledger::core::api::RippleLikeExtendedPublicKey>> _cppRefHandle;
}

- (id)initWithCpp:(const std::shared_ptr<::ledger::core::api::RippleLikeExtendedPublicKey>&)cppRef
{
    if (self = [super init]) {
        _cppRefHandle.assign(cppRef);
    }
    return self;
}

- (nullable LGRippleLikeAddress *)derive:(nonnull NSString *)path {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->derive(::djinni::String::toCpp(path));
        return ::djinni_generated::RippleLikeAddress::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nonnull NSData *)derivePublicKey:(nonnull NSString *)path {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->derivePublicKey(::djinni::String::toCpp(path));
        return ::djinni::Binary::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nonnull NSData *)deriveHash160:(nonnull NSString *)path {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->deriveHash160(::djinni::String::toCpp(path));
        return ::djinni::Binary::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nonnull NSString *)toBase58 {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->toBase58();
        return ::djinni::String::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nonnull NSString *)getRootPath {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getRootPath();
        return ::djinni::String::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

namespace djinni_generated {

auto RippleLikeExtendedPublicKey::toCpp(ObjcType objc) -> CppType
{
    if (!objc) {
        return nullptr;
    }
    return objc->_cppRefHandle.get();
}

auto RippleLikeExtendedPublicKey::fromCppOpt(const CppOptType& cpp) -> ObjcType
{
    if (!cpp) {
        return nil;
    }
    return ::djinni::get_cpp_proxy<LGRippleLikeExtendedPublicKey>(cpp);
}

}  // namespace djinni_generated

@end
