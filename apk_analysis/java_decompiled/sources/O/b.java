package O;

import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5248a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5249b;

    public b(Object obj, Object obj2) {
        this.f5248a = obj;
        this.f5249b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f5248a, this.f5248a) || !Objects.equals(bVar.f5249b, this.f5249b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i9 = 0;
        Object obj = this.f5248a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f5249b;
        if (obj2 != null) {
            i9 = obj2.hashCode();
        }
        return i9 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f5248a + " " + this.f5249b + "}";
    }
}
