package e1;

/* loaded from: classes.dex */
public final class m extends p {

    /* renamed from: a, reason: collision with root package name */
    public final h f17058a = h.f17049c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            return this.f17058a.equals(((m) obj).f17058a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17058a.hashCode() + (m.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f17058a + '}';
    }
}
