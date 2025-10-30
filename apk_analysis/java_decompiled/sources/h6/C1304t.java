package h6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1037h;
import com.google.crypto.tink.shaded.protobuf.AbstractC1048t;
import com.google.crypto.tink.shaded.protobuf.AbstractC1050v;
import com.google.crypto.tink.shaded.protobuf.C1043n;
import w.AbstractC2128h;

/* renamed from: h6.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1304t extends AbstractC1050v {
    private static final C1304t DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER;
    private int keySize_;
    private C1306v params_;

    /* JADX WARN: Type inference failed for: r0v0, types: [h6.t, com.google.crypto.tink.shaded.protobuf.v] */
    static {
        ?? abstractC1050v = new AbstractC1050v();
        DEFAULT_INSTANCE = abstractC1050v;
        AbstractC1050v.t(C1304t.class, abstractC1050v);
    }

    public static C1303s A() {
        return (C1303s) DEFAULT_INSTANCE.h();
    }

    public static C1304t B(AbstractC1037h abstractC1037h, C1043n c1043n) {
        return (C1304t) AbstractC1050v.r(DEFAULT_INSTANCE, abstractC1037h, c1043n);
    }

    public static void w(C1304t c1304t, C1306v c1306v) {
        c1304t.getClass();
        c1304t.params_ = c1306v;
    }

    public static void x(C1304t c1304t, int i9) {
        c1304t.keySize_ = i9;
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
                return new com.google.crypto.tink.shaded.protobuf.a0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 3:
                return new AbstractC1050v();
            case 4:
                return new AbstractC1048t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.W w9 = PARSER;
                if (w9 == null) {
                    synchronized (C1304t.class) {
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

    public final C1306v z() {
        C1306v c1306v = this.params_;
        if (c1306v == null) {
            return C1306v.x();
        }
        return c1306v;
    }
}
