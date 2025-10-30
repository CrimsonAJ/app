package j3;

import android.util.Pair;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public abstract class E0 implements InterfaceC1453f {

    /* renamed from: a, reason: collision with root package name */
    public static final B0 f19320a = new Object();

    public int a(boolean z9) {
        if (p()) {
            return -1;
        }
        return 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z9) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i9, C0 c02, D0 d02, int i10, boolean z9) {
        int i11 = f(i9, c02, false).f19237c;
        if (m(i11, d02, 0L).f19317p == i9) {
            int e8 = e(i11, i10, z9);
            if (e8 == -1) {
                return -1;
            }
            return m(e8, d02, 0L).f19316o;
        }
        return i9 + 1;
    }

    public int e(int i9, int i10, boolean z9) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    if (i9 == c(z9)) {
                        return a(z9);
                    }
                    return i9 + 1;
                }
                throw new IllegalStateException();
            }
            return i9;
        }
        if (i9 == c(z9)) {
            return -1;
        }
        return i9 + 1;
    }

    public boolean equals(Object obj) {
        int c3;
        if (this != obj) {
            if (obj instanceof E0) {
                E0 e02 = (E0) obj;
                if (e02.o() == o() && e02.h() == h()) {
                    D0 d02 = new D0();
                    C0 c02 = new C0();
                    D0 d03 = new D0();
                    C0 c03 = new C0();
                    int i9 = 0;
                    while (true) {
                        if (i9 < o()) {
                            if (!m(i9, d02, 0L).equals(e02.m(i9, d03, 0L))) {
                                break;
                            }
                            i9++;
                        } else {
                            int i10 = 0;
                            while (true) {
                                if (i10 < h()) {
                                    if (!f(i10, c02, true).equals(e02.f(i10, c03, true))) {
                                        break;
                                    }
                                    i10++;
                                } else {
                                    int a5 = a(true);
                                    if (a5 == e02.a(true) && (c3 = c(true)) == e02.c(true)) {
                                        while (a5 != c3) {
                                            int e8 = e(a5, 0, true);
                                            if (e8 == e02.e(a5, 0, true)) {
                                                a5 = e8;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract C0 f(int i9, C0 c02, boolean z9);

    public C0 g(Object obj, C0 c02) {
        return f(b(obj), c02, true);
    }

    public abstract int h();

    public int hashCode() {
        D0 d02 = new D0();
        C0 c02 = new C0();
        int o9 = o() + 217;
        for (int i9 = 0; i9 < o(); i9++) {
            o9 = (o9 * 31) + m(i9, d02, 0L).hashCode();
        }
        int h7 = h() + (o9 * 31);
        for (int i10 = 0; i10 < h(); i10++) {
            h7 = (h7 * 31) + f(i10, c02, true).hashCode();
        }
        int a5 = a(true);
        while (a5 != -1) {
            h7 = (h7 * 31) + a5;
            a5 = e(a5, 0, true);
        }
        return h7;
    }

    public final Pair i(D0 d02, C0 c02, int i9, long j) {
        Pair j4 = j(d02, c02, i9, j, 0L);
        j4.getClass();
        return j4;
    }

    public final Pair j(D0 d02, C0 c02, int i9, long j, long j4) {
        AbstractC1566a.k(i9, o());
        m(i9, d02, j4);
        if (j == -9223372036854775807L) {
            j = d02.f19314m;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i10 = d02.f19316o;
        f(i10, c02, false);
        while (i10 < d02.f19317p && c02.f19239e != j) {
            int i11 = i10 + 1;
            if (f(i11, c02, false).f19239e > j) {
                break;
            }
            i10 = i11;
        }
        f(i10, c02, true);
        long j9 = j - c02.f19239e;
        long j10 = c02.f19238d;
        if (j10 != -9223372036854775807L) {
            j9 = Math.min(j9, j10 - 1);
        }
        long max = Math.max(0L, j9);
        Object obj = c02.f19236b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int k(int i9, int i10, boolean z9) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    if (i9 == a(z9)) {
                        return c(z9);
                    }
                    return i9 - 1;
                }
                throw new IllegalStateException();
            }
            return i9;
        }
        if (i9 == a(z9)) {
            return -1;
        }
        return i9 - 1;
    }

    public abstract Object l(int i9);

    public abstract D0 m(int i9, D0 d02, long j);

    public final void n(int i9, D0 d02) {
        m(i9, d02, 0L);
    }

    public abstract int o();

    public final boolean p() {
        if (o() == 0) {
            return true;
        }
        return false;
    }
}
