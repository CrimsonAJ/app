package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class V extends AbstractMap {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f9667f = 0;

    /* renamed from: a, reason: collision with root package name */
    public List f9668a;

    /* renamed from: b, reason: collision with root package name */
    public Map f9669b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9670c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Y f9671d;

    /* renamed from: e, reason: collision with root package name */
    public Map f9672e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, androidx.datastore.preferences.protobuf.V] */
    public static V f() {
        ?? abstractMap = new AbstractMap();
        abstractMap.f9668a = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        abstractMap.f9669b = map;
        abstractMap.f9672e = map;
        return abstractMap;
    }

    public final int a(Comparable comparable) {
        int i9;
        int size = this.f9668a.size();
        int i10 = size - 1;
        if (i10 >= 0) {
            int compareTo = comparable.compareTo(((W) this.f9668a.get(i10)).f9673a);
            if (compareTo > 0) {
                i9 = size + 1;
                return -i9;
            }
            if (compareTo == 0) {
                return i10;
            }
        }
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int compareTo2 = comparable.compareTo(((W) this.f9668a.get(i12)).f9673a);
            if (compareTo2 < 0) {
                i10 = i12 - 1;
            } else if (compareTo2 > 0) {
                i11 = i12 + 1;
            } else {
                return i12;
            }
        }
        i9 = i11 + 1;
        return -i9;
    }

    public final void b() {
        if (!this.f9670c) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i9) {
        return (Map.Entry) this.f9668a.get(i9);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f9668a.isEmpty()) {
            this.f9668a.clear();
        }
        if (!this.f9669b.isEmpty()) {
            this.f9669b.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (a(comparable) < 0 && !this.f9669b.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final Set d() {
        if (this.f9669b.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return this.f9669b.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f9669b.isEmpty() && !(this.f9669b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f9669b = treeMap;
            this.f9672e = treeMap.descendingMap();
        }
        return (SortedMap) this.f9669b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f9671d == null) {
            this.f9671d = new Y(this, 0);
        }
        return this.f9671d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof V)) {
                return super.equals(obj);
            }
            V v8 = (V) obj;
            int size = size();
            if (size == v8.size()) {
                int size2 = this.f9668a.size();
                if (size2 != v8.f9668a.size()) {
                    return ((AbstractSet) entrySet()).equals(v8.entrySet());
                }
                for (int i9 = 0; i9 < size2; i9++) {
                    if (c(i9).equals(v8.c(i9))) {
                    }
                }
                if (size2 != size) {
                    return this.f9669b.equals(v8.f9669b);
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a5 = a(comparable);
        if (a5 >= 0) {
            return ((W) this.f9668a.get(a5)).setValue(obj);
        }
        b();
        if (this.f9668a.isEmpty() && !(this.f9668a instanceof ArrayList)) {
            this.f9668a = new ArrayList(16);
        }
        int i9 = -(a5 + 1);
        if (i9 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f9668a.size() == 16) {
            W w7 = (W) this.f9668a.remove(15);
            e().put(w7.f9673a, w7.f9674b);
        }
        this.f9668a.add(i9, new W(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a5 = a(comparable);
        if (a5 >= 0) {
            return ((W) this.f9668a.get(a5)).f9674b;
        }
        return this.f9669b.get(comparable);
    }

    public final Object h(int i9) {
        b();
        Object obj = ((W) this.f9668a.remove(i9)).f9674b;
        if (!this.f9669b.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f9668a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new W(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f9668a.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += ((W) this.f9668a.get(i10)).hashCode();
        }
        if (this.f9669b.size() > 0) {
            return this.f9669b.hashCode() + i9;
        }
        return i9;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a5 = a(comparable);
        if (a5 >= 0) {
            return h(a5);
        }
        if (this.f9669b.isEmpty()) {
            return null;
        }
        return this.f9669b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f9669b.size() + this.f9668a.size();
    }
}
