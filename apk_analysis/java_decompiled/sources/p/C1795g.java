package p;

import android.content.Context;
import android.view.View;
import co.notix.R;
import o.SubMenuC1659D;

/* renamed from: p.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1795g extends o.v {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f21984l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1805l f21985m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1795g(C1805l c1805l, Context context, o.l lVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, lVar, true);
        this.f21985m = c1805l;
        this.f21446f = 8388613;
        i.G g9 = c1805l.f22029x;
        this.f21448h = g9;
        o.t tVar = this.f21449i;
        if (tVar != null) {
            tVar.h(g9);
        }
    }

    @Override // o.v
    public final void c() {
        switch (this.f21984l) {
            case 0:
                C1805l c1805l = this.f21985m;
                c1805l.f22026u = null;
                c1805l.f22030y = 0;
                super.c();
                return;
            default:
                C1805l c1805l2 = this.f21985m;
                o.l lVar = c1805l2.f22009c;
                if (lVar != null) {
                    lVar.c(true);
                }
                c1805l2.f22025t = null;
                super.c();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1795g(C1805l c1805l, Context context, SubMenuC1659D subMenuC1659D, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC1659D, false);
        this.f21985m = c1805l;
        if ((subMenuC1659D.f21313A.f21426x & 32) != 32) {
            View view2 = c1805l.j;
            this.f21445e = view2 == null ? (View) c1805l.f22014h : view2;
        }
        i.G g9 = c1805l.f22029x;
        this.f21448h = g9;
        o.t tVar = this.f21449i;
        if (tVar != null) {
            tVar.h(g9);
        }
    }
}
