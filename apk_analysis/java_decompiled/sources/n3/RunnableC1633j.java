package n3;

/* renamed from: n3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1633j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1635l f21126b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21127c;

    public /* synthetic */ RunnableC1633j(C1635l c1635l, InterfaceC1636m interfaceC1636m, int i9) {
        this.f21125a = i9;
        this.f21126b = c1635l;
        this.f21127c = interfaceC1636m;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [n3.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [n3.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [n3.m, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21125a) {
            case 0:
                C1635l c1635l = this.f21126b;
                this.f21127c.j(c1635l.f21130a, c1635l.f21131b);
                return;
            case 1:
                C1635l c1635l2 = this.f21126b;
                this.f21127c.u(c1635l2.f21130a, c1635l2.f21131b);
                return;
            default:
                C1635l c1635l3 = this.f21126b;
                this.f21127c.L(c1635l3.f21130a, c1635l3.f21131b);
                return;
        }
    }
}
