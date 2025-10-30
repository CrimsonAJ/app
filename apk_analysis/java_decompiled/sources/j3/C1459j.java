package j3;

import b5.C0617c0;

/* renamed from: j3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1459j implements l4.m {

    /* renamed from: a, reason: collision with root package name */
    public final C0617c0 f19652a;

    /* renamed from: b, reason: collision with root package name */
    public final J f19653b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC1449d f19654c;

    /* renamed from: d, reason: collision with root package name */
    public l4.m f19655d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19656e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19657f;

    public C1459j(J j, l4.u uVar) {
        this.f19653b = j;
        this.f19652a = new C0617c0(uVar);
    }

    @Override // l4.m
    public final void a(m0 m0Var) {
        l4.m mVar = this.f19655d;
        if (mVar != null) {
            mVar.a(m0Var);
            m0Var = this.f19655d.c();
        }
        this.f19652a.a(m0Var);
    }

    @Override // l4.m
    public final long b() {
        if (this.f19656e) {
            return this.f19652a.b();
        }
        l4.m mVar = this.f19655d;
        mVar.getClass();
        return mVar.b();
    }

    @Override // l4.m
    public final m0 c() {
        l4.m mVar = this.f19655d;
        if (mVar != null) {
            return mVar.c();
        }
        return (m0) this.f19652a.f11053e;
    }
}
