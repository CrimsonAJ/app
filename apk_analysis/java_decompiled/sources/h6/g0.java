package h6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1031b;
import com.google.crypto.tink.shaded.protobuf.AbstractC1048t;
import com.google.crypto.tink.shaded.protobuf.AbstractC1050v;
import com.google.crypto.tink.shaded.protobuf.C1039j;
import com.google.crypto.tink.shaded.protobuf.C1043n;
import com.google.crypto.tink.shaded.protobuf.InterfaceC1053y;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import w.AbstractC2128h;

/* loaded from: classes.dex */
public final class g0 extends AbstractC1050v {
    private static final g0 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private InterfaceC1053y key_ = com.google.crypto.tink.shaded.protobuf.Z.f16331d;
    private int primaryKeyId_;

    static {
        g0 g0Var = new g0();
        DEFAULT_INSTANCE = g0Var;
        AbstractC1050v.t(g0.class, g0Var);
    }

    public static d0 C() {
        return (d0) DEFAULT_INSTANCE.h();
    }

    public static g0 D(ByteArrayInputStream byteArrayInputStream, C1043n c1043n) {
        AbstractC1050v s9 = AbstractC1050v.s(DEFAULT_INSTANCE, new C1039j(byteArrayInputStream), c1043n);
        AbstractC1050v.g(s9);
        return (g0) s9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [N3.Z, java.lang.Object] */
    public static g0 E(byte[] bArr, C1043n c1043n) {
        g0 g0Var = DEFAULT_INSTANCE;
        int length = bArr.length;
        AbstractC1050v q9 = g0Var.q();
        try {
            com.google.crypto.tink.shaded.protobuf.Y y9 = com.google.crypto.tink.shaded.protobuf.Y.f16328c;
            y9.getClass();
            com.google.crypto.tink.shaded.protobuf.b0 a5 = y9.a(q9.getClass());
            ?? obj = new Object();
            c1043n.getClass();
            a5.h(q9, bArr, 0, length, obj);
            a5.b(q9);
            AbstractC1050v.g(q9);
            return (g0) q9;
        } catch (com.google.crypto.tink.shaded.protobuf.B e8) {
            if (e8.f16285a) {
                throw new IOException(e8.getMessage(), e8);
            }
            throw e8;
        } catch (com.google.crypto.tink.shaded.protobuf.d0 e9) {
            throw new IOException(e9.getMessage());
        } catch (IOException e10) {
            if (e10.getCause() instanceof com.google.crypto.tink.shaded.protobuf.B) {
                throw ((com.google.crypto.tink.shaded.protobuf.B) e10.getCause());
            }
            throw new IOException(e10.getMessage(), e10);
        } catch (IndexOutOfBoundsException unused) {
            throw com.google.crypto.tink.shaded.protobuf.B.g();
        }
    }

    public static void w(g0 g0Var, int i9) {
        g0Var.primaryKeyId_ = i9;
    }

    public static void x(g0 g0Var, f0 f0Var) {
        int i9;
        g0Var.getClass();
        InterfaceC1053y interfaceC1053y = g0Var.key_;
        if (!((AbstractC1031b) interfaceC1053y).f16338a) {
            int size = interfaceC1053y.size();
            if (size == 0) {
                i9 = 10;
            } else {
                i9 = size * 2;
            }
            g0Var.key_ = interfaceC1053y.h(i9);
        }
        g0Var.key_.add(f0Var);
    }

    public final List A() {
        return this.key_;
    }

    public final int B() {
        return this.primaryKeyId_;
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
                return new com.google.crypto.tink.shaded.protobuf.a0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", f0.class});
            case 3:
                return new g0();
            case 4:
                return new AbstractC1048t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.W w9 = PARSER;
                if (w9 == null) {
                    synchronized (g0.class) {
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

    public final f0 y(int i9) {
        return (f0) this.key_.get(i9);
    }

    public final int z() {
        return this.key_.size();
    }
}
