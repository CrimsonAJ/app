package q3;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name */
    public static final s f22344c = new s(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f22345a;

    /* renamed from: b, reason: collision with root package name */
    public final long f22346b;

    public s(long j, long j4) {
        this.f22345a = j;
        this.f22346b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (this.f22345a == sVar.f22345a && this.f22346b == sVar.f22346b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f22345a) * 31) + ((int) this.f22346b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f22345a);
        sb.append(", position=");
        return A0.a.o(sb, this.f22346b, "]");
    }
}
