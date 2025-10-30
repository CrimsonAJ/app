package C1;

import Y7.B;
import Y7.InterfaceC0465h0;
import Y7.K;
import Y7.Y;
import Y7.y0;
import androidx.lifecycle.InterfaceC0561w;
import java.util.concurrent.CancellationException;
import t1.C2004m;
import u0.z;

/* loaded from: classes.dex */
public final class r implements o {

    /* renamed from: a, reason: collision with root package name */
    public final C2004m f1243a;

    /* renamed from: b, reason: collision with root package name */
    public final i f1244b;

    /* renamed from: c, reason: collision with root package name */
    public final E1.a f1245c;

    /* renamed from: d, reason: collision with root package name */
    public final D.n f1246d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0465h0 f1247e;

    public r(C2004m c2004m, i iVar, E1.a aVar, D.n nVar, InterfaceC0465h0 interfaceC0465h0) {
        this.f1243a = c2004m;
        this.f1244b = iVar;
        this.f1245c = aVar;
        this.f1246d = nVar;
        this.f1247e = interfaceC0465h0;
    }

    @Override // androidx.lifecycle.InterfaceC0545f
    public final void a(InterfaceC0561w owner) {
        kotlin.jvm.internal.h.e(owner, "owner");
    }

    @Override // androidx.lifecycle.InterfaceC0545f
    public final void b(InterfaceC0561w interfaceC0561w) {
        t c3 = H1.f.c(this.f1245c.f1926b);
        synchronized (c3) {
            y0 y0Var = c3.f1251c;
            if (y0Var != null) {
                y0Var.d(null);
            }
            Y y9 = Y.f8793a;
            f8.e eVar = K.f8773a;
            c3.f1251c = B.r(y9, d8.o.f17003a.f9070d, new s(c3, null), 2);
            c3.f1250b = null;
        }
    }

    @Override // androidx.lifecycle.InterfaceC0545f
    public final void c(InterfaceC0561w owner) {
        kotlin.jvm.internal.h.e(owner, "owner");
    }

    @Override // C1.o
    public final /* synthetic */ void e() {
    }

    @Override // androidx.lifecycle.InterfaceC0545f
    public final /* synthetic */ void f(InterfaceC0561w interfaceC0561w) {
    }

    @Override // C1.o
    public final void h() {
        E1.a aVar = this.f1245c;
        if (aVar.f1926b.isAttachedToWindow()) {
            return;
        }
        t c3 = H1.f.c(aVar.f1926b);
        r rVar = c3.f1252d;
        if (rVar != null) {
            rVar.f1247e.d(null);
            E1.a aVar2 = rVar.f1245c;
            boolean i9 = z.i(aVar2);
            D.n nVar = rVar.f1246d;
            if (i9) {
                nVar.g0(aVar2);
            }
            nVar.g0(rVar);
        }
        c3.f1252d = this;
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // androidx.lifecycle.InterfaceC0545f
    public final void i(InterfaceC0561w owner) {
        kotlin.jvm.internal.h.e(owner, "owner");
    }

    @Override // androidx.lifecycle.InterfaceC0545f
    public final /* synthetic */ void j(InterfaceC0561w interfaceC0561w) {
    }

    @Override // C1.o
    public final void start() {
        D.n nVar = this.f1246d;
        nVar.V(this);
        E1.a aVar = this.f1245c;
        if (z.i(aVar)) {
            nVar.g0(aVar);
            nVar.V(aVar);
        }
        t c3 = H1.f.c(aVar.f1926b);
        r rVar = c3.f1252d;
        if (rVar != null) {
            rVar.f1247e.d(null);
            E1.a aVar2 = rVar.f1245c;
            boolean i9 = z.i(aVar2);
            D.n nVar2 = rVar.f1246d;
            if (i9) {
                nVar2.g0(aVar2);
            }
            nVar2.g0(rVar);
        }
        c3.f1252d = this;
    }
}
