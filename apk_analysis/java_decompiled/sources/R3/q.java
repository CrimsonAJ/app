package R3;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final long f6644a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6645b;

    public q(long j, long j4) {
        this.f6644a = j;
        this.f6645b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f6644a == qVar.f6644a && this.f6645b == qVar.f6645b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f6644a) * 31) + ((int) this.f6645b);
    }
}
