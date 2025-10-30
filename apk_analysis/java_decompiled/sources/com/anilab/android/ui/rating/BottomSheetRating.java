package com.anilab.android.ui.rating;

import A7.e;
import A7.f;
import A7.l;
import C2.P;
import J1.AbstractC0188m;
import N1.t;
import Y2.r;
import Y7.B;
import Z0.a;
import androidx.lifecycle.Y;
import b5.G1;
import c2.C0762h;
import co.notix.R;
import com.anilab.domain.model.Movie;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import i2.C1377e;
import i2.C1378f;
import i2.g;
import i2.i;
import i2.j;
import i2.m;
import i2.n;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class BottomSheetRating extends i<AbstractC0188m, n> {

    /* renamed from: S0, reason: collision with root package name */
    public final r f13820S0;

    /* renamed from: T0, reason: collision with root package name */
    public final l f13821T0;

    /* renamed from: U0, reason: collision with root package name */
    public final G1 f13822U0;

    public BottomSheetRating() {
        e p9 = a.p(f.f545a, new e2.e(5, new C1378f(this, 1)));
        this.f13820S0 = M4.a.i(this, p.a(n.class), new C0762h(p9, 16), new C0762h(p9, 17), new t(this, p9, 23));
        this.f13821T0 = a.q(new P(14));
        this.f13822U0 = new G1(p.a(g.class), new C1378f(this, 0));
    }

    @Override // M1.g
    public final int n0() {
        return R.layout.bottom_sheet_rating;
    }

    @Override // M1.g
    public final void o0(int i9) {
        if (i9 != R.id.buttonCancel) {
            if (i9 != R.id.buttonSubmit) {
                return;
            }
            n t02 = t0();
            Movie movie = ((g) this.f13822U0.getValue()).f18460a;
            int progress = ((AbstractC0188m) m0()).f3997x.getProgress();
            t02.getClass();
            t02.d(false, new m(t02, movie.f14414a, progress, null));
            return;
        }
        AbstractC1002u1.A(this).m();
    }

    @Override // M1.g
    public final void p0() {
        B.r(Y.f(this), null, new C1377e(this, null), 3);
        n t02 = t0();
        Movie movie = ((g) this.f13822U0.getValue()).f18460a;
        t02.getClass();
        t02.d(false, new i2.l(t02, movie.f14414a, null));
    }

    @Override // M1.g
    public final List q0(W.g gVar) {
        AbstractC0188m abstractC0188m = (AbstractC0188m) gVar;
        return B7.l.b0(abstractC0188m.f3995v, abstractC0188m.f3996w);
    }

    @Override // M1.g
    public final void r0() {
        ((AbstractC0188m) m0()).f3999z.setHasFixedSize(true);
        AbstractC0188m abstractC0188m = (AbstractC0188m) m0();
        abstractC0188m.f3999z.setAdapter((j) this.f13821T0.getValue());
        AbstractC0188m abstractC0188m2 = (AbstractC0188m) m0();
        G1 g12 = this.f13822U0;
        abstractC0188m2.f3990A.setText(String.valueOf(((g) g12.getValue()).f18460a.f14430r));
        AbstractC0188m abstractC0188m3 = (AbstractC0188m) m0();
        abstractC0188m3.f3998y.setRating((float) ((g) g12.getValue()).f18460a.f14430r);
    }

    public final n t0() {
        return (n) this.f13820S0.getValue();
    }
}
