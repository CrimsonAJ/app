package X2;

/* loaded from: classes.dex */
public final class o extends A {

    /* renamed from: a, reason: collision with root package name */
    public final r f8386a;

    public o(r rVar) {
        z zVar = z.f8411a;
        this.f8386a = rVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof A) {
                A a5 = (A) obj;
                if (this.f8386a.equals(((o) a5).f8386a)) {
                    Object obj2 = z.f8411a;
                    ((o) a5).getClass();
                    if (obj2.equals(obj2)) {
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
        return ((this.f8386a.hashCode() ^ 1000003) * 1000003) ^ z.f8411a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f8386a + ", productIdOrigin=" + z.f8411a + "}";
    }
}
