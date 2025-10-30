package com.anilab.android.ui.logout;

import A7.e;
import A7.f;
import J1.AbstractC0180i;
import L1.S;
import N1.s;
import N1.t;
import W.g;
import Y2.r;
import Y7.B;
import Z0.a;
import a2.h;
import a2.j;
import a2.k;
import a2.l;
import androidx.lifecycle.Y;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class BottomSheetConfirmLogout extends l<AbstractC0180i, k> {

    /* renamed from: S0, reason: collision with root package name */
    public final r f13781S0;

    /* renamed from: T0, reason: collision with root package name */
    public final r f13782T0;

    public BottomSheetConfirmLogout() {
        e p9 = a.p(f.f545a, new N1.r(20, new h(this, 3)));
        this.f13781S0 = M4.a.i(this, p.a(k.class), new s(p9, 26), new s(p9, 27), new t(this, p9, 13));
        this.f13782T0 = M4.a.i(this, p.a(S.class), new h(this, 0), new h(this, 1), new h(this, 2));
    }

    @Override // M1.g
    public final int n0() {
        return R.layout.bottom_sheet_log_out;
    }

    @Override // M1.g
    public final void o0(int i9) {
        if (i9 != R.id.buttonCancel) {
            if (i9 != R.id.buttonLogout) {
                return;
            }
            k kVar = (k) this.f13781S0.getValue();
            kVar.d(true, new j(kVar, null));
            return;
        }
        AbstractC1002u1.A(this).m();
    }

    @Override // M1.g
    public final List q0(g gVar) {
        AbstractC0180i abstractC0180i = (AbstractC0180i) gVar;
        return B7.l.b0(abstractC0180i.f3959w, abstractC0180i.f3958v);
    }

    @Override // M1.g
    public final void r0() {
        B.r(Y.f(this), null, new a2.g(this, null), 3);
    }
}
