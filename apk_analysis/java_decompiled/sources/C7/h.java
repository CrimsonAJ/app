package C7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class h extends B7.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1651a;

    /* renamed from: b, reason: collision with root package name */
    public final g f1652b;

    public /* synthetic */ h(g gVar, int i9) {
        this.f1651a = i9;
        this.f1652b = gVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f1651a) {
            case 0:
                Map.Entry element = (Map.Entry) obj;
                kotlin.jvm.internal.h.e(element, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        switch (this.f1651a) {
            case 0:
                kotlin.jvm.internal.h.e(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                kotlin.jvm.internal.h.e(elements, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // B7.g
    public final int b() {
        switch (this.f1651a) {
            case 0:
                return this.f1652b.f1647i;
            default:
                return this.f1652b.f1647i;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f1651a) {
            case 0:
                this.f1652b.clear();
                return;
            default:
                this.f1652b.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f1651a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry element = (Map.Entry) obj;
                kotlin.jvm.internal.h.e(element, "element");
                return this.f1652b.e(element);
            default:
                return this.f1652b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        switch (this.f1651a) {
            case 0:
                kotlin.jvm.internal.h.e(elements, "elements");
                return this.f1652b.d(elements);
            default:
                return super.containsAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f1651a) {
            case 0:
                return this.f1652b.isEmpty();
            default:
                return this.f1652b.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f1651a) {
            case 0:
                g gVar = this.f1652b;
                gVar.getClass();
                return new d(gVar, 0);
            default:
                g gVar2 = this.f1652b;
                gVar2.getClass();
                return new d(gVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f1651a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry element = (Map.Entry) obj;
                kotlin.jvm.internal.h.e(element, "element");
                g gVar = this.f1652b;
                gVar.getClass();
                gVar.b();
                int g9 = gVar.g(element.getKey());
                if (g9 < 0) {
                    return false;
                }
                Object[] objArr = gVar.f1640b;
                kotlin.jvm.internal.h.b(objArr);
                if (!kotlin.jvm.internal.h.a(objArr[g9], element.getValue())) {
                    return false;
                }
                gVar.k(g9);
                return true;
            default:
                g gVar2 = this.f1652b;
                gVar2.b();
                int g10 = gVar2.g(obj);
                if (g10 < 0) {
                    return false;
                }
                gVar2.k(g10);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        switch (this.f1651a) {
            case 0:
                kotlin.jvm.internal.h.e(elements, "elements");
                this.f1652b.b();
                return super.removeAll(elements);
            default:
                kotlin.jvm.internal.h.e(elements, "elements");
                this.f1652b.b();
                return super.removeAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        switch (this.f1651a) {
            case 0:
                kotlin.jvm.internal.h.e(elements, "elements");
                this.f1652b.b();
                return super.retainAll(elements);
            default:
                kotlin.jvm.internal.h.e(elements, "elements");
                this.f1652b.b();
                return super.retainAll(elements);
        }
    }
}
