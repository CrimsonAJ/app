package P5;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public class b0 extends AbstractCollection implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final Set f5960a;

    /* renamed from: b, reason: collision with root package name */
    public final O5.j f5961b;

    public b0(Set set, O5.j jVar) {
        this.f5960a = set;
        this.f5961b = jVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.f5961b.apply(obj)) {
            return this.f5960a.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f5961b.apply(it.next())) {
                throw new IllegalArgumentException();
            }
        }
        return this.f5960a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f5960a;
        boolean z9 = set instanceof RandomAccess;
        O5.j jVar = this.f5961b;
        if (z9 && (set instanceof List)) {
            List list = (List) set;
            jVar.getClass();
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                Object obj = list.get(i10);
                if (!jVar.apply(obj)) {
                    if (i10 > i9) {
                        try {
                            list.set(i9, obj);
                        } catch (IllegalArgumentException unused) {
                            AbstractC0349q.p(list, jVar, i9, i10);
                            return;
                        } catch (UnsupportedOperationException unused2) {
                            AbstractC0349q.p(list, jVar, i9, i10);
                            return;
                        }
                    }
                    i9++;
                }
            }
            list.subList(i9, list.size()).clear();
            return;
        }
        Iterator it = set.iterator();
        jVar.getClass();
        while (it.hasNext()) {
            if (jVar.apply(it.next())) {
                it.remove();
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean z9;
        Set set = this.f5960a;
        set.getClass();
        try {
            z9 = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z9 = false;
        }
        if (!z9) {
            return false;
        }
        return this.f5961b.apply(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return AbstractC0349q.f(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC0349q.j(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f5960a.iterator();
        O5.j jVar = this.f5961b;
        O4.h.g(jVar, "predicate");
        boolean z9 = false;
        int i9 = 0;
        while (true) {
            if (it.hasNext()) {
                if (jVar.apply(it.next())) {
                    break;
                }
                i9++;
            } else {
                i9 = -1;
                break;
            }
        }
        if (i9 != -1) {
            z9 = true;
        }
        return true ^ z9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f5960a.iterator();
        it.getClass();
        O5.j jVar = this.f5961b;
        jVar.getClass();
        return new J(it, jVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (contains(obj) && this.f5960a.remove(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f5960a.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f5961b.apply(next) && collection.contains(next)) {
                it.remove();
                z9 = true;
            }
        }
        return z9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f5960a.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f5961b.apply(next) && !collection.contains(next)) {
                it.remove();
                z9 = true;
            }
        }
        return z9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f5960a.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            if (this.f5961b.apply(it.next())) {
                i9++;
            }
        }
        return i9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC0349q.m(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return AbstractC0349q.m(iterator()).toArray(objArr);
    }
}
