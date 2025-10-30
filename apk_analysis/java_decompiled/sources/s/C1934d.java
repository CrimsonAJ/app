package s;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: s.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1934d implements Collection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1935e f22645a;

    public C1934d(C1935e c1935e) {
        this.f22645a = c1935e;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f22645a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (this.f22645a.a(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f22645a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1931a(this.f22645a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C1935e c1935e = this.f22645a;
        int a5 = c1935e.a(obj);
        if (a5 >= 0) {
            c1935e.g(a5);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C1935e c1935e = this.f22645a;
        int i9 = c1935e.f22660c;
        int i10 = 0;
        boolean z9 = false;
        while (i10 < i9) {
            if (collection.contains(c1935e.i(i10))) {
                c1935e.g(i10);
                i10--;
                i9--;
                z9 = true;
            }
            i10++;
        }
        return z9;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C1935e c1935e = this.f22645a;
        int i9 = c1935e.f22660c;
        int i10 = 0;
        boolean z9 = false;
        while (i10 < i9) {
            if (!collection.contains(c1935e.i(i10))) {
                c1935e.g(i10);
                i10--;
                i9--;
                z9 = true;
            }
            i10++;
        }
        return z9;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f22645a.f22660c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C1935e c1935e = this.f22645a;
        int i9 = c1935e.f22660c;
        Object[] objArr = new Object[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            objArr[i10] = c1935e.i(i10);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C1935e c1935e = this.f22645a;
        int i9 = c1935e.f22660c;
        if (objArr.length < i9) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i9);
        }
        for (int i10 = 0; i10 < i9; i10++) {
            objArr[i10] = c1935e.i(i10);
        }
        if (objArr.length > i9) {
            objArr[i9] = null;
        }
        return objArr;
    }
}
