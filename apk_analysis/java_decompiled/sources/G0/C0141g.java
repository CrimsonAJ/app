package G0;

/* renamed from: G0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0141g implements O7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2764a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0145k f2765b;

    public /* synthetic */ C0141g(C0145k c0145k, int i9) {
        this.f2764a = i9;
        this.f2765b = c0145k;
    }

    @Override // O7.a
    public final Object invoke() {
        boolean z9;
        switch (this.f2764a) {
            case 0:
                this.f2765b.getClass();
                return A7.n.f558a;
            case 1:
                this.f2765b.getClass();
                return A7.n.f558a;
            default:
                C0145k c0145k = this.f2765b;
                if (c0145k.f2771a.l() && !c0145k.f2771a.o()) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                return Boolean.valueOf(z9);
        }
    }
}
