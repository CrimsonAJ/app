package h6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1037h;
import com.google.crypto.tink.shaded.protobuf.AbstractC1050v;
import com.google.crypto.tink.shaded.protobuf.C1043n;
import w.AbstractC2128h;

/* loaded from: classes.dex */
public final class q0 extends AbstractC1050v {
    private static final q0 DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER;
    private b0 dekTemplate_;
    private String kekUri_ = "";

    static {
        q0 q0Var = new q0();
        DEFAULT_INSTANCE = q0Var;
        AbstractC1050v.t(q0.class, q0Var);
    }

    public static q0 A(AbstractC1037h abstractC1037h, C1043n c1043n) {
        return (q0) AbstractC1050v.r(DEFAULT_INSTANCE, abstractC1037h, c1043n);
    }

    public static q0 w() {
        return DEFAULT_INSTANCE;
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
                return new com.google.crypto.tink.shaded.protobuf.a0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"kekUri_", "dekTemplate_"});
            case 3:
                return new q0();
            case 4:
                return new K(DEFAULT_INSTANCE, 3);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.W w9 = PARSER;
                if (w9 == null) {
                    synchronized (q0.class) {
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

    public final b0 x() {
        b0 b0Var = this.dekTemplate_;
        if (b0Var == null) {
            return b0.z();
        }
        return b0Var;
    }

    public final String y() {
        return this.kekUri_;
    }

    public final boolean z() {
        if (this.dekTemplate_ != null) {
            return true;
        }
        return false;
    }
}
