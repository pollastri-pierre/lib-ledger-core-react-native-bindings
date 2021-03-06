// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from idl.djinni

#import "LGAlgorandPaymentInfo+Private.h"
#import "DJIMarshal+Private.h"
#include <cassert>

namespace djinni_generated {

auto AlgorandPaymentInfo::toCpp(ObjcType obj) -> CppType
{
    assert(obj);
    return {::djinni::String::toCpp(obj.recipientAddress),
            ::djinni::String::toCpp(obj.amount),
            ::djinni::Optional<std::experimental::optional, ::djinni::String>::toCpp(obj.closeAddress),
            ::djinni::Optional<std::experimental::optional, ::djinni::String>::toCpp(obj.closeAmount)};
}

auto AlgorandPaymentInfo::fromCpp(const CppType& cpp) -> ObjcType
{
    return [[LGAlgorandPaymentInfo alloc] initWithRecipientAddress:(::djinni::String::fromCpp(cpp.recipientAddress))
                                                            amount:(::djinni::String::fromCpp(cpp.amount))
                                                      closeAddress:(::djinni::Optional<std::experimental::optional, ::djinni::String>::fromCpp(cpp.closeAddress))
                                                       closeAmount:(::djinni::Optional<std::experimental::optional, ::djinni::String>::fromCpp(cpp.closeAmount))];
}

}  // namespace djinni_generated
