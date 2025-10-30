package B6;

/* renamed from: B6.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0021f0 extends I0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0023g0 f948a;

    /* renamed from: b, reason: collision with root package name */
    public final String f949b;

    /* renamed from: c, reason: collision with root package name */
    public final String f950c;

    /* renamed from: d, reason: collision with root package name */
    public final long f951d;

    public C0021f0(C0023g0 c0023g0, String str, String str2, long j) {
        this.f948a = c0023g0;
        this.f949b = str;
        this.f950c = str2;
        this.f951d = j;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof I0) {
                C0021f0 c0021f0 = (C0021f0) ((I0) obj);
                if (this.f948a.equals(c0021f0.f948a)) {
                    if (this.f949b.equals(c0021f0.f949b) && this.f950c.equals(c0021f0.f950c) && this.f951d == c0021f0.f951d) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (((((this.f948a.hashCode() ^ 1000003) * 1000003) ^ this.f949b.hashCode()) * 1000003) ^ this.f950c.hashCode()) * 1000003;
        long j = this.f951d;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.f948a);
        sb.append(", parameterKey=");
        sb.append(this.f949b);
        sb.append(", parameterValue=");
        sb.append(this.f950c);
        sb.append(", templateVersion=");
        return A0.a.o(sb, this.f951d, "}");
    }
}
