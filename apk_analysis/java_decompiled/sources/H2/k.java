package H2;

import com.anilab.domain.model.Shortcut;
import java.util.List;

/* loaded from: classes.dex */
public final class k implements n {

    /* renamed from: a, reason: collision with root package name */
    public final Shortcut f3033a;

    /* renamed from: b, reason: collision with root package name */
    public final List f3034b;

    public k(Shortcut shortcut, List list) {
        kotlin.jvm.internal.h.e(list, "list");
        this.f3033a = shortcut;
        this.f3034b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (kotlin.jvm.internal.h.a(this.f3033a, kVar.f3033a) && kotlin.jvm.internal.h.a(this.f3034b, kVar.f3034b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3034b.hashCode() + (this.f3033a.hashCode() * 31);
    }

    public final String toString() {
        return "ContinueWatchRow(shortcut=" + this.f3033a + ", list=" + this.f3034b + ")";
    }
}
