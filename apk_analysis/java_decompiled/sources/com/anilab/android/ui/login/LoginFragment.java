package com.anilab.android.ui.login;

import A7.e;
import A7.f;
import B7.l;
import C3.v;
import J1.U;
import L1.S;
import M1.n;
import N1.s;
import N1.t;
import W.g;
import Y1.a;
import Y1.d;
import Y1.h;
import Y2.r;
import Y7.B;
import android.view.View;
import androidx.lifecycle.Y;
import co.notix.R;
import com.google.android.gms.internal.measurement.Y1;
import g.C1188a;
import g6.o;
import i0.AbstractActivityC1369y;
import i0.C1359o;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class LoginFragment extends a<h, U> {

    /* renamed from: D0, reason: collision with root package name */
    public final r f13776D0;

    /* renamed from: E0, reason: collision with root package name */
    public final r f13777E0;

    /* renamed from: F0, reason: collision with root package name */
    public final C1359o f13778F0;

    public LoginFragment() {
        e p9 = Z0.a.p(f.f545a, new N1.r(17, new Y1.e(this, 3)));
        this.f13776D0 = M4.a.i(this, p.a(h.class), new s(p9, 22), new s(p9, 23), new t(this, p9, 11));
        this.f13777E0 = M4.a.i(this, p.a(S.class), new Y1.e(this, 0), new Y1.e(this, 1), new Y1.e(this, 2));
        this.f13778F0 = (C1359o) V(new v(10, this), new C1188a(2));
    }

    @Override // M1.n
    public final int f0() {
        return R.layout.fragment_login;
    }

    @Override // M1.n
    public final M1.r h0() {
        return (h) this.f13776D0.getValue();
    }

    @Override // M1.n
    public final void k0(int i9) {
        switch (i9) {
            case R.id.buttonBack /* 2131361905 */:
                n.q0(this);
                return;
            case R.id.buttonContinueWithGoogle /* 2131361915 */:
                AbstractActivityC1369y k5 = k();
                if (k5 != null) {
                    ((h) this.f13776D0.getValue()).f8588g.getClass();
                    Y1.B(k5, this.f13778F0, o.f17761a.J());
                    return;
                }
                return;
            case R.id.buttonSignInWithPassword /* 2131361960 */:
                i0(R.id.loginToLoginWithEmail, null);
                return;
            case R.id.textSignUp /* 2131362776 */:
                i0(R.id.loginToRegister, null);
                return;
            default:
                return;
        }
    }

    @Override // M1.n
    public final void l0() {
        B.r(Y.f(this), null, new d(null, this), 3);
    }

    @Override // M1.n
    public final List m0(g gVar) {
        U u9 = (U) gVar;
        return l.b0(u9.f3784x, u9.f3782v, u9.f3786z, u9.f3783w);
    }

    @Override // M1.n
    public final void n0(boolean z9) {
        int i9;
        View view = ((U) e0()).f3785y.f7853k;
        kotlin.jvm.internal.h.d(view, "getRoot(...)");
        if (z9) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        view.setVisibility(i9);
    }

    @Override // M1.n
    public final void p0() {
    }
}
