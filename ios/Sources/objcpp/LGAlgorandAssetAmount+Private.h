// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from idl.djinni

#import "LGAlgorandAssetAmount.h"
#include "AlgorandAssetAmount.hpp"

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@class LGAlgorandAssetAmount;

namespace djinni_generated {

struct AlgorandAssetAmount
{
    using CppType = ::ledger::core::api::AlgorandAssetAmount;
    using ObjcType = LGAlgorandAssetAmount*;

    using Boxed = AlgorandAssetAmount;

    static CppType toCpp(ObjcType objc);
    static ObjcType fromCpp(const CppType& cpp);
};

}  // namespace djinni_generated
