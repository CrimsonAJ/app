package N3;

import android.net.Uri;
import android.os.Handler;
import j3.x0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k4.C1517q;
import k4.InterfaceC1513m;
import l1.C1535g;
import l4.AbstractC1566a;
import n3.C1635l;
import n3.InterfaceC1638o;
import q3.InterfaceC1905j;
import q3.InterfaceC1907l;

/* loaded from: classes.dex */
public final class T implements InterfaceC0272x, InterfaceC1907l, k4.H, k4.K, b0 {

    /* renamed from: j0, reason: collision with root package name */
    public static final Map f4967j0;

    /* renamed from: k0, reason: collision with root package name */
    public static final j3.M f4968k0;

    /* renamed from: B, reason: collision with root package name */
    public boolean f4970B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f4971C;

    /* renamed from: D, reason: collision with root package name */
    public int f4972D;

    /* renamed from: X, reason: collision with root package name */
    public boolean f4973X;
    public long Y;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f4975a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1513m f4976b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1638o f4977c;

    /* renamed from: d, reason: collision with root package name */
    public final e1.q f4978d;

    /* renamed from: e, reason: collision with root package name */
    public final G f4979e;

    /* renamed from: f, reason: collision with root package name */
    public final C1635l f4980f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f4981f0;

    /* renamed from: g, reason: collision with root package name */
    public final W f4982g;

    /* renamed from: g0, reason: collision with root package name */
    public int f4983g0;

    /* renamed from: h, reason: collision with root package name */
    public final C1517q f4984h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f4985h0;

    /* renamed from: i, reason: collision with root package name */
    public final long f4986i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f4987i0;

    /* renamed from: k, reason: collision with root package name */
    public final android.support.v4.media.session.y f4988k;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC0271w f4993p;

    /* renamed from: q, reason: collision with root package name */
    public H3.c f4994q;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4997t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4998u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4999v;

    /* renamed from: w, reason: collision with root package name */
    public C1535g f5000w;

    /* renamed from: x, reason: collision with root package name */
    public q3.r f5001x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f5003z;
    public final k4.M j = new k4.M("ProgressiveMediaPeriod");

    /* renamed from: l, reason: collision with root package name */
    public final H1.k f4989l = new Object();

    /* renamed from: m, reason: collision with root package name */
    public final O f4990m = new O(this, 0);

    /* renamed from: n, reason: collision with root package name */
    public final O f4991n = new O(this, 1);

    /* renamed from: o, reason: collision with root package name */
    public final Handler f4992o = l4.y.l(null);

    /* renamed from: s, reason: collision with root package name */
    public S[] f4996s = new S[0];

    /* renamed from: r, reason: collision with root package name */
    public c0[] f4995r = new c0[0];

    /* renamed from: Z, reason: collision with root package name */
    public long f4974Z = -9223372036854775807L;

    /* renamed from: y, reason: collision with root package name */
    public long f5002y = -9223372036854775807L;

    /* renamed from: A, reason: collision with root package name */
    public int f4969A = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f4967j0 = Collections.unmodifiableMap(hashMap);
        j3.L l9 = new j3.L();
        l9.f19393a = "icy";
        l9.f19402k = "application/x-icy";
        f4968k0 = new j3.M(l9);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [H1.k, java.lang.Object] */
    public T(Uri uri, InterfaceC1513m interfaceC1513m, android.support.v4.media.session.y yVar, InterfaceC1638o interfaceC1638o, C1635l c1635l, e1.q qVar, G g9, W w7, C1517q c1517q, int i9) {
        this.f4975a = uri;
        this.f4976b = interfaceC1513m;
        this.f4977c = interfaceC1638o;
        this.f4980f = c1635l;
        this.f4978d = qVar;
        this.f4979e = g9;
        this.f4982g = w7;
        this.f4984h = c1517q;
        this.f4986i = i9;
        this.f4988k = yVar;
    }

    @Override // N3.b0
    public final void A() {
        this.f4992o.post(this.f4990m);
    }

    public final c0 C(S s9) {
        int length = this.f4995r.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (s9.equals(this.f4996s[i9])) {
                return this.f4995r[i9];
            }
        }
        C1635l c1635l = this.f4980f;
        InterfaceC1638o interfaceC1638o = this.f4977c;
        interfaceC1638o.getClass();
        c0 c0Var = new c0(this.f4984h, interfaceC1638o, c1635l);
        c0Var.f5059f = this;
        int i10 = length + 1;
        S[] sArr = (S[]) Arrays.copyOf(this.f4996s, i10);
        sArr[length] = s9;
        int i11 = l4.y.f20553a;
        this.f4996s = sArr;
        c0[] c0VarArr = (c0[]) Arrays.copyOf(this.f4995r, i10);
        c0VarArr[length] = c0Var;
        this.f4995r = c0VarArr;
        return c0Var;
    }

    public final void D() {
        P p9 = new P(this, this.f4975a, this.f4976b, this.f4988k, this, this.f4989l);
        if (this.f4998u) {
            AbstractC1566a.m(m());
            long j = this.f5002y;
            if (j != -9223372036854775807L && this.f4974Z > j) {
                this.f4985h0 = true;
                this.f4974Z = -9223372036854775807L;
                return;
            }
            q3.r rVar = this.f5001x;
            rVar.getClass();
            long j4 = rVar.g(this.f4974Z).f22342a.f22346b;
            long j9 = this.f4974Z;
            p9.f4956f.f11723a = j4;
            p9.f4959i = j9;
            p9.f4958h = true;
            p9.f4961l = false;
            for (c0 c0Var : this.f4995r) {
                c0Var.f5072t = this.f4974Z;
            }
            this.f4974Z = -9223372036854775807L;
        }
        this.f4983g0 = d();
        this.j.f(p9, this, this.f4978d.f(this.f4969A));
        this.f4979e.l(new C0266q(p9.j), 1, -1, null, 0, null, p9.f4959i, this.f5002y);
    }

    public final boolean E() {
        if (!this.f4971C && !m()) {
            return false;
        }
        return true;
    }

    @Override // N3.f0
    public final boolean a() {
        boolean z9;
        if (this.j.d()) {
            H1.k kVar = this.f4989l;
            synchronized (kVar) {
                z9 = kVar.f2964a;
            }
            if (z9) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void b() {
        AbstractC1566a.m(this.f4998u);
        this.f5000w.getClass();
        this.f5001x.getClass();
    }

    @Override // N3.InterfaceC0272x
    public final long c(long j, x0 x0Var) {
        b();
        if (!this.f5001x.e()) {
            return 0L;
        }
        q3.q g9 = this.f5001x.g(j);
        return x0Var.a(j, g9.f22342a.f22345a, g9.f22343b.f22345a);
    }

    public final int d() {
        int i9 = 0;
        for (c0 c0Var : this.f4995r) {
            i9 += c0Var.f5069q + c0Var.f5068p;
        }
        return i9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, N3.q] */
    @Override // k4.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final B3.f e(k4.J r15, java.io.IOException r16, int r17) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.T.e(k4.J, java.io.IOException, int):B3.f");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, N3.q] */
    @Override // k4.H
    public final void f(k4.J j, long j4, long j9) {
        q3.r rVar;
        long j10;
        P p9 = (P) j;
        if (this.f5002y == -9223372036854775807L && (rVar = this.f5001x) != null) {
            boolean e8 = rVar.e();
            long j11 = j(true);
            if (j11 == Long.MIN_VALUE) {
                j10 = 0;
            } else {
                j10 = j11 + 10000;
            }
            this.f5002y = j10;
            this.f4982g.w(j10, e8, this.f5003z);
        }
        Uri uri = p9.f4952b.f20034c;
        ?? obj = new Object();
        this.f4978d.getClass();
        this.f4979e.g(obj, 1, -1, null, 0, null, p9.f4959i, this.f5002y);
        this.f4985h0 = true;
        InterfaceC0271w interfaceC0271w = this.f4993p;
        interfaceC0271w.getClass();
        interfaceC0271w.v(this);
    }

    @Override // k4.K
    public final void g() {
        for (c0 c0Var : this.f4995r) {
            c0Var.A();
        }
        android.support.v4.media.session.y yVar = this.f4988k;
        InterfaceC1905j interfaceC1905j = (InterfaceC1905j) yVar.f9332c;
        if (interfaceC1905j != null) {
            interfaceC1905j.a();
            yVar.f9332c = null;
        }
        yVar.f9333d = null;
    }

    @Override // N3.f0
    public final long h() {
        return p();
    }

    @Override // q3.InterfaceC1907l
    public final void i() {
        this.f4997t = true;
        this.f4992o.post(this.f4990m);
    }

    public final long j(boolean z9) {
        long j = Long.MIN_VALUE;
        for (int i9 = 0; i9 < this.f4995r.length; i9++) {
            if (!z9) {
                C1535g c1535g = this.f5000w;
                c1535g.getClass();
                if (!((boolean[]) c1535g.f20184c)[i9]) {
                }
            }
            j = Math.max(j, this.f4995r[i9].n());
        }
        return j;
    }

    @Override // N3.InterfaceC0272x
    public final long k() {
        if (this.f4971C) {
            if (this.f4985h0 || d() > this.f4983g0) {
                this.f4971C = false;
                return this.Y;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // N3.InterfaceC0272x
    public final n0 l() {
        b();
        return (n0) this.f5000w.f20182a;
    }

    public final boolean m() {
        if (this.f4974Z != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, l1.g] */
    public final void n() {
        boolean z9;
        D3.c cVar;
        int i9;
        if (!this.f4987i0 && !this.f4998u && this.f4997t && this.f5001x != null) {
            for (c0 c0Var : this.f4995r) {
                if (c0Var.t() == null) {
                    return;
                }
            }
            this.f4989l.c();
            int length = this.f4995r.length;
            m0[] m0VarArr = new m0[length];
            boolean[] zArr = new boolean[length];
            for (int i10 = 0; i10 < length; i10++) {
                j3.M t7 = this.f4995r[i10].t();
                t7.getClass();
                String str = t7.f19435l;
                boolean j = l4.n.j(str);
                if (!j && !l4.n.l(str)) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                zArr[i10] = z9;
                this.f4999v = z9 | this.f4999v;
                H3.c cVar2 = this.f4994q;
                if (cVar2 != null) {
                    if (j || this.f4996s[i10].f4966b) {
                        D3.c cVar3 = t7.j;
                        if (cVar3 == null) {
                            cVar = new D3.c(cVar2);
                        } else {
                            int i11 = l4.y.f20553a;
                            D3.b[] bVarArr = cVar3.f1786a;
                            Object[] copyOf = Arrays.copyOf(bVarArr, bVarArr.length + 1);
                            System.arraycopy(new D3.b[]{cVar2}, 0, copyOf, bVarArr.length, 1);
                            cVar = new D3.c(cVar3.f1787b, (D3.b[]) copyOf);
                        }
                        j3.L a5 = t7.a();
                        a5.f19401i = cVar;
                        t7 = new j3.M(a5);
                    }
                    if (j && t7.f19430f == -1 && t7.f19431g == -1 && (i9 = cVar2.f3099a) != -1) {
                        j3.L a9 = t7.a();
                        a9.f19398f = i9;
                        t7 = new j3.M(a9);
                    }
                }
                int h7 = this.f4977c.h(t7);
                j3.L a10 = t7.a();
                a10.f19392D = h7;
                m0VarArr[i10] = new m0(Integer.toString(i10), new j3.M(a10));
            }
            n0 n0Var = new n0(m0VarArr);
            ?? obj = new Object();
            obj.f20182a = n0Var;
            obj.f20183b = zArr;
            int i12 = n0Var.f5170a;
            obj.f20184c = new boolean[i12];
            obj.f20185d = new boolean[i12];
            this.f5000w = obj;
            this.f4998u = true;
            InterfaceC0271w interfaceC0271w = this.f4993p;
            interfaceC0271w.getClass();
            interfaceC0271w.C(this);
        }
    }

    @Override // N3.InterfaceC0272x
    public final void o(InterfaceC0271w interfaceC0271w, long j) {
        this.f4993p = interfaceC0271w;
        this.f4989l.d();
        D();
    }

    @Override // N3.f0
    public final long p() {
        long j;
        boolean z9;
        b();
        if (this.f4985h0 || this.f4972D == 0) {
            return Long.MIN_VALUE;
        }
        if (m()) {
            return this.f4974Z;
        }
        if (this.f4999v) {
            int length = this.f4995r.length;
            j = Long.MAX_VALUE;
            for (int i9 = 0; i9 < length; i9++) {
                C1535g c1535g = this.f5000w;
                if (((boolean[]) c1535g.f20183b)[i9] && ((boolean[]) c1535g.f20184c)[i9]) {
                    c0 c0Var = this.f4995r[i9];
                    synchronized (c0Var) {
                        z9 = c0Var.f5075w;
                    }
                    if (!z9) {
                        j = Math.min(j, this.f4995r[i9].n());
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = j(false);
        }
        if (j == Long.MIN_VALUE) {
            return this.Y;
        }
        return j;
    }

    @Override // N3.InterfaceC0272x
    public final void q() {
        int f9 = this.f4978d.f(this.f4969A);
        k4.M m9 = this.j;
        IOException iOException = m9.f20007c;
        if (iOException == null) {
            k4.I i9 = m9.f20006b;
            if (i9 != null) {
                if (f9 == Integer.MIN_VALUE) {
                    f9 = i9.f19993a;
                }
                IOException iOException2 = i9.f19997e;
                if (iOException2 != null && i9.f19998f > f9) {
                    throw iOException2;
                }
            }
            if (this.f4985h0 && !this.f4998u) {
                throw j3.j0.a("Loading finished before preparation is complete.", null);
            }
            return;
        }
        throw iOException;
    }

    @Override // q3.InterfaceC1907l
    public final void r(q3.r rVar) {
        this.f4992o.post(new A6.r(this, 5, rVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, N3.q] */
    @Override // k4.H
    public final void s(k4.J j, long j4, long j9, boolean z9) {
        P p9 = (P) j;
        Uri uri = p9.f4952b.f20034c;
        ?? obj = new Object();
        this.f4978d.getClass();
        this.f4979e.d(obj, 1, -1, null, 0, null, p9.f4959i, this.f5002y);
        if (!z9) {
            for (c0 c0Var : this.f4995r) {
                c0Var.B(false);
            }
            if (this.f4972D > 0) {
                InterfaceC0271w interfaceC0271w = this.f4993p;
                interfaceC0271w.getClass();
                interfaceC0271w.v(this);
            }
        }
    }

    public final void t(int i9) {
        b();
        C1535g c1535g = this.f5000w;
        boolean[] zArr = (boolean[]) c1535g.f20185d;
        if (!zArr[i9]) {
            j3.M m9 = ((n0) c1535g.f20182a).a(i9).f5167d[0];
            this.f4979e.b(l4.n.h(m9.f19435l), m9, 0, null, this.Y);
            zArr[i9] = true;
        }
    }

    @Override // q3.InterfaceC1907l
    public final q3.u u(int i9, int i10) {
        return C(new S(i9, false));
    }

    public final void v(int i9) {
        b();
        boolean[] zArr = (boolean[]) this.f5000w.f20183b;
        if (this.f4981f0 && zArr[i9] && !this.f4995r[i9].u(false)) {
            this.f4974Z = 0L;
            this.f4981f0 = false;
            this.f4971C = true;
            this.Y = 0L;
            this.f4983g0 = 0;
            for (c0 c0Var : this.f4995r) {
                c0Var.B(false);
            }
            InterfaceC0271w interfaceC0271w = this.f4993p;
            interfaceC0271w.getClass();
            interfaceC0271w.v(this);
        }
    }

    @Override // N3.InterfaceC0272x
    public final long w(long j) {
        b();
        boolean[] zArr = (boolean[]) this.f5000w.f20183b;
        if (!this.f5001x.e()) {
            j = 0;
        }
        this.f4971C = false;
        this.Y = j;
        if (m()) {
            this.f4974Z = j;
            return j;
        }
        if (this.f4969A != 7) {
            int length = this.f4995r.length;
            for (int i9 = 0; i9 < length; i9++) {
                if (this.f4995r[i9].E(j, false) || (!zArr[i9] && this.f4999v)) {
                }
            }
            return j;
        }
        this.f4981f0 = false;
        this.f4974Z = j;
        this.f4985h0 = false;
        k4.M m9 = this.j;
        if (m9.d()) {
            for (c0 c0Var : this.f4995r) {
                c0Var.i();
            }
            m9.a();
            return j;
        }
        m9.f20007c = null;
        for (c0 c0Var2 : this.f4995r) {
            c0Var2.B(false);
        }
        return j;
    }

    @Override // N3.InterfaceC0272x
    public final void x(long j) {
        b();
        if (!m()) {
            boolean[] zArr = (boolean[]) this.f5000w.f20184c;
            int length = this.f4995r.length;
            for (int i9 = 0; i9 < length; i9++) {
                this.f4995r[i9].h(j, zArr[i9]);
            }
        }
    }

    @Override // N3.InterfaceC0272x
    public final long y(i4.q[] qVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j) {
        boolean z9;
        i4.q qVar;
        boolean z10;
        boolean z11;
        b();
        C1535g c1535g = this.f5000w;
        n0 n0Var = (n0) c1535g.f20182a;
        boolean[] zArr3 = (boolean[]) c1535g.f20184c;
        int i9 = this.f4972D;
        int i10 = 0;
        for (int i11 = 0; i11 < qVarArr.length; i11++) {
            d0 d0Var = d0VarArr[i11];
            if (d0Var != null && (qVarArr[i11] == null || !zArr[i11])) {
                int i12 = ((Q) d0Var).f4963a;
                AbstractC1566a.m(zArr3[i12]);
                this.f4972D--;
                zArr3[i12] = false;
                d0VarArr[i11] = null;
            }
        }
        if (!this.f4970B ? j != 0 : i9 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        for (int i13 = 0; i13 < qVarArr.length; i13++) {
            if (d0VarArr[i13] == null && (qVar = qVarArr[i13]) != null) {
                if (qVar.length() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                AbstractC1566a.m(z10);
                if (qVar.e(0) == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AbstractC1566a.m(z11);
                int b9 = n0Var.b(qVar.l());
                AbstractC1566a.m(!zArr3[b9]);
                this.f4972D++;
                zArr3[b9] = true;
                d0VarArr[i13] = new Q(this, b9);
                zArr2[i13] = true;
                if (!z9) {
                    c0 c0Var = this.f4995r[b9];
                    if (!c0Var.E(j, true) && c0Var.q() != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                }
            }
        }
        if (this.f4972D == 0) {
            this.f4981f0 = false;
            this.f4971C = false;
            k4.M m9 = this.j;
            if (m9.d()) {
                c0[] c0VarArr = this.f4995r;
                int length = c0VarArr.length;
                while (i10 < length) {
                    c0VarArr[i10].i();
                    i10++;
                }
                m9.a();
            } else {
                for (c0 c0Var2 : this.f4995r) {
                    c0Var2.B(false);
                }
            }
        } else if (z9) {
            j = w(j);
            while (i10 < d0VarArr.length) {
                if (d0VarArr[i10] != null) {
                    zArr2[i10] = true;
                }
                i10++;
            }
        }
        this.f4970B = true;
        return j;
    }

    @Override // N3.f0
    public final boolean z(long j) {
        if (!this.f4985h0) {
            k4.M m9 = this.j;
            if (!m9.c() && !this.f4981f0) {
                if (!this.f4998u || this.f4972D != 0) {
                    boolean d9 = this.f4989l.d();
                    if (!m9.d()) {
                        D();
                        return true;
                    }
                    return d9;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // N3.f0
    public final void B(long j) {
    }
}
