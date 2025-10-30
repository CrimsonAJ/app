package c8;

/* loaded from: classes.dex */
public final class t implements E7.i {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f11805a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E7.i f11806b;

    public t(E7.i iVar, Throwable th) {
        this.f11805a = th;
        this.f11806b = iVar;
    }

    @Override // E7.i
    public final Object fold(Object obj, O7.p pVar) {
        return this.f11806b.fold(obj, pVar);
    }

    @Override // E7.i
    public final E7.g get(E7.h hVar) {
        return this.f11806b.get(hVar);
    }

    @Override // E7.i
    public final E7.i minusKey(E7.h hVar) {
        return this.f11806b.minusKey(hVar);
    }

    @Override // E7.i
    public final E7.i plus(E7.i iVar) {
        return this.f11806b.plus(iVar);
    }
}
