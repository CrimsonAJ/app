package com.anilab.android.ui.settings;

import A7.e;
import A7.f;
import B6.u0;
import J1.AbstractC0185k0;
import M1.n;
import N1.t;
import W.g;
import Y2.r;
import Y7.B;
import Z0.a;
import androidx.lifecycle.Y;
import c2.C0762h;
import co.notix.R;
import java.util.List;
import kotlin.jvm.internal.p;
import o2.AbstractC1674a;
import o2.C1676c;
import o2.C1679f;
import o2.C1683j;

/* loaded from: classes.dex */
public final class PlayerSettingsFragment extends AbstractC1674a<C1683j, AbstractC0185k0> {

    /* renamed from: D0, reason: collision with root package name */
    public final r f13836D0;

    public PlayerSettingsFragment() {
        e p9 = a.p(f.f545a, new e2.e(17, new e2.e(16, this)));
        this.f13836D0 = M4.a.i(this, p.a(C1683j.class), new C0762h(p9, 28), new C0762h(p9, 29), new t(this, p9, 29));
    }

    @Override // M1.n
    public final int f0() {
        return R.layout.fragment_player_settings;
    }

    @Override // M1.n
    public final M1.r h0() {
        return (C1683j) this.f13836D0.getValue();
    }

    @Override // M1.n
    public final void k0(int i9) {
        if (i9 == R.id.buttonBack) {
            n.q0(this);
        }
    }

    @Override // M1.n
    public final void l0() {
        B.r(Y.f(t()), null, new C1679f(this, null), 3);
    }

    @Override // M1.n
    public final List m0(g gVar) {
        return u0.D(((AbstractC0185k0) gVar).f3975v);
    }

    @Override // M1.n
    public final void p0() {
        AbstractC0185k0 abstractC0185k0 = (AbstractC0185k0) e0();
        abstractC0185k0.f3976w.setOnCheckedChangeListener(new C1676c(0, this));
    }
}
