package A7;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class i implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f549a;

    public i(Throwable exception) {
        kotlin.jvm.internal.h.e(exception, "exception");
        this.f549a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            if (kotlin.jvm.internal.h.a(this.f549a, ((i) obj).f549a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f549a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f549a + ')';
    }
}
