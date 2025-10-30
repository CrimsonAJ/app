package D4;

/* loaded from: classes.dex */
public final class r implements InterfaceC0084c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0088g f1877a;

    public r(C0088g c0088g) {
        this.f1877a = c0088g;
    }

    @Override // D4.InterfaceC0084c
    public final void a(boolean z9) {
        T4.d dVar = this.f1877a.f1855n;
        dVar.sendMessage(dVar.obtainMessage(1, Boolean.valueOf(z9)));
    }
}
