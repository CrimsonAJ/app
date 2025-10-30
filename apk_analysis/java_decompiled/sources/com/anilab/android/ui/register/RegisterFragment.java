package com.anilab.android.ui.register;

import A7.e;
import A7.f;
import B7.l;
import J1.AbstractC0197q0;
import M1.n;
import N1.t;
import W.g;
import W7.d;
import Y2.r;
import Y7.B;
import Z0.a;
import android.view.View;
import androidx.lifecycle.Y;
import c2.C0762h;
import co.notix.R;
import com.google.android.gms.internal.measurement.Y1;
import g.C1188a;
import g6.o;
import i0.AbstractActivityC1369y;
import i0.C1359o;
import j2.AbstractC1434a;
import j2.C1435b;
import j2.i;
import j2.j;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class RegisterFragment extends AbstractC1434a<j, AbstractC0197q0> {

    /* renamed from: D0, reason: collision with root package name */
    public final r f13823D0;

    /* renamed from: E0, reason: collision with root package name */
    public final C1359o f13824E0;

    public RegisterFragment() {
        e p9 = a.p(f.f545a, new e2.e(7, new e2.e(6, this)));
        this.f13823D0 = M4.a.i(this, p.a(j.class), new C0762h(p9, 18), new C0762h(p9, 19), new t(this, p9, 24));
        this.f13824E0 = (C1359o) V(new C1435b(0, this), new C1188a(2));
    }

    @Override // M1.n
    public final int f0() {
        return R.layout.fragment_register;
    }

    @Override // M1.n
    public final M1.r h0() {
        return (j) this.f13823D0.getValue();
    }

    @Override // M1.n
    public final void k0(int i9) {
        r rVar = this.f13823D0;
        switch (i9) {
            case R.id.buttonBack /* 2131361905 */:
                n.q0(this);
                return;
            case R.id.buttonContinueWithGoogle /* 2131361915 */:
                AbstractActivityC1369y k5 = k();
                if (k5 != null) {
                    ((j) rVar.getValue()).f19224h.getClass();
                    Y1.B(k5, this.f13824E0, o.f17761a.J());
                    return;
                }
                return;
            case R.id.buttonSignUp /* 2131361961 */:
                AbstractC0197q0 abstractC0197q0 = (AbstractC0197q0) e0();
                j jVar = (j) rVar.getValue();
                String displayName = d.j0(String.valueOf(abstractC0197q0.f4057y.getText())).toString();
                String email = d.j0(String.valueOf(abstractC0197q0.f4058z.getText())).toString();
                String password = d.j0(String.valueOf(abstractC0197q0.f4049A.getText())).toString();
                String retypePassword = d.j0(String.valueOf(abstractC0197q0.f4050B.getText())).toString();
                jVar.getClass();
                h.e(displayName, "displayName");
                h.e(email, "email");
                h.e(password, "password");
                h.e(retypePassword, "retypePassword");
                jVar.d(true, new i(password, retypePassword, jVar, email, displayName, null));
                return;
            case R.id.textSignIn /* 2131362775 */:
                i0(R.id.registerToSignIn, null);
                return;
            default:
                return;
        }
    }

    @Override // M1.n
    public final void l0() {
        B.r(Y.f(this), null, new j2.e(null, this), 3);
    }

    @Override // M1.n
    public final List m0(g gVar) {
        AbstractC0197q0 abstractC0197q0 = (AbstractC0197q0) gVar;
        View view = abstractC0197q0.f4051C.f7853k;
        return l.b0(abstractC0197q0.f4054v, abstractC0197q0.f4052D, abstractC0197q0.f4056x, view, abstractC0197q0.f4055w);
    }

    @Override // M1.n
    public final void n0(boolean z9) {
        int i9;
        View view = ((AbstractC0197q0) e0()).f4051C.f7853k;
        h.d(view, "getRoot(...)");
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
