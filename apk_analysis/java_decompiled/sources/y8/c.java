package y8;

import B7.k;
import B7.l;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.ArrayList;
import u0.z;
import x8.C2187g;
import x8.C2190j;
import x8.y;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final C2190j f25134a;

    /* renamed from: b, reason: collision with root package name */
    public static final C2190j f25135b;

    /* renamed from: c, reason: collision with root package name */
    public static final C2190j f25136c;

    /* renamed from: d, reason: collision with root package name */
    public static final C2190j f25137d;

    /* renamed from: e, reason: collision with root package name */
    public static final C2190j f25138e;

    static {
        C2190j c2190j = C2190j.f24645d;
        f25134a = e0.c.D("/");
        f25135b = e0.c.D("\\");
        f25136c = e0.c.D("/\\");
        f25137d = e0.c.D(".");
        f25138e = e0.c.D("..");
    }

    public static final int a(y yVar) {
        if (yVar.f24686a.d() != 0) {
            C2190j c2190j = yVar.f24686a;
            if (c2190j.i(0) != 47) {
                if (c2190j.i(0) == 92) {
                    if (c2190j.d() > 2 && c2190j.i(1) == 92) {
                        C2190j other = f25135b;
                        kotlin.jvm.internal.h.e(other, "other");
                        int f9 = c2190j.f(2, other.f24646a);
                        if (f9 == -1) {
                            return c2190j.d();
                        }
                        return f9;
                    }
                } else if (c2190j.d() > 2 && c2190j.i(1) == 58 && c2190j.i(2) == 92) {
                    char i9 = (char) c2190j.i(0);
                    if ('a' > i9 || i9 >= '{') {
                        if ('A' <= i9 && i9 < '[') {
                            return 3;
                        }
                    } else {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, x8.g] */
    public static final y b(y yVar, y child, boolean z9) {
        kotlin.jvm.internal.h.e(yVar, "<this>");
        kotlin.jvm.internal.h.e(child, "child");
        if (a(child) != -1) {
            return child;
        }
        if (child.h() != null) {
            return child;
        }
        C2190j c3 = c(yVar);
        if (c3 == null && (c3 = c(child)) == null) {
            c3 = f(y.f24685b);
        }
        ?? obj = new Object();
        obj.t0(yVar.f24686a);
        if (obj.f24644b > 0) {
            obj.t0(c3);
        }
        obj.t0(child.f24686a);
        return d(obj, z9);
    }

    public static final C2190j c(y yVar) {
        C2190j c2190j = yVar.f24686a;
        C2190j c2190j2 = f25134a;
        if (C2190j.g(c2190j, c2190j2) != -1) {
            return c2190j2;
        }
        C2190j c2190j3 = f25135b;
        if (C2190j.g(yVar.f24686a, c2190j3) != -1) {
            return c2190j3;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, x8.g] */
    public static final y d(C2187g c2187g, boolean z9) {
        C2190j c2190j;
        boolean z10;
        C2190j c2190j2;
        char O8;
        boolean z11;
        C2190j c2190j3;
        C2190j j02;
        ?? obj = new Object();
        C2190j c2190j4 = null;
        int i9 = 0;
        while (true) {
            if (!c2187g.f0(f25134a)) {
                c2190j = f25135b;
                if (!c2187g.f0(c2190j)) {
                    break;
                }
            }
            byte h02 = c2187g.h0();
            if (c2190j4 == null) {
                c2190j4 = e(h02);
            }
            i9++;
        }
        if (i9 >= 2 && kotlin.jvm.internal.h.a(c2190j4, c2190j)) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2190j c2190j5 = f25136c;
        long j = 0;
        if (z10) {
            kotlin.jvm.internal.h.b(c2190j4);
            obj.t0(c2190j4);
            obj.t0(c2190j4);
        } else if (i9 > 0) {
            kotlin.jvm.internal.h.b(c2190j4);
            obj.t0(c2190j4);
        } else {
            long h7 = c2187g.h(c2190j5);
            if (c2190j4 == null) {
                if (h7 == -1) {
                    c2190j4 = f(y.f24685b);
                } else {
                    c2190j4 = e(c2187g.O(h7));
                }
            }
            if (!kotlin.jvm.internal.h.a(c2190j4, c2190j)) {
                c2190j2 = c2190j4;
            } else {
                c2190j2 = c2190j4;
                if (c2187g.f24644b >= 2 && c2187g.O(1L) == 58 && (('a' <= (O8 = (char) c2187g.O(0L)) && O8 < '{') || ('A' <= O8 && O8 < '['))) {
                    if (h7 == 2) {
                        obj.G(c2187g, 3L);
                    } else {
                        obj.G(c2187g, 2L);
                    }
                }
            }
            c2190j4 = c2190j2;
        }
        if (obj.f24644b > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean N8 = c2187g.N();
            c2190j3 = f25137d;
            if (N8) {
                break;
            }
            long j4 = j;
            long h9 = c2187g.h(c2190j5);
            if (h9 == -1) {
                j02 = c2187g.j0(c2187g.f24644b);
            } else {
                j02 = c2187g.j0(h9);
                c2187g.h0();
            }
            C2190j c2190j6 = f25138e;
            if (kotlin.jvm.internal.h.a(j02, c2190j6)) {
                if (!z11 || !arrayList.isEmpty()) {
                    if (z9 && (z11 || (!arrayList.isEmpty() && !kotlin.jvm.internal.h.a(k.v0(arrayList), c2190j6)))) {
                        if ((!z10 || arrayList.size() != 1) && !arrayList.isEmpty()) {
                            arrayList.remove(l.a0(arrayList));
                        }
                    } else {
                        arrayList.add(j02);
                    }
                }
            } else if (!kotlin.jvm.internal.h.a(j02, c2190j3) && !kotlin.jvm.internal.h.a(j02, C2190j.f24645d)) {
                arrayList.add(j02);
            }
            j = j4;
        }
        long j9 = j;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                obj.t0(c2190j4);
            }
            obj.t0((C2190j) arrayList.get(i10));
        }
        if (obj.f24644b == j9) {
            obj.t0(c2190j3);
        }
        return new y(obj.j0(obj.f24644b));
    }

    public static final C2190j e(byte b9) {
        if (b9 != 47) {
            if (b9 == 92) {
                return f25135b;
            }
            throw new IllegalArgumentException(AbstractC0953k1.j(b9, "not a directory separator: "));
        }
        return f25134a;
    }

    public static final C2190j f(String str) {
        if (kotlin.jvm.internal.h.a(str, "/")) {
            return f25134a;
        }
        if (kotlin.jvm.internal.h.a(str, "\\")) {
            return f25135b;
        }
        throw new IllegalArgumentException(z.e("not a directory separator: ", str));
    }
}
