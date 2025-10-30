package N3;

import android.util.SparseArray;
import java.io.EOFException;
import k4.C1501a;
import k4.C1517q;
import k4.InterfaceC1510j;
import l4.AbstractC1566a;
import n3.C1630g;
import n3.C1631h;
import n3.C1635l;
import n3.InterfaceC1632i;
import n3.InterfaceC1638o;

/* loaded from: classes.dex */
public class c0 implements q3.u {

    /* renamed from: A, reason: collision with root package name */
    public j3.M f5047A;

    /* renamed from: B, reason: collision with root package name */
    public j3.M f5048B;

    /* renamed from: C, reason: collision with root package name */
    public int f5049C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f5050D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f5051E;

    /* renamed from: F, reason: collision with root package name */
    public long f5052F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f5053G;

    /* renamed from: a, reason: collision with root package name */
    public final Y f5054a;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1638o f5057d;

    /* renamed from: e, reason: collision with root package name */
    public final C1635l f5058e;

    /* renamed from: f, reason: collision with root package name */
    public b0 f5059f;

    /* renamed from: g, reason: collision with root package name */
    public j3.M f5060g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1632i f5061h;

    /* renamed from: p, reason: collision with root package name */
    public int f5068p;

    /* renamed from: q, reason: collision with root package name */
    public int f5069q;

    /* renamed from: r, reason: collision with root package name */
    public int f5070r;

    /* renamed from: s, reason: collision with root package name */
    public int f5071s;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5075w;

    /* renamed from: z, reason: collision with root package name */
    public boolean f5078z;

    /* renamed from: b, reason: collision with root package name */
    public final Z f5055b = new Object();

    /* renamed from: i, reason: collision with root package name */
    public int f5062i = 1000;
    public int[] j = new int[1000];

    /* renamed from: k, reason: collision with root package name */
    public long[] f5063k = new long[1000];

    /* renamed from: n, reason: collision with root package name */
    public long[] f5066n = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    public int[] f5065m = new int[1000];

    /* renamed from: l, reason: collision with root package name */
    public int[] f5064l = new int[1000];

    /* renamed from: o, reason: collision with root package name */
    public q3.t[] f5067o = new q3.t[1000];

    /* renamed from: c, reason: collision with root package name */
    public final A3.E f5056c = new A3.E(new C6.a(13));

    /* renamed from: t, reason: collision with root package name */
    public long f5072t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    public long f5073u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    public long f5074v = Long.MIN_VALUE;

    /* renamed from: y, reason: collision with root package name */
    public boolean f5077y = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f5076x = true;

    /* JADX WARN: Type inference failed for: r1v1, types: [N3.Z, java.lang.Object] */
    public c0(C1517q c1517q, InterfaceC1638o interfaceC1638o, C1635l c1635l) {
        this.f5057d = interfaceC1638o;
        this.f5058e = c1635l;
        this.f5054a = new Y(c1517q);
    }

    public final void A() {
        B(true);
        InterfaceC1632i interfaceC1632i = this.f5061h;
        if (interfaceC1632i != null) {
            interfaceC1632i.e(this.f5058e);
            this.f5061h = null;
            this.f5060g = null;
        }
    }

    public final void B(boolean z9) {
        boolean z10;
        A3.E e8;
        SparseArray sparseArray;
        Y y9 = this.f5054a;
        y9.a(y9.f5028d);
        X x5 = y9.f5028d;
        int i9 = 0;
        if (((C1501a) x5.f5023c) == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC1566a.m(z10);
        x5.f5021a = 0L;
        x5.f5022b = y9.f5026b;
        X x9 = y9.f5028d;
        y9.f5029e = x9;
        y9.f5030f = x9;
        y9.f5031g = 0L;
        y9.f5025a.b();
        this.f5068p = 0;
        this.f5069q = 0;
        this.f5070r = 0;
        this.f5071s = 0;
        this.f5076x = true;
        this.f5072t = Long.MIN_VALUE;
        this.f5073u = Long.MIN_VALUE;
        this.f5074v = Long.MIN_VALUE;
        this.f5075w = false;
        while (true) {
            e8 = this.f5056c;
            sparseArray = (SparseArray) e8.f47c;
            if (i9 >= sparseArray.size()) {
                break;
            }
            ((C6.a) e8.f48d).g(sparseArray.valueAt(i9));
            i9++;
        }
        e8.f46b = -1;
        sparseArray.clear();
        if (z9) {
            this.f5047A = null;
            this.f5048B = null;
            this.f5077y = true;
        }
    }

    public final synchronized void C() {
        this.f5071s = 0;
        Y y9 = this.f5054a;
        y9.f5029e = y9.f5028d;
    }

    public final int D(InterfaceC1510j interfaceC1510j, int i9, boolean z9) {
        Y y9 = this.f5054a;
        int c3 = y9.c(i9);
        X x5 = y9.f5030f;
        C1501a c1501a = (C1501a) x5.f5023c;
        int D8 = interfaceC1510j.D(c1501a.f20043a, ((int) (y9.f5031g - x5.f5021a)) + c1501a.f20044b, c3);
        if (D8 == -1) {
            if (z9) {
                return -1;
            }
            throw new EOFException();
        }
        long j = y9.f5031g + D8;
        y9.f5031g = j;
        X x9 = y9.f5030f;
        if (j == x9.f5022b) {
            y9.f5030f = (X) x9.f5024d;
        }
        return D8;
    }

    public final synchronized boolean E(long j, boolean z9) {
        boolean z10;
        try {
            try {
                C();
                int r5 = r(this.f5071s);
                int i9 = this.f5071s;
                int i10 = this.f5068p;
                if (i9 != i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && j >= this.f5066n[r5]) {
                    if (j <= this.f5074v || z9) {
                        int l9 = l(r5, i10 - i9, j, true);
                        if (l9 == -1) {
                            return false;
                        }
                        this.f5072t = j;
                        this.f5071s += l9;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void F(int i9) {
        boolean z9;
        if (i9 >= 0) {
            try {
                if (this.f5071s + i9 <= this.f5068p) {
                    z9 = true;
                    AbstractC1566a.h(z9);
                    this.f5071s += i9;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z9 = false;
        AbstractC1566a.h(z9);
        this.f5071s += i9;
    }

    @Override // q3.u
    public final int a(InterfaceC1510j interfaceC1510j, int i9, boolean z9) {
        return D(interfaceC1510j, i9, z9);
    }

    @Override // q3.u
    public final void b(int i9, A4.r rVar) {
        while (true) {
            Y y9 = this.f5054a;
            if (i9 > 0) {
                int c3 = y9.c(i9);
                X x5 = y9.f5030f;
                C1501a c1501a = (C1501a) x5.f5023c;
                rVar.h(c1501a.f20043a, ((int) (y9.f5031g - x5.f5021a)) + c1501a.f20044b, c3);
                i9 -= c3;
                long j = y9.f5031g + c3;
                y9.f5031g = j;
                X x9 = y9.f5030f;
                if (j == x9.f5022b) {
                    y9.f5030f = (X) x9.f5024d;
                }
            } else {
                y9.getClass();
                return;
            }
        }
    }

    @Override // q3.u
    public final void c(int i9, A4.r rVar) {
        b(i9, rVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    @Override // q3.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(long r14, int r16, int r17, int r18, q3.t r19) {
        /*
            Method dump skipped, instructions count: 184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.c0.d(long, int, int, int, q3.t):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x010f, code lost:
    
        if (r6 == 16) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    @Override // q3.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(j3.M r6) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.c0.e(j3.M):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        if (((N3.a0) r9.valueAt(r9.size() - 1)).f5042a.equals(r8.f5048B) == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void f(long r9, int r11, long r12, int r14, q3.t r15) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.c0.f(long, int, long, int, q3.t):void");
    }

    public final long g(int i9) {
        this.f5073u = Math.max(this.f5073u, p(i9));
        this.f5068p -= i9;
        int i10 = this.f5069q + i9;
        this.f5069q = i10;
        int i11 = this.f5070r + i9;
        this.f5070r = i11;
        int i12 = this.f5062i;
        if (i11 >= i12) {
            this.f5070r = i11 - i12;
        }
        int i13 = this.f5071s - i9;
        this.f5071s = i13;
        int i14 = 0;
        if (i13 < 0) {
            this.f5071s = 0;
        }
        while (true) {
            A3.E e8 = this.f5056c;
            SparseArray sparseArray = (SparseArray) e8.f47c;
            if (i14 >= sparseArray.size() - 1) {
                break;
            }
            int i15 = i14 + 1;
            if (i10 < sparseArray.keyAt(i15)) {
                break;
            }
            ((C6.a) e8.f48d).g(sparseArray.valueAt(i14));
            sparseArray.removeAt(i14);
            int i16 = e8.f46b;
            if (i16 > 0) {
                e8.f46b = i16 - 1;
            }
            i14 = i15;
        }
        if (this.f5068p == 0) {
            int i17 = this.f5070r;
            if (i17 == 0) {
                i17 = this.f5062i;
            }
            return this.f5063k[i17 - 1] + this.f5064l[r7];
        }
        return this.f5063k[this.f5070r];
    }

    public final void h(long j, boolean z9) {
        Throwable th;
        Y y9 = this.f5054a;
        synchronized (this) {
            try {
                try {
                    int i9 = this.f5068p;
                    long j4 = -1;
                    if (i9 != 0) {
                        long[] jArr = this.f5066n;
                        int i10 = this.f5070r;
                        if (j >= jArr[i10]) {
                            if (z9) {
                                try {
                                    int i11 = this.f5071s;
                                    if (i11 != i9) {
                                        i9 = i11 + 1;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            int l9 = l(i10, i9, j, false);
                            if (l9 != -1) {
                                j4 = g(l9);
                            }
                            y9.b(j4);
                        }
                    }
                    y9.b(j4);
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    public final void i() {
        long g9;
        Y y9 = this.f5054a;
        synchronized (this) {
            int i9 = this.f5068p;
            if (i9 == 0) {
                g9 = -1;
            } else {
                g9 = g(i9);
            }
        }
        y9.b(g9);
    }

    public final long j(int i9) {
        boolean z9;
        int i10;
        int i11 = this.f5069q;
        int i12 = this.f5068p;
        int i13 = (i11 + i12) - i9;
        boolean z10 = false;
        if (i13 >= 0 && i13 <= i12 - this.f5071s) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.h(z9);
        int i14 = this.f5068p - i13;
        this.f5068p = i14;
        this.f5074v = Math.max(this.f5073u, p(i14));
        if (i13 == 0 && this.f5075w) {
            z10 = true;
        }
        this.f5075w = z10;
        A3.E e8 = this.f5056c;
        SparseArray sparseArray = (SparseArray) e8.f47c;
        for (int size = sparseArray.size() - 1; size >= 0 && i9 < sparseArray.keyAt(size); size--) {
            ((C6.a) e8.f48d).g(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        if (sparseArray.size() > 0) {
            i10 = Math.min(e8.f46b, sparseArray.size() - 1);
        } else {
            i10 = -1;
        }
        e8.f46b = i10;
        int i15 = this.f5068p;
        if (i15 != 0) {
            return this.f5063k[r(i15 - 1)] + this.f5064l[r9];
        }
        return 0L;
    }

    public final void k(int i9) {
        boolean z9;
        long j = j(i9);
        Y y9 = this.f5054a;
        if (j <= y9.f5031g) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.h(z9);
        y9.f5031g = j;
        int i10 = y9.f5026b;
        if (j != 0) {
            X x5 = y9.f5028d;
            if (j != x5.f5021a) {
                while (y9.f5031g > x5.f5022b) {
                    x5 = (X) x5.f5024d;
                }
                X x9 = (X) x5.f5024d;
                x9.getClass();
                y9.a(x9);
                X x10 = new X(x5.f5022b, i10);
                x5.f5024d = x10;
                if (y9.f5031g == x5.f5022b) {
                    x5 = x10;
                }
                y9.f5030f = x5;
                if (y9.f5029e == x9) {
                    y9.f5029e = x10;
                    return;
                }
                return;
            }
        }
        y9.a(y9.f5028d);
        X x11 = new X(y9.f5031g, i10);
        y9.f5028d = x11;
        y9.f5029e = x11;
        y9.f5030f = x11;
    }

    public final int l(int i9, int i10, long j, boolean z9) {
        int i11 = -1;
        for (int i12 = 0; i12 < i10; i12++) {
            long j4 = this.f5066n[i9];
            if (j4 > j) {
                break;
            }
            if (!z9 || (this.f5065m[i9] & 1) != 0) {
                if (j4 == j) {
                    return i12;
                }
                i11 = i12;
            }
            i9++;
            if (i9 == this.f5062i) {
                i9 = 0;
            }
        }
        return i11;
    }

    public j3.M m(j3.M m9) {
        if (this.f5052F != 0 && m9.f19439p != Long.MAX_VALUE) {
            j3.L a5 = m9.a();
            a5.f19406o = m9.f19439p + this.f5052F;
            return new j3.M(a5);
        }
        return m9;
    }

    public final synchronized long n() {
        return this.f5074v;
    }

    public final synchronized long o() {
        return Math.max(this.f5073u, p(this.f5071s));
    }

    public final long p(int i9) {
        long j = Long.MIN_VALUE;
        if (i9 == 0) {
            return Long.MIN_VALUE;
        }
        int r5 = r(i9 - 1);
        for (int i10 = 0; i10 < i9; i10++) {
            j = Math.max(j, this.f5066n[r5]);
            if ((this.f5065m[r5] & 1) != 0) {
                return j;
            }
            r5--;
            if (r5 == -1) {
                r5 = this.f5062i - 1;
            }
        }
        return j;
    }

    public final int q() {
        return this.f5069q + this.f5071s;
    }

    public final int r(int i9) {
        int i10 = this.f5070r + i9;
        int i11 = this.f5062i;
        if (i10 < i11) {
            return i10;
        }
        return i10 - i11;
    }

    public final synchronized int s(long j, boolean z9) {
        boolean z10;
        try {
            try {
                int r5 = r(this.f5071s);
                int i9 = this.f5071s;
                int i10 = this.f5068p;
                if (i9 != i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || j < this.f5066n[r5]) {
                    return 0;
                }
                if (j > this.f5074v && z9) {
                    return i10 - i9;
                }
                int l9 = l(r5, i10 - i9, j, true);
                if (l9 == -1) {
                    return 0;
                }
                return l9;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized j3.M t() {
        j3.M m9;
        if (this.f5077y) {
            m9 = null;
        } else {
            m9 = this.f5048B;
        }
        return m9;
    }

    public final synchronized boolean u(boolean z9) {
        boolean z10;
        j3.M m9;
        boolean z11 = false;
        if (this.f5071s != this.f5068p) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (z9 || this.f5075w || ((m9 = this.f5048B) != null && m9 != this.f5060g)) {
                z11 = true;
            }
            return z11;
        }
        if (((a0) this.f5056c.i(q())).f5042a != this.f5060g) {
            return true;
        }
        return v(r(this.f5071s));
    }

    public final boolean v(int i9) {
        InterfaceC1632i interfaceC1632i = this.f5061h;
        if (interfaceC1632i != null && interfaceC1632i.getState() != 4) {
            if ((this.f5065m[i9] & 1073741824) != 0 || !this.f5061h.b()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void w() {
        InterfaceC1632i interfaceC1632i = this.f5061h;
        if (interfaceC1632i != null && interfaceC1632i.getState() == 1) {
            C1631h f9 = this.f5061h.f();
            f9.getClass();
            throw f9;
        }
    }

    public final void x(j3.M m9, O0.c cVar) {
        boolean z9;
        C1630g c1630g;
        j3.M m10;
        j3.M m11 = this.f5060g;
        if (m11 == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            c1630g = null;
        } else {
            c1630g = m11.f19438o;
        }
        this.f5060g = m9;
        C1630g c1630g2 = m9.f19438o;
        InterfaceC1638o interfaceC1638o = this.f5057d;
        if (interfaceC1638o != null) {
            int h7 = interfaceC1638o.h(m9);
            j3.L a5 = m9.a();
            a5.f19392D = h7;
            m10 = new j3.M(a5);
        } else {
            m10 = m9;
        }
        cVar.f5264c = m10;
        cVar.f5263b = this.f5061h;
        if (interfaceC1638o != null) {
            if (z9 || !l4.y.a(c1630g, c1630g2)) {
                InterfaceC1632i interfaceC1632i = this.f5061h;
                C1635l c1635l = this.f5058e;
                InterfaceC1632i g9 = interfaceC1638o.g(c1635l, m9);
                this.f5061h = g9;
                cVar.f5263b = g9;
                if (interfaceC1632i != null) {
                    interfaceC1632i.e(c1635l);
                }
            }
        }
    }

    public final synchronized int y() {
        boolean z9;
        int i9;
        try {
            int r5 = r(this.f5071s);
            if (this.f5071s != this.f5068p) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                i9 = this.j[r5];
            } else {
                i9 = this.f5049C;
            }
        } catch (Throwable th) {
            throw th;
        }
        return i9;
    }

    public final int z(O0.c cVar, m3.f fVar, int i9, boolean z9) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12 = false;
        if ((i9 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Z z13 = this.f5055b;
        synchronized (this) {
            try {
                fVar.f20705e = false;
                if (this.f5071s != this.f5068p) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i10 = -3;
                if (!z11) {
                    if (!z9 && !this.f5075w) {
                        j3.M m9 = this.f5048B;
                        if (m9 == null || (!z10 && m9 == this.f5060g)) {
                        }
                        x(m9, cVar);
                        i10 = -5;
                    }
                    fVar.f6039b = 4;
                    i10 = -4;
                } else {
                    j3.M m10 = ((a0) this.f5056c.i(q())).f5042a;
                    if (!z10 && m10 == this.f5060g) {
                        int r5 = r(this.f5071s);
                        if (!v(r5)) {
                            fVar.f20705e = true;
                        } else {
                            fVar.f6039b = this.f5065m[r5];
                            long j = this.f5066n[r5];
                            fVar.f20706f = j;
                            if (j < this.f5072t) {
                                fVar.b(Integer.MIN_VALUE);
                            }
                            z13.f5032a = this.f5064l[r5];
                            z13.f5033b = this.f5063k[r5];
                            z13.f5034c = this.f5067o[r5];
                            i10 = -4;
                        }
                    }
                    x(m10, cVar);
                    i10 = -5;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i10 == -4 && !fVar.e(4)) {
            if ((i9 & 1) != 0) {
                z12 = true;
            }
            if ((i9 & 4) == 0) {
                if (z12) {
                    Y y9 = this.f5054a;
                    Y.f(y9.f5029e, fVar, this.f5055b, y9.f5027c);
                } else {
                    Y y10 = this.f5054a;
                    y10.f5029e = Y.f(y10.f5029e, fVar, this.f5055b, y10.f5027c);
                }
            }
            if (!z12) {
                this.f5071s++;
            }
        }
        return i10;
    }
}
