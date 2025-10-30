package h6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1037h;
import com.google.crypto.tink.shaded.protobuf.AbstractC1048t;
import com.google.crypto.tink.shaded.protobuf.AbstractC1050v;
import com.google.crypto.tink.shaded.protobuf.C1036g;
import com.google.crypto.tink.shaded.protobuf.C1039j;
import com.google.crypto.tink.shaded.protobuf.C1043n;
import java.io.ByteArrayInputStream;
import w.AbstractC2128h;

/* loaded from: classes.dex */
public final class N extends AbstractC1050v {
    private static final N DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER;
    private AbstractC1037h encryptedKeyset_ = AbstractC1037h.f16356b;
    private k0 keysetInfo_;

    static {
        N n7 = new N();
        DEFAULT_INSTANCE = n7;
        AbstractC1050v.t(N.class, n7);
    }

    public static N A(ByteArrayInputStream byteArrayInputStream, C1043n c1043n) {
        AbstractC1050v s9 = AbstractC1050v.s(DEFAULT_INSTANCE, new C1039j(byteArrayInputStream), c1043n);
        AbstractC1050v.g(s9);
        return (N) s9;
    }

    public static void w(N n7, C1036g c1036g) {
        n7.getClass();
        n7.encryptedKeyset_ = c1036g;
    }

    public static void x(N n7, k0 k0Var) {
        n7.getClass();
        n7.keysetInfo_ = k0Var;
    }

    public static M z() {
        return (M) DEFAULT_INSTANCE.h();
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
                return new com.google.crypto.tink.shaded.protobuf.a0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 3:
                return new N();
            case 4:
                return new AbstractC1048t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.W w9 = PARSER;
                if (w9 == null) {
                    synchronized (N.class) {
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

    public final AbstractC1037h y() {
        return this.encryptedKeyset_;
    }
}
