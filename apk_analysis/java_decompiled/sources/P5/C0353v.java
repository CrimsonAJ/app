package P5;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: P5.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0353v extends Q implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparator f6010a;

    public C0353v(Comparator comparator) {
        this.f6010a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f6010a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0353v) {
            return this.f6010a.equals(((C0353v) obj).f6010a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6010a.hashCode();
    }

    public final String toString() {
        return this.f6010a.toString();
    }
}
