package P5;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes.dex */
public final class X implements Map, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final X f5938g = new X(null, new Object[0], 0);

    /* renamed from: a, reason: collision with root package name */
    public transient U f5939a;

    /* renamed from: b, reason: collision with root package name */
    public transient V f5940b;

    /* renamed from: c, reason: collision with root package name */
    public transient W f5941c;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object f5942d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f5943e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f5944f;

    public X(Object obj, Object[] objArr, int i9) {
        this.f5942d = obj;
        this.f5943e = objArr;
        this.f5944f = i9;
    }

    public static X a(Map map) {
        int i9;
        if ((map instanceof X) && !(map instanceof SortedMap)) {
            X x5 = (X) map;
            x5.getClass();
            return x5;
        }
        Set entrySet = map.entrySet();
        if (u0.z.i(entrySet)) {
            i9 = entrySet.size();
        } else {
            i9 = 4;
        }
        A3.E e8 = new A3.E(i9, 6);
        e8.p(entrySet);
        return e8.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0199  */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static P5.X b(int r19, java.lang.Object[] r20, A3.E r21) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P5.X.b(int, java.lang.Object[], A3.E):P5.X");
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final I entrySet() {
        U u9 = this.f5939a;
        if (u9 == null) {
            U u10 = new U(this, this.f5943e, this.f5944f);
            this.f5939a = u10;
            return u10;
        }
        return u9;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final I keySet() {
        V v8 = this.f5940b;
        if (v8 == null) {
            V v9 = new V(this, new W(this.f5943e, 0, this.f5944f));
            this.f5940b = v9;
            return v9;
        }
        return v8;
    }

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final A values() {
        W w7 = this.f5941c;
        if (w7 == null) {
            W w9 = new W(this.f5943e, 1, this.f5944f);
            this.f5941c = w9;
            return w9;
        }
        return w7;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return AbstractC0349q.e(this, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L6
        L3:
            r9 = r0
            goto L9c
        L6:
            r1 = 1
            java.lang.Object[] r2 = r8.f5943e
            int r3 = r8.f5944f
            if (r3 != r1) goto L20
            r3 = 0
            r3 = r2[r3]
            java.util.Objects.requireNonNull(r3)
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto L3
            r9 = r2[r1]
            java.util.Objects.requireNonNull(r9)
            goto L9c
        L20:
            java.lang.Object r3 = r8.f5942d
            if (r3 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r3 instanceof byte[]
            if (r4 == 0) goto L50
            r4 = r3
            byte[] r4 = (byte[]) r4
            int r3 = r4.length
            int r5 = r3 + (-1)
            int r3 = r9.hashCode()
            int r3 = P5.AbstractC0349q.q(r3)
        L37:
            r3 = r3 & r5
            r6 = r4[r3]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L40
            goto L3
        L40:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L4d
            r9 = r6 ^ 1
            r9 = r2[r9]
            goto L9c
        L4d:
            int r3 = r3 + 1
            goto L37
        L50:
            boolean r4 = r3 instanceof short[]
            if (r4 == 0) goto L7c
            r4 = r3
            short[] r4 = (short[]) r4
            int r3 = r4.length
            int r5 = r3 + (-1)
            int r3 = r9.hashCode()
            int r3 = P5.AbstractC0349q.q(r3)
        L62:
            r3 = r3 & r5
            short r6 = r4[r3]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L6c
            goto L3
        L6c:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L79
            r9 = r6 ^ 1
            r9 = r2[r9]
            goto L9c
        L79:
            int r3 = r3 + 1
            goto L62
        L7c:
            int[] r3 = (int[]) r3
            int r4 = r3.length
            int r4 = r4 - r1
            int r5 = r9.hashCode()
            int r5 = P5.AbstractC0349q.q(r5)
        L88:
            r5 = r5 & r4
            r6 = r3[r5]
            r7 = -1
            if (r6 != r7) goto L90
            goto L3
        L90:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto La0
            r9 = r6 ^ 1
            r9 = r2[r9]
        L9c:
            if (r9 != 0) goto L9f
            return r0
        L9f:
            return r9
        La0:
            int r5 = r5 + 1
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: P5.X.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC0349q.j(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f5944f;
    }

    public final String toString() {
        int i9 = this.f5944f;
        AbstractC0349q.c(i9, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(i9 * 8, 1073741824L));
        sb.append('{');
        f0 it = ((U) entrySet()).iterator();
        boolean z9 = true;
        while (true) {
            D d9 = (D) it;
            if (d9.hasNext()) {
                Map.Entry entry = (Map.Entry) d9.next();
                if (!z9) {
                    sb.append(", ");
                }
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
                z9 = false;
            } else {
                sb.append('}');
                return sb.toString();
            }
        }
    }
}
