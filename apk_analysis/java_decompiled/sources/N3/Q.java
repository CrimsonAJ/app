package N3;

import java.io.IOException;

/* loaded from: classes.dex */
public final class Q implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4963a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f4964b;

    public Q(T t7, int i9) {
        this.f4964b = t7;
        this.f4963a = i9;
    }

    @Override // N3.d0
    public final void b() {
        T t7 = this.f4964b;
        t7.f4995r[this.f4963a].w();
        int f9 = t7.f4978d.f(t7.f4969A);
        k4.M m9 = t7.j;
        IOException iOException = m9.f20007c;
        if (iOException == null) {
            k4.I i9 = m9.f20006b;
            if (i9 != null) {
                if (f9 == Integer.MIN_VALUE) {
                    f9 = i9.f19993a;
                }
                IOException iOException2 = i9.f19997e;
                if (iOException2 != null && i9.f19998f > f9) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    @Override // N3.d0
    public final int d(O0.c cVar, m3.f fVar, int i9) {
        T t7 = this.f4964b;
        if (t7.E()) {
            return -3;
        }
        int i10 = this.f4963a;
        t7.t(i10);
        int z9 = t7.f4995r[i10].z(cVar, fVar, i9, t7.f4985h0);
        if (z9 == -3) {
            t7.v(i10);
        }
        return z9;
    }

    @Override // N3.d0
    public final boolean j() {
        T t7 = this.f4964b;
        if (!t7.E() && t7.f4995r[this.f4963a].u(t7.f4985h0)) {
            return true;
        }
        return false;
    }

    @Override // N3.d0
    public final int m(long j) {
        T t7 = this.f4964b;
        if (t7.E()) {
            return 0;
        }
        int i9 = this.f4963a;
        t7.t(i9);
        c0 c0Var = t7.f4995r[i9];
        int s9 = c0Var.s(j, t7.f4985h0);
        c0Var.F(s9);
        if (s9 == 0) {
            t7.v(i9);
        }
        return s9;
    }
}
