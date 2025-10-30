package co.notix;

/* renamed from: co.notix.do, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cdo implements eo {

    /* renamed from: a, reason: collision with root package name */
    public final String f12119a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12120b;

    public Cdo(String data) {
        kotlin.jvm.internal.h.e(data, "data");
        this.f12119a = data;
        this.f12120b = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cdo)) {
            return false;
        }
        Cdo cdo = (Cdo) obj;
        if (kotlin.jvm.internal.h.a(this.f12119a, cdo.f12119a) && this.f12120b == cdo.f12120b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f12119a.hashCode() * 31;
        boolean z9 = this.f12120b;
        int i9 = z9;
        if (z9 != 0) {
            i9 = 1;
        }
        return hashCode + i9;
    }

    public final String toString() {
        return "Post(data=" + this.f12119a + ", addInstanceInfo=" + this.f12120b + ')';
    }
}
