package h6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1037h;
import com.google.crypto.tink.shaded.protobuf.AbstractC1048t;
import com.google.crypto.tink.shaded.protobuf.AbstractC1050v;
import com.google.crypto.tink.shaded.protobuf.C1036g;
import com.google.crypto.tink.shaded.protobuf.C1043n;
import w.AbstractC2128h;

/* renamed from: h6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1287b extends AbstractC1050v {
    private static final C1287b DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC1037h keyValue_ = AbstractC1037h.f16356b;
    private C1291f params_;
    private int version_;

    static {
        C1287b c1287b = new C1287b();
        DEFAULT_INSTANCE = c1287b;
        AbstractC1050v.t(C1287b.class, c1287b);
    }

    public static C1286a C() {
        return (C1286a) DEFAULT_INSTANCE.h();
    }

    public static C1287b D(AbstractC1037h abstractC1037h, C1043n c1043n) {
        return (C1287b) AbstractC1050v.r(DEFAULT_INSTANCE, abstractC1037h, c1043n);
    }

    public static void w(C1287b c1287b) {
        c1287b.version_ = 0;
    }

    public static void x(C1287b c1287b, C1036g c1036g) {
        c1287b.getClass();
        c1287b.keyValue_ = c1036g;
    }

    public static void y(C1287b c1287b, C1291f c1291f) {
        c1287b.getClass();
        c1291f.getClass();
        c1287b.params_ = c1291f;
    }

    public final C1291f A() {
        C1291f c1291f = this.params_;
        if (c1291f == null) {
            return C1291f.x();
        }
        return c1291f;
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
                return new com.google.crypto.tink.shaded.protobuf.a0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 3:
                return new C1287b();
            case 4:
                return new AbstractC1048t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.W w9 = PARSER;
                if (w9 == null) {
                    synchronized (C1287b.class) {
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

    public final AbstractC1037h z() {
        return this.keyValue_;
    }
}
