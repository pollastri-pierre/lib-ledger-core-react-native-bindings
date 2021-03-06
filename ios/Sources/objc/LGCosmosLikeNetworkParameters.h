// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from addresses.djinni

#import <Foundation/Foundation.h>

@interface LGCosmosLikeNetworkParameters : NSObject
- (nonnull instancetype)initWithIdentifier:(nonnull NSString *)Identifier
                             MessagePrefix:(nonnull NSString *)MessagePrefix
                               XPUBVersion:(nonnull NSData *)XPUBVersion
                              PubKeyPrefix:(nonnull NSData *)PubKeyPrefix
                             AddressPrefix:(nonnull NSData *)AddressPrefix
                                   ChainId:(nonnull NSString *)ChainId
                            AdditionalCIPs:(nonnull NSArray<NSString *> *)AdditionalCIPs;
+ (nonnull instancetype)CosmosLikeNetworkParametersWithIdentifier:(nonnull NSString *)Identifier
                                                    MessagePrefix:(nonnull NSString *)MessagePrefix
                                                      XPUBVersion:(nonnull NSData *)XPUBVersion
                                                     PubKeyPrefix:(nonnull NSData *)PubKeyPrefix
                                                    AddressPrefix:(nonnull NSData *)AddressPrefix
                                                          ChainId:(nonnull NSString *)ChainId
                                                   AdditionalCIPs:(nonnull NSArray<NSString *> *)AdditionalCIPs;

/** Name of the network. */
@property (nonatomic, readonly, nonnull) NSString * Identifier;

/** Constant prefix to prepend all signature messages. */
@property (nonatomic, readonly, nonnull) NSString * MessagePrefix;

/** Version of the Extended Public Key standard. */
@property (nonatomic, readonly, nonnull) NSData * XPUBVersion;

/** Prefix useful during implicit address construction from pubKey hash */
@property (nonatomic, readonly, nonnull) NSData * PubKeyPrefix;

/** Prefix useful during originated address construction from pubKey hash */
@property (nonatomic, readonly, nonnull) NSData * AddressPrefix;

/** Chain ID of the network */
@property (nonatomic, readonly, nonnull) NSString * ChainId;

/** Addition CIPs enabled for this network. */
@property (nonatomic, readonly, nonnull) NSArray<NSString *> * AdditionalCIPs;

@end
