package com.google.android.gms.internal.cast;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class J2 extends J {

    /* renamed from: h, reason: collision with root package name */
    public static final Logger f14732h = Logger.getLogger(J2.class.getName());

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f14733i = o3.f14939e;

    /* renamed from: d, reason: collision with root package name */
    public W2 f14734d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f14735e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14736f;

    /* renamed from: g, reason: collision with root package name */
    public int f14737g;

    public J2(int i9, byte[] bArr) {
        super(12);
        int length = bArr.length;
        if (((length - i9) | i9) >= 0) {
            this.f14735e = bArr;
            this.f14737g = 0;
            this.f14736f = i9;
            return;
        }
        Locale locale = Locale.US;
        throw new IllegalArgumentException(A0.a.l("Array range is invalid. Buffer.length=", length, i9, ", offset=0, length="));
    }

    public static int I(String str) {
        int length;
        try {
            length = q3.b(str);
        } catch (p3 unused) {
            length = str.getBytes(S2.f14762a).length;
        }
        return J(length) + length;
    }

    public static int J(int i9) {
        return (352 - (Integer.numberOfLeadingZeros(i9) * 9)) >>> 6;
    }

    public static int t(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void A(int i9, int i10) {
        F(i9 << 3);
        B(i10);
    }

    public final void B(int i9) {
        if (i9 >= 0) {
            F(i9);
        } else {
            H(i9);
        }
    }

    public final void C(int i9, String str) {
        F((i9 << 3) | 2);
        int i10 = this.f14737g;
        try {
            int J8 = J(str.length() * 3);
            int J9 = J(str.length());
            byte[] bArr = this.f14735e;
            int i11 = this.f14736f;
            if (J9 == J8) {
                int i12 = i10 + J9;
                this.f14737g = i12;
                int a5 = q3.a(i12, i11 - i12, str, bArr);
                this.f14737g = i10;
                F((a5 - i10) - J9);
                this.f14737g = a5;
                return;
            }
            F(q3.b(str));
            int i13 = this.f14737g;
            this.f14737g = q3.a(i13, i11 - i13, str, bArr);
        } catch (p3 e8) {
            this.f14737g = i10;
            f14732h.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e8);
            byte[] bytes = str.getBytes(S2.f14762a);
            try {
                int length = bytes.length;
                F(length);
                u(length, bytes);
            } catch (IndexOutOfBoundsException e9) {
                throw new N3.M(e9);
            }
        } catch (IndexOutOfBoundsException e10) {
            throw new N3.M(e10);
        }
    }

    public final void D(int i9, int i10) {
        F((i9 << 3) | i10);
    }

    public final void E(int i9, int i10) {
        F(i9 << 3);
        F(i10);
    }

    public final void F(int i9) {
        int i10;
        int i11 = this.f14737g;
        while (true) {
            int i12 = i9 & (-128);
            byte[] bArr = this.f14735e;
            if (i12 == 0) {
                i10 = i11 + 1;
                bArr[i11] = (byte) i9;
                this.f14737g = i10;
                return;
            } else {
                i10 = i11 + 1;
                try {
                    bArr[i11] = (byte) (i9 | 128);
                    i9 >>>= 7;
                    i11 = i10;
                } catch (IndexOutOfBoundsException e8) {
                    throw new N3.M(i10, this.f14736f, 1, e8, 7);
                }
            }
            throw new N3.M(i10, this.f14736f, 1, e8, 7);
        }
    }

    public final void G(long j, int i9) {
        F(i9 << 3);
        H(j);
    }

    public final void H(long j) {
        int i9;
        int i10 = this.f14737g;
        byte[] bArr = this.f14735e;
        boolean z9 = f14733i;
        int i11 = this.f14736f;
        if (z9 && i11 - i10 >= 10) {
            long j4 = j;
            while ((j4 & (-128)) != 0) {
                o3.f14937c.d(bArr, o3.f14940f + i10, (byte) (((int) j4) | 128));
                j4 >>>= 7;
                i10++;
            }
            i9 = i10 + 1;
            o3.f14937c.d(bArr, o3.f14940f + i10, (byte) j4);
        } else {
            long j9 = j;
            while ((j9 & (-128)) != 0) {
                i9 = i10 + 1;
                try {
                    bArr[i10] = (byte) (((int) j9) | 128);
                    j9 >>>= 7;
                    i10 = i9;
                } catch (IndexOutOfBoundsException e8) {
                    throw new N3.M(i9, i11, 1, e8, 7);
                }
            }
            i9 = i10 + 1;
            bArr[i10] = (byte) j9;
        }
        this.f14737g = i9;
    }

    public final void u(int i9, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.f14735e, this.f14737g, i9);
            this.f14737g += i9;
        } catch (IndexOutOfBoundsException e8) {
            throw new N3.M(this.f14737g, this.f14736f, i9, e8, 7);
        }
    }

    public final void v(int i9, I2 i22) {
        F((i9 << 3) | 2);
        F(i22.d());
        u(i22.d(), i22.f14728b);
    }

    public final void w(int i9, int i10) {
        F((i9 << 3) | 5);
        x(i10);
    }

    public final void x(int i9) {
        int i10 = this.f14737g;
        try {
            byte[] bArr = this.f14735e;
            bArr[i10] = (byte) i9;
            bArr[i10 + 1] = (byte) (i9 >> 8);
            bArr[i10 + 2] = (byte) (i9 >> 16);
            bArr[i10 + 3] = (byte) (i9 >> 24);
            this.f14737g = i10 + 4;
        } catch (IndexOutOfBoundsException e8) {
            throw new N3.M(i10, this.f14736f, 4, e8, 7);
        }
    }

    public final void y(long j, int i9) {
        F((i9 << 3) | 1);
        z(j);
    }

    public final void z(long j) {
        int i9 = this.f14737g;
        try {
            byte[] bArr = this.f14735e;
            bArr[i9] = (byte) j;
            bArr[i9 + 1] = (byte) (j >> 8);
            bArr[i9 + 2] = (byte) (j >> 16);
            bArr[i9 + 3] = (byte) (j >> 24);
            bArr[i9 + 4] = (byte) (j >> 32);
            bArr[i9 + 5] = (byte) (j >> 40);
            bArr[i9 + 6] = (byte) (j >> 48);
            bArr[i9 + 7] = (byte) (j >> 56);
            this.f14737g = i9 + 8;
        } catch (IndexOutOfBoundsException e8) {
            throw new N3.M(i9, this.f14736f, 8, e8, 7);
        }
    }
}
