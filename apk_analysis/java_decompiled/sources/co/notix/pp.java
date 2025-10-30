package co.notix;

/* loaded from: classes.dex */
public final class pp {

    /* renamed from: a, reason: collision with root package name */
    public final np f12994a;

    /* renamed from: b, reason: collision with root package name */
    public final op f12995b;

    public pp(np npVar, op opVar) {
        this.f12994a = npVar;
        this.f12995b = opVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp)) {
            return false;
        }
        pp ppVar = (pp) obj;
        return kotlin.jvm.internal.h.a(this.f12994a, ppVar.f12994a) && kotlin.jvm.internal.h.a(this.f12995b, ppVar.f12995b);
    }

    public final int hashCode() {
        np npVar = this.f12994a;
        int hashCode = (npVar == null ? 0 : npVar.hashCode()) * 31;
        op opVar = this.f12995b;
        return hashCode + (opVar != null ? opVar.hashCode() : 0);
    }

    public final String toString() {
        return "Notification(pull=" + this.f12994a + ", push=" + this.f12995b + ')';
    }
}
