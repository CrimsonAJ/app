package P5;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: P5.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0350s extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5996a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0352u f5997b;

    public /* synthetic */ C0350s(C0352u c0352u, int i9) {
        this.f5996a = i9;
        this.f5997b = c0352u;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f5996a) {
            case 0:
                this.f5997b.clear();
                return;
            default:
                this.f5997b.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f5996a) {
            case 0:
                C0352u c0352u = this.f5997b;
                Map c3 = c0352u.c();
                if (c3 != null) {
                    return c3.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int e8 = c0352u.e(entry.getKey());
                    if (e8 != -1 && M4.a.l(c0352u.k()[e8], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f5997b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f5996a) {
            case 0:
                C0352u c0352u = this.f5997b;
                Map c3 = c0352u.c();
                if (c3 != null) {
                    return c3.entrySet().iterator();
                }
                return new r(c0352u, 1);
            default:
                C0352u c0352u2 = this.f5997b;
                Map c9 = c0352u2.c();
                if (c9 != null) {
                    return c9.keySet().iterator();
                }
                return new r(c0352u2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f5996a) {
            case 0:
                C0352u c0352u = this.f5997b;
                Map c3 = c0352u.c();
                if (c3 != null) {
                    return c3.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c0352u.g()) {
                        int d9 = c0352u.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c0352u.f6001a;
                        Objects.requireNonNull(obj2);
                        int o9 = AbstractC0349q.o(key, value, d9, obj2, c0352u.i(), c0352u.j(), c0352u.k());
                        if (o9 != -1) {
                            c0352u.f(o9, d9);
                            c0352u.f6006f--;
                            c0352u.f6005e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                C0352u c0352u2 = this.f5997b;
                Map c9 = c0352u2.c();
                if (c9 != null) {
                    return c9.keySet().remove(obj);
                }
                if (c0352u2.h(obj) != C0352u.j) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f5996a) {
            case 0:
                return this.f5997b.size();
            default:
                return this.f5997b.size();
        }
    }
}
