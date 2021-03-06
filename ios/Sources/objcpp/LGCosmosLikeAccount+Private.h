// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

#include "CosmosLikeAccount.hpp"
#include <memory>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@class LGCosmosLikeAccount;

namespace djinni_generated {

class CosmosLikeAccount
{
public:
    using CppType = std::shared_ptr<::ledger::core::api::CosmosLikeAccount>;
    using CppOptType = std::shared_ptr<::ledger::core::api::CosmosLikeAccount>;
    using ObjcType = LGCosmosLikeAccount*;

    using Boxed = CosmosLikeAccount;

    static CppType toCpp(ObjcType objc);
    static ObjcType fromCppOpt(const CppOptType& cpp);
    static ObjcType fromCpp(const CppType& cpp) { return fromCppOpt(cpp); }

private:
    class ObjcProxy;
};

}  // namespace djinni_generated

