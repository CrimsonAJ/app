package X0;

/* loaded from: classes.dex */
public final class r extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8223a = 1;

    /* renamed from: b, reason: collision with root package name */
    public m f8224b;

    public /* synthetic */ r() {
    }

    @Override // X0.n, X0.j
    public void f(m mVar) {
        switch (this.f8223a) {
            case 1:
                C0426a c0426a = (C0426a) this.f8224b;
                if (!c0426a.f8160D) {
                    c0426a.J();
                    c0426a.f8160D = true;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // X0.j
    public final void g(m mVar) {
        switch (this.f8223a) {
            case 0:
                this.f8224b.C();
                mVar.A(this);
                return;
            default:
                C0426a c0426a = (C0426a) this.f8224b;
                int i9 = c0426a.f8159C - 1;
                c0426a.f8159C = i9;
                if (i9 == 0) {
                    c0426a.f8160D = false;
                    c0426a.o();
                }
                mVar.A(this);
                return;
        }
    }

    public r(m mVar) {
        this.f8224b = mVar;
    }
}
