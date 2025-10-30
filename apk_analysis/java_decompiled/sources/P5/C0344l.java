package P5;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: P5.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0344l extends AbstractCollection implements List {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5979a;

    /* renamed from: b, reason: collision with root package name */
    public Collection f5980b;

    /* renamed from: c, reason: collision with root package name */
    public final C0344l f5981c;

    /* renamed from: d, reason: collision with root package name */
    public final Collection f5982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ O f5983e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ O f5984f;

    public C0344l(O o9, Object obj, List list, C0344l c0344l) {
        Collection collection;
        this.f5984f = o9;
        this.f5983e = o9;
        this.f5979a = obj;
        this.f5980b = list;
        this.f5981c = c0344l;
        if (c0344l == null) {
            collection = null;
        } else {
            collection = c0344l.f5980b;
        }
        this.f5982d = collection;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        boolean isEmpty = this.f5980b.isEmpty();
        boolean add = this.f5980b.add(obj);
        if (add) {
            this.f5983e.f5921e++;
            if (isEmpty) {
                b();
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f5980b.addAll(collection);
        if (addAll) {
            this.f5983e.f5921e += this.f5980b.size() - size;
            if (size == 0) {
                b();
            }
        }
        return addAll;
    }

    public final void b() {
        C0344l c0344l = this.f5981c;
        if (c0344l != null) {
            c0344l.b();
        } else {
            this.f5983e.f5920d.put(this.f5979a, this.f5980b);
        }
    }

    public final void c() {
        Collection collection;
        C0344l c0344l = this.f5981c;
        if (c0344l != null) {
            c0344l.c();
            if (c0344l.f5980b != this.f5982d) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f5980b.isEmpty() && (collection = (Collection) this.f5983e.f5920d.get(this.f5979a)) != null) {
            this.f5980b = collection;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f5980b.clear();
        this.f5983e.f5921e -= size;
        d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        c();
        return this.f5980b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        c();
        return this.f5980b.containsAll(collection);
    }

    public final void d() {
        C0344l c0344l = this.f5981c;
        if (c0344l != null) {
            c0344l.d();
        } else if (this.f5980b.isEmpty()) {
            this.f5983e.f5920d.remove(this.f5979a);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        c();
        return this.f5980b.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i9) {
        c();
        return ((List) this.f5980b).get(i9);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        c();
        return this.f5980b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        c();
        return ((List) this.f5980b).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        c();
        return new C0335c(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        c();
        return ((List) this.f5980b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        c();
        return new C0343k(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        boolean remove = this.f5980b.remove(obj);
        if (remove) {
            O o9 = this.f5983e;
            o9.f5921e--;
            d();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f5980b.removeAll(collection);
        if (removeAll) {
            this.f5983e.f5921e += this.f5980b.size() - size;
            d();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f5980b.retainAll(collection);
        if (retainAll) {
            this.f5983e.f5921e += this.f5980b.size() - size;
            d();
        }
        return retainAll;
    }

    @Override // java.util.List
    public final Object set(int i9, Object obj) {
        c();
        return ((List) this.f5980b).set(i9, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        c();
        return this.f5980b.size();
    }

    @Override // java.util.List
    public final List subList(int i9, int i10) {
        c();
        List subList = ((List) this.f5980b).subList(i9, i10);
        C0344l c0344l = this.f5981c;
        if (c0344l == null) {
            c0344l = this;
        }
        O o9 = this.f5984f;
        o9.getClass();
        boolean z9 = subList instanceof RandomAccess;
        Object obj = this.f5979a;
        if (z9) {
            return new C0344l(o9, obj, subList, c0344l);
        }
        return new C0344l(o9, obj, subList, c0344l);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        c();
        return this.f5980b.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i9) {
        c();
        return new C0343k(this, i9);
    }

    @Override // java.util.List
    public final Object remove(int i9) {
        c();
        Object remove = ((List) this.f5980b).remove(i9);
        O o9 = this.f5984f;
        o9.f5921e--;
        d();
        return remove;
    }

    @Override // java.util.List
    public final void add(int i9, Object obj) {
        c();
        boolean isEmpty = this.f5980b.isEmpty();
        ((List) this.f5980b).add(i9, obj);
        this.f5984f.f5921e++;
        if (isEmpty) {
            b();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i9, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f5980b).addAll(i9, collection);
        if (addAll) {
            this.f5984f.f5921e += this.f5980b.size() - size;
            if (size == 0) {
                b();
            }
        }
        return addAll;
    }
}
