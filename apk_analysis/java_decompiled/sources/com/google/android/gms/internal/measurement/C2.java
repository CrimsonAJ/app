package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class C2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Z1 f15189a;

    static {
        C1023y2 c1023y2 = C1023y2.f15696c;
        f15189a = new Z1(6);
    }

    public static void a(int i9, List list, C0974o2 c0974o2, boolean z9) {
        if (list != null && !list.isEmpty()) {
            c0974o2.getClass();
            boolean z10 = list instanceof C0914c2;
            U1 u12 = (U1) c0974o2.f15559a;
            int i10 = 0;
            if (z10) {
                C0914c2 c0914c2 = (C0914c2) list;
                if (z9) {
                    u12.M(i9, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < c0914c2.f15453c; i12++) {
                        int c3 = c0914c2.c(i12);
                        i11 += U1.S((c3 >> 31) ^ (c3 + c3));
                    }
                    u12.O(i11);
                    while (i10 < c0914c2.f15453c) {
                        int c9 = c0914c2.c(i10);
                        u12.O((c9 >> 31) ^ (c9 + c9));
                        i10++;
                    }
                    return;
                }
                while (i10 < c0914c2.f15453c) {
                    int c10 = c0914c2.c(i10);
                    u12.N(i9, (c10 >> 31) ^ (c10 + c10));
                    i10++;
                }
                return;
            }
            if (z9) {
                u12.M(i9, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    int intValue = ((Integer) list.get(i14)).intValue();
                    i13 += U1.S((intValue >> 31) ^ (intValue + intValue));
                }
                u12.O(i13);
                while (i10 < list.size()) {
                    int intValue2 = ((Integer) list.get(i10)).intValue();
                    u12.O((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                int intValue3 = ((Integer) list.get(i10)).intValue();
                u12.N(i9, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i10++;
            }
        }
    }

    public static void b(int i9, List list, C0974o2 c0974o2, boolean z9) {
        if (list != null && !list.isEmpty()) {
            c0974o2.getClass();
            boolean z10 = list instanceof C0969n2;
            U1 u12 = (U1) c0974o2.f15559a;
            int i10 = 0;
            if (z10) {
                C0969n2 c0969n2 = (C0969n2) list;
                if (z9) {
                    u12.M(i9, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < c0969n2.f15554c; i12++) {
                        long c3 = c0969n2.c(i12);
                        i11 += U1.C((c3 >> 63) ^ (c3 + c3));
                    }
                    u12.O(i11);
                    while (i10 < c0969n2.f15554c) {
                        long c9 = c0969n2.c(i10);
                        u12.Q((c9 >> 63) ^ (c9 + c9));
                        i10++;
                    }
                    return;
                }
                while (i10 < c0969n2.f15554c) {
                    long c10 = c0969n2.c(i10);
                    u12.P((c10 >> 63) ^ (c10 + c10), i9);
                    i10++;
                }
                return;
            }
            if (z9) {
                u12.M(i9, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    long longValue = ((Long) list.get(i14)).longValue();
                    i13 += U1.C((longValue >> 63) ^ (longValue + longValue));
                }
                u12.O(i13);
                while (i10 < list.size()) {
                    long longValue2 = ((Long) list.get(i10)).longValue();
                    u12.Q((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                long longValue3 = ((Long) list.get(i10)).longValue();
                u12.P((longValue3 >> 63) ^ (longValue3 + longValue3), i9);
                i10++;
            }
        }
    }

    public static void c(int i9, List list, C0974o2 c0974o2, boolean z9) {
        if (list != null && !list.isEmpty()) {
            c0974o2.getClass();
            boolean z10 = list instanceof C0914c2;
            U1 u12 = (U1) c0974o2.f15559a;
            int i10 = 0;
            if (z10) {
                C0914c2 c0914c2 = (C0914c2) list;
                if (z9) {
                    u12.M(i9, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < c0914c2.f15453c; i12++) {
                        i11 += U1.S(c0914c2.c(i12));
                    }
                    u12.O(i11);
                    while (i10 < c0914c2.f15453c) {
                        u12.O(c0914c2.c(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < c0914c2.f15453c) {
                    u12.N(i9, c0914c2.c(i10));
                    i10++;
                }
                return;
            }
            if (z9) {
                u12.M(i9, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += U1.S(((Integer) list.get(i14)).intValue());
                }
                u12.O(i13);
                while (i10 < list.size()) {
                    u12.O(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                u12.N(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void d(int i9, List list, C0974o2 c0974o2, boolean z9) {
        if (list != null && !list.isEmpty()) {
            c0974o2.getClass();
            boolean z10 = list instanceof C0969n2;
            U1 u12 = (U1) c0974o2.f15559a;
            int i10 = 0;
            if (z10) {
                C0969n2 c0969n2 = (C0969n2) list;
                if (z9) {
                    u12.M(i9, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < c0969n2.f15554c; i12++) {
                        i11 += U1.C(c0969n2.c(i12));
                    }
                    u12.O(i11);
                    while (i10 < c0969n2.f15554c) {
                        u12.Q(c0969n2.c(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < c0969n2.f15554c) {
                    u12.P(c0969n2.c(i10), i9);
                    i10++;
                }
                return;
            }
            if (z9) {
                u12.M(i9, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += U1.C(((Long) list.get(i14)).longValue());
                }
                u12.O(i13);
                while (i10 < list.size()) {
                    u12.Q(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                u12.P(((Long) list.get(i10)).longValue(), i9);
                i10++;
            }
        }
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static int f(List list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0914c2) {
            C0914c2 c0914c2 = (C0914c2) list;
            int i10 = 0;
            while (i9 < size) {
                i10 += U1.C(c0914c2.c(i9));
                i9++;
            }
            return i10;
        }
        int i11 = 0;
        while (i9 < size) {
            i11 += U1.C(((Integer) list.get(i9)).intValue());
            i9++;
        }
        return i11;
    }

    public static int g(List list, int i9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (U1.S(i9 << 3) + 4) * size;
    }

    public static int h(List list, int i9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (U1.S(i9 << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0914c2) {
            C0914c2 c0914c2 = (C0914c2) list;
            int i10 = 0;
            while (i9 < size) {
                i10 += U1.C(c0914c2.c(i9));
                i9++;
            }
            return i10;
        }
        int i11 = 0;
        while (i9 < size) {
            i11 += U1.C(((Integer) list.get(i9)).intValue());
            i9++;
        }
        return i11;
    }

    public static int j(List list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0969n2) {
            C0969n2 c0969n2 = (C0969n2) list;
            int i10 = 0;
            while (i9 < size) {
                i10 += U1.C(c0969n2.c(i9));
                i9++;
            }
            return i10;
        }
        int i11 = 0;
        while (i9 < size) {
            i11 += U1.C(((Long) list.get(i9)).longValue());
            i9++;
        }
        return i11;
    }

    public static int k(List list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0914c2) {
            C0914c2 c0914c2 = (C0914c2) list;
            int i10 = 0;
            while (i9 < size) {
                int c3 = c0914c2.c(i9);
                i10 += U1.S((c3 >> 31) ^ (c3 + c3));
                i9++;
            }
            return i10;
        }
        int i11 = 0;
        while (i9 < size) {
            int intValue = ((Integer) list.get(i9)).intValue();
            i11 += U1.S((intValue >> 31) ^ (intValue + intValue));
            i9++;
        }
        return i11;
    }

    public static int l(List list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0969n2) {
            C0969n2 c0969n2 = (C0969n2) list;
            int i10 = 0;
            while (i9 < size) {
                long c3 = c0969n2.c(i9);
                i10 += U1.C((c3 >> 63) ^ (c3 + c3));
                i9++;
            }
            return i10;
        }
        int i11 = 0;
        while (i9 < size) {
            long longValue = ((Long) list.get(i9)).longValue();
            i11 += U1.C((longValue >> 63) ^ (longValue + longValue));
            i9++;
        }
        return i11;
    }

    public static int m(List list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0914c2) {
            C0914c2 c0914c2 = (C0914c2) list;
            int i10 = 0;
            while (i9 < size) {
                i10 += U1.S(c0914c2.c(i9));
                i9++;
            }
            return i10;
        }
        int i11 = 0;
        while (i9 < size) {
            i11 += U1.S(((Integer) list.get(i9)).intValue());
            i9++;
        }
        return i11;
    }

    public static int n(List list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0969n2) {
            C0969n2 c0969n2 = (C0969n2) list;
            int i10 = 0;
            while (i9 < size) {
                i10 += U1.C(c0969n2.c(i9));
                i9++;
            }
            return i10;
        }
        int i11 = 0;
        while (i9 < size) {
            i11 += U1.C(((Long) list.get(i9)).longValue());
            i9++;
        }
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r4 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object o(java.lang.Object r2, int r3, java.lang.Object r4, int r5) {
        /*
            if (r4 != 0) goto L10
            com.google.android.gms.internal.measurement.b2 r2 = (com.google.android.gms.internal.measurement.AbstractC0909b2) r2
            com.google.android.gms.internal.measurement.D2 r4 = r2.zzc
            com.google.android.gms.internal.measurement.D2 r0 = com.google.android.gms.internal.measurement.D2.f15200f
            if (r4 != r0) goto L10
            com.google.android.gms.internal.measurement.D2 r4 = com.google.android.gms.internal.measurement.D2.b()
            r2.zzc = r4
        L10:
            long r0 = (long) r5
            int r2 = r3 << 3
            r3 = r4
            com.google.android.gms.internal.measurement.D2 r3 = (com.google.android.gms.internal.measurement.D2) r3
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            r3.c(r2, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2.o(java.lang.Object, int, java.lang.Object, int):java.lang.Object");
    }

    public static void p(Object obj, Object obj2) {
        AbstractC0909b2 abstractC0909b2 = (AbstractC0909b2) obj;
        D2 d22 = abstractC0909b2.zzc;
        D2 d23 = ((AbstractC0909b2) obj2).zzc;
        D2 d24 = D2.f15200f;
        if (!d24.equals(d23)) {
            if (d24.equals(d22)) {
                int i9 = d22.f15201a + d23.f15201a;
                int[] copyOf = Arrays.copyOf(d22.f15202b, i9);
                System.arraycopy(d23.f15202b, 0, copyOf, d22.f15201a, d23.f15201a);
                Object[] copyOf2 = Arrays.copyOf(d22.f15203c, i9);
                System.arraycopy(d23.f15203c, 0, copyOf2, d22.f15201a, d23.f15201a);
                d22 = new D2(i9, copyOf, copyOf2, true);
            } else {
                d22.getClass();
                if (!d23.equals(d24)) {
                    if (d22.f15205e) {
                        int i10 = d22.f15201a + d23.f15201a;
                        d22.e(i10);
                        System.arraycopy(d23.f15202b, 0, d22.f15202b, d22.f15201a, d23.f15201a);
                        System.arraycopy(d23.f15203c, 0, d22.f15203c, d22.f15201a, d23.f15201a);
                        d22.f15201a = i10;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
            }
        }
        abstractC0909b2.zzc = d22;
    }

    public static void q(int i9, List list, C0974o2 c0974o2, boolean z9) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        IndexOutOfBoundsException indexOutOfBoundsException2;
        if (list != null && !list.isEmpty()) {
            U1 u12 = (U1) c0974o2.f15559a;
            int i10 = 0;
            if (z9) {
                u12.M(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Boolean) list.get(i12)).getClass();
                    i11++;
                }
                u12.O(i11);
                while (i10 < list.size()) {
                    byte booleanValue = ((Boolean) list.get(i10)).booleanValue();
                    int i13 = u12.f15315m;
                    try {
                        int i14 = i13 + 1;
                        try {
                            u12.f15313k[i13] = booleanValue;
                            u12.f15315m = i14;
                            i10++;
                        } catch (IndexOutOfBoundsException e8) {
                            indexOutOfBoundsException2 = e8;
                            i13 = i14;
                            throw new N3.M(i13, u12.f15314l, 1, indexOutOfBoundsException2, 8);
                        }
                    } catch (IndexOutOfBoundsException e9) {
                        indexOutOfBoundsException2 = e9;
                    }
                }
                return;
            }
            while (i10 < list.size()) {
                byte booleanValue2 = ((Boolean) list.get(i10)).booleanValue();
                u12.O(i9 << 3);
                int i15 = u12.f15315m;
                try {
                    int i16 = i15 + 1;
                    try {
                        u12.f15313k[i15] = booleanValue2;
                        u12.f15315m = i16;
                        i10++;
                    } catch (IndexOutOfBoundsException e10) {
                        indexOutOfBoundsException = e10;
                        i15 = i16;
                        throw new N3.M(i15, u12.f15314l, 1, indexOutOfBoundsException, 8);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                }
            }
        }
    }

    public static void r(int i9, List list, C0974o2 c0974o2, boolean z9) {
        if (list != null && !list.isEmpty()) {
            U1 u12 = (U1) c0974o2.f15559a;
            int i10 = 0;
            if (z9) {
                u12.M(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Double) list.get(i12)).getClass();
                    i11 += 8;
                }
                u12.O(i11);
                while (i10 < list.size()) {
                    u12.I(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                u12.H(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()), i9);
                i10++;
            }
        }
    }

    public static void s(int i9, List list, C0974o2 c0974o2, boolean z9) {
        if (list != null && !list.isEmpty()) {
            c0974o2.getClass();
            boolean z10 = list instanceof C0914c2;
            U1 u12 = (U1) c0974o2.f15559a;
            int i10 = 0;
            if (z10) {
                C0914c2 c0914c2 = (C0914c2) list;
                if (z9) {
                    u12.M(i9, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < c0914c2.f15453c; i12++) {
                        i11 += U1.C(c0914c2.c(i12));
                    }
                    u12.O(i11);
                    while (i10 < c0914c2.f15453c) {
                        u12.K(c0914c2.c(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < c0914c2.f15453c) {
                    u12.J(i9, c0914c2.c(i10));
                    i10++;
                }
                return;
            }
            if (z9) {
                u12.M(i9, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += U1.C(((Integer) list.get(i14)).intValue());
                }
                u12.O(i13);
                while (i10 < list.size()) {
                    u12.K(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                u12.J(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void t(int i9, List list, C0974o2 c0974o2, boolean z9) {
        if (list != null && !list.isEmpty()) {
            c0974o2.getClass();
            boolean z10 = list instanceof C0914c2;
            U1 u12 = (U1) c0974o2.f15559a;
            int i10 = 0;
            if (z10) {
                C0914c2 c0914c2 = (C0914c2) list;
                if (z9) {
                    u12.M(i9, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < c0914c2.f15453c; i12++) {
                        c0914c2.c(i12);
                        i11 += 4;
                    }
                    u12.O(i11);
                    while (i10 < c0914c2.f15453c) {
                        u12.G(c0914c2.c(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < c0914c2.f15453c) {
                    u12.F(i9, c0914c2.c(i10));
                    i10++;
                }
                return;
            }
            if (z9) {
                u12.M(i9, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Integer) list.get(i14)).getClass();
                    i13 += 4;
                }
                u12.O(i13);
                while (i10 < list.size()) {
                    u12.G(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                u12.F(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void u(int i9, List list, C0974o2 c0974o2, boolean z9) {
        if (list != null && !list.isEmpty()) {
            c0974o2.getClass();
            boolean z10 = list instanceof C0969n2;
            U1 u12 = (U1) c0974o2.f15559a;
            int i10 = 0;
            if (z10) {
                C0969n2 c0969n2 = (C0969n2) list;
                if (z9) {
                    u12.M(i9, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < c0969n2.f15554c; i12++) {
                        c0969n2.c(i12);
                        i11 += 8;
                    }
                    u12.O(i11);
                    while (i10 < c0969n2.f15554c) {
                        u12.I(c0969n2.c(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < c0969n2.f15554c) {
                    u12.H(c0969n2.c(i10), i9);
                    i10++;
                }
                return;
            }
            if (z9) {
                u12.M(i9, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Long) list.get(i14)).getClass();
                    i13 += 8;
                }
                u12.O(i13);
                while (i10 < list.size()) {
                    u12.I(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                u12.H(((Long) list.get(i10)).longValue(), i9);
                i10++;
            }
        }
    }

    public static void v(int i9, List list, C0974o2 c0974o2, boolean z9) {
        if (list != null && !list.isEmpty()) {
            U1 u12 = (U1) c0974o2.f15559a;
            int i10 = 0;
            if (z9) {
                u12.M(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Float) list.get(i12)).getClass();
                    i11 += 4;
                }
                u12.O(i11);
                while (i10 < list.size()) {
                    u12.G(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                u12.F(i9, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
        }
    }

    public static void w(int i9, List list, C0974o2 c0974o2, boolean z9) {
        if (list != null && !list.isEmpty()) {
            c0974o2.getClass();
            boolean z10 = list instanceof C0914c2;
            U1 u12 = (U1) c0974o2.f15559a;
            int i10 = 0;
            if (z10) {
                C0914c2 c0914c2 = (C0914c2) list;
                if (z9) {
                    u12.M(i9, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < c0914c2.f15453c; i12++) {
                        i11 += U1.C(c0914c2.c(i12));
                    }
                    u12.O(i11);
                    while (i10 < c0914c2.f15453c) {
                        u12.K(c0914c2.c(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < c0914c2.f15453c) {
                    u12.J(i9, c0914c2.c(i10));
                    i10++;
                }
                return;
            }
            if (z9) {
                u12.M(i9, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += U1.C(((Integer) list.get(i14)).intValue());
                }
                u12.O(i13);
                while (i10 < list.size()) {
                    u12.K(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                u12.J(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void x(int i9, List list, C0974o2 c0974o2, boolean z9) {
        if (list != null && !list.isEmpty()) {
            c0974o2.getClass();
            boolean z10 = list instanceof C0969n2;
            U1 u12 = (U1) c0974o2.f15559a;
            int i10 = 0;
            if (z10) {
                C0969n2 c0969n2 = (C0969n2) list;
                if (z9) {
                    u12.M(i9, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < c0969n2.f15554c; i12++) {
                        i11 += U1.C(c0969n2.c(i12));
                    }
                    u12.O(i11);
                    while (i10 < c0969n2.f15554c) {
                        u12.Q(c0969n2.c(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < c0969n2.f15554c) {
                    u12.P(c0969n2.c(i10), i9);
                    i10++;
                }
                return;
            }
            if (z9) {
                u12.M(i9, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += U1.C(((Long) list.get(i14)).longValue());
                }
                u12.O(i13);
                while (i10 < list.size()) {
                    u12.Q(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                u12.P(((Long) list.get(i10)).longValue(), i9);
                i10++;
            }
        }
    }

    public static void y(int i9, List list, C0974o2 c0974o2, boolean z9) {
        if (list != null && !list.isEmpty()) {
            c0974o2.getClass();
            boolean z10 = list instanceof C0914c2;
            U1 u12 = (U1) c0974o2.f15559a;
            int i10 = 0;
            if (z10) {
                C0914c2 c0914c2 = (C0914c2) list;
                if (z9) {
                    u12.M(i9, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < c0914c2.f15453c; i12++) {
                        c0914c2.c(i12);
                        i11 += 4;
                    }
                    u12.O(i11);
                    while (i10 < c0914c2.f15453c) {
                        u12.G(c0914c2.c(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < c0914c2.f15453c) {
                    u12.F(i9, c0914c2.c(i10));
                    i10++;
                }
                return;
            }
            if (z9) {
                u12.M(i9, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Integer) list.get(i14)).getClass();
                    i13 += 4;
                }
                u12.O(i13);
                while (i10 < list.size()) {
                    u12.G(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                u12.F(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void z(int i9, List list, C0974o2 c0974o2, boolean z9) {
        if (list != null && !list.isEmpty()) {
            c0974o2.getClass();
            boolean z10 = list instanceof C0969n2;
            U1 u12 = (U1) c0974o2.f15559a;
            int i10 = 0;
            if (z10) {
                C0969n2 c0969n2 = (C0969n2) list;
                if (z9) {
                    u12.M(i9, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < c0969n2.f15554c; i12++) {
                        c0969n2.c(i12);
                        i11 += 8;
                    }
                    u12.O(i11);
                    while (i10 < c0969n2.f15554c) {
                        u12.I(c0969n2.c(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < c0969n2.f15554c) {
                    u12.H(c0969n2.c(i10), i9);
                    i10++;
                }
                return;
            }
            if (z9) {
                u12.M(i9, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Long) list.get(i14)).getClass();
                    i13 += 8;
                }
                u12.O(i13);
                while (i10 < list.size()) {
                    u12.I(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                u12.H(((Long) list.get(i10)).longValue(), i9);
                i10++;
            }
        }
    }
}
