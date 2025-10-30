package N3;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final int f4965a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4966b;

    public S(int i9, boolean z9) {
        this.f4965a = i9;
        this.f4966b = z9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && S.class == obj.getClass()) {
                S s9 = (S) obj;
                if (this.f4965a == s9.f4965a && this.f4966b == s9.f4966b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f4965a * 31) + (this.f4966b ? 1 : 0);
    }
}
