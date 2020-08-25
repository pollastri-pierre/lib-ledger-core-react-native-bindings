// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from idl.djinni

#import "LGAlgorandAssetParams+Private.h"
#import "DJIMarshal+Private.h"
#include <cassert>

namespace djinni_generated {

auto AlgorandAssetParams::toCpp(ObjcType obj) -> CppType
{
    assert(obj);
    return {::djinni::Optional<std::experimental::optional, ::djinni::String>::toCpp(obj.assetId),
            ::djinni::Optional<std::experimental::optional, ::djinni::String>::toCpp(obj.assetName),
            ::djinni::Optional<std::experimental::optional, ::djinni::String>::toCpp(obj.unitName),
            ::djinni::Optional<std::experimental::optional, ::djinni::String>::toCpp(obj.url),
            ::djinni::Bool::toCpp(obj.defaultFrozen),
            ::djinni::Optional<std::experimental::optional, ::djinni::String>::toCpp(obj.total),
            ::djinni::Optional<std::experimental::optional, ::djinni::String>::toCpp(obj.decimals),
            ::djinni::Optional<std::experimental::optional, ::djinni::String>::toCpp(obj.creatorAddress),
            ::djinni::Optional<std::experimental::optional, ::djinni::String>::toCpp(obj.managerAddress),
            ::djinni::Optional<std::experimental::optional, ::djinni::String>::toCpp(obj.freezeAddress),
            ::djinni::Optional<std::experimental::optional, ::djinni::String>::toCpp(obj.clawbackAddress),
            ::djinni::Optional<std::experimental::optional, ::djinni::String>::toCpp(obj.reserveAddress),
            ::djinni::Optional<std::experimental::optional, ::djinni::String>::toCpp(obj.metadataHash)};
}

auto AlgorandAssetParams::fromCpp(const CppType& cpp) -> ObjcType
{
    return [[LGAlgorandAssetParams alloc] initWithAssetId:(::djinni::Optional<std::experimental::optional, ::djinni::String>::fromCpp(cpp.assetId))
                                                assetName:(::djinni::Optional<std::experimental::optional, ::djinni::String>::fromCpp(cpp.assetName))
                                                 unitName:(::djinni::Optional<std::experimental::optional, ::djinni::String>::fromCpp(cpp.unitName))
                                                      url:(::djinni::Optional<std::experimental::optional, ::djinni::String>::fromCpp(cpp.url))
                                            defaultFrozen:(::djinni::Bool::fromCpp(cpp.defaultFrozen))
                                                    total:(::djinni::Optional<std::experimental::optional, ::djinni::String>::fromCpp(cpp.total))
                                                 decimals:(::djinni::Optional<std::experimental::optional, ::djinni::String>::fromCpp(cpp.decimals))
                                           creatorAddress:(::djinni::Optional<std::experimental::optional, ::djinni::String>::fromCpp(cpp.creatorAddress))
                                           managerAddress:(::djinni::Optional<std::experimental::optional, ::djinni::String>::fromCpp(cpp.managerAddress))
                                            freezeAddress:(::djinni::Optional<std::experimental::optional, ::djinni::String>::fromCpp(cpp.freezeAddress))
                                          clawbackAddress:(::djinni::Optional<std::experimental::optional, ::djinni::String>::fromCpp(cpp.clawbackAddress))
                                           reserveAddress:(::djinni::Optional<std::experimental::optional, ::djinni::String>::fromCpp(cpp.reserveAddress))
                                             metadataHash:(::djinni::Optional<std::experimental::optional, ::djinni::String>::fromCpp(cpp.metadataHash))];
}

}  // namespace djinni_generated