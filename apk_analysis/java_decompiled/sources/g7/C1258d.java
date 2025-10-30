package g7;

import java.util.HashSet;

/* renamed from: g7.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1258d {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f17779a;

    public C1258d(HashSet hashSet) {
        this.f17779a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1258d) {
            return this.f17779a.equals(((C1258d) obj).f17779a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17779a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f17779a + "}";
    }
}
