package B7;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class q extends p {
    public static void h0(Collection collection, Iterable elements) {
        kotlin.jvm.internal.h.e(collection, "<this>");
        kotlin.jvm.internal.h.e(elements, "elements");
        if (elements instanceof Collection) {
            collection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static final boolean i0(Collection collection, O7.l lVar, boolean z9) {
        Iterator it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (((Boolean) lVar.invoke(it.next())).booleanValue() == z9) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static void j0(List list, O7.l lVar) {
        int a02;
        kotlin.jvm.internal.h.e(list, "<this>");
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof P7.a) && !(list instanceof P7.b)) {
                kotlin.jvm.internal.r.f(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            i0(list, lVar, true);
            return;
        }
        int a03 = l.a0(list);
        int i9 = 0;
        if (a03 >= 0) {
            int i10 = 0;
            while (true) {
                Object obj = list.get(i9);
                if (!((Boolean) lVar.invoke(obj)).booleanValue()) {
                    if (i10 != i9) {
                        list.set(i10, obj);
                    }
                    i10++;
                }
                if (i9 == a03) {
                    break;
                } else {
                    i9++;
                }
            }
            i9 = i10;
        }
        if (i9 >= list.size() || i9 > (a02 = l.a0(list))) {
            return;
        }
        while (true) {
            list.remove(a02);
            if (a02 != i9) {
                a02--;
            } else {
                return;
            }
        }
    }

    public static Object k0(List list) {
        kotlin.jvm.internal.h.e(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(l.a0(list));
        }
        throw new NoSuchElementException("List is empty.");
    }
}
