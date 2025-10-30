package h6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1037h;
import com.google.crypto.tink.shaded.protobuf.AbstractC1048t;
import com.google.crypto.tink.shaded.protobuf.AbstractC1050v;
import com.google.crypto.tink.shaded.protobuf.C1043n;
import w.AbstractC2128h;

/* renamed from: h6.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1293h extends AbstractC1050v {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final C1293h DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C1297l aesCtrKey_;
    private Q hmacKey_;
    private int version_;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.crypto.tink.shaded.protobuf.v, h6.h] */
    static {
        ?? abstractC1050v = new AbstractC1050v();
        DEFAULT_INSTANCE = abstractC1050v;
        AbstractC1050v.t(C1293h.class, abstractC1050v);
    }

    public static C1292g C() {
        return (C1292g) DEFAULT_INSTANCE.h();
    }

    public static C1293h D(AbstractC1037h abstractC1037h, C1043n c1043n) {
        return (C1293h) AbstractC1050v.r(DEFAULT_INSTANCE, abstractC1037h, c1043n);
    }

    public static void w(C1293h c1293h) {
        c1293h.version_ = 0;
    }

    public static void x(C1293h c1293h, C1297l c1297l) {
        c1293h.getClass();
        c1297l.getClass();
        c1293h.aesCtrKey_ = c1297l;
    }

    public static void y(C1293h c1293h, Q q9) {
        c1293h.getClass();
        q9.getClass();
        c1293h.hmacKey_ = q9;
    }

    public final Q A() {
        Q q9 = this.hmacKey_;
        if (q9 == null) {
            return Q.z();
        }
        return q9;
    }

    public final int B() {
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
                return new com.google.crypto.tink.shaded.protobuf.a0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 3:
                return new AbstractC1050v();
            case 4:
                return new AbstractC1048t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.W w9 = PARSER;
                if (w9 == null) {
                    synchronized (C1293h.class) {
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

    public final C1297l z() {
        C1297l c1297l = this.aesCtrKey_;
        if (c1297l == null) {
            return C1297l.z();
        }
        return c1297l;
    }
}
