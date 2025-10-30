package h6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1037h;
import com.google.crypto.tink.shaded.protobuf.AbstractC1048t;
import com.google.crypto.tink.shaded.protobuf.AbstractC1050v;
import com.google.crypto.tink.shaded.protobuf.C1036g;
import w.AbstractC2128h;

/* loaded from: classes.dex */
public final class Y extends AbstractC1050v {
    private static final Y DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private AbstractC1037h value_ = AbstractC1037h.f16356b;

    static {
        Y y9 = new Y();
        DEFAULT_INSTANCE = y9;
        AbstractC1050v.t(Y.class, y9);
    }

    public static W D() {
        return (W) DEFAULT_INSTANCE.h();
    }

    public static void w(Y y9, String str) {
        y9.getClass();
        str.getClass();
        y9.typeUrl_ = str;
    }

    public static void x(Y y9, C1036g c1036g) {
        y9.getClass();
        y9.value_ = c1036g;
    }

    public static void y(Y y9, X x5) {
        y9.getClass();
        if (x5 != X.UNRECOGNIZED) {
            y9.keyMaterialType_ = x5.f17954a;
        } else {
            x5.getClass();
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static Y z() {
        return DEFAULT_INSTANCE;
    }

    public final X A() {
        X x5;
        int i9 = this.keyMaterialType_;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            x5 = null;
                        } else {
                            x5 = X.REMOTE;
                        }
                    } else {
                        x5 = X.ASYMMETRIC_PUBLIC;
                    }
                } else {
                    x5 = X.ASYMMETRIC_PRIVATE;
                }
            } else {
                x5 = X.SYMMETRIC;
            }
        } else {
            x5 = X.UNKNOWN_KEYMATERIAL;
        }
        if (x5 == null) {
            return X.UNRECOGNIZED;
        }
        return x5;
    }

    public final String B() {
        return this.typeUrl_;
    }

    public final AbstractC1037h C() {
        return this.value_;
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
                return new com.google.crypto.tink.shaded.protobuf.a0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 3:
                return new Y();
            case 4:
                return new AbstractC1048t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.W w9 = PARSER;
                if (w9 == null) {
                    synchronized (Y.class) {
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
