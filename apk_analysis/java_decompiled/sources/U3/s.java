package U3;

import N3.InterfaceC0271w;
import N3.InterfaceC0272x;
import N3.M;
import N3.c0;
import N3.d0;
import N3.m0;
import N3.n0;
import P5.AbstractC0349q;
import P5.S;
import P5.X;
import android.net.Uri;
import android.os.Handler;
import b7.C0701c;
import j3.x0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.SocketFactory;
import k4.C1517q;
import l4.AbstractC1566a;
import z2.C2235a;

/* loaded from: classes.dex */
public final class s implements InterfaceC0272x {

    /* renamed from: a, reason: collision with root package name */
    public final C1517q f7436a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f7437b = l4.y.l(null);

    /* renamed from: c, reason: collision with root package name */
    public final s4.i f7438c;

    /* renamed from: d, reason: collision with root package name */
    public final n f7439d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f7440e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f7441f;

    /* renamed from: g, reason: collision with root package name */
    public final C0701c f7442g;

    /* renamed from: h, reason: collision with root package name */
    public final C2235a f7443h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC0271w f7444i;
    public S j;

    /* renamed from: k, reason: collision with root package name */
    public IOException f7445k;

    /* renamed from: l, reason: collision with root package name */
    public M f7446l;

    /* renamed from: m, reason: collision with root package name */
    public long f7447m;

    /* renamed from: n, reason: collision with root package name */
    public long f7448n;

    /* renamed from: o, reason: collision with root package name */
    public long f7449o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7450p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7451q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7452r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7453s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7454t;

    /* renamed from: u, reason: collision with root package name */
    public int f7455u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7456v;

    public s(C1517q c1517q, C2235a c2235a, Uri uri, C0701c c0701c, String str, SocketFactory socketFactory) {
        this.f7436a = c1517q;
        this.f7443h = c2235a;
        this.f7442g = c0701c;
        s4.i iVar = new s4.i(this);
        this.f7438c = iVar;
        this.f7439d = new n(iVar, iVar, str, uri, socketFactory);
        this.f7440e = new ArrayList();
        this.f7441f = new ArrayList();
        this.f7448n = -9223372036854775807L;
        this.f7447m = -9223372036854775807L;
        this.f7449o = -9223372036854775807L;
    }

    public static void b(s sVar) {
        if (!sVar.f7452r && !sVar.f7453s) {
            int i9 = 0;
            while (true) {
                ArrayList arrayList = sVar.f7440e;
                if (i9 < arrayList.size()) {
                    if (((r) arrayList.get(i9)).f7432c.t() != null) {
                        i9++;
                    } else {
                        return;
                    }
                } else {
                    sVar.f7453s = true;
                    P5.F o9 = P5.F.o(arrayList);
                    AbstractC0349q.c(4, "initialCapacity");
                    Object[] objArr = new Object[4];
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < o9.size()) {
                        c0 c0Var = ((r) o9.get(i10)).f7432c;
                        String num = Integer.toString(i10);
                        j3.M t7 = c0Var.t();
                        t7.getClass();
                        m0 m0Var = new m0(num, t7);
                        int i12 = i11 + 1;
                        if (objArr.length < i12) {
                            objArr = Arrays.copyOf(objArr, P5.C.e(objArr.length, i12));
                        }
                        objArr[i11] = m0Var;
                        i10++;
                        i11 = i12;
                    }
                    sVar.j = P5.F.k(i11, objArr);
                    InterfaceC0271w interfaceC0271w = sVar.f7444i;
                    interfaceC0271w.getClass();
                    interfaceC0271w.C(sVar);
                    return;
                }
            }
        }
    }

    @Override // N3.f0
    public final boolean a() {
        return !this.f7450p;
    }

    public final boolean d() {
        if (this.f7448n != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void e() {
        ArrayList arrayList;
        boolean z9;
        boolean z10 = true;
        int i9 = 0;
        while (true) {
            arrayList = this.f7441f;
            if (i9 >= arrayList.size()) {
                break;
            }
            if (((q) arrayList.get(i9)).f7428c != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            z10 &= z9;
            i9++;
        }
        if (z10 && this.f7454t) {
            n nVar = this.f7439d;
            nVar.f7410e.addAll(arrayList);
            nVar.g();
        }
    }

    @Override // N3.f0
    public final long h() {
        return p();
    }

    @Override // N3.InterfaceC0272x
    public final long k() {
        if (this.f7451q) {
            this.f7451q = false;
            return 0L;
        }
        return -9223372036854775807L;
    }

    @Override // N3.InterfaceC0272x
    public final n0 l() {
        AbstractC1566a.m(this.f7453s);
        S s9 = this.j;
        s9.getClass();
        return new n0((m0[]) s9.toArray(new m0[0]));
    }

    @Override // N3.InterfaceC0272x
    public final void o(InterfaceC0271w interfaceC0271w, long j) {
        n nVar = this.f7439d;
        this.f7444i = interfaceC0271w;
        try {
            nVar.getClass();
            try {
                nVar.f7414i.a(nVar.s(nVar.f7413h));
                Uri uri = nVar.f7413h;
                String str = nVar.f7415k;
                A3.E e8 = nVar.f7412g;
                e8.r(e8.j(4, str, X.f5938g, uri));
            } catch (IOException e9) {
                l4.y.g(nVar.f7414i);
                throw e9;
            }
        } catch (IOException e10) {
            this.f7445k = e10;
            l4.y.g(nVar);
        }
    }

    @Override // N3.f0
    public final long p() {
        if (!this.f7450p) {
            ArrayList arrayList = this.f7440e;
            if (!arrayList.isEmpty()) {
                long j = this.f7447m;
                if (j != -9223372036854775807L) {
                    return j;
                }
                boolean z9 = true;
                long j4 = Long.MAX_VALUE;
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    r rVar = (r) arrayList.get(i9);
                    if (!rVar.f7433d) {
                        j4 = Math.min(j4, rVar.f7432c.n());
                        z9 = false;
                    }
                }
                if (!z9 && j4 != Long.MIN_VALUE) {
                    return j4;
                }
                return 0L;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // N3.InterfaceC0272x
    public final void q() {
        IOException iOException = this.f7445k;
        if (iOException == null) {
        } else {
            throw iOException;
        }
    }

    @Override // N3.InterfaceC0272x
    public final long w(long j) {
        if (p() == 0 && !this.f7456v) {
            this.f7449o = j;
            return j;
        }
        x(j);
        this.f7447m = j;
        if (d()) {
            n nVar = this.f7439d;
            int i9 = nVar.f7418n;
            if (i9 != 1) {
                if (i9 == 2) {
                    this.f7448n = j;
                    nVar.x(j);
                    return j;
                }
                throw new IllegalStateException();
            }
        } else {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f7440e;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (!((r) arrayList.get(i10)).f7432c.E(j, false)) {
                    this.f7448n = j;
                    this.f7439d.x(j);
                    for (int i11 = 0; i11 < this.f7440e.size(); i11++) {
                        r rVar = (r) this.f7440e.get(i11);
                        if (!rVar.f7433d) {
                            C0400g c0400g = rVar.f7430a.f7427b.f7364g;
                            c0400g.getClass();
                            synchronized (c0400g.f7371e) {
                                c0400g.f7376k = true;
                            }
                            rVar.f7432c.B(false);
                            rVar.f7432c.f5072t = j;
                        }
                    }
                } else {
                    i10++;
                }
            }
        }
        return j;
    }

    @Override // N3.InterfaceC0272x
    public final void x(long j) {
        if (!d()) {
            int i9 = 0;
            while (true) {
                ArrayList arrayList = this.f7440e;
                if (i9 < arrayList.size()) {
                    r rVar = (r) arrayList.get(i9);
                    if (!rVar.f7433d) {
                        rVar.f7432c.h(j, true);
                    }
                    i9++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // N3.InterfaceC0272x
    public final long y(i4.q[] qVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j) {
        ArrayList arrayList;
        for (int i9 = 0; i9 < qVarArr.length; i9++) {
            if (d0VarArr[i9] != null && (qVarArr[i9] == null || !zArr[i9])) {
                d0VarArr[i9] = null;
            }
        }
        ArrayList arrayList2 = this.f7441f;
        arrayList2.clear();
        int i10 = 0;
        while (true) {
            int length = qVarArr.length;
            arrayList = this.f7440e;
            if (i10 >= length) {
                break;
            }
            i4.q qVar = qVarArr[i10];
            if (qVar != null) {
                m0 l9 = qVar.l();
                S s9 = this.j;
                s9.getClass();
                int indexOf = s9.indexOf(l9);
                r rVar = (r) arrayList.get(indexOf);
                rVar.getClass();
                arrayList2.add(rVar.f7430a);
                if (this.j.contains(l9) && d0VarArr[i10] == null) {
                    d0VarArr[i10] = new A1.i(indexOf, this);
                    zArr2[i10] = true;
                }
            }
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            r rVar2 = (r) arrayList.get(i11);
            if (!arrayList2.contains(rVar2.f7430a)) {
                rVar2.a();
            }
        }
        this.f7454t = true;
        if (j != 0) {
            this.f7447m = j;
            this.f7448n = j;
            this.f7449o = j;
        }
        e();
        return j;
    }

    @Override // N3.f0
    public final boolean z(long j) {
        return !this.f7450p;
    }

    @Override // N3.f0
    public final void B(long j) {
    }

    @Override // N3.InterfaceC0272x
    public final long c(long j, x0 x0Var) {
        return j;
    }
}
