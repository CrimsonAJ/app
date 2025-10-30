package G7;

/* loaded from: classes.dex */
public abstract class h extends a {
    public h(E7.d dVar) {
        super(dVar);
        if (dVar != null && dVar.getContext() != E7.j.f1978a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // E7.d
    public final E7.i getContext() {
        return E7.j.f1978a;
    }
}
