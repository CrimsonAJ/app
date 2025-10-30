package b5;

/* renamed from: b5.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0639j1 extends AbstractC0652o {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11162e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0648m1 f11163f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0639j1(C0648m1 c0648m1, C0650n0 c0650n0, int i9) {
        super(c0650n0);
        this.f11162e = i9;
        this.f11163f = c0648m1;
    }

    @Override // b5.AbstractC0652o
    public final void b() {
        switch (this.f11162e) {
            case 0:
                C0648m1 c0648m1 = this.f11163f;
                c0648m1.l0();
                if (c0648m1.v0()) {
                    V v8 = ((C0650n0) c0648m1.f1707a).f11229i;
                    C0650n0.f(v8);
                    v8.f10978n.b("Inactivity, disconnecting from the service");
                    c0648m1.q0();
                    return;
                }
                return;
            default:
                V v9 = ((C0650n0) this.f11163f.f1707a).f11229i;
                C0650n0.f(v9);
                v9.f10974i.b("Tasks have been queued for a long time");
                return;
        }
    }
}
