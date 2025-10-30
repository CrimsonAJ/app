package P5;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: P5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0336d extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    public transient C0334b f5966a;

    /* renamed from: b, reason: collision with root package name */
    public transient C0346n f5967b;

    /* renamed from: c, reason: collision with root package name */
    public final transient Map f5968c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f5969d;

    public C0336d(O o9, Map map) {
        this.f5969d = o9;
        this.f5968c = map;
    }

    public final B a(Map.Entry entry) {
        C0344l c0344l;
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        O o9 = this.f5969d;
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            c0344l = new C0344l(o9, key, list, null);
        } else {
            c0344l = new C0344l(o9, key, list, null);
        }
        return new B(key, c0344l);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        O o9 = this.f5969d;
        if (this.f5968c == o9.f5920d) {
            o9.c();
            return;
        }
        C0335c c0335c = new C0335c(this);
        while (c0335c.hasNext()) {
            c0335c.next();
            c0335c.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f5968c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0334b c0334b = this.f5966a;
        if (c0334b == null) {
            C0334b c0334b2 = new C0334b(this);
            this.f5966a = c0334b2;
            return c0334b2;
        }
        return c0334b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj && !this.f5968c.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        C0344l c0344l;
        Map map = this.f5968c;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        O o9 = this.f5969d;
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            c0344l = new C0344l(o9, obj, list, null);
        } else {
            c0344l = new C0344l(o9, obj, list, null);
        }
        return c0344l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f5968c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set c0337e;
        O o9 = this.f5969d;
        Set set = o9.f5987a;
        if (set == null) {
            Map map = o9.f5920d;
            if (map instanceof NavigableMap) {
                c0337e = new C0339g(o9, (NavigableMap) map);
            } else if (map instanceof SortedMap) {
                c0337e = new C0342j(o9, (SortedMap) map);
            } else {
                c0337e = new C0337e(o9, map);
            }
            o9.f5987a = c0337e;
            return c0337e;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f5968c.remove(obj);
        if (collection == null) {
            return null;
        }
        O o9 = this.f5969d;
        List list = (List) o9.f5922f.get();
        list.addAll(collection);
        o9.f5921e -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f5968c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f5968c.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C0346n c0346n = this.f5967b;
        if (c0346n == null) {
            C0346n c0346n2 = new C0346n(this);
            this.f5967b = c0346n2;
            return c0346n2;
        }
        return c0346n;
    }
}
