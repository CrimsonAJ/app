package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.crypto.tink.shaded.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1038i extends W5.d {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f16360c;

    /* renamed from: d, reason: collision with root package name */
    public int f16361d;

    /* renamed from: e, reason: collision with root package name */
    public int f16362e;

    /* renamed from: f, reason: collision with root package name */
    public int f16363f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16364g;

    /* renamed from: h, reason: collision with root package name */
    public int f16365h;

    /* renamed from: i, reason: collision with root package name */
    public int f16366i = Integer.MAX_VALUE;

    public C1038i(byte[] bArr, int i9, int i10, boolean z9) {
        this.f16360c = bArr;
        this.f16361d = i10 + i9;
        this.f16363f = i9;
        this.f16364g = i9;
    }

    @Override // W5.d
    public final String A() {
        int J8 = J();
        if (J8 > 0) {
            int i9 = this.f16361d;
            int i10 = this.f16363f;
            if (J8 <= i9 - i10) {
                String str = new String(this.f16360c, i10, J8, AbstractC1054z.f16405a);
                this.f16363f += J8;
                return str;
            }
        }
        if (J8 == 0) {
            return "";
        }
        if (J8 < 0) {
            throw B.e();
        }
        throw B.g();
    }

    @Override // W5.d
    public final String B() {
        int J8 = J();
        if (J8 > 0) {
            int i9 = this.f16361d;
            int i10 = this.f16363f;
            if (J8 <= i9 - i10) {
                String t7 = q0.f16400a.t(this.f16360c, i10, J8);
                this.f16363f += J8;
                return t7;
            }
        }
        if (J8 == 0) {
            return "";
        }
        if (J8 <= 0) {
            throw B.e();
        }
        throw B.g();
    }

    @Override // W5.d
    public final int C() {
        if (g()) {
            this.f16365h = 0;
            return 0;
        }
        int J8 = J();
        this.f16365h = J8;
        if ((J8 >>> 3) != 0) {
            return J8;
        }
        throw B.a();
    }

    @Override // W5.d
    public final int D() {
        return J();
    }

    @Override // W5.d
    public final long E() {
        return K();
    }

    public final int H() {
        int i9 = this.f16363f;
        if (this.f16361d - i9 >= 4) {
            this.f16363f = i9 + 4;
            byte[] bArr = this.f16360c;
            return ((bArr[i9 + 3] & 255) << 24) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16);
        }
        throw B.g();
    }

    public final long I() {
        int i9 = this.f16363f;
        if (this.f16361d - i9 >= 8) {
            this.f16363f = i9 + 8;
            byte[] bArr = this.f16360c;
            return ((bArr[i9 + 7] & 255) << 56) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16) | ((bArr[i9 + 3] & 255) << 24) | ((bArr[i9 + 4] & 255) << 32) | ((bArr[i9 + 5] & 255) << 40) | ((bArr[i9 + 6] & 255) << 48);
        }
        throw B.g();
    }

    public final int J() {
        int i9;
        int i10 = this.f16363f;
        int i11 = this.f16361d;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f16360c;
            byte b9 = bArr[i10];
            if (b9 >= 0) {
                this.f16363f = i12;
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
                this.f16363f = i13;
                return i9;
            }
        }
        return (int) L();
    }

    public final long K() {
        long j;
        long j4;
        long j9;
        long j10;
        int i9 = this.f16363f;
        int i10 = this.f16361d;
        if (i10 != i9) {
            int i11 = i9 + 1;
            byte[] bArr = this.f16360c;
            byte b9 = bArr[i9];
            if (b9 >= 0) {
                this.f16363f = i11;
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
                this.f16363f = i12;
                return j;
            }
        }
        return L();
    }

    public final long L() {
        long j = 0;
        for (int i9 = 0; i9 < 64; i9 += 7) {
            int i10 = this.f16363f;
            if (i10 != this.f16361d) {
                this.f16363f = i10 + 1;
                j |= (r3 & Byte.MAX_VALUE) << i9;
                if ((this.f16360c[i10] & 128) == 0) {
                    return j;
                }
            } else {
                throw B.g();
            }
        }
        throw B.d();
    }

    public final void M() {
        int i9 = this.f16361d + this.f16362e;
        this.f16361d = i9;
        int i10 = i9 - this.f16364g;
        int i11 = this.f16366i;
        if (i10 > i11) {
            int i12 = i10 - i11;
            this.f16362e = i12;
            this.f16361d = i9 - i12;
            return;
        }
        this.f16362e = 0;
    }

    @Override // W5.d
    public final void b(int i9) {
        if (this.f16365h == i9) {
        } else {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // W5.d
    public final int f() {
        return this.f16363f - this.f16364g;
    }

    @Override // W5.d
    public final boolean g() {
        if (this.f16363f == this.f16361d) {
            return true;
        }
        return false;
    }

    @Override // W5.d
    public final void j(int i9) {
        this.f16366i = i9;
        M();
    }

    @Override // W5.d
    public final int l(int i9) {
        if (i9 >= 0) {
            int f9 = f() + i9;
            if (f9 >= 0) {
                int i10 = this.f16366i;
                if (f9 <= i10) {
                    this.f16366i = f9;
                    M();
                    return i10;
                }
                throw B.g();
            }
            throw B.f();
        }
        throw B.e();
    }

    @Override // W5.d
    public final boolean m() {
        if (K() != 0) {
            return true;
        }
        return false;
    }

    @Override // W5.d
    public final C1036g o() {
        byte[] bArr;
        int J8 = J();
        byte[] bArr2 = this.f16360c;
        if (J8 > 0) {
            int i9 = this.f16361d;
            int i10 = this.f16363f;
            if (J8 <= i9 - i10) {
                C1036g d9 = AbstractC1037h.d(bArr2, i10, J8);
                this.f16363f += J8;
                return d9;
            }
        }
        if (J8 == 0) {
            return AbstractC1037h.f16356b;
        }
        if (J8 > 0) {
            int i11 = this.f16361d;
            int i12 = this.f16363f;
            if (J8 <= i11 - i12) {
                int i13 = J8 + i12;
                this.f16363f = i13;
                bArr = Arrays.copyOfRange(bArr2, i12, i13);
                C1036g c1036g = AbstractC1037h.f16356b;
                return new C1036g(bArr);
            }
        }
        if (J8 <= 0) {
            if (J8 == 0) {
                bArr = AbstractC1054z.f16406b;
                C1036g c1036g2 = AbstractC1037h.f16356b;
                return new C1036g(bArr);
            }
            throw B.e();
        }
        throw B.g();
    }

    @Override // W5.d
    public final double p() {
        return Double.longBitsToDouble(I());
    }

    @Override // W5.d
    public final int q() {
        return J();
    }

    @Override // W5.d
    public final int r() {
        return H();
    }

    @Override // W5.d
    public final long s() {
        return I();
    }

    @Override // W5.d
    public final float t() {
        return Float.intBitsToFloat(H());
    }

    @Override // W5.d
    public final int u() {
        return J();
    }

    @Override // W5.d
    public final long v() {
        return K();
    }

    @Override // W5.d
    public final int w() {
        return H();
    }

    @Override // W5.d
    public final long x() {
        return I();
    }

    @Override // W5.d
    public final int y() {
        return W5.d.d(J());
    }

    @Override // W5.d
    public final long z() {
        return W5.d.e(K());
    }
}
