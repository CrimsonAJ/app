package co.notix;

/* loaded from: classes.dex */
public final class bb {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11923a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11924b;

    public bb(boolean z9, long j) {
        this.f11923a = z9;
        this.f11924b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb)) {
            return false;
        }
        bb bbVar = (bb) obj;
        return this.f11923a == bbVar.f11923a && this.f11924b == bbVar.f11924b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final int hashCode() {
        boolean z9 = this.f11923a;
        ?? r0 = z9;
        if (z9) {
            r0 = 1;
        }
        long j = this.f11924b;
        return ((int) (j ^ (j >>> 32))) + (r0 * 31);
    }

    public final String toString() {
        return "Step(isForeground=" + this.f11923a + ", timestamp=" + this.f11924b + ')';
    }
}
