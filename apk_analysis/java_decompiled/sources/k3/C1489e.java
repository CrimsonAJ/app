package k3;

import N3.A;
import N3.C0266q;
import N3.C0270v;
import N3.C0273y;
import N3.H;
import P5.D;
import P5.F;
import P5.S;
import P5.X;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import b6.C0693o;
import j2.C1435b;
import j3.C0;
import j3.C1441D;
import j3.C1446b0;
import j3.C1461l;
import j3.C1462m;
import j3.C1468t;
import j3.C1474z;
import j3.D0;
import j3.E0;
import j3.G0;
import j3.Y;
import j3.Z;
import j3.m0;
import j3.n0;
import j3.o0;
import j3.p0;
import j3.q0;
import java.io.IOException;
import java.util.List;
import l4.AbstractC1566a;
import l4.u;
import l4.w;
import l4.y;
import m4.v;
import n3.InterfaceC1636m;

/* renamed from: k3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1489e implements p0, H, InterfaceC1636m {

    /* renamed from: a, reason: collision with root package name */
    public final u f19928a;

    /* renamed from: b, reason: collision with root package name */
    public final C0 f19929b;

    /* renamed from: c, reason: collision with root package name */
    public final D0 f19930c;

    /* renamed from: d, reason: collision with root package name */
    public final C0693o f19931d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f19932e;

    /* renamed from: f, reason: collision with root package name */
    public l4.l f19933f;

    /* renamed from: g, reason: collision with root package name */
    public C1441D f19934g;

    /* renamed from: h, reason: collision with root package name */
    public w f19935h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19936i;

    /* JADX WARN: Type inference failed for: r0v2, types: [b6.o, java.lang.Object] */
    public C1489e(u uVar) {
        uVar.getClass();
        this.f19928a = uVar;
        int i9 = y.f20553a;
        Looper myLooper = Looper.myLooper();
        this.f19933f = new l4.l(myLooper == null ? Looper.getMainLooper() : myLooper, uVar, new Z(25));
        C0 c02 = new C0();
        this.f19929b = c02;
        this.f19930c = new D0();
        ?? obj = new Object();
        obj.f11382a = c02;
        D d9 = F.f5901b;
        obj.f11383b = S.f5926e;
        obj.f11384c = X.f5938g;
        this.f19931d = obj;
        this.f19932e = new SparseArray();
    }

    @Override // j3.p0
    public final void A(m0 m0Var) {
        T(O(), 12, new Z(11));
    }

    @Override // j3.p0
    public final void B(C1446b0 c1446b0) {
        T(O(), 14, new Z(10));
    }

    @Override // j3.p0
    public final void C(boolean z9) {
        T(O(), 9, new C1486b(29));
    }

    @Override // N3.H
    public final void D(int i9, A a5, C0266q c0266q, C0270v c0270v) {
        T(R(i9, a5), 1002, new C1486b(24));
    }

    @Override // j3.p0
    public final void E(int i9, q0 q0Var, q0 q0Var2) {
        if (i9 == 1) {
            this.f19936i = false;
        }
        C1441D c1441d = this.f19934g;
        c1441d.getClass();
        C0693o c0693o = this.f19931d;
        c0693o.f11385d = C0693o.h(c1441d, (F) c0693o.f11383b, (A) c0693o.f11386e, (C0) c0693o.f11382a);
        C1485a O8 = O();
        T(O8, 11, new C1468t(O8, i9, q0Var, q0Var2));
    }

    @Override // j3.p0
    public final void F(int i9, int i10) {
        T(S(), 24, new Z(17));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [N3.y, N3.A] */
    @Override // j3.p0
    public final void G(C1462m c1462m) {
        C1485a O8;
        C0273y c0273y;
        if ((c1462m instanceof C1462m) && (c0273y = c1462m.f19691h) != null) {
            O8 = P(new C0273y(c0273y));
        } else {
            O8 = O();
        }
        T(O8, 10, new C1435b(O8, c1462m, 9));
    }

    @Override // N3.H
    public final void H(int i9, A a5, C0270v c0270v) {
        C1485a R2 = R(i9, a5);
        T(R2, 1004, new N1.h(R2, 20, c0270v));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [N3.y, N3.A] */
    @Override // j3.p0
    public final void I(C1462m c1462m) {
        C1485a O8;
        C0273y c0273y;
        if ((c1462m instanceof C1462m) && (c0273y = c1462m.f19691h) != null) {
            O8 = P(new C0273y(c0273y));
        } else {
            O8 = O();
        }
        T(O8, 10, new C1486b(6));
    }

    @Override // N3.H
    public final void J(int i9, A a5, C0270v c0270v) {
        T(R(i9, a5), 1005, new C1486b(10));
    }

    @Override // j3.p0
    public final void K(Y y9, int i9) {
        T(O(), 1, new Z(18));
    }

    @Override // n3.InterfaceC1636m
    public final void L(int i9, A a5) {
        T(R(i9, a5), 1023, new C1486b(22));
    }

    @Override // j3.p0
    public final void M(int i9, boolean z9) {
        T(O(), 30, new C1486b(17));
    }

    @Override // j3.p0
    public final void N(boolean z9) {
        T(O(), 7, new C1486b(26));
    }

    public final C1485a O() {
        return P((A) this.f19931d.f11385d);
    }

    public final C1485a P(A a5) {
        E0 e02;
        this.f19934g.getClass();
        if (a5 == null) {
            e02 = null;
        } else {
            e02 = (E0) ((X) this.f19931d.f11384c).get(a5);
        }
        if (a5 != null && e02 != null) {
            return Q(e02, e02.g(a5.f5207a, this.f19929b).f19237c, a5);
        }
        int z9 = this.f19934g.z();
        E0 I4 = this.f19934g.I();
        if (z9 >= I4.o()) {
            I4 = E0.f19320a;
        }
        return Q(I4, z9, null);
    }

    public final C1485a Q(E0 e02, int i9, A a5) {
        A a9;
        boolean z9;
        if (e02.p()) {
            a9 = null;
        } else {
            a9 = a5;
        }
        this.f19928a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (e02.equals(this.f19934g.I()) && i9 == this.f19934g.z()) {
            z9 = true;
        } else {
            z9 = false;
        }
        long j = 0;
        if (a9 != null && a9.a()) {
            if (z9 && this.f19934g.r0() == a9.f5208b && this.f19934g.s0() == a9.f5209c) {
                j = this.f19934g.T();
            }
        } else if (z9) {
            j = this.f19934g.k();
        } else if (!e02.p()) {
            j = y.T(e02.m(i9, this.f19930c, 0L).f19314m);
        }
        A a10 = (A) this.f19931d.f11385d;
        E0 I4 = this.f19934g.I();
        int z10 = this.f19934g.z();
        long T8 = this.f19934g.T();
        C1441D c1441d = this.f19934g;
        c1441d.M0();
        return new C1485a(elapsedRealtime, e02, i9, a9, j, I4, z10, a10, T8, y.T(c1441d.f19251F0.f19682q));
    }

    public final C1485a R(int i9, A a5) {
        this.f19934g.getClass();
        E0 e02 = E0.f19320a;
        if (a5 != null) {
            if (((E0) ((X) this.f19931d.f11384c).get(a5)) != null) {
                return P(a5);
            }
            return Q(e02, i9, a5);
        }
        E0 I4 = this.f19934g.I();
        if (i9 < I4.o()) {
            e02 = I4;
        }
        return Q(e02, i9, null);
    }

    public final C1485a S() {
        return P((A) this.f19931d.f11387f);
    }

    public final void T(C1485a c1485a, int i9, l4.i iVar) {
        this.f19932e.put(i9, c1485a);
        this.f19933f.e(i9, iVar);
    }

    public final void U(C1441D c1441d, Looper looper) {
        boolean z9;
        if (this.f19934g != null && !((F) this.f19931d.f11383b).isEmpty()) {
            z9 = false;
        } else {
            z9 = true;
        }
        AbstractC1566a.m(z9);
        c1441d.getClass();
        this.f19934g = c1441d;
        this.f19935h = this.f19928a.a(looper, null);
        l4.l lVar = this.f19933f;
        this.f19933f = new l4.l(lVar.f20507d, looper, lVar.f20504a, new N1.h(this, 19, c1441d));
    }

    @Override // j3.p0
    public final void a(int i9) {
        T(O(), 6, new C1486b(7));
    }

    @Override // j3.p0
    public final void b(int i9) {
        C1441D c1441d = this.f19934g;
        c1441d.getClass();
        C0693o c0693o = this.f19931d;
        c0693o.f11385d = C0693o.h(c1441d, (F) c0693o.f11383b, (A) c0693o.f11386e, (C0) c0693o.f11382a);
        c0693o.o(c1441d.I());
        T(O(), 0, new C1486b(13));
    }

    @Override // N3.H
    public final void c(int i9, A a5, C0266q c0266q, C0270v c0270v) {
        T(R(i9, a5), 1000, new C1486b(5));
    }

    @Override // j3.p0
    public final void d(n0 n0Var) {
        T(O(), 13, new Z(20));
    }

    @Override // N3.H
    public final void e(int i9, A a5, C0266q c0266q, C0270v c0270v) {
        T(R(i9, a5), 1001, new Z(12));
    }

    @Override // j3.p0
    public final void f(C1461l c1461l) {
        T(O(), 29, new C1486b(16));
    }

    @Override // j3.p0
    public final void g(v vVar) {
        C1485a S8 = S();
        T(S8, 25, new C1474z(S8, vVar));
    }

    @Override // N3.H
    public final void h(int i9, A a5, C0266q c0266q, C0270v c0270v, IOException iOException, boolean z9) {
        C1485a R2 = R(i9, a5);
        T(R2, 1003, new C1435b(R2, c0266q, c0270v, iOException, z9));
    }

    @Override // j3.p0
    public final void i(int i9) {
        T(O(), 8, new Z(29));
    }

    @Override // n3.InterfaceC1636m
    public final void j(int i9, A a5) {
        T(R(i9, a5), 1027, new C1486b(1));
    }

    @Override // j3.p0
    public final void k(boolean z9) {
        T(O(), 3, new C1486b(15));
    }

    @Override // j3.p0
    public final void m() {
        T(O(), -1, new Z(15));
    }

    @Override // j3.p0
    public final void n(boolean z9) {
        T(S(), 23, new C1486b(25));
    }

    @Override // j3.p0
    public final void o(List list) {
        T(O(), 27, new C1486b(2));
    }

    @Override // n3.InterfaceC1636m
    public final void p(int i9, A a5, Exception exc) {
        T(R(i9, a5), 1024, new C1486b(11));
    }

    @Override // j3.p0
    public final void q(int i9, boolean z9) {
        T(O(), -1, new Z(13));
    }

    @Override // j3.p0
    public final void r(i4.v vVar) {
        T(O(), 19, new Z(26));
    }

    @Override // j3.p0
    public final void s(int i9, boolean z9) {
        T(O(), 5, new Z(16));
    }

    @Override // j3.p0
    public final void t(D3.c cVar) {
        T(O(), 28, new C1486b(18));
    }

    @Override // n3.InterfaceC1636m
    public final void u(int i9, A a5) {
        T(R(i9, a5), 1025, new C1486b(23));
    }

    @Override // j3.p0
    public final void v(G0 g02) {
        T(O(), 2, new C1486b(3));
    }

    @Override // j3.p0
    public final void w(int i9) {
        T(O(), 4, new Z(23));
    }

    @Override // n3.InterfaceC1636m
    public final void x(int i9, A a5, int i10) {
        T(R(i9, a5), 1022, new C1486b(14));
    }

    @Override // j3.p0
    public final void y(Y3.c cVar) {
        T(O(), 27, new Z(19));
    }

    @Override // j3.p0
    public final void l() {
    }

    @Override // j3.p0
    public final void z(o0 o0Var) {
    }
}
