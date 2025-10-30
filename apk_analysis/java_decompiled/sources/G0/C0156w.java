package G0;

/* renamed from: G0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0156w extends Q0.b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f2809c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0156w(y yVar, int i9) {
        super(i9, 0);
        this.f2809c = yVar;
    }

    @Override // Q0.b
    public final void l(R0.c cVar) {
        this.f2809c.d(new J0.a(cVar));
    }

    @Override // Q0.b
    public final void n(R0.c cVar, int i9, int i10) {
        p(cVar, i9, i10);
    }

    @Override // Q0.b
    public final void o(R0.c cVar) {
        J0.a aVar = new J0.a(cVar);
        y yVar = this.f2809c;
        yVar.f(aVar);
        yVar.f2817g = cVar;
    }

    @Override // Q0.b
    public final void p(R0.c cVar, int i9, int i10) {
        this.f2809c.e(new J0.a(cVar), i9, i10);
    }
}
