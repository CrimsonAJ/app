package j3;

import N3.C0273y;
import android.os.Handler;
import android.util.Pair;
import k3.C1489e;
import l4.AbstractC1566a;

/* renamed from: j3.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1452e0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0 f19604a = new C0();

    /* renamed from: b, reason: collision with root package name */
    public final D0 f19605b = new D0();

    /* renamed from: c, reason: collision with root package name */
    public final C1489e f19606c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f19607d;

    /* renamed from: e, reason: collision with root package name */
    public long f19608e;

    /* renamed from: f, reason: collision with root package name */
    public int f19609f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19610g;

    /* renamed from: h, reason: collision with root package name */
    public C1448c0 f19611h;

    /* renamed from: i, reason: collision with root package name */
    public C1448c0 f19612i;
    public C1448c0 j;

    /* renamed from: k, reason: collision with root package name */
    public int f19613k;

    /* renamed from: l, reason: collision with root package name */
    public Object f19614l;

    /* renamed from: m, reason: collision with root package name */
    public long f19615m;

    public C1452e0(Handler handler, C1489e c1489e) {
        this.f19606c = c1489e;
        this.f19607d = handler;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [N3.y, N3.A] */
    public static N3.A l(E0 e02, Object obj, long j, long j4, D0 d02, C0 c02) {
        e02.g(obj, c02);
        e02.n(c02.f19237c, d02);
        int b9 = e02.b(obj);
        while (c02.f19238d == 0) {
            O3.b bVar = c02.f19241g;
            if (bVar.f5454a <= 0 || !c02.g(bVar.f5457d) || c02.c(0L) != -1) {
                break;
            }
            int i9 = b9 + 1;
            if (b9 >= d02.f19317p) {
                break;
            }
            e02.f(i9, c02, true);
            obj = c02.f19236b;
            obj.getClass();
            b9 = i9;
        }
        e02.g(obj, c02);
        int c3 = c02.c(j);
        if (c3 == -1) {
            return new N3.A(c02.b(j), j4, obj);
        }
        return new C0273y(obj, c3, c02.f(c3), j4, -1);
    }

    public final C1448c0 a() {
        C1448c0 c1448c0 = this.f19611h;
        if (c1448c0 == null) {
            return null;
        }
        if (c1448c0 == this.f19612i) {
            this.f19612i = c1448c0.f19580l;
        }
        c1448c0.f();
        int i9 = this.f19613k - 1;
        this.f19613k = i9;
        if (i9 == 0) {
            this.j = null;
            C1448c0 c1448c02 = this.f19611h;
            this.f19614l = c1448c02.f19571b;
            this.f19615m = c1448c02.f19575f.f19595a.f5210d;
        }
        this.f19611h = this.f19611h.f19580l;
        j();
        return this.f19611h;
    }

    public final void b() {
        if (this.f19613k == 0) {
            return;
        }
        C1448c0 c1448c0 = this.f19611h;
        AbstractC1566a.n(c1448c0);
        this.f19614l = c1448c0.f19571b;
        this.f19615m = c1448c0.f19575f.f19595a.f5210d;
        while (c1448c0 != null) {
            c1448c0.f();
            c1448c0 = c1448c0.f19580l;
        }
        this.f19611h = null;
        this.j = null;
        this.f19612i = null;
        this.f19613k = 0;
        j();
    }

    public final C1450d0 c(E0 e02, C1448c0 c1448c0, long j) {
        long j4;
        E0 e03;
        C0 c02;
        long j9;
        long j10;
        Object obj;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        boolean z9;
        long j16;
        C1450d0 c1450d0 = c1448c0.f19575f;
        long j17 = (c1448c0.f19583o + c1450d0.f19599e) - j;
        C0 c03 = this.f19604a;
        boolean z10 = c1450d0.f19601g;
        boolean z11 = true;
        long j18 = c1450d0.f19597c;
        N3.A a5 = c1450d0.f19595a;
        if (z10) {
            int d9 = e02.d(e02.b(a5.f5207a), this.f19604a, this.f19605b, this.f19609f, this.f19610g);
            if (d9 != -1) {
                int i9 = e02.f(d9, c03, true).f19237c;
                Object obj2 = c03.f19236b;
                obj2.getClass();
                if (e02.m(i9, this.f19605b, 0L).f19316o == d9) {
                    Pair j19 = e02.j(this.f19605b, this.f19604a, i9, -9223372036854775807L, Math.max(0L, j17));
                    if (j19 != null) {
                        Object obj3 = j19.first;
                        long longValue = ((Long) j19.second).longValue();
                        C1448c0 c1448c02 = c1448c0.f19580l;
                        if (c1448c02 != null && c1448c02.f19571b.equals(obj3)) {
                            j16 = c1448c02.f19575f.f19595a.f5210d;
                        } else {
                            j16 = this.f19608e;
                            this.f19608e = 1 + j16;
                        }
                        j12 = j16;
                        j11 = -9223372036854775807L;
                        obj = obj3;
                        j13 = longValue;
                    }
                } else {
                    obj = obj2;
                    j11 = 0;
                    j12 = a5.f5210d;
                    j13 = 0;
                }
                N3.A l9 = l(e02, obj, j13, j12, this.f19605b, this.f19604a);
                if (j11 != -9223372036854775807L && j18 != -9223372036854775807L) {
                    if (e02.g(a5.f5207a, c03).f19241g.f5454a > 0 && c03.g(c03.f19241g.f5457d)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (l9.a() && z9) {
                        j14 = j13;
                        j15 = j18;
                    } else if (z9) {
                        j15 = j11;
                        j14 = j18;
                    }
                    return d(e02, l9, j15, j14);
                }
                j14 = j13;
                j15 = j11;
                return d(e02, l9, j15, j14);
            }
            return null;
        }
        e02.g(a5.f5207a, c03);
        boolean a9 = a5.a();
        Object obj4 = a5.f5207a;
        if (a9) {
            O3.b bVar = c03.f19241g;
            int i10 = a5.f5208b;
            int i11 = bVar.a(i10).f5444b;
            if (i11 != -1) {
                int a10 = c03.f19241g.a(i10).a(a5.f5209c);
                if (a10 < i11) {
                    return e(e02, a5.f5207a, i10, a10, c1450d0.f19597c, a5.f5210d);
                }
                if (j18 == -9223372036854775807L) {
                    e03 = e02;
                    c02 = c03;
                    Pair j20 = e03.j(this.f19605b, c02, c03.f19237c, -9223372036854775807L, Math.max(0L, j17));
                    if (j20 == null) {
                        return null;
                    }
                    j9 = ((Long) j20.second).longValue();
                } else {
                    e03 = e02;
                    c02 = c03;
                    j9 = j18;
                }
                e03.g(obj4, c02);
                int i12 = a5.f5208b;
                long d10 = c02.d(i12);
                if (d10 == Long.MIN_VALUE) {
                    j10 = c02.f19238d;
                } else {
                    j10 = c02.f19241g.a(i12).f5449g + d10;
                }
                return f(e03, a5.f5207a, Math.max(j10, j9), c1450d0.f19597c, a5.f5210d);
            }
            return null;
        }
        int i13 = a5.f5211e;
        int f9 = c03.f(i13);
        if (!c03.g(i13) || c03.e(i13, f9) != 3) {
            z11 = false;
        }
        if (f9 != c03.f19241g.a(i13).f5444b && !z11) {
            return e(e02, a5.f5207a, a5.f5211e, f9, c1450d0.f19599e, a5.f5210d);
        }
        e02.g(obj4, c03);
        long d11 = c03.d(i13);
        if (d11 == Long.MIN_VALUE) {
            j4 = c03.f19238d;
        } else {
            j4 = d11 + c03.f19241g.a(i13).f5449g;
        }
        return f(e02, a5.f5207a, j4, c1450d0.f19599e, a5.f5210d);
    }

    public final C1450d0 d(E0 e02, N3.A a5, long j, long j4) {
        e02.g(a5.f5207a, this.f19604a);
        if (a5.a()) {
            return e(e02, a5.f5207a, a5.f5208b, a5.f5209c, j, a5.f5210d);
        }
        return f(e02, a5.f5207a, j4, j, a5.f5210d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [N3.y, N3.A] */
    public final C1450d0 e(E0 e02, Object obj, int i9, int i10, long j, long j4) {
        long j9;
        ?? c0273y = new C0273y(obj, i9, i10, j4, -1);
        C0 c02 = this.f19604a;
        long a5 = e02.g(obj, c02).a(i9, i10);
        if (i10 == c02.f(i9)) {
            j9 = c02.f19241g.f5455b;
        } else {
            j9 = 0;
        }
        boolean g9 = c02.g(i9);
        if (a5 != -9223372036854775807L && j9 >= a5) {
            j9 = Math.max(0L, a5 - 1);
        }
        return new C1450d0(c0273y, j9, j, -9223372036854775807L, a5, g9, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j3.C1450d0 f(j3.E0 r26, java.lang.Object r27, long r28, long r30, long r32) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.C1452e0.f(j3.E0, java.lang.Object, long, long, long):j3.d0");
    }

    public final C1450d0 g(E0 e02, C1450d0 c1450d0) {
        boolean z9;
        long j;
        long j4;
        N3.A a5 = c1450d0.f19595a;
        boolean a9 = a5.a();
        boolean z10 = false;
        int i9 = a5.f5211e;
        if (!a9 && i9 == -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean i10 = i(e02, a5);
        boolean h7 = h(e02, a5, z9);
        Object obj = a5.f5207a;
        C0 c02 = this.f19604a;
        e02.g(obj, c02);
        if (!a5.a() && i9 != -1) {
            j = c02.d(i9);
        } else {
            j = -9223372036854775807L;
        }
        boolean a10 = a5.a();
        int i11 = a5.f5208b;
        if (a10) {
            j4 = c02.a(i11, a5.f5209c);
        } else if (j != -9223372036854775807L && j != Long.MIN_VALUE) {
            j4 = j;
        } else {
            j4 = c02.f19238d;
        }
        if (a5.a()) {
            z10 = c02.g(i11);
        } else if (i9 != -1 && c02.g(i9)) {
            z10 = true;
        }
        return new C1450d0(a5, c1450d0.f19596b, c1450d0.f19597c, j, j4, z10, z9, i10, h7);
    }

    public final boolean h(E0 e02, N3.A a5, boolean z9) {
        int b9 = e02.b(a5.f5207a);
        if (!e02.m(e02.f(b9, this.f19604a, false).f19237c, this.f19605b, 0L).f19311i) {
            if (e02.d(b9, this.f19604a, this.f19605b, this.f19609f, this.f19610g) == -1 && z9) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(E0 e02, N3.A a5) {
        boolean z9;
        if (!a5.a() && a5.f5211e == -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            Object obj = a5.f5207a;
            if (e02.m(e02.g(obj, this.f19604a).f19237c, this.f19605b, 0L).f19317p == e02.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        N3.A a5;
        P5.D d9 = P5.F.f5901b;
        P5.C c3 = new P5.C();
        for (C1448c0 c1448c0 = this.f19611h; c1448c0 != null; c1448c0 = c1448c0.f19580l) {
            c3.a(c1448c0.f19575f.f19595a);
        }
        C1448c0 c1448c02 = this.f19612i;
        if (c1448c02 == null) {
            a5 = null;
        } else {
            a5 = c1448c02.f19575f.f19595a;
        }
        this.f19607d.post(new N3.E(this, c3, a5, 8));
    }

    public final boolean k(C1448c0 c1448c0) {
        boolean z9;
        boolean z10 = false;
        if (c1448c0 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        if (c1448c0.equals(this.j)) {
            return false;
        }
        this.j = c1448c0;
        while (true) {
            c1448c0 = c1448c0.f19580l;
            if (c1448c0 == null) {
                break;
            }
            if (c1448c0 == this.f19612i) {
                this.f19612i = this.f19611h;
                z10 = true;
            }
            c1448c0.f();
            this.f19613k--;
        }
        C1448c0 c1448c02 = this.j;
        if (c1448c02.f19580l != null) {
            c1448c02.b();
            c1448c02.f19580l = null;
            c1448c02.c();
        }
        j();
        return z10;
    }

    public final N3.A m(E0 e02, Object obj, long j) {
        long j4;
        int b9;
        Object obj2 = obj;
        C0 c02 = this.f19604a;
        int i9 = e02.g(obj2, c02).f19237c;
        Object obj3 = this.f19614l;
        if (obj3 != null && (b9 = e02.b(obj3)) != -1 && e02.f(b9, c02, false).f19237c == i9) {
            j4 = this.f19615m;
        } else {
            C1448c0 c1448c0 = this.f19611h;
            while (true) {
                if (c1448c0 != null) {
                    if (c1448c0.f19571b.equals(obj2)) {
                        j4 = c1448c0.f19575f.f19595a.f5210d;
                        break;
                    }
                    c1448c0 = c1448c0.f19580l;
                } else {
                    C1448c0 c1448c02 = this.f19611h;
                    while (true) {
                        if (c1448c02 != null) {
                            int b10 = e02.b(c1448c02.f19571b);
                            if (b10 != -1 && e02.f(b10, c02, false).f19237c == i9) {
                                j4 = c1448c02.f19575f.f19595a.f5210d;
                                break;
                            }
                            c1448c02 = c1448c02.f19580l;
                        } else {
                            j4 = this.f19608e;
                            this.f19608e = 1 + j4;
                            if (this.f19611h == null) {
                                this.f19614l = obj2;
                                this.f19615m = j4;
                            }
                        }
                    }
                }
            }
        }
        e02.g(obj2, c02);
        int i10 = c02.f19237c;
        D0 d02 = this.f19605b;
        e02.n(i10, d02);
        boolean z9 = false;
        for (int b11 = e02.b(obj); b11 >= d02.f19316o; b11--) {
            boolean z10 = true;
            e02.f(b11, c02, true);
            if (c02.f19241g.f5454a <= 0) {
                z10 = false;
            }
            z9 |= z10;
            if (c02.c(c02.f19238d) != -1) {
                obj2 = c02.f19236b;
                obj2.getClass();
            }
            if (z9 && (!z10 || c02.f19238d != 0)) {
                break;
            }
        }
        return l(e02, obj2, j, j4, this.f19605b, this.f19604a);
    }

    public final boolean n(E0 e02) {
        E0 e03;
        C1448c0 c1448c0;
        C1448c0 c1448c02 = this.f19611h;
        if (c1448c02 == null) {
            return true;
        }
        int b9 = e02.b(c1448c02.f19571b);
        while (true) {
            e03 = e02;
            b9 = e03.d(b9, this.f19604a, this.f19605b, this.f19609f, this.f19610g);
            while (true) {
                c1448c0 = c1448c02.f19580l;
                if (c1448c0 == null || c1448c02.f19575f.f19601g) {
                    break;
                }
                c1448c02 = c1448c0;
            }
            if (b9 == -1 || c1448c0 == null || e03.b(c1448c0.f19571b) != b9) {
                break;
            }
            c1448c02 = c1448c0;
            e02 = e03;
        }
        boolean k5 = k(c1448c02);
        c1448c02.f19575f = g(e03, c1448c02.f19575f);
        return !k5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0085, code lost:
    
        return !k(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o(j3.E0 r11, long r12, long r14) {
        /*
            r10 = this;
            j3.c0 r0 = r10.f19611h
            r1 = 0
        L3:
            r2 = 1
            if (r0 == 0) goto L86
            j3.d0 r3 = r0.f19575f
            if (r1 != 0) goto Lf
            j3.d0 r1 = r10.g(r11, r3)
            goto L2e
        Lf:
            j3.d0 r4 = r10.c(r11, r1, r12)
            if (r4 != 0) goto L1b
            boolean r11 = r10.k(r1)
            r11 = r11 ^ r2
            return r11
        L1b:
            long r5 = r3.f19596b
            long r7 = r4.f19596b
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L80
            N3.A r5 = r3.f19595a
            N3.A r6 = r4.f19595a
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L80
            r1 = r4
        L2e:
            long r4 = r3.f19597c
            j3.d0 r4 = r1.a(r4)
            r0.f19575f = r4
            long r3 = r3.f19599e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L7a
            long r7 = r1.f19599e
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 != 0) goto L48
            goto L7a
        L48:
            r0.h()
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 != 0) goto L55
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L58
        L55:
            long r11 = r0.f19583o
            long r11 = r11 + r7
        L58:
            j3.c0 r13 = r10.f19612i
            r1 = 0
            if (r0 != r13) goto L6f
            j3.d0 r13 = r0.f19575f
            boolean r13 = r13.f19600f
            if (r13 != 0) goto L6f
            r3 = -9223372036854775808
            int r13 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r13 == 0) goto L6d
            int r11 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r11 < 0) goto L6f
        L6d:
            r11 = r2
            goto L70
        L6f:
            r11 = r1
        L70:
            boolean r12 = r10.k(r0)
            if (r12 != 0) goto L79
            if (r11 != 0) goto L79
            goto L86
        L79:
            return r1
        L7a:
            j3.c0 r1 = r0.f19580l
            r9 = r1
            r1 = r0
            r0 = r9
            goto L3
        L80:
            boolean r11 = r10.k(r1)
            r11 = r11 ^ r2
            return r11
        L86:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.C1452e0.o(j3.E0, long, long):boolean");
    }
}
