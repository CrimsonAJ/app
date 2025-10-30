package com.google.android.gms.internal.cast;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h3 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0886w0 f14855a;

    static {
        d3 d3Var = d3.f14823c;
        f14855a = new C0886w0(26);
    }

    public static void a(int i9, List list, W2 w22, boolean z9) {
        if (list != null && !list.isEmpty()) {
            w22.getClass();
            boolean z10 = list instanceof V2;
            J2 j22 = (J2) w22.f14788b;
            int i10 = 0;
            if (z10) {
                V2 v22 = (V2) list;
                if (z9) {
                    j22.D(i9, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < v22.f14780c; i12++) {
                        long c3 = v22.c(i12);
                        i11 += J2.t((c3 >> 63) ^ (c3 + c3));
                    }
                    j22.F(i11);
                    while (i10 < v22.f14780c) {
                        long c9 = v22.c(i10);
                        j22.H((c9 >> 63) ^ (c9 + c9));
                        i10++;
                    }
                    return;
                }
                while (i10 < v22.f14780c) {
                    long c10 = v22.c(i10);
                    j22.G((c10 >> 63) ^ (c10 + c10), i9);
                    i10++;
                }
                return;
            }
            if (z9) {
                j22.D(i9, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    long longValue = ((Long) list.get(i14)).longValue();
                    i13 += J2.t((longValue >> 63) ^ (longValue + longValue));
                }
                j22.F(i13);
                while (i10 < list.size()) {
                    long longValue2 = ((Long) list.get(i10)).longValue();
                    j22.H((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                long longValue3 = ((Long) list.get(i10)).longValue();
                j22.G((longValue3 >> 63) ^ (longValue3 + longValue3), i9);
                i10++;
            }
        }
    }

    public static void b(int i9, List list, W2 w22, boolean z9) {
        if (list != null && !list.isEmpty()) {
            w22.getClass();
            boolean z10 = list instanceof O2;
            J2 j22 = (J2) w22.f14788b;
            int i10 = 0;
            if (z10) {
                O2 o22 = (O2) list;
                if (z9) {
                    j22.D(i9, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < o22.f14755c; i12++) {
                        i11 += J2.J(o22.c(i12));
                    }
                    j22.F(i11);
                    while (i10 < o22.f14755c) {
                        j22.F(o22.c(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < o22.f14755c) {
                    j22.E(i9, o22.c(i10));
                    i10++;
                }
                return;
            }
            if (z9) {
                j22.D(i9, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += J2.J(((Integer) list.get(i14)).intValue());
                }
                j22.F(i13);
                while (i10 < list.size()) {
                    j22.F(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                j22.E(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void c(int i9, List list, W2 w22, boolean z9) {
        if (list != null && !list.isEmpty()) {
            w22.getClass();
            boolean z10 = list instanceof V2;
            J2 j22 = (J2) w22.f14788b;
            int i10 = 0;
            if (z10) {
                V2 v22 = (V2) list;
                if (z9) {
                    j22.D(i9, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < v22.f14780c; i12++) {
                        i11 += J2.t(v22.c(i12));
                    }
                    j22.F(i11);
                    while (i10 < v22.f14780c) {
                        j22.H(v22.c(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < v22.f14780c) {
                    j22.G(v22.c(i10), i9);
                    i10++;
                }
                return;
            }
            if (z9) {
                j22.D(i9, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += J2.t(((Long) list.get(i14)).longValue());
                }
                j22.F(i13);
                while (i10 < list.size()) {
                    j22.H(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                j22.G(((Long) list.get(i10)).longValue(), i9);
                i10++;
            }
        }
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static int e(List list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof O2) {
            O2 o22 = (O2) list;
            int i10 = 0;
            while (i9 < size) {
                i10 += J2.t(o22.c(i9));
                i9++;
            }
            return i10;
        }
        int i11 = 0;
        while (i9 < size) {
            i11 += J2.t(((Integer) list.get(i9)).intValue());
            i9++;
        }
        return i11;
    }

    public static int f(List list, int i9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (J2.J(i9 << 3) + 4) * size;
    }

    public static int g(List list, int i9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (J2.J(i9 << 3) + 8) * size;
    }

    public static int h(List list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof O2) {
            O2 o22 = (O2) list;
            int i10 = 0;
            while (i9 < size) {
                i10 += J2.t(o22.c(i9));
                i9++;
            }
            return i10;
        }
        int i11 = 0;
        while (i9 < size) {
            i11 += J2.t(((Integer) list.get(i9)).intValue());
            i9++;
        }
        return i11;
    }

    public static int i(List list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof V2) {
            V2 v22 = (V2) list;
            int i10 = 0;
            while (i9 < size) {
                i10 += J2.t(v22.c(i9));
                i9++;
            }
            return i10;
        }
        int i11 = 0;
        while (i9 < size) {
            i11 += J2.t(((Long) list.get(i9)).longValue());
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
        if (list instanceof O2) {
            O2 o22 = (O2) list;
            int i10 = 0;
            while (i9 < size) {
                int c3 = o22.c(i9);
                i10 += J2.J((c3 >> 31) ^ (c3 + c3));
                i9++;
            }
            return i10;
        }
        int i11 = 0;
        while (i9 < size) {
            int intValue = ((Integer) list.get(i9)).intValue();
            i11 += J2.J((intValue >> 31) ^ (intValue + intValue));
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
        if (list instanceof V2) {
            V2 v22 = (V2) list;
            int i10 = 0;
            while (i9 < size) {
                long c3 = v22.c(i9);
                i10 += J2.t((c3 >> 63) ^ (c3 + c3));
                i9++;
            }
            return i10;
        }
        int i11 = 0;
        while (i9 < size) {
            long longValue = ((Long) list.get(i9)).longValue();
            i11 += J2.t((longValue >> 63) ^ (longValue + longValue));
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
        if (list instanceof O2) {
            O2 o22 = (O2) list;
            int i10 = 0;
            while (i9 < size) {
                i10 += J2.J(o22.c(i9));
                i9++;
            }
            return i10;
        }
        int i11 = 0;
        while (i9 < size) {
            i11 += J2.J(((Integer) list.get(i9)).intValue());
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
        if (list instanceof V2) {
            V2 v22 = (V2) list;
            int i10 = 0;
            while (i9 < size) {
                i10 += J2.t(v22.c(i9));
                i9++;
            }
            return i10;
        }
        int i11 = 0;
        while (i9 < size) {
            i11 += J2.t(((Long) list.get(i9)).longValue());
            i9++;
        }
        return i11;
    }

    public static void n(Object obj, Object obj2) {
        N2 n22 = (N2) obj;
        j3 j3Var = n22.zzc;
        j3 j3Var2 = ((N2) obj2).zzc;
        j3 j3Var3 = j3.f14893e;
        if (!j3Var3.equals(j3Var2)) {
            if (j3Var3.equals(j3Var)) {
                j3Var.getClass();
                j3Var2.getClass();
                int[] copyOf = Arrays.copyOf(j3Var.f14894a, 0);
                System.arraycopy(j3Var2.f14894a, 0, copyOf, 0, 0);
                Object[] copyOf2 = Arrays.copyOf(j3Var.f14895b, 0);
                System.arraycopy(j3Var2.f14895b, 0, copyOf2, 0, 0);
                j3Var = new j3(copyOf, copyOf2, true);
            } else {
                j3Var.getClass();
                if (!j3Var2.equals(j3Var3)) {
                    if (j3Var.f14897d) {
                        int[] iArr = j3Var.f14894a;
                        int length = iArr.length;
                        System.arraycopy(j3Var2.f14894a, 0, iArr, 0, 0);
                        System.arraycopy(j3Var2.f14895b, 0, j3Var.f14895b, 0, 0);
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
            }
        }
        n22.zzc = j3Var;
    }

    public static void o(int i9, List list, W2 w22, boolean z9) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        IndexOutOfBoundsException indexOutOfBoundsException2;
        if (list != null && !list.isEmpty()) {
            J2 j22 = (J2) w22.f14788b;
            int i10 = 0;
            if (z9) {
                j22.D(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Boolean) list.get(i12)).getClass();
                    i11++;
                }
                j22.F(i11);
                while (i10 < list.size()) {
                    byte booleanValue = ((Boolean) list.get(i10)).booleanValue();
                    int i13 = j22.f14737g;
                    try {
                        int i14 = i13 + 1;
                        try {
                            j22.f14735e[i13] = booleanValue;
                            j22.f14737g = i14;
                            i10++;
                        } catch (IndexOutOfBoundsException e8) {
                            indexOutOfBoundsException2 = e8;
                            i13 = i14;
                            throw new N3.M(i13, j22.f14736f, 1, indexOutOfBoundsException2, 7);
                        }
                    } catch (IndexOutOfBoundsException e9) {
                        indexOutOfBoundsException2 = e9;
                    }
                }
                return;
            }
            while (i10 < list.size()) {
                byte booleanValue2 = ((Boolean) list.get(i10)).booleanValue();
                j22.F(i9 << 3);
                int i15 = j22.f14737g;
                try {
                    int i16 = i15 + 1;
                    try {
                        j22.f14735e[i15] = booleanValue2;
                        j22.f14737g = i16;
                        i10++;
                    } catch (IndexOutOfBoundsException e10) {
                        indexOutOfBoundsException = e10;
                        i15 = i16;
                        throw new N3.M(i15, j22.f14736f, 1, indexOutOfBoundsException, 7);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                }
            }
        }
    }

    public static void p(int i9, List list, W2 w22, boolean z9) {
        if (list != null && !list.isEmpty()) {
            J2 j22 = (J2) w22.f14788b;
            int i10 = 0;
            if (z9) {
                j22.D(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Double) list.get(i12)).getClass();
                    i11 += 8;
                }
                j22.F(i11);
                while (i10 < list.size()) {
                    j22.z(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                j22.y(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()), i9);
                i10++;
            }
        }
    }

    public static void q(int i9, List list, W2 w22, boolean z9) {
        if (list != null && !list.isEmpty()) {
            w22.getClass();
            boolean z10 = list instanceof O2;
            J2 j22 = (J2) w22.f14788b;
            int i10 = 0;
            if (z10) {
                O2 o22 = (O2) list;
                if (z9) {
                    j22.D(i9, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < o22.f14755c; i12++) {
                        i11 += J2.t(o22.c(i12));
                    }
                    j22.F(i11);
                    while (i10 < o22.f14755c) {
                        j22.B(o22.c(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < o22.f14755c) {
                    j22.A(i9, o22.c(i10));
                    i10++;
                }
                return;
            }
            if (z9) {
                j22.D(i9, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += J2.t(((Integer) list.get(i14)).intValue());
                }
                j22.F(i13);
                while (i10 < list.size()) {
                    j22.B(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                j22.A(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void r(int i9, List list, W2 w22, boolean z9) {
        if (list != null && !list.isEmpty()) {
            w22.getClass();
            boolean z10 = list instanceof O2;
            J2 j22 = (J2) w22.f14788b;
            int i10 = 0;
            if (z10) {
                O2 o22 = (O2) list;
                if (z9) {
                    j22.D(i9, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < o22.f14755c; i12++) {
                        o22.c(i12);
                        i11 += 4;
                    }
                    j22.F(i11);
                    while (i10 < o22.f14755c) {
                        j22.x(o22.c(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < o22.f14755c) {
                    j22.w(i9, o22.c(i10));
                    i10++;
                }
                return;
            }
            if (z9) {
                j22.D(i9, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Integer) list.get(i14)).getClass();
                    i13 += 4;
                }
                j22.F(i13);
                while (i10 < list.size()) {
                    j22.x(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                j22.w(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void s(int i9, List list, W2 w22, boolean z9) {
        if (list != null && !list.isEmpty()) {
            w22.getClass();
            boolean z10 = list instanceof V2;
            J2 j22 = (J2) w22.f14788b;
            int i10 = 0;
            if (z10) {
                V2 v22 = (V2) list;
                if (z9) {
                    j22.D(i9, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < v22.f14780c; i12++) {
                        v22.c(i12);
                        i11 += 8;
                    }
                    j22.F(i11);
                    while (i10 < v22.f14780c) {
                        j22.z(v22.c(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < v22.f14780c) {
                    j22.y(v22.c(i10), i9);
                    i10++;
                }
                return;
            }
            if (z9) {
                j22.D(i9, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Long) list.get(i14)).getClass();
                    i13 += 8;
                }
                j22.F(i13);
                while (i10 < list.size()) {
                    j22.z(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                j22.y(((Long) list.get(i10)).longValue(), i9);
                i10++;
            }
        }
    }

    public static void t(int i9, List list, W2 w22, boolean z9) {
        if (list != null && !list.isEmpty()) {
            J2 j22 = (J2) w22.f14788b;
            int i10 = 0;
            if (z9) {
                j22.D(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Float) list.get(i12)).getClass();
                    i11 += 4;
                }
                j22.F(i11);
                while (i10 < list.size()) {
                    j22.x(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                j22.w(i9, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
        }
    }

    public static void u(int i9, List list, W2 w22, boolean z9) {
        if (list != null && !list.isEmpty()) {
            w22.getClass();
            boolean z10 = list instanceof O2;
            J2 j22 = (J2) w22.f14788b;
            int i10 = 0;
            if (z10) {
                O2 o22 = (O2) list;
                if (z9) {
                    j22.D(i9, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < o22.f14755c; i12++) {
                        i11 += J2.t(o22.c(i12));
                    }
                    j22.F(i11);
                    while (i10 < o22.f14755c) {
                        j22.B(o22.c(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < o22.f14755c) {
                    j22.A(i9, o22.c(i10));
                    i10++;
                }
                return;
            }
            if (z9) {
                j22.D(i9, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += J2.t(((Integer) list.get(i14)).intValue());
                }
                j22.F(i13);
                while (i10 < list.size()) {
                    j22.B(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                j22.A(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void v(int i9, List list, W2 w22, boolean z9) {
        if (list != null && !list.isEmpty()) {
            w22.getClass();
            boolean z10 = list instanceof V2;
            J2 j22 = (J2) w22.f14788b;
            int i10 = 0;
            if (z10) {
                V2 v22 = (V2) list;
                if (z9) {
                    j22.D(i9, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < v22.f14780c; i12++) {
                        i11 += J2.t(v22.c(i12));
                    }
                    j22.F(i11);
                    while (i10 < v22.f14780c) {
                        j22.H(v22.c(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < v22.f14780c) {
                    j22.G(v22.c(i10), i9);
                    i10++;
                }
                return;
            }
            if (z9) {
                j22.D(i9, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += J2.t(((Long) list.get(i14)).longValue());
                }
                j22.F(i13);
                while (i10 < list.size()) {
                    j22.H(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                j22.G(((Long) list.get(i10)).longValue(), i9);
                i10++;
            }
        }
    }

    public static void w(int i9, List list, W2 w22, boolean z9) {
        if (list != null && !list.isEmpty()) {
            w22.getClass();
            boolean z10 = list instanceof O2;
            J2 j22 = (J2) w22.f14788b;
            int i10 = 0;
            if (z10) {
                O2 o22 = (O2) list;
                if (z9) {
                    j22.D(i9, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < o22.f14755c; i12++) {
                        o22.c(i12);
                        i11 += 4;
                    }
                    j22.F(i11);
                    while (i10 < o22.f14755c) {
                        j22.x(o22.c(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < o22.f14755c) {
                    j22.w(i9, o22.c(i10));
                    i10++;
                }
                return;
            }
            if (z9) {
                j22.D(i9, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Integer) list.get(i14)).getClass();
                    i13 += 4;
                }
                j22.F(i13);
                while (i10 < list.size()) {
                    j22.x(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                j22.w(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void x(int i9, List list, W2 w22, boolean z9) {
        if (list != null && !list.isEmpty()) {
            w22.getClass();
            boolean z10 = list instanceof V2;
            J2 j22 = (J2) w22.f14788b;
            int i10 = 0;
            if (z10) {
                V2 v22 = (V2) list;
                if (z9) {
                    j22.D(i9, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < v22.f14780c; i12++) {
                        v22.c(i12);
                        i11 += 8;
                    }
                    j22.F(i11);
                    while (i10 < v22.f14780c) {
                        j22.z(v22.c(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < v22.f14780c) {
                    j22.y(v22.c(i10), i9);
                    i10++;
                }
                return;
            }
            if (z9) {
                j22.D(i9, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Long) list.get(i14)).getClass();
                    i13 += 8;
                }
                j22.F(i13);
                while (i10 < list.size()) {
                    j22.z(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                j22.y(((Long) list.get(i10)).longValue(), i9);
                i10++;
            }
        }
    }

    public static void y(int i9, List list, W2 w22, boolean z9) {
        if (list != null && !list.isEmpty()) {
            w22.getClass();
            boolean z10 = list instanceof O2;
            J2 j22 = (J2) w22.f14788b;
            int i10 = 0;
            if (z10) {
                O2 o22 = (O2) list;
                if (z9) {
                    j22.D(i9, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < o22.f14755c; i12++) {
                        int c3 = o22.c(i12);
                        i11 += J2.J((c3 >> 31) ^ (c3 + c3));
                    }
                    j22.F(i11);
                    while (i10 < o22.f14755c) {
                        int c9 = o22.c(i10);
                        j22.F((c9 >> 31) ^ (c9 + c9));
                        i10++;
                    }
                    return;
                }
                while (i10 < o22.f14755c) {
                    int c10 = o22.c(i10);
                    j22.E(i9, (c10 >> 31) ^ (c10 + c10));
                    i10++;
                }
                return;
            }
            if (z9) {
                j22.D(i9, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    int intValue = ((Integer) list.get(i14)).intValue();
                    i13 += J2.J((intValue >> 31) ^ (intValue + intValue));
                }
                j22.F(i13);
                while (i10 < list.size()) {
                    int intValue2 = ((Integer) list.get(i10)).intValue();
                    j22.F((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                int intValue3 = ((Integer) list.get(i10)).intValue();
                j22.E(i9, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i10++;
            }
        }
    }
}
