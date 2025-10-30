package X2;

/* loaded from: classes.dex */
public final class n extends y {

    /* renamed from: a, reason: collision with root package name */
    public final l f8385a;

    public n(l lVar) {
        this.f8385a = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof y) {
                y yVar = (y) obj;
                Object obj2 = x.f8409a;
                ((n) yVar).getClass();
                if (obj2.equals(obj2) && this.f8385a.equals(((n) yVar).f8385a)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((x.f8409a.hashCode() ^ 1000003) * 1000003) ^ this.f8385a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + x.f8409a + ", androidClientInfo=" + this.f8385a + "}";
    }
}
