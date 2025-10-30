package f3;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f17337a;

    /* renamed from: b, reason: collision with root package name */
    public final Y2.j f17338b;

    /* renamed from: c, reason: collision with root package name */
    public final Y2.i f17339c;

    public b(long j, Y2.j jVar, Y2.i iVar) {
        this.f17337a = j;
        this.f17338b = jVar;
        this.f17339c = iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f17337a == bVar.f17337a && this.f17338b.equals(bVar.f17338b) && this.f17339c.equals(bVar.f17339c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f17337a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f17338b.hashCode()) * 1000003) ^ this.f17339c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f17337a + ", transportContext=" + this.f17338b + ", event=" + this.f17339c + "}";
    }
}
