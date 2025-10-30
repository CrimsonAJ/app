package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class U {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f9664a;

    /* renamed from: b, reason: collision with root package name */
    public static final b0 f9665b;

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f9666c;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, androidx.datastore.preferences.protobuf.b0] */
    static {
        Class<?> cls;
        Class<?> cls2;
        P p9 = P.f9654c;
        b0 b0Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f9664a = cls;
        try {
            P p10 = P.f9654c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                b0Var = (b0) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f9665b = b0Var;
        f9666c = new Object();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += C0524j.N(((Integer) list.get(i10)).intValue());
        }
        return i9;
    }

    public static int b(List list, int i9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0524j.L(i9) + 4) * size;
    }

    public static int c(List list, int i9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0524j.L(i9) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += C0524j.N(((Integer) list.get(i10)).intValue());
        }
        return i9;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += C0524j.N(((Long) list.get(i10)).longValue());
        }
        return i9;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            int intValue = ((Integer) list.get(i10)).intValue();
            i9 += C0524j.M((intValue >> 31) ^ (intValue << 1));
        }
        return i9;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long longValue = ((Long) list.get(i10)).longValue();
            i9 += C0524j.N((longValue >> 63) ^ (longValue << 1));
        }
        return i9;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += C0524j.M(((Integer) list.get(i10)).intValue());
        }
        return i9;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += C0524j.N(((Long) list.get(i10)).longValue());
        }
        return i9;
    }

    public static void k(b0 b0Var, Object obj, Object obj2) {
        b0Var.getClass();
        AbstractC0533t abstractC0533t = (AbstractC0533t) obj;
        a0 a0Var = abstractC0533t.unknownFields;
        a0 a0Var2 = ((AbstractC0533t) obj2).unknownFields;
        a0 a0Var3 = a0.f9682f;
        if (!a0Var3.equals(a0Var2)) {
            if (a0Var3.equals(a0Var)) {
                int i9 = a0Var.f9683a + a0Var2.f9683a;
                int[] copyOf = Arrays.copyOf(a0Var.f9684b, i9);
                System.arraycopy(a0Var2.f9684b, 0, copyOf, a0Var.f9683a, a0Var2.f9683a);
                Object[] copyOf2 = Arrays.copyOf(a0Var.f9685c, i9);
                System.arraycopy(a0Var2.f9685c, 0, copyOf2, a0Var.f9683a, a0Var2.f9683a);
                a0Var = new a0(i9, copyOf, copyOf2, true);
            } else {
                a0Var.getClass();
                if (!a0Var2.equals(a0Var3)) {
                    if (a0Var.f9687e) {
                        int i10 = a0Var.f9683a + a0Var2.f9683a;
                        a0Var.a(i10);
                        System.arraycopy(a0Var2.f9684b, 0, a0Var.f9684b, a0Var.f9683a, a0Var2.f9683a);
                        System.arraycopy(a0Var2.f9685c, 0, a0Var.f9685c, a0Var.f9683a, a0Var2.f9683a);
                        a0Var.f9683a = i10;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
            }
        }
        abstractC0533t.unknownFields = a0Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void m(int i9, List list, C c3, boolean z9) {
        if (list != null && !list.isEmpty()) {
            C0524j c0524j = (C0524j) c3.f9625a;
            int i10 = 0;
            if (z9) {
                c0524j.e0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Boolean) list.get(i12)).getClass();
                    Logger logger = C0524j.f9726n;
                    i11++;
                }
                c0524j.g0(i11);
                while (i10 < list.size()) {
                    c0524j.Q(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                c0524j.S(i9, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
        }
    }

    public static void n(int i9, List list, C c3, boolean z9) {
        if (list != null && !list.isEmpty()) {
            C0524j c0524j = (C0524j) c3.f9625a;
            int i10 = 0;
            if (z9) {
                c0524j.e0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Double) list.get(i12)).getClass();
                    Logger logger = C0524j.f9726n;
                    i11 += 8;
                }
                c0524j.g0(i11);
                while (i10 < list.size()) {
                    c0524j.Y(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                double doubleValue = ((Double) list.get(i10)).doubleValue();
                c0524j.getClass();
                c0524j.X(Double.doubleToRawLongBits(doubleValue), i9);
                i10++;
            }
        }
    }

    public static void o(int i9, List list, C c3, boolean z9) {
        if (list != null && !list.isEmpty()) {
            C0524j c0524j = (C0524j) c3.f9625a;
            int i10 = 0;
            if (z9) {
                c0524j.e0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += C0524j.N(((Integer) list.get(i12)).intValue());
                }
                c0524j.g0(i11);
                while (i10 < list.size()) {
                    c0524j.a0(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                c0524j.Z(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void p(int i9, List list, C c3, boolean z9) {
        if (list != null && !list.isEmpty()) {
            C0524j c0524j = (C0524j) c3.f9625a;
            int i10 = 0;
            if (z9) {
                c0524j.e0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Integer) list.get(i12)).getClass();
                    Logger logger = C0524j.f9726n;
                    i11 += 4;
                }
                c0524j.g0(i11);
                while (i10 < list.size()) {
                    c0524j.W(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                c0524j.V(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void q(int i9, List list, C c3, boolean z9) {
        if (list != null && !list.isEmpty()) {
            C0524j c0524j = (C0524j) c3.f9625a;
            int i10 = 0;
            if (z9) {
                c0524j.e0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Long) list.get(i12)).getClass();
                    Logger logger = C0524j.f9726n;
                    i11 += 8;
                }
                c0524j.g0(i11);
                while (i10 < list.size()) {
                    c0524j.Y(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                c0524j.X(((Long) list.get(i10)).longValue(), i9);
                i10++;
            }
        }
    }

    public static void r(int i9, List list, C c3, boolean z9) {
        if (list != null && !list.isEmpty()) {
            C0524j c0524j = (C0524j) c3.f9625a;
            int i10 = 0;
            if (z9) {
                c0524j.e0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Float) list.get(i12)).getClass();
                    Logger logger = C0524j.f9726n;
                    i11 += 4;
                }
                c0524j.g0(i11);
                while (i10 < list.size()) {
                    c0524j.W(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                float floatValue = ((Float) list.get(i10)).floatValue();
                c0524j.getClass();
                c0524j.V(i9, Float.floatToRawIntBits(floatValue));
                i10++;
            }
        }
    }

    public static void s(int i9, List list, C c3, boolean z9) {
        if (list != null && !list.isEmpty()) {
            C0524j c0524j = (C0524j) c3.f9625a;
            int i10 = 0;
            if (z9) {
                c0524j.e0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += C0524j.N(((Integer) list.get(i12)).intValue());
                }
                c0524j.g0(i11);
                while (i10 < list.size()) {
                    c0524j.a0(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                c0524j.Z(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void t(int i9, List list, C c3, boolean z9) {
        if (list != null && !list.isEmpty()) {
            C0524j c0524j = (C0524j) c3.f9625a;
            int i10 = 0;
            if (z9) {
                c0524j.e0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += C0524j.N(((Long) list.get(i12)).longValue());
                }
                c0524j.g0(i11);
                while (i10 < list.size()) {
                    c0524j.i0(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                c0524j.h0(((Long) list.get(i10)).longValue(), i9);
                i10++;
            }
        }
    }

    public static void u(int i9, List list, C c3, boolean z9) {
        if (list != null && !list.isEmpty()) {
            C0524j c0524j = (C0524j) c3.f9625a;
            int i10 = 0;
            if (z9) {
                c0524j.e0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Integer) list.get(i12)).getClass();
                    Logger logger = C0524j.f9726n;
                    i11 += 4;
                }
                c0524j.g0(i11);
                while (i10 < list.size()) {
                    c0524j.W(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                c0524j.V(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void v(int i9, List list, C c3, boolean z9) {
        if (list != null && !list.isEmpty()) {
            C0524j c0524j = (C0524j) c3.f9625a;
            int i10 = 0;
            if (z9) {
                c0524j.e0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Long) list.get(i12)).getClass();
                    Logger logger = C0524j.f9726n;
                    i11 += 8;
                }
                c0524j.g0(i11);
                while (i10 < list.size()) {
                    c0524j.Y(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                c0524j.X(((Long) list.get(i10)).longValue(), i9);
                i10++;
            }
        }
    }

    public static void w(int i9, List list, C c3, boolean z9) {
        if (list != null && !list.isEmpty()) {
            C0524j c0524j = (C0524j) c3.f9625a;
            int i10 = 0;
            if (z9) {
                c0524j.e0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    int intValue = ((Integer) list.get(i12)).intValue();
                    i11 += C0524j.M((intValue >> 31) ^ (intValue << 1));
                }
                c0524j.g0(i11);
                while (i10 < list.size()) {
                    int intValue2 = ((Integer) list.get(i10)).intValue();
                    c0524j.g0((intValue2 >> 31) ^ (intValue2 << 1));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                int intValue3 = ((Integer) list.get(i10)).intValue();
                c0524j.f0(i9, (intValue3 >> 31) ^ (intValue3 << 1));
                i10++;
            }
        }
    }

    public static void x(int i9, List list, C c3, boolean z9) {
        if (list != null && !list.isEmpty()) {
            C0524j c0524j = (C0524j) c3.f9625a;
            int i10 = 0;
            if (z9) {
                c0524j.e0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    long longValue = ((Long) list.get(i12)).longValue();
                    i11 += C0524j.N((longValue >> 63) ^ (longValue << 1));
                }
                c0524j.g0(i11);
                while (i10 < list.size()) {
                    long longValue2 = ((Long) list.get(i10)).longValue();
                    c0524j.i0((longValue2 >> 63) ^ (longValue2 << 1));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                long longValue3 = ((Long) list.get(i10)).longValue();
                c0524j.h0((longValue3 >> 63) ^ (longValue3 << 1), i9);
                i10++;
            }
        }
    }

    public static void y(int i9, List list, C c3, boolean z9) {
        if (list != null && !list.isEmpty()) {
            C0524j c0524j = (C0524j) c3.f9625a;
            int i10 = 0;
            if (z9) {
                c0524j.e0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += C0524j.M(((Integer) list.get(i12)).intValue());
                }
                c0524j.g0(i11);
                while (i10 < list.size()) {
                    c0524j.g0(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                c0524j.f0(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void z(int i9, List list, C c3, boolean z9) {
        if (list != null && !list.isEmpty()) {
            C0524j c0524j = (C0524j) c3.f9625a;
            int i10 = 0;
            if (z9) {
                c0524j.e0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += C0524j.N(((Long) list.get(i12)).longValue());
                }
                c0524j.g0(i11);
                while (i10 < list.size()) {
                    c0524j.i0(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                c0524j.h0(((Long) list.get(i10)).longValue(), i9);
                i10++;
            }
        }
    }

    public static Object j(Object obj, int i9, InterfaceC0534u interfaceC0534u, Object obj2, b0 b0Var) {
        return obj2;
    }
}
