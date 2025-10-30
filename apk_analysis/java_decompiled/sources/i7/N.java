package i7;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final X f18773a;

    /* renamed from: b, reason: collision with root package name */
    public final C1387b f18774b;

    public N(X x5, C1387b c1387b) {
        this.f18773a = x5;
        this.f18774b = c1387b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N) {
                N n7 = (N) obj;
                n7.getClass();
                if (!this.f18773a.equals(n7.f18773a) || !this.f18774b.equals(n7.f18774b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f18774b.hashCode() + ((this.f18773a.hashCode() + (EnumC1399n.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + EnumC1399n.SESSION_START + ", sessionData=" + this.f18773a + ", applicationInfo=" + this.f18774b + ')';
    }
}
