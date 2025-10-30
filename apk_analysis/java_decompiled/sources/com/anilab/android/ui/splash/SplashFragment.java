package com.anilab.android.ui.splash;

import A7.e;
import A7.f;
import J1.A0;
import K5.ViewOnClickListenerC0215a;
import M1.E;
import Y2.r;
import Y7.B;
import Z0.a;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.Y;
import co.notix.R;
import com.google.android.material.button.MaterialButton;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;
import o2.C1688o;
import o2.C1689p;
import p2.AbstractC1848a;
import p2.C1851d;
import p2.C1855h;

/* loaded from: classes.dex */
public final class SplashFragment extends AbstractC1848a<C1855h, A0> {

    /* renamed from: D0, reason: collision with root package name */
    public final r f13838D0;

    public SplashFragment() {
        e p9 = a.p(f.f545a, new e2.e(21, new e2.e(20, this)));
        this.f13838D0 = M4.a.i(this, p.a(C1855h.class), new C1688o(p9, 2), new C1688o(p9, 3), new C1689p(this, p9, 1));
    }

    @Override // M1.n
    public final int f0() {
        return R.layout.fragment_splash;
    }

    @Override // M1.n
    public final M1.r h0() {
        return (C1855h) this.f13838D0.getValue();
    }

    @Override // M1.n
    public final void l0() {
        B.r(Y.f(this), null, new C1851d(null, this), 3);
    }

    @Override // M1.n
    public final void o0(E uiText) {
        h.e(uiText, "uiText");
        super.o0(uiText);
        ((A0) e0()).f3609w.clearAnimation();
        AppCompatImageView imageLoading = ((A0) e0()).f3609w;
        h.d(imageLoading, "imageLoading");
        imageLoading.setVisibility(8);
        MaterialButton buttonRetry = ((A0) e0()).f3608v;
        h.d(buttonRetry, "buttonRetry");
        buttonRetry.setVisibility(0);
    }

    @Override // M1.n
    public final void p0() {
        s0();
        A0 a02 = (A0) e0();
        a02.f3608v.setOnClickListener(new ViewOnClickListenerC0215a(18, this));
    }

    public final void s0() {
        Animation loadAnimation = AnimationUtils.loadAnimation(m(), R.anim.animation_rotate);
        loadAnimation.setFillAfter(true);
        loadAnimation.setInterpolator(new LinearInterpolator());
        ((A0) e0()).f3609w.startAnimation(loadAnimation);
    }
}
