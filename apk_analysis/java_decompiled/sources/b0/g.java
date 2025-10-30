package b0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f10466a;

    public g(String str) {
        this.f10466a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return kotlin.jvm.internal.h.a(this.f10466a, ((g) obj).f10466a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10466a.hashCode();
    }

    public final String toString() {
        return this.f10466a;
    }
}
