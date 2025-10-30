package h6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1037h;
import com.google.crypto.tink.shaded.protobuf.AbstractC1048t;
import com.google.crypto.tink.shaded.protobuf.AbstractC1050v;
import com.google.crypto.tink.shaded.protobuf.C1043n;
import w.AbstractC2128h;

/* renamed from: h6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1289d extends AbstractC1050v {
    private static final C1289d DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER;
    private int keySize_;
    private C1291f params_;

    /* JADX WARN: Type inference failed for: r0v0, types: [h6.d, com.google.crypto.tink.shaded.protobuf.v] */
    static {
        ?? abstractC1050v = new AbstractC1050v();
        DEFAULT_INSTANCE = abstractC1050v;
        AbstractC1050v.t(C1289d.class, abstractC1050v);
    }

    public static C1288c A() {
        return (C1288c) DEFAULT_INSTANCE.h();
    }

    public static C1289d B(AbstractC1037h abstractC1037h, C1043n c1043n) {
        return (C1289d) AbstractC1050v.r(DEFAULT_INSTANCE, abstractC1037h, c1043n);
    }

    public static void w(C1289d c1289d) {
        c1289d.keySize_ = 32;
    }

    public static void x(C1289d c1289d, C1291f c1291f) {
        c1289d.getClass();
        c1289d.params_ = c1291f;
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
                return new com.google.crypto.tink.shaded.protobuf.a0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            case 3:
                return new AbstractC1050v();
            case 4:
                return new AbstractC1048t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.W w9 = PARSER;
                if (w9 == null) {
                    synchronized (C1289d.class) {
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

    public final int y() {
        return this.keySize_;
    }

    public final C1291f z() {
        C1291f c1291f = this.params_;
        if (c1291f == null) {
            return C1291f.x();
        }
        return c1291f;
    }
}
