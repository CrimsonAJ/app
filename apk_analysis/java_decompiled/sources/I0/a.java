package I0;

/* loaded from: classes.dex */
public final class a implements E7.g {

    /* renamed from: b, reason: collision with root package name */
    public static final F5.e f3187b = new F5.e(8);

    /* renamed from: a, reason: collision with root package name */
    public final s f3188a;

    public a(s connectionWrapper) {
        kotlin.jvm.internal.h.e(connectionWrapper, "connectionWrapper");
        this.f3188a = connectionWrapper;
    }

    @Override // E7.i
    public final Object fold(Object obj, O7.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // E7.i
    public final E7.g get(E7.h hVar) {
        return O4.h.r(this, hVar);
    }

    @Override // E7.g
    public final E7.h getKey() {
        return f3187b;
    }

    @Override // E7.i
    public final E7.i minusKey(E7.h hVar) {
        return O4.h.B(this, hVar);
    }

    @Override // E7.i
    public final E7.i plus(E7.i iVar) {
        return O4.h.D(this, iVar);
    }
}
