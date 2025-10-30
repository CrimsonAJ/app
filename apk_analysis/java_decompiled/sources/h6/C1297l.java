package h6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1037h;
import com.google.crypto.tink.shaded.protobuf.AbstractC1048t;
import com.google.crypto.tink.shaded.protobuf.AbstractC1050v;
import com.google.crypto.tink.shaded.protobuf.C1036g;
import w.AbstractC2128h;

/* renamed from: h6.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1297l extends AbstractC1050v {
    private static final C1297l DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC1037h keyValue_ = AbstractC1037h.f16356b;
    private C1301p params_;
    private int version_;

    static {
        C1297l c1297l = new C1297l();
        DEFAULT_INSTANCE = c1297l;
        AbstractC1050v.t(C1297l.class, c1297l);
    }

    public static C1296k D() {
        return (C1296k) DEFAULT_INSTANCE.h();
    }

    public static void w(C1297l c1297l) {
        c1297l.version_ = 0;
    }

    public static void x(C1297l c1297l, C1301p c1301p) {
        c1297l.getClass();
        c1301p.getClass();
        c1297l.params_ = c1301p;
    }

    public static void y(C1297l c1297l, C1036g c1036g) {
        c1297l.getClass();
        c1297l.keyValue_ = c1036g;
    }

    public static C1297l z() {
        return DEFAULT_INSTANCE;
    }

    public final AbstractC1037h A() {
        return this.keyValue_;
    }

    public final C1301p B() {
        C1301p c1301p = this.params_;
        if (c1301p == null) {
            return C1301p.x();
        }
        return c1301p;
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
                return new C1297l();
            case 4:
                return new AbstractC1048t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.W w9 = PARSER;
                if (w9 == null) {
                    synchronized (C1297l.class) {
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
