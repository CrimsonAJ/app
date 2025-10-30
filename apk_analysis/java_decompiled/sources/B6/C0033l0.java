package B6;

/* renamed from: B6.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0033l0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0035m0 f1008a;

    /* renamed from: b, reason: collision with root package name */
    public final C0039o0 f1009b;

    /* renamed from: c, reason: collision with root package name */
    public final C0037n0 f1010c;

    public C0033l0(C0035m0 c0035m0, C0039o0 c0039o0, C0037n0 c0037n0) {
        this.f1008a = c0035m0;
        this.f1009b = c0039o0;
        this.f1010c = c0037n0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0033l0) {
            C0033l0 c0033l0 = (C0033l0) obj;
            if (this.f1008a.equals(c0033l0.f1008a) && this.f1009b.equals(c0033l0.f1009b) && this.f1010c.equals(c0033l0.f1010c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f1008a.hashCode() ^ 1000003) * 1000003) ^ this.f1009b.hashCode()) * 1000003) ^ this.f1010c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f1008a + ", osData=" + this.f1009b + ", deviceData=" + this.f1010c + "}";
    }
}
