package P5;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: P5.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0346n extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5985a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5986b;

    public /* synthetic */ C0346n(int i9, Serializable serializable) {
        this.f5985a = i9;
        this.f5986b = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f5985a) {
            case 0:
                ((O) this.f5986b).c();
                return;
            case 1:
                ((C0352u) this.f5986b).clear();
                return;
            default:
                ((C0336d) this.f5986b).clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f5985a) {
            case 0:
                return ((O) this.f5986b).b(obj);
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((C0336d) this.f5986b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f5985a) {
            case 2:
                return ((C0336d) this.f5986b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f5985a) {
            case 0:
                return new C0333a((O) this.f5986b);
            case 1:
                C0352u c0352u = (C0352u) this.f5986b;
                Map c3 = c0352u.c();
                if (c3 != null) {
                    return c3.values().iterator();
                }
                return new r(c0352u, 2);
            default:
                return new M(((C0336d) this.f5986b).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f5985a) {
            case 2:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    C0336d c0336d = (C0336d) this.f5986b;
                    for (Map.Entry entry : c0336d.entrySet()) {
                        if (M4.a.l(obj, entry.getValue())) {
                            c0336d.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f5985a) {
            case 2:
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C0336d c0336d = (C0336d) this.f5986b;
                    for (Map.Entry entry : c0336d.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c0336d.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f5985a) {
            case 2:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C0336d c0336d = (C0336d) this.f5986b;
                    for (Map.Entry entry : c0336d.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c0336d.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f5985a) {
            case 0:
                return ((O) this.f5986b).f5921e;
            case 1:
                return ((C0352u) this.f5986b).size();
            default:
                return ((C0336d) this.f5986b).f5968c.size();
        }
    }

    public C0346n(C0336d c0336d) {
        this.f5985a = 2;
        this.f5986b = c0336d;
    }
}
