package E7;

import O7.p;

/* loaded from: classes.dex */
public abstract class a implements g {
    private final h key;

    public a(h key) {
        kotlin.jvm.internal.h.e(key, "key");
        this.key = key;
    }

    @Override // E7.i
    public <R> R fold(R r5, p operation) {
        kotlin.jvm.internal.h.e(operation, "operation");
        return (R) operation.invoke(r5, this);
    }

    @Override // E7.i
    public <E extends g> E get(h hVar) {
        return (E) O4.h.r(this, hVar);
    }

    @Override // E7.g
    public h getKey() {
        return this.key;
    }

    @Override // E7.i
    public i minusKey(h hVar) {
        return O4.h.B(this, hVar);
    }

    @Override // E7.i
    public i plus(i iVar) {
        return O4.h.D(this, iVar);
    }
}
