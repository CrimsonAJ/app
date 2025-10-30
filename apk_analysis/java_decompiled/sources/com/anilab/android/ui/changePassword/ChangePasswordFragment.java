package com.anilab.android.ui.changePassword;

import A7.e;
import A7.f;
import B7.l;
import H2.y;
import J1.C;
import M1.n;
import N1.s;
import N1.t;
import O1.c;
import O1.g;
import O1.h;
import W7.d;
import Y2.r;
import Y7.B;
import Z0.a;
import android.view.View;
import androidx.lifecycle.Y;
import co.notix.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class ChangePasswordFragment extends h<g, C> {

    /* renamed from: D0, reason: collision with root package name */
    public final r f13740D0;

    public ChangePasswordFragment() {
        e p9 = a.p(f.f545a, new N1.r(2, new N1.r(1, this)));
        this.f13740D0 = M4.a.i(this, p.a(g.class), new s(p9, 2), new s(p9, 3), new t(this, p9, 1));
    }

    @Override // M1.n
    public final int f0() {
        return R.layout.fragment_change_password;
    }

    @Override // M1.n
    public final M1.r h0() {
        return (g) this.f13740D0.getValue();
    }

    @Override // M1.n
    public final void k0(int i9) {
        if (i9 != R.id.buttonBack) {
            if (i9 != R.id.buttonUpdate) {
                return;
            }
            C c3 = (C) e0();
            String currentPassword = d.j0(String.valueOf(c3.f3624y.getText())).toString();
            String newPassword = d.j0(String.valueOf(c3.f3625z.getText())).toString();
            String retypeNewPassword = d.j0(String.valueOf(c3.f3623x.getText())).toString();
            g gVar = (g) this.f13740D0.getValue();
            gVar.getClass();
            kotlin.jvm.internal.h.e(currentPassword, "currentPassword");
            kotlin.jvm.internal.h.e(newPassword, "newPassword");
            kotlin.jvm.internal.h.e(retypeNewPassword, "retypeNewPassword");
            gVar.d(true, new O1.f(newPassword, retypeNewPassword, gVar, currentPassword, null));
            return;
        }
        n.q0(this);
    }

    @Override // M1.n
    public final void l0() {
        B.r(Y.f(this), null, new c(null, this), 3);
    }

    @Override // M1.n
    public final List m0(W.g gVar) {
        C c3 = (C) gVar;
        return l.b0(c3.f3622w, c3.f3621v);
    }

    @Override // M1.n
    public final void n0(boolean z9) {
        int i9;
        View view = ((C) e0()).f3620B.f7853k;
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
        int i9;
        TextInputLayout layoutInputCurrentPassword = ((C) e0()).f3619A;
        kotlin.jvm.internal.h.d(layoutInputCurrentPassword, "layoutInputCurrentPassword");
        y a5 = ((g) this.f13740D0.getValue()).f5283g.a();
        if (a5 != null && a5.f3093g) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        layoutInputCurrentPassword.setVisibility(i9);
    }
}
