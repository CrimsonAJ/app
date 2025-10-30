package com.anilab.android.ui.loginWithEmail;

import A7.e;
import A7.f;
import B7.l;
import C3.v;
import J1.W;
import M1.n;
import N1.s;
import N1.t;
import W.g;
import Y2.r;
import Y7.B;
import Z1.a;
import Z1.d;
import Z1.h;
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
public final class LoginWithEmailFragment extends a<h, W> {

    /* renamed from: D0, reason: collision with root package name */
    public final r f13779D0;

    /* renamed from: E0, reason: collision with root package name */
    public final C1359o f13780E0;

    public LoginWithEmailFragment() {
        e p9 = Z0.a.p(f.f545a, new N1.r(19, new N1.r(18, this)));
        this.f13779D0 = M4.a.i(this, p.a(h.class), new s(p9, 24), new s(p9, 25), new t(this, p9, 12));
        this.f13780E0 = (C1359o) V(new v(11, this), new C1188a(2));
    }

    @Override // M1.n
    public final int f0() {
        return R.layout.fragment_login_with_email;
    }

    @Override // M1.n
    public final M1.r h0() {
        return (h) this.f13779D0.getValue();
    }

    @Override // M1.n
    public final void k0(int i9) {
        r rVar = this.f13779D0;
        switch (i9) {
            case R.id.buttonBack /* 2131361905 */:
                n.q0(this);
                return;
            case R.id.buttonContinueWithGoogle /* 2131361915 */:
                AbstractActivityC1369y k5 = k();
                if (k5 != null) {
                    ((h) rVar.getValue()).f8946h.getClass();
                    Y1.B(k5, this.f13780E0, o.f17761a.J());
                    return;
                }
                return;
            case R.id.buttonSignIn /* 2131361959 */:
                AbstractActivityC1369y k9 = k();
                if (k9 != null) {
                    Y1.p(k9);
                }
                h hVar = (h) rVar.getValue();
                String valueOf = String.valueOf(((W) e0()).f3801y.getText());
                String valueOf2 = String.valueOf(((W) e0()).f3802z.getText());
                hVar.getClass();
                hVar.d(true, new Z1.f(hVar, valueOf, valueOf2, null));
                return;
            case R.id.textSignUp /* 2131362776 */:
                i0(R.id.loginWithEmailToRegister, null);
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
        W w7 = (W) gVar;
        View view = w7.f3795A.f7853k;
        return l.b0(w7.f3798v, w7.f3796B, w7.f3800x, view, w7.f3799w);
    }

    @Override // M1.n
    public final void n0(boolean z9) {
        int i9;
        View view = ((W) e0()).f3795A.f7853k;
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
