package e1;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f17041a = new HashSet();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            return this.f17041a.equals(((e) obj).f17041a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17041a.hashCode();
    }
}
