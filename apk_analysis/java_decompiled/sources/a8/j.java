package a8;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f9228a;

    public j(Throwable th) {
        this.f9228a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (kotlin.jvm.internal.h.a(this.f9228a, ((j) obj).f9228a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f9228a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // a8.k
    public final String toString() {
        return "Closed(" + this.f9228a + ')';
    }
}
