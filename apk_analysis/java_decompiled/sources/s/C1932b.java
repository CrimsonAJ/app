package s;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: s.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1932b implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1935e f22640a;

    public C1932b(C1935e c1935e) {
        this.f22640a = c1935e;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f22640a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f22640a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f22640a.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                C1935e c1935e = this.f22640a;
                try {
                    if (c1935e.f22660c == set.size()) {
                        if (c1935e.j(set)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int hashCode;
        C1935e c1935e = this.f22640a;
        int i9 = 0;
        for (int i10 = c1935e.f22660c - 1; i10 >= 0; i10--) {
            Object f9 = c1935e.f(i10);
            if (f9 == null) {
                hashCode = 0;
            } else {
                hashCode = f9.hashCode();
            }
            i9 += hashCode;
        }
        return i9;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f22640a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1931a(this.f22640a, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C1935e c1935e = this.f22640a;
        int d9 = c1935e.d(obj);
        if (d9 >= 0) {
            c1935e.g(d9);
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f22640a.k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C1935e c1935e = this.f22640a;
        int i9 = c1935e.f22660c;
        for (int i10 = i9 - 1; i10 >= 0; i10--) {
            if (!collection.contains(c1935e.f(i10))) {
                c1935e.g(i10);
            }
        }
        if (i9 != c1935e.f22660c) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f22640a.f22660c;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C1935e c1935e = this.f22640a;
        int i9 = c1935e.f22660c;
        Object[] objArr = new Object[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            objArr[i10] = c1935e.f(i10);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C1935e c1935e = this.f22640a;
        int i9 = c1935e.f22660c;
        if (objArr.length < i9) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i9);
        }
        for (int i10 = 0; i10 < i9; i10++) {
            objArr[i10] = c1935e.f(i10);
        }
        if (objArr.length > i9) {
            objArr[i9] = null;
        }
        return objArr;
    }
}
