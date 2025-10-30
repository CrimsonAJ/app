package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0522h extends W5.d {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f9711c;

    /* renamed from: d, reason: collision with root package name */
    public int f9712d;

    /* renamed from: e, reason: collision with root package name */
    public int f9713e;

    /* renamed from: f, reason: collision with root package name */
    public int f9714f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9715g;

    /* renamed from: h, reason: collision with root package name */
    public int f9716h;

    /* renamed from: i, reason: collision with root package name */
    public int f9717i = Integer.MAX_VALUE;

    public C0522h(byte[] bArr, int i9, int i10, boolean z9) {
        this.f9711c = bArr;
        this.f9712d = i10 + i9;
        this.f9714f = i9;
        this.f9715g = i9;
    }

    @Override // W5.d
    public final String A() {
        int J8 = J();
        if (J8 > 0) {
            int i9 = this.f9712d;
            int i10 = this.f9714f;
            if (J8 <= i9 - i10) {
                String str = new String(this.f9711c, i10, J8, AbstractC0535v.f9765a);
                this.f9714f += J8;
                return str;
            }
        }
        if (J8 == 0) {
            return "";
        }
        if (J8 < 0) {
            throw C0537x.d();
        }
        throw C0537x.e();
    }

    @Override // W5.d
    public final String B() {
        int J8 = J();
        if (J8 > 0) {
            int i9 = this.f9712d;
            int i10 = this.f9714f;
            if (J8 <= i9 - i10) {
                String l9 = j0.f9732a.l(this.f9711c, i10, J8);
                this.f9714f += J8;
                return l9;
            }
        }
        if (J8 == 0) {
            return "";
        }
        if (J8 <= 0) {
            throw C0537x.d();
        }
        throw C0537x.e();
    }

    @Override // W5.d
    public final int C() {
        if (g()) {
            this.f9716h = 0;
            return 0;
        }
        int J8 = J();
        this.f9716h = J8;
        if ((J8 >>> 3) != 0) {
            return J8;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    @Override // W5.d
    public final int D() {
        return J();
    }

    @Override // W5.d
    public final long E() {
        return K();
    }

    @Override // W5.d
    public final boolean F(int i9) {
        int i10 = i9 & 7;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            return false;
                        }
                        if (i10 == 5) {
                            N(4);
                            return true;
                        }
                        throw C0537x.b();
                    }
                    G();
                    b(((i9 >>> 3) << 3) | 4);
                    return true;
                }
                N(J());
                return true;
            }
            N(8);
            return true;
        }
        int i12 = this.f9712d - this.f9714f;
        byte[] bArr = this.f9711c;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.f9714f;
                this.f9714f = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            throw C0537x.c();
        }
        while (i11 < 10) {
            int i14 = this.f9714f;
            if (i14 != this.f9712d) {
                this.f9714f = i14 + 1;
                if (bArr[i14] < 0) {
                    i11++;
                }
            } else {
                throw C0537x.e();
            }
        }
        throw C0537x.c();
        return true;
    }

    public final int H() {
        int i9 = this.f9714f;
        if (this.f9712d - i9 >= 4) {
            this.f9714f = i9 + 4;
            byte[] bArr = this.f9711c;
            return ((bArr[i9 + 3] & 255) << 24) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16);
        }
        throw C0537x.e();
    }

    public final long I() {
        int i9 = this.f9714f;
        if (this.f9712d - i9 >= 8) {
            this.f9714f = i9 + 8;
            byte[] bArr = this.f9711c;
            return ((bArr[i9 + 7] & 255) << 56) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16) | ((bArr[i9 + 3] & 255) << 24) | ((bArr[i9 + 4] & 255) << 32) | ((bArr[i9 + 5] & 255) << 40) | ((bArr[i9 + 6] & 255) << 48);
        }
        throw C0537x.e();
    }

    public final int J() {
        int i9;
        int i10 = this.f9714f;
        int i11 = this.f9712d;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f9711c;
            byte b9 = bArr[i10];
            if (b9 >= 0) {
                this.f9714f = i12;
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
                this.f9714f = i13;
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
        int i9 = this.f9714f;
        int i10 = this.f9712d;
        if (i10 != i9) {
            int i11 = i9 + 1;
            byte[] bArr = this.f9711c;
            byte b9 = bArr[i9];
            if (b9 >= 0) {
                this.f9714f = i11;
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
                this.f9714f = i12;
                return j;
            }
        }
        return L();
    }

    public final long L() {
        long j = 0;
        for (int i9 = 0; i9 < 64; i9 += 7) {
            int i10 = this.f9714f;
            if (i10 != this.f9712d) {
                this.f9714f = i10 + 1;
                j |= (r3 & Byte.MAX_VALUE) << i9;
                if ((this.f9711c[i10] & 128) == 0) {
                    return j;
                }
            } else {
                throw C0537x.e();
            }
        }
        throw C0537x.c();
    }

    public final void M() {
        int i9 = this.f9712d + this.f9713e;
        this.f9712d = i9;
        int i10 = i9 - this.f9715g;
        int i11 = this.f9717i;
        if (i10 > i11) {
            int i12 = i10 - i11;
            this.f9713e = i12;
            this.f9712d = i9 - i12;
            return;
        }
        this.f9713e = 0;
    }

    public final void N(int i9) {
        if (i9 >= 0) {
            int i10 = this.f9712d;
            int i11 = this.f9714f;
            if (i9 <= i10 - i11) {
                this.f9714f = i11 + i9;
                return;
            }
        }
        if (i9 < 0) {
            throw C0537x.d();
        }
        throw C0537x.e();
    }

    @Override // W5.d
    public final void b(int i9) {
        if (this.f9716h == i9) {
        } else {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // W5.d
    public final int f() {
        return this.f9714f - this.f9715g;
    }

    @Override // W5.d
    public final boolean g() {
        if (this.f9714f == this.f9712d) {
            return true;
        }
        return false;
    }

    @Override // W5.d
    public final void j(int i9) {
        this.f9717i = i9;
        M();
    }

    @Override // W5.d
    public final int l(int i9) {
        if (i9 >= 0) {
            int f9 = f() + i9;
            if (f9 >= 0) {
                int i10 = this.f9717i;
                if (f9 <= i10) {
                    this.f9717i = f9;
                    M();
                    return i10;
                }
                throw C0537x.e();
            }
            throw new IOException("Failed to parse the message.");
        }
        throw C0537x.d();
    }

    @Override // W5.d
    public final boolean m() {
        if (K() != 0) {
            return true;
        }
        return false;
    }

    @Override // W5.d
    public final C0521g n() {
        byte[] bArr;
        int J8 = J();
        byte[] bArr2 = this.f9711c;
        if (J8 > 0) {
            int i9 = this.f9712d;
            int i10 = this.f9714f;
            if (J8 <= i9 - i10) {
                C0521g d9 = C0521g.d(bArr2, i10, J8);
                this.f9714f += J8;
                return d9;
            }
        }
        if (J8 == 0) {
            return C0521g.f9700c;
        }
        if (J8 > 0) {
            int i11 = this.f9712d;
            int i12 = this.f9714f;
            if (J8 <= i11 - i12) {
                int i13 = J8 + i12;
                this.f9714f = i13;
                bArr = Arrays.copyOfRange(bArr2, i12, i13);
                C0521g c0521g = C0521g.f9700c;
                return new C0521g(bArr);
            }
        }
        if (J8 <= 0) {
            if (J8 == 0) {
                bArr = AbstractC0535v.f9766b;
                C0521g c0521g2 = C0521g.f9700c;
                return new C0521g(bArr);
            }
            throw C0537x.d();
        }
        throw C0537x.e();
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
        int J8 = J();
        return (-(J8 & 1)) ^ (J8 >>> 1);
    }

    @Override // W5.d
    public final long z() {
        long K = K();
        return (-(K & 1)) ^ (K >>> 1);
    }
}
