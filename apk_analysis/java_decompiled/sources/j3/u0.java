package j3;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class u0 extends E0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f19744b;

    /* renamed from: c, reason: collision with root package name */
    public final N3.g0 f19745c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19746d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19747e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f19748f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f19749g;

    /* renamed from: h, reason: collision with root package name */
    public final E0[] f19750h;

    /* renamed from: i, reason: collision with root package name */
    public final Object[] f19751i;
    public final HashMap j;

    public u0(ArrayList arrayList, N3.g0 g0Var) {
        this.f19745c = g0Var;
        this.f19744b = g0Var.f5102b.length;
        int size = arrayList.size();
        this.f19748f = new int[size];
        this.f19749g = new int[size];
        this.f19750h = new E0[size];
        this.f19751i = new Object[size];
        this.j = new HashMap();
        int size2 = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size2) {
            Object obj = arrayList.get(i12);
            i12++;
            InterfaceC1454f0 interfaceC1454f0 = (InterfaceC1454f0) obj;
            this.f19750h[i11] = interfaceC1454f0.b();
            this.f19749g[i11] = i9;
            this.f19748f[i11] = i10;
            i9 += this.f19750h[i11].o();
            i10 += this.f19750h[i11].h();
            this.f19751i[i11] = interfaceC1454f0.a();
            this.j.put(this.f19751i[i11], Integer.valueOf(i11));
            i11++;
        }
        this.f19746d = i9;
        this.f19747e = i10;
    }

    @Override // j3.E0
    public final int a(boolean z9) {
        if (this.f19744b != 0) {
            int i9 = 0;
            if (z9) {
                int[] iArr = this.f19745c.f5102b;
                if (iArr.length > 0) {
                    i9 = iArr[0];
                } else {
                    i9 = -1;
                }
            }
            do {
                E0[] e0Arr = this.f19750h;
                if (e0Arr[i9].p()) {
                    i9 = q(i9, z9);
                } else {
                    return e0Arr[i9].a(z9) + this.f19749g[i9];
                }
            } while (i9 != -1);
        }
        return -1;
    }

    @Override // j3.E0
    public final int b(Object obj) {
        int intValue;
        int b9;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.j.get(obj2);
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            if (intValue != -1 && (b9 = this.f19750h[intValue].b(obj3)) != -1) {
                return this.f19748f[intValue] + b9;
            }
        }
        return -1;
    }

    @Override // j3.E0
    public final int c(boolean z9) {
        int i9;
        int i10 = this.f19744b;
        if (i10 != 0) {
            if (z9) {
                int[] iArr = this.f19745c.f5102b;
                if (iArr.length > 0) {
                    i9 = iArr[iArr.length - 1];
                } else {
                    i9 = -1;
                }
            } else {
                i9 = i10 - 1;
            }
            do {
                E0[] e0Arr = this.f19750h;
                if (e0Arr[i9].p()) {
                    i9 = r(i9, z9);
                } else {
                    return e0Arr[i9].c(z9) + this.f19749g[i9];
                }
            } while (i9 != -1);
        }
        return -1;
    }

    @Override // j3.E0
    public final int e(int i9, int i10, boolean z9) {
        int[] iArr = this.f19749g;
        int i11 = 0;
        int d9 = l4.y.d(iArr, i9 + 1, false, false);
        int i12 = iArr[d9];
        E0[] e0Arr = this.f19750h;
        E0 e02 = e0Arr[d9];
        int i13 = i9 - i12;
        if (i10 != 2) {
            i11 = i10;
        }
        int e8 = e02.e(i13, i11, z9);
        if (e8 != -1) {
            return i12 + e8;
        }
        int q9 = q(d9, z9);
        while (q9 != -1 && e0Arr[q9].p()) {
            q9 = q(q9, z9);
        }
        if (q9 != -1) {
            return e0Arr[q9].a(z9) + iArr[q9];
        }
        if (i10 != 2) {
            return -1;
        }
        return a(z9);
    }

    @Override // j3.E0
    public final C0 f(int i9, C0 c02, boolean z9) {
        int[] iArr = this.f19748f;
        int d9 = l4.y.d(iArr, i9 + 1, false, false);
        int i10 = this.f19749g[d9];
        this.f19750h[d9].f(i9 - iArr[d9], c02, z9);
        c02.f19237c += i10;
        if (z9) {
            Object obj = this.f19751i[d9];
            Object obj2 = c02.f19236b;
            obj2.getClass();
            c02.f19236b = Pair.create(obj, obj2);
        }
        return c02;
    }

    @Override // j3.E0
    public final C0 g(Object obj, C0 c02) {
        int intValue;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.j.get(obj2);
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        int i9 = this.f19749g[intValue];
        this.f19750h[intValue].g(obj3, c02);
        c02.f19237c += i9;
        c02.f19236b = obj;
        return c02;
    }

    @Override // j3.E0
    public final int h() {
        return this.f19747e;
    }

    @Override // j3.E0
    public final int k(int i9, int i10, boolean z9) {
        int[] iArr = this.f19749g;
        int i11 = 0;
        int d9 = l4.y.d(iArr, i9 + 1, false, false);
        int i12 = iArr[d9];
        E0[] e0Arr = this.f19750h;
        E0 e02 = e0Arr[d9];
        int i13 = i9 - i12;
        if (i10 != 2) {
            i11 = i10;
        }
        int k5 = e02.k(i13, i11, z9);
        if (k5 != -1) {
            return i12 + k5;
        }
        int r5 = r(d9, z9);
        while (r5 != -1 && e0Arr[r5].p()) {
            r5 = r(r5, z9);
        }
        if (r5 != -1) {
            return e0Arr[r5].c(z9) + iArr[r5];
        }
        if (i10 != 2) {
            return -1;
        }
        return c(z9);
    }

    @Override // j3.E0
    public final Object l(int i9) {
        int[] iArr = this.f19748f;
        int d9 = l4.y.d(iArr, i9 + 1, false, false);
        return Pair.create(this.f19751i[d9], this.f19750h[d9].l(i9 - iArr[d9]));
    }

    @Override // j3.E0
    public final D0 m(int i9, D0 d02, long j) {
        int[] iArr = this.f19749g;
        int d9 = l4.y.d(iArr, i9 + 1, false, false);
        int i10 = iArr[d9];
        int i11 = this.f19748f[d9];
        this.f19750h[d9].m(i9 - i10, d02, j);
        Object obj = this.f19751i[d9];
        if (!D0.f19300r.equals(d02.f19303a)) {
            obj = Pair.create(obj, d02.f19303a);
        }
        d02.f19303a = obj;
        d02.f19316o += i11;
        d02.f19317p += i11;
        return d02;
    }

    @Override // j3.E0
    public final int o() {
        return this.f19746d;
    }

    public final int q(int i9, boolean z9) {
        if (z9) {
            N3.g0 g0Var = this.f19745c;
            int i10 = g0Var.f5103c[i9] + 1;
            int[] iArr = g0Var.f5102b;
            if (i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }
        if (i9 >= this.f19744b - 1) {
            return -1;
        }
        return i9 + 1;
    }

    public final int r(int i9, boolean z9) {
        if (z9) {
            N3.g0 g0Var = this.f19745c;
            int i10 = g0Var.f5103c[i9] - 1;
            if (i10 < 0) {
                return -1;
            }
            return g0Var.f5102b[i10];
        }
        if (i9 <= 0) {
            return -1;
        }
        return i9 - 1;
    }
}
