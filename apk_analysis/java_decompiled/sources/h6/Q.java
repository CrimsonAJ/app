package h6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1037h;
import com.google.crypto.tink.shaded.protobuf.AbstractC1048t;
import com.google.crypto.tink.shaded.protobuf.AbstractC1050v;
import com.google.crypto.tink.shaded.protobuf.C1036g;
import com.google.crypto.tink.shaded.protobuf.C1043n;
import w.AbstractC2128h;

/* loaded from: classes.dex */
public final class Q extends AbstractC1050v {
    private static final Q DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC1037h keyValue_ = AbstractC1037h.f16356b;
    private V params_;
    private int version_;

    static {
        Q q9 = new Q();
        DEFAULT_INSTANCE = q9;
        AbstractC1050v.t(Q.class, q9);
    }

    public static P D() {
        return (P) DEFAULT_INSTANCE.h();
    }

    public static Q E(AbstractC1037h abstractC1037h, C1043n c1043n) {
        return (Q) AbstractC1050v.r(DEFAULT_INSTANCE, abstractC1037h, c1043n);
    }

    public static void w(Q q9) {
        q9.version_ = 0;
    }

    public static void x(Q q9, V v8) {
        q9.getClass();
        v8.getClass();
        q9.params_ = v8;
    }

    public static void y(Q q9, C1036g c1036g) {
        q9.getClass();
        q9.keyValue_ = c1036g;
    }

    public static Q z() {
        return DEFAULT_INSTANCE;
    }

    public final AbstractC1037h A() {
        return this.keyValue_;
    }

    public final V B() {
        V v8 = this.params_;
        if (v8 == null) {
            return V.y();
        }
        return v8;
    }

    public final int C() {
        return this.version_;
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
                return new com.google.crypto.tink.shaded.protobuf.a0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new Q();
            case 4:
                return new AbstractC1048t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.W w9 = PARSER;
                if (w9 == null) {
                    synchronized (Q.class) {
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
