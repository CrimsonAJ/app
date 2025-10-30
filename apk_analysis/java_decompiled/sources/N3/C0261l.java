package N3;

/* renamed from: N3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0261l implements O5.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5145a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5146b;

    public /* synthetic */ C0261l(int i9, Object obj) {
        this.f5145a = i9;
        this.f5146b = obj;
    }

    @Override // O5.n
    public final Object get() {
        switch (this.f5145a) {
            case 0:
                try {
                    return (InterfaceC0274z) ((Class) this.f5146b).getConstructor(null).newInstance(null);
                } catch (Exception e8) {
                    throw new IllegalStateException(e8);
                }
            case 1:
                return (S2.a) this.f5146b;
            case 2:
                return (C0262m) this.f5146b;
            default:
                return Boolean.valueOf(((j3.J) this.f5146b).f19385y);
        }
    }
}
