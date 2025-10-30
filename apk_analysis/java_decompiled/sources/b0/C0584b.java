package b0;

import B7.k;
import B7.m;
import B7.y;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: b0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0584b {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f10457a;

    /* renamed from: b, reason: collision with root package name */
    public final Z.a f10458b;

    public C0584b(LinkedHashMap linkedHashMap, boolean z9) {
        this.f10457a = linkedHashMap;
        this.f10458b = new Z.a(z9);
    }

    public final Map a() {
        A7.h hVar;
        Set<Map.Entry> entrySet = this.f10457a.entrySet();
        int D8 = y.D(m.f0(entrySet, 10));
        if (D8 < 16) {
            D8 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(D8);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.h.d(copyOf, "copyOf(this, size)");
                hVar = new A7.h(key, copyOf);
            } else {
                hVar = new A7.h(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(hVar.f547a, hVar.f548b);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.h.d(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    public final void b() {
        if (!this.f10458b.f8863a.get()) {
        } else {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(g key) {
        kotlin.jvm.internal.h.e(key, "key");
        Object obj = this.f10457a.get(key);
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(this, size)");
            return copyOf;
        }
        return obj;
    }

    public final void d(g key, Object obj) {
        kotlin.jvm.internal.h.e(key, "key");
        b();
        LinkedHashMap linkedHashMap = this.f10457a;
        if (obj == null) {
            b();
            linkedHashMap.remove(key);
            return;
        }
        if (obj instanceof Set) {
            Set unmodifiableSet = Collections.unmodifiableSet(k.K0((Set) obj));
            kotlin.jvm.internal.h.d(unmodifiableSet, "unmodifiableSet(set.toSet())");
            linkedHashMap.put(key, unmodifiableSet);
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.h.d(copyOf, "copyOf(this, size)");
                linkedHashMap.put(key, copyOf);
                return;
            }
            linkedHashMap.put(key, obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:10:0x002c->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof b0.C0584b
            r1 = 0
            if (r0 != 0) goto L6
            goto L62
        L6:
            b0.b r7 = (b0.C0584b) r7
            java.util.LinkedHashMap r0 = r7.f10457a
            java.util.LinkedHashMap r2 = r6.f10457a
            r3 = 1
            if (r0 != r2) goto L10
            goto L63
        L10:
            int r0 = r0.size()
            int r4 = r2.size()
            if (r0 == r4) goto L1b
            goto L62
        L1b:
            java.util.LinkedHashMap r7 = r7.f10457a
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L24
            goto L63
        L24:
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L2c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r4 = r2.get(r4)
            if (r4 == 0) goto L5f
            java.lang.Object r0 = r0.getValue()
            boolean r5 = r0 instanceof byte[]
            if (r5 == 0) goto L5a
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L5f
            byte[] r0 = (byte[]) r0
            byte[] r4 = (byte[]) r4
            boolean r0 = java.util.Arrays.equals(r0, r4)
            if (r0 == 0) goto L5f
            r0 = r3
            goto L60
        L5a:
            boolean r0 = kotlin.jvm.internal.h.a(r0, r4)
            goto L60
        L5f:
            r0 = r1
        L60:
            if (r0 != 0) goto L2c
        L62:
            return r1
        L63:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.C0584b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode;
        Iterator it = this.f10457a.entrySet().iterator();
        int i9 = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof byte[]) {
                hashCode = Arrays.hashCode((byte[]) value);
            } else {
                hashCode = value.hashCode();
            }
            i9 += hashCode;
        }
        return i9;
    }

    public final String toString() {
        return k.u0(this.f10457a.entrySet(), ",\n", "{\n", "\n}", C0583a.f10456d, 24);
    }

    public /* synthetic */ C0584b(boolean z9) {
        this(new LinkedHashMap(), z9);
    }
}
