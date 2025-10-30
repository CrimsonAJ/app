package C1;

import B7.u;
import java.util.Map;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    public static final q f1241b = new q(u.f1136a);

    /* renamed from: a, reason: collision with root package name */
    public final Map f1242a;

    public q(Map map) {
        this.f1242a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            if (kotlin.jvm.internal.h.a(this.f1242a, ((q) obj).f1242a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1242a.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.f1242a + ')';
    }
}
