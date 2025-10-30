package X1;

/* loaded from: classes.dex */
public final /* synthetic */ class A implements O7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8231a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f8232b;

    public /* synthetic */ A(F f9, int i9) {
        this.f8231a = i9;
        this.f8232b = f9;
    }

    @Override // O7.a
    public final Object invoke() {
        switch (this.f8231a) {
            case 0:
                F f9 = this.f8232b;
                return new C0434c(new B(f9), new C(f9, 0));
            default:
                return new r(new C(this.f8232b, 1));
        }
    }
}
