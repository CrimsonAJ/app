package P1;

/* loaded from: classes.dex */
public final class t extends w {

    /* renamed from: a, reason: collision with root package name */
    public final int f5749a;

    public t(int i9) {
        this.f5749a = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof t) && this.f5749a == ((t) obj).f5749a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5749a;
    }

    public final String toString() {
        return u0.z.g(new StringBuilder("DeleteVoteComment(index="), this.f5749a, ")");
    }
}
