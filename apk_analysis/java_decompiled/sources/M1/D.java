package M1;

/* loaded from: classes.dex */
public final class D implements E {

    /* renamed from: a, reason: collision with root package name */
    public final int f4704a;

    public D(int i9) {
        this.f4704a = i9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof D) || this.f4704a != ((D) obj).f4704a) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f4704a;
    }

    public final String toString() {
        return u0.z.g(new StringBuilder("TextId(value="), this.f4704a, ")");
    }
}
