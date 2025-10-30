package T1;

import java.util.List;

/* loaded from: classes.dex */
public final class m extends o {

    /* renamed from: a, reason: collision with root package name */
    public final List f7028a;

    public m(List list) {
        kotlin.jvm.internal.h.e(list, "list");
        this.f7028a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && kotlin.jvm.internal.h.a(this.f7028a, ((m) obj).f7028a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7028a.hashCode();
    }

    public final String toString() {
        return "GetPlayers(list=" + this.f7028a + ")";
    }
}
