package h6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1031b;
import com.google.crypto.tink.shaded.protobuf.AbstractC1048t;
import com.google.crypto.tink.shaded.protobuf.AbstractC1050v;
import com.google.crypto.tink.shaded.protobuf.InterfaceC1053y;
import w.AbstractC2128h;

/* loaded from: classes.dex */
public final class k0 extends AbstractC1050v {
    private static final k0 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private InterfaceC1053y keyInfo_ = com.google.crypto.tink.shaded.protobuf.Z.f16331d;
    private int primaryKeyId_;

    static {
        k0 k0Var = new k0();
        DEFAULT_INSTANCE = k0Var;
        AbstractC1050v.t(k0.class, k0Var);
    }

    public static void w(k0 k0Var, int i9) {
        k0Var.primaryKeyId_ = i9;
    }

    public static void x(k0 k0Var, j0 j0Var) {
        int i9;
        k0Var.getClass();
        InterfaceC1053y interfaceC1053y = k0Var.keyInfo_;
        if (!((AbstractC1031b) interfaceC1053y).f16338a) {
            int size = interfaceC1053y.size();
            if (size == 0) {
                i9 = 10;
            } else {
                i9 = size * 2;
            }
            k0Var.keyInfo_ = interfaceC1053y.h(i9);
        }
        k0Var.keyInfo_.add(j0Var);
    }

    public static h0 z() {
        return (h0) DEFAULT_INSTANCE.h();
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
                return new com.google.crypto.tink.shaded.protobuf.a0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", j0.class});
            case 3:
                return new k0();
            case 4:
                return new AbstractC1048t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.W w9 = PARSER;
                if (w9 == null) {
                    synchronized (k0.class) {
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

    public final j0 y() {
        return (j0) this.keyInfo_.get(0);
    }
}
