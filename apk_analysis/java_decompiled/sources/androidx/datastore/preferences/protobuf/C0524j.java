package androidx.datastore.preferences.protobuf;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0524j extends Z0.a {

    /* renamed from: n, reason: collision with root package name */
    public static final Logger f9726n = Logger.getLogger(C0524j.class.getName());

    /* renamed from: o, reason: collision with root package name */
    public static final boolean f9727o = g0.f9708e;

    /* renamed from: i, reason: collision with root package name */
    public C f9728i;
    public final byte[] j;

    /* renamed from: k, reason: collision with root package name */
    public final int f9729k;

    /* renamed from: l, reason: collision with root package name */
    public int f9730l;

    /* renamed from: m, reason: collision with root package name */
    public final OutputStream f9731m;

    public C0524j(OutputStream outputStream, int i9) {
        if (i9 >= 0) {
            int max = Math.max(i9, 20);
            this.j = new byte[max];
            this.f9729k = max;
            if (outputStream != null) {
                this.f9731m = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    public static int J(int i9, C0521g c0521g) {
        int L8 = L(i9);
        int size = c0521g.size();
        return M(size) + size + L8;
    }

    public static int K(String str) {
        int length;
        try {
            length = j0.a(str);
        } catch (i0 unused) {
            length = str.getBytes(AbstractC0535v.f9765a).length;
        }
        return M(length) + length;
    }

    public static int L(int i9) {
        return M(i9 << 3);
    }

    public static int M(int i9) {
        return (352 - (Integer.numberOfLeadingZeros(i9) * 9)) >>> 6;
    }

    public static int N(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    @Override // Z0.a
    public final void C(byte[] bArr, int i9, int i10) {
        R(bArr, i9, i10);
    }

    public final void E(int i9) {
        int i10 = this.f9730l;
        int i11 = i10 + 1;
        this.f9730l = i11;
        byte[] bArr = this.j;
        bArr[i10] = (byte) (i9 & 255);
        int i12 = i10 + 2;
        this.f9730l = i12;
        bArr[i11] = (byte) ((i9 >> 8) & 255);
        int i13 = i10 + 3;
        this.f9730l = i13;
        bArr[i12] = (byte) ((i9 >> 16) & 255);
        this.f9730l = i10 + 4;
        bArr[i13] = (byte) ((i9 >> 24) & 255);
    }

    public final void F(long j) {
        int i9 = this.f9730l;
        int i10 = i9 + 1;
        this.f9730l = i10;
        byte[] bArr = this.j;
        bArr[i9] = (byte) (j & 255);
        int i11 = i9 + 2;
        this.f9730l = i11;
        bArr[i10] = (byte) ((j >> 8) & 255);
        int i12 = i9 + 3;
        this.f9730l = i12;
        bArr[i11] = (byte) ((j >> 16) & 255);
        int i13 = i9 + 4;
        this.f9730l = i13;
        bArr[i12] = (byte) (255 & (j >> 24));
        int i14 = i9 + 5;
        this.f9730l = i14;
        bArr[i13] = (byte) (((int) (j >> 32)) & 255);
        int i15 = i9 + 6;
        this.f9730l = i15;
        bArr[i14] = (byte) (((int) (j >> 40)) & 255);
        int i16 = i9 + 7;
        this.f9730l = i16;
        bArr[i15] = (byte) (((int) (j >> 48)) & 255);
        this.f9730l = i9 + 8;
        bArr[i16] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void G(int i9, int i10) {
        H((i9 << 3) | i10);
    }

    public final void H(int i9) {
        boolean z9 = f9727o;
        byte[] bArr = this.j;
        if (z9) {
            while ((i9 & (-128)) != 0) {
                int i10 = this.f9730l;
                this.f9730l = i10 + 1;
                g0.j(bArr, i10, (byte) ((i9 | 128) & 255));
                i9 >>>= 7;
            }
            int i11 = this.f9730l;
            this.f9730l = i11 + 1;
            g0.j(bArr, i11, (byte) i9);
            return;
        }
        while ((i9 & (-128)) != 0) {
            int i12 = this.f9730l;
            this.f9730l = i12 + 1;
            bArr[i12] = (byte) ((i9 | 128) & 255);
            i9 >>>= 7;
        }
        int i13 = this.f9730l;
        this.f9730l = i13 + 1;
        bArr[i13] = (byte) i9;
    }

    public final void I(long j) {
        boolean z9 = f9727o;
        byte[] bArr = this.j;
        if (z9) {
            while ((j & (-128)) != 0) {
                int i9 = this.f9730l;
                this.f9730l = i9 + 1;
                g0.j(bArr, i9, (byte) ((((int) j) | 128) & 255));
                j >>>= 7;
            }
            int i10 = this.f9730l;
            this.f9730l = i10 + 1;
            g0.j(bArr, i10, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i11 = this.f9730l;
            this.f9730l = i11 + 1;
            bArr[i11] = (byte) ((((int) j) | 128) & 255);
            j >>>= 7;
        }
        int i12 = this.f9730l;
        this.f9730l = i12 + 1;
        bArr[i12] = (byte) j;
    }

    public final void O() {
        this.f9731m.write(this.j, 0, this.f9730l);
        this.f9730l = 0;
    }

    public final void P(int i9) {
        if (this.f9729k - this.f9730l < i9) {
            O();
        }
    }

    public final void Q(byte b9) {
        if (this.f9730l == this.f9729k) {
            O();
        }
        int i9 = this.f9730l;
        this.f9730l = i9 + 1;
        this.j[i9] = b9;
    }

    public final void R(byte[] bArr, int i9, int i10) {
        int i11 = this.f9730l;
        int i12 = this.f9729k;
        int i13 = i12 - i11;
        byte[] bArr2 = this.j;
        if (i13 >= i10) {
            System.arraycopy(bArr, i9, bArr2, i11, i10);
            this.f9730l += i10;
            return;
        }
        System.arraycopy(bArr, i9, bArr2, i11, i13);
        int i14 = i9 + i13;
        int i15 = i10 - i13;
        this.f9730l = i12;
        O();
        if (i15 <= i12) {
            System.arraycopy(bArr, i14, bArr2, 0, i15);
            this.f9730l = i15;
        } else {
            this.f9731m.write(bArr, i14, i15);
        }
    }

    public final void S(int i9, boolean z9) {
        P(11);
        G(i9, 0);
        byte b9 = z9 ? (byte) 1 : (byte) 0;
        int i10 = this.f9730l;
        this.f9730l = i10 + 1;
        this.j[i10] = b9;
    }

    public final void T(int i9, C0521g c0521g) {
        e0(i9, 2);
        U(c0521g);
    }

    public final void U(C0521g c0521g) {
        g0(c0521g.size());
        C(c0521g.f9703b, c0521g.f(), c0521g.size());
    }

    public final void V(int i9, int i10) {
        P(14);
        G(i9, 5);
        E(i10);
    }

    public final void W(int i9) {
        P(4);
        E(i9);
    }

    public final void X(long j, int i9) {
        P(18);
        G(i9, 1);
        F(j);
    }

    public final void Y(long j) {
        P(8);
        F(j);
    }

    public final void Z(int i9, int i10) {
        P(20);
        G(i9, 0);
        if (i10 >= 0) {
            H(i10);
        } else {
            I(i10);
        }
    }

    public final void a0(int i9) {
        if (i9 >= 0) {
            g0(i9);
        } else {
            i0(i9);
        }
    }

    public final void b0(int i9, AbstractC0515a abstractC0515a, T t7) {
        e0(i9, 2);
        g0(abstractC0515a.a(t7));
        t7.f(abstractC0515a, this.f9728i);
    }

    public final void c0(int i9, String str) {
        e0(i9, 2);
        d0(str);
    }

    public final void d0(String str) {
        try {
            int length = str.length() * 3;
            int M7 = M(length);
            int i9 = M7 + length;
            int i10 = this.f9729k;
            if (i9 > i10) {
                byte[] bArr = new byte[length];
                int n7 = j0.f9732a.n(0, length, str, bArr);
                g0(n7);
                R(bArr, 0, n7);
                return;
            }
            if (i9 > i10 - this.f9730l) {
                O();
            }
            int M8 = M(str.length());
            int i11 = this.f9730l;
            byte[] bArr2 = this.j;
            try {
                if (M8 == M7) {
                    int i12 = i11 + M8;
                    this.f9730l = i12;
                    int n9 = j0.f9732a.n(i12, i10 - i12, str, bArr2);
                    this.f9730l = i11;
                    H((n9 - i11) - M8);
                    this.f9730l = n9;
                } else {
                    int a5 = j0.a(str);
                    H(a5);
                    this.f9730l = j0.f9732a.n(this.f9730l, a5, str, bArr2);
                }
            } catch (i0 e8) {
                this.f9730l = i11;
                throw e8;
            } catch (ArrayIndexOutOfBoundsException e9) {
                throw new N3.M(e9);
            }
        } catch (i0 e10) {
            f9726n.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
            byte[] bytes = str.getBytes(AbstractC0535v.f9765a);
            try {
                g0(bytes.length);
                C(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e11) {
                throw new N3.M(e11);
            }
        }
    }

    public final void e0(int i9, int i10) {
        g0((i9 << 3) | i10);
    }

    public final void f0(int i9, int i10) {
        P(20);
        G(i9, 0);
        H(i10);
    }

    public final void g0(int i9) {
        P(5);
        H(i9);
    }

    public final void h0(long j, int i9) {
        P(20);
        G(i9, 0);
        I(j);
    }

    public final void i0(long j) {
        P(10);
        I(j);
    }
}
