package j3;

/* renamed from: j3.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1470v implements l4.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19752a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f19753b;

    public /* synthetic */ C1470v(int i9, boolean z9) {
        this.f19752a = i9;
        this.f19753b = z9;
    }

    @Override // l4.i
    public final void invoke(Object obj) {
        p0 p0Var = (p0) obj;
        switch (this.f19752a) {
            case 0:
                p0Var.C(this.f19753b);
                return;
            case 1:
                p0Var.n(this.f19753b);
                return;
            default:
                p0Var.N(this.f19753b);
                return;
        }
    }
}
