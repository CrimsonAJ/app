package d8;

/* loaded from: classes.dex */
public final class z implements E7.h {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal f17017a;

    public z(ThreadLocal threadLocal) {
        this.f17017a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof z) && kotlin.jvm.internal.h.a(this.f17017a, ((z) obj).f17017a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17017a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f17017a + ')';
    }
}
