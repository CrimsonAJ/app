package X2;

/* loaded from: classes.dex */
public final class v extends I {

    /* renamed from: a, reason: collision with root package name */
    public final H f8407a;

    /* renamed from: b, reason: collision with root package name */
    public final G f8408b;

    public v(H h7, G g9) {
        this.f8407a = h7;
        this.f8408b = g9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof I) {
            I i9 = (I) obj;
            H h7 = this.f8407a;
            if (h7 != null ? h7.equals(((v) i9).f8407a) : ((v) i9).f8407a == null) {
                G g9 = this.f8408b;
                if (g9 != null ? g9.equals(((v) i9).f8408b) : ((v) i9).f8408b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i9 = 0;
        H h7 = this.f8407a;
        if (h7 == null) {
            hashCode = 0;
        } else {
            hashCode = h7.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        G g9 = this.f8408b;
        if (g9 != null) {
            i9 = g9.hashCode();
        }
        return i9 ^ i10;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f8407a + ", mobileSubtype=" + this.f8408b + "}";
    }
}
