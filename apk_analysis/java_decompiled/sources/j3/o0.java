package j3;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final l4.f f19701a;

    public o0(l4.f fVar) {
        this.f19701a = fVar;
    }

    public final boolean a(int... iArr) {
        l4.f fVar = this.f19701a;
        for (int i9 : iArr) {
            if (fVar.f20498a.get(i9)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        return this.f19701a.equals(((o0) obj).f19701a);
    }

    public final int hashCode() {
        return this.f19701a.hashCode();
    }
}
