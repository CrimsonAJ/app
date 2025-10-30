package H2;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Long f3049a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3050b;

    public r(Long l9, boolean z9) {
        this.f3049a = l9;
        this.f3050b = z9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r) {
                r rVar = (r) obj;
                if (!this.f3049a.equals(rVar.f3049a) || this.f3050b != rVar.f3050b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i9;
        int hashCode = this.f3049a.hashCode() * 31;
        if (this.f3050b) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        return hashCode + i9;
    }

    public final String toString() {
        return "OptionalData(data=" + this.f3049a + ", isPresent=" + this.f3050b + ")";
    }
}
