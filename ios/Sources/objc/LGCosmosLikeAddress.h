// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from addresses.djinni

#import "LGCosmosLikeNetworkParameters.h"
#import <Foundation/Foundation.h>


/** Helper class for manipulating Cosmos like addresses. */
@interface LGCosmosLikeAddress : NSObject

/**
 * Gets the version of the address.
 * @return The version of the address
 */
- (nonnull NSData *)getVersion;

/**
 * Gets the raw hash160 of the public key
 * @return The 20 bytes of the public key hash160
 */
- (nonnull NSData *)getHash160;

/**
 * Gets the network parameters used for serializing the address.
 * @return The network parameters of the address
 */
- (nonnull LGCosmosLikeNetworkParameters *)getNetworkParameters;

/**
 * Encodes to Bech32.
 * @return The Bech32 encoding
 */
- (nonnull NSString *)toBech32;

@end