package com.anilab.android.ui.external_player;

import A7.e;
import A7.f;
import A7.l;
import C2.P;
import I2.b;
import J1.AbstractC0212y0;
import J2.c;
import J5.h;
import J5.j;
import L1.D;
import L1.S;
import N1.s;
import N1.t;
import T1.AbstractC0388b;
import T1.E;
import T1.G;
import T1.x;
import T1.y;
import W.g;
import W7.d;
import Y2.r;
import Y7.B;
import Z0.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import androidx.lifecycle.Y;
import b8.C0718Q;
import co.notix.R;
import com.anilab.android.ui.activity.MainActivity;
import com.google.android.material.chip.Chip;
import com.google.android.material.tabs.TabLayout;
import i0.AbstractActivityC1369y;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class SelectSubtitleForPlayerFragment extends AbstractC0388b<AbstractC0212y0, G> {

    /* renamed from: S0, reason: collision with root package name */
    public final r f13757S0;

    /* renamed from: T0, reason: collision with root package name */
    public final r f13758T0;

    /* renamed from: U0, reason: collision with root package name */
    public final l f13759U0;

    /* renamed from: V0, reason: collision with root package name */
    public final j f13760V0;

    public SelectSubtitleForPlayerFragment() {
        e p9 = a.p(f.f545a, new N1.r(9, new y(this, 3)));
        this.f13757S0 = M4.a.i(this, p.a(G.class), new s(p9, 12), new s(p9, 13), new t(this, p9, 6));
        this.f13758T0 = M4.a.i(this, p.a(S.class), new y(this, 0), new y(this, 1), new y(this, 2));
        this.f13759U0 = a.q(new P(7));
        this.f13760V0 = new j(2, this);
    }

    public static final void t0(SelectSubtitleForPlayerFragment selectSubtitleForPlayerFragment) {
        J5.f h7;
        int i9;
        List<b> list;
        h hVar;
        boolean z9;
        h hVar2;
        boolean z10;
        AbstractC0212y0 abstractC0212y0 = (AbstractC0212y0) selectSubtitleForPlayerFragment.m0();
        TabLayout tabLayout = abstractC0212y0.f4136C;
        J5.f h9 = tabLayout.h(0);
        if (h9 != null && (hVar2 = h9.f4204g) != null) {
            G u02 = selectSubtitleForPlayerFragment.u0();
            if (!u02.f6995l.f3448e.isEmpty() && !u02.f6995l.f3449f.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            hVar2.setClickable(z10);
        }
        J5.f h10 = tabLayout.h(1);
        if (h10 != null && (hVar = h10.f4204g) != null) {
            G u03 = selectSubtitleForPlayerFragment.u0();
            if (!u03.f6995l.f3448e.isEmpty() && !u03.f6995l.f3449f.isEmpty()) {
                z9 = true;
            } else {
                z9 = false;
            }
            hVar.setClickable(z9);
        }
        if (selectSubtitleForPlayerFragment.u0().f6998o) {
            h7 = tabLayout.h(1);
        } else {
            h7 = tabLayout.h(0);
        }
        if (h7 != null && !h7.a()) {
            tabLayout.k(h7, true);
        }
        HorizontalScrollView scrollViewServer = abstractC0212y0.f4135B;
        kotlin.jvm.internal.h.d(scrollViewServer, "scrollViewServer");
        G u04 = selectSubtitleForPlayerFragment.u0();
        boolean z11 = u04.f6998o;
        I2.a aVar = u04.f6995l;
        if (!z11 ? aVar.f3448e.size() > 1 : aVar.f3449f.size() > 1) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        scrollViewServer.setVisibility(i9);
        ViewGroup chipGroupServer = abstractC0212y0.f4139x;
        kotlin.jvm.internal.h.d(chipGroupServer, "chipGroupServer");
        if (selectSubtitleForPlayerFragment.u0().f6998o) {
            list = selectSubtitleForPlayerFragment.u0().f6995l.f3449f;
        } else {
            list = selectSubtitleForPlayerFragment.u0().f6995l.f3448e;
        }
        String str = selectSubtitleForPlayerFragment.u0().f6995l.f3450g.f3457b;
        chipGroupServer.removeAllViews();
        for (b bVar : list) {
            LayoutInflater layoutInflater = selectSubtitleForPlayerFragment.f18397i0;
            Chip chip = null;
            if (layoutInflater == null) {
                layoutInflater = selectSubtitleForPlayerFragment.K(null);
                selectSubtitleForPlayerFragment.f18397i0 = layoutInflater;
            }
            View inflate = layoutInflater.inflate(R.layout.item_chip_choice_small, chipGroupServer, false);
            if (inflate instanceof Chip) {
                chip = (Chip) inflate;
            }
            if (chip != null) {
                chip.setId(bVar.f3456a.hashCode());
                chip.setText(bVar.f3456a);
                chip.setChecked(kotlin.jvm.internal.h.a(bVar.f3457b, str));
                chipGroupServer.addView(chip);
            }
        }
    }

    @Override // i0.DialogInterfaceOnCancelListenerC1358n, i0.AbstractComponentCallbacksC1366v
    public final void Q() {
        super.Q();
        ((AbstractC0212y0) m0()).f4136C.a(this.f13760V0);
    }

    @Override // i0.DialogInterfaceOnCancelListenerC1358n, i0.AbstractComponentCallbacksC1366v
    public final void R() {
        ((AbstractC0212y0) m0()).f4136C.f16150m0.remove(this.f13760V0);
        super.R();
    }

    @Override // M1.g
    public final int n0() {
        return R.layout.fragment_select_subtitle_for_player;
    }

    @Override // M1.g
    public final void o0(int i9) {
        String str;
        String str2;
        if (i9 != R.id.buttonBack) {
            if (i9 != R.id.buttonSelectAndPlay) {
                return;
            }
            Object obj = ((Map) u0().j.h()).get(c.f4162b);
            if (obj == null) {
                obj = u0().f6995l.f3450g.f3457b;
            }
            String hlsUrl = (String) obj;
            String str3 = u0().f6995l.f3446c;
            boolean U8 = d.U(str3);
            r rVar = this.f13758T0;
            String str4 = "";
            if (U8) {
                H2.s sVar = ((S) rVar.getValue()).f4491A;
                if (sVar != null) {
                    str3 = sVar.f3052b;
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    str3 = "";
                }
            }
            l lVar = this.f13759U0;
            I2.c r5 = ((n2.h) lVar.getValue()).r();
            if (r5 != null) {
                str = r5.f3463c;
                if (d.U(str)) {
                    str = r5.f3462b;
                }
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            I2.c r7 = ((n2.h) lVar.getValue()).r();
            if (r7 != null) {
                str2 = r7.f3464d;
            } else {
                str2 = null;
            }
            if (str2 != null) {
                str4 = str2;
            }
            S s9 = (S) rVar.getValue();
            s9.getClass();
            kotlin.jvm.internal.h.e(hlsUrl, "hlsUrl");
            M1.t tVar = new M1.t(new D(str3, hlsUrl, str, str4));
            C0718Q c0718q = s9.f4507u;
            c0718q.getClass();
            c0718q.j(null, tVar);
            return;
        }
        l0();
    }

    @Override // M1.g
    public final void p0() {
        Long l9;
        Long l10;
        r rVar = this.f13758T0;
        H2.s sVar = ((S) rVar.getValue()).f4491A;
        MainActivity mainActivity = null;
        if (sVar != null) {
            l9 = Long.valueOf(sVar.f3051a);
        } else {
            l9 = null;
        }
        H2.s sVar2 = ((S) rVar.getValue()).f4491A;
        if (sVar2 != null) {
            l10 = Long.valueOf(sVar2.f3054d);
        } else {
            l10 = null;
        }
        if (l9 == null) {
            AbstractActivityC1369y k5 = k();
            if (k5 instanceof MainActivity) {
                mainActivity = (MainActivity) k5;
            }
            if (mainActivity != null) {
                M1.D d9 = new M1.D(R.string.msg_unknown_error);
                int i9 = MainActivity.f13724k0;
                mainActivity.Z(d9);
            }
            l0();
            return;
        }
        B.r(Y.f(t()), null, new x(null, this), 3);
        G u02 = u0();
        long longValue = l9.longValue();
        u02.getClass();
        if (l10 != null && l10.longValue() > 0) {
            u02.d(true, new T1.D(u02, l10, null));
        } else {
            u02.d(true, new E(u02, longValue, null));
        }
    }

    @Override // M1.g
    public final List q0(g gVar) {
        AbstractC0212y0 abstractC0212y0 = (AbstractC0212y0) gVar;
        return B7.l.b0(abstractC0212y0.f4137v, abstractC0212y0.f4138w);
    }

    @Override // M1.g
    public final void r0() {
        ((AbstractC0212y0) m0()).f4134A.setHasFixedSize(true);
        AbstractC0212y0 abstractC0212y0 = (AbstractC0212y0) m0();
        abstractC0212y0.f4134A.setAdapter((n2.h) this.f13759U0.getValue());
    }

    public final G u0() {
        return (G) this.f13757S0.getValue();
    }
}
