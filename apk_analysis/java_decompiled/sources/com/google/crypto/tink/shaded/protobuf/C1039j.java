package com.google.crypto.tink.shaded.protobuf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* renamed from: com.google.crypto.tink.shaded.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1039j extends W5.d {

    /* renamed from: c, reason: collision with root package name */
    public final ByteArrayInputStream f16368c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f16369d;

    /* renamed from: e, reason: collision with root package name */
    public int f16370e;

    /* renamed from: f, reason: collision with root package name */
    public int f16371f;

    /* renamed from: g, reason: collision with root package name */
    public int f16372g;

    /* renamed from: h, reason: collision with root package name */
    public int f16373h;

    /* renamed from: i, reason: collision with root package name */
    public int f16374i;
    public int j = Integer.MAX_VALUE;

    public C1039j(ByteArrayInputStream byteArrayInputStream) {
        Charset charset = AbstractC1054z.f16405a;
        this.f16368c = byteArrayInputStream;
        this.f16369d = new byte[4096];
        this.f16370e = 0;
        this.f16372g = 0;
        this.f16374i = 0;
    }

    @Override // W5.d
    public final String A() {
        int M7 = M();
        byte[] bArr = this.f16369d;
        if (M7 > 0) {
            int i9 = this.f16370e;
            int i10 = this.f16372g;
            if (M7 <= i9 - i10) {
                String str = new String(bArr, i10, M7, AbstractC1054z.f16405a);
                this.f16372g += M7;
                return str;
            }
        }
        if (M7 == 0) {
            return "";
        }
        if (M7 <= this.f16370e) {
            Q(M7);
            String str2 = new String(bArr, this.f16372g, M7, AbstractC1054z.f16405a);
            this.f16372g += M7;
            return str2;
        }
        return new String(H(M7), AbstractC1054z.f16405a);
    }

    @Override // W5.d
    public final String B() {
        int M7 = M();
        int i9 = this.f16372g;
        int i10 = this.f16370e;
        int i11 = i10 - i9;
        byte[] bArr = this.f16369d;
        if (M7 <= i11 && M7 > 0) {
            this.f16372g = i9 + M7;
        } else {
            if (M7 == 0) {
                return "";
            }
            i9 = 0;
            if (M7 <= i10) {
                Q(M7);
                this.f16372g = M7;
            } else {
                bArr = H(M7);
            }
        }
        return q0.f16400a.t(bArr, i9, M7);
    }

    @Override // W5.d
    public final int C() {
        if (g()) {
            this.f16373h = 0;
            return 0;
        }
        int M7 = M();
        this.f16373h = M7;
        if ((M7 >>> 3) != 0) {
            return M7;
        }
        throw B.a();
    }

    @Override // W5.d
    public final int D() {
        return M();
    }

    @Override // W5.d
    public final long E() {
        return N();
    }

    public final byte[] H(int i9) {
        byte[] I4 = I(i9);
        if (I4 != null) {
            return I4;
        }
        int i10 = this.f16372g;
        int i11 = this.f16370e;
        int i12 = i11 - i10;
        this.f16374i += i11;
        this.f16372g = 0;
        this.f16370e = 0;
        ArrayList J8 = J(i9 - i12);
        byte[] bArr = new byte[i9];
        System.arraycopy(this.f16369d, i10, bArr, 0, i12);
        int size = J8.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = J8.get(i13);
            i13++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, i12, bArr2.length);
            i12 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] I(int i9) {
        if (i9 == 0) {
            return AbstractC1054z.f16406b;
        }
        if (i9 >= 0) {
            int i10 = this.f16374i;
            int i11 = this.f16372g;
            int i12 = i10 + i11 + i9;
            if (i12 - Integer.MAX_VALUE <= 0) {
                int i13 = this.j;
                if (i12 <= i13) {
                    int i14 = this.f16370e - i11;
                    int i15 = i9 - i14;
                    ByteArrayInputStream byteArrayInputStream = this.f16368c;
                    if (i15 >= 4096) {
                        try {
                            if (i15 > byteArrayInputStream.available()) {
                                return null;
                            }
                        } catch (B e8) {
                            e8.f16285a = true;
                            throw e8;
                        }
                    }
                    byte[] bArr = new byte[i9];
                    System.arraycopy(this.f16369d, this.f16372g, bArr, 0, i14);
                    this.f16374i += this.f16370e;
                    this.f16372g = 0;
                    this.f16370e = 0;
                    while (i14 < i9) {
                        try {
                            int read = byteArrayInputStream.read(bArr, i14, i9 - i14);
                            if (read != -1) {
                                this.f16374i += read;
                                i14 += read;
                            } else {
                                throw B.g();
                            }
                        } catch (B e9) {
                            e9.f16285a = true;
                            throw e9;
                        }
                    }
                    return bArr;
                }
                R((i13 - i10) - i11);
                throw B.g();
            }
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw B.e();
    }

    public final ArrayList J(int i9) {
        ArrayList arrayList = new ArrayList();
        while (i9 > 0) {
            int min = Math.min(i9, 4096);
            byte[] bArr = new byte[min];
            int i10 = 0;
            while (i10 < min) {
                int read = this.f16368c.read(bArr, i10, min - i10);
                if (read != -1) {
                    this.f16374i += read;
                    i10 += read;
                } else {
                    throw B.g();
                }
            }
            i9 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int K() {
        int i9 = this.f16372g;
        if (this.f16370e - i9 < 4) {
            Q(4);
            i9 = this.f16372g;
        }
        this.f16372g = i9 + 4;
        byte[] bArr = this.f16369d;
        return ((bArr[i9 + 3] & 255) << 24) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16);
    }

    public final long L() {
        int i9 = this.f16372g;
        if (this.f16370e - i9 < 8) {
            Q(8);
            i9 = this.f16372g;
        }
        this.f16372g = i9 + 8;
        byte[] bArr = this.f16369d;
        return ((bArr[i9 + 7] & 255) << 56) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16) | ((bArr[i9 + 3] & 255) << 24) | ((bArr[i9 + 4] & 255) << 32) | ((bArr[i9 + 5] & 255) << 40) | ((bArr[i9 + 6] & 255) << 48);
    }

    public final int M() {
        int i9;
        int i10 = this.f16372g;
        int i11 = this.f16370e;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f16369d;
            byte b9 = bArr[i10];
            if (b9 >= 0) {
                this.f16372g = i12;
                return b9;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b9;
                if (i14 < 0) {
                    i9 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        i9 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            i9 = (-2080896) ^ i18;
                        } else {
                            i15 = i10 + 5;
                            byte b10 = bArr[i17];
                            int i19 = (i18 ^ (b10 << 28)) ^ 266354560;
                            if (b10 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i9 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i9 = i19;
                            }
                            i9 = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.f16372g = i13;
                return i9;
            }
        }
        return (int) O();
    }

    public final long N() {
        long j;
        long j4;
        long j9;
        long j10;
        int i9 = this.f16372g;
        int i10 = this.f16370e;
        if (i10 != i9) {
            int i11 = i9 + 1;
            byte[] bArr = this.f16369d;
            byte b9 = bArr[i9];
            if (b9 >= 0) {
                this.f16372g = i11;
                return b9;
            }
            if (i10 - i11 >= 9) {
                int i12 = i9 + 2;
                int i13 = (bArr[i11] << 7) ^ b9;
                if (i13 < 0) {
                    j = i13 ^ (-128);
                } else {
                    int i14 = i9 + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        j = i15 ^ 16256;
                        i12 = i14;
                    } else {
                        int i16 = i9 + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            j10 = (-2080896) ^ i17;
                        } else {
                            long j11 = i17;
                            i12 = i9 + 5;
                            long j12 = j11 ^ (bArr[i16] << 28);
                            if (j12 >= 0) {
                                j9 = 266354560;
                            } else {
                                i16 = i9 + 6;
                                long j13 = j12 ^ (bArr[i12] << 35);
                                if (j13 < 0) {
                                    j4 = -34093383808L;
                                } else {
                                    i12 = i9 + 7;
                                    j12 = j13 ^ (bArr[i16] << 42);
                                    if (j12 >= 0) {
                                        j9 = 4363953127296L;
                                    } else {
                                        i16 = i9 + 8;
                                        j13 = j12 ^ (bArr[i12] << 49);
                                        if (j13 < 0) {
                                            j4 = -558586000294016L;
                                        } else {
                                            i12 = i9 + 9;
                                            long j14 = (j13 ^ (bArr[i16] << 56)) ^ 71499008037633920L;
                                            if (j14 < 0) {
                                                int i18 = i9 + 10;
                                                if (bArr[i12] >= 0) {
                                                    i12 = i18;
                                                }
                                            }
                                            j = j14;
                                        }
                                    }
                                }
                                j10 = j4 ^ j13;
                            }
                            j = j9 ^ j12;
                        }
                        i12 = i16;
                        j = j10;
                    }
                }
                this.f16372g = i12;
                return j;
            }
        }
        return O();
    }

    public final long O() {
        long j = 0;
        for (int i9 = 0; i9 < 64; i9 += 7) {
            if (this.f16372g == this.f16370e) {
                Q(1);
            }
            int i10 = this.f16372g;
            this.f16372g = i10 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i9;
            if ((this.f16369d[i10] & 128) == 0) {
                return j;
            }
        }
        throw B.d();
    }

    public final void P() {
        int i9 = this.f16370e + this.f16371f;
        this.f16370e = i9;
        int i10 = this.f16374i + i9;
        int i11 = this.j;
        if (i10 > i11) {
            int i12 = i10 - i11;
            this.f16371f = i12;
            this.f16370e = i9 - i12;
            return;
        }
        this.f16371f = 0;
    }

    public final void Q(int i9) {
        if (!S(i9)) {
            if (i9 > (Integer.MAX_VALUE - this.f16374i) - this.f16372g) {
                throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw B.g();
        }
    }

    public final void R(int i9) {
        int i10 = this.f16370e;
        int i11 = this.f16372g;
        int i12 = i10 - i11;
        if (i9 <= i12 && i9 >= 0) {
            this.f16372g = i11 + i9;
            return;
        }
        ByteArrayInputStream byteArrayInputStream = this.f16368c;
        if (i9 >= 0) {
            int i13 = this.f16374i;
            int i14 = i13 + i11;
            int i15 = i14 + i9;
            int i16 = this.j;
            if (i15 <= i16) {
                this.f16374i = i14;
                this.f16370e = 0;
                this.f16372g = 0;
                while (i12 < i9) {
                    long j = i9 - i12;
                    try {
                        try {
                            long skip = byteArrayInputStream.skip(j);
                            if (skip >= 0 && skip <= j) {
                                if (skip == 0) {
                                    break;
                                } else {
                                    i12 += (int) skip;
                                }
                            } else {
                                throw new IllegalStateException(byteArrayInputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            }
                        } catch (B e8) {
                            e8.f16285a = true;
                            throw e8;
                        }
                    } catch (Throwable th) {
                        this.f16374i += i12;
                        P();
                        throw th;
                    }
                }
                this.f16374i += i12;
                P();
                if (i12 < i9) {
                    int i17 = this.f16370e;
                    int i18 = i17 - this.f16372g;
                    this.f16372g = i17;
                    Q(1);
                    while (true) {
                        int i19 = i9 - i18;
                        int i20 = this.f16370e;
                        if (i19 > i20) {
                            i18 += i20;
                            this.f16372g = i20;
                            Q(1);
                        } else {
                            this.f16372g = i19;
                            return;
                        }
                    }
                }
            } else {
                R((i16 - i13) - i11);
                throw B.g();
            }
        } else {
            throw B.e();
        }
    }

    public final boolean S(int i9) {
        int i10 = this.f16372g;
        int i11 = i10 + i9;
        int i12 = this.f16370e;
        if (i11 > i12) {
            int i13 = this.f16374i;
            if (i9 <= (Integer.MAX_VALUE - i13) - i10 && i13 + i10 + i9 <= this.j) {
                byte[] bArr = this.f16369d;
                if (i10 > 0) {
                    if (i12 > i10) {
                        System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                    }
                    this.f16374i += i10;
                    this.f16370e -= i10;
                    this.f16372g = 0;
                }
                int i14 = this.f16370e;
                int min = Math.min(bArr.length - i14, (Integer.MAX_VALUE - this.f16374i) - i14);
                ByteArrayInputStream byteArrayInputStream = this.f16368c;
                try {
                    int read = byteArrayInputStream.read(bArr, i14, min);
                    if (read != 0 && read >= -1 && read <= bArr.length) {
                        if (read > 0) {
                            this.f16370e += read;
                            P();
                            if (this.f16370e >= i9) {
                                return true;
                            }
                            return S(i9);
                        }
                    } else {
                        throw new IllegalStateException(byteArrayInputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                    }
                } catch (B e8) {
                    e8.f16285a = true;
                    throw e8;
                }
            }
            return false;
        }
        throw new IllegalStateException(A0.a.m("refillBuffer() called when ", i9, " bytes were already available in buffer"));
    }

    @Override // W5.d
    public final void b(int i9) {
        if (this.f16373h == i9) {
        } else {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // W5.d
    public final int f() {
        return this.f16374i + this.f16372g;
    }

    @Override // W5.d
    public final boolean g() {
        if (this.f16372g == this.f16370e && !S(1)) {
            return true;
        }
        return false;
    }

    @Override // W5.d
    public final void j(int i9) {
        this.j = i9;
        P();
    }

    @Override // W5.d
    public final int l(int i9) {
        if (i9 >= 0) {
            int i10 = this.f16374i + this.f16372g + i9;
            int i11 = this.j;
            if (i10 <= i11) {
                this.j = i10;
                P();
                return i11;
            }
            throw B.g();
        }
        throw B.e();
    }

    @Override // W5.d
    public final boolean m() {
        if (N() != 0) {
            return true;
        }
        return false;
    }

    @Override // W5.d
    public final C1036g o() {
        int M7 = M();
        int i9 = this.f16370e;
        int i10 = this.f16372g;
        int i11 = i9 - i10;
        byte[] bArr = this.f16369d;
        if (M7 <= i11 && M7 > 0) {
            C1036g d9 = AbstractC1037h.d(bArr, i10, M7);
            this.f16372g += M7;
            return d9;
        }
        if (M7 == 0) {
            return AbstractC1037h.f16356b;
        }
        byte[] I4 = I(M7);
        if (I4 != null) {
            return AbstractC1037h.d(I4, 0, I4.length);
        }
        int i12 = this.f16372g;
        int i13 = this.f16370e;
        int i14 = i13 - i12;
        this.f16374i += i13;
        this.f16372g = 0;
        this.f16370e = 0;
        ArrayList J8 = J(M7 - i14);
        byte[] bArr2 = new byte[M7];
        System.arraycopy(bArr, i12, bArr2, 0, i14);
        int size = J8.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = J8.get(i15);
            i15++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, i14, bArr3.length);
            i14 += bArr3.length;
        }
        C1036g c1036g = AbstractC1037h.f16356b;
        return new C1036g(bArr2);
    }

    @Override // W5.d
    public final double p() {
        return Double.longBitsToDouble(L());
    }

    @Override // W5.d
    public final int q() {
        return M();
    }

    @Override // W5.d
    public final int r() {
        return K();
    }

    @Override // W5.d
    public final long s() {
        return L();
    }

    @Override // W5.d
    public final float t() {
        return Float.intBitsToFloat(K());
    }

    @Override // W5.d
    public final int u() {
        return M();
    }

    @Override // W5.d
    public final long v() {
        return N();
    }

    @Override // W5.d
    public final int w() {
        return K();
    }

    @Override // W5.d
    public final long x() {
        return L();
    }

    @Override // W5.d
    public final int y() {
        return W5.d.d(M());
    }

    @Override // W5.d
    public final long z() {
        return W5.d.e(N());
    }
}
