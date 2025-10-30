package N3;

import j3.E0;

/* loaded from: classes.dex */
public abstract class p0 extends AbstractC0259j {

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0250a f5179k;

    public p0(AbstractC0250a abstractC0250a) {
        this.f5179k = abstractC0250a;
    }

    public abstract void B(E0 e02);

    public void C() {
        z(null, this.f5179k);
    }

    @Override // N3.AbstractC0250a
    public final E0 i() {
        return this.f5179k.i();
    }

    @Override // N3.AbstractC0250a
    public final j3.Y j() {
        return this.f5179k.j();
    }

    @Override // N3.AbstractC0250a
    public final boolean k() {
        return this.f5179k.k();
    }

    @Override // N3.AbstractC0250a
    public final void n(k4.W w7) {
        this.j = w7;
        this.f5125i = l4.y.l(null);
        C();
    }

    @Override // N3.AbstractC0259j
    public final A v(Object obj, A a5) {
        return A(a5);
    }

    @Override // N3.AbstractC0259j
    public final long w(long j, Object obj) {
        return j;
    }

    @Override // N3.AbstractC0259j
    public final int x(int i9, Object obj) {
        return i9;
    }

    @Override // N3.AbstractC0259j
    public final void y(Object obj, AbstractC0250a abstractC0250a, E0 e02) {
        B(e02);
    }

    public A A(A a5) {
        return a5;
    }
}
