package A7;

/* loaded from: classes.dex */
public final class d implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final d f543b = new d();

    /* renamed from: a, reason: collision with root package name */
    public final int f544a = 131338;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d other = (d) obj;
        kotlin.jvm.internal.h.e(other, "other");
        return this.f544a - other.f544a;
    }

    public final boolean equals(Object obj) {
        d dVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            dVar = (d) obj;
        } else {
            dVar = null;
        }
        if (dVar != null && this.f544a == dVar.f544a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f544a;
    }

    public final String toString() {
        return "2.1.10";
    }
}
