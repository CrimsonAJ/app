package W3;

import F5.e;
import N3.G;
import N3.InterfaceC0271w;
import N3.InterfaceC0272x;
import N3.d0;
import N3.e0;
import N3.f0;
import N3.m0;
import N3.n0;
import P3.g;
import b7.C0701c;
import e1.q;
import j3.L;
import j3.M;
import j3.x0;
import java.util.ArrayList;
import k4.C1517q;
import k4.InterfaceC1512l;
import k4.InterfaceC1513m;
import k4.N;
import k4.W;
import n3.C1635l;
import n3.InterfaceC1638o;
import s4.i;

/* loaded from: classes.dex */
public final class b implements InterfaceC0272x, e0 {

    /* renamed from: a, reason: collision with root package name */
    public final i f7894a;

    /* renamed from: b, reason: collision with root package name */
    public final W f7895b;

    /* renamed from: c, reason: collision with root package name */
    public final N f7896c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1638o f7897d;

    /* renamed from: e, reason: collision with root package name */
    public final C1635l f7898e;

    /* renamed from: f, reason: collision with root package name */
    public final q f7899f;

    /* renamed from: g, reason: collision with root package name */
    public final G f7900g;

    /* renamed from: h, reason: collision with root package name */
    public final C1517q f7901h;

    /* renamed from: i, reason: collision with root package name */
    public final n0 f7902i;
    public final e j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0271w f7903k;

    /* renamed from: l, reason: collision with root package name */
    public X3.c f7904l;

    /* renamed from: m, reason: collision with root package name */
    public g[] f7905m;

    /* renamed from: n, reason: collision with root package name */
    public C0701c f7906n;

    public b(X3.c cVar, i iVar, W w7, e eVar, InterfaceC1638o interfaceC1638o, C1635l c1635l, q qVar, G g9, N n7, C1517q c1517q) {
        this.f7904l = cVar;
        this.f7894a = iVar;
        this.f7895b = w7;
        this.f7896c = n7;
        this.f7897d = interfaceC1638o;
        this.f7898e = c1635l;
        this.f7899f = qVar;
        this.f7900g = g9;
        this.f7901h = c1517q;
        this.j = eVar;
        m0[] m0VarArr = new m0[cVar.f8436f.length];
        int i9 = 0;
        while (true) {
            X3.b[] bVarArr = cVar.f8436f;
            if (i9 < bVarArr.length) {
                M[] mArr = bVarArr[i9].j;
                M[] mArr2 = new M[mArr.length];
                for (int i10 = 0; i10 < mArr.length; i10++) {
                    M m9 = mArr[i10];
                    int h7 = interfaceC1638o.h(m9);
                    L a5 = m9.a();
                    a5.f19392D = h7;
                    mArr2[i10] = new M(a5);
                }
                m0VarArr[i9] = new m0(Integer.toString(i9), mArr2);
                i9++;
            } else {
                this.f7902i = new n0(m0VarArr);
                g[] gVarArr = new g[0];
                this.f7905m = gVarArr;
                eVar.getClass();
                this.f7906n = new C0701c(11, gVarArr);
                return;
            }
        }
    }

    @Override // N3.f0
    public final void B(long j) {
        this.f7906n.B(j);
    }

    @Override // N3.f0
    public final boolean a() {
        return this.f7906n.a();
    }

    @Override // N3.InterfaceC0272x
    public final long c(long j, x0 x0Var) {
        for (g gVar : this.f7905m) {
            if (gVar.f5852a == 2) {
                return gVar.f5856e.c(j, x0Var);
            }
        }
        return j;
    }

    @Override // N3.f0
    public final long h() {
        return this.f7906n.h();
    }

    @Override // N3.InterfaceC0272x
    public final long k() {
        return -9223372036854775807L;
    }

    @Override // N3.InterfaceC0272x
    public final n0 l() {
        return this.f7902i;
    }

    @Override // N3.InterfaceC0272x
    public final void o(InterfaceC0271w interfaceC0271w, long j) {
        this.f7903k = interfaceC0271w;
        interfaceC0271w.C(this);
    }

    @Override // N3.f0
    public final long p() {
        return this.f7906n.p();
    }

    @Override // N3.InterfaceC0272x
    public final void q() {
        this.f7896c.b();
    }

    @Override // N3.e0
    public final void v(f0 f0Var) {
        this.f7903k.v(this);
    }

    @Override // N3.InterfaceC0272x
    public final long w(long j) {
        for (g gVar : this.f7905m) {
            gVar.C(j);
        }
        return j;
    }

    @Override // N3.InterfaceC0272x
    public final void x(long j) {
        for (g gVar : this.f7905m) {
            gVar.x(j);
        }
    }

    @Override // N3.InterfaceC0272x
    public final long y(i4.q[] qVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j) {
        i4.q qVar;
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < qVarArr.length; i9++) {
            d0 d0Var = d0VarArr[i9];
            if (d0Var != null) {
                g gVar = (g) d0Var;
                i4.q qVar2 = qVarArr[i9];
                if (qVar2 != null && zArr[i9]) {
                    ((a) gVar.f5856e).f7890e = qVar2;
                    arrayList.add(gVar);
                } else {
                    gVar.A(null);
                    d0VarArr[i9] = null;
                }
            }
            if (d0VarArr[i9] == null && (qVar = qVarArr[i9]) != null) {
                int b9 = this.f7902i.b(qVar.l());
                X3.c cVar = this.f7904l;
                InterfaceC1513m c3 = ((InterfaceC1512l) this.f7894a.f22734a).c();
                W w7 = this.f7895b;
                if (w7 != null) {
                    c3.a(w7);
                }
                g gVar2 = new g(this.f7904l.f8436f[b9].f8416a, null, null, new a(this.f7896c, cVar, b9, qVar, c3), this, this.f7901h, j, this.f7897d, this.f7898e, this.f7899f, this.f7900g);
                arrayList.add(gVar2);
                d0VarArr[i9] = gVar2;
                zArr2[i9] = true;
            }
        }
        g[] gVarArr = new g[arrayList.size()];
        this.f7905m = gVarArr;
        arrayList.toArray(gVarArr);
        g[] gVarArr2 = this.f7905m;
        this.j.getClass();
        this.f7906n = new C0701c(11, gVarArr2);
        return j;
    }

    @Override // N3.f0
    public final boolean z(long j) {
        return this.f7906n.z(j);
    }
}
