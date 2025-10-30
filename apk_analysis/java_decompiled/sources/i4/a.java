package i4;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f18488a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18489b;

    public a(long j, long j4) {
        this.f18488a = j;
        this.f18489b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f18488a == aVar.f18488a && this.f18489b == aVar.f18489b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f18488a) * 31) + ((int) this.f18489b);
    }
}
