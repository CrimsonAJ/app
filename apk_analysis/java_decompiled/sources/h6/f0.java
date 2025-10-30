package h6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1048t;
import com.google.crypto.tink.shaded.protobuf.AbstractC1050v;
import w.AbstractC2128h;

/* loaded from: classes.dex */
public final class f0 extends AbstractC1050v {
    private static final f0 DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private Y keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.crypto.tink.shaded.protobuf.v, h6.f0] */
    static {
        ?? abstractC1050v = new AbstractC1050v();
        DEFAULT_INSTANCE = abstractC1050v;
        AbstractC1050v.t(f0.class, abstractC1050v);
    }

    public static e0 F() {
        return (e0) DEFAULT_INSTANCE.h();
    }

    public static void w(f0 f0Var, Y y9) {
        f0Var.getClass();
        f0Var.keyData_ = y9;
    }

    public static void x(f0 f0Var, r0 r0Var) {
        f0Var.getClass();
        f0Var.outputPrefixType_ = r0Var.b();
    }

    public static void y(f0 f0Var) {
        Z z9 = Z.ENABLED;
        f0Var.getClass();
        f0Var.status_ = z9.a();
    }

    public static void z(f0 f0Var, int i9) {
        f0Var.keyId_ = i9;
    }

    public final Y A() {
        Y y9 = this.keyData_;
        if (y9 == null) {
            return Y.z();
        }
        return y9;
    }

    public final int B() {
        return this.keyId_;
    }

    public final r0 C() {
        r0 a5 = r0.a(this.outputPrefixType_);
        if (a5 == null) {
            return r0.UNRECOGNIZED;
        }
        return a5;
    }

    public final Z D() {
        Z z9;
        int i9 = this.status_;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        z9 = null;
                    } else {
                        z9 = Z.DESTROYED;
                    }
                } else {
                    z9 = Z.DISABLED;
                }
            } else {
                z9 = Z.ENABLED;
            }
        } else {
            z9 = Z.UNKNOWN_STATUS;
        }
        if (z9 == null) {
            return Z.UNRECOGNIZED;
        }
        return z9;
    }

    public final boolean E() {
        if (this.keyData_ != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, com.google.crypto.tink.shaded.protobuf.W] */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1050v
    public final Object i(int i9) {
        com.google.crypto.tink.shaded.protobuf.W w7;
        switch (AbstractC2128h.b(i9)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.a0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new AbstractC1050v();
            case 4:
                return new AbstractC1048t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.W w9 = PARSER;
                if (w9 == null) {
                    synchronized (f0.class) {
                        try {
                            com.google.crypto.tink.shaded.protobuf.W w10 = PARSER;
                            w7 = w10;
                            if (w10 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                w7 = obj;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return w7;
                }
                return w9;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
