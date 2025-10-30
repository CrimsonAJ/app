package P3;

import N3.C0266q;
import N3.C0270v;
import N3.G;
import N3.c0;
import N3.d0;
import N3.e0;
import N3.f0;
import Q3.o;
import android.net.Uri;
import e1.q;
import j3.M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k4.C1517q;
import k4.H;
import k4.J;
import k4.K;
import l4.AbstractC1566a;
import l4.y;
import n3.C1635l;
import n3.InterfaceC1632i;
import n3.InterfaceC1638o;

/* loaded from: classes.dex */
public final class g implements d0, f0, H, K {

    /* renamed from: a, reason: collision with root package name */
    public final int f5852a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f5853b;

    /* renamed from: c, reason: collision with root package name */
    public final M[] f5854c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f5855d;

    /* renamed from: e, reason: collision with root package name */
    public final h f5856e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f5857f;

    /* renamed from: g, reason: collision with root package name */
    public final G f5858g;

    /* renamed from: h, reason: collision with root package name */
    public final q f5859h;

    /* renamed from: i, reason: collision with root package name */
    public final k4.M f5860i;
    public final A6.i j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f5861k;

    /* renamed from: l, reason: collision with root package name */
    public final List f5862l;

    /* renamed from: m, reason: collision with root package name */
    public final c0 f5863m;

    /* renamed from: n, reason: collision with root package name */
    public final c0[] f5864n;

    /* renamed from: o, reason: collision with root package name */
    public final O0.c f5865o;

    /* renamed from: p, reason: collision with root package name */
    public e f5866p;

    /* renamed from: q, reason: collision with root package name */
    public M f5867q;

    /* renamed from: r, reason: collision with root package name */
    public Q3.b f5868r;

    /* renamed from: s, reason: collision with root package name */
    public long f5869s;

    /* renamed from: t, reason: collision with root package name */
    public long f5870t;

    /* renamed from: u, reason: collision with root package name */
    public int f5871u;

    /* renamed from: v, reason: collision with root package name */
    public a f5872v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5873w;

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, A6.i] */
    public g(int i9, int[] iArr, M[] mArr, h hVar, e0 e0Var, C1517q c1517q, long j, InterfaceC1638o interfaceC1638o, C1635l c1635l, q qVar, G g9) {
        this.f5852a = i9;
        int i10 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f5853b = iArr;
        this.f5854c = mArr == null ? new M[0] : mArr;
        this.f5856e = hVar;
        this.f5857f = e0Var;
        this.f5858g = g9;
        this.f5859h = qVar;
        this.f5860i = new k4.M("ChunkSampleStream");
        this.j = new Object();
        ArrayList arrayList = new ArrayList();
        this.f5861k = arrayList;
        this.f5862l = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f5864n = new c0[length];
        this.f5855d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        c0[] c0VarArr = new c0[i11];
        interfaceC1638o.getClass();
        c0 c0Var = new c0(c1517q, interfaceC1638o, c1635l);
        this.f5863m = c0Var;
        iArr2[0] = i9;
        c0VarArr[0] = c0Var;
        while (i10 < length) {
            c0 c0Var2 = new c0(c1517q, null, null);
            this.f5864n[i10] = c0Var2;
            int i12 = i10 + 1;
            c0VarArr[i12] = c0Var2;
            iArr2[i12] = this.f5853b[i10];
            i10 = i12;
        }
        this.f5865o = new O0.c(iArr2, 4, c0VarArr);
        this.f5869s = j;
        this.f5870t = j;
    }

    public final void A(Q3.b bVar) {
        this.f5868r = bVar;
        c0 c0Var = this.f5863m;
        c0Var.i();
        InterfaceC1632i interfaceC1632i = c0Var.f5061h;
        if (interfaceC1632i != null) {
            interfaceC1632i.e(c0Var.f5058e);
            c0Var.f5061h = null;
            c0Var.f5060g = null;
        }
        for (c0 c0Var2 : this.f5864n) {
            c0Var2.i();
            InterfaceC1632i interfaceC1632i2 = c0Var2.f5061h;
            if (interfaceC1632i2 != null) {
                interfaceC1632i2.e(c0Var2.f5058e);
                c0Var2.f5061h = null;
                c0Var2.f5060g = null;
            }
        }
        this.f5860i.e(this);
    }

    @Override // N3.f0
    public final void B(long j) {
        k4.M m9 = this.f5860i;
        if (!m9.c() && !t()) {
            boolean d9 = m9.d();
            h hVar = this.f5856e;
            ArrayList arrayList = this.f5861k;
            List list = this.f5862l;
            if (d9) {
                e eVar = this.f5866p;
                eVar.getClass();
                boolean z9 = eVar instanceof a;
                if ((!z9 || !r(arrayList.size() - 1)) && hVar.d(j, eVar, list)) {
                    m9.a();
                    if (z9) {
                        this.f5872v = (a) eVar;
                        return;
                    }
                    return;
                }
                return;
            }
            int f9 = hVar.f(j, list);
            if (f9 < arrayList.size()) {
                AbstractC1566a.m(!m9.d());
                int size = arrayList.size();
                while (true) {
                    if (f9 < size) {
                        if (!r(f9)) {
                            break;
                        } else {
                            f9++;
                        }
                    } else {
                        f9 = -1;
                        break;
                    }
                }
                if (f9 != -1) {
                    long j4 = n().f5845h;
                    a i9 = i(f9);
                    if (arrayList.isEmpty()) {
                        this.f5869s = this.f5870t;
                    }
                    this.f5873w = false;
                    G g9 = this.f5858g;
                    g9.n(new C0270v(1, this.f5852a, null, 3, null, g9.a(i9.f5844g), g9.a(j4)));
                }
            }
        }
    }

    public final void C(long j) {
        a aVar;
        boolean z9;
        boolean E8;
        this.f5870t = j;
        if (t()) {
            this.f5869s = j;
            return;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f5861k.size(); i10++) {
            aVar = (a) this.f5861k.get(i10);
            long j4 = aVar.f5844g;
            if (j4 == j && aVar.f5816k == -9223372036854775807L) {
                break;
            } else {
                if (j4 > j) {
                    break;
                }
            }
        }
        aVar = null;
        if (aVar != null) {
            c0 c0Var = this.f5863m;
            int e8 = aVar.e(0);
            synchronized (c0Var) {
                c0Var.C();
                int i11 = c0Var.f5069q;
                if (e8 >= i11 && e8 <= c0Var.f5068p + i11) {
                    c0Var.f5072t = Long.MIN_VALUE;
                    c0Var.f5071s = e8 - i11;
                    E8 = true;
                }
                E8 = false;
            }
        } else {
            c0 c0Var2 = this.f5863m;
            if (j < h()) {
                z9 = true;
            } else {
                z9 = false;
            }
            E8 = c0Var2.E(j, z9);
        }
        if (E8) {
            this.f5871u = v(this.f5863m.q(), 0);
            c0[] c0VarArr = this.f5864n;
            int length = c0VarArr.length;
            while (i9 < length) {
                c0VarArr[i9].E(j, true);
                i9++;
            }
            return;
        }
        this.f5869s = j;
        this.f5873w = false;
        this.f5861k.clear();
        this.f5871u = 0;
        if (this.f5860i.d()) {
            this.f5863m.i();
            c0[] c0VarArr2 = this.f5864n;
            int length2 = c0VarArr2.length;
            while (i9 < length2) {
                c0VarArr2[i9].i();
                i9++;
            }
            this.f5860i.a();
            return;
        }
        this.f5860i.f20007c = null;
        this.f5863m.B(false);
        for (c0 c0Var3 : this.f5864n) {
            c0Var3.B(false);
        }
    }

    @Override // N3.f0
    public final boolean a() {
        return this.f5860i.d();
    }

    @Override // N3.d0
    public final void b() {
        k4.M m9 = this.f5860i;
        m9.b();
        this.f5863m.w();
        if (!m9.d()) {
            this.f5856e.b();
        }
    }

    @Override // N3.d0
    public final int d(O0.c cVar, m3.f fVar, int i9) {
        if (!t()) {
            a aVar = this.f5872v;
            c0 c0Var = this.f5863m;
            if (aVar != null && aVar.e(0) <= c0Var.q()) {
                return -3;
            }
            u();
            return c0Var.z(cVar, fVar, i9, this.f5873w);
        }
        return -3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARN: Type inference failed for: r1v4, types: [N3.e0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, N3.q] */
    @Override // k4.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final B3.f e(k4.J r22, java.io.IOException r23, int r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            P3.e r1 = (P3.e) r1
            k4.V r2 = r1.f5846i
            long r2 = r2.f20033b
            boolean r4 = r1 instanceof P3.a
            java.util.ArrayList r5 = r0.f5861k
            int r6 = r5.size()
            r7 = 1
            int r6 = r6 - r7
            r8 = 0
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            r3 = 0
            if (r2 == 0) goto L26
            if (r4 == 0) goto L26
            boolean r2 = r0.r(r6)
            if (r2 != 0) goto L24
            goto L26
        L24:
            r2 = r3
            goto L27
        L26:
            r2 = r7
        L27:
            N3.q r9 = new N3.q
            k4.V r8 = r1.f5846i
            android.net.Uri r8 = r8.f20034c
            r9.<init>()
            long r10 = r1.f5844g
            l4.y.T(r10)
            long r10 = r1.f5845h
            l4.y.T(r10)
            A1.i r8 = new A1.i
            r10 = r23
            r11 = r24
            r8.<init>(r11, r10)
            P3.h r11 = r0.f5856e
            e1.q r12 = r0.f5859h
            boolean r11 = r11.h(r1, r2, r8, r12)
            r13 = 0
            if (r11 == 0) goto L71
            if (r2 == 0) goto L6a
            if (r4 == 0) goto L67
            P3.a r2 = r0.i(r6)
            if (r2 != r1) goto L59
            goto L5a
        L59:
            r7 = r3
        L5a:
            l4.AbstractC1566a.m(r7)
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L67
            long r4 = r0.f5870t
            r0.f5869s = r4
        L67:
            B3.f r2 = k4.M.f20003e
            goto L72
        L6a:
            java.lang.String r2 = "ChunkSampleStream"
            java.lang.String r4 = "Ignoring attempt to cancel non-cancelable load."
            l4.AbstractC1566a.P(r2, r4)
        L71:
            r2 = r13
        L72:
            if (r2 != 0) goto L8d
            r12.getClass()
            long r4 = e1.q.h(r8)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L8b
            B3.f r2 = new B3.f
            r6 = 0
            r2.<init>(r3, r4, r6)
            goto L8d
        L8b:
            B3.f r2 = k4.M.f20004f
        L8d:
            boolean r3 = r2.a()
            r20 = r3 ^ 1
            N3.G r8 = r0.f5858g
            long r4 = r1.f5844g
            long r6 = r1.f5845h
            int r10 = r1.f5840c
            int r11 = r0.f5852a
            r14 = r12
            j3.M r12 = r1.f5841d
            r15 = r13
            int r13 = r1.f5842e
            java.lang.Object r1 = r1.f5843f
            r16 = r14
            r14 = r1
            r1 = r16
            r17 = r4
            r4 = r15
            r15 = r17
            r19 = r23
            r17 = r6
            r8.i(r9, r10, r11, r12, r13, r14, r15, r17, r19, r20)
            if (r3 != 0) goto Lc2
            r0.f5866p = r4
            r1.getClass()
            java.lang.Object r1 = r0.f5857f
            r1.v(r0)
        Lc2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: P3.g.e(k4.J, java.io.IOException, int):B3.f");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [N3.e0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, N3.q] */
    @Override // k4.H
    public final void f(J j, long j4, long j9) {
        e eVar = (e) j;
        this.f5866p = null;
        this.f5856e.e(eVar);
        long j10 = eVar.f5838a;
        Uri uri = eVar.f5846i.f20034c;
        ?? obj = new Object();
        this.f5859h.getClass();
        this.f5858g.g(obj, eVar.f5840c, this.f5852a, eVar.f5841d, eVar.f5842e, eVar.f5843f, eVar.f5844g, eVar.f5845h);
        this.f5857f.v(this);
    }

    @Override // k4.K
    public final void g() {
        this.f5863m.A();
        for (c0 c0Var : this.f5864n) {
            c0Var.A();
        }
        this.f5856e.a();
        Q3.b bVar = this.f5868r;
        if (bVar != null) {
            synchronized (bVar) {
                o oVar = (o) bVar.f6335n.remove(this);
                if (oVar != null) {
                    oVar.f6422a.A();
                }
            }
        }
    }

    @Override // N3.f0
    public final long h() {
        if (t()) {
            return this.f5869s;
        }
        if (this.f5873w) {
            return Long.MIN_VALUE;
        }
        return n().f5845h;
    }

    public final a i(int i9) {
        ArrayList arrayList = this.f5861k;
        a aVar = (a) arrayList.get(i9);
        y.N(arrayList, i9, arrayList.size());
        this.f5871u = Math.max(this.f5871u, arrayList.size());
        int i10 = 0;
        this.f5863m.k(aVar.e(0));
        while (true) {
            c0[] c0VarArr = this.f5864n;
            if (i10 < c0VarArr.length) {
                c0 c0Var = c0VarArr[i10];
                i10++;
                c0Var.k(aVar.e(i10));
            } else {
                return aVar;
            }
        }
    }

    @Override // N3.d0
    public final boolean j() {
        if (!t() && this.f5863m.u(this.f5873w)) {
            return true;
        }
        return false;
    }

    @Override // N3.d0
    public final int m(long j) {
        if (t()) {
            return 0;
        }
        c0 c0Var = this.f5863m;
        int s9 = c0Var.s(j, this.f5873w);
        a aVar = this.f5872v;
        if (aVar != null) {
            s9 = Math.min(s9, aVar.e(0) - c0Var.q());
        }
        c0Var.F(s9);
        u();
        return s9;
    }

    public final a n() {
        return (a) this.f5861k.get(r0.size() - 1);
    }

    @Override // N3.f0
    public final long p() {
        if (this.f5873w) {
            return Long.MIN_VALUE;
        }
        if (t()) {
            return this.f5869s;
        }
        long j = this.f5870t;
        a n7 = n();
        if (!n7.d()) {
            ArrayList arrayList = this.f5861k;
            if (arrayList.size() > 1) {
                n7 = (a) arrayList.get(arrayList.size() - 2);
            } else {
                n7 = null;
            }
        }
        if (n7 != null) {
            j = Math.max(j, n7.f5845h);
        }
        return Math.max(j, this.f5863m.n());
    }

    public final boolean r(int i9) {
        int q9;
        a aVar = (a) this.f5861k.get(i9);
        if (this.f5863m.q() > aVar.e(0)) {
            return true;
        }
        int i10 = 0;
        do {
            c0[] c0VarArr = this.f5864n;
            if (i10 >= c0VarArr.length) {
                return false;
            }
            q9 = c0VarArr[i10].q();
            i10++;
        } while (q9 <= aVar.e(i10));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v5, types: [N3.e0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, N3.q] */
    @Override // k4.H
    public final void s(J j, long j4, long j9, boolean z9) {
        e eVar = (e) j;
        this.f5866p = null;
        this.f5872v = null;
        long j10 = eVar.f5838a;
        Uri uri = eVar.f5846i.f20034c;
        ?? obj = new Object();
        this.f5859h.getClass();
        this.f5858g.d(obj, eVar.f5840c, this.f5852a, eVar.f5841d, eVar.f5842e, eVar.f5843f, eVar.f5844g, eVar.f5845h);
        if (!z9) {
            if (t()) {
                this.f5863m.B(false);
                for (c0 c0Var : this.f5864n) {
                    c0Var.B(false);
                }
            } else if (eVar instanceof a) {
                ArrayList arrayList = this.f5861k;
                i(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.f5869s = this.f5870t;
                }
            }
            this.f5857f.v(this);
        }
    }

    public final boolean t() {
        if (this.f5869s != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void u() {
        int v8 = v(this.f5863m.q(), this.f5871u - 1);
        while (true) {
            int i9 = this.f5871u;
            if (i9 <= v8) {
                this.f5871u = i9 + 1;
                a aVar = (a) this.f5861k.get(i9);
                M m9 = aVar.f5841d;
                if (!m9.equals(this.f5867q)) {
                    this.f5858g.b(this.f5852a, m9, aVar.f5842e, aVar.f5843f, aVar.f5844g);
                }
                this.f5867q = m9;
            } else {
                return;
            }
        }
    }

    public final int v(int i9, int i10) {
        ArrayList arrayList;
        do {
            i10++;
            arrayList = this.f5861k;
            if (i10 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i10)).e(0) <= i9);
        return i10 - 1;
    }

    public final void x(long j) {
        long j4;
        if (!t()) {
            c0 c0Var = this.f5863m;
            int i9 = c0Var.f5069q;
            c0Var.h(j, true);
            c0 c0Var2 = this.f5863m;
            int i10 = c0Var2.f5069q;
            if (i10 > i9) {
                synchronized (c0Var2) {
                    if (c0Var2.f5068p == 0) {
                        j4 = Long.MIN_VALUE;
                    } else {
                        j4 = c0Var2.f5066n[c0Var2.f5070r];
                    }
                }
                int i11 = 0;
                while (true) {
                    c0[] c0VarArr = this.f5864n;
                    if (i11 >= c0VarArr.length) {
                        break;
                    }
                    c0VarArr[i11].h(j4, this.f5855d[i11]);
                    i11++;
                }
            }
            int min = Math.min(v(i10, 0), this.f5871u);
            if (min > 0) {
                y.N(this.f5861k, 0, min);
                this.f5871u -= min;
            }
        }
    }

    @Override // N3.f0
    public final boolean z(long j) {
        long j4;
        List list;
        if (!this.f5873w) {
            k4.M m9 = this.f5860i;
            if (!m9.d() && !m9.c()) {
                boolean t7 = t();
                if (t7) {
                    list = Collections.EMPTY_LIST;
                    j4 = this.f5869s;
                } else {
                    j4 = n().f5845h;
                    list = this.f5862l;
                }
                this.f5856e.g(j, j4, list, this.j);
                A6.i iVar = this.j;
                boolean z9 = iVar.f508a;
                e eVar = (e) iVar.f509b;
                iVar.f509b = null;
                iVar.f508a = false;
                if (z9) {
                    this.f5869s = -9223372036854775807L;
                    this.f5873w = true;
                    return true;
                }
                if (eVar != null) {
                    this.f5866p = eVar;
                    boolean z10 = eVar instanceof a;
                    O0.c cVar = this.f5865o;
                    if (z10) {
                        a aVar = (a) eVar;
                        if (t7) {
                            long j9 = this.f5869s;
                            if (aVar.f5844g != j9) {
                                this.f5863m.f5072t = j9;
                                for (c0 c0Var : this.f5864n) {
                                    c0Var.f5072t = this.f5869s;
                                }
                            }
                            this.f5869s = -9223372036854775807L;
                        }
                        aVar.f5818m = cVar;
                        c0[] c0VarArr = (c0[]) cVar.f5264c;
                        int[] iArr = new int[c0VarArr.length];
                        for (int i9 = 0; i9 < c0VarArr.length; i9++) {
                            c0 c0Var2 = c0VarArr[i9];
                            iArr[i9] = c0Var2.f5069q + c0Var2.f5068p;
                        }
                        aVar.f5819n = iArr;
                        this.f5861k.add(aVar);
                    } else if (eVar instanceof j) {
                        ((j) eVar).f5880k = cVar;
                    }
                    m9.f(eVar, this, this.f5859h.f(eVar.f5840c));
                    this.f5858g.l(new C0266q(eVar.f5839b), eVar.f5840c, this.f5852a, eVar.f5841d, eVar.f5842e, eVar.f5843f, eVar.f5844g, eVar.f5845h);
                    return true;
                }
            }
        }
        return false;
    }
}
