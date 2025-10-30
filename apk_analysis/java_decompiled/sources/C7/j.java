package C7;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j extends B7.g implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final j f1654b;

    /* renamed from: a, reason: collision with root package name */
    public final g f1655a;

    static {
        g gVar = g.f1638n;
        f1654b = new j(g.f1638n);
    }

    public j(g backing) {
        kotlin.jvm.internal.h.e(backing, "backing");
        this.f1655a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.f1655a.a(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        this.f1655a.b();
        return super.addAll(elements);
    }

    @Override // B7.g
    public final int b() {
        return this.f1655a.f1647i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f1655a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f1655a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f1655a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        g gVar = this.f1655a;
        gVar.getClass();
        return new d(gVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        g gVar = this.f1655a;
        gVar.b();
        int g9 = gVar.g(obj);
        if (g9 < 0) {
            return false;
        }
        gVar.k(g9);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        this.f1655a.b();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        this.f1655a.b();
        return super.retainAll(elements);
    }

    public j() {
        this(new g());
    }
}
