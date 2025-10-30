package O5;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public final class k implements j, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final List f5496a;

    public k(List list) {
        this.f5496a = list;
    }

    @Override // O5.j
    public final boolean apply(Object obj) {
        int i9 = 0;
        while (true) {
            List list = this.f5496a;
            if (i9 < list.size()) {
                if (!((j) list.get(i9)).apply(obj)) {
                    return false;
                }
                i9++;
            } else {
                return true;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f5496a.equals(((k) obj).f5496a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5496a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z9 = true;
        for (Object obj : this.f5496a) {
            if (!z9) {
                sb.append(',');
            }
            sb.append(obj);
            z9 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
