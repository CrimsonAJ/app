package a8;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final k f9229b = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f9230a;

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            if (!kotlin.jvm.internal.h.a(this.f9230a, ((l) obj).f9230a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f9230a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f9230a;
        if (obj instanceof j) {
            return ((j) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
