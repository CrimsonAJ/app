package C7;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public final class g implements Map, Serializable, P7.c {

    /* renamed from: n, reason: collision with root package name */
    public static final g f1638n;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f1639a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f1640b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f1641c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f1642d;

    /* renamed from: e, reason: collision with root package name */
    public int f1643e;

    /* renamed from: f, reason: collision with root package name */
    public int f1644f;

    /* renamed from: g, reason: collision with root package name */
    public int f1645g;

    /* renamed from: h, reason: collision with root package name */
    public int f1646h;

    /* renamed from: i, reason: collision with root package name */
    public int f1647i;
    public h j;

    /* renamed from: k, reason: collision with root package name */
    public i f1648k;

    /* renamed from: l, reason: collision with root package name */
    public h f1649l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1650m;

    static {
        g gVar = new g(0);
        gVar.f1650m = true;
        f1638n = gVar;
    }

    public g() {
        this(8);
    }

    public final int a(Object obj) {
        b();
        while (true) {
            int i9 = i(obj);
            int i10 = this.f1643e * 2;
            int length = this.f1642d.length / 2;
            if (i10 > length) {
                i10 = length;
            }
            int i11 = 0;
            while (true) {
                int[] iArr = this.f1642d;
                int i12 = iArr[i9];
                if (i12 <= 0) {
                    int i13 = this.f1644f;
                    Object[] objArr = this.f1639a;
                    if (i13 >= objArr.length) {
                        f(1);
                    } else {
                        int i14 = i13 + 1;
                        this.f1644f = i14;
                        objArr[i13] = obj;
                        this.f1641c[i13] = i9;
                        iArr[i9] = i14;
                        this.f1647i++;
                        this.f1646h++;
                        if (i11 > this.f1643e) {
                            this.f1643e = i11;
                        }
                        return i13;
                    }
                } else {
                    if (kotlin.jvm.internal.h.a(this.f1639a[i12 - 1], obj)) {
                        return -i12;
                    }
                    i11++;
                    if (i11 > i10) {
                        j(this.f1642d.length * 2);
                        break;
                    }
                    int i15 = i9 - 1;
                    if (i9 == 0) {
                        i9 = this.f1642d.length - 1;
                    } else {
                        i9 = i15;
                    }
                }
            }
        }
    }

    public final void b() {
        if (!this.f1650m) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final void c(boolean z9) {
        int i9;
        Object[] objArr = this.f1640b;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i9 = this.f1644f;
            if (i10 >= i9) {
                break;
            }
            int[] iArr = this.f1641c;
            int i12 = iArr[i10];
            if (i12 >= 0) {
                Object[] objArr2 = this.f1639a;
                objArr2[i11] = objArr2[i10];
                if (objArr != null) {
                    objArr[i11] = objArr[i10];
                }
                if (z9) {
                    iArr[i11] = i12;
                    this.f1642d[i12] = i11 + 1;
                }
                i11++;
            }
            i10++;
        }
        s8.e.W(this.f1639a, i11, i9);
        if (objArr != null) {
            s8.e.W(objArr, i11, this.f1644f);
        }
        this.f1644f = i11;
    }

    @Override // java.util.Map
    public final void clear() {
        b();
        int i9 = this.f1644f - 1;
        if (i9 >= 0) {
            int i10 = 0;
            while (true) {
                int[] iArr = this.f1641c;
                int i11 = iArr[i10];
                if (i11 >= 0) {
                    this.f1642d[i11] = 0;
                    iArr[i10] = -1;
                }
                if (i10 == i9) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        s8.e.W(this.f1639a, 0, this.f1644f);
        Object[] objArr = this.f1640b;
        if (objArr != null) {
            s8.e.W(objArr, 0, this.f1644f);
        }
        this.f1647i = 0;
        this.f1644f = 0;
        this.f1646h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (g(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (h(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean d(Collection m9) {
        kotlin.jvm.internal.h.e(m9, "m");
        for (Object obj : m9) {
            if (obj != null) {
                try {
                    if (!e((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean e(Map.Entry entry) {
        kotlin.jvm.internal.h.e(entry, "entry");
        int g9 = g(entry.getKey());
        if (g9 < 0) {
            return false;
        }
        Object[] objArr = this.f1640b;
        kotlin.jvm.internal.h.b(objArr);
        return kotlin.jvm.internal.h.a(objArr[g9], entry.getValue());
    }

    @Override // java.util.Map
    public final Set entrySet() {
        h hVar = this.f1649l;
        if (hVar == null) {
            h hVar2 = new h(this, 0);
            this.f1649l = hVar2;
            return hVar2;
        }
        return hVar;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f1647i != map.size() || !d(map.entrySet())) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void f(int i9) {
        Object[] objArr;
        Object[] objArr2 = this.f1639a;
        int length = objArr2.length;
        int i10 = this.f1644f;
        int i11 = length - i10;
        int i12 = i10 - this.f1647i;
        int i13 = 1;
        if (i11 < i9 && i11 + i12 >= i9 && i12 >= objArr2.length / 4) {
            c(true);
            return;
        }
        int i14 = i10 + i9;
        if (i14 >= 0) {
            if (i14 > objArr2.length) {
                int length2 = objArr2.length;
                int i15 = length2 + (length2 >> 1);
                if (i15 - i14 < 0) {
                    i15 = i14;
                }
                if (i15 - 2147483639 > 0) {
                    if (i14 > 2147483639) {
                        i15 = Integer.MAX_VALUE;
                    } else {
                        i15 = 2147483639;
                    }
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i15);
                kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
                this.f1639a = copyOf;
                Object[] objArr3 = this.f1640b;
                if (objArr3 != null) {
                    objArr = Arrays.copyOf(objArr3, i15);
                    kotlin.jvm.internal.h.d(objArr, "copyOf(...)");
                } else {
                    objArr = null;
                }
                this.f1640b = objArr;
                int[] copyOf2 = Arrays.copyOf(this.f1641c, i15);
                kotlin.jvm.internal.h.d(copyOf2, "copyOf(...)");
                this.f1641c = copyOf2;
                if (i15 >= 1) {
                    i13 = i15;
                }
                int highestOneBit = Integer.highestOneBit(i13 * 3);
                if (highestOneBit > this.f1642d.length) {
                    j(highestOneBit);
                    return;
                }
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    public final int g(Object obj) {
        int i9 = i(obj);
        int i10 = this.f1643e;
        while (true) {
            int i11 = this.f1642d[i9];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (kotlin.jvm.internal.h.a(this.f1639a[i12], obj)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            int i13 = i9 - 1;
            if (i9 == 0) {
                i9 = this.f1642d.length - 1;
            } else {
                i9 = i13;
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int g9 = g(obj);
        if (g9 < 0) {
            return null;
        }
        Object[] objArr = this.f1640b;
        kotlin.jvm.internal.h.b(objArr);
        return objArr[g9];
    }

    public final int h(Object obj) {
        int i9 = this.f1644f;
        while (true) {
            i9--;
            if (i9 < 0) {
                return -1;
            }
            if (this.f1641c[i9] >= 0) {
                Object[] objArr = this.f1640b;
                kotlin.jvm.internal.h.b(objArr);
                if (kotlin.jvm.internal.h.a(objArr[i9], obj)) {
                    return i9;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i9;
        int i10;
        d dVar = new d(this, 0);
        int i11 = 0;
        while (dVar.hasNext()) {
            int i12 = dVar.f1634a;
            g gVar = (g) dVar.f1637d;
            if (i12 < gVar.f1644f) {
                dVar.f1634a = i12 + 1;
                dVar.f1635b = i12;
                Object obj = gVar.f1639a[i12];
                if (obj != null) {
                    i9 = obj.hashCode();
                } else {
                    i9 = 0;
                }
                Object[] objArr = gVar.f1640b;
                kotlin.jvm.internal.h.b(objArr);
                Object obj2 = objArr[dVar.f1635b];
                if (obj2 != null) {
                    i10 = obj2.hashCode();
                } else {
                    i10 = 0;
                }
                dVar.e();
                i11 += i9 ^ i10;
            } else {
                throw new NoSuchElementException();
            }
        }
        return i11;
    }

    public final int i(Object obj) {
        int i9;
        if (obj != null) {
            i9 = obj.hashCode();
        } else {
            i9 = 0;
        }
        return (i9 * (-1640531527)) >>> this.f1645g;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.f1647i == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f1641c[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r6) {
        /*
            r5 = this;
            int r0 = r5.f1646h
            int r0 = r0 + 1
            r5.f1646h = r0
            int r0 = r5.f1644f
            int r1 = r5.f1647i
            r2 = 0
            if (r0 <= r1) goto L10
            r5.c(r2)
        L10:
            int[] r0 = new int[r6]
            r5.f1642d = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.f1645g = r6
        L1c:
            int r6 = r5.f1644f
            if (r2 >= r6) goto L50
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f1639a
            r0 = r0[r2]
            int r0 = r5.i(r0)
            int r1 = r5.f1643e
        L2c:
            int[] r3 = r5.f1642d
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.f1641c
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r6.<init>(r0)
            throw r6
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C7.g.j(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0024->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f1639a
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.h.e(r0, r1)
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.f1640b
            if (r0 == 0) goto L10
            r0[r12] = r1
        L10:
            int[] r0 = r11.f1641c
            r0 = r0[r12]
            int r1 = r11.f1643e
            int r1 = r1 * 2
            int[] r2 = r11.f1642d
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L20
            r1 = r2
        L20:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L24:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L2e
            int[] r0 = r11.f1642d
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2f
        L2e:
            r0 = r5
        L2f:
            int r4 = r4 + 1
            int r5 = r11.f1643e
            r6 = -1
            if (r4 <= r5) goto L3b
            int[] r0 = r11.f1642d
            r0[r1] = r2
            goto L6c
        L3b:
            int[] r5 = r11.f1642d
            r7 = r5[r0]
            if (r7 != 0) goto L44
            r5[r1] = r2
            goto L6c
        L44:
            if (r7 >= 0) goto L4b
            r5[r1] = r6
        L48:
            r1 = r0
            r4 = r2
            goto L65
        L4b:
            java.lang.Object[] r5 = r11.f1639a
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.i(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f1642d
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L65
            r9[r1] = r7
            int[] r4 = r11.f1641c
            r4[r8] = r1
            goto L48
        L65:
            int r3 = r3 + r6
            if (r3 >= 0) goto L24
            int[] r0 = r11.f1642d
            r0[r1] = r6
        L6c:
            int[] r0 = r11.f1641c
            r0[r12] = r6
            int r12 = r11.f1647i
            int r12 = r12 + r6
            r11.f1647i = r12
            int r12 = r11.f1646h
            int r12 = r12 + 1
            r11.f1646h = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C7.g.k(int):void");
    }

    @Override // java.util.Map
    public final Set keySet() {
        h hVar = this.j;
        if (hVar == null) {
            h hVar2 = new h(this, 1);
            this.j = hVar2;
            return hVar2;
        }
        return hVar;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        int a5 = a(obj);
        Object[] objArr = this.f1640b;
        if (objArr == null) {
            int length = this.f1639a.length;
            if (length >= 0) {
                objArr = new Object[length];
                this.f1640b = objArr;
            } else {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
        }
        if (a5 < 0) {
            int i9 = (-a5) - 1;
            Object obj3 = objArr[i9];
            objArr[i9] = obj2;
            return obj3;
        }
        objArr[a5] = obj2;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        kotlin.jvm.internal.h.e(from, "from");
        b();
        Set<Map.Entry> entrySet = from.entrySet();
        if (!entrySet.isEmpty()) {
            f(entrySet.size());
            for (Map.Entry entry : entrySet) {
                int a5 = a(entry.getKey());
                Object[] objArr = this.f1640b;
                if (objArr == null) {
                    int length = this.f1639a.length;
                    if (length >= 0) {
                        objArr = new Object[length];
                        this.f1640b = objArr;
                    } else {
                        throw new IllegalArgumentException("capacity must be non-negative.");
                    }
                }
                if (a5 >= 0) {
                    objArr[a5] = entry.getValue();
                } else {
                    int i9 = (-a5) - 1;
                    if (!kotlin.jvm.internal.h.a(entry.getValue(), objArr[i9])) {
                        objArr[i9] = entry.getValue();
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        b();
        int g9 = g(obj);
        if (g9 < 0) {
            return null;
        }
        Object[] objArr = this.f1640b;
        kotlin.jvm.internal.h.b(objArr);
        Object obj2 = objArr[g9];
        k(g9);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f1647i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f1647i * 3) + 2);
        sb.append("{");
        d dVar = new d(this, 0);
        int i9 = 0;
        while (dVar.hasNext()) {
            if (i9 > 0) {
                sb.append(", ");
            }
            int i10 = dVar.f1634a;
            g gVar = (g) dVar.f1637d;
            if (i10 < gVar.f1644f) {
                dVar.f1634a = i10 + 1;
                dVar.f1635b = i10;
                Object obj = gVar.f1639a[i10];
                if (obj == gVar) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] objArr = gVar.f1640b;
                kotlin.jvm.internal.h.b(objArr);
                Object obj2 = objArr[dVar.f1635b];
                if (obj2 == gVar) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                dVar.e();
                i9++;
            } else {
                throw new NoSuchElementException();
            }
        }
        sb.append("}");
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection values() {
        i iVar = this.f1648k;
        if (iVar == null) {
            i iVar2 = new i(this);
            this.f1648k = iVar2;
            return iVar2;
        }
        return iVar;
    }

    public g(int i9) {
        if (i9 >= 0) {
            Object[] objArr = new Object[i9];
            int[] iArr = new int[i9];
            int highestOneBit = Integer.highestOneBit((i9 < 1 ? 1 : i9) * 3);
            this.f1639a = objArr;
            this.f1640b = null;
            this.f1641c = iArr;
            this.f1642d = new int[highestOneBit];
            this.f1643e = 2;
            this.f1644f = 0;
            this.f1645g = Integer.numberOfLeadingZeros(highestOneBit) + 1;
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }
}
