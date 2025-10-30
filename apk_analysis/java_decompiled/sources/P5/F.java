package P5;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class F extends A implements List, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public static final D f5901b = new D(S.f5926e, 0);

    public static S k(int i9, Object[] objArr) {
        if (i9 == 0) {
            return S.f5926e;
        }
        return new S(i9, objArr);
    }

    public static F o(Collection collection) {
        if (collection instanceof A) {
            F b9 = ((A) collection).b();
            if (b9.g()) {
                Object[] array = b9.toArray(A.f5889a);
                return k(array.length, array);
            }
            return b9;
        }
        Object[] array2 = collection.toArray();
        AbstractC0349q.a(array2.length, array2);
        return k(array2.length, array2);
    }

    public static S p(Object[] objArr) {
        if (objArr.length == 0) {
            return S.f5926e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        AbstractC0349q.a(objArr2.length, objArr2);
        return k(objArr2.length, objArr2);
    }

    public static S r(Long l9, Long l10, Long l11, Long l12, Long l13) {
        Object[] objArr = {l9, l10, l11, l12, l13};
        AbstractC0349q.a(5, objArr);
        return k(5, objArr);
    }

    public static S s(Object obj) {
        Object[] objArr = {obj};
        AbstractC0349q.a(1, objArr);
        return k(1, objArr);
    }

    public static S t(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        AbstractC0349q.a(2, objArr);
        return k(2, objArr);
    }

    @Override // java.util.List
    public final void add(int i9, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i9, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // P5.A
    public int c(int i9, Object[] objArr) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i9 + i10] = get(i10);
        }
        return i9 + size;
    }

    @Override // P5.A, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (list instanceof RandomAccess) {
                        for (int i9 = 0; i9 < size; i9++) {
                            if (M4.a.l(get(i9), list.get(i9))) {
                            }
                        }
                    } else {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && M4.a.l(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i9 = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i9 = ~(~(get(i10).hashCode() + (i9 * 31)));
        }
        return i9;
    }

    @Override // P5.A
    /* renamed from: i */
    public final f0 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            if (obj.equals(get(i9))) {
                return i9;
            }
        }
        return -1;
    }

    @Override // P5.A, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final D listIterator(int i9) {
        O4.h.h(i9, size());
        if (isEmpty()) {
            return f5901b;
        }
        return new D(this, i9);
    }

    @Override // java.util.List
    public final Object remove(int i9) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i9, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public F subList(int i9, int i10) {
        O4.h.i(i9, i10, size());
        int i11 = i10 - i9;
        if (i11 == size()) {
            return this;
        }
        if (i11 == 0) {
            return S.f5926e;
        }
        return new E(this, i9, i11);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // P5.A
    public final F b() {
        return this;
    }
}
