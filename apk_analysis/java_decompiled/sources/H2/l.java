package H2;

import com.anilab.domain.model.Shortcut;
import java.util.List;

/* loaded from: classes.dex */
public final class l implements n {

    /* renamed from: a, reason: collision with root package name */
    public final Shortcut f3035a;

    /* renamed from: b, reason: collision with root package name */
    public final List f3036b;

    public l(Shortcut shortcut, List list) {
        kotlin.jvm.internal.h.e(list, "list");
        this.f3035a = shortcut;
        this.f3036b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (kotlin.jvm.internal.h.a(this.f3035a, lVar.f3035a) && kotlin.jvm.internal.h.a(this.f3036b, lVar.f3036b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3036b.hashCode() + (this.f3035a.hashCode() * 31);
    }

    public final String toString() {
        return "MovieListRow(shortcut=" + this.f3035a + ", list=" + this.f3036b + ")";
    }
}
