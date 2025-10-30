package C1;

import B7.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class n implements Iterable, P7.a {

    /* renamed from: b, reason: collision with root package name */
    public static final n f1232b = new n(u.f1136a);

    /* renamed from: a, reason: collision with root package name */
    public final Map f1233a;

    public n(Map map) {
        this.f1233a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            if (kotlin.jvm.internal.h.a(this.f1233a, ((n) obj).f1233a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1233a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.f1233a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (entry.getValue() == null) {
                arrayList.add(new A7.h(str, null));
            } else {
                throw new ClassCastException();
            }
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.f1233a + ')';
    }
}
