package N3;

import java.util.List;

/* loaded from: classes.dex */
public final class I implements i4.q {

    /* renamed from: a, reason: collision with root package name */
    public final i4.q f4925a;

    /* renamed from: b, reason: collision with root package name */
    public final m0 f4926b;

    public I(i4.q qVar, m0 m0Var) {
        this.f4925a = qVar;
        this.f4926b = m0Var;
    }

    @Override // i4.q
    public final void a(long j, long j4, long j9, List list, P3.l[] lVarArr) {
        this.f4925a.a(j, j4, j9, list, lVarArr);
    }

    @Override // i4.q
    public final void b(boolean z9) {
        this.f4925a.b(z9);
    }

    @Override // i4.q
    public final j3.M c(int i9) {
        return this.f4925a.c(i9);
    }

    @Override // i4.q
    public final void d() {
        this.f4925a.d();
    }

    @Override // i4.q
    public final int e(int i9) {
        return this.f4925a.e(i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i9 = (I) obj;
        if (this.f4925a.equals(i9.f4925a) && this.f4926b.equals(i9.f4926b)) {
            return true;
        }
        return false;
    }

    @Override // i4.q
    public final int f(long j, List list) {
        return this.f4925a.f(j, list);
    }

    @Override // i4.q
    public final boolean g(long j, int i9) {
        return this.f4925a.g(j, i9);
    }

    @Override // i4.q
    public final boolean h(long j, int i9) {
        return this.f4925a.h(j, i9);
    }

    public final int hashCode() {
        return this.f4925a.hashCode() + ((this.f4926b.hashCode() + 527) * 31);
    }

    @Override // i4.q
    public final void i() {
        this.f4925a.i();
    }

    @Override // i4.q
    public final int j() {
        return this.f4925a.j();
    }

    @Override // i4.q
    public final int k(j3.M m9) {
        return this.f4925a.k(m9);
    }

    @Override // i4.q
    public final m0 l() {
        return this.f4926b;
    }

    @Override // i4.q
    public final int length() {
        return this.f4925a.length();
    }

    @Override // i4.q
    public final j3.M m() {
        return this.f4925a.m();
    }

    @Override // i4.q
    public final boolean n(long j, P3.e eVar, List list) {
        return this.f4925a.n(j, eVar, list);
    }

    @Override // i4.q
    public final int o() {
        return this.f4925a.o();
    }

    @Override // i4.q
    public final int p() {
        return this.f4925a.p();
    }

    @Override // i4.q
    public final void q(float f9) {
        this.f4925a.q(f9);
    }

    @Override // i4.q
    public final Object r() {
        return this.f4925a.r();
    }

    @Override // i4.q
    public final void s() {
        this.f4925a.s();
    }

    @Override // i4.q
    public final void t() {
        this.f4925a.t();
    }

    @Override // i4.q
    public final int u(int i9) {
        return this.f4925a.u(i9);
    }
}
