package l6;

/* renamed from: l6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1569a {

    /* renamed from: a, reason: collision with root package name */
    public final long f20572a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20573b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20574c;

    public C1569a(long j, long j4, long j9) {
        this.f20572a = j;
        this.f20573b = j4;
        this.f20574c = j9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1569a) {
            C1569a c1569a = (C1569a) obj;
            if (this.f20572a == c1569a.f20572a && this.f20573b == c1569a.f20573b && this.f20574c == c1569a.f20574c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f20572a;
        long j4 = this.f20573b;
        int i9 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j9 = this.f20574c;
        return i9 ^ ((int) ((j9 >>> 32) ^ j9));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.f20572a);
        sb.append(", elapsedRealtime=");
        sb.append(this.f20573b);
        sb.append(", uptimeMillis=");
        return A0.a.o(sb, this.f20574c, "}");
    }
}
