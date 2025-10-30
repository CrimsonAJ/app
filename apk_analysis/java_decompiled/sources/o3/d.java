package o3;

import F4.y;
import O4.h;
import l4.AbstractC1566a;
import u4.C2079d;
import u4.i;

/* loaded from: classes.dex */
public final class d extends v4.g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f21557a;

    public d(e eVar) {
        this.f21557a = eVar;
    }

    @Override // u4.i
    public final void a(u4.g gVar, int i9) {
        StringBuilder p9 = A0.a.p("Session start failed. Error code ", i9, ": ");
        p9.append(h.w(i9));
        AbstractC1566a.t("CastPlayer", p9.toString());
    }

    @Override // u4.i
    public final /* bridge */ /* synthetic */ void d(u4.g gVar) {
    }

    @Override // u4.i
    public final /* bridge */ /* synthetic */ void e(u4.g gVar) {
    }

    @Override // u4.i
    public final /* bridge */ /* synthetic */ void f(u4.g gVar, String str) {
    }

    @Override // u4.i
    public final void g(u4.g gVar, int i9) {
        this.f21557a.q0(null);
    }

    @Override // u4.i
    public final void h(u4.g gVar, String str) {
        C2079d c2079d = (C2079d) gVar;
        c2079d.getClass();
        y.d();
        this.f21557a.q0(c2079d.j);
    }

    @Override // u4.i
    public final void i(u4.g gVar, int i9) {
        this.f21557a.q0(null);
    }

    @Override // u4.i
    public final void j(u4.g gVar, boolean z9) {
        C2079d c2079d = (C2079d) gVar;
        c2079d.getClass();
        y.d();
        this.f21557a.q0(c2079d.j);
    }

    @Override // u4.i
    public final void k(u4.g gVar, int i9) {
        StringBuilder p9 = A0.a.p("Session resume failed. Error code ", i9, ": ");
        p9.append(h.w(i9));
        AbstractC1566a.t("CastPlayer", p9.toString());
    }

    @Override // v4.g
    public final void m() {
        e eVar = this.f21557a;
        eVar.x0();
        eVar.j.b();
    }

    @Override // v4.g
    public final void n() {
        this.f21557a.t0();
    }

    @Override // v4.g
    public final void b() {
    }

    @Override // v4.g
    public final void c() {
    }

    @Override // v4.g
    public final void l() {
    }
}
