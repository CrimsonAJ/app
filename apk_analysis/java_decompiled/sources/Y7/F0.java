package Y7;

/* loaded from: classes.dex */
public final class F0 extends AbstractC0480v {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8765b = 0;

    static {
        new AbstractC0480v();
    }

    @Override // Y7.AbstractC0480v
    public final void g0(E7.i iVar, Runnable runnable) {
        J0 j02 = (J0) iVar.get(J0.f8771b);
        if (j02 != null) {
            j02.f8772a = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // Y7.AbstractC0480v
    public final AbstractC0480v j0(int i9) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // Y7.AbstractC0480v
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
