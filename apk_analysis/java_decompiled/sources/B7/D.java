package B7;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import u0.C2042m;

/* loaded from: classes.dex */
public abstract class D extends O4.h {
    public static LinkedHashSet Q(Set set, C2042m c2042m) {
        kotlin.jvm.internal.h.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(y.D(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(c2042m);
        return linkedHashSet;
    }

    public static Set R(Object... elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        int length = elements.length;
        if (length != 0) {
            if (length != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(y.D(elements.length));
                for (Object obj : elements) {
                    linkedHashSet.add(obj);
                }
                return linkedHashSet;
            }
            Set singleton = Collections.singleton(elements[0]);
            kotlin.jvm.internal.h.d(singleton, "singleton(...)");
            return singleton;
        }
        return v.f1137a;
    }
}
