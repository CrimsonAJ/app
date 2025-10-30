package com.anilab.android.ui.selectSubtitle;

import A7.e;
import A7.f;
import A7.l;
import B7.k;
import C2.P;
import J1.AbstractC0196q;
import J2.c;
import N1.t;
import Y2.r;
import Z0.a;
import b5.G1;
import c2.C0762h;
import co.notix.R;
import com.anilab.domain.model.MovieDownload;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;
import n2.AbstractC1615a;
import n2.AbstractC1619e;
import n2.C1616b;
import n2.C1617c;
import n2.C1620f;
import n2.g;
import n2.h;
import u0.z;

/* loaded from: classes.dex */
public final class BottomSheetSelectSubtitle extends AbstractC1619e<AbstractC0196q, g> {

    /* renamed from: S0, reason: collision with root package name */
    public final r f13833S0;

    /* renamed from: T0, reason: collision with root package name */
    public final G1 f13834T0;

    /* renamed from: U0, reason: collision with root package name */
    public final l f13835U0;

    public BottomSheetSelectSubtitle() {
        e p9 = a.p(f.f545a, new e2.e(14, new C1616b(this, 1)));
        this.f13833S0 = M4.a.i(this, p.a(g.class), new C0762h(p9, 26), new C0762h(p9, 27), new t(this, p9, 28));
        this.f13834T0 = new G1(p.a(C1617c.class), new C1616b(this, 0));
        this.f13835U0 = a.q(new P(15));
    }

    @Override // M1.g
    public final int n0() {
        return R.layout.bottom_sheet_select_subtitle;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ee  */
    /* JADX WARN: Type inference failed for: r7v1, types: [r2.b, android.app.Dialog] */
    @Override // M1.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o0(int r9) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anilab.android.ui.selectSubtitle.BottomSheetSelectSubtitle.o0(int):void");
    }

    @Override // M1.g
    public final void p0() {
        g gVar = (g) this.f13833S0.getValue();
        gVar.getClass();
        gVar.d(false, new C1620f(gVar, null));
    }

    @Override // M1.g
    public final List q0(W.g gVar) {
        AbstractC0196q abstractC0196q = (AbstractC0196q) gVar;
        return B7.l.b0(abstractC0196q.f4044v, abstractC0196q.f4045w);
    }

    @Override // M1.g
    public final void r0() {
        String g9;
        AbstractC0196q abstractC0196q = (AbstractC0196q) m0();
        G1 g12 = this.f13834T0;
        abstractC0196q.f4047y.setText(((C1617c) g12.getValue()).f21053a.f14435a);
        AbstractC0196q abstractC0196q2 = (AbstractC0196q) m0();
        MovieDownload movieDownload = ((C1617c) g12.getValue()).f21053a;
        int[] iArr = AbstractC1615a.f21050a;
        c cVar = movieDownload.f14436b;
        if (iArr[cVar.ordinal()] == 1) {
            g9 = cVar.name();
        } else {
            g9 = z.g(new StringBuilder(), cVar.f4169a, "P");
        }
        abstractC0196q2.f4048z.setText(g9);
        ((AbstractC0196q) m0()).f4046x.setHasFixedSize(true);
        AbstractC0196q abstractC0196q3 = (AbstractC0196q) m0();
        l lVar = this.f13835U0;
        abstractC0196q3.f4046x.setAdapter((h) lVar.getValue());
        String r5 = r(R.string.label_none);
        kotlin.jvm.internal.h.d(r5, "getString(...)");
        ArrayList c02 = B7.l.c0(new I2.c(0L, "", r5, ""));
        c02.addAll(((C1617c) g12.getValue()).f21053a.f14438d);
        ((h) lVar.getValue()).o(k.H0(c02));
    }
}
