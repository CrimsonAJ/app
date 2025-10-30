package D4;

/* renamed from: D4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0090i {

    /* renamed from: a, reason: collision with root package name */
    public final y4.i f1857a;

    public C0090i(y4.i iVar) {
        this.f1857a = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0090i) {
            if (this.f1857a == ((C0090i) obj).f1857a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f1857a) * 31) + 1520230490;
    }
}
