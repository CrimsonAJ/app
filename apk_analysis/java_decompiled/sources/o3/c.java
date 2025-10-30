package o3;

import C4.o;
import C4.p;
import O4.h;
import X0.k;
import l4.AbstractC1566a;
import v4.r;

/* loaded from: classes.dex */
public final class c implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21555a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f21556b;

    public /* synthetic */ c(e eVar, int i9) {
        this.f21555a = i9;
        this.f21556b = eVar;
    }

    @Override // C4.p
    public final void a(o oVar) {
        switch (this.f21555a) {
            case 0:
                e eVar = this.f21556b;
                if (eVar.f21572o != null) {
                    eVar.v0(this);
                    eVar.j.b();
                    return;
                }
                return;
            case 1:
                e eVar2 = this.f21556b;
                if (eVar2.f21572o != null) {
                    eVar2.u0(this);
                    eVar2.j.b();
                    return;
                }
                return;
            case 2:
                e eVar3 = this.f21556b;
                if (eVar3.f21572o != null) {
                    eVar3.w0(this);
                    eVar3.j.b();
                    return;
                }
                return;
            default:
                int i9 = ((r) oVar).d().f14660a;
                if (i9 != 0 && i9 != 2103) {
                    StringBuilder p9 = A0.a.p("Seek failed. Error code ", i9, ": ");
                    p9.append(h.w(i9));
                    AbstractC1566a.t("CastPlayer", p9.toString());
                }
                e eVar4 = this.f21556b;
                int i10 = eVar4.f21579v - 1;
                eVar4.f21579v = i10;
                if (i10 == 0) {
                    eVar4.f21577t = eVar4.f21580w;
                    eVar4.f21580w = -1;
                    eVar4.f21581x = -9223372036854775807L;
                    eVar4.j.e(-1, new k(22));
                    return;
                }
                return;
        }
    }
}
