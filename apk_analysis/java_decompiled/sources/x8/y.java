package x8;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class y implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final String f24685b;

    /* renamed from: a, reason: collision with root package name */
    public final C2190j f24686a;

    static {
        String separator = File.separator;
        kotlin.jvm.internal.h.d(separator, "separator");
        f24685b = separator;
    }

    public y(C2190j bytes) {
        kotlin.jvm.internal.h.e(bytes, "bytes");
        this.f24686a = bytes;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a5 = y8.c.a(this);
        C2190j c2190j = this.f24686a;
        if (a5 == -1) {
            a5 = 0;
        } else if (a5 < c2190j.d() && c2190j.i(a5) == 92) {
            a5++;
        }
        int d9 = c2190j.d();
        int i9 = a5;
        while (a5 < d9) {
            if (c2190j.i(a5) == 47 || c2190j.i(a5) == 92) {
                arrayList.add(c2190j.n(i9, a5));
                i9 = a5 + 1;
            }
            a5++;
        }
        if (i9 < c2190j.d()) {
            arrayList.add(c2190j.n(i9, c2190j.d()));
        }
        return arrayList;
    }

    public final String b() {
        C2190j c2190j = y8.c.f25134a;
        C2190j c2190j2 = y8.c.f25134a;
        C2190j c2190j3 = this.f24686a;
        int k5 = C2190j.k(c2190j3, c2190j2);
        if (k5 == -1) {
            k5 = C2190j.k(c2190j3, y8.c.f25135b);
        }
        if (k5 != -1) {
            c2190j3 = C2190j.o(c2190j3, k5 + 1, 0, 2);
        } else if (h() != null && c2190j3.d() == 2) {
            c2190j3 = C2190j.f24645d;
        }
        return c2190j3.q();
    }

    public final y c() {
        C2190j c2190j = y8.c.f25137d;
        C2190j c2190j2 = this.f24686a;
        if (!kotlin.jvm.internal.h.a(c2190j2, c2190j)) {
            C2190j c2190j3 = y8.c.f25134a;
            if (!kotlin.jvm.internal.h.a(c2190j2, c2190j3)) {
                C2190j prefix = y8.c.f25135b;
                if (!kotlin.jvm.internal.h.a(c2190j2, prefix)) {
                    C2190j suffix = y8.c.f25138e;
                    c2190j2.getClass();
                    kotlin.jvm.internal.h.e(suffix, "suffix");
                    int d9 = c2190j2.d();
                    byte[] bArr = suffix.f24646a;
                    if (!c2190j2.m(d9 - bArr.length, suffix, bArr.length) || (c2190j2.d() != 2 && !c2190j2.m(c2190j2.d() - 3, c2190j3, 1) && !c2190j2.m(c2190j2.d() - 3, prefix, 1))) {
                        int k5 = C2190j.k(c2190j2, c2190j3);
                        if (k5 == -1) {
                            k5 = C2190j.k(c2190j2, prefix);
                        }
                        if (k5 == 2 && h() != null) {
                            if (c2190j2.d() != 3) {
                                return new y(C2190j.o(c2190j2, 0, 3, 1));
                            }
                            return null;
                        }
                        if (k5 == 1) {
                            kotlin.jvm.internal.h.e(prefix, "prefix");
                            if (c2190j2.m(0, prefix, prefix.d())) {
                                return null;
                            }
                        }
                        if (k5 == -1 && h() != null) {
                            if (c2190j2.d() != 2) {
                                return new y(C2190j.o(c2190j2, 0, 2, 1));
                            }
                            return null;
                        }
                        if (k5 == -1) {
                            return new y(c2190j);
                        }
                        if (k5 == 0) {
                            return new y(C2190j.o(c2190j2, 0, 1, 1));
                        }
                        return new y(C2190j.o(c2190j2, 0, k5, 1));
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        y other = (y) obj;
        kotlin.jvm.internal.h.e(other, "other");
        return this.f24686a.compareTo(other.f24686a);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, x8.g] */
    public final y d(y other) {
        y yVar;
        kotlin.jvm.internal.h.e(other, "other");
        int a5 = y8.c.a(this);
        C2190j c2190j = this.f24686a;
        y yVar2 = null;
        if (a5 == -1) {
            yVar = null;
        } else {
            yVar = new y(c2190j.n(0, a5));
        }
        int a9 = y8.c.a(other);
        C2190j c2190j2 = other.f24686a;
        if (a9 != -1) {
            yVar2 = new y(c2190j2.n(0, a9));
        }
        if (kotlin.jvm.internal.h.a(yVar, yVar2)) {
            ArrayList a10 = a();
            ArrayList a11 = other.a();
            int min = Math.min(a10.size(), a11.size());
            int i9 = 0;
            while (i9 < min && kotlin.jvm.internal.h.a(a10.get(i9), a11.get(i9))) {
                i9++;
            }
            if (i9 == min && c2190j.d() == c2190j2.d()) {
                return d0.o.g(".", false);
            }
            if (a11.subList(i9, a11.size()).indexOf(y8.c.f25138e) == -1) {
                ?? obj = new Object();
                C2190j c3 = y8.c.c(other);
                if (c3 == null && (c3 = y8.c.c(this)) == null) {
                    c3 = y8.c.f(f24685b);
                }
                int size = a11.size();
                for (int i10 = i9; i10 < size; i10++) {
                    obj.t0(y8.c.f25138e);
                    obj.t0(c3);
                }
                int size2 = a10.size();
                while (i9 < size2) {
                    obj.t0((C2190j) a10.get(i9));
                    obj.t0(c3);
                    i9++;
                }
                return y8.c.d(obj, false);
            }
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, x8.g] */
    public final y e(String child) {
        kotlin.jvm.internal.h.e(child, "child");
        ?? obj = new Object();
        obj.B0(child);
        return y8.c.b(this, y8.c.d(obj, false), false);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof y) && kotlin.jvm.internal.h.a(((y) obj).f24686a, this.f24686a)) {
            return true;
        }
        return false;
    }

    public final File f() {
        return new File(this.f24686a.q());
    }

    public final Path g() {
        Path path;
        path = Paths.get(this.f24686a.q(), new String[0]);
        kotlin.jvm.internal.h.d(path, "get(...)");
        return path;
    }

    public final Character h() {
        C2190j c2190j = y8.c.f25134a;
        C2190j c2190j2 = this.f24686a;
        if (C2190j.g(c2190j2, c2190j) == -1 && c2190j2.d() >= 2 && c2190j2.i(1) == 58) {
            char i9 = (char) c2190j2.i(0);
            if (('a' <= i9 && i9 < '{') || ('A' <= i9 && i9 < '[')) {
                return Character.valueOf(i9);
            }
            return null;
        }
        return null;
    }

    public final int hashCode() {
        return this.f24686a.hashCode();
    }

    public final String toString() {
        return this.f24686a.q();
    }
}
