package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.internal.measurement.D1;
import java.util.logging.Logger;

/* renamed from: com.google.crypto.tink.shaded.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1040k extends D1 {

    /* renamed from: k, reason: collision with root package name */
    public static final Logger f16375k = Logger.getLogger(C1040k.class.getName());

    /* renamed from: l, reason: collision with root package name */
    public static final boolean f16376l = n0.f16389e;

    /* renamed from: g, reason: collision with root package name */
    public K f16377g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f16378h;

    /* renamed from: i, reason: collision with root package name */
    public final int f16379i;
    public int j;

    public C1040k(int i9, byte[] bArr) {
        if (((bArr.length - i9) | i9) >= 0) {
            this.f16378h = bArr;
            this.j = 0;
            this.f16379i = i9;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i9)));
    }

    public static int R(int i9, AbstractC1037h abstractC1037h) {
        return S(abstractC1037h) + Y(i9);
    }

    public static int S(AbstractC1037h abstractC1037h) {
        int size = abstractC1037h.size();
        return Z(size) + size;
    }

    public static int T(int i9) {
        return Y(i9) + 4;
    }

    public static int U(int i9) {
        return Y(i9) + 8;
    }

    public static int V(int i9, AbstractC1030a abstractC1030a, b0 b0Var) {
        return abstractC1030a.a(b0Var) + (Y(i9) * 2);
    }

    public static int W(int i9) {
        if (i9 >= 0) {
            return Z(i9);
        }
        return 10;
    }

    public static int X(String str) {
        int length;
        try {
            length = q0.b(str);
        } catch (p0 unused) {
            length = str.getBytes(AbstractC1054z.f16405a).length;
        }
        return Z(length) + length;
    }

    public static int Y(int i9) {
        return Z(i9 << 3);
    }

    public static int Z(int i9) {
        if ((i9 & (-128)) == 0) {
            return 1;
        }
        if ((i9 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i9) == 0) {
            return 3;
        }
        if ((i9 & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    public static int a0(long j) {
        int i9;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i9 = 6;
        } else {
            i9 = 2;
        }
        if (((-2097152) & j) != 0) {
            i9 += 2;
            j >>>= 14;
        }
        if ((j & (-16384)) != 0) {
            return i9 + 1;
        }
        return i9;
    }

    public final void b0(byte b9) {
        try {
            byte[] bArr = this.f16378h;
            int i9 = this.j;
            this.j = i9 + 1;
            bArr[i9] = b9;
        } catch (IndexOutOfBoundsException e8) {
            throw new N3.M(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(this.f16379i), 1), e8);
        }
    }

    public final void c0(byte[] bArr, int i9, int i10) {
        try {
            System.arraycopy(bArr, i9, this.f16378h, this.j, i10);
            this.j += i10;
        } catch (IndexOutOfBoundsException e8) {
            throw new N3.M(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(this.f16379i), Integer.valueOf(i10)), e8);
        }
    }

    public final void d0(int i9, int i10) {
        i0(i9, 5);
        e0(i10);
    }

    public final void e0(int i9) {
        try {
            byte[] bArr = this.f16378h;
            int i10 = this.j;
            int i11 = i10 + 1;
            this.j = i11;
            bArr[i10] = (byte) (i9 & 255);
            int i12 = i10 + 2;
            this.j = i12;
            bArr[i11] = (byte) ((i9 >> 8) & 255);
            int i13 = i10 + 3;
            this.j = i13;
            bArr[i12] = (byte) ((i9 >> 16) & 255);
            this.j = i10 + 4;
            bArr[i13] = (byte) ((i9 >> 24) & 255);
        } catch (IndexOutOfBoundsException e8) {
            throw new N3.M(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(this.f16379i), 1), e8);
        }
    }

    public final void f0(long j, int i9) {
        i0(i9, 1);
        g0(j);
    }

    public final void g0(long j) {
        try {
            byte[] bArr = this.f16378h;
            int i9 = this.j;
            int i10 = i9 + 1;
            this.j = i10;
            bArr[i9] = (byte) (((int) j) & 255);
            int i11 = i9 + 2;
            this.j = i11;
            bArr[i10] = (byte) (((int) (j >> 8)) & 255);
            int i12 = i9 + 3;
            this.j = i12;
            bArr[i11] = (byte) (((int) (j >> 16)) & 255);
            int i13 = i9 + 4;
            this.j = i13;
            bArr[i12] = (byte) (((int) (j >> 24)) & 255);
            int i14 = i9 + 5;
            this.j = i14;
            bArr[i13] = (byte) (((int) (j >> 32)) & 255);
            int i15 = i9 + 6;
            this.j = i15;
            bArr[i14] = (byte) (((int) (j >> 40)) & 255);
            int i16 = i9 + 7;
            this.j = i16;
            bArr[i15] = (byte) (((int) (j >> 48)) & 255);
            this.j = i9 + 8;
            bArr[i16] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e8) {
            throw new N3.M(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(this.f16379i), 1), e8);
        }
    }

    public final void h0(int i9) {
        if (i9 >= 0) {
            j0(i9);
        } else {
            l0(i9);
        }
    }

    public final void i0(int i9, int i10) {
        j0((i9 << 3) | i10);
    }

    public final void j0(int i9) {
        while (true) {
            int i10 = i9 & (-128);
            byte[] bArr = this.f16378h;
            if (i10 == 0) {
                int i11 = this.j;
                this.j = i11 + 1;
                bArr[i11] = (byte) i9;
                return;
            } else {
                try {
                    int i12 = this.j;
                    this.j = i12 + 1;
                    bArr[i12] = (byte) ((i9 & 127) | 128);
                    i9 >>>= 7;
                } catch (IndexOutOfBoundsException e8) {
                    throw new N3.M(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(this.f16379i), 1), e8);
                }
            }
            throw new N3.M(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(this.f16379i), 1), e8);
        }
    }

    public final void k0(long j, int i9) {
        i0(i9, 0);
        l0(j);
    }

    public final void l0(long j) {
        byte[] bArr = this.f16378h;
        boolean z9 = f16376l;
        int i9 = this.f16379i;
        if (z9 && i9 - this.j >= 10) {
            while ((j & (-128)) != 0) {
                int i10 = this.j;
                this.j = i10 + 1;
                n0.k(bArr, i10, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            int i11 = this.j;
            this.j = 1 + i11;
            n0.k(bArr, i11, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                int i12 = this.j;
                this.j = i12 + 1;
                bArr[i12] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e8) {
                throw new N3.M(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(i9), 1), e8);
            }
        }
        int i13 = this.j;
        this.j = i13 + 1;
        bArr[i13] = (byte) j;
    }
}
