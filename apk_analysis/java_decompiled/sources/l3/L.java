package l3;

import java.util.Arrays;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final int f20325a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20326b;

    /* renamed from: c, reason: collision with root package name */
    public final float f20327c;

    /* renamed from: d, reason: collision with root package name */
    public final float f20328d;

    /* renamed from: e, reason: collision with root package name */
    public final float f20329e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20330f;

    /* renamed from: g, reason: collision with root package name */
    public final int f20331g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20332h;

    /* renamed from: i, reason: collision with root package name */
    public final short[] f20333i;
    public short[] j;

    /* renamed from: k, reason: collision with root package name */
    public int f20334k;

    /* renamed from: l, reason: collision with root package name */
    public short[] f20335l;

    /* renamed from: m, reason: collision with root package name */
    public int f20336m;

    /* renamed from: n, reason: collision with root package name */
    public short[] f20337n;

    /* renamed from: o, reason: collision with root package name */
    public int f20338o;

    /* renamed from: p, reason: collision with root package name */
    public int f20339p;

    /* renamed from: q, reason: collision with root package name */
    public int f20340q;

    /* renamed from: r, reason: collision with root package name */
    public int f20341r;

    /* renamed from: s, reason: collision with root package name */
    public int f20342s;

    /* renamed from: t, reason: collision with root package name */
    public int f20343t;

    /* renamed from: u, reason: collision with root package name */
    public int f20344u;

    /* renamed from: v, reason: collision with root package name */
    public int f20345v;

    public L(int i9, int i10, float f9, float f10, int i11) {
        this.f20325a = i9;
        this.f20326b = i10;
        this.f20327c = f9;
        this.f20328d = f10;
        this.f20329e = i9 / i11;
        this.f20330f = i9 / 400;
        int i12 = i9 / 65;
        this.f20331g = i12;
        int i13 = i12 * 2;
        this.f20332h = i13;
        this.f20333i = new short[i13];
        this.j = new short[i13 * i10];
        this.f20335l = new short[i13 * i10];
        this.f20337n = new short[i13 * i10];
    }

    public static void e(int i9, int i10, short[] sArr, int i11, short[] sArr2, int i12, short[] sArr3, int i13) {
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i11 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i12 * i10) + i14;
            for (int i18 = 0; i18 < i9; i18++) {
                sArr[i15] = (short) (((sArr3[i16] * i18) + ((i9 - i18) * sArr2[i17])) / i9);
                i15 += i10;
                i17 += i10;
                i16 += i10;
            }
        }
    }

    public final void a(short[] sArr, int i9, int i10) {
        short[] c3 = c(this.f20335l, this.f20336m, i10);
        this.f20335l = c3;
        int i11 = this.f20326b;
        System.arraycopy(sArr, i9 * i11, c3, this.f20336m * i11, i11 * i10);
        this.f20336m += i10;
    }

    public final void b(short[] sArr, int i9, int i10) {
        int i11 = this.f20332h / i10;
        int i12 = this.f20326b;
        int i13 = i10 * i12;
        int i14 = i9 * i12;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                i16 += sArr[(i15 * i13) + i14 + i17];
            }
            this.f20333i[i15] = (short) (i16 / i13);
        }
    }

    public final short[] c(short[] sArr, int i9, int i10) {
        int length = sArr.length;
        int i11 = this.f20326b;
        int i12 = length / i11;
        if (i9 + i10 <= i12) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i12 * 3) / 2) + i10) * i11);
    }

    public final int d(short[] sArr, int i9, int i10, int i11) {
        int i12 = i9 * this.f20326b;
        int i13 = 255;
        int i14 = 1;
        int i15 = 0;
        int i16 = 0;
        while (i10 <= i11) {
            int i17 = 0;
            for (int i18 = 0; i18 < i10; i18++) {
                i17 += Math.abs(sArr[i12 + i18] - sArr[(i12 + i10) + i18]);
            }
            if (i17 * i15 < i14 * i10) {
                i15 = i10;
                i14 = i17;
            }
            if (i17 * i13 > i16 * i10) {
                i13 = i10;
                i16 = i17;
            }
            i10++;
        }
        this.f20344u = i14 / i15;
        this.f20345v = i16 / i13;
        return i15;
    }

    public final void f() {
        int i9;
        float f9;
        float f10;
        float f11;
        double d9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z9;
        int i18 = this.f20336m;
        float f12 = this.f20327c;
        float f13 = this.f20328d;
        float f14 = f12 / f13;
        float f15 = this.f20329e * f13;
        double d10 = f14;
        int i19 = this.f20325a;
        int i20 = this.f20326b;
        int i21 = 1;
        if (d10 <= 1.00001d && d10 >= 0.99999d) {
            a(this.j, 0, this.f20334k);
            this.f20334k = 0;
        } else {
            int i22 = this.f20334k;
            int i23 = this.f20332h;
            if (i22 >= i23) {
                int i24 = 0;
                while (true) {
                    int i25 = this.f20341r;
                    if (i25 > 0) {
                        int min = Math.min(i23, i25);
                        a(this.j, i24, min);
                        this.f20341r -= min;
                        i24 += min;
                        f10 = f14;
                        f11 = f15;
                        d9 = d10;
                        f9 = 1.0f;
                    } else {
                        short[] sArr = this.j;
                        if (i19 > 4000) {
                            i9 = i19 / 4000;
                        } else {
                            i9 = i21;
                        }
                        f9 = 1.0f;
                        int i26 = this.f20331g;
                        int i27 = this.f20330f;
                        if (i20 == i21 && i9 == i21) {
                            i10 = d(sArr, i24, i27, i26);
                            f10 = f14;
                            f11 = f15;
                            d9 = d10;
                        } else {
                            b(sArr, i24, i9);
                            f10 = f14;
                            f11 = f15;
                            short[] sArr2 = this.f20333i;
                            d9 = d10;
                            int d11 = d(sArr2, 0, i27 / i9, i26 / i9);
                            if (i9 != 1) {
                                int i28 = d11 * i9;
                                int i29 = i9 * 4;
                                int i30 = i28 - i29;
                                int i31 = i28 + i29;
                                if (i30 >= i27) {
                                    i27 = i30;
                                }
                                if (i31 <= i26) {
                                    i26 = i31;
                                }
                                if (i20 == 1) {
                                    i10 = d(sArr, i24, i27, i26);
                                } else {
                                    b(sArr, i24, 1);
                                    i10 = d(sArr2, 0, i27, i26);
                                }
                            } else {
                                i10 = d11;
                            }
                        }
                        int i32 = this.f20344u;
                        int i33 = this.f20345v;
                        if (i32 == 0 || (i11 = this.f20342s) == 0 || i33 > i32 * 3 || i32 * 2 <= this.f20343t * 3) {
                            i11 = i10;
                        }
                        this.f20343t = i32;
                        this.f20342s = i10;
                        if (d9 > 1.0d) {
                            short[] sArr3 = this.j;
                            if (f10 >= 2.0f) {
                                i13 = (int) (i11 / (f10 - 1.0f));
                            } else {
                                this.f20341r = (int) (((2.0f - f10) * i11) / (f10 - 1.0f));
                                i13 = i11;
                            }
                            short[] c3 = c(this.f20335l, this.f20336m, i13);
                            this.f20335l = c3;
                            int i34 = i24 + i11;
                            int i35 = i24;
                            int i36 = i13;
                            e(i36, this.f20326b, c3, this.f20336m, sArr3, i35, sArr3, i34);
                            this.f20336m += i36;
                            i24 = i11 + i36 + i35;
                        } else {
                            int i37 = i24;
                            short[] sArr4 = this.j;
                            if (f10 < 0.5f) {
                                i12 = (int) ((i11 * f10) / (1.0f - f10));
                            } else {
                                this.f20341r = (int) ((((2.0f * f10) - 1.0f) * i11) / (1.0f - f10));
                                i12 = i11;
                            }
                            int i38 = i11 + i12;
                            short[] c9 = c(this.f20335l, this.f20336m, i38);
                            this.f20335l = c9;
                            System.arraycopy(sArr4, i37 * i20, c9, this.f20336m * i20, i11 * i20);
                            e(i12, this.f20326b, this.f20335l, this.f20336m + i11, sArr4, i37 + i11, sArr4, i37);
                            this.f20336m += i38;
                            i24 = i37 + i12;
                        }
                    }
                    if (i24 + i23 > i22) {
                        break;
                    }
                    i21 = 1;
                    f14 = f10;
                    f15 = f11;
                    d10 = d9;
                }
                int i39 = this.f20334k - i24;
                short[] sArr5 = this.j;
                System.arraycopy(sArr5, i24 * i20, sArr5, 0, i39 * i20);
                this.f20334k = i39;
                if (f11 == f9 && this.f20336m != i18) {
                    int i40 = (int) (i19 / f11);
                    while (true) {
                        if (i40 <= 16384 && i19 <= 16384) {
                            break;
                        }
                        i40 /= 2;
                        i19 /= 2;
                    }
                    int i41 = this.f20336m - i18;
                    short[] c10 = c(this.f20337n, this.f20338o, i41);
                    this.f20337n = c10;
                    System.arraycopy(this.f20335l, i18 * i20, c10, this.f20338o * i20, i41 * i20);
                    this.f20336m = i18;
                    this.f20338o += i41;
                    int i42 = 0;
                    while (true) {
                        i14 = this.f20338o;
                        i15 = i14 - 1;
                        if (i42 >= i15) {
                            break;
                        }
                        while (true) {
                            i16 = this.f20339p + 1;
                            int i43 = i16 * i40;
                            i17 = this.f20340q;
                            if (i43 <= i17 * i19) {
                                break;
                            }
                            this.f20335l = c(this.f20335l, this.f20336m, 1);
                            for (int i44 = 0; i44 < i20; i44++) {
                                short[] sArr6 = this.f20335l;
                                int i45 = (this.f20336m * i20) + i44;
                                short[] sArr7 = this.f20337n;
                                int i46 = (i42 * i20) + i44;
                                short s9 = sArr7[i46];
                                short s10 = sArr7[i46 + i20];
                                int i47 = this.f20340q * i19;
                                int i48 = this.f20339p;
                                int i49 = i48 * i40;
                                int i50 = (i48 + 1) * i40;
                                int i51 = i50 - i47;
                                int i52 = i50 - i49;
                                sArr6[i45] = (short) ((((i52 - i51) * s10) + (s9 * i51)) / i52);
                            }
                            this.f20340q++;
                            this.f20336m++;
                        }
                        this.f20339p = i16;
                        if (i16 == i19) {
                            this.f20339p = 0;
                            if (i17 == i40) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            AbstractC1566a.m(z9);
                            this.f20340q = 0;
                        }
                        i42++;
                    }
                    if (i15 != 0) {
                        short[] sArr8 = this.f20337n;
                        System.arraycopy(sArr8, i15 * i20, sArr8, 0, (i14 - i15) * i20);
                        this.f20338o -= i15;
                        return;
                    }
                    return;
                }
            }
        }
        f11 = f15;
        f9 = 1.0f;
        if (f11 == f9) {
        }
    }
}
