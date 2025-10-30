package C7;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import s8.n;

/* loaded from: classes.dex */
public final class b extends B7.f implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f1621a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1622b;

    /* renamed from: c, reason: collision with root package name */
    public int f1623c;

    /* renamed from: d, reason: collision with root package name */
    public final b f1624d;

    /* renamed from: e, reason: collision with root package name */
    public final c f1625e;

    public b(Object[] backing, int i9, int i10, b bVar, c root) {
        int i11;
        kotlin.jvm.internal.h.e(backing, "backing");
        kotlin.jvm.internal.h.e(root, "root");
        this.f1621a = backing;
        this.f1622b = i9;
        this.f1623c = i10;
        this.f1624d = bVar;
        this.f1625e = root;
        i11 = ((AbstractList) root).modCount;
        ((AbstractList) this).modCount = i11;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i();
        g();
        f(this.f1622b + this.f1623c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        i();
        g();
        int size = elements.size();
        e(this.f1622b + this.f1623c, elements, size);
        return size > 0;
    }

    @Override // B7.f
    public final int b() {
        g();
        return this.f1623c;
    }

    @Override // B7.f
    public final Object c(int i9) {
        i();
        g();
        int i10 = this.f1623c;
        if (i9 >= 0 && i9 < i10) {
            return k(this.f1622b + i9);
        }
        throw new IndexOutOfBoundsException(A0.a.l("index: ", i9, i10, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        g();
        o(this.f1622b, this.f1623c);
    }

    public final void e(int i9, Collection collection, int i10) {
        ((AbstractList) this).modCount++;
        c cVar = this.f1625e;
        b bVar = this.f1624d;
        if (bVar != null) {
            bVar.e(i9, collection, i10);
        } else {
            c cVar2 = c.f1626d;
            cVar.e(i9, collection, i10);
        }
        this.f1621a = cVar.f1627a;
        this.f1623c += i10;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        g();
        if (obj != this) {
            if (obj instanceof List) {
                if (!s8.e.b(this.f1621a, this.f1622b, this.f1623c, (List) obj)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void f(int i9, Object obj) {
        ((AbstractList) this).modCount++;
        c cVar = this.f1625e;
        b bVar = this.f1624d;
        if (bVar != null) {
            bVar.f(i9, obj);
        } else {
            c cVar2 = c.f1626d;
            cVar.f(i9, obj);
        }
        this.f1621a = cVar.f1627a;
        this.f1623c++;
    }

    public final void g() {
        int i9;
        i9 = ((AbstractList) this.f1625e).modCount;
        if (i9 == ((AbstractList) this).modCount) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        g();
        int i10 = this.f1623c;
        if (i9 >= 0 && i9 < i10) {
            return this.f1621a[this.f1622b + i9];
        }
        throw new IndexOutOfBoundsException(A0.a.l("index: ", i9, i10, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i9;
        g();
        Object[] objArr = this.f1621a;
        int i10 = this.f1623c;
        int i11 = 1;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[this.f1622b + i12];
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

    public final void i() {
        if (!this.f1625e.f1629c) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        g();
        for (int i9 = 0; i9 < this.f1623c; i9++) {
            if (kotlin.jvm.internal.h.a(this.f1621a[this.f1622b + i9], obj)) {
                return i9;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        g();
        if (this.f1623c == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object k(int i9) {
        Object k5;
        ((AbstractList) this).modCount++;
        b bVar = this.f1624d;
        if (bVar != null) {
            k5 = bVar.k(i9);
        } else {
            c cVar = c.f1626d;
            k5 = this.f1625e.k(i9);
        }
        this.f1623c--;
        return k5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        g();
        for (int i9 = this.f1623c - 1; i9 >= 0; i9--) {
            if (kotlin.jvm.internal.h.a(this.f1621a[this.f1622b + i9], obj)) {
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
        b bVar = this.f1624d;
        if (bVar != null) {
            bVar.o(i9, i10);
        } else {
            c cVar = c.f1626d;
            this.f1625e.o(i9, i10);
        }
        this.f1623c -= i10;
    }

    public final int p(int i9, int i10, Collection collection, boolean z9) {
        int p9;
        b bVar = this.f1624d;
        if (bVar != null) {
            p9 = bVar.p(i9, i10, collection, z9);
        } else {
            c cVar = c.f1626d;
            p9 = this.f1625e.p(i9, i10, collection, z9);
        }
        if (p9 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f1623c -= p9;
        return p9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        i();
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
        i();
        g();
        if (p(this.f1622b, this.f1623c, elements, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        i();
        g();
        if (p(this.f1622b, this.f1623c, elements, true) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i9, Object obj) {
        i();
        g();
        int i10 = this.f1623c;
        if (i9 >= 0 && i9 < i10) {
            Object[] objArr = this.f1621a;
            int i11 = this.f1622b;
            Object obj2 = objArr[i11 + i9];
            objArr[i11 + i9] = obj;
            return obj2;
        }
        throw new IndexOutOfBoundsException(A0.a.l("index: ", i9, i10, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i9, int i10) {
        n.g(i9, i10, this.f1623c);
        return new b(this.f1621a, this.f1622b + i9, i10 - i9, this, this.f1625e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.h.e(array, "array");
        g();
        int length = array.length;
        int i9 = this.f1623c;
        int i10 = this.f1622b;
        if (length < i9) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f1621a, i10, i9 + i10, array.getClass());
            kotlin.jvm.internal.h.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        B7.j.e0(0, i10, i9 + i10, this.f1621a, array);
        int i11 = this.f1623c;
        if (i11 < array.length) {
            array[i11] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        g();
        return s8.e.c(this.f1621a, this.f1622b, this.f1623c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i9) {
        g();
        int i10 = this.f1623c;
        if (i9 >= 0 && i9 <= i10) {
            return new a(this, i9);
        }
        throw new IndexOutOfBoundsException(A0.a.l("index: ", i9, i10, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i9, Object obj) {
        i();
        g();
        int i10 = this.f1623c;
        if (i9 >= 0 && i9 <= i10) {
            f(this.f1622b + i9, obj);
            return;
        }
        throw new IndexOutOfBoundsException(A0.a.l("index: ", i9, i10, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i9, Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        i();
        g();
        int i10 = this.f1623c;
        if (i9 >= 0 && i9 <= i10) {
            int size = elements.size();
            e(this.f1622b + i9, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(A0.a.l("index: ", i9, i10, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        g();
        Object[] objArr = this.f1621a;
        int i9 = this.f1623c;
        int i10 = this.f1622b;
        return B7.j.h0(objArr, i10, i9 + i10);
    }
}
