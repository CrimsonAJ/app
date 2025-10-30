package Z3;

import l4.AbstractC1566a;
import l4.y;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9035a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f9036b;

    /* renamed from: c, reason: collision with root package name */
    public int f9037c;

    /* renamed from: d, reason: collision with root package name */
    public int f9038d;

    /* renamed from: e, reason: collision with root package name */
    public int f9039e;

    public f() {
        this.f9035a = 1;
        this.f9036b = y.f20558f;
    }

    public void a() {
        boolean z9;
        int i9;
        boolean z10;
        int i10;
        switch (this.f9035a) {
            case 1:
                int i11 = this.f9037c;
                if (i11 >= 0 && (i11 < (i9 = this.f9039e) || (i11 == i9 && this.f9038d == 0))) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                AbstractC1566a.m(z9);
                return;
            default:
                int i12 = this.f9038d;
                if (i12 >= 0 && (i12 < (i10 = this.f9037c) || (i12 == i10 && this.f9039e == 0))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                AbstractC1566a.m(z10);
                return;
        }
    }

    public int b() {
        return ((this.f9039e - this.f9037c) * 8) - this.f9038d;
    }

    public void c() {
        if (this.f9038d == 0) {
            return;
        }
        this.f9038d = 0;
        this.f9037c++;
        a();
    }

    public boolean d(int i9) {
        int i10 = this.f9038d;
        int i11 = i9 / 8;
        int i12 = i10 + i11;
        int i13 = (this.f9039e + i9) - (i11 * 8);
        if (i13 > 7) {
            i12++;
            i13 -= 8;
        }
        while (true) {
            i10++;
            if (i10 > i12 || i12 >= this.f9037c) {
                break;
            }
            if (p(i10)) {
                i12++;
                i10 += 2;
            }
        }
        int i14 = this.f9037c;
        if (i12 < i14) {
            return true;
        }
        if (i12 == i14 && i13 == 0) {
            return true;
        }
        return false;
    }

    public boolean e() {
        boolean z9;
        int i9 = this.f9038d;
        int i10 = this.f9039e;
        int i11 = 0;
        while (this.f9038d < this.f9037c && !h()) {
            i11++;
        }
        if (this.f9038d == this.f9037c) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f9038d = i9;
        this.f9039e = i10;
        if (z9 || !d((i11 * 2) + 1)) {
            return false;
        }
        return true;
    }

    public int f() {
        boolean z9;
        if (this.f9038d == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        return this.f9037c;
    }

    public int g() {
        return (this.f9037c * 8) + this.f9038d;
    }

    public boolean h() {
        boolean z9;
        boolean z10;
        boolean z11;
        switch (this.f9035a) {
            case 1:
                if ((this.f9036b[this.f9037c] & (128 >> this.f9038d)) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                q();
                return z9;
            case 2:
                if ((this.f9036b[this.f9038d] & (128 >> this.f9039e)) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                q();
                return z10;
            default:
                if ((((this.f9036b[this.f9038d] & 255) >> this.f9039e) & 1) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                r(1);
                return z11;
        }
    }

    public int i(int i9) {
        switch (this.f9035a) {
            case 1:
                if (i9 == 0) {
                    return 0;
                }
                this.f9038d += i9;
                int i10 = 0;
                while (true) {
                    int i11 = this.f9038d;
                    if (i11 > 8) {
                        int i12 = i11 - 8;
                        this.f9038d = i12;
                        byte[] bArr = this.f9036b;
                        int i13 = this.f9037c;
                        this.f9037c = i13 + 1;
                        i10 |= (bArr[i13] & 255) << i12;
                    } else {
                        byte[] bArr2 = this.f9036b;
                        int i14 = this.f9037c;
                        int i15 = ((-1) >>> (32 - i9)) & (i10 | ((bArr2[i14] & 255) >> (8 - i11)));
                        if (i11 == 8) {
                            this.f9038d = 0;
                            this.f9037c = i14 + 1;
                        }
                        a();
                        return i15;
                    }
                }
            case 2:
                this.f9039e += i9;
                int i16 = 0;
                while (true) {
                    int i17 = this.f9039e;
                    int i18 = 2;
                    if (i17 > 8) {
                        int i19 = i17 - 8;
                        this.f9039e = i19;
                        byte[] bArr3 = this.f9036b;
                        int i20 = this.f9038d;
                        i16 |= (bArr3[i20] & 255) << i19;
                        if (!p(i20 + 1)) {
                            i18 = 1;
                        }
                        this.f9038d = i20 + i18;
                    } else {
                        byte[] bArr4 = this.f9036b;
                        int i21 = this.f9038d;
                        int i22 = ((-1) >>> (32 - i9)) & (i16 | ((bArr4[i21] & 255) >> (8 - i17)));
                        if (i17 == 8) {
                            this.f9039e = 0;
                            if (!p(i21 + 1)) {
                                i18 = 1;
                            }
                            this.f9038d = i21 + i18;
                        }
                        a();
                        return i22;
                    }
                }
            default:
                int i23 = this.f9038d;
                int min = Math.min(i9, 8 - this.f9039e);
                int i24 = i23 + 1;
                byte[] bArr5 = this.f9036b;
                int i25 = ((bArr5[i23] & 255) >> this.f9039e) & (255 >> (8 - min));
                while (min < i9) {
                    i25 |= (bArr5[i24] & 255) << min;
                    min += 8;
                    i24++;
                }
                int i26 = i25 & ((-1) >>> (32 - i9));
                r(i9);
                return i26;
        }
    }

    public void j(int i9, byte[] bArr) {
        int i10 = i9 >> 3;
        for (int i11 = 0; i11 < i10; i11++) {
            byte[] bArr2 = this.f9036b;
            int i12 = this.f9037c;
            int i13 = i12 + 1;
            this.f9037c = i13;
            byte b9 = bArr2[i12];
            int i14 = this.f9038d;
            byte b10 = (byte) (b9 << i14);
            bArr[i11] = b10;
            bArr[i11] = (byte) (((255 & bArr2[i13]) >> (8 - i14)) | b10);
        }
        int i15 = i9 & 7;
        if (i15 == 0) {
            return;
        }
        byte b11 = (byte) (bArr[i10] & (255 >> i15));
        bArr[i10] = b11;
        int i16 = this.f9038d;
        if (i16 + i15 > 8) {
            byte[] bArr3 = this.f9036b;
            int i17 = this.f9037c;
            this.f9037c = i17 + 1;
            bArr[i10] = (byte) (b11 | ((bArr3[i17] & 255) << i16));
            this.f9038d = i16 - 8;
        }
        int i18 = this.f9038d + i15;
        this.f9038d = i18;
        byte[] bArr4 = this.f9036b;
        int i19 = this.f9037c;
        bArr[i10] = (byte) (((byte) (((255 & bArr4[i19]) >> (8 - i18)) << (8 - i15))) | bArr[i10]);
        if (i18 == 8) {
            this.f9038d = 0;
            this.f9037c = i19 + 1;
        }
        a();
    }

    public void k(int i9, byte[] bArr) {
        boolean z9;
        if (this.f9038d == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        System.arraycopy(this.f9036b, this.f9037c, bArr, 0, i9);
        this.f9037c += i9;
        a();
    }

    public int l() {
        int i9 = 0;
        int i10 = 0;
        while (!h()) {
            i10++;
        }
        int i11 = (1 << i10) - 1;
        if (i10 > 0) {
            i9 = i(i10);
        }
        return i11 + i9;
    }

    public int m() {
        int i9;
        int l9 = l();
        if (l9 % 2 == 0) {
            i9 = -1;
        } else {
            i9 = 1;
        }
        return ((l9 + 1) / 2) * i9;
    }

    public void n(int i9, byte[] bArr) {
        this.f9036b = bArr;
        this.f9037c = 0;
        this.f9038d = 0;
        this.f9039e = i9;
    }

    public void o(int i9) {
        int i10 = i9 / 8;
        this.f9037c = i10;
        this.f9038d = i9 - (i10 * 8);
        a();
    }

    public boolean p(int i9) {
        if (2 <= i9 && i9 < this.f9037c) {
            byte[] bArr = this.f9036b;
            if (bArr[i9] == 3 && bArr[i9 - 2] == 0 && bArr[i9 - 1] == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void q() {
        switch (this.f9035a) {
            case 1:
                int i9 = this.f9038d + 1;
                this.f9038d = i9;
                if (i9 == 8) {
                    this.f9038d = 0;
                    this.f9037c++;
                }
                a();
                return;
            default:
                int i10 = 1;
                int i11 = this.f9039e + 1;
                this.f9039e = i11;
                if (i11 == 8) {
                    this.f9039e = 0;
                    int i12 = this.f9038d;
                    if (p(i12 + 1)) {
                        i10 = 2;
                    }
                    this.f9038d = i12 + i10;
                }
                a();
                return;
        }
    }

    public void r(int i9) {
        int i10;
        switch (this.f9035a) {
            case 1:
                int i11 = i9 / 8;
                int i12 = this.f9037c + i11;
                this.f9037c = i12;
                int i13 = (i9 - (i11 * 8)) + this.f9038d;
                this.f9038d = i13;
                if (i13 > 7) {
                    this.f9037c = i12 + 1;
                    this.f9038d = i13 - 8;
                }
                a();
                return;
            case 2:
                int i14 = this.f9038d;
                int i15 = i9 / 8;
                int i16 = i14 + i15;
                this.f9038d = i16;
                int i17 = (i9 - (i15 * 8)) + this.f9039e;
                this.f9039e = i17;
                if (i17 > 7) {
                    this.f9038d = i16 + 1;
                    this.f9039e = i17 - 8;
                }
                while (true) {
                    i14++;
                    if (i14 <= this.f9038d) {
                        if (p(i14)) {
                            this.f9038d++;
                            i14 += 2;
                        }
                    } else {
                        a();
                        return;
                    }
                }
            default:
                int i18 = i9 / 8;
                int i19 = this.f9038d + i18;
                this.f9038d = i19;
                int i20 = (i9 - (i18 * 8)) + this.f9039e;
                this.f9039e = i20;
                boolean z9 = true;
                if (i20 > 7) {
                    this.f9038d = i19 + 1;
                    this.f9039e = i20 - 8;
                }
                int i21 = this.f9038d;
                if (i21 < 0 || (i21 >= (i10 = this.f9037c) && (i21 != i10 || this.f9039e != 0))) {
                    z9 = false;
                }
                AbstractC1566a.m(z9);
                return;
        }
    }

    public void s(int i9) {
        boolean z9;
        if (this.f9038d == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        this.f9037c += i9;
        a();
    }

    public f(byte[] bArr, int i9, int i10) {
        this.f9035a = 2;
        this.f9036b = bArr;
        this.f9038d = i9;
        this.f9037c = i10;
        this.f9039e = 0;
        a();
    }

    public f(byte[] bArr) {
        this.f9035a = 3;
        this.f9036b = bArr;
        this.f9037c = bArr.length;
    }

    public f(int i9, byte[] bArr) {
        this.f9035a = 1;
        this.f9036b = bArr;
        this.f9039e = i9;
    }

    public f(int i9, int i10) {
        this.f9035a = 0;
        this.f9037c = i9;
        this.f9038d = i10;
        this.f9036b = new byte[(i10 * 2) - 1];
        this.f9039e = 0;
    }
}
