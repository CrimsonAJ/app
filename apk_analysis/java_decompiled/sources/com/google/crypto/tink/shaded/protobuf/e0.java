package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: f, reason: collision with root package name */
    public static final e0 f16346f = new e0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f16347a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f16348b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f16349c;

    /* renamed from: d, reason: collision with root package name */
    public int f16350d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16351e;

    public e0(int i9, int[] iArr, Object[] objArr, boolean z9) {
        this.f16347a = i9;
        this.f16348b = iArr;
        this.f16349c = objArr;
        this.f16351e = z9;
    }

    public static e0 c() {
        return new e0(0, new int[8], new Object[8], true);
    }

    public final void a(int i9) {
        int[] iArr = this.f16348b;
        if (i9 > iArr.length) {
            int i10 = this.f16347a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i9) {
                i9 = i11;
            }
            if (i9 < 8) {
                i9 = 8;
            }
            this.f16348b = Arrays.copyOf(iArr, i9);
            this.f16349c = Arrays.copyOf(this.f16349c, i9);
        }
    }

    public final int b() {
        int Y;
        int a02;
        int U8;
        int i9 = this.f16350d;
        if (i9 != -1) {
            return i9;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f16347a; i11++) {
            int i12 = this.f16348b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 == 5) {
                                ((Integer) this.f16349c[i11]).getClass();
                                U8 = C1040k.T(i13);
                            } else {
                                throw new IllegalStateException(B.c());
                            }
                        } else {
                            Y = C1040k.Y(i13) * 2;
                            a02 = ((e0) this.f16349c[i11]).b();
                        }
                    } else {
                        U8 = C1040k.R(i13, (AbstractC1037h) this.f16349c[i11]);
                    }
                } else {
                    ((Long) this.f16349c[i11]).getClass();
                    U8 = C1040k.U(i13);
                }
                i10 = U8 + i10;
            } else {
                long longValue = ((Long) this.f16349c[i11]).longValue();
                Y = C1040k.Y(i13);
                a02 = C1040k.a0(longValue);
            }
            i10 = a02 + Y + i10;
        }
        this.f16350d = i10;
        return i10;
    }

    public final void d(int i9, Object obj) {
        if (this.f16351e) {
            a(this.f16347a + 1);
            int[] iArr = this.f16348b;
            int i10 = this.f16347a;
            iArr[i10] = i9;
            this.f16349c[i10] = obj;
            this.f16347a = i10 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void e(K k5) {
        if (this.f16347a != 0) {
            k5.getClass();
            for (int i9 = 0; i9 < this.f16347a; i9++) {
                int i10 = this.f16348b[i9];
                Object obj = this.f16349c[i9];
                int i11 = i10 >>> 3;
                int i12 = i10 & 7;
                C1040k c1040k = (C1040k) k5.f16302a;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 == 5) {
                                    c1040k.d0(i11, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(B.c());
                                }
                            } else {
                                c1040k.i0(i11, 3);
                                ((e0) obj).e(k5);
                                c1040k.i0(i11, 4);
                            }
                        } else {
                            k5.a(i11, (AbstractC1037h) obj);
                        }
                    } else {
                        c1040k.f0(((Long) obj).longValue(), i11);
                    }
                } else {
                    c1040k.k0(((Long) obj).longValue(), i11);
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        int i9 = this.f16347a;
        if (i9 == e0Var.f16347a) {
            int[] iArr = this.f16348b;
            int[] iArr2 = e0Var.f16348b;
            int i10 = 0;
            while (true) {
                if (i10 < i9) {
                    if (iArr[i10] != iArr2[i10]) {
                        break;
                    }
                    i10++;
                } else {
                    Object[] objArr = this.f16349c;
                    Object[] objArr2 = e0Var.f16349c;
                    int i11 = this.f16347a;
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
        int i9 = this.f16347a;
        int i10 = (527 + i9) * 31;
        int[] iArr = this.f16348b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i9; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i10 + i12) * 31;
        Object[] objArr = this.f16349c;
        int i15 = this.f16347a;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }
}
