package h6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1048t;
import com.google.crypto.tink.shaded.protobuf.AbstractC1050v;
import w.AbstractC2128h;

/* loaded from: classes.dex */
public final class j0 extends AbstractC1050v {
    private static final j0 DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_ = "";

    static {
        j0 j0Var = new j0();
        DEFAULT_INSTANCE = j0Var;
        AbstractC1050v.t(j0.class, j0Var);
    }

    public static i0 B() {
        return (i0) DEFAULT_INSTANCE.h();
    }

    public static void w(j0 j0Var, String str) {
        j0Var.getClass();
        str.getClass();
        j0Var.typeUrl_ = str;
    }

    public static void x(j0 j0Var, r0 r0Var) {
        j0Var.getClass();
        j0Var.outputPrefixType_ = r0Var.b();
    }

    public static void y(j0 j0Var, Z z9) {
        j0Var.getClass();
        j0Var.status_ = z9.a();
    }

    public static void z(j0 j0Var, int i9) {
        j0Var.keyId_ = i9;
    }

    public final int A() {
        return this.keyId_;
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
                return new com.google.crypto.tink.shaded.protobuf.a0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new j0();
            case 4:
                return new AbstractC1048t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.W w9 = PARSER;
                if (w9 == null) {
                    synchronized (j0.class) {
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
