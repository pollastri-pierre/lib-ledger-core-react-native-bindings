// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from ripple_like_wallet.djinni

package co.ledger.core;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class RippleLikeTransactionBuilder {
    /**
     * Send funds to the given address. This method can be called multiple times to send to multiple addresses.
     * @param amount The value to send
     * @param address Address of the recipient
     * @return A reference on the same builder in order to chain calls.
     */
    public abstract RippleLikeTransactionBuilder sendToAddress(Amount amount, String address);

    /**
     * Send all available funds to the given address.
     * @param address Address of the recipient
     * @return A reference on the same builder in order to chain calls.
     */
    public abstract RippleLikeTransactionBuilder wipeToAddress(String address);

    /**
     * Set fees (in drop) the originator is willing to pay
     * @return A reference on the same builder in order to chain calls.
     */
    public abstract RippleLikeTransactionBuilder setFees(Amount fees);

    /** Build a transaction from the given builder parameters. */
    public abstract void build(RippleLikeTransactionCallback callback);

    /**
     * Creates a clone of this builder.
     * @return A copy of the current builder instance.
     */
    public abstract RippleLikeTransactionBuilder clone();

    /** Reset the current instance to its initial state */
    public abstract void reset();

    public static native RippleLikeTransaction parseRawUnsignedTransaction(Currency currency, byte[] rawTransaction);

    public static native RippleLikeTransaction parseRawSignedTransaction(Currency currency, byte[] rawTransaction);

    private static final class CppProxy extends RippleLikeTransactionBuilder
    {
        private final long nativeRef;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);

        private CppProxy(long nativeRef)
        {
            if (nativeRef == 0) throw new RuntimeException("nativeRef is zero");
            this.nativeRef = nativeRef;
        }

        private native void nativeDestroy(long nativeRef);
        public void destroy()
        {
            boolean destroyed = this.destroyed.getAndSet(true);
            if (!destroyed) nativeDestroy(this.nativeRef);
        }
        protected void finalize() throws java.lang.Throwable
        {
            destroy();
            super.finalize();
        }

        @Override
        public RippleLikeTransactionBuilder sendToAddress(Amount amount, String address)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_sendToAddress(this.nativeRef, amount, address);
        }
        private native RippleLikeTransactionBuilder native_sendToAddress(long _nativeRef, Amount amount, String address);

        @Override
        public RippleLikeTransactionBuilder wipeToAddress(String address)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_wipeToAddress(this.nativeRef, address);
        }
        private native RippleLikeTransactionBuilder native_wipeToAddress(long _nativeRef, String address);

        @Override
        public RippleLikeTransactionBuilder setFees(Amount fees)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_setFees(this.nativeRef, fees);
        }
        private native RippleLikeTransactionBuilder native_setFees(long _nativeRef, Amount fees);

        @Override
        public void build(RippleLikeTransactionCallback callback)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_build(this.nativeRef, callback);
        }
        private native void native_build(long _nativeRef, RippleLikeTransactionCallback callback);

        @Override
        public RippleLikeTransactionBuilder clone()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_clone(this.nativeRef);
        }
        private native RippleLikeTransactionBuilder native_clone(long _nativeRef);

        @Override
        public void reset()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_reset(this.nativeRef);
        }
        private native void native_reset(long _nativeRef);
    }
}
