package A7;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class h implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f547a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f548b;

    public h(Object obj, Object obj2) {
        this.f547a = obj;
        this.f548b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (kotlin.jvm.internal.h.a(this.f547a, hVar.f547a) && kotlin.jvm.internal.h.a(this.f548b, hVar.f548b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i9 = 0;
        Object obj = this.f547a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = hashCode * 31;
        Object obj2 = this.f548b;
        if (obj2 != null) {
            i9 = obj2.hashCode();
        }
        return i10 + i9;
    }

    public final String toString() {
        return "(" + this.f547a + ", " + this.f548b + ')';
    }
}
