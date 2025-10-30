package P5;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: P5.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0352u extends AbstractMap implements Serializable {
    public static final Object j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public transient Object f6001a;

    /* renamed from: b, reason: collision with root package name */
    public transient int[] f6002b;

    /* renamed from: c, reason: collision with root package name */
    public transient Object[] f6003c;

    /* renamed from: d, reason: collision with root package name */
    public transient Object[] f6004d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f6005e;

    /* renamed from: f, reason: collision with root package name */
    public transient int f6006f;

    /* renamed from: g, reason: collision with root package name */
    public transient C0350s f6007g;

    /* renamed from: h, reason: collision with root package name */
    public transient C0350s f6008h;

    /* renamed from: i, reason: collision with root package name */
    public transient C0346n f6009i;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, P5.u] */
    public static C0352u a() {
        ?? abstractMap = new AbstractMap();
        abstractMap.f6005e = v4.e.f(3, 1);
        return abstractMap;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, P5.u] */
    public static C0352u b() {
        ?? abstractMap = new AbstractMap();
        abstractMap.f6005e = v4.e.f(8, 1);
        return abstractMap;
    }

    public final Map c() {
        Object obj = this.f6001a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (g()) {
            return;
        }
        this.f6005e += 32;
        Map c3 = c();
        if (c3 != null) {
            this.f6005e = v4.e.f(size(), 3);
            c3.clear();
            this.f6001a = null;
            this.f6006f = 0;
            return;
        }
        Arrays.fill(j(), 0, this.f6006f, (Object) null);
        Arrays.fill(k(), 0, this.f6006f, (Object) null);
        Object obj = this.f6001a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(i(), 0, this.f6006f, 0);
        this.f6006f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map c3 = c();
        if (c3 != null) {
            return c3.containsKey(obj);
        }
        if (e(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map c3 = c();
        if (c3 != null) {
            return c3.containsValue(obj);
        }
        for (int i9 = 0; i9 < this.f6006f; i9++) {
            if (M4.a.l(obj, k()[i9])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.f6005e & 31)) - 1;
    }

    public final int e(Object obj) {
        if (g()) {
            return -1;
        }
        int r5 = AbstractC0349q.r(obj);
        int d9 = d();
        Object obj2 = this.f6001a;
        Objects.requireNonNull(obj2);
        int s9 = AbstractC0349q.s(r5 & d9, obj2);
        if (s9 == 0) {
            return -1;
        }
        int i9 = ~d9;
        int i10 = r5 & i9;
        do {
            int i11 = s9 - 1;
            int i12 = i()[i11];
            if ((i12 & i9) == i10 && M4.a.l(obj, j()[i11])) {
                return i11;
            }
            s9 = i12 & d9;
        } while (s9 != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0350s c0350s = this.f6008h;
        if (c0350s == null) {
            C0350s c0350s2 = new C0350s(this, 0);
            this.f6008h = c0350s2;
            return c0350s2;
        }
        return c0350s;
    }

    public final void f(int i9, int i10) {
        Object obj = this.f6001a;
        Objects.requireNonNull(obj);
        int[] i11 = i();
        Object[] j4 = j();
        Object[] k5 = k();
        int size = size();
        int i12 = size - 1;
        if (i9 < i12) {
            Object obj2 = j4[i12];
            j4[i9] = obj2;
            k5[i9] = k5[i12];
            j4[i12] = null;
            k5[i12] = null;
            i11[i9] = i11[i12];
            i11[i12] = 0;
            int r5 = AbstractC0349q.r(obj2) & i10;
            int s9 = AbstractC0349q.s(r5, obj);
            if (s9 == size) {
                AbstractC0349q.t(r5, i9 + 1, obj);
                return;
            }
            while (true) {
                int i13 = s9 - 1;
                int i14 = i11[i13];
                int i15 = i14 & i10;
                if (i15 == size) {
                    i11[i13] = AbstractC0349q.l(i14, i9 + 1, i10);
                    return;
                }
                s9 = i15;
            }
        } else {
            j4[i9] = null;
            k5[i9] = null;
            i11[i9] = 0;
        }
    }

    public final boolean g() {
        if (this.f6001a == null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map c3 = c();
        if (c3 != null) {
            return c3.get(obj);
        }
        int e8 = e(obj);
        if (e8 == -1) {
            return null;
        }
        return k()[e8];
    }

    public final Object h(Object obj) {
        boolean g9 = g();
        Object obj2 = j;
        if (!g9) {
            int d9 = d();
            Object obj3 = this.f6001a;
            Objects.requireNonNull(obj3);
            int o9 = AbstractC0349q.o(obj, null, d9, obj3, i(), j(), null);
            if (o9 != -1) {
                Object obj4 = k()[o9];
                f(o9, d9);
                this.f6006f--;
                this.f6005e += 32;
                return obj4;
            }
        }
        return obj2;
    }

    public final int[] i() {
        int[] iArr = this.f6002b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final Object[] j() {
        Object[] objArr = this.f6003c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] k() {
        Object[] objArr = this.f6004d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C0350s c0350s = this.f6007g;
        if (c0350s == null) {
            C0350s c0350s2 = new C0350s(this, 1);
            this.f6007g = c0350s2;
            return c0350s2;
        }
        return c0350s;
    }

    public final int l(int i9, int i10, int i11, int i12) {
        Object d9 = AbstractC0349q.d(i10);
        int i13 = i10 - 1;
        if (i12 != 0) {
            AbstractC0349q.t(i11 & i13, i12 + 1, d9);
        }
        Object obj = this.f6001a;
        Objects.requireNonNull(obj);
        int[] i14 = i();
        for (int i15 = 0; i15 <= i9; i15++) {
            int s9 = AbstractC0349q.s(i15, obj);
            while (s9 != 0) {
                int i16 = s9 - 1;
                int i17 = i14[i16];
                int i18 = ((~i9) & i17) | i15;
                int i19 = i18 & i13;
                int s10 = AbstractC0349q.s(i19, d9);
                AbstractC0349q.t(i19, s9, d9);
                i14[i16] = AbstractC0349q.l(i18, s10, i13);
                s9 = i17 & i9;
            }
        }
        this.f6001a = d9;
        this.f6005e = AbstractC0349q.l(this.f6005e, 32 - Integer.numberOfLeadingZeros(i13), 31);
        return i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00fe -> B:43:0x00e4). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object put(java.lang.Object r23, java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P5.C0352u.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map c3 = c();
        if (c3 != null) {
            return c3.remove(obj);
        }
        Object h7 = h(obj);
        if (h7 == j) {
            return null;
        }
        return h7;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map c3 = c();
        if (c3 != null) {
            return c3.size();
        }
        return this.f6006f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C0346n c0346n = this.f6009i;
        if (c0346n == null) {
            C0346n c0346n2 = new C0346n(1, this);
            this.f6009i = c0346n2;
            return c0346n2;
        }
        return c0346n;
    }
}
