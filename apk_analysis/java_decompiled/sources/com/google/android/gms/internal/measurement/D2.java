package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class D2 {

    /* renamed from: f, reason: collision with root package name */
    public static final D2 f15200f = new D2(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f15201a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f15202b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f15203c;

    /* renamed from: d, reason: collision with root package name */
    public int f15204d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15205e;

    public D2(int i9, int[] iArr, Object[] objArr, boolean z9) {
        this.f15201a = i9;
        this.f15202b = iArr;
        this.f15203c = objArr;
        this.f15205e = z9;
    }

    public static D2 b() {
        return new D2(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int S8;
        int C8;
        int S9;
        int i9 = this.f15204d;
        if (i9 == -1) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.f15201a; i11++) {
                int i12 = this.f15202b[i11];
                int i13 = i12 >>> 3;
                int i14 = i12 & 7;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            if (i14 != 3) {
                                if (i14 == 5) {
                                    ((Integer) this.f15203c[i11]).getClass();
                                    S9 = U1.S(i13 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(new C0949j2());
                                }
                            } else {
                                int S10 = U1.S(i13 << 3);
                                S8 = S10 + S10;
                                C8 = ((D2) this.f15203c[i11]).a();
                            }
                        } else {
                            int i15 = i13 << 3;
                            T1 t12 = (T1) this.f15203c[i11];
                            int S11 = U1.S(i15);
                            int d9 = t12.d();
                            i10 = AbstractC0953k1.h(d9, d9, S11, i10);
                        }
                    } else {
                        ((Long) this.f15203c[i11]).getClass();
                        S9 = U1.S(i13 << 3) + 8;
                    }
                    i10 = S9 + i10;
                } else {
                    int i16 = i13 << 3;
                    long longValue = ((Long) this.f15203c[i11]).longValue();
                    S8 = U1.S(i16);
                    C8 = U1.C(longValue);
                }
                i10 = C8 + S8 + i10;
            }
            this.f15204d = i10;
            return i10;
        }
        return i9;
    }

    public final void c(int i9, Object obj) {
        if (this.f15205e) {
            e(this.f15201a + 1);
            int[] iArr = this.f15202b;
            int i10 = this.f15201a;
            iArr[i10] = i9;
            this.f15203c[i10] = obj;
            this.f15201a = i10 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(C0974o2 c0974o2) {
        if (this.f15201a != 0) {
            for (int i9 = 0; i9 < this.f15201a; i9++) {
                int i10 = this.f15202b[i9];
                Object obj = this.f15203c[i9];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 == 5) {
                                    ((U1) c0974o2.f15559a).F(i12, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(new C0949j2());
                                }
                            } else {
                                ((U1) c0974o2.f15559a).M(i12, 3);
                                ((D2) obj).d(c0974o2);
                                ((U1) c0974o2.f15559a).M(i12, 4);
                            }
                        } else {
                            ((U1) c0974o2.f15559a).E(i12, (T1) obj);
                        }
                    } else {
                        ((U1) c0974o2.f15559a).H(((Long) obj).longValue(), i12);
                    }
                } else {
                    ((U1) c0974o2.f15559a).P(((Long) obj).longValue(), i12);
                }
            }
        }
    }

    public final void e(int i9) {
        int[] iArr = this.f15202b;
        if (i9 > iArr.length) {
            int i10 = this.f15201a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i9) {
                i9 = i11;
            }
            if (i9 < 8) {
                i9 = 8;
            }
            this.f15202b = Arrays.copyOf(iArr, i9);
            this.f15203c = Arrays.copyOf(this.f15203c, i9);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof D2)) {
            return false;
        }
        D2 d22 = (D2) obj;
        int i9 = this.f15201a;
        if (i9 == d22.f15201a) {
            int[] iArr = this.f15202b;
            int[] iArr2 = d22.f15202b;
            int i10 = 0;
            while (true) {
                if (i10 < i9) {
                    if (iArr[i10] != iArr2[i10]) {
                        break;
                    }
                    i10++;
                } else {
                    Object[] objArr = this.f15203c;
                    Object[] objArr2 = d22.f15203c;
                    int i11 = this.f15201a;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (objArr[i12].equals(objArr2[i12])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = this.f15201a;
        int i10 = i9 + 527;
        int[] iArr = this.f15202b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i9; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i10 * 31) + i12) * 31;
        Object[] objArr = this.f15203c;
        int i15 = this.f15201a;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }
}
