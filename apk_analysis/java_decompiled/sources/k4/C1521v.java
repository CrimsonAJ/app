package k4;

import P5.AbstractC0349q;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: k4.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1521v implements Map {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20122a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f20123b;

    public /* synthetic */ C1521v(Map map, int i9) {
        this.f20122a = i9;
        this.f20123b = map;
    }

    @Override // java.util.Map
    public final void clear() {
        switch (this.f20122a) {
            case 0:
                this.f20123b.clear();
                return;
            default:
                throw new UnsupportedOperationException("Dagger map bindings are immutable");
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.f20122a) {
            case 0:
                if (obj != null && this.f20123b.containsKey(obj)) {
                    return true;
                }
                return false;
            default:
                if (obj instanceof Class) {
                    return ((P5.X) this.f20123b).containsKey(((Class) obj).getName());
                }
                throw new IllegalArgumentException("Key must be a class");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (((java.util.Map.Entry) r0.next()).getValue() != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (r0.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (r3.equals(((java.util.Map.Entry) r0.next()).getValue()) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r3 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r0.hasNext() == false) goto L20;
     */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsValue(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.f20122a
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.util.Map r0 = r2.f20123b
            P5.X r0 = (P5.X) r0
            boolean r3 = r0.containsValue(r3)
            return r3
        Le:
            java.util.Set r0 = r2.entrySet()
            P5.b0 r0 = (P5.b0) r0
            java.util.Iterator r0 = r0.iterator()
            r0.getClass()
            if (r3 != 0) goto L30
        L1d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L48
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getValue()
            if (r3 != 0) goto L1d
            goto L46
        L30:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L48
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L30
        L46:
            r3 = 1
            goto L49
        L48:
            r3 = 0
        L49:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.C1521v.containsValue(java.lang.Object):boolean");
    }

    @Override // java.util.Map
    public final Set entrySet() {
        switch (this.f20122a) {
            case 0:
                return AbstractC0349q.g(this.f20123b.entrySet(), new C1520u(1));
            default:
                throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
        }
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        switch (this.f20122a) {
            case 0:
                if (obj != null && AbstractC0349q.e(this, obj)) {
                    return true;
                }
                return false;
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        switch (this.f20122a) {
            case 0:
                if (obj == null) {
                    return null;
                }
                return (List) this.f20123b.get(obj);
            default:
                if (obj instanceof Class) {
                    return ((P5.X) this.f20123b).get(((Class) obj).getName());
                }
                throw new IllegalArgumentException("Key must be a class");
        }
    }

    @Override // java.util.Map
    public int hashCode() {
        switch (this.f20122a) {
            case 0:
                return AbstractC0349q.j(entrySet());
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        switch (this.f20122a) {
            case 0:
                Map map = this.f20123b;
                if (map.isEmpty()) {
                    return true;
                }
                if (map.size() == 1 && map.containsKey(null)) {
                    return true;
                }
                return false;
            default:
                return ((P5.X) this.f20123b).isEmpty();
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        switch (this.f20122a) {
            case 0:
                return AbstractC0349q.g(this.f20123b.keySet(), new C1520u(0));
            default:
                throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        switch (this.f20122a) {
            case 0:
                return this.f20123b.put(obj, obj2);
            default:
                throw new UnsupportedOperationException("Dagger map bindings are immutable");
        }
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        switch (this.f20122a) {
            case 0:
                this.f20123b.putAll(map);
                return;
            default:
                throw new UnsupportedOperationException("Dagger map bindings are immutable");
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        switch (this.f20122a) {
            case 0:
                return this.f20123b.remove(obj);
            default:
                throw new UnsupportedOperationException("Dagger map bindings are immutable");
        }
    }

    @Override // java.util.Map
    public final int size() {
        switch (this.f20122a) {
            case 0:
                Map map = this.f20123b;
                return map.size() - (map.containsKey(null) ? 1 : 0);
            default:
                return ((P5.X) this.f20123b).f5944f;
        }
    }

    public String toString() {
        switch (this.f20122a) {
            case 0:
                return this.f20123b.toString();
            default:
                return super.toString();
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        switch (this.f20122a) {
            case 0:
                return this.f20123b.values();
            default:
                return ((P5.X) this.f20123b).values();
        }
    }
}
