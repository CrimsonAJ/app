package e1;

/* loaded from: classes.dex */
public final class o extends p {

    /* renamed from: a, reason: collision with root package name */
    public final h f17059a;

    public o(h hVar) {
        this.f17059a = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            return this.f17059a.equals(((o) obj).f17059a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17059a.hashCode() + (o.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f17059a + '}';
    }
}
