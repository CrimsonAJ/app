package h6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1037h;
import com.google.crypto.tink.shaded.protobuf.AbstractC1048t;
import com.google.crypto.tink.shaded.protobuf.AbstractC1050v;
import com.google.crypto.tink.shaded.protobuf.C1036g;
import com.google.crypto.tink.shaded.protobuf.C1043n;
import w.AbstractC2128h;

/* loaded from: classes.dex */
public final class r extends AbstractC1050v {
    private static final r DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC1037h keyValue_ = AbstractC1037h.f16356b;
    private C1306v params_;
    private int version_;

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        AbstractC1050v.t(r.class, rVar);
    }

    public static C1302q C() {
        return (C1302q) DEFAULT_INSTANCE.h();
    }

    public static r D(AbstractC1037h abstractC1037h, C1043n c1043n) {
        return (r) AbstractC1050v.r(DEFAULT_INSTANCE, abstractC1037h, c1043n);
    }

    public static void w(r rVar) {
        rVar.version_ = 0;
    }

    public static void x(r rVar, C1306v c1306v) {
        rVar.getClass();
        c1306v.getClass();
        rVar.params_ = c1306v;
    }

    public static void y(r rVar, C1036g c1036g) {
        rVar.getClass();
        rVar.keyValue_ = c1036g;
    }

    public final C1306v A() {
        C1306v c1306v = this.params_;
        if (c1306v == null) {
            return C1306v.x();
        }
        return c1306v;
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
                return new com.google.crypto.tink.shaded.protobuf.a0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new r();
            case 4:
                return new AbstractC1048t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.W w9 = PARSER;
                if (w9 == null) {
                    synchronized (r.class) {
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
