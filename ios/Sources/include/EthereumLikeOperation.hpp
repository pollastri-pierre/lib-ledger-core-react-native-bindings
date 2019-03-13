// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from ethereum_like_wallet.djinni

#ifndef DJINNI_GENERATED_ETHEREUMLIKEOPERATION_HPP
#define DJINNI_GENERATED_ETHEREUMLIKEOPERATION_HPP

#include <memory>

namespace ledger { namespace core { namespace api {

class EthereumLikeTransaction;

/** Class representing a Ethereum Operation. */
class EthereumLikeOperation {
public:
    virtual ~EthereumLikeOperation() {}

    /**
     * Get operation's transaction.
     * @return EthereumLikeTransaction object
     */
    virtual std::shared_ptr<EthereumLikeTransaction> getTransaction() = 0;
};

} } }  // namespace ledger::core::api
#endif //DJINNI_GENERATED_ETHEREUMLIKEOPERATION_HPP