// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from messages.djinni

#import "LGCosmosLikeMsgSubmitProposal+Private.h"
#import "DJIMarshal+Private.h"
#import "LGCosmosLikeAmount+Private.h"
#import "LGCosmosLikeContent+Private.h"
#include <cassert>

namespace djinni_generated {

auto CosmosLikeMsgSubmitProposal::toCpp(ObjcType obj) -> CppType
{
    assert(obj);
    return {::djinni_generated::CosmosLikeContent::toCpp(obj.content),
            ::djinni::String::toCpp(obj.proposer),
            ::djinni::List<::djinni_generated::CosmosLikeAmount>::toCpp(obj.initialDeposit)};
}

auto CosmosLikeMsgSubmitProposal::fromCpp(const CppType& cpp) -> ObjcType
{
    return [[LGCosmosLikeMsgSubmitProposal alloc] initWithContent:(::djinni_generated::CosmosLikeContent::fromCpp(cpp.content))
                                                         proposer:(::djinni::String::fromCpp(cpp.proposer))
                                                   initialDeposit:(::djinni::List<::djinni_generated::CosmosLikeAmount>::fromCpp(cpp.initialDeposit))];
}

}  // namespace djinni_generated
