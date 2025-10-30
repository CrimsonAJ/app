package co.notix.interstitial;

import A7.n;
import E7.d;
import Y7.B;
import co.notix.da;
import co.notix.e;
import co.notix.gc;
import co.notix.i;
import co.notix.ia;
import co.notix.j6;
import co.notix.p8;
import co.notix.wq;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class InterstitialActivity extends j6 {

    /* renamed from: w, reason: collision with root package name */
    public final ia f12485w = wq.g();

    @Override // co.notix.zb
    public final void a(String data) {
        h.e(data, "data");
        ia iaVar = this.f12485w;
        String data2 = ((i) c()).f12423h;
        iaVar.getClass();
        h.e(data2, "data");
        B.r(iaVar.f12446c, null, new da(iaVar, data2, null), 3);
    }

    @Override // co.notix.zb
    public final Object a(d dVar) {
        String stringExtra = getIntent().getStringExtra("start_id");
        n nVar = n.f558a;
        if (stringExtra != null) {
            co.notix.d dVar2 = this.f12521i;
            dVar2.getClass();
            e eVar = (e) dVar2.f12066b.get(stringExtra);
            gc gcVar = eVar instanceof gc ? (gc) eVar : null;
            if (gcVar != null) {
                this.j = gcVar.f12306b;
                i iVar = gcVar.f12305a;
                h.e(iVar, "<set-?>");
                this.f13656c = iVar;
                this.f13657d = gcVar.f12307c;
                this.f13658e = gcVar.f12308d;
                this.f13659f = gcVar.f12309e;
                return nVar;
            }
        }
        a(p8.ERROR);
        return nVar;
    }
}
