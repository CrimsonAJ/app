package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f16341a;

    /* renamed from: b, reason: collision with root package name */
    public static final f0 f16342b;

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f16343c;

    /* renamed from: d, reason: collision with root package name */
    public static final f0 f16344d;

    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.crypto.tink.shaded.protobuf.f0, java.lang.Object] */
    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f16341a = cls;
        f16342b = w(false);
        f16343c = w(true);
        f16344d = new Object();
    }

    public static void A(int i9, List list, K k5) {
        if (list != null && !list.isEmpty()) {
            k5.getClass();
            for (int i10 = 0; i10 < list.size(); i10++) {
                AbstractC1037h abstractC1037h = (AbstractC1037h) list.get(i10);
                C1040k c1040k = (C1040k) k5.f16302a;
                c1040k.i0(i9, 2);
                c1040k.j0(abstractC1037h.size());
                C1036g c1036g = (C1036g) abstractC1037h;
                c1040k.c0(c1036g.f16354d, c1036g.g(), c1036g.size());
            }
        }
    }

    public static void B(int i9, List list, K k5, boolean z9) {
        if (list != null && !list.isEmpty()) {
            C1040k c1040k = (C1040k) k5.f16302a;
            int i10 = 0;
            if (z9) {
                c1040k.i0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Double) list.get(i12)).getClass();
                    Logger logger = C1040k.f16375k;
                    i11 += 8;
                }
                c1040k.j0(i11);
                while (i10 < list.size()) {
                    c1040k.g0(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                double doubleValue = ((Double) list.get(i10)).doubleValue();
                c1040k.getClass();
                c1040k.f0(Double.doubleToRawLongBits(doubleValue), i9);
                i10++;
            }
        }
    }

    public static void C(int i9, List list, K k5, boolean z9) {
        if (list != null && !list.isEmpty()) {
            C1040k c1040k = (C1040k) k5.f16302a;
            if (z9) {
                c1040k.i0(i9, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    i10 += C1040k.W(((Integer) list.get(i11)).intValue());
                }
                c1040k.j0(i10);
                for (int i12 = 0; i12 < list.size(); i12++) {
                    c1040k.h0(((Integer) list.get(i12)).intValue());
                }
                return;
            }
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue = ((Integer) list.get(i13)).intValue();
                c1040k.i0(i9, 0);
                c1040k.h0(intValue);
            }
        }
    }

    public static void D(int i9, List list, K k5, boolean z9) {
        if (list != null && !list.isEmpty()) {
            C1040k c1040k = (C1040k) k5.f16302a;
            int i10 = 0;
            if (z9) {
                c1040k.i0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Integer) list.get(i12)).getClass();
                    Logger logger = C1040k.f16375k;
                    i11 += 4;
                }
                c1040k.j0(i11);
                while (i10 < list.size()) {
                    c1040k.e0(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                c1040k.d0(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void E(int i9, List list, K k5, boolean z9) {
        if (list != null && !list.isEmpty()) {
            C1040k c1040k = (C1040k) k5.f16302a;
            int i10 = 0;
            if (z9) {
                c1040k.i0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Long) list.get(i12)).getClass();
                    Logger logger = C1040k.f16375k;
                    i11 += 8;
                }
                c1040k.j0(i11);
                while (i10 < list.size()) {
                    c1040k.g0(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                c1040k.f0(((Long) list.get(i10)).longValue(), i9);
                i10++;
            }
        }
    }

    public static void F(int i9, List list, K k5, boolean z9) {
        if (list != null && !list.isEmpty()) {
            C1040k c1040k = (C1040k) k5.f16302a;
            int i10 = 0;
            if (z9) {
                c1040k.i0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Float) list.get(i12)).getClass();
                    Logger logger = C1040k.f16375k;
                    i11 += 4;
                }
                c1040k.j0(i11);
                while (i10 < list.size()) {
                    c1040k.e0(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                float floatValue = ((Float) list.get(i10)).floatValue();
                c1040k.getClass();
                c1040k.d0(i9, Float.floatToRawIntBits(floatValue));
                i10++;
            }
        }
    }

    public static void G(int i9, List list, K k5, b0 b0Var) {
        if (list != null && !list.isEmpty()) {
            k5.getClass();
            for (int i10 = 0; i10 < list.size(); i10++) {
                k5.b(i9, list.get(i10), b0Var);
            }
        }
    }

    public static void H(int i9, List list, K k5, boolean z9) {
        if (list != null && !list.isEmpty()) {
            C1040k c1040k = (C1040k) k5.f16302a;
            if (z9) {
                c1040k.i0(i9, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    i10 += C1040k.W(((Integer) list.get(i11)).intValue());
                }
                c1040k.j0(i10);
                for (int i12 = 0; i12 < list.size(); i12++) {
                    c1040k.h0(((Integer) list.get(i12)).intValue());
                }
                return;
            }
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue = ((Integer) list.get(i13)).intValue();
                c1040k.i0(i9, 0);
                c1040k.h0(intValue);
            }
        }
    }

    public static void I(int i9, List list, K k5, boolean z9) {
        if (list != null && !list.isEmpty()) {
            C1040k c1040k = (C1040k) k5.f16302a;
            int i10 = 0;
            if (z9) {
                c1040k.i0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += C1040k.a0(((Long) list.get(i12)).longValue());
                }
                c1040k.j0(i11);
                while (i10 < list.size()) {
                    c1040k.l0(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                c1040k.k0(((Long) list.get(i10)).longValue(), i9);
                i10++;
            }
        }
    }

    public static void J(int i9, List list, K k5, b0 b0Var) {
        if (list != null && !list.isEmpty()) {
            k5.getClass();
            for (int i10 = 0; i10 < list.size(); i10++) {
                k5.c(i9, list.get(i10), b0Var);
            }
        }
    }

    public static void K(int i9, List list, K k5, boolean z9) {
        if (list != null && !list.isEmpty()) {
            C1040k c1040k = (C1040k) k5.f16302a;
            int i10 = 0;
            if (z9) {
                c1040k.i0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Integer) list.get(i12)).getClass();
                    Logger logger = C1040k.f16375k;
                    i11 += 4;
                }
                c1040k.j0(i11);
                while (i10 < list.size()) {
                    c1040k.e0(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                c1040k.d0(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void L(int i9, List list, K k5, boolean z9) {
        if (list != null && !list.isEmpty()) {
            C1040k c1040k = (C1040k) k5.f16302a;
            int i10 = 0;
            if (z9) {
                c1040k.i0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Long) list.get(i12)).getClass();
                    Logger logger = C1040k.f16375k;
                    i11 += 8;
                }
                c1040k.j0(i11);
                while (i10 < list.size()) {
                    c1040k.g0(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                c1040k.f0(((Long) list.get(i10)).longValue(), i9);
                i10++;
            }
        }
    }

    public static void M(int i9, List list, K k5, boolean z9) {
        if (list != null && !list.isEmpty()) {
            C1040k c1040k = (C1040k) k5.f16302a;
            if (z9) {
                c1040k.i0(i9, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    int intValue = ((Integer) list.get(i11)).intValue();
                    i10 += C1040k.Z((intValue >> 31) ^ (intValue << 1));
                }
                c1040k.j0(i10);
                for (int i12 = 0; i12 < list.size(); i12++) {
                    int intValue2 = ((Integer) list.get(i12)).intValue();
                    c1040k.j0((intValue2 >> 31) ^ (intValue2 << 1));
                }
                return;
            }
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue3 = ((Integer) list.get(i13)).intValue();
                c1040k.i0(i9, 0);
                c1040k.j0((intValue3 >> 31) ^ (intValue3 << 1));
            }
        }
    }

    public static void N(int i9, List list, K k5, boolean z9) {
        if (list != null && !list.isEmpty()) {
            C1040k c1040k = (C1040k) k5.f16302a;
            int i10 = 0;
            if (z9) {
                c1040k.i0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    long longValue = ((Long) list.get(i12)).longValue();
                    i11 += C1040k.a0((longValue >> 63) ^ (longValue << 1));
                }
                c1040k.j0(i11);
                while (i10 < list.size()) {
                    long longValue2 = ((Long) list.get(i10)).longValue();
                    c1040k.l0((longValue2 >> 63) ^ (longValue2 << 1));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                long longValue3 = ((Long) list.get(i10)).longValue();
                c1040k.k0((longValue3 >> 63) ^ (longValue3 << 1), i9);
                i10++;
            }
        }
    }

    public static void O(int i9, List list, K k5) {
        if (list != null && !list.isEmpty()) {
            k5.getClass();
            boolean z9 = list instanceof E;
            C1040k c1040k = (C1040k) k5.f16302a;
            if (z9) {
                E e8 = (E) list;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    Object m9 = e8.m(i10);
                    if (m9 instanceof String) {
                        String str = (String) m9;
                        c1040k.i0(i9, 2);
                        int i11 = c1040k.j;
                        try {
                            int Z6 = C1040k.Z(str.length() * 3);
                            int Z8 = C1040k.Z(str.length());
                            byte[] bArr = c1040k.f16378h;
                            int i12 = c1040k.f16379i;
                            if (Z8 == Z6) {
                                int i13 = i11 + Z8;
                                c1040k.j = i13;
                                int v8 = q0.f16400a.v(i13, i12 - i13, str, bArr);
                                c1040k.j = i11;
                                c1040k.j0((v8 - i11) - Z8);
                                c1040k.j = v8;
                            } else {
                                c1040k.j0(q0.b(str));
                                int i14 = c1040k.j;
                                c1040k.j = q0.f16400a.v(i14, i12 - i14, str, bArr);
                            }
                        } catch (p0 e9) {
                            c1040k.j = i11;
                            C1040k.f16375k.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e9);
                            byte[] bytes = str.getBytes(AbstractC1054z.f16405a);
                            try {
                                c1040k.j0(bytes.length);
                                c1040k.c0(bytes, 0, bytes.length);
                            } catch (IndexOutOfBoundsException e10) {
                                throw new N3.M(e10);
                            }
                        } catch (IndexOutOfBoundsException e11) {
                            throw new N3.M(e11);
                        }
                    } else {
                        AbstractC1037h abstractC1037h = (AbstractC1037h) m9;
                        c1040k.i0(i9, 2);
                        c1040k.j0(abstractC1037h.size());
                        C1036g c1036g = (C1036g) abstractC1037h;
                        c1040k.c0(c1036g.f16354d, c1036g.g(), c1036g.size());
                    }
                }
                return;
            }
            for (int i15 = 0; i15 < list.size(); i15++) {
                String str2 = (String) list.get(i15);
                c1040k.i0(i9, 2);
                int i16 = c1040k.j;
                try {
                    int Z9 = C1040k.Z(str2.length() * 3);
                    int Z10 = C1040k.Z(str2.length());
                    byte[] bArr2 = c1040k.f16378h;
                    int i17 = c1040k.f16379i;
                    if (Z10 == Z9) {
                        int i18 = i16 + Z10;
                        c1040k.j = i18;
                        int v9 = q0.f16400a.v(i18, i17 - i18, str2, bArr2);
                        c1040k.j = i16;
                        c1040k.j0((v9 - i16) - Z10);
                        c1040k.j = v9;
                    } else {
                        c1040k.j0(q0.b(str2));
                        int i19 = c1040k.j;
                        c1040k.j = q0.f16400a.v(i19, i17 - i19, str2, bArr2);
                    }
                } catch (p0 e12) {
                    c1040k.j = i16;
                    C1040k.f16375k.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e12);
                    byte[] bytes2 = str2.getBytes(AbstractC1054z.f16405a);
                    try {
                        c1040k.j0(bytes2.length);
                        c1040k.c0(bytes2, 0, bytes2.length);
                    } catch (IndexOutOfBoundsException e13) {
                        throw new N3.M(e13);
                    }
                } catch (IndexOutOfBoundsException e14) {
                    throw new N3.M(e14);
                }
            }
        }
    }

    public static void P(int i9, List list, K k5, boolean z9) {
        if (list != null && !list.isEmpty()) {
            C1040k c1040k = (C1040k) k5.f16302a;
            if (z9) {
                c1040k.i0(i9, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    i10 += C1040k.Z(((Integer) list.get(i11)).intValue());
                }
                c1040k.j0(i10);
                for (int i12 = 0; i12 < list.size(); i12++) {
                    c1040k.j0(((Integer) list.get(i12)).intValue());
                }
                return;
            }
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue = ((Integer) list.get(i13)).intValue();
                c1040k.i0(i9, 0);
                c1040k.j0(intValue);
            }
        }
    }

    public static void Q(int i9, List list, K k5, boolean z9) {
        if (list != null && !list.isEmpty()) {
            C1040k c1040k = (C1040k) k5.f16302a;
            int i10 = 0;
            if (z9) {
                c1040k.i0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += C1040k.a0(((Long) list.get(i12)).longValue());
                }
                c1040k.j0(i11);
                while (i10 < list.size()) {
                    c1040k.l0(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                c1040k.k0(((Long) list.get(i10)).longValue(), i9);
                i10++;
            }
        }
    }

    public static int a(List list, int i9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int Y = C1040k.Y(i9) * size;
        for (int i10 = 0; i10 < list.size(); i10++) {
            Y += C1040k.S((AbstractC1037h) list.get(i10));
        }
        return Y;
    }

    public static int b(List list, int i9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1040k.Y(i9) * size) + c(list);
    }

    public static int c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1051w) {
            AbstractC1051w abstractC1051w = (AbstractC1051w) list;
            if (size <= 0) {
                return 0;
            }
            abstractC1051w.d(0);
            throw null;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += C1040k.W(((Integer) list.get(i10)).intValue());
        }
        return i9;
    }

    public static int d(List list, int i9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C1040k.T(i9) * size;
    }

    public static int e(List list) {
        return list.size() * 4;
    }

    public static int f(List list, int i9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C1040k.U(i9) * size;
    }

    public static int g(List list) {
        return list.size() * 8;
    }

    public static int h(List list, int i9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1040k.Y(i9) * size) + i(list);
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1051w) {
            AbstractC1051w abstractC1051w = (AbstractC1051w) list;
            if (size <= 0) {
                return 0;
            }
            abstractC1051w.d(0);
            throw null;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += C1040k.W(((Integer) list.get(i10)).intValue());
        }
        return i9;
    }

    public static int j(List list, int i9) {
        if (list.size() == 0) {
            return 0;
        }
        return (C1040k.Y(i9) * list.size()) + k(list);
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof I) {
            I i9 = (I) list;
            if (size <= 0) {
                return 0;
            }
            i9.d(0);
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += C1040k.a0(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    public static int l(int i9, List list, b0 b0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int Y = C1040k.Y(i9) * size;
        for (int i10 = 0; i10 < size; i10++) {
            int a5 = ((AbstractC1030a) list.get(i10)).a(b0Var);
            Y += C1040k.Z(a5) + a5;
        }
        return Y;
    }

    public static int m(List list, int i9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1040k.Y(i9) * size) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1051w) {
            AbstractC1051w abstractC1051w = (AbstractC1051w) list;
            if (size <= 0) {
                return 0;
            }
            abstractC1051w.d(0);
            throw null;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            int intValue = ((Integer) list.get(i10)).intValue();
            i9 += C1040k.Z((intValue >> 31) ^ (intValue << 1));
        }
        return i9;
    }

    public static int o(List list, int i9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1040k.Y(i9) * size) + p(list);
    }

    public static int p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof I) {
            I i9 = (I) list;
            if (size <= 0) {
                return 0;
            }
            i9.d(0);
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            long longValue = ((Long) list.get(i11)).longValue();
            i10 += C1040k.a0((longValue >> 63) ^ (longValue << 1));
        }
        return i10;
    }

    public static int q(List list, int i9) {
        int X8;
        int X9;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int Y = C1040k.Y(i9) * size;
        if (list instanceof E) {
            E e8 = (E) list;
            while (i10 < size) {
                Object m9 = e8.m(i10);
                if (m9 instanceof AbstractC1037h) {
                    X9 = C1040k.S((AbstractC1037h) m9);
                } else {
                    X9 = C1040k.X((String) m9);
                }
                Y = X9 + Y;
                i10++;
            }
            return Y;
        }
        while (i10 < size) {
            Object obj = list.get(i10);
            if (obj instanceof AbstractC1037h) {
                X8 = C1040k.S((AbstractC1037h) obj);
            } else {
                X8 = C1040k.X((String) obj);
            }
            Y = X8 + Y;
            i10++;
        }
        return Y;
    }

    public static int r(List list, int i9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1040k.Y(i9) * size) + s(list);
    }

    public static int s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1051w) {
            AbstractC1051w abstractC1051w = (AbstractC1051w) list;
            if (size <= 0) {
                return 0;
            }
            abstractC1051w.d(0);
            throw null;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += C1040k.Z(((Integer) list.get(i10)).intValue());
        }
        return i9;
    }

    public static int t(List list, int i9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1040k.Y(i9) * size) + u(list);
    }

    public static int u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof I) {
            I i9 = (I) list;
            if (size <= 0) {
                return 0;
            }
            i9.d(0);
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += C1040k.a0(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    public static f0 w(boolean z9) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (f0) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z9));
            } catch (Throwable unused2) {
                return null;
            }
        }
        return null;
    }

    public static void x(f0 f0Var, Object obj, Object obj2) {
        f0Var.getClass();
        AbstractC1050v abstractC1050v = (AbstractC1050v) obj;
        e0 e0Var = abstractC1050v.unknownFields;
        e0 e0Var2 = ((AbstractC1050v) obj2).unknownFields;
        e0 e0Var3 = e0.f16346f;
        if (!e0Var3.equals(e0Var2)) {
            if (e0Var3.equals(e0Var)) {
                int i9 = e0Var.f16347a + e0Var2.f16347a;
                int[] copyOf = Arrays.copyOf(e0Var.f16348b, i9);
                System.arraycopy(e0Var2.f16348b, 0, copyOf, e0Var.f16347a, e0Var2.f16347a);
                Object[] copyOf2 = Arrays.copyOf(e0Var.f16349c, i9);
                System.arraycopy(e0Var2.f16349c, 0, copyOf2, e0Var.f16347a, e0Var2.f16347a);
                e0Var = new e0(i9, copyOf, copyOf2, true);
            } else {
                e0Var.getClass();
                if (!e0Var2.equals(e0Var3)) {
                    if (e0Var.f16351e) {
                        int i10 = e0Var.f16347a + e0Var2.f16347a;
                        e0Var.a(i10);
                        System.arraycopy(e0Var2.f16348b, 0, e0Var.f16348b, e0Var.f16347a, e0Var2.f16347a);
                        System.arraycopy(e0Var2.f16349c, 0, e0Var.f16349c, e0Var.f16347a, e0Var2.f16347a);
                        e0Var.f16347a = i10;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
            }
        }
        abstractC1050v.unknownFields = e0Var;
    }

    public static boolean y(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void z(int i9, List list, K k5, boolean z9) {
        if (list != null && !list.isEmpty()) {
            C1040k c1040k = (C1040k) k5.f16302a;
            if (z9) {
                c1040k.i0(i9, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Boolean) list.get(i11)).getClass();
                    Logger logger = C1040k.f16375k;
                    i10++;
                }
                c1040k.j0(i10);
                for (int i12 = 0; i12 < list.size(); i12++) {
                    c1040k.b0(((Boolean) list.get(i12)).booleanValue() ? (byte) 1 : (byte) 0);
                }
                return;
            }
            for (int i13 = 0; i13 < list.size(); i13++) {
                boolean booleanValue = ((Boolean) list.get(i13)).booleanValue();
                c1040k.i0(i9, 0);
                c1040k.b0(booleanValue ? (byte) 1 : (byte) 0);
            }
        }
    }

    public static Object v(Object obj, int i9, List list, Object obj2, f0 f0Var) {
        return obj2;
    }
}
