package j3;

/* renamed from: j3.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1473y implements l4.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19763a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f19764b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19765c;

    public /* synthetic */ C1473y(int i9, int i10, boolean z9) {
        this.f19763a = i10;
        this.f19764b = z9;
        this.f19765c = i9;
    }

    @Override // l4.i
    public final void invoke(Object obj) {
        p0 p0Var = (p0) obj;
        switch (this.f19763a) {
            case 0:
                p0Var.M(this.f19765c, this.f19764b);
                return;
            case 1:
                p0Var.q(this.f19765c, this.f19764b);
                return;
            default:
                p0Var.s(this.f19765c, this.f19764b);
                return;
        }
    }

    public /* synthetic */ C1473y(int i9, boolean z9) {
        this.f19763a = 0;
        this.f19765c = i9;
        this.f19764b = z9;
    }
}
