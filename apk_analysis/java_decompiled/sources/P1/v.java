package P1;

/* loaded from: classes.dex */
public final class v extends w {

    /* renamed from: a, reason: collision with root package name */
    public final int f5752a;

    public v(int i9) {
        this.f5752a = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof v) && this.f5752a == ((v) obj).f5752a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5752a;
    }

    public final String toString() {
        return u0.z.g(new StringBuilder("VoteComment(index="), this.f5752a, ")");
    }
}
