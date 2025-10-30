package kotlin.jvm.internal;

/* loaded from: classes.dex */
public final class j implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Class f20154a;

    public j(Class jClass) {
        h.e(jClass, "jClass");
        this.f20154a = jClass;
    }

    @Override // kotlin.jvm.internal.c
    public final Class a() {
        return this.f20154a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (h.a(this.f20154a, ((j) obj).f20154a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f20154a.hashCode();
    }

    public final String toString() {
        return this.f20154a + " (Kotlin reflection is not available)";
    }
}
