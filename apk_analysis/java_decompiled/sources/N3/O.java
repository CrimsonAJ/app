package N3;

/* loaded from: classes.dex */
public final /* synthetic */ class O implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4949a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f4950b;

    public /* synthetic */ O(T t7, int i9) {
        this.f4949a = i9;
        this.f4950b = t7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4949a) {
            case 0:
                this.f4950b.n();
                return;
            case 1:
                T t7 = this.f4950b;
                if (!t7.f4987i0) {
                    InterfaceC0271w interfaceC0271w = t7.f4993p;
                    interfaceC0271w.getClass();
                    interfaceC0271w.v(t7);
                    return;
                }
                return;
            default:
                this.f4950b.f4973X = true;
                return;
        }
    }
}
