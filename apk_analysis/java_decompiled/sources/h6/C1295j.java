package h6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1037h;
import com.google.crypto.tink.shaded.protobuf.AbstractC1048t;
import com.google.crypto.tink.shaded.protobuf.AbstractC1050v;
import com.google.crypto.tink.shaded.protobuf.C1043n;
import w.AbstractC2128h;

/* renamed from: h6.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1295j extends AbstractC1050v {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final C1295j DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER;
    private C1299n aesCtrKeyFormat_;
    private T hmacKeyFormat_;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.crypto.tink.shaded.protobuf.v, h6.j] */
    static {
        ?? abstractC1050v = new AbstractC1050v();
        DEFAULT_INSTANCE = abstractC1050v;
        AbstractC1050v.t(C1295j.class, abstractC1050v);
    }

    public static C1294i A() {
        return (C1294i) DEFAULT_INSTANCE.h();
    }

    public static C1295j B(AbstractC1037h abstractC1037h, C1043n c1043n) {
        return (C1295j) AbstractC1050v.r(DEFAULT_INSTANCE, abstractC1037h, c1043n);
    }

    public static void w(C1295j c1295j, C1299n c1299n) {
        c1295j.getClass();
        c1295j.aesCtrKeyFormat_ = c1299n;
    }

    public static void x(C1295j c1295j, T t7) {
        c1295j.getClass();
        c1295j.hmacKeyFormat_ = t7;
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
                return new com.google.crypto.tink.shaded.protobuf.a0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 3:
                return new AbstractC1050v();
            case 4:
                return new AbstractC1048t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.W w9 = PARSER;
                if (w9 == null) {
                    synchronized (C1295j.class) {
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

    public final C1299n y() {
        C1299n c1299n = this.aesCtrKeyFormat_;
        if (c1299n == null) {
            return C1299n.y();
        }
        return c1299n;
    }

    public final T z() {
        T t7 = this.hmacKeyFormat_;
        if (t7 == null) {
            return T.y();
        }
        return t7;
    }
}
