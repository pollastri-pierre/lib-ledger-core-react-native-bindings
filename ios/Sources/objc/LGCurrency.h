// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from currency.djinni

#import "LGBitcoinLikeNetworkParameters.h"
#import "LGCurrencyUnit.h"
#import "LGEthereumLikeNetworkParameters.h"
#import "LGRippleLikeNetworkParameters.h"
#import "LGWalletType.h"
#import <Foundation/Foundation.h>

/** Structure of cryptocurrency. */
@interface LGCurrency : NSObject
- (nonnull instancetype)initWithWalletType:(LGWalletType)walletType
                                      name:(nonnull NSString *)name
                             bip44CoinType:(int32_t)bip44CoinType
                          paymentUriScheme:(nonnull NSString *)paymentUriScheme
                                     units:(nonnull NSArray<LGCurrencyUnit *> *)units
              bitcoinLikeNetworkParameters:(nullable LGBitcoinLikeNetworkParameters *)bitcoinLikeNetworkParameters
             ethereumLikeNetworkParameters:(nullable LGEthereumLikeNetworkParameters *)ethereumLikeNetworkParameters
               rippleLikeNetworkParameters:(nullable LGRippleLikeNetworkParameters *)rippleLikeNetworkParameters;
+ (nonnull instancetype)CurrencyWithWalletType:(LGWalletType)walletType
                                          name:(nonnull NSString *)name
                                 bip44CoinType:(int32_t)bip44CoinType
                              paymentUriScheme:(nonnull NSString *)paymentUriScheme
                                         units:(nonnull NSArray<LGCurrencyUnit *> *)units
                  bitcoinLikeNetworkParameters:(nullable LGBitcoinLikeNetworkParameters *)bitcoinLikeNetworkParameters
                 ethereumLikeNetworkParameters:(nullable LGEthereumLikeNetworkParameters *)ethereumLikeNetworkParameters
                   rippleLikeNetworkParameters:(nullable LGRippleLikeNetworkParameters *)rippleLikeNetworkParameters;

/** WalletType object defining the type of wallet the currency belongs to. */
@property (nonatomic, readonly) LGWalletType walletType;

/** String which represents currency name. */
@property (nonatomic, readonly, nonnull) NSString * name;

/**
 * Integer cointype, part of BIP32 path.
 * One can refer to https://github.com/satoshilabs/slips/blob/master/slip-0044.md.
 */
@property (nonatomic, readonly) int32_t bip44CoinType;

/** String representing schemes allowing to send money to a cryptocurrency address (e.g. bitcoin). */
@property (nonatomic, readonly, nonnull) NSString * paymentUriScheme;

/** List of CurrencyUnit objects (e.g. BTC, mBTC ...). */
@property (nonatomic, readonly, nonnull) NSArray<LGCurrencyUnit *> * units;

/**
 *TODO: find a better solution to have only a networkParameters
 * Optional BitcoinLikeNetworkParameters, for more details refer to BitcoinLikeNetworkParameters doc
 */
@property (nonatomic, readonly, nullable) LGBitcoinLikeNetworkParameters * bitcoinLikeNetworkParameters;

/** Optional EthereumLikeNetworkParameters, for more details refer to EthereumLikeNetworkParameters doc */
@property (nonatomic, readonly, nullable) LGEthereumLikeNetworkParameters * ethereumLikeNetworkParameters;

/**Optional EthereumLikeNetworkParameters, for more details refer to EthereumLikeNetworkParameters doc */
@property (nonatomic, readonly, nullable) LGRippleLikeNetworkParameters * rippleLikeNetworkParameters;

@end
