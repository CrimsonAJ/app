package X2;

/* loaded from: classes.dex */
public final class r extends D {

    /* renamed from: a, reason: collision with root package name */
    public final q f8390a;

    public r(q qVar) {
        this.f8390a = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof D) {
            return this.f8390a.equals(((r) ((D) obj)).f8390a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8390a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f8390a + "}";
    }
}
