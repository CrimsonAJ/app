package Y7;

/* loaded from: classes.dex */
public final class m0 extends C0464h {

    /* renamed from: i, reason: collision with root package name */
    public final r0 f8823i;

    public m0(E7.d dVar, r0 r0Var) {
        super(1, dVar);
        this.f8823i = r0Var;
    }

    @Override // Y7.C0464h
    public final Throwable q(r0 r0Var) {
        Throwable c3;
        Object D8 = this.f8823i.D();
        if ((D8 instanceof o0) && (c3 = ((o0) D8).c()) != null) {
            return c3;
        }
        if (D8 instanceof C0476q) {
            return ((C0476q) D8).f8842a;
        }
        return r0Var.I();
    }

    @Override // Y7.C0464h
    public final String y() {
        return "AwaitContinuation";
    }
}
