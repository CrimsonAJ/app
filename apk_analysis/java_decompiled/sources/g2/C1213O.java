package g2;

/* renamed from: g2.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1213O implements InterfaceC1214P {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17583a;

    public C1213O(boolean z9) {
        this.f17583a = z9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1213O) || this.f17583a != ((C1213O) obj).f17583a) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f17583a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return "Play(allow=" + this.f17583a + ")";
    }
}
