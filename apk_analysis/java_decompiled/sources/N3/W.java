package N3;

import android.net.Uri;
import android.os.Looper;
import j3.E0;
import k4.C1517q;
import k4.InterfaceC1512l;
import k4.InterfaceC1513m;
import l4.AbstractC1566a;
import n3.C1635l;
import n3.InterfaceC1632i;
import n3.InterfaceC1638o;
import q3.C1903h;

/* loaded from: classes.dex */
public final class W extends AbstractC0250a {

    /* renamed from: h, reason: collision with root package name */
    public final j3.Y f5010h;

    /* renamed from: i, reason: collision with root package name */
    public final j3.U f5011i;
    public final InterfaceC1512l j;

    /* renamed from: k, reason: collision with root package name */
    public final C3.v f5012k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC1638o f5013l;

    /* renamed from: m, reason: collision with root package name */
    public final e1.q f5014m;

    /* renamed from: n, reason: collision with root package name */
    public final int f5015n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5016o;

    /* renamed from: p, reason: collision with root package name */
    public long f5017p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5018q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5019r;

    /* renamed from: s, reason: collision with root package name */
    public k4.W f5020s;

    public W(j3.Y y9, InterfaceC1512l interfaceC1512l, C3.v vVar, InterfaceC1638o interfaceC1638o, e1.q qVar, int i9) {
        j3.U u9 = y9.f19492b;
        u9.getClass();
        this.f5011i = u9;
        this.f5010h = y9;
        this.j = interfaceC1512l;
        this.f5012k = vVar;
        this.f5013l = interfaceC1638o;
        this.f5014m = qVar;
        this.f5015n = i9;
        this.f5016o = true;
        this.f5017p = -9223372036854775807L;
    }

    @Override // N3.AbstractC0250a
    public final InterfaceC0272x b(A a5, C1517q c1517q, long j) {
        InterfaceC1513m c3 = this.j.c();
        k4.W w7 = this.f5020s;
        if (w7 != null) {
            c3.a(w7);
        }
        Uri uri = this.f5011i.f19475a;
        AbstractC1566a.n(this.f5041g);
        return new T(uri, c3, new android.support.v4.media.session.y((C1903h) this.f5012k.f1562b), this.f5013l, new C1635l(this.f5038d.f21132c, 0, a5), this.f5014m, a(a5), this, c1517q, this.f5015n);
    }

    @Override // N3.AbstractC0250a
    public final j3.Y j() {
        return this.f5010h;
    }

    @Override // N3.AbstractC0250a
    public final void n(k4.W w7) {
        this.f5020s = w7;
        InterfaceC1638o interfaceC1638o = this.f5013l;
        interfaceC1638o.b();
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        k3.l lVar = this.f5041g;
        AbstractC1566a.n(lVar);
        interfaceC1638o.l(myLooper, lVar);
        v();
    }

    @Override // N3.AbstractC0250a
    public final void p(InterfaceC0272x interfaceC0272x) {
        T t7 = (T) interfaceC0272x;
        if (t7.f4998u) {
            for (c0 c0Var : t7.f4995r) {
                c0Var.i();
                InterfaceC1632i interfaceC1632i = c0Var.f5061h;
                if (interfaceC1632i != null) {
                    interfaceC1632i.e(c0Var.f5058e);
                    c0Var.f5061h = null;
                    c0Var.f5060g = null;
                }
            }
        }
        t7.j.e(t7);
        t7.f4992o.removeCallbacksAndMessages(null);
        t7.f4993p = null;
        t7.f4987i0 = true;
    }

    @Override // N3.AbstractC0250a
    public final void r() {
        this.f5013l.a();
    }

    public final void v() {
        E0 h0Var = new h0(this.f5017p, this.f5018q, this.f5019r, this.f5010h);
        if (this.f5016o) {
            h0Var = new U(h0Var, 0);
        }
        o(h0Var);
    }

    public final void w(long j, boolean z9, boolean z10) {
        if (j == -9223372036854775807L) {
            j = this.f5017p;
        }
        if (!this.f5016o && this.f5017p == j && this.f5018q == z9 && this.f5019r == z10) {
            return;
        }
        this.f5017p = j;
        this.f5018q = z9;
        this.f5019r = z10;
        this.f5016o = false;
        v();
    }

    @Override // N3.AbstractC0250a
    public final void l() {
    }
}
