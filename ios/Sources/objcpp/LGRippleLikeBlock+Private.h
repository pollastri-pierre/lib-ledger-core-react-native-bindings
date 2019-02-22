// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from ripple_like_wallet.djinni

#include "RippleLikeBlock.hpp"
#include <memory>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@class LGRippleLikeBlock;

namespace djinni_generated {

class RippleLikeBlock
{
public:
    using CppType = std::shared_ptr<::ledger::core::api::RippleLikeBlock>;
    using CppOptType = std::shared_ptr<::ledger::core::api::RippleLikeBlock>;
    using ObjcType = LGRippleLikeBlock*;

    using Boxed = RippleLikeBlock;

    static CppType toCpp(ObjcType objc);
    static ObjcType fromCppOpt(const CppOptType& cpp);
    static ObjcType fromCpp(const CppType& cpp) { return fromCppOpt(cpp); }

private:
    class ObjcProxy;
};

}  // namespace djinni_generated

