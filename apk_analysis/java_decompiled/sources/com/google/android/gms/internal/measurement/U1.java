package com.google.android.gms.internal.measurement;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class U1 extends M4.a {

    /* renamed from: n, reason: collision with root package name */
    public static final Logger f15311n = Logger.getLogger(U1.class.getName());

    /* renamed from: o, reason: collision with root package name */
    public static final boolean f15312o = I2.f15228e;
    public C0974o2 j;

    /* renamed from: k, reason: collision with root package name */
    public final byte[] f15313k;

    /* renamed from: l, reason: collision with root package name */
    public final int f15314l;

    /* renamed from: m, reason: collision with root package name */
    public int f15315m;

    public U1(int i9, byte[] bArr) {
        int length = bArr.length;
        if (((length - i9) | i9) >= 0) {
            this.f15313k = bArr;
            this.f15315m = 0;
            this.f15314l = i9;
            return;
        }
        Locale locale = Locale.US;
        throw new IllegalArgumentException(A0.a.l("Array range is invalid. Buffer.length=", length, i9, ", offset=0, length="));
    }

    public static int C(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int R(String str) {
        int length;
        try {
            length = K2.c(str);
        } catch (J2 unused) {
            length = str.getBytes(AbstractC0944i2.f15502a).length;
        }
        return S(length) + length;
    }

    public static int S(int i9) {
        return (352 - (Integer.numberOfLeadingZeros(i9) * 9)) >>> 6;
    }

    public final void D(int i9, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.f15313k, this.f15315m, i9);
            this.f15315m += i9;
        } catch (IndexOutOfBoundsException e8) {
            throw new N3.M(this.f15315m, this.f15314l, i9, e8, 8);
        }
    }

    public final void E(int i9, T1 t12) {
        O((i9 << 3) | 2);
        O(t12.d());
        D(t12.d(), t12.f15299b);
    }

    public final void F(int i9, int i10) {
        O((i9 << 3) | 5);
        G(i10);
    }

    public final void G(int i9) {
        int i10 = this.f15315m;
        try {
            byte[] bArr = this.f15313k;
            bArr[i10] = (byte) i9;
            bArr[i10 + 1] = (byte) (i9 >> 8);
            bArr[i10 + 2] = (byte) (i9 >> 16);
            bArr[i10 + 3] = (byte) (i9 >> 24);
            this.f15315m = i10 + 4;
        } catch (IndexOutOfBoundsException e8) {
            throw new N3.M(i10, this.f15314l, 4, e8, 8);
        }
    }

    public final void H(long j, int i9) {
        O((i9 << 3) | 1);
        I(j);
    }

    public final void I(long j) {
        int i9 = this.f15315m;
        try {
            byte[] bArr = this.f15313k;
            bArr[i9] = (byte) j;
            bArr[i9 + 1] = (byte) (j >> 8);
            bArr[i9 + 2] = (byte) (j >> 16);
            bArr[i9 + 3] = (byte) (j >> 24);
            bArr[i9 + 4] = (byte) (j >> 32);
            bArr[i9 + 5] = (byte) (j >> 40);
            bArr[i9 + 6] = (byte) (j >> 48);
            bArr[i9 + 7] = (byte) (j >> 56);
            this.f15315m = i9 + 8;
        } catch (IndexOutOfBoundsException e8) {
            throw new N3.M(i9, this.f15314l, 8, e8, 8);
        }
    }

    public final void J(int i9, int i10) {
        O(i9 << 3);
        K(i10);
    }

    public final void K(int i9) {
        if (i9 >= 0) {
            O(i9);
        } else {
            Q(i9);
        }
    }

    public final void L(int i9, String str) {
        O((i9 << 3) | 2);
        int i10 = this.f15315m;
        try {
            int S8 = S(str.length() * 3);
            int S9 = S(str.length());
            byte[] bArr = this.f15313k;
            int i11 = this.f15314l;
            if (S9 == S8) {
                int i12 = i10 + S9;
                this.f15315m = i12;
                int b9 = K2.b(i12, i11 - i12, str, bArr);
                this.f15315m = i10;
                O((b9 - i10) - S9);
                this.f15315m = b9;
                return;
            }
            O(K2.c(str));
            int i13 = this.f15315m;
            this.f15315m = K2.b(i13, i11 - i13, str, bArr);
        } catch (J2 e8) {
            this.f15315m = i10;
            f15311n.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e8);
            byte[] bytes = str.getBytes(AbstractC0944i2.f15502a);
            try {
                int length = bytes.length;
                O(length);
                D(length, bytes);
            } catch (IndexOutOfBoundsException e9) {
                throw new N3.M(e9);
            }
        } catch (IndexOutOfBoundsException e10) {
            throw new N3.M(e10);
        }
    }

    public final void M(int i9, int i10) {
        O((i9 << 3) | i10);
    }

    public final void N(int i9, int i10) {
        O(i9 << 3);
        O(i10);
    }

    public final void O(int i9) {
        int i10;
        int i11 = this.f15315m;
        while (true) {
            int i12 = i9 & (-128);
            byte[] bArr = this.f15313k;
            if (i12 == 0) {
                i10 = i11 + 1;
                bArr[i11] = (byte) i9;
                this.f15315m = i10;
                return;
            } else {
                i10 = i11 + 1;
                try {
                    bArr[i11] = (byte) (i9 | 128);
                    i9 >>>= 7;
                    i11 = i10;
                } catch (IndexOutOfBoundsException e8) {
                    throw new N3.M(i10, this.f15314l, 1, e8, 8);
                }
            }
            throw new N3.M(i10, this.f15314l, 1, e8, 8);
        }
    }

    public final void P(long j, int i9) {
        O(i9 << 3);
        Q(j);
    }

    public final void Q(long j) {
        int i9;
        int i10 = this.f15315m;
        byte[] bArr = this.f15313k;
        boolean z9 = f15312o;
        int i11 = this.f15314l;
        if (z9 && i11 - i10 >= 10) {
            long j4 = j;
            while ((j4 & (-128)) != 0) {
                I2.f15226c.d(bArr, I2.f15229f + i10, (byte) (((int) j4) | 128));
                j4 >>>= 7;
                i10++;
            }
            i9 = i10 + 1;
            I2.f15226c.d(bArr, I2.f15229f + i10, (byte) j4);
        } else {
            long j9 = j;
            while ((j9 & (-128)) != 0) {
                i9 = i10 + 1;
                try {
                    bArr[i10] = (byte) (((int) j9) | 128);
                    j9 >>>= 7;
                    i10 = i9;
                } catch (IndexOutOfBoundsException e8) {
                    throw new N3.M(i9, i11, 1, e8, 8);
                }
            }
            i9 = i10 + 1;
            bArr[i10] = (byte) j9;
        }
        this.f15315m = i9;
    }
}
