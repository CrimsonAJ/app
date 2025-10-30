package B6;

import java.util.List;

/* renamed from: B6.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0025h0 extends J0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f963a;

    public C0025h0(List list) {
        this.f963a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof J0) {
            return this.f963a.equals(((C0025h0) ((J0) obj)).f963a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f963a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f963a + "}";
    }
}
