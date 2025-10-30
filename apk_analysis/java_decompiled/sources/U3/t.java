package U3;

import N3.AbstractC0250a;
import N3.InterfaceC0272x;
import N3.h0;
import android.net.Uri;
import b7.C0701c;
import j3.E0;
import j3.K;
import j3.U;
import j3.Y;
import java.util.ArrayList;
import javax.net.SocketFactory;
import k4.C1517q;
import k4.W;
import z2.C2235a;

/* loaded from: classes.dex */
public final class t extends AbstractC0250a {

    /* renamed from: h, reason: collision with root package name */
    public final Y f7457h;

    /* renamed from: i, reason: collision with root package name */
    public final C2235a f7458i;
    public final String j = "ExoPlayerLib/2.18.2";

    /* renamed from: k, reason: collision with root package name */
    public final Uri f7459k;

    /* renamed from: l, reason: collision with root package name */
    public final SocketFactory f7460l;

    /* renamed from: m, reason: collision with root package name */
    public long f7461m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7462n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7463o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7464p;

    static {
        K.a("goog.exo.rtsp");
    }

    public t(Y y9, C2235a c2235a, SocketFactory socketFactory) {
        this.f7457h = y9;
        this.f7458i = c2235a;
        U u9 = y9.f19492b;
        u9.getClass();
        this.f7459k = u9.f19475a;
        this.f7460l = socketFactory;
        this.f7461m = -9223372036854775807L;
        this.f7464p = true;
    }

    @Override // N3.AbstractC0250a
    public final InterfaceC0272x b(N3.A a5, C1517q c1517q, long j) {
        C0701c c0701c = new C0701c(19, this);
        return new s(c1517q, this.f7458i, this.f7459k, c0701c, this.j, this.f7460l);
    }

    @Override // N3.AbstractC0250a
    public final Y j() {
        return this.f7457h;
    }

    @Override // N3.AbstractC0250a
    public final void n(W w7) {
        v();
    }

    @Override // N3.AbstractC0250a
    public final void p(InterfaceC0272x interfaceC0272x) {
        s sVar = (s) interfaceC0272x;
        int i9 = 0;
        while (true) {
            ArrayList arrayList = sVar.f7440e;
            if (i9 < arrayList.size()) {
                r rVar = (r) arrayList.get(i9);
                if (!rVar.f7434e) {
                    rVar.f7431b.e(null);
                    rVar.f7432c.A();
                    rVar.f7434e = true;
                }
                i9++;
            } else {
                l4.y.g(sVar.f7439d);
                sVar.f7452r = true;
                return;
            }
        }
    }

    public final void v() {
        E0 h0Var = new h0(this.f7461m, this.f7462n, this.f7463o, this.f7457h);
        if (this.f7464p) {
            h0Var = new N3.U(h0Var, 1);
        }
        o(h0Var);
    }

    @Override // N3.AbstractC0250a
    public final void l() {
    }

    @Override // N3.AbstractC0250a
    public final void r() {
    }
}
