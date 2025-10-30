package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: f, reason: collision with root package name */
    public static final a0 f9682f = new a0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f9683a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f9684b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f9685c;

    /* renamed from: d, reason: collision with root package name */
    public int f9686d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9687e;

    public a0(int i9, int[] iArr, Object[] objArr, boolean z9) {
        this.f9683a = i9;
        this.f9684b = iArr;
        this.f9685c = objArr;
        this.f9687e = z9;
    }

    public final void a(int i9) {
        int[] iArr = this.f9684b;
        if (i9 > iArr.length) {
            int i10 = this.f9683a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i9) {
                i9 = i11;
            }
            if (i9 < 8) {
                i9 = 8;
            }
            this.f9684b = Arrays.copyOf(iArr, i9);
            this.f9685c = Arrays.copyOf(this.f9685c, i9);
        }
    }

    public final int b() {
        int L8;
        int N8;
        int L9;
        int i9 = this.f9686d;
        if (i9 != -1) {
            return i9;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f9683a; i11++) {
            int i12 = this.f9684b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 == 5) {
                                ((Integer) this.f9685c[i11]).getClass();
                                L9 = C0524j.L(i13) + 4;
                            } else {
                                throw new IllegalStateException(C0537x.b());
                            }
                        } else {
                            L8 = C0524j.L(i13) * 2;
                            N8 = ((a0) this.f9685c[i11]).b();
                        }
                    } else {
                        L9 = C0524j.J(i13, (C0521g) this.f9685c[i11]);
                    }
                } else {
                    ((Long) this.f9685c[i11]).getClass();
                    L9 = C0524j.L(i13) + 8;
                }
                i10 = L9 + i10;
            } else {
                long longValue = ((Long) this.f9685c[i11]).longValue();
                L8 = C0524j.L(i13);
                N8 = C0524j.N(longValue);
            }
            i10 = N8 + L8 + i10;
        }
        this.f9686d = i10;
        return i10;
    }

    public final void c(int i9, Object obj) {
        if (this.f9687e) {
            a(this.f9683a + 1);
            int[] iArr = this.f9684b;
            int i10 = this.f9683a;
            iArr[i10] = i9;
            this.f9685c[i10] = obj;
            this.f9683a = i10 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(C c3) {
        if (this.f9683a != 0) {
            c3.getClass();
            for (int i9 = 0; i9 < this.f9683a; i9++) {
                int i10 = this.f9684b[i9];
                Object obj = this.f9685c[i9];
                int i11 = i10 >>> 3;
                int i12 = i10 & 7;
                C0524j c0524j = (C0524j) c3.f9625a;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 == 5) {
                                    c0524j.V(i11, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(C0537x.b());
                                }
                            } else {
                                c0524j.e0(i11, 3);
                                ((a0) obj).d(c3);
                                c0524j.e0(i11, 4);
                            }
                        } else {
                            c0524j.T(i11, (C0521g) obj);
                        }
                    } else {
                        c0524j.X(((Long) obj).longValue(), i11);
                    }
                } else {
                    c0524j.h0(((Long) obj).longValue(), i11);
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        int i9 = this.f9683a;
        if (i9 == a0Var.f9683a) {
            int[] iArr = this.f9684b;
            int[] iArr2 = a0Var.f9684b;
            int i10 = 0;
            while (true) {
                if (i10 < i9) {
                    if (iArr[i10] != iArr2[i10]) {
                        break;
                    }
                    i10++;
                } else {
                    Object[] objArr = this.f9685c;
                    Object[] objArr2 = a0Var.f9685c;
                    int i11 = this.f9683a;
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
        int i9 = this.f9683a;
        int i10 = (527 + i9) * 31;
        int[] iArr = this.f9684b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i9; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i10 + i12) * 31;
        Object[] objArr = this.f9685c;
        int i15 = this.f9683a;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }
}
