package s6;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final p f22765a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22766b;

    public g(p pVar, boolean z9) {
        this.f22765a = pVar;
        this.f22766b = z9;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (gVar.f22765a.equals(this.f22765a) && gVar.f22766b == this.f22766b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f22765a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f22766b).hashCode();
    }
}
