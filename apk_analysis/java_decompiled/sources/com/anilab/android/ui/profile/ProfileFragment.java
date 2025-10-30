package com.anilab.android.ui.profile;

import A7.e;
import A7.f;
import A7.n;
import B7.j;
import B7.l;
import F1.c;
import H2.y;
import J1.AbstractC0189m0;
import L1.S;
import N1.t;
import W.g;
import Y2.r;
import Y7.B;
import Z0.a;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.InterfaceC0561w;
import androidx.lifecycle.Y;
import c2.C0762h;
import co.notix.R;
import com.anilab.android.ui.main.HostFragment;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import h2.AbstractC1269a;
import h2.C1272d;
import h2.C1273e;
import h2.C1275g;
import i0.AbstractComponentCallbacksC1366v;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;
import t1.C1992a;
import t1.C2004m;
import u0.C2030a;

/* loaded from: classes.dex */
public final class ProfileFragment extends AbstractC1269a<C1275g, AbstractC0189m0> {

    /* renamed from: D0, reason: collision with root package name */
    public final r f13818D0;

    /* renamed from: E0, reason: collision with root package name */
    public final r f13819E0;

    public ProfileFragment() {
        e p9 = a.p(f.f545a, new e2.e(4, new C1273e(this, 3)));
        this.f13818D0 = M4.a.i(this, p.a(C1275g.class), new C0762h(p9, 14), new C0762h(p9, 15), new t(this, p9, 22));
        this.f13819E0 = M4.a.i(this, p.a(S.class), new C1273e(this, 0), new C1273e(this, 1), new C1273e(this, 2));
    }

    @Override // M1.n, i0.AbstractComponentCallbacksC1366v
    public final void O() {
        super.O();
        s0();
    }

    @Override // M1.n
    public final int f0() {
        return R.layout.fragment_profile;
    }

    @Override // M1.n
    public final M1.r h0() {
        return (C1275g) this.f13818D0.getValue();
    }

    @Override // M1.n
    public final void k0(int i9) {
        InterfaceC0561w interfaceC0561w;
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v;
        HostFragment hostFragment;
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v2;
        HostFragment hostFragment2;
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v3;
        HostFragment hostFragment3;
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v4;
        HostFragment hostFragment4;
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v5;
        HostFragment hostFragment5;
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v6;
        HostFragment hostFragment6;
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v7;
        HostFragment hostFragment7;
        HostFragment hostFragment8 = null;
        switch (i9) {
            case R.id.buttonContinue /* 2131361914 */:
                AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v8 = this.f18419v;
                if (abstractComponentCallbacksC1366v8 != null) {
                    interfaceC0561w = abstractComponentCallbacksC1366v8.f18419v;
                } else {
                    interfaceC0561w = null;
                }
                if (interfaceC0561w instanceof HostFragment) {
                    hostFragment8 = (HostFragment) interfaceC0561w;
                }
                if (hostFragment8 != null) {
                    hostFragment8.j0(new C2030a(R.id.goToLogin));
                    return;
                }
                return;
            case R.id.buttonEditProfile /* 2131361919 */:
                AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v9 = this.f18419v;
                if (abstractComponentCallbacksC1366v9 != null) {
                    abstractComponentCallbacksC1366v = abstractComponentCallbacksC1366v9.f18419v;
                } else {
                    abstractComponentCallbacksC1366v = null;
                }
                if (abstractComponentCallbacksC1366v instanceof HostFragment) {
                    hostFragment = (HostFragment) abstractComponentCallbacksC1366v;
                } else {
                    hostFragment = null;
                }
                if (hostFragment != null) {
                    hostFragment.i0(R.id.hostToEditProfile, null);
                    return;
                }
                return;
            case R.id.buttonHelpCenter /* 2131361926 */:
                AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v10 = this.f18419v;
                if (abstractComponentCallbacksC1366v10 != null) {
                    abstractComponentCallbacksC1366v2 = abstractComponentCallbacksC1366v10.f18419v;
                } else {
                    abstractComponentCallbacksC1366v2 = null;
                }
                if (abstractComponentCallbacksC1366v2 instanceof HostFragment) {
                    hostFragment2 = (HostFragment) abstractComponentCallbacksC1366v2;
                } else {
                    hostFragment2 = null;
                }
                if (hostFragment2 != null) {
                    hostFragment2.i0(R.id.hostToHelpCenter, null);
                    return;
                }
                return;
            case R.id.buttonImportExportMal /* 2131361928 */:
                AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v11 = this.f18419v;
                if (abstractComponentCallbacksC1366v11 != null) {
                    abstractComponentCallbacksC1366v3 = abstractComponentCallbacksC1366v11.f18419v;
                } else {
                    abstractComponentCallbacksC1366v3 = null;
                }
                if (abstractComponentCallbacksC1366v3 instanceof HostFragment) {
                    hostFragment3 = (HostFragment) abstractComponentCallbacksC1366v3;
                } else {
                    hostFragment3 = null;
                }
                if (hostFragment3 != null) {
                    hostFragment3.i0(R.id.hostToMalSync, null);
                    return;
                }
                return;
            case R.id.buttonLogout /* 2131361934 */:
                AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v12 = this.f18419v;
                if (abstractComponentCallbacksC1366v12 != null) {
                    abstractComponentCallbacksC1366v4 = abstractComponentCallbacksC1366v12.f18419v;
                } else {
                    abstractComponentCallbacksC1366v4 = null;
                }
                if (abstractComponentCallbacksC1366v4 instanceof HostFragment) {
                    hostFragment4 = (HostFragment) abstractComponentCallbacksC1366v4;
                } else {
                    hostFragment4 = null;
                }
                if (hostFragment4 != null) {
                    hostFragment4.i0(R.id.hostToConfirmLogout, null);
                    return;
                }
                return;
            case R.id.buttonPlayerSettings /* 2131361943 */:
                AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v13 = this.f18419v;
                if (abstractComponentCallbacksC1366v13 != null) {
                    abstractComponentCallbacksC1366v5 = abstractComponentCallbacksC1366v13.f18419v;
                } else {
                    abstractComponentCallbacksC1366v5 = null;
                }
                if (abstractComponentCallbacksC1366v5 instanceof HostFragment) {
                    hostFragment5 = (HostFragment) abstractComponentCallbacksC1366v5;
                } else {
                    hostFragment5 = null;
                }
                if (hostFragment5 != null) {
                    hostFragment5.i0(R.id.hostToPlayerSettings, null);
                    return;
                }
                return;
            case R.id.buttonSecurity /* 2131361953 */:
                AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v14 = this.f18419v;
                if (abstractComponentCallbacksC1366v14 != null) {
                    abstractComponentCallbacksC1366v6 = abstractComponentCallbacksC1366v14.f18419v;
                } else {
                    abstractComponentCallbacksC1366v6 = null;
                }
                if (abstractComponentCallbacksC1366v6 instanceof HostFragment) {
                    hostFragment6 = (HostFragment) abstractComponentCallbacksC1366v6;
                } else {
                    hostFragment6 = null;
                }
                if (hostFragment6 != null) {
                    hostFragment6.i0(R.id.hostToSecurity, null);
                    return;
                }
                return;
            case R.id.buttonSubtitle /* 2131361965 */:
                AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v15 = this.f18419v;
                if (abstractComponentCallbacksC1366v15 != null) {
                    abstractComponentCallbacksC1366v7 = abstractComponentCallbacksC1366v15.f18419v;
                } else {
                    abstractComponentCallbacksC1366v7 = null;
                }
                if (abstractComponentCallbacksC1366v7 instanceof HostFragment) {
                    hostFragment7 = (HostFragment) abstractComponentCallbacksC1366v7;
                } else {
                    hostFragment7 = null;
                }
                if (hostFragment7 != null) {
                    hostFragment7.i0(R.id.hostToSubtitleSettings, null);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // M1.n
    public final void l0() {
        B.r(Y.f(this), null, new C1272d(null, this), 3);
    }

    @Override // M1.n
    public final List m0(g gVar) {
        AbstractC0189m0 abstractC0189m0 = (AbstractC0189m0) gVar;
        return l.b0(abstractC0189m0.f4010w, abstractC0189m0.f4013z, abstractC0189m0.f4009v, abstractC0189m0.f4001B, abstractC0189m0.f4011x, abstractC0189m0.f4002C, abstractC0189m0.f4012y, abstractC0189m0.f4000A);
    }

    @Override // M1.n
    public final void p0() {
        s0();
    }

    public final n s0() {
        int i9;
        AbstractC0189m0 abstractC0189m0 = (AbstractC0189m0) e0();
        Group groupProfile = abstractC0189m0.f4003D;
        h.d(groupProfile, "groupProfile");
        r rVar = this.f13818D0;
        int i10 = 8;
        if (((C1275g) rVar.getValue()).f17877g.f5769a.b()) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        groupProfile.setVisibility(i9);
        Group groupSignInRequire = abstractC0189m0.f4004E;
        h.d(groupSignInRequire, "groupSignInRequire");
        if (!((C1275g) rVar.getValue()).f17877g.f5769a.b()) {
            i10 = 0;
        }
        groupSignInRequire.setVisibility(i10);
        y a5 = ((C1275g) rVar.getValue()).f17876f.a();
        String str = null;
        if (a5 == null) {
            return null;
        }
        AppCompatImageView imageAvatar = abstractC0189m0.f4005F;
        h.d(imageAvatar, "imageAvatar");
        String str2 = a5.f3090d;
        if (str2 != null) {
            str = W7.l.J(str2, "150x150", "250x250");
        }
        C2004m a9 = C1992a.a(imageAvatar.getContext());
        C1.h hVar = new C1.h(imageAvatar.getContext());
        hVar.f1179c = str;
        hVar.b(imageAvatar);
        hVar.f1181e = AbstractC1002u1.e0(j.o0(new c[]{new F1.a()}));
        a9.b(hVar.a());
        abstractC0189m0.f4006G.setText(a5.f3088b);
        abstractC0189m0.f4007H.setText(a5.f3089c);
        return n.f558a;
    }
}
