package y8;

import B7.k;
import O7.p;
import W7.l;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.android.gms.internal.measurement.Y1;
import d0.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import x8.C;
import x8.C2187g;
import x8.F;
import x8.y;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f25133a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c3) {
        if ('0' <= c3 && c3 < ':') {
            return c3 - '0';
        }
        if ('a' <= c3 && c3 < 'g') {
            return c3 - 'W';
        }
        if ('A' <= c3 && c3 < 'G') {
            return c3 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c3);
    }

    public static final LinkedHashMap b(ArrayList arrayList) {
        String str = y.f24685b;
        y g9 = o.g("/", false);
        A7.h[] hVarArr = {new A7.h(g9, new h(g9, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(B7.y.D(1));
        B7.y.F(linkedHashMap, hVarArr);
        for (h hVar : k.C0(arrayList, new B.j(19))) {
            if (((h) linkedHashMap.put(hVar.f25150a, hVar)) == null) {
                while (true) {
                    y yVar = hVar.f25150a;
                    y c3 = yVar.c();
                    if (c3 != null) {
                        h hVar2 = (h) linkedHashMap.get(c3);
                        if (hVar2 != null) {
                            hVar2.f25165q.add(yVar);
                            break;
                        }
                        h hVar3 = new h(c3, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        linkedHashMap.put(c3, hVar3);
                        hVar3.f25165q.add(yVar);
                        hVar = hVar3;
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static final String c(int i9) {
        Y1.i(16);
        String num = Integer.toString(i9, 16);
        kotlin.jvm.internal.h.d(num, "toString(...)");
        return "0x".concat(num);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [kotlin.jvm.internal.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.jvm.internal.k] */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.jvm.internal.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [kotlin.jvm.internal.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [kotlin.jvm.internal.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlin.jvm.internal.o, java.lang.Object] */
    public static final h d(C c3) {
        long j;
        int F2 = c3.F();
        if (F2 == 33639248) {
            c3.n(4L);
            short O8 = c3.O();
            int i9 = O8 & 65535;
            if ((O8 & 1) == 0) {
                int O9 = c3.O() & 65535;
                int O10 = c3.O() & 65535;
                int O11 = c3.O() & 65535;
                long F8 = c3.F() & 4294967295L;
                ?? obj = new Object();
                obj.f20158a = c3.F() & 4294967295L;
                ?? obj2 = new Object();
                obj2.f20158a = c3.F() & 4294967295L;
                int O12 = c3.O() & 65535;
                int O13 = c3.O() & 65535;
                int O14 = 65535 & c3.O();
                c3.n(8L);
                ?? obj3 = new Object();
                obj3.f20158a = c3.F() & 4294967295L;
                String S8 = c3.S(O12);
                if (!W7.d.M(S8, (char) 0)) {
                    if (obj2.f20158a == 4294967295L) {
                        j = 8;
                    } else {
                        j = 0;
                    }
                    if (obj.f20158a == 4294967295L) {
                        j += 8;
                    }
                    if (obj3.f20158a == 4294967295L) {
                        j += 8;
                    }
                    ?? obj4 = new Object();
                    ?? obj5 = new Object();
                    ?? obj6 = new Object();
                    ?? obj7 = new Object();
                    e(c3, O13, new j(obj7, j, obj2, c3, obj, obj3, obj4, obj5, obj6));
                    if (j > 0 && !obj7.f20155a) {
                        throw new IOException("bad zip: zip64 extra required but absent");
                    }
                    String S9 = c3.S(O14);
                    String str = y.f24685b;
                    return new h(o.g("/", false).e(S8), l.G(S8, "/", false), S9, F8, obj.f20158a, obj2.f20158a, O9, obj3.f20158a, O11, O10, (Long) obj4.f20159a, (Long) obj5.f20159a, (Long) obj6.f20159a, 57344);
                }
                throw new IOException("bad zip: filename contains 0x00");
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i9));
        }
        throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(F2));
    }

    public static final void e(C c3, int i9, p pVar) {
        long j = i9;
        while (j != 0) {
            if (j >= 4) {
                int O8 = c3.O() & 65535;
                long O9 = c3.O() & 65535;
                long j4 = j - 4;
                if (j4 >= O9) {
                    c3.g0(O9);
                    C2187g c2187g = c3.f24603b;
                    long j9 = c2187g.f24644b;
                    pVar.invoke(Integer.valueOf(O8), Long.valueOf(O9));
                    long j10 = (c2187g.f24644b + O9) - j9;
                    if (j10 >= 0) {
                        if (j10 > 0) {
                            c2187g.n(j10);
                        }
                        j = j4 - O9;
                    } else {
                        throw new IOException(AbstractC0953k1.j(O8, "unsupported zip: too many bytes processed for "));
                    }
                } else {
                    throw new IOException("bad zip: truncated value in extra field");
                }
            } else {
                throw new IOException("bad zip: truncated header in extra field");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.jvm.internal.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.jvm.internal.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.internal.o, java.lang.Object] */
    public static final h f(C c3, h hVar) {
        int F2 = c3.F();
        if (F2 == 67324752) {
            c3.n(2L);
            short O8 = c3.O();
            int i9 = O8 & 65535;
            if ((O8 & 1) == 0) {
                c3.n(18L);
                int O9 = c3.O() & 65535;
                c3.n(c3.O() & 65535);
                if (hVar == null) {
                    c3.n(O9);
                    return null;
                }
                ?? obj = new Object();
                ?? obj2 = new Object();
                ?? obj3 = new Object();
                e(c3, O9, new i(c3, (kotlin.jvm.internal.o) obj, (kotlin.jvm.internal.o) obj2, (kotlin.jvm.internal.o) obj3));
                return new h(hVar.f25150a, hVar.f25151b, hVar.f25152c, hVar.f25153d, hVar.f25154e, hVar.f25155f, hVar.f25156g, hVar.f25157h, hVar.f25158i, hVar.j, hVar.f25159k, hVar.f25160l, hVar.f25161m, (Integer) obj.f20159a, (Integer) obj2.f20159a, (Integer) obj3.f20159a);
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i9));
        }
        throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(F2));
    }

    public static final int g(F f9, int i9) {
        int i10;
        kotlin.jvm.internal.h.e(f9, "<this>");
        int i11 = i9 + 1;
        int length = f9.f24615e.length;
        int[] iArr = f9.f24616f;
        kotlin.jvm.internal.h.e(iArr, "<this>");
        int i12 = length - 1;
        int i13 = 0;
        while (true) {
            if (i13 <= i12) {
                i10 = (i13 + i12) >>> 1;
                int i14 = iArr[i10];
                if (i14 < i11) {
                    i13 = i10 + 1;
                } else {
                    if (i14 <= i11) {
                        break;
                    }
                    i12 = i10 - 1;
                }
            } else {
                i10 = (-i13) - 1;
                break;
            }
        }
        if (i10 >= 0) {
            return i10;
        }
        return ~i10;
    }
}
