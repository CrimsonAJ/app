package H2;

import java.util.List;

/* loaded from: classes.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    public final List f3037a;

    public m(List list) {
        kotlin.jvm.internal.h.e(list, "list");
        this.f3037a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && kotlin.jvm.internal.h.a(this.f3037a, ((m) obj).f3037a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3037a.hashCode();
    }

    public final String toString() {
        return "SliderRow(list=" + this.f3037a + ")";
    }
}
