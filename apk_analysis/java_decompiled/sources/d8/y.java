package d8;

/* loaded from: classes.dex */
public final class y implements E7.g {

    /* renamed from: a, reason: collision with root package name */
    public final I0.s f17014a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadLocal f17015b;

    /* renamed from: c, reason: collision with root package name */
    public final z f17016c;

    public y(I0.s sVar, ThreadLocal threadLocal) {
        this.f17014a = sVar;
        this.f17015b = threadLocal;
        this.f17016c = new z(threadLocal);
    }

    public final void b(Object obj) {
        this.f17015b.set(obj);
    }

    public final Object c(E7.i iVar) {
        ThreadLocal threadLocal = this.f17015b;
        Object obj = threadLocal.get();
        threadLocal.set(this.f17014a);
        return obj;
    }

    @Override // E7.i
    public final Object fold(Object obj, O7.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // E7.i
    public final E7.g get(E7.h hVar) {
        if (this.f17016c.equals(hVar)) {
            return this;
        }
        return null;
    }

    @Override // E7.g
    public final E7.h getKey() {
        return this.f17016c;
    }

    @Override // E7.i
    public final E7.i minusKey(E7.h hVar) {
        if (this.f17016c.equals(hVar)) {
            return E7.j.f1978a;
        }
        return this;
    }

    @Override // E7.i
    public final E7.i plus(E7.i iVar) {
        return O4.h.D(this, iVar);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f17014a + ", threadLocal = " + this.f17015b + ')';
    }
}
