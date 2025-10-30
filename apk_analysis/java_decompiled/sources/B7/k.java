package B7;

import B6.u0;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import l6.AbstractC1570b;

/* loaded from: classes.dex */
public abstract class k extends q {
    public static List A0(Iterable iterable) {
        kotlin.jvm.internal.h.e(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return H0(iterable);
        }
        List J02 = J0(iterable);
        Collections.reverse(J02);
        return J02;
    }

    public static List B0(Iterable iterable) {
        kotlin.jvm.internal.h.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return H0(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            Comparable[] comparableArr = (Comparable[]) array;
            kotlin.jvm.internal.h.e(comparableArr, "<this>");
            if (comparableArr.length > 1) {
                Arrays.sort(comparableArr);
            }
            return j.a0(array);
        }
        List J02 = J0(iterable);
        p.g0(J02);
        return J02;
    }

    public static List C0(Collection collection, Comparator comparator) {
        kotlin.jvm.internal.h.e(collection, "<this>");
        if (collection.size() <= 1) {
            return H0(collection);
        }
        Object[] array = collection.toArray(new Object[0]);
        kotlin.jvm.internal.h.e(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return j.a0(array);
    }

    public static List D0(List list, int i9) {
        if (i9 >= 0) {
            if (i9 == 0) {
                return t.f1135a;
            }
            if (i9 >= list.size()) {
                return H0(list);
            }
            if (i9 == 1) {
                return u0.D(o0(list));
            }
            ArrayList arrayList = new ArrayList(i9);
            Iterator it = list.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                arrayList.add(it.next());
                i10++;
                if (i10 == i9) {
                    break;
                }
            }
            return l.d0(arrayList);
        }
        throw new IllegalArgumentException(A0.a.m("Requested element count ", i9, " is less than zero.").toString());
    }

    public static List E0(List list, int i9) {
        kotlin.jvm.internal.h.e(list, "<this>");
        if (i9 >= 0) {
            if (i9 == 0) {
                return t.f1135a;
            }
            int size = list.size();
            if (i9 >= size) {
                return H0(list);
            }
            if (i9 == 1) {
                return u0.D(v0(list));
            }
            ArrayList arrayList = new ArrayList(i9);
            if (list instanceof RandomAccess) {
                for (int i10 = size - i9; i10 < size; i10++) {
                    arrayList.add(list.get(i10));
                }
            } else {
                ListIterator listIterator = list.listIterator(size - i9);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(A0.a.m("Requested element count ", i9, " is less than zero.").toString());
    }

    public static final void F0(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.h.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] G0(List list) {
        kotlin.jvm.internal.h.e(list, "<this>");
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            iArr[i9] = ((Number) it.next()).intValue();
            i9++;
        }
        return iArr;
    }

    public static List H0(Iterable iterable) {
        Object next;
        kotlin.jvm.internal.h.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return I0(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return u0.D(next);
            }
            return t.f1135a;
        }
        return l.d0(J0(iterable));
    }

    public static ArrayList I0(Collection collection) {
        kotlin.jvm.internal.h.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List J0(Iterable iterable) {
        kotlin.jvm.internal.h.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return I0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        F0(iterable, arrayList);
        return arrayList;
    }

    public static Set K0(Collection collection) {
        Object next;
        kotlin.jvm.internal.h.e(collection, "<this>");
        v vVar = v.f1137a;
        int size = collection.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(y.D(collection.size()));
                F0(collection, linkedHashSet);
                return linkedHashSet;
            }
            if (collection instanceof List) {
                next = ((List) collection).get(0);
            } else {
                next = collection.iterator().next();
            }
            Set singleton = Collections.singleton(next);
            kotlin.jvm.internal.h.d(singleton, "singleton(...)");
            return singleton;
        }
        return vVar;
    }

    public static boolean l0(Iterable iterable, Object obj) {
        int i9;
        kotlin.jvm.internal.h.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (iterable instanceof List) {
            i9 = ((List) iterable).indexOf(obj);
        } else {
            Iterator it = iterable.iterator();
            int i10 = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (i10 >= 0) {
                        if (kotlin.jvm.internal.h.a(obj, next)) {
                            i9 = i10;
                            break;
                        }
                        i10++;
                    } else {
                        l.e0();
                        throw null;
                    }
                } else {
                    i9 = -1;
                    break;
                }
            }
        }
        if (i9 < 0) {
            return false;
        }
        return true;
    }

    public static List m0(List list) {
        kotlin.jvm.internal.h.e(list, "<this>");
        int size = list.size() - 1;
        if (size <= 0) {
            return t.f1135a;
        }
        if (size == 1) {
            return u0.D(v0(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            for (int i9 = 1; i9 < size2; i9++) {
                arrayList.add(list.get(i9));
            }
        } else {
            ListIterator listIterator = list.listIterator(1);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static ArrayList n0(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object o0(Collection collection) {
        kotlin.jvm.internal.h.e(collection, "<this>");
        if (collection instanceof List) {
            return p0((List) collection);
        }
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object p0(List list) {
        kotlin.jvm.internal.h.e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object q0(List list) {
        kotlin.jvm.internal.h.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object r0(List list, int i9) {
        kotlin.jvm.internal.h.e(list, "<this>");
        if (i9 >= 0 && i9 < list.size()) {
            return list.get(i9);
        }
        return null;
    }

    public static final void s0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, O7.l lVar) {
        kotlin.jvm.internal.h.e(iterable, "<this>");
        sb.append(charSequence2);
        int i9 = 0;
        for (Object obj : iterable) {
            i9++;
            if (i9 > 1) {
                sb.append(charSequence);
            }
            AbstractC1570b.a(sb, obj, lVar);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void t0(ArrayList arrayList, StringBuilder sb) {
        s0(arrayList, sb, "\n", "", "", "...", null);
    }

    public static String u0(Iterable iterable, String str, String str2, String str3, O7.l lVar, int i9) {
        String prefix;
        String str4;
        if ((i9 & 1) != 0) {
            str = ", ";
        }
        String str5 = str;
        if ((i9 & 2) != 0) {
            prefix = "";
        } else {
            prefix = str2;
        }
        if ((i9 & 4) != 0) {
            str4 = "";
        } else {
            str4 = str3;
        }
        if ((i9 & 32) != 0) {
            lVar = null;
        }
        kotlin.jvm.internal.h.e(iterable, "<this>");
        kotlin.jvm.internal.h.e(prefix, "prefix");
        StringBuilder sb = new StringBuilder();
        s0(iterable, sb, str5, prefix, str4, "...", lVar);
        return sb.toString();
    }

    public static Object v0(List list) {
        kotlin.jvm.internal.h.e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(l.a0(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object w0(List list) {
        kotlin.jvm.internal.h.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable x0(Collection collection) {
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList y0(Collection collection, Iterable elements) {
        kotlin.jvm.internal.h.e(collection, "<this>");
        kotlin.jvm.internal.h.e(elements, "elements");
        if (elements instanceof Collection) {
            Collection collection2 = (Collection) elements;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        q.h0(arrayList2, elements);
        return arrayList2;
    }

    public static ArrayList z0(Collection collection, Object obj) {
        kotlin.jvm.internal.h.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }
}
