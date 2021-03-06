// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from amount.djinni

#import "LGFormatRules+Private.h"
#import "DJIMarshal+Private.h"
#import "LGRoundingMode+Private.h"
#include <cassert>

namespace djinni_generated {

auto FormatRules::toCpp(ObjcType obj) -> CppType
{
    assert(obj);
    return {::djinni::Enum<::ledger::core::api::RoundingMode, LGRoundingMode>::toCpp(obj.roundingMode),
            ::djinni::I32::toCpp(obj.maxNumberOfDecimals)};
}

auto FormatRules::fromCpp(const CppType& cpp) -> ObjcType
{
    return [[LGFormatRules alloc] initWithRoundingMode:(::djinni::Enum<::ledger::core::api::RoundingMode, LGRoundingMode>::fromCpp(cpp.roundingMode))
                                   maxNumberOfDecimals:(::djinni::I32::fromCpp(cpp.maxNumberOfDecimals))];
}

}  // namespace djinni_generated
