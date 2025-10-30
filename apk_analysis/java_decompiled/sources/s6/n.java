package s6;

/* loaded from: classes.dex */
public final class n implements S6.b {

    /* renamed from: c, reason: collision with root package name */
    public static final k8.a f22778c = new k8.a(13);

    /* renamed from: d, reason: collision with root package name */
    public static final c7.l f22779d = new c7.l(3);

    /* renamed from: a, reason: collision with root package name */
    public S6.a f22780a;

    /* renamed from: b, reason: collision with root package name */
    public volatile S6.b f22781b;

    public n(k8.a aVar, S6.b bVar) {
        this.f22780a = aVar;
        this.f22781b = bVar;
    }

    public final void a(S6.a aVar) {
        S6.b bVar;
        S6.b bVar2;
        S6.b bVar3 = this.f22781b;
        c7.l lVar = f22779d;
        if (bVar3 != lVar) {
            aVar.h(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f22781b;
            if (bVar != lVar) {
                bVar2 = bVar;
            } else {
                this.f22780a = new N1.h(this.f22780a, 22, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.h(bVar);
        }
    }

    @Override // S6.b
    public final Object get() {
        return this.f22781b.get();
    }
}
