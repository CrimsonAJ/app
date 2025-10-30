package h6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1037h;
import com.google.crypto.tink.shaded.protobuf.AbstractC1048t;
import com.google.crypto.tink.shaded.protobuf.AbstractC1050v;
import com.google.crypto.tink.shaded.protobuf.C1036g;
import com.google.crypto.tink.shaded.protobuf.C1043n;
import w.AbstractC2128h;

/* loaded from: classes.dex */
public final class u0 extends AbstractC1050v {
    private static final u0 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC1037h keyValue_ = AbstractC1037h.f16356b;
    private int version_;

    static {
        u0 u0Var = new u0();
        DEFAULT_INSTANCE = u0Var;
        AbstractC1050v.t(u0.class, u0Var);
    }

    public static t0 A() {
        return (t0) DEFAULT_INSTANCE.h();
    }

    public static u0 B(AbstractC1037h abstractC1037h, C1043n c1043n) {
        return (u0) AbstractC1050v.r(DEFAULT_INSTANCE, abstractC1037h, c1043n);
    }

    public static void w(u0 u0Var) {
        u0Var.version_ = 0;
    }

    public static void x(u0 u0Var, C1036g c1036g) {
        u0Var.getClass();
        u0Var.keyValue_ = c1036g;
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
                return new com.google.crypto.tink.shaded.protobuf.a0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new u0();
            case 4:
                return new AbstractC1048t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.W w9 = PARSER;
                if (w9 == null) {
                    synchronized (u0.class) {
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

    public final AbstractC1037h y() {
        return this.keyValue_;
    }

    public final int z() {
        return this.version_;
    }
}
