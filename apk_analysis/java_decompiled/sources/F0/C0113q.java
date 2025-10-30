package F0;

import b7.C0701c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: F0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113q {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2192a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f2193b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f2194c;

    /* renamed from: d, reason: collision with root package name */
    public final C0701c f2195d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2196e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2197f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2198g;

    public C0113q(C0701c c0701c, ArrayList arrayList, int[] iArr, int[] iArr2) {
        C0112p c0112p;
        int[] iArr3;
        int[] iArr4;
        C0701c c0701c2;
        int i9;
        C0112p c0112p2;
        int i10;
        int i11;
        int i12;
        this.f2192a = arrayList;
        this.f2193b = iArr;
        this.f2194c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f2195d = c0701c;
        RunnableC0100d runnableC0100d = (RunnableC0100d) c0701c.f11404b;
        int size = runnableC0100d.f2087a.size();
        this.f2196e = size;
        int size2 = runnableC0100d.f2088b.size();
        this.f2197f = size2;
        this.f2198g = true;
        if (arrayList.isEmpty()) {
            c0112p = null;
        } else {
            c0112p = (C0112p) arrayList.get(0);
        }
        if (c0112p == null || c0112p.f2189a != 0 || c0112p.f2190b != 0) {
            arrayList.add(0, new C0112p(0, 0, 0));
        }
        arrayList.add(new C0112p(size, size2, 0));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            iArr3 = this.f2194c;
            iArr4 = this.f2193b;
            c0701c2 = this.f2195d;
            if (!hasNext) {
                break;
            }
            C0112p c0112p3 = (C0112p) it.next();
            for (int i13 = 0; i13 < c0112p3.f2191c; i13++) {
                int i14 = c0112p3.f2189a + i13;
                int i15 = c0112p3.f2190b + i13;
                if (c0701c2.s(i14, i15)) {
                    i12 = 1;
                } else {
                    i12 = 2;
                }
                iArr4[i14] = (i15 << 4) | i12;
                iArr3[i15] = (i14 << 4) | i12;
            }
        }
        if (this.f2198g) {
            int size3 = arrayList.size();
            int i16 = 0;
            int i17 = 0;
            while (i17 < size3) {
                Object obj = arrayList.get(i17);
                i17++;
                C0112p c0112p4 = (C0112p) obj;
                while (true) {
                    i9 = c0112p4.f2189a;
                    if (i16 < i9) {
                        if (iArr4[i16] == 0) {
                            int size4 = arrayList.size();
                            int i18 = 0;
                            int i19 = 0;
                            while (true) {
                                if (i18 < size4) {
                                    c0112p2 = (C0112p) arrayList.get(i18);
                                    while (true) {
                                        i10 = c0112p2.f2190b;
                                        if (i19 < i10) {
                                            if (iArr3[i19] == 0 && c0701c2.u(i16, i19)) {
                                                if (c0701c2.s(i16, i19)) {
                                                    i11 = 8;
                                                } else {
                                                    i11 = 4;
                                                }
                                                iArr4[i16] = (i19 << 4) | i11;
                                                iArr3[i19] = i11 | (i16 << 4);
                                            } else {
                                                i19++;
                                            }
                                        }
                                    }
                                }
                                i19 = c0112p2.f2191c + i10;
                                i18++;
                            }
                        }
                        i16++;
                    }
                }
                i16 = c0112p4.f2191c + i9;
            }
        }
    }

    public static r a(ArrayDeque arrayDeque, int i9, boolean z9) {
        r rVar;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (it.hasNext()) {
                rVar = (r) it.next();
                if (rVar.f2206a == i9 && rVar.f2208c == z9) {
                    it.remove();
                    break;
                }
            } else {
                rVar = null;
                break;
            }
        }
        while (it.hasNext()) {
            r rVar2 = (r) it.next();
            if (z9) {
                rVar2.f2207b--;
            } else {
                rVar2.f2207b++;
            }
        }
        return rVar;
    }
}
