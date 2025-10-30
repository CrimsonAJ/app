package j3;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: b, reason: collision with root package name */
    public static final w0 f19758b = new w0(false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19759a;

    public w0(boolean z9) {
        this.f19759a = z9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && w0.class == obj.getClass() && this.f19759a == ((w0) obj).f19759a) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return !this.f19759a ? 1 : 0;
    }
}
