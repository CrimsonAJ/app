package W5;

import androidx.datastore.preferences.protobuf.C0521g;
import com.google.android.gms.internal.measurement.D1;
import com.google.crypto.tink.shaded.protobuf.B;
import com.google.crypto.tink.shaded.protobuf.C1036g;
import com.google.crypto.tink.shaded.protobuf.C1038i;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public int f7931a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7932b;

    public static int d(int i9) {
        return (-(i9 & 1)) ^ (i9 >>> 1);
    }

    public static long e(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static C1038i h(byte[] bArr, int i9, int i10, boolean z9) {
        C1038i c1038i = new C1038i(bArr, i9, i10, z9);
        try {
            c1038i.l(i10);
            return c1038i;
        } catch (B e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public abstract String A();

    public abstract String B();

    public abstract int C();

    public abstract int D();

    public abstract long E();

    public abstract boolean F(int i9);

    public void G() {
        int C8;
        do {
            C8 = C();
            if (C8 != 0) {
                int i9 = this.f7931a;
                if (i9 < 100) {
                    this.f7931a = i9 + 1;
                    this.f7931a--;
                } else {
                    throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
            } else {
                return;
            }
        } while (F(C8));
    }

    public ByteBuffer a(int i9, byte[] bArr) {
        int[] c3 = c(a.c(bArr), i9);
        int[] iArr = (int[]) c3.clone();
        a.b(iArr);
        for (int i10 = 0; i10 < c3.length; i10++) {
            c3[i10] = c3[i10] + iArr[i10];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(c3, 0, 16);
        return order;
    }

    public abstract void b(int i9);

    public abstract int[] c(int[] iArr, int i9);

    public abstract int f();

    public abstract boolean g();

    public abstract int i();

    public abstract void j(int i9);

    public void k(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length == i()) {
            int remaining = byteBuffer2.remaining();
            int i9 = remaining / 64;
            int i10 = i9 + 1;
            for (int i11 = 0; i11 < i10; i11++) {
                ByteBuffer a5 = a(this.f7931a + i11, bArr);
                if (i11 == i9) {
                    D1.O(byteBuffer, byteBuffer2, a5, remaining % 64);
                } else {
                    D1.O(byteBuffer, byteBuffer2, a5, 64);
                }
            }
            return;
        }
        throw new GeneralSecurityException("The nonce length (in bytes) must be " + i());
    }

    public abstract int l(int i9);

    public abstract boolean m();

    public abstract C0521g n();

    public abstract C1036g o();

    public abstract double p();

    public abstract int q();

    public abstract int r();

    public abstract long s();

    public abstract float t();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract int y();

    public abstract long z();
}
