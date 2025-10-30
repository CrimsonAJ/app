package C7;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import s8.n;

/* loaded from: classes.dex */
public final class c extends B7.f implements RandomAccess, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final c f1626d;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f1627a;

    /* renamed from: b, reason: collision with root package name */
    public int f1628b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1629c;

    static {
        c cVar = new c(0);
        cVar.f1629c = true;
        f1626d = cVar;
    }

    public c(int i9) {
        if (i9 >= 0) {
            this.f1627a = new Object[i9];
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        int i9 = this.f1628b;
        ((AbstractList) this).modCount++;
        i(i9, 1);
        this.f1627a[i9] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        g();
        int size = elements.size();
        e(this.f1628b, elements, size);
        return size > 0;
    }

    @Override // B7.f
    public final int b() {
        return this.f1628b;
    }

    @Override // B7.f
    public final Object c(int i9) {
        g();
        int i10 = this.f1628b;
        if (i9 >= 0 && i9 < i10) {
            return k(i9);
        }
        throw new IndexOutOfBoundsException(A0.a.l("index: ", i9, i10, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        o(0, this.f1628b);
    }

    public final void e(int i9, Collection collection, int i10) {
        ((AbstractList) this).modCount++;
        i(i9, i10);
        Iterator it = collection.iterator();
        for (int i11 = 0; i11 < i10; i11++) {
            this.f1627a[i9 + i11] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                if (s8.e.b(this.f1627a, 0, this.f1628b, (List) obj)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void f(int i9, Object obj) {
        ((AbstractList) this).modCount++;
        i(i9, 1);
        this.f1627a[i9] = obj;
    }

    public final void g() {
        if (!this.f1629c) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        int i10 = this.f1628b;
        if (i9 >= 0 && i9 < i10) {
            return this.f1627a[i9];
        }
        throw new IndexOutOfBoundsException(A0.a.l("index: ", i9, i10, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i9;
        Object[] objArr = this.f1627a;
        int i10 = this.f1628b;
        int i11 = 1;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            int i13 = i11 * 31;
            if (obj != null) {
                i9 = obj.hashCode();
            } else {
                i9 = 0;
            }
            i11 = i13 + i9;
        }
        return i11;
    }

    public final void i(int i9, int i10) {
        int i11 = this.f1628b + i10;
        if (i11 >= 0) {
            Object[] objArr = this.f1627a;
            if (i11 > objArr.length) {
                int length = objArr.length;
                int i12 = length + (length >> 1);
                if (i12 - i11 < 0) {
                    i12 = i11;
                }
                if (i12 - 2147483639 > 0) {
                    if (i11 > 2147483639) {
                        i12 = Integer.MAX_VALUE;
                    } else {
                        i12 = 2147483639;
                    }
                }
                Object[] copyOf = Arrays.copyOf(objArr, i12);
                kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
                this.f1627a = copyOf;
            }
            Object[] objArr2 = this.f1627a;
            B7.j.e0(i9 + i10, i9, this.f1628b, objArr2, objArr2);
            this.f1628b += i10;
            return;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i9 = 0; i9 < this.f1628b; i9++) {
            if (kotlin.jvm.internal.h.a(this.f1627a[i9], obj)) {
                return i9;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.f1628b == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object k(int i9) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f1627a;
        Object obj = objArr[i9];
        B7.j.e0(i9, i9 + 1, this.f1628b, objArr, objArr);
        Object[] objArr2 = this.f1627a;
        int i10 = this.f1628b - 1;
        kotlin.jvm.internal.h.e(objArr2, "<this>");
        objArr2[i10] = null;
        this.f1628b--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i9 = this.f1628b - 1; i9 >= 0; i9--) {
            if (kotlin.jvm.internal.h.a(this.f1627a[i9], obj)) {
                return i9;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final void o(int i9, int i10) {
        if (i10 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f1627a;
        B7.j.e0(i9, i9 + i10, this.f1628b, objArr, objArr);
        Object[] objArr2 = this.f1627a;
        int i11 = this.f1628b;
        s8.e.W(objArr2, i11 - i10, i11);
        this.f1628b -= i10;
    }

    public final int p(int i9, int i10, Collection collection, boolean z9) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            int i13 = i9 + i11;
            if (collection.contains(this.f1627a[i13]) == z9) {
                Object[] objArr = this.f1627a;
                i11++;
                objArr[i12 + i9] = objArr[i13];
                i12++;
            } else {
                i11++;
            }
        }
        int i14 = i10 - i12;
        Object[] objArr2 = this.f1627a;
        B7.j.e0(i9 + i12, i10 + i9, this.f1628b, objArr2, objArr2);
        Object[] objArr3 = this.f1627a;
        int i15 = this.f1628b;
        s8.e.W(objArr3, i15 - i14, i15);
        if (i14 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f1628b -= i14;
        return i14;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        g();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            c(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        g();
        if (p(0, this.f1628b, elements, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        g();
        if (p(0, this.f1628b, elements, true) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i9, Object obj) {
        g();
        int i10 = this.f1628b;
        if (i9 >= 0 && i9 < i10) {
            Object[] objArr = this.f1627a;
            Object obj2 = objArr[i9];
            objArr[i9] = obj;
            return obj2;
        }
        throw new IndexOutOfBoundsException(A0.a.l("index: ", i9, i10, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i9, int i10) {
        n.g(i9, i10, this.f1628b);
        return new b(this.f1627a, i9, i10 - i9, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.h.e(array, "array");
        int length = array.length;
        int i9 = this.f1628b;
        if (length < i9) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f1627a, 0, i9, array.getClass());
            kotlin.jvm.internal.h.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        B7.j.e0(0, 0, i9, this.f1627a, array);
        int i10 = this.f1628b;
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return s8.e.c(this.f1627a, 0, this.f1628b, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i9) {
        int i10 = this.f1628b;
        if (i9 >= 0 && i9 <= i10) {
            return new a(this, i9);
        }
        throw new IndexOutOfBoundsException(A0.a.l("index: ", i9, i10, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i9, Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        g();
        int i10 = this.f1628b;
        if (i9 >= 0 && i9 <= i10) {
            int size = elements.size();
            e(i9, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(A0.a.l("index: ", i9, i10, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i9, Object obj) {
        g();
        int i10 = this.f1628b;
        if (i9 >= 0 && i9 <= i10) {
            ((AbstractList) this).modCount++;
            i(i9, 1);
            this.f1627a[i9] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(A0.a.l("index: ", i9, i10, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return B7.j.h0(this.f1627a, 0, this.f1628b);
    }
}
