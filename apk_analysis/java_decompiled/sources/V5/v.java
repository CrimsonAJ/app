package V5;

import G0.H;
import a6.C0502b;
import com.google.crypto.tink.shaded.protobuf.AbstractC1030a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1037h;
import com.google.crypto.tink.shaded.protobuf.B;
import com.google.crypto.tink.shaded.protobuf.C1036g;
import h6.b0;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class v implements U5.a {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f7787c = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final b0 f7788a;

    /* renamed from: b, reason: collision with root package name */
    public final C0502b f7789b;

    public v(b0 b0Var, C0502b c0502b) {
        this.f7788a = b0Var;
        this.f7789b = c0502b;
    }

    @Override // U5.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        AbstractC1030a X8;
        b0 b0Var = this.f7788a;
        AtomicReference atomicReference = U5.n.f7516a;
        synchronized (U5.n.class) {
            try {
                H h7 = ((U5.e) U5.n.f7516a.get()).a(b0Var.B()).f7496a;
                Class cls = (Class) h7.f2665c;
                if (!((Map) h7.f2664b).keySet().contains(cls) && !Void.class.equals(cls)) {
                    throw new IllegalArgumentException("Given internalKeyMananger " + h7.toString() + " does not support primitive class " + cls.getName());
                }
                if (((Boolean) U5.n.f7518c.get(b0Var.B())).booleanValue()) {
                    AbstractC1037h C8 = b0Var.C();
                    try {
                        D.n f9 = h7.f();
                        AbstractC1030a f02 = f9.f0(C8);
                        f9.k0(f02);
                        X8 = f9.X(f02);
                    } catch (B e8) {
                        throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) h7.f().f1707a).getName()), e8);
                    }
                } else {
                    throw new GeneralSecurityException("newKey-operation not permitted for key type " + b0Var.B());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        byte[] e9 = X8.e();
        byte[] a5 = this.f7789b.a(e9, f7787c);
        byte[] a9 = ((U5.a) U5.n.c(this.f7788a.B(), AbstractC1037h.d(e9, 0, e9.length), U5.a.class)).a(bArr, bArr2);
        return ByteBuffer.allocate(a5.length + 4 + a9.length).putInt(a5.length).put(a5).put(a9).array();
    }

    @Override // U5.a
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i9 = wrap.getInt();
            if (i9 > 0 && i9 <= bArr.length - 4) {
                byte[] bArr3 = new byte[i9];
                wrap.get(bArr3, 0, i9);
                byte[] bArr4 = new byte[wrap.remaining()];
                wrap.get(bArr4, 0, wrap.remaining());
                byte[] b9 = this.f7789b.b(bArr3, f7787c);
                String B9 = this.f7788a.B();
                AtomicReference atomicReference = U5.n.f7516a;
                C1036g c1036g = AbstractC1037h.f16356b;
                return ((U5.a) U5.n.c(B9, AbstractC1037h.d(b9, 0, b9.length), U5.a.class)).b(bArr4, bArr2);
            }
            throw new GeneralSecurityException("invalid ciphertext");
        } catch (IndexOutOfBoundsException e8) {
            e = e8;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e9) {
            e = e9;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e10) {
            e = e10;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
