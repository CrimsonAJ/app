package B6;

/* loaded from: classes.dex */
public final class V extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f869a;

    /* renamed from: b, reason: collision with root package name */
    public final String f870b;

    /* renamed from: c, reason: collision with root package name */
    public final long f871c;

    public V(long j, String str, String str2) {
        this.f869a = str;
        this.f870b = str2;
        this.f871c = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z0) {
            z0 z0Var = (z0) obj;
            if (this.f869a.equals(((V) z0Var).f869a)) {
                V v8 = (V) z0Var;
                if (this.f870b.equals(v8.f870b) && this.f871c == v8.f871c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.f869a.hashCode() ^ 1000003) * 1000003) ^ this.f870b.hashCode()) * 1000003;
        long j = this.f871c;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.f869a);
        sb.append(", code=");
        sb.append(this.f870b);
        sb.append(", address=");
        return A0.a.o(sb, this.f871c, "}");
    }
}
