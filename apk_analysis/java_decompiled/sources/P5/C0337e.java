package P5;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: P5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0337e extends d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f5970a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O f5971b;

    public C0337e(O o9, Map map) {
        this.f5971b = o9;
        map.getClass();
        this.f5970a = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            C0335c c0335c = (C0335c) it;
            if (c0335c.hasNext()) {
                c0335c.next();
                c0335c.remove();
            } else {
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f5970a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f5970a.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this != obj && !this.f5970a.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f5970a.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f5970a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0335c(this, this.f5970a.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i9;
        Collection collection = (Collection) this.f5970a.remove(obj);
        if (collection != null) {
            i9 = collection.size();
            collection.clear();
            this.f5971b.f5921e -= i9;
        } else {
            i9 = 0;
        }
        if (i9 <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5970a.size();
    }
}
