package g2;

/* renamed from: g2.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1211M implements InterfaceC1214P {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17581a;

    public C1211M(boolean z9) {
        this.f17581a = z9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1211M) || this.f17581a != ((C1211M) obj).f17581a) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f17581a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return "Continue(allow=" + this.f17581a + ")";
    }
}
