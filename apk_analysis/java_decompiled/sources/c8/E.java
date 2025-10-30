package c8;

/* loaded from: classes.dex */
public final class E implements E7.d, G7.d {

    /* renamed from: a, reason: collision with root package name */
    public final E7.d f11741a;

    /* renamed from: b, reason: collision with root package name */
    public final E7.i f11742b;

    public E(E7.d dVar, E7.i iVar) {
        this.f11741a = dVar;
        this.f11742b = iVar;
    }

    @Override // G7.d
    public final G7.d getCallerFrame() {
        E7.d dVar = this.f11741a;
        if (dVar instanceof G7.d) {
            return (G7.d) dVar;
        }
        return null;
    }

    @Override // E7.d
    public final E7.i getContext() {
        return this.f11742b;
    }

    @Override // E7.d
    public final void resumeWith(Object obj) {
        this.f11741a.resumeWith(obj);
    }
}
