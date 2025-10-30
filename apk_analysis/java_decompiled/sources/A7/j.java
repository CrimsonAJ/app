package A7;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class j implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f550a;

    public static final Throwable a(Object obj) {
        if (obj instanceof i) {
            return ((i) obj).f549a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (!kotlin.jvm.internal.h.a(this.f550a, ((j) obj).f550a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f550a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f550a;
        if (obj instanceof i) {
            return ((i) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
