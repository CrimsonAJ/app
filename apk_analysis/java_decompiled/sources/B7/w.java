package B7;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f1138a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1139b;

    public w(int i9, Object obj) {
        this.f1138a = i9;
        this.f1139b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f1138a == wVar.f1138a && kotlin.jvm.internal.h.a(this.f1139b, wVar.f1139b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i9 = this.f1138a * 31;
        Object obj = this.f1139b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return i9 + hashCode;
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f1138a + ", value=" + this.f1139b + ')';
    }
}
