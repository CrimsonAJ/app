package h6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1037h;
import com.google.crypto.tink.shaded.protobuf.AbstractC1050v;
import com.google.crypto.tink.shaded.protobuf.C1043n;
import w.AbstractC2128h;

/* loaded from: classes.dex */
public final class v0 extends AbstractC1050v {
    private static final v0 DEFAULT_INSTANCE;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int version_;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.crypto.tink.shaded.protobuf.v, h6.v0] */
    static {
        ?? abstractC1050v = new AbstractC1050v();
        DEFAULT_INSTANCE = abstractC1050v;
        AbstractC1050v.t(v0.class, abstractC1050v);
    }

    public static v0 w() {
        return DEFAULT_INSTANCE;
    }

    public static v0 x(AbstractC1037h abstractC1037h, C1043n c1043n) {
        return (v0) AbstractC1050v.r(DEFAULT_INSTANCE, abstractC1037h, c1043n);
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, com.google.crypto.tink.shaded.protobuf.W] */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1050v
    public final Object i(int i9) {
        com.google.crypto.tink.shaded.protobuf.W w7;
        switch (AbstractC2128h.b(i9)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.a0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"version_"});
            case 3:
                return new AbstractC1050v();
            case 4:
                return new K(DEFAULT_INSTANCE, 5);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.W w9 = PARSER;
                if (w9 == null) {
                    synchronized (v0.class) {
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
