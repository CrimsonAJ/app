package com.anilab.android.ui.player;

import A6.s;
import A7.l;
import B7.m;
import B7.t;
import D.n;
import F4.y;
import H2.u;
import H2.x;
import I2.b;
import J1.AbstractC0165c;
import J5.f;
import M1.C;
import M1.D;
import M1.E;
import M1.ViewOnClickListenerC0245a;
import P.H;
import P.Q;
import P.v0;
import P5.F;
import Q2.C0361d;
import Q2.O;
import R1.C0383b;
import R1.q;
import T2.d;
import X0.k;
import Y2.r;
import Y7.B;
import Y7.y0;
import Z0.a;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.mediarouter.app.C0568d;
import androidx.mediarouter.app.MediaRouteButton;
import androidx.recyclerview.widget.RecyclerView;
import b7.C0701c;
import co.notix.R;
import co.notix.interstitial.InterstitialLoader;
import com.anilab.android.App;
import com.anilab.android.ui.player.PlayerActivity;
import com.anilab.android.ui.views.FreakIntroButton;
import com.anilab.android.ui.views.FreakSpinner;
import com.anilab.android.ui.views.FreakToggleGroup;
import com.anilab.exoplayer.StyledPlayerView;
import com.anilab.exoplayer.SubtitleView;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.internal.measurement.Y1;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.slider.Slider;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.messaging.i;
import g2.AbstractActivityC1226c;
import g2.C1199A;
import g2.C1201C;
import g2.C1202D;
import g2.C1203E;
import g2.C1205G;
import g2.C1207I;
import g2.C1215Q;
import g2.C1216S;
import g2.C1219V;
import g2.C1222Y;
import g2.C1223Z;
import g2.C1225b;
import g2.C1227d;
import g2.C1228e;
import g2.C1229f;
import g2.C1237n;
import g2.ViewOnClickListenerC1232i;
import g2.a0;
import g2.c0;
import i0.C1334K;
import i0.C1337N;
import i0.C1367w;
import i0.InterfaceC1332I;
import j3.C1441D;
import j3.C1446b0;
import j3.C1447c;
import j3.C1461l;
import j3.C1462m;
import j3.F0;
import j3.G0;
import j3.InterfaceC1466q;
import j3.K;
import j3.M;
import j3.Y;
import j3.l0;
import j3.m0;
import j3.n0;
import j3.o0;
import j3.p0;
import j3.q0;
import j3.r0;
import j3.z0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import k3.C1489e;
import k4.C1505e;
import k4.C1518s;
import k4.InterfaceC1506f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;
import l4.AbstractC1566a;
import l4.w;
import l6.AbstractC1570b;
import m4.v;
import o2.C1685l;
import o2.C1686m;
import o3.e;
import r2.c;
import u4.AbstractC2076a;
import u4.C2077b;
import u4.C2079d;
import u4.j;
import u4.z;
import u6.C2083b;

/* loaded from: classes.dex */
public final class PlayerActivity extends AbstractActivityC1226c implements p0 {

    /* renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f13798w0 = 0;

    /* renamed from: D, reason: collision with root package name */
    public AbstractC0165c f13799D;

    /* renamed from: X, reason: collision with root package name */
    public final r f13800X;
    public boolean Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f13801Z;

    /* renamed from: g0, reason: collision with root package name */
    public final l f13803g0;

    /* renamed from: h0, reason: collision with root package name */
    public final l f13804h0;

    /* renamed from: i0, reason: collision with root package name */
    public final l f13805i0;

    /* renamed from: q0, reason: collision with root package name */
    public y0 f13813q0;
    public y0 r0;

    /* renamed from: s0, reason: collision with root package name */
    public y0 f13814s0;

    /* renamed from: u0, reason: collision with root package name */
    public d f13816u0;

    /* renamed from: v0, reason: collision with root package name */
    public FreakIntroButton f13817v0;

    /* renamed from: f0, reason: collision with root package name */
    public c f13802f0 = c.f22597a;

    /* renamed from: j0, reason: collision with root package name */
    public final l f13806j0 = a.q(new C1227d(this, 4));

    /* renamed from: k0, reason: collision with root package name */
    public final l f13807k0 = a.q(new C1227d(this, 5));

    /* renamed from: l0, reason: collision with root package name */
    public final l f13808l0 = a.q(new C1227d(this, 8));

    /* renamed from: m0, reason: collision with root package name */
    public final l f13809m0 = a.q(new C1227d(this, 9));

    /* renamed from: n0, reason: collision with root package name */
    public final l f13810n0 = a.q(new C1227d(this, 10));

    /* renamed from: o0, reason: collision with root package name */
    public final l f13811o0 = a.q(new C1227d(this, 11));

    /* renamed from: p0, reason: collision with root package name */
    public final l f13812p0 = a.q(new C1227d(this, 12));

    /* renamed from: t0, reason: collision with root package name */
    public final List f13815t0 = B7.l.b0(Integer.valueOf(R.id.buttonEpisodes), Integer.valueOf(R.id.buttonServer), Integer.valueOf(R.id.buttonSettings), Integer.valueOf(R.id.exo_playback_speed), Integer.valueOf(R.id.exo_rew_with_amount), Integer.valueOf(R.id.exo_ffwd_with_amount));

    public PlayerActivity() {
        int i9 = 0;
        int i10 = 1;
        int i11 = 2;
        this.f13800X = new r(p.a(a0.class), new C1207I(this, i10), new C1207I(this, i9), new C1207I(this, i11));
        this.f13803g0 = a.q(new C1227d(this, i9));
        this.f13804h0 = a.q(new C1227d(this, i10));
        this.f13805i0 = a.q(new C1227d(this, i11));
    }

    public static final void T(PlayerActivity playerActivity) {
        u j = playerActivity.d0().j(playerActivity.Z().T(), playerActivity.Z().H());
        Intent intent = new Intent();
        intent.putExtra("extra_id", j.f3065a);
        intent.putExtra("extra_name", j.f3068d);
        intent.putExtra("extra_poster", j.f3069e);
        intent.putExtra("extra_episode_id", j.f3066b);
        intent.putExtra("extra_position_ms", j.f3067c);
        intent.putExtra("extra_percent", j.f3070f);
        intent.putExtra("extra_year", j.f3071g);
        intent.putStringArrayListExtra("extra_al_names", new ArrayList<>(j.f3072h));
        playerActivity.setResult(-1, intent);
        playerActivity.finish();
    }

    @Override // j3.p0
    public final /* synthetic */ void A(m0 m0Var) {
    }

    @Override // j3.p0
    public final /* synthetic */ void B(C1446b0 c1446b0) {
    }

    @Override // j3.p0
    public final /* synthetic */ void C(boolean z9) {
    }

    @Override // j3.p0
    public final /* synthetic */ void E(int i9, q0 q0Var, q0 q0Var2) {
    }

    @Override // j3.p0
    public final /* synthetic */ void F(int i9, int i10) {
    }

    @Override // j3.p0
    public final void G(C1462m error) {
        List list;
        h.e(error, "error");
        a0 d02 = d0();
        long T8 = Z().T();
        Iterator it = d02.f17638o.f3471f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            I2.a aVar = (I2.a) it.next();
            if (aVar.j) {
                aVar.f3452i = T8;
                if (d02.f17640q) {
                    list = aVar.f3449f;
                } else {
                    list = aVar.f3448e;
                }
                int i9 = 0;
                for (Object obj : list) {
                    int i10 = i9 + 1;
                    if (i9 >= 0) {
                        if (h.a(((b) obj).f3457b, aVar.f3450g.f3457b) && i9 < B7.l.a0(list)) {
                            b bVar = (b) list.get(i10);
                            h.e(bVar, "<set-?>");
                            aVar.f3450g = bVar;
                            d02.m(false, false);
                            return;
                        }
                        i9 = i10;
                    } else {
                        B7.l.e0();
                        throw null;
                    }
                }
                if (!d02.f17640q) {
                    d02.d(false, new C1223Z(true, d02, aVar.f3452i, null));
                    return;
                }
            }
        }
        f0(new D(R.string.msg_unknown_error));
    }

    @Override // j3.p0
    public final /* synthetic */ void I(C1462m c1462m) {
    }

    @Override // j3.p0
    public final /* synthetic */ void K(Y y9, int i9) {
    }

    @Override // j3.p0
    public final /* synthetic */ void M(int i9, boolean z9) {
    }

    @Override // j3.p0
    public final /* synthetic */ void N(boolean z9) {
    }

    public final void U(StyledPlayerView styledPlayerView, float f9) {
        Resources resources;
        SubtitleView subtitleView = styledPlayerView.getSubtitleView();
        if (subtitleView != null) {
            subtitleView.setPadding(0, 0, 0, c0(f9));
            float f10 = d0().f17645v.f3475d * f9;
            Context context = subtitleView.getContext();
            if (context == null) {
                resources = Resources.getSystem();
            } else {
                resources = context.getResources();
            }
            float applyDimension = TypedValue.applyDimension(2, f10, resources.getDisplayMetrics());
            subtitleView.f14478c = 2;
            subtitleView.f14479d = applyDimension;
            subtitleView.c();
        }
    }

    public final void V(boolean z9) {
        if (((n) Z()).I().o() > 0) {
            a0 d02 = d0();
            long T8 = Z().T();
            long H8 = Z().H();
            d02.getClass();
            d02.d(false, new C1215Q(z9, d02, T8, H8, null));
            d02.d(false, new C1216S(T8, H8, null, d02));
        }
    }

    public final View W(int i9, O7.l lVar) {
        AbstractC0165c abstractC0165c = this.f13799D;
        if (abstractC0165c != null) {
            View findViewById = abstractC0165c.f3853N.findViewById(i9);
            if (findViewById == null) {
                return null;
            }
            lVar.invoke(findViewById);
            return findViewById;
        }
        h.h("binding");
        throw null;
    }

    public final C2077b X() {
        return (C2077b) this.f13803g0.getValue();
    }

    public final e Y() {
        return (e) this.f13804h0.getValue();
    }

    public final r0 Z() {
        if (this.Y) {
            return Y();
        }
        return b0();
    }

    @Override // j3.p0
    public final /* synthetic */ void a(int i9) {
    }

    public final C1225b a0() {
        return (C1225b) this.f13808l0.getValue();
    }

    @Override // j3.p0
    public final /* synthetic */ void b(int i9) {
    }

    public final InterfaceC1466q b0() {
        return (InterfaceC1466q) this.f13806j0.getValue();
    }

    public final int c0(float f9) {
        int i9;
        int integer = getResources().getInteger(R.integer.span_count);
        int j = M4.a.j(this, (int) (d0().f17645v.f3474c * f9));
        if (integer == 3) {
            i9 = 2;
        } else {
            i9 = 1;
        }
        return j * i9;
    }

    @Override // j3.p0
    public final /* synthetic */ void d(n0 n0Var) {
    }

    public final a0 d0() {
        return (a0) this.f13800X.getValue();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC0165c abstractC0165c = this.f13799D;
        if (abstractC0165c != null) {
            final AppCompatImageView buttonUnlock = abstractC0165c.f3842B;
            h.d(buttonUnlock, "buttonUnlock");
            if (motionEvent != null && motionEvent.getAction() == 0) {
                AbstractC0165c abstractC0165c2 = this.f13799D;
                if (abstractC0165c2 != null) {
                    if (!abstractC0165c2.f3853N.getUseController() && buttonUnlock.getVisibility() != 0) {
                        buttonUnlock.clearAnimation();
                        final int i9 = 0;
                        ViewPropertyAnimator withStartAction = buttonUnlock.animate().withStartAction(new Runnable() { // from class: g2.k
                            @Override // java.lang.Runnable
                            public final void run() {
                                ImageView imageView = buttonUnlock;
                                switch (i9) {
                                    case 0:
                                        int i10 = PlayerActivity.f13798w0;
                                        imageView.setVisibility(0);
                                        return;
                                    default:
                                        int i11 = PlayerActivity.f13798w0;
                                        imageView.setVisibility(8);
                                        return;
                                }
                            }
                        });
                        final int i10 = 1;
                        withStartAction.withEndAction(new Runnable() { // from class: g2.k
                            @Override // java.lang.Runnable
                            public final void run() {
                                ImageView imageView = buttonUnlock;
                                switch (i10) {
                                    case 0:
                                        int i102 = PlayerActivity.f13798w0;
                                        imageView.setVisibility(0);
                                        return;
                                    default:
                                        int i11 = PlayerActivity.f13798w0;
                                        imageView.setVisibility(8);
                                        return;
                                }
                            }
                        }).setDuration(2000L).start();
                    }
                } else {
                    h.h("binding");
                    throw null;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        h.h("binding");
        throw null;
    }

    public final void e0(boolean z9) {
        AbstractC0165c abstractC0165c = this.f13799D;
        if (abstractC0165c != null) {
            y0 y0Var = this.f13814s0;
            if (y0Var != null) {
                y0Var.d(null);
            }
            this.f13814s0 = B.r(androidx.lifecycle.Y.f(this), null, new C1237n(z9, abstractC0165c, null), 3);
            return;
        }
        h.h("binding");
        throw null;
    }

    @Override // j3.p0
    public final /* synthetic */ void f(C1461l c1461l) {
    }

    public final void f0(E e8) {
        String string;
        if (e8 instanceof C) {
            string = ((C) e8).f4703a;
        } else if (e8 instanceof D) {
            string = getString(((D) e8).f4704a);
            h.d(string, "getString(...)");
        } else {
            throw new RuntimeException();
        }
        AbstractC0165c abstractC0165c = this.f13799D;
        if (abstractC0165c != null) {
            I5.l g9 = I5.l.g(abstractC0165c.f7853k, string);
            g9.h(new ViewOnClickListenerC0245a(2));
            g9.i();
            return;
        }
        h.h("binding");
        throw null;
    }

    @Override // j3.p0
    public final /* synthetic */ void g(v vVar) {
    }

    public final void g0(M1.u uVar) {
        AbstractC0165c abstractC0165c = this.f13799D;
        if (abstractC0165c != null) {
            Y1.p(this);
            ConstraintLayout layoutSubSync = abstractC0165c.f3852M;
            h.d(layoutSubSync, "layoutSubSync");
            layoutSubSync.setVisibility(8);
            int ordinal = uVar.ordinal();
            List list = this.f13815t0;
            Slider sliderVolume = abstractC0165c.f3858S;
            AppCompatImageView buttonUnlock = abstractC0165c.f3842B;
            CoordinatorLayout layoutContainer = abstractC0165c.f3850J;
            FrameLayout layoutComment = abstractC0165c.f3849I;
            StyledPlayerView playerView = abstractC0165c.f3853N;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    C1337N P8 = P();
                    P8.getClass();
                    P8.v(new C1334K(P8, null, -1, 0), false);
                    l0(false);
                    h.d(playerView, "playerView");
                    U(playerView, 1.0f);
                    ViewGroup.LayoutParams layoutParams = playerView.getLayoutParams();
                    if (layoutParams != null) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                        layoutParams2.height = -1;
                        layoutParams2.width = -1;
                        playerView.setLayoutParams(layoutParams2);
                        Q2.D d9 = playerView.j;
                        if (d9 != null) {
                            d9.f6061I0.dismiss();
                        }
                        h.d(layoutComment, "layoutComment");
                        layoutComment.setVisibility(8);
                        h.d(layoutContainer, "layoutContainer");
                        layoutContainer.setVisibility(8);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            int intValue = ((Number) it.next()).intValue();
                            AbstractC0165c abstractC0165c2 = this.f13799D;
                            if (abstractC0165c2 != null) {
                                View findViewById = abstractC0165c2.f3853N.findViewById(intValue);
                                if (findViewById != null) {
                                    findViewById.setVisibility(0);
                                }
                            } else {
                                h.h("binding");
                                throw null;
                            }
                        }
                        h.d(buttonUnlock, "buttonUnlock");
                        ViewGroup.LayoutParams layoutParams3 = buttonUnlock.getLayoutParams();
                        if (layoutParams3 != null) {
                            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                            layoutParams4.topMargin = getResources().getDimensionPixelSize(R.dimen.dp_192);
                            buttonUnlock.setLayoutParams(layoutParams4);
                            h.d(sliderVolume, "sliderVolume");
                            ViewGroup.LayoutParams layoutParams5 = sliderVolume.getLayoutParams();
                            if (layoutParams5 != null) {
                                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
                                layoutParams6.topMargin = getResources().getDimensionPixelSize(R.dimen.dp_192);
                                layoutParams6.leftMargin = getResources().getDimensionPixelSize(R.dimen.dp_8);
                                sliderVolume.setLayoutParams(layoutParams6);
                                W(R.id.exo_progress, new C1229f(this, 5));
                                AbstractC0165c abstractC0165c3 = this.f13799D;
                                if (abstractC0165c3 != null) {
                                    View findViewById2 = abstractC0165c3.f3853N.findViewById(R.id.exo_position);
                                    if (findViewById2 != null) {
                                        ViewGroup.LayoutParams layoutParams7 = findViewById2.getLayoutParams();
                                        if (layoutParams7 != null) {
                                            FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) layoutParams7;
                                            layoutParams8.leftMargin = getResources().getDimensionPixelSize(R.dimen.dp_26);
                                            findViewById2.setLayoutParams(layoutParams8);
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                        }
                                    }
                                    AbstractC0165c abstractC0165c4 = this.f13799D;
                                    if (abstractC0165c4 != null) {
                                        View findViewById3 = abstractC0165c4.f3853N.findViewById(R.id.exo_duration);
                                        if (findViewById3 != null) {
                                            ViewGroup.LayoutParams layoutParams9 = findViewById3.getLayoutParams();
                                            if (layoutParams9 != null) {
                                                FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) layoutParams9;
                                                layoutParams10.rightMargin = getResources().getDimensionPixelSize(R.dimen.dp_26);
                                                findViewById3.setLayoutParams(layoutParams10);
                                            } else {
                                                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                            }
                                        }
                                        W(R.id.layoutBottomControls, new C1229f(this, 2));
                                        return;
                                    }
                                    h.h("binding");
                                    throw null;
                                }
                                h.h("binding");
                                throw null;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                throw new RuntimeException();
            }
            l0(true);
            h.d(playerView, "playerView");
            U(playerView, 0.74766356f);
            ViewGroup.LayoutParams layoutParams11 = playerView.getLayoutParams();
            if (layoutParams11 != null) {
                FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) layoutParams11;
                layoutParams12.height = getResources().getDimensionPixelSize(R.dimen.dp_320);
                layoutParams12.width = -1;
                playerView.setLayoutParams(layoutParams12);
                Q2.D d10 = playerView.j;
                if (d10 != null) {
                    d10.f6061I0.dismiss();
                }
                h.d(layoutComment, "layoutComment");
                layoutComment.setVisibility(0);
                h.d(layoutContainer, "layoutContainer");
                layoutContainer.setVisibility(0);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    int intValue2 = ((Number) it2.next()).intValue();
                    AbstractC0165c abstractC0165c5 = this.f13799D;
                    if (abstractC0165c5 != null) {
                        View findViewById4 = abstractC0165c5.f3853N.findViewById(intValue2);
                        if (findViewById4 != null) {
                            findViewById4.setVisibility(8);
                        }
                    } else {
                        h.h("binding");
                        throw null;
                    }
                }
                h.d(buttonUnlock, "buttonUnlock");
                ViewGroup.LayoutParams layoutParams13 = buttonUnlock.getLayoutParams();
                if (layoutParams13 != null) {
                    FrameLayout.LayoutParams layoutParams14 = (FrameLayout.LayoutParams) layoutParams13;
                    layoutParams14.topMargin = getResources().getDimensionPixelSize(R.dimen.dp_138);
                    buttonUnlock.setLayoutParams(layoutParams14);
                    h.d(sliderVolume, "sliderVolume");
                    ViewGroup.LayoutParams layoutParams15 = sliderVolume.getLayoutParams();
                    if (layoutParams15 != null) {
                        FrameLayout.LayoutParams layoutParams16 = (FrameLayout.LayoutParams) layoutParams15;
                        layoutParams16.topMargin = getResources().getDimensionPixelSize(R.dimen.dp_120);
                        layoutParams16.leftMargin = 0;
                        sliderVolume.setLayoutParams(layoutParams16);
                        W(R.id.exo_progress, new C1229f(this, 3));
                        AbstractC0165c abstractC0165c6 = this.f13799D;
                        if (abstractC0165c6 != null) {
                            View findViewById5 = abstractC0165c6.f3853N.findViewById(R.id.exo_position);
                            if (findViewById5 != null) {
                                ViewGroup.LayoutParams layoutParams17 = findViewById5.getLayoutParams();
                                if (layoutParams17 != null) {
                                    FrameLayout.LayoutParams layoutParams18 = (FrameLayout.LayoutParams) layoutParams17;
                                    layoutParams18.leftMargin = getResources().getDimensionPixelSize(R.dimen.dp_20);
                                    findViewById5.setLayoutParams(layoutParams18);
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                }
                            }
                            AbstractC0165c abstractC0165c7 = this.f13799D;
                            if (abstractC0165c7 != null) {
                                View findViewById6 = abstractC0165c7.f3853N.findViewById(R.id.exo_duration);
                                if (findViewById6 != null) {
                                    ViewGroup.LayoutParams layoutParams19 = findViewById6.getLayoutParams();
                                    if (layoutParams19 != null) {
                                        FrameLayout.LayoutParams layoutParams20 = (FrameLayout.LayoutParams) layoutParams19;
                                        layoutParams20.rightMargin = getResources().getDimensionPixelSize(R.dimen.dp_20);
                                        findViewById6.setLayoutParams(layoutParams20);
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                    }
                                }
                                W(R.id.layoutBottomControls, new C1229f(this, 4));
                                return;
                            }
                            h.h("binding");
                            throw null;
                        }
                        h.h("binding");
                        throw null;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        h.h("binding");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r4v9, types: [j3.a0, java.lang.Object] */
    public final void h0(boolean z9) {
        A7.h hVar;
        FreakIntroButton freakIntroButton;
        long[] jArr;
        long[] jArr2;
        int i9 = 1;
        I2.a aVar = d0().f17639p;
        if (this.Y) {
            ?? obj = new Object();
            obj.f19506a = d0().f17638o.f3468c;
            C1446b0 c1446b0 = new C1446b0(obj);
            Y2.h d9 = s8.n.d(aVar, d0().f17645v.f3479h, d0().f17645v.j);
            d9.f8618h = c1446b0;
            Y c3 = d9.c();
            if (aVar.f3452i == 0) {
                e Y = Y();
                Y.getClass();
                Y.B(F.s(c3));
            } else {
                e Y4 = Y();
                long j = aVar.f3452i;
                Y4.getClass();
                Y4.E(F.s(c3), 0, j);
            }
        } else {
            Y c9 = s8.n.d(aVar, d0().f17645v.f3479h, d0().f17645v.j).c();
            if (aVar.f3452i == 0) {
                n nVar = (n) Z();
                nVar.getClass();
                nVar.B(F.s(c9));
            } else {
                r0 Z6 = Z();
                long j4 = aVar.f3452i;
                n nVar2 = (n) Z6;
                nVar2.getClass();
                nVar2.E(F.s(c9), 0, j4);
            }
        }
        d dVar = this.f13816u0;
        if (dVar != null) {
            A7.h hVar2 = aVar.f3450g.f3459d;
            if (hVar2 != null) {
                jArr = new long[]{((Number) hVar2.f547a).longValue(), ((Number) hVar2.f548b).longValue()};
            } else {
                jArr = null;
            }
            A7.h hVar3 = aVar.f3450g.f3460e;
            if (hVar3 != null) {
                jArr2 = new long[]{((Number) hVar3.f547a).longValue(), ((Number) hVar3.f548b).longValue()};
            } else {
                jArr2 = null;
            }
            dVar.r0 = jArr;
            dVar.f6258s0 = jArr2;
        }
        if (d0().i() && (hVar = aVar.f3450g.f3460e) != null && (freakIntroButton = this.f13817v0) != null) {
            freakIntroButton.setOutroStartMs(((Number) hVar.f548b).longValue());
        }
        Z().b();
        if (z9 && d0().f17646w) {
            try {
                if (AbstractC1570b.n(this)) {
                    if (d0().f17647x) {
                        Z().stop();
                        InterstitialLoader interstitialLoader = App.f13715h;
                        if (interstitialLoader != null) {
                            if (!interstitialLoader.hasNext()) {
                                String str = C1685l.f21533M0;
                                C1337N P8 = P();
                                h.d(P8, "getSupportFragmentManager(...)");
                                String str2 = C1685l.f21533M0;
                                if (P8.C(str2) == null) {
                                    new C1685l().k0(P8, str2);
                                    return;
                                }
                                return;
                            }
                        } else {
                            h.h("interstitialLoader");
                            throw null;
                        }
                    } else {
                        C2083b.a().b(new IllegalArgumentException("615"));
                    }
                }
                InterstitialLoader interstitialLoader2 = App.f13715h;
                if (interstitialLoader2 != null) {
                    interstitialLoader2.doOnNextAvailable(new C1229f(this, i9), 10000L);
                    return;
                } else {
                    h.h("interstitialLoader");
                    throw null;
                }
            } catch (Exception e8) {
                C2083b.a().b(e8);
                return;
            }
        }
        ((n) Z()).f(true);
    }

    @Override // j3.p0
    public final /* synthetic */ void i(int i9) {
    }

    public final void i0(int i9, View.OnClickListener onClickListener) {
        AbstractC0165c abstractC0165c = this.f13799D;
        if (abstractC0165c != null) {
            View findViewById = abstractC0165c.f3853N.findViewById(i9);
            if (findViewById != null) {
                findViewById.setOnClickListener(onClickListener);
                return;
            }
            return;
        }
        h.h("binding");
        throw null;
    }

    public final void j0(Configuration configuration) {
        int i9 = configuration.orientation;
        M1.u uVar = M1.u.f4753a;
        M1.u uVar2 = M1.u.f4754b;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    return;
                }
                g0(uVar2);
                return;
            }
            g0(uVar);
            return;
        }
        if (configuration.screenWidthDp > configuration.screenHeightDp) {
            g0(uVar2);
        } else {
            g0(uVar);
        }
    }

    @Override // j3.p0
    public final /* synthetic */ void k(boolean z9) {
    }

    public final void k0() {
        AbstractC0165c abstractC0165c = this.f13799D;
        if (abstractC0165c != null) {
            boolean z9 = this.Y;
            StyledPlayerView styledPlayerView = abstractC0165c.f3853N;
            if (z9) {
                styledPlayerView.setPlayer(Y());
                styledPlayerView.setControllerHideOnTouch(false);
                styledPlayerView.setControllerShowTimeoutMs(0);
                styledPlayerView.setDefaultArtwork(getApplicationContext().getDrawable(R.drawable.bg_player));
                styledPlayerView.setShowBuffering(0);
                AbstractC0165c abstractC0165c2 = this.f13799D;
                if (abstractC0165c2 != null) {
                    View findViewById = abstractC0165c2.f3853N.findViewById(R.id.buttonLockScreen);
                    if (findViewById != null) {
                        findViewById.setVisibility(8);
                    }
                    styledPlayerView.g(styledPlayerView.f());
                    Q2.D d9 = styledPlayerView.j;
                    if (d9 != null) {
                        d9.setCastMediaTrack(t.f1135a);
                        return;
                    }
                    return;
                }
                h.h("binding");
                throw null;
            }
            styledPlayerView.setPlayer(b0());
            styledPlayerView.setDefaultArtwork(null);
            styledPlayerView.setControllerHideOnTouch(true);
            styledPlayerView.setControllerShowTimeoutMs(5000);
            styledPlayerView.setShowBuffering(2);
            AbstractC0165c abstractC0165c3 = this.f13799D;
            if (abstractC0165c3 != null) {
                View findViewById2 = abstractC0165c3.f3853N.findViewById(R.id.buttonLockScreen);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(0);
                    return;
                }
                return;
            }
            h.h("binding");
            throw null;
        }
        h.h("binding");
        throw null;
    }

    @Override // j3.p0
    public final /* synthetic */ void l() {
    }

    public final void l0(boolean z9) {
        s8.e v0Var;
        Y1.E(getWindow(), false);
        Window window = getWindow();
        C0701c c0701c = new C0701c(getWindow().getDecorView());
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 35) {
            v0Var = new P.y0(window, c0701c);
        } else if (i9 >= 30) {
            v0Var = new P.y0(window, c0701c);
        } else if (i9 >= 26) {
            v0Var = new v0(window, c0701c);
        } else {
            v0Var = new v0(window, c0701c);
        }
        v0Var.b0();
        if (z9) {
            v0Var.d0(1);
        } else {
            v0Var.I(1);
        }
        v0Var.I(2);
        Object obj = new Object();
        AbstractC0165c abstractC0165c = this.f13799D;
        if (abstractC0165c != null) {
            i iVar = new i(obj, this, z9);
            WeakHashMap weakHashMap = Q.f5546a;
            H.l(abstractC0165c.f7853k, iVar);
            return;
        }
        h.h("binding");
        throw null;
    }

    @Override // j3.p0
    public final /* synthetic */ void m() {
    }

    public final void m0(ChipGroup chipGroup) {
        List<b> list;
        Chip chip;
        if (d0().f17640q) {
            list = d0().f17639p.f3449f;
        } else {
            list = d0().f17639p.f3448e;
        }
        String str = d0().f17639p.f3450g.f3457b;
        chipGroup.removeAllViews();
        for (b bVar : list) {
            View inflate = getLayoutInflater().inflate(R.layout.item_chip_choice_small, (ViewGroup) chipGroup, false);
            if (inflate instanceof Chip) {
                chip = (Chip) inflate;
            } else {
                chip = null;
            }
            if (chip != null) {
                chip.setId(bVar.f3456a.hashCode());
                chip.setText(bVar.f3456a);
                chip.setChecked(h.a(bVar.f3457b, str));
                chipGroup.addView(chip);
            }
        }
    }

    @Override // j3.p0
    public final /* synthetic */ void n(boolean z9) {
    }

    public final void n0() {
        List<b> list;
        if (d0().f17640q) {
            list = d0().f17639p.f3449f;
        } else {
            list = d0().f17639p.f3448e;
        }
        b bVar = d0().f17639p.f3450g;
        c0 c0Var = (c0) this.f13811o0.getValue();
        ArrayList arrayList = new ArrayList(m.f0(list, 10));
        for (b bVar2 : list) {
            arrayList.add(new x(bVar2, h.a(bVar2.f3457b, bVar.f3457b)));
        }
        c0Var.o(arrayList);
        AbstractC0165c abstractC0165c = this.f13799D;
        if (abstractC0165c != null) {
            TextView textView = (TextView) abstractC0165c.f3853N.findViewById(R.id.buttonServer);
            if (textView != null) {
                textView.setText(bVar.f3456a);
                return;
            }
            return;
        }
        h.h("binding");
        throw null;
    }

    @Override // j3.p0
    public final /* synthetic */ void o(List list) {
    }

    public final void o0() {
        boolean z9;
        int i9;
        f h7;
        AbstractC0165c abstractC0165c = this.f13799D;
        if (abstractC0165c != null) {
            TabLayout tabLayoutDub = abstractC0165c.f3860U;
            h.d(tabLayoutDub, "tabLayoutDub");
            a0 d02 = d0();
            int i10 = 0;
            if (!d02.f17639p.f3448e.isEmpty() && !d02.f17639p.f3449f.isEmpty()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            tabLayoutDub.setVisibility(i9);
            if (d0().f17640q) {
                h7 = tabLayoutDub.h(1);
            } else {
                h7 = tabLayoutDub.h(0);
            }
            if (h7 != null && !h7.a()) {
                tabLayoutDub.k(h7, true);
            }
            HorizontalScrollView scrollViewServer = abstractC0165c.f3857R;
            h.d(scrollViewServer, "scrollViewServer");
            a0 d03 = d0();
            boolean z10 = d03.f17640q;
            I2.a aVar = d03.f17639p;
            if (!z10 ? aVar.f3448e.size() <= 1 : aVar.f3449f.size() <= 1) {
                i10 = 8;
            }
            scrollViewServer.setVisibility(i10);
            ChipGroup chipGroupServer = abstractC0165c.f3843C;
            h.d(chipGroupServer, "chipGroupServer");
            m0(chipGroupServer);
            n0();
            return;
        }
        h.h("binding");
        throw null;
    }

    @Override // i.AbstractActivityC1322h, d.AbstractActivityC1071l, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        h.e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        j0(newConfig);
    }

    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object, kotlin.jvm.internal.l] */
    @Override // g2.AbstractActivityC1226c, i0.AbstractActivityC1369y, d.AbstractActivityC1071l, D.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i9;
        String str;
        String str2;
        Typeface typeface;
        Resources resources;
        int i10;
        boolean z9;
        final int i11 = 5;
        final int i12 = 4;
        int i13 = 6;
        final int i14 = 3;
        final int i15 = 1;
        final int i16 = 0;
        final int i17 = 2;
        super.onCreate(bundle);
        DataBinderMapperImpl dataBinderMapperImpl = W.c.f7843a;
        setContentView(R.layout.activity_player);
        this.f13799D = (AbstractC0165c) W.c.a((ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content), 0, R.layout.activity_player);
        L().a(this, new C1201C(this));
        l0(true);
        if (getResources().getConfiguration().orientation == 2) {
            i9 = 6;
        } else {
            i9 = 1;
        }
        setRequestedOrientation(i9);
        Configuration configuration = getResources().getConfiguration();
        h.d(configuration, "getConfiguration(...)");
        j0(configuration);
        if (!d0().f17644u) {
            C2077b X8 = X();
            X8.getClass();
            y.d();
            u4.h hVar = X8.f23648c;
            hVar.getClass();
            try {
                u4.y yVar = hVar.f23689a;
                Parcel f12 = yVar.f1(yVar.Q(), 8);
                i10 = f12.readInt();
                f12.recycle();
            } catch (RemoteException e8) {
                u4.h.f23688c.a(e8, "Unable to call %s on %s.", "addCastStateListener", u4.y.class.getSimpleName());
                i10 = 1;
            }
            if (i10 == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.Y = z9;
            C2077b X9 = X();
            C1228e c1228e = new C1228e(this);
            X9.getClass();
            y.d();
            u4.h hVar2 = X9.f23648c;
            hVar2.getClass();
            try {
                u4.y yVar2 = hVar2.f23689a;
                j jVar = new j(c1228e);
                Parcel Q7 = yVar2.Q();
                com.google.android.gms.internal.cast.C.d(Q7, jVar);
                yVar2.g1(Q7, 4);
            } catch (RemoteException e9) {
                u4.h.f23688c.a(e9, "Unable to call %s on %s.", "addCastStateListener", u4.y.class.getSimpleName());
            }
        }
        k0();
        final AbstractC0165c abstractC0165c = this.f13799D;
        if (abstractC0165c != null) {
            int i18 = d0().f17645v.f3478g;
            StyledPlayerView styledPlayerView = abstractC0165c.f3853N;
            styledPlayerView.setResizeMode(i18);
            SubtitleView subtitleView = styledPlayerView.getSubtitleView();
            if (subtitleView != null) {
                subtitleView.setApplyEmbeddedStyles(false);
                subtitleView.setApplyEmbeddedFontSizes(false);
                int i19 = d0().f17645v.f3473b;
                int i20 = d0().f17645v.f3472a;
                int ordinal = d0().f17645v.f3476e.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    typeface = Typeface.MONOSPACE;
                                } else {
                                    throw new RuntimeException();
                                }
                            } else {
                                typeface = Typeface.SERIF;
                            }
                        } else {
                            typeface = Typeface.SANS_SERIF;
                        }
                    } else {
                        typeface = Typeface.DEFAULT_BOLD;
                    }
                } else {
                    typeface = Typeface.DEFAULT;
                }
                subtitleView.setStyle(new C0361d(i19, i20, 0, 0, 0, typeface));
                subtitleView.setPadding(0, 0, 0, c0(0.74766356f));
                float f9 = d0().f17645v.f3475d * 0.74766356f;
                Context context = subtitleView.getContext();
                if (context == null) {
                    resources = Resources.getSystem();
                } else {
                    resources = context.getResources();
                }
                float applyDimension = TypedValue.applyDimension(2, f9, resources.getDisplayMetrics());
                subtitleView.f14478c = 2;
                subtitleView.f14479d = applyDimension;
                subtitleView.c();
            }
            Q2.D d9 = styledPlayerView.j;
            if (d9 != null) {
                d9.setOnSubtitleClickListener(new C1367w(this, i17));
                d9.setOnBackListener(new C1202D(this, abstractC0165c));
            }
            styledPlayerView.setAspectRatioListener(new N1.h(abstractC0165c, 15, this));
            styledPlayerView.setFullscreenButtonClickListener(new C1228e(this));
            AbstractC0165c abstractC0165c2 = this.f13799D;
            if (abstractC0165c2 != null) {
                View findViewById = abstractC0165c2.f3853N.findViewById(R.id.buttonCast);
                if (findViewById != null) {
                    MediaRouteButton mediaRouteButton = (MediaRouteButton) findViewById;
                    if (!d0().f17644u) {
                        AbstractC2076a.a(getApplicationContext(), mediaRouteButton);
                    }
                }
                abstractC0165c.f3842B.setOnClickListener(new View.OnClickListener() { // from class: g2.j
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        final int i21 = 0;
                        final int i22 = 1;
                        final AbstractC0165c abstractC0165c3 = abstractC0165c;
                        switch (i17) {
                            case 0:
                                int i23 = PlayerActivity.f13798w0;
                                abstractC0165c3.f3853N.setUseController(false);
                                AppCompatImageView appCompatImageView = abstractC0165c3.f3842B;
                                appCompatImageView.clearAnimation();
                                appCompatImageView.animate().withStartAction(new Runnable() { // from class: g2.l
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AbstractC0165c abstractC0165c4 = abstractC0165c3;
                                        switch (i21) {
                                            case 0:
                                                int i24 = PlayerActivity.f13798w0;
                                                AppCompatImageView buttonUnlock = abstractC0165c4.f3842B;
                                                kotlin.jvm.internal.h.d(buttonUnlock, "buttonUnlock");
                                                buttonUnlock.setVisibility(0);
                                                return;
                                            default:
                                                int i25 = PlayerActivity.f13798w0;
                                                AppCompatImageView buttonUnlock2 = abstractC0165c4.f3842B;
                                                kotlin.jvm.internal.h.d(buttonUnlock2, "buttonUnlock");
                                                buttonUnlock2.setVisibility(8);
                                                return;
                                        }
                                    }
                                }).withEndAction(new Runnable() { // from class: g2.l
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AbstractC0165c abstractC0165c4 = abstractC0165c3;
                                        switch (i22) {
                                            case 0:
                                                int i24 = PlayerActivity.f13798w0;
                                                AppCompatImageView buttonUnlock = abstractC0165c4.f3842B;
                                                kotlin.jvm.internal.h.d(buttonUnlock, "buttonUnlock");
                                                buttonUnlock.setVisibility(0);
                                                return;
                                            default:
                                                int i25 = PlayerActivity.f13798w0;
                                                AppCompatImageView buttonUnlock2 = abstractC0165c4.f3842B;
                                                kotlin.jvm.internal.h.d(buttonUnlock2, "buttonUnlock");
                                                buttonUnlock2.setVisibility(8);
                                                return;
                                        }
                                    }
                                }).setDuration(2000L).start();
                                return;
                            case 1:
                                int i24 = PlayerActivity.f13798w0;
                                ConstraintLayout layoutSubSync = abstractC0165c3.f3852M;
                                kotlin.jvm.internal.h.d(layoutSubSync, "layoutSubSync");
                                layoutSubSync.setVisibility(8);
                                return;
                            default:
                                int i25 = PlayerActivity.f13798w0;
                                abstractC0165c3.f3853N.setUseController(true);
                                StyledPlayerView styledPlayerView2 = abstractC0165c3.f3853N;
                                styledPlayerView2.g(styledPlayerView2.f());
                                AppCompatImageView buttonUnlock = abstractC0165c3.f3842B;
                                kotlin.jvm.internal.h.d(buttonUnlock, "buttonUnlock");
                                buttonUnlock.setVisibility(8);
                                return;
                        }
                    }
                });
                Slider slider = abstractC0165c.f3858S;
                slider.setCustomThumbDrawable(R.drawable.ic_thumb_volume);
                l lVar = this.f13807k0;
                slider.setValueTo(((AudioManager) lVar.getValue()).getStreamMaxVolume(3));
                slider.setValue(((AudioManager) lVar.getValue()).getStreamVolume(3));
                slider.f3161n.add(new C1205G(this));
                ?? obj = new Object();
                obj.f20156a = slider.getValue();
                slider.a(new C1686m(obj, i13, this));
                RecyclerView recyclerView = abstractC0165c.f3854O;
                recyclerView.setHasFixedSize(true);
                recyclerView.setAdapter((C1225b) this.f13809m0.getValue());
                RecyclerView recyclerView2 = abstractC0165c.f3855P;
                recyclerView2.setHasFixedSize(true);
                recyclerView2.setAdapter((c0) this.f13811o0.getValue());
                RecyclerView recyclerView3 = abstractC0165c.f3856Q;
                recyclerView3.setHasFixedSize(true);
                recyclerView3.setAdapter(a0());
                C1203E c1203e = new C1203E(this, abstractC0165c);
                FreakSpinner freakSpinner = abstractC0165c.f3859T;
                freakSpinner.setOnItemSelectedListener(c1203e);
                freakSpinner.setAdapter((SpinnerAdapter) this.f13810n0.getValue());
                freakSpinner.setActionDownListener(new C1227d(this, i14));
                abstractC0165c.f3847G.setOnClickListener(new ViewOnClickListenerC1232i(abstractC0165c, this, 7));
                AppCompatEditText inputSearchEpisode = abstractC0165c.f3848H;
                h.d(inputSearchEpisode, "inputSearchEpisode");
                inputSearchEpisode.addTextChangedListener(new q(abstractC0165c, this, i17));
                inputSearchEpisode.setOnEditorActionListener(new C0383b(i17, this));
                abstractC0165c.f3860U.a(new J5.j(i14, this));
                abstractC0165c.f3843C.setOnCheckedStateChangeListener(new C1228e(this));
                abstractC0165c.f3868d0.f15910c.add(new n5.f() { // from class: g2.g
                    @Override // n5.f
                    public final void a(int i21, boolean z10) {
                        int i22 = PlayerActivity.f13798w0;
                        PlayerActivity playerActivity = PlayerActivity.this;
                        i4.u a5 = playerActivity.Z().M().a();
                        if (z10) {
                            switch (i21) {
                                case R.id.buttonAuto /* 2131361904 */:
                                    a5.e(Integer.MAX_VALUE).f(0);
                                    break;
                                case R.id.buttonFHD /* 2131361923 */:
                                    a5.e(Integer.MAX_VALUE).f(1080);
                                    break;
                                case R.id.buttonHD /* 2131361925 */:
                                    a5.e(1079).f(720);
                                    break;
                                case R.id.buttonSD /* 2131361950 */:
                                    a5.e(479).f(360);
                                    break;
                                case R.id.buttonSDP /* 2131361951 */:
                                    a5.e(719).f(480);
                                    break;
                            }
                        }
                        playerActivity.Z().P(a5.a());
                        playerActivity.e0(true);
                    }
                });
                abstractC0165c.f3851L.setOnClickListener(new View.OnClickListener(this) { // from class: g2.h

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PlayerActivity f17668b;

                    {
                        this.f17668b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Long l9 = null;
                        r2.c cVar = r2.c.f22600d;
                        PlayerActivity playerActivity = this.f17668b;
                        switch (i16) {
                            case 0:
                                int i21 = PlayerActivity.f13798w0;
                                playerActivity.e0(false);
                                return;
                            case 1:
                                int i22 = PlayerActivity.f13798w0;
                                playerActivity.f13802f0 = cVar;
                                playerActivity.V(false);
                                ((D.n) playerActivity.Z()).f(false);
                                playerActivity.d0().l(playerActivity.Z().T(), false);
                                return;
                            case 2:
                                int i23 = PlayerActivity.f13798w0;
                                playerActivity.f13802f0 = cVar;
                                playerActivity.V(false);
                                ((D.n) playerActivity.Z()).f(false);
                                a0 d02 = playerActivity.d0();
                                long T8 = playerActivity.Z().T();
                                List list = d02.f17638o.f3471f;
                                int i24 = 0;
                                for (Object obj2 : list) {
                                    int i25 = i24 + 1;
                                    if (i24 >= 0) {
                                        I2.a aVar = (I2.a) obj2;
                                        if (aVar.f3444a == d02.f17639p.f3444a) {
                                            aVar.f3452i = T8;
                                        }
                                        if (aVar.j && i24 > 0) {
                                            aVar.j = false;
                                            ((I2.a) list.get(i24 - 1)).j = true;
                                            d02.m(true, true);
                                            return;
                                        }
                                        i24 = i25;
                                    } else {
                                        B7.l.e0();
                                        throw null;
                                    }
                                }
                                return;
                            case 3:
                                int i26 = PlayerActivity.f13798w0;
                                playerActivity.d0().f17639p.f3452i = playerActivity.Z().T();
                                playerActivity.h0(false);
                                return;
                            case 4:
                                int i27 = PlayerActivity.f13798w0;
                                playerActivity.p0(true);
                                I2.b bVar = playerActivity.d0().f17639p.f3450g;
                                A7.h hVar3 = bVar.f3459d;
                                if (hVar3 != null) {
                                    l9 = (Long) hVar3.f548b;
                                }
                                if (l9 != null && playerActivity.Z().T() <= l9.longValue()) {
                                    D.n nVar = (D.n) playerActivity.Z();
                                    nVar.Q(l9.longValue(), nVar.z());
                                    ((D.n) playerActivity.Z()).f(true);
                                    return;
                                }
                                A7.h hVar4 = bVar.f3460e;
                                if (hVar4 != null) {
                                    long longValue = ((Number) hVar4.f547a).longValue();
                                    if (playerActivity.Z().T() > longValue) {
                                        Long l10 = (Long) hVar4.f548b;
                                        if (l10 != null && l10.longValue() > longValue) {
                                            D.n nVar2 = (D.n) playerActivity.Z();
                                            nVar2.Q(l10.longValue(), nVar2.z());
                                            ((D.n) playerActivity.Z()).f(true);
                                            return;
                                        }
                                        playerActivity.f13802f0 = cVar;
                                        playerActivity.V(false);
                                        ((D.n) playerActivity.Z()).f(false);
                                        playerActivity.d0().l(playerActivity.Z().T(), false);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                int i28 = PlayerActivity.f13798w0;
                                Y1.p(playerActivity);
                                return;
                        }
                    }
                });
                i0(R.id.buttonVolume, new ViewOnClickListenerC1232i(this, abstractC0165c, i16));
                i0(R.id.buttonSettings, new ViewOnClickListenerC1232i(this, abstractC0165c, i15));
                i0(R.id.buttonEpisodes, new ViewOnClickListenerC1232i(this, abstractC0165c, i17));
                i0(R.id.buttonServer, new ViewOnClickListenerC1232i(this, abstractC0165c, i14));
                i0(R.id.buttonLockScreen, new View.OnClickListener() { // from class: g2.j
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        final int i21 = 0;
                        final int i22 = 1;
                        final AbstractC0165c abstractC0165c3 = abstractC0165c;
                        switch (i16) {
                            case 0:
                                int i23 = PlayerActivity.f13798w0;
                                abstractC0165c3.f3853N.setUseController(false);
                                AppCompatImageView appCompatImageView = abstractC0165c3.f3842B;
                                appCompatImageView.clearAnimation();
                                appCompatImageView.animate().withStartAction(new Runnable() { // from class: g2.l
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AbstractC0165c abstractC0165c4 = abstractC0165c3;
                                        switch (i21) {
                                            case 0:
                                                int i24 = PlayerActivity.f13798w0;
                                                AppCompatImageView buttonUnlock = abstractC0165c4.f3842B;
                                                kotlin.jvm.internal.h.d(buttonUnlock, "buttonUnlock");
                                                buttonUnlock.setVisibility(0);
                                                return;
                                            default:
                                                int i25 = PlayerActivity.f13798w0;
                                                AppCompatImageView buttonUnlock2 = abstractC0165c4.f3842B;
                                                kotlin.jvm.internal.h.d(buttonUnlock2, "buttonUnlock");
                                                buttonUnlock2.setVisibility(8);
                                                return;
                                        }
                                    }
                                }).withEndAction(new Runnable() { // from class: g2.l
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AbstractC0165c abstractC0165c4 = abstractC0165c3;
                                        switch (i22) {
                                            case 0:
                                                int i24 = PlayerActivity.f13798w0;
                                                AppCompatImageView buttonUnlock = abstractC0165c4.f3842B;
                                                kotlin.jvm.internal.h.d(buttonUnlock, "buttonUnlock");
                                                buttonUnlock.setVisibility(0);
                                                return;
                                            default:
                                                int i25 = PlayerActivity.f13798w0;
                                                AppCompatImageView buttonUnlock2 = abstractC0165c4.f3842B;
                                                kotlin.jvm.internal.h.d(buttonUnlock2, "buttonUnlock");
                                                buttonUnlock2.setVisibility(8);
                                                return;
                                        }
                                    }
                                }).setDuration(2000L).start();
                                return;
                            case 1:
                                int i24 = PlayerActivity.f13798w0;
                                ConstraintLayout layoutSubSync = abstractC0165c3.f3852M;
                                kotlin.jvm.internal.h.d(layoutSubSync, "layoutSubSync");
                                layoutSubSync.setVisibility(8);
                                return;
                            default:
                                int i25 = PlayerActivity.f13798w0;
                                abstractC0165c3.f3853N.setUseController(true);
                                StyledPlayerView styledPlayerView2 = abstractC0165c3.f3853N;
                                styledPlayerView2.g(styledPlayerView2.f());
                                AppCompatImageView buttonUnlock = abstractC0165c3.f3842B;
                                kotlin.jvm.internal.h.d(buttonUnlock, "buttonUnlock");
                                buttonUnlock.setVisibility(8);
                                return;
                        }
                    }
                });
                i0(R.id.buttonNext, new View.OnClickListener(this) { // from class: g2.h

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PlayerActivity f17668b;

                    {
                        this.f17668b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Long l9 = null;
                        r2.c cVar = r2.c.f22600d;
                        PlayerActivity playerActivity = this.f17668b;
                        switch (i15) {
                            case 0:
                                int i21 = PlayerActivity.f13798w0;
                                playerActivity.e0(false);
                                return;
                            case 1:
                                int i22 = PlayerActivity.f13798w0;
                                playerActivity.f13802f0 = cVar;
                                playerActivity.V(false);
                                ((D.n) playerActivity.Z()).f(false);
                                playerActivity.d0().l(playerActivity.Z().T(), false);
                                return;
                            case 2:
                                int i23 = PlayerActivity.f13798w0;
                                playerActivity.f13802f0 = cVar;
                                playerActivity.V(false);
                                ((D.n) playerActivity.Z()).f(false);
                                a0 d02 = playerActivity.d0();
                                long T8 = playerActivity.Z().T();
                                List list = d02.f17638o.f3471f;
                                int i24 = 0;
                                for (Object obj2 : list) {
                                    int i25 = i24 + 1;
                                    if (i24 >= 0) {
                                        I2.a aVar = (I2.a) obj2;
                                        if (aVar.f3444a == d02.f17639p.f3444a) {
                                            aVar.f3452i = T8;
                                        }
                                        if (aVar.j && i24 > 0) {
                                            aVar.j = false;
                                            ((I2.a) list.get(i24 - 1)).j = true;
                                            d02.m(true, true);
                                            return;
                                        }
                                        i24 = i25;
                                    } else {
                                        B7.l.e0();
                                        throw null;
                                    }
                                }
                                return;
                            case 3:
                                int i26 = PlayerActivity.f13798w0;
                                playerActivity.d0().f17639p.f3452i = playerActivity.Z().T();
                                playerActivity.h0(false);
                                return;
                            case 4:
                                int i27 = PlayerActivity.f13798w0;
                                playerActivity.p0(true);
                                I2.b bVar = playerActivity.d0().f17639p.f3450g;
                                A7.h hVar3 = bVar.f3459d;
                                if (hVar3 != null) {
                                    l9 = (Long) hVar3.f548b;
                                }
                                if (l9 != null && playerActivity.Z().T() <= l9.longValue()) {
                                    D.n nVar = (D.n) playerActivity.Z();
                                    nVar.Q(l9.longValue(), nVar.z());
                                    ((D.n) playerActivity.Z()).f(true);
                                    return;
                                }
                                A7.h hVar4 = bVar.f3460e;
                                if (hVar4 != null) {
                                    long longValue = ((Number) hVar4.f547a).longValue();
                                    if (playerActivity.Z().T() > longValue) {
                                        Long l10 = (Long) hVar4.f548b;
                                        if (l10 != null && l10.longValue() > longValue) {
                                            D.n nVar2 = (D.n) playerActivity.Z();
                                            nVar2.Q(l10.longValue(), nVar2.z());
                                            ((D.n) playerActivity.Z()).f(true);
                                            return;
                                        }
                                        playerActivity.f13802f0 = cVar;
                                        playerActivity.V(false);
                                        ((D.n) playerActivity.Z()).f(false);
                                        playerActivity.d0().l(playerActivity.Z().T(), false);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                int i28 = PlayerActivity.f13798w0;
                                Y1.p(playerActivity);
                                return;
                        }
                    }
                });
                i0(R.id.buttonPrevious, new View.OnClickListener(this) { // from class: g2.h

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PlayerActivity f17668b;

                    {
                        this.f17668b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Long l9 = null;
                        r2.c cVar = r2.c.f22600d;
                        PlayerActivity playerActivity = this.f17668b;
                        switch (i17) {
                            case 0:
                                int i21 = PlayerActivity.f13798w0;
                                playerActivity.e0(false);
                                return;
                            case 1:
                                int i22 = PlayerActivity.f13798w0;
                                playerActivity.f13802f0 = cVar;
                                playerActivity.V(false);
                                ((D.n) playerActivity.Z()).f(false);
                                playerActivity.d0().l(playerActivity.Z().T(), false);
                                return;
                            case 2:
                                int i23 = PlayerActivity.f13798w0;
                                playerActivity.f13802f0 = cVar;
                                playerActivity.V(false);
                                ((D.n) playerActivity.Z()).f(false);
                                a0 d02 = playerActivity.d0();
                                long T8 = playerActivity.Z().T();
                                List list = d02.f17638o.f3471f;
                                int i24 = 0;
                                for (Object obj2 : list) {
                                    int i25 = i24 + 1;
                                    if (i24 >= 0) {
                                        I2.a aVar = (I2.a) obj2;
                                        if (aVar.f3444a == d02.f17639p.f3444a) {
                                            aVar.f3452i = T8;
                                        }
                                        if (aVar.j && i24 > 0) {
                                            aVar.j = false;
                                            ((I2.a) list.get(i24 - 1)).j = true;
                                            d02.m(true, true);
                                            return;
                                        }
                                        i24 = i25;
                                    } else {
                                        B7.l.e0();
                                        throw null;
                                    }
                                }
                                return;
                            case 3:
                                int i26 = PlayerActivity.f13798w0;
                                playerActivity.d0().f17639p.f3452i = playerActivity.Z().T();
                                playerActivity.h0(false);
                                return;
                            case 4:
                                int i27 = PlayerActivity.f13798w0;
                                playerActivity.p0(true);
                                I2.b bVar = playerActivity.d0().f17639p.f3450g;
                                A7.h hVar3 = bVar.f3459d;
                                if (hVar3 != null) {
                                    l9 = (Long) hVar3.f548b;
                                }
                                if (l9 != null && playerActivity.Z().T() <= l9.longValue()) {
                                    D.n nVar = (D.n) playerActivity.Z();
                                    nVar.Q(l9.longValue(), nVar.z());
                                    ((D.n) playerActivity.Z()).f(true);
                                    return;
                                }
                                A7.h hVar4 = bVar.f3460e;
                                if (hVar4 != null) {
                                    long longValue = ((Number) hVar4.f547a).longValue();
                                    if (playerActivity.Z().T() > longValue) {
                                        Long l10 = (Long) hVar4.f548b;
                                        if (l10 != null && l10.longValue() > longValue) {
                                            D.n nVar2 = (D.n) playerActivity.Z();
                                            nVar2.Q(l10.longValue(), nVar2.z());
                                            ((D.n) playerActivity.Z()).f(true);
                                            return;
                                        }
                                        playerActivity.f13802f0 = cVar;
                                        playerActivity.V(false);
                                        ((D.n) playerActivity.Z()).f(false);
                                        playerActivity.d0().l(playerActivity.Z().T(), false);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                int i28 = PlayerActivity.f13798w0;
                                Y1.p(playerActivity);
                                return;
                        }
                    }
                });
                O.f6195a.set(0L);
                abstractC0165c.Y.setText(getString(R.string.format_subtitle_delay, Float.valueOf(0.0f)));
                abstractC0165c.f3866b0.setOnClickListener(new ViewOnClickListenerC1232i(abstractC0165c, this, i12));
                abstractC0165c.f3867c0.setOnClickListener(new ViewOnClickListenerC1232i(abstractC0165c, this, i11));
                abstractC0165c.f3871w.setOnClickListener(new View.OnClickListener(this) { // from class: g2.h

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PlayerActivity f17668b;

                    {
                        this.f17668b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Long l9 = null;
                        r2.c cVar = r2.c.f22600d;
                        PlayerActivity playerActivity = this.f17668b;
                        switch (i14) {
                            case 0:
                                int i21 = PlayerActivity.f13798w0;
                                playerActivity.e0(false);
                                return;
                            case 1:
                                int i22 = PlayerActivity.f13798w0;
                                playerActivity.f13802f0 = cVar;
                                playerActivity.V(false);
                                ((D.n) playerActivity.Z()).f(false);
                                playerActivity.d0().l(playerActivity.Z().T(), false);
                                return;
                            case 2:
                                int i23 = PlayerActivity.f13798w0;
                                playerActivity.f13802f0 = cVar;
                                playerActivity.V(false);
                                ((D.n) playerActivity.Z()).f(false);
                                a0 d02 = playerActivity.d0();
                                long T8 = playerActivity.Z().T();
                                List list = d02.f17638o.f3471f;
                                int i24 = 0;
                                for (Object obj2 : list) {
                                    int i25 = i24 + 1;
                                    if (i24 >= 0) {
                                        I2.a aVar = (I2.a) obj2;
                                        if (aVar.f3444a == d02.f17639p.f3444a) {
                                            aVar.f3452i = T8;
                                        }
                                        if (aVar.j && i24 > 0) {
                                            aVar.j = false;
                                            ((I2.a) list.get(i24 - 1)).j = true;
                                            d02.m(true, true);
                                            return;
                                        }
                                        i24 = i25;
                                    } else {
                                        B7.l.e0();
                                        throw null;
                                    }
                                }
                                return;
                            case 3:
                                int i26 = PlayerActivity.f13798w0;
                                playerActivity.d0().f17639p.f3452i = playerActivity.Z().T();
                                playerActivity.h0(false);
                                return;
                            case 4:
                                int i27 = PlayerActivity.f13798w0;
                                playerActivity.p0(true);
                                I2.b bVar = playerActivity.d0().f17639p.f3450g;
                                A7.h hVar3 = bVar.f3459d;
                                if (hVar3 != null) {
                                    l9 = (Long) hVar3.f548b;
                                }
                                if (l9 != null && playerActivity.Z().T() <= l9.longValue()) {
                                    D.n nVar = (D.n) playerActivity.Z();
                                    nVar.Q(l9.longValue(), nVar.z());
                                    ((D.n) playerActivity.Z()).f(true);
                                    return;
                                }
                                A7.h hVar4 = bVar.f3460e;
                                if (hVar4 != null) {
                                    long longValue = ((Number) hVar4.f547a).longValue();
                                    if (playerActivity.Z().T() > longValue) {
                                        Long l10 = (Long) hVar4.f548b;
                                        if (l10 != null && l10.longValue() > longValue) {
                                            D.n nVar2 = (D.n) playerActivity.Z();
                                            nVar2.Q(l10.longValue(), nVar2.z());
                                            ((D.n) playerActivity.Z()).f(true);
                                            return;
                                        }
                                        playerActivity.f13802f0 = cVar;
                                        playerActivity.V(false);
                                        ((D.n) playerActivity.Z()).f(false);
                                        playerActivity.d0().l(playerActivity.Z().T(), false);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                int i28 = PlayerActivity.f13798w0;
                                Y1.p(playerActivity);
                                return;
                        }
                    }
                });
                abstractC0165c.f3852M.setOnClickListener(new View.OnClickListener() { // from class: g2.j
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        final int i21 = 0;
                        final int i22 = 1;
                        final AbstractC0165c abstractC0165c3 = abstractC0165c;
                        switch (i15) {
                            case 0:
                                int i23 = PlayerActivity.f13798w0;
                                abstractC0165c3.f3853N.setUseController(false);
                                AppCompatImageView appCompatImageView = abstractC0165c3.f3842B;
                                appCompatImageView.clearAnimation();
                                appCompatImageView.animate().withStartAction(new Runnable() { // from class: g2.l
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AbstractC0165c abstractC0165c4 = abstractC0165c3;
                                        switch (i21) {
                                            case 0:
                                                int i24 = PlayerActivity.f13798w0;
                                                AppCompatImageView buttonUnlock = abstractC0165c4.f3842B;
                                                kotlin.jvm.internal.h.d(buttonUnlock, "buttonUnlock");
                                                buttonUnlock.setVisibility(0);
                                                return;
                                            default:
                                                int i25 = PlayerActivity.f13798w0;
                                                AppCompatImageView buttonUnlock2 = abstractC0165c4.f3842B;
                                                kotlin.jvm.internal.h.d(buttonUnlock2, "buttonUnlock");
                                                buttonUnlock2.setVisibility(8);
                                                return;
                                        }
                                    }
                                }).withEndAction(new Runnable() { // from class: g2.l
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AbstractC0165c abstractC0165c4 = abstractC0165c3;
                                        switch (i22) {
                                            case 0:
                                                int i24 = PlayerActivity.f13798w0;
                                                AppCompatImageView buttonUnlock = abstractC0165c4.f3842B;
                                                kotlin.jvm.internal.h.d(buttonUnlock, "buttonUnlock");
                                                buttonUnlock.setVisibility(0);
                                                return;
                                            default:
                                                int i25 = PlayerActivity.f13798w0;
                                                AppCompatImageView buttonUnlock2 = abstractC0165c4.f3842B;
                                                kotlin.jvm.internal.h.d(buttonUnlock2, "buttonUnlock");
                                                buttonUnlock2.setVisibility(8);
                                                return;
                                        }
                                    }
                                }).setDuration(2000L).start();
                                return;
                            case 1:
                                int i24 = PlayerActivity.f13798w0;
                                ConstraintLayout layoutSubSync = abstractC0165c3.f3852M;
                                kotlin.jvm.internal.h.d(layoutSubSync, "layoutSubSync");
                                layoutSubSync.setVisibility(8);
                                return;
                            default:
                                int i25 = PlayerActivity.f13798w0;
                                abstractC0165c3.f3853N.setUseController(true);
                                StyledPlayerView styledPlayerView2 = abstractC0165c3.f3853N;
                                styledPlayerView2.g(styledPlayerView2.f());
                                AppCompatImageView buttonUnlock = abstractC0165c3.f3842B;
                                kotlin.jvm.internal.h.d(buttonUnlock, "buttonUnlock");
                                buttonUnlock.setVisibility(8);
                                return;
                        }
                    }
                });
                AbstractC0165c abstractC0165c3 = this.f13799D;
                if (abstractC0165c3 != null) {
                    View findViewById2 = abstractC0165c3.f3853N.findViewById(R.id.exo_progress);
                    if (findViewById2 == null) {
                        findViewById2 = null;
                    }
                    this.f13816u0 = (d) findViewById2;
                    AbstractC0165c abstractC0165c4 = this.f13799D;
                    if (abstractC0165c4 != null) {
                        View findViewById3 = abstractC0165c4.f3853N.findViewById(R.id.buttonSkipIntro);
                        if (findViewById3 == null) {
                            findViewById3 = null;
                        }
                        FreakIntroButton freakIntroButton = (FreakIntroButton) findViewById3;
                        this.f13817v0 = freakIntroButton;
                        if (freakIntroButton != null) {
                            freakIntroButton.setOnClickListener(new View.OnClickListener(this) { // from class: g2.h

                                /* renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ PlayerActivity f17668b;

                                {
                                    this.f17668b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    Long l9 = null;
                                    r2.c cVar = r2.c.f22600d;
                                    PlayerActivity playerActivity = this.f17668b;
                                    switch (i12) {
                                        case 0:
                                            int i21 = PlayerActivity.f13798w0;
                                            playerActivity.e0(false);
                                            return;
                                        case 1:
                                            int i22 = PlayerActivity.f13798w0;
                                            playerActivity.f13802f0 = cVar;
                                            playerActivity.V(false);
                                            ((D.n) playerActivity.Z()).f(false);
                                            playerActivity.d0().l(playerActivity.Z().T(), false);
                                            return;
                                        case 2:
                                            int i23 = PlayerActivity.f13798w0;
                                            playerActivity.f13802f0 = cVar;
                                            playerActivity.V(false);
                                            ((D.n) playerActivity.Z()).f(false);
                                            a0 d02 = playerActivity.d0();
                                            long T8 = playerActivity.Z().T();
                                            List list = d02.f17638o.f3471f;
                                            int i24 = 0;
                                            for (Object obj2 : list) {
                                                int i25 = i24 + 1;
                                                if (i24 >= 0) {
                                                    I2.a aVar = (I2.a) obj2;
                                                    if (aVar.f3444a == d02.f17639p.f3444a) {
                                                        aVar.f3452i = T8;
                                                    }
                                                    if (aVar.j && i24 > 0) {
                                                        aVar.j = false;
                                                        ((I2.a) list.get(i24 - 1)).j = true;
                                                        d02.m(true, true);
                                                        return;
                                                    }
                                                    i24 = i25;
                                                } else {
                                                    B7.l.e0();
                                                    throw null;
                                                }
                                            }
                                            return;
                                        case 3:
                                            int i26 = PlayerActivity.f13798w0;
                                            playerActivity.d0().f17639p.f3452i = playerActivity.Z().T();
                                            playerActivity.h0(false);
                                            return;
                                        case 4:
                                            int i27 = PlayerActivity.f13798w0;
                                            playerActivity.p0(true);
                                            I2.b bVar = playerActivity.d0().f17639p.f3450g;
                                            A7.h hVar3 = bVar.f3459d;
                                            if (hVar3 != null) {
                                                l9 = (Long) hVar3.f548b;
                                            }
                                            if (l9 != null && playerActivity.Z().T() <= l9.longValue()) {
                                                D.n nVar = (D.n) playerActivity.Z();
                                                nVar.Q(l9.longValue(), nVar.z());
                                                ((D.n) playerActivity.Z()).f(true);
                                                return;
                                            }
                                            A7.h hVar4 = bVar.f3460e;
                                            if (hVar4 != null) {
                                                long longValue = ((Number) hVar4.f547a).longValue();
                                                if (playerActivity.Z().T() > longValue) {
                                                    Long l10 = (Long) hVar4.f548b;
                                                    if (l10 != null && l10.longValue() > longValue) {
                                                        D.n nVar2 = (D.n) playerActivity.Z();
                                                        nVar2.Q(l10.longValue(), nVar2.z());
                                                        ((D.n) playerActivity.Z()).f(true);
                                                        return;
                                                    }
                                                    playerActivity.f13802f0 = cVar;
                                                    playerActivity.V(false);
                                                    ((D.n) playerActivity.Z()).f(false);
                                                    playerActivity.d0().l(playerActivity.Z().T(), false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            int i28 = PlayerActivity.f13798w0;
                                            Y1.p(playerActivity);
                                            return;
                                    }
                                }
                            });
                        }
                        abstractC0165c.K.setOnClickListener(new ViewOnClickListenerC1232i(abstractC0165c, this, i13));
                        abstractC0165c.f3870v.setOnClickListener(new View.OnClickListener(this) { // from class: g2.h

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ PlayerActivity f17668b;

                            {
                                this.f17668b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Long l9 = null;
                                r2.c cVar = r2.c.f22600d;
                                PlayerActivity playerActivity = this.f17668b;
                                switch (i11) {
                                    case 0:
                                        int i21 = PlayerActivity.f13798w0;
                                        playerActivity.e0(false);
                                        return;
                                    case 1:
                                        int i22 = PlayerActivity.f13798w0;
                                        playerActivity.f13802f0 = cVar;
                                        playerActivity.V(false);
                                        ((D.n) playerActivity.Z()).f(false);
                                        playerActivity.d0().l(playerActivity.Z().T(), false);
                                        return;
                                    case 2:
                                        int i23 = PlayerActivity.f13798w0;
                                        playerActivity.f13802f0 = cVar;
                                        playerActivity.V(false);
                                        ((D.n) playerActivity.Z()).f(false);
                                        a0 d02 = playerActivity.d0();
                                        long T8 = playerActivity.Z().T();
                                        List list = d02.f17638o.f3471f;
                                        int i24 = 0;
                                        for (Object obj2 : list) {
                                            int i25 = i24 + 1;
                                            if (i24 >= 0) {
                                                I2.a aVar = (I2.a) obj2;
                                                if (aVar.f3444a == d02.f17639p.f3444a) {
                                                    aVar.f3452i = T8;
                                                }
                                                if (aVar.j && i24 > 0) {
                                                    aVar.j = false;
                                                    ((I2.a) list.get(i24 - 1)).j = true;
                                                    d02.m(true, true);
                                                    return;
                                                }
                                                i24 = i25;
                                            } else {
                                                B7.l.e0();
                                                throw null;
                                            }
                                        }
                                        return;
                                    case 3:
                                        int i26 = PlayerActivity.f13798w0;
                                        playerActivity.d0().f17639p.f3452i = playerActivity.Z().T();
                                        playerActivity.h0(false);
                                        return;
                                    case 4:
                                        int i27 = PlayerActivity.f13798w0;
                                        playerActivity.p0(true);
                                        I2.b bVar = playerActivity.d0().f17639p.f3450g;
                                        A7.h hVar3 = bVar.f3459d;
                                        if (hVar3 != null) {
                                            l9 = (Long) hVar3.f548b;
                                        }
                                        if (l9 != null && playerActivity.Z().T() <= l9.longValue()) {
                                            D.n nVar = (D.n) playerActivity.Z();
                                            nVar.Q(l9.longValue(), nVar.z());
                                            ((D.n) playerActivity.Z()).f(true);
                                            return;
                                        }
                                        A7.h hVar4 = bVar.f3460e;
                                        if (hVar4 != null) {
                                            long longValue = ((Number) hVar4.f547a).longValue();
                                            if (playerActivity.Z().T() > longValue) {
                                                Long l10 = (Long) hVar4.f548b;
                                                if (l10 != null && l10.longValue() > longValue) {
                                                    D.n nVar2 = (D.n) playerActivity.Z();
                                                    nVar2.Q(l10.longValue(), nVar2.z());
                                                    ((D.n) playerActivity.Z()).f(true);
                                                    return;
                                                }
                                                playerActivity.f13802f0 = cVar;
                                                playerActivity.V(false);
                                                ((D.n) playerActivity.Z()).f(false);
                                                playerActivity.d0().l(playerActivity.Z().T(), false);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        int i28 = PlayerActivity.f13798w0;
                                        Y1.p(playerActivity);
                                        return;
                                }
                            }
                        });
                        C1441D c1441d = (C1441D) b0();
                        c1441d.getClass();
                        c1441d.f19271l.a(this);
                        if (!d0().f17644u) {
                            Y().y(this);
                            Y().f21568k = this;
                        }
                        B.r(androidx.lifecycle.Y.f(this), null, new C1199A(null, this), 3);
                        long longExtra = getIntent().getLongExtra("extra_id", 0L);
                        int intExtra = getIntent().getIntExtra("extra_year", 0);
                        String stringExtra = getIntent().getStringExtra("extra_name");
                        if (stringExtra == null) {
                            str = "";
                        } else {
                            str = stringExtra;
                        }
                        List stringArrayListExtra = getIntent().getStringArrayListExtra("extra_al_names");
                        if (stringArrayListExtra == null) {
                            stringArrayListExtra = t.f1135a;
                        }
                        List list = stringArrayListExtra;
                        long longExtra2 = getIntent().getLongExtra("extra_episode_id", -1L);
                        String stringExtra2 = getIntent().getStringExtra("extra_poster");
                        if (stringExtra2 == null) {
                            str2 = "";
                        } else {
                            str2 = stringExtra2;
                        }
                        if (getIntent().getBooleanExtra("extra_recently_watched", false)) {
                            a0 d02 = d0();
                            d02.getClass();
                            d02.d(true, new C1219V(d02, null));
                            return;
                        }
                        d0().k(intExtra, longExtra, longExtra2, str, str2, list);
                        return;
                    }
                    h.h("binding");
                    throw null;
                }
                h.h("binding");
                throw null;
            }
            h.h("binding");
            throw null;
        }
        h.h("binding");
        throw null;
    }

    @Override // g2.AbstractActivityC1226c, i.AbstractActivityC1322h, i0.AbstractActivityC1369y, android.app.Activity
    public final void onDestroy() {
        String str;
        AudioTrack audioTrack;
        int i9 = 21;
        ((C1441D) b0()).stop();
        C1441D c1441d = (C1441D) b0();
        c1441d.getClass();
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(c1441d)));
        sb.append(" [ExoPlayerLib/2.18.2] [");
        sb.append(l4.y.f20557e);
        sb.append("] [");
        HashSet hashSet = K.f19387a;
        synchronized (K.class) {
            str = K.f19388b;
        }
        sb.append(str);
        sb.append("]");
        AbstractC1566a.A("ExoPlayerImpl", sb.toString());
        c1441d.M0();
        if (l4.y.f20553a < 21 && (audioTrack = c1441d.f19274m0) != null) {
            audioTrack.release();
            c1441d.f19274m0 = null;
        }
        c1441d.f19298z.d();
        z0 z0Var = c1441d.f19244B;
        C0568d c0568d = z0Var.f19774e;
        if (c0568d != null) {
            try {
                z0Var.f19770a.unregisterReceiver(c0568d);
            } catch (RuntimeException e8) {
                AbstractC1566a.Q("StreamVolumeManager", "Error unregistering stream volume receiver", e8);
            }
            z0Var.f19774e = null;
        }
        c1441d.f19246C.getClass();
        c1441d.f19248D.getClass();
        C1447c c1447c = c1441d.f19242A;
        c1447c.f19567c = null;
        c1447c.a();
        if (!c1441d.f19269k.w()) {
            c1441d.f19271l.e(10, new k(i9));
        }
        l4.l lVar = c1441d.f19271l;
        CopyOnWriteArraySet copyOnWriteArraySet = lVar.f20507d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            l4.k kVar = (l4.k) it.next();
            kVar.f20503d = true;
            if (kVar.f20502c) {
                kVar.f20502c = false;
                lVar.f20506c.a(kVar.f20500a, kVar.f20501b.c());
            }
        }
        copyOnWriteArraySet.clear();
        lVar.f20510g = true;
        c1441d.f19266i.f20548a.removeCallbacksAndMessages(null);
        InterfaceC1506f interfaceC1506f = c1441d.f19286t;
        C1489e c1489e = c1441d.f19283r;
        CopyOnWriteArrayList copyOnWriteArrayList = ((C1518s) interfaceC1506f).f20100b.f11587a;
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            C1505e c1505e = (C1505e) it2.next();
            if (c1505e.f20055b == c1489e) {
                c1505e.f20056c = true;
                copyOnWriteArrayList.remove(c1505e);
            }
        }
        l0 f9 = c1441d.f19251F0.f(1);
        c1441d.f19251F0 = f9;
        l0 a5 = f9.a(f9.f19668b);
        c1441d.f19251F0 = a5;
        a5.f19681p = a5.f19683r;
        c1441d.f19251F0.f19682q = 0L;
        C1489e c1489e2 = c1441d.f19283r;
        w wVar = c1489e2.f19935h;
        AbstractC1566a.n(wVar);
        wVar.f20548a.post(new s(25, c1489e2));
        c1441d.f19264h.a();
        c1441d.B0();
        Surface surface = c1441d.f19278o0;
        if (surface != null) {
            surface.release();
            c1441d.f19278o0 = null;
        }
        c1441d.f19299z0 = Y3.c.f8695b;
        if (!d0().f17644u) {
            Y().stop();
            e Y = Y();
            C2077b c2077b = Y.f21560b;
            c2077b.getClass();
            y.d();
            u4.h hVar = c2077b.f23648c;
            hVar.getClass();
            y.d();
            o3.d dVar = Y.f21566h;
            if (dVar != null) {
                try {
                    u4.y yVar = hVar.f23689a;
                    z zVar = new z(dVar);
                    Parcel Q7 = yVar.Q();
                    com.google.android.gms.internal.cast.C.d(Q7, zVar);
                    yVar.g1(Q7, 3);
                } catch (RemoteException e9) {
                    u4.h.f23688c.a(e9, "Unable to call %s on %s.", "removeSessionManagerListener", u4.y.class.getSimpleName());
                }
            }
            hVar.b(false);
            C2077b X8 = X();
            X8.getClass();
            y.d();
            X8.f23648c.b(true);
        }
        super.onDestroy();
    }

    @Override // i0.AbstractActivityC1369y, android.app.Activity
    public final void onPause() {
        V(false);
        C1337N P8 = P();
        InterfaceC1332I interfaceC1332I = (InterfaceC1332I) this.f13812p0.getValue();
        ArrayList arrayList = P8.f18206l;
        if (arrayList != null) {
            arrayList.remove(interfaceC1332I);
        }
        ((n) b0()).f(false);
        a0 d02 = d0();
        d02.getClass();
        d02.d(false, new C1222Y(d02, null));
        super.onPause();
    }

    @Override // i0.AbstractActivityC1369y, android.app.Activity
    public final void onResume() {
        super.onResume();
        C1337N P8 = P();
        InterfaceC1332I interfaceC1332I = (InterfaceC1332I) this.f13812p0.getValue();
        if (P8.f18206l == null) {
            P8.f18206l = new ArrayList();
        }
        P8.f18206l.add(interfaceC1332I);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p0(boolean r14) {
        /*
            r13 = this;
            g2.a0 r0 = r13.d0()
            boolean r0 = r0.f17648y
            if (r0 != 0) goto L10
            com.anilab.android.ui.views.FreakIntroButton r14 = r13.f13817v0
            if (r14 == 0) goto Lc5
            r14.getVisibility()
            return
        L10:
            com.anilab.android.ui.views.FreakIntroButton r0 = r13.f13817v0
            if (r0 != 0) goto L16
            goto Lc5
        L16:
            g2.a0 r1 = r13.d0()
            I2.a r1 = r1.f17639p
            I2.b r1 = r1.f3450g
            j3.r0 r2 = r13.Z()
            long r2 = r2.T()
            A7.h r4 = r1.f3459d
            r2.c r5 = r13.f13802f0
            r2.c r6 = r2.c.f22600d
            r7 = 8
            if (r5 != r6) goto L34
            r0.setVisibility(r7)
            return
        L34:
            r2.c r6 = r2.c.f22597a
            if (r14 != 0) goto Lc6
            A7.h r14 = r1.f3460e
            if (r4 != 0) goto L40
            if (r14 != 0) goto L40
            goto Lc6
        L40:
            r2.c r1 = r2.c.f22598b
            r2.c r8 = r2.c.f22599c
            r9 = 1
            r10 = 0
            if (r4 == 0) goto L82
            if (r5 == r8) goto L82
            java.lang.Object r5 = r4.f547a
            java.lang.Number r5 = (java.lang.Number) r5
            long r11 = r5.longValue()
            int r5 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r5 < 0) goto L64
            java.lang.Object r4 = r4.f548b
            java.lang.Number r4 = (java.lang.Number) r4
            long r4 = r4.longValue()
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 >= 0) goto L64
            r4 = r9
            goto L65
        L64:
            r4 = r10
        L65:
            if (r4 == 0) goto L69
            r5 = r1
            goto L6a
        L69:
            r5 = r6
        L6a:
            r13.f13802f0 = r5
            if (r4 == 0) goto L70
            r5 = r10
            goto L71
        L70:
            r5 = r7
        L71:
            r0.setVisibility(r5)
            if (r4 == 0) goto L82
            g2.a0 r14 = r13.d0()
            boolean r14 = r14.i()
            r0.e(r10, r14)
            return
        L82:
            if (r14 == 0) goto Lc5
            r2.c r4 = r13.f13802f0
            if (r4 == r1) goto Lc5
            java.lang.Object r1 = r14.f547a
            java.lang.Number r1 = (java.lang.Number) r1
            long r4 = r1.longValue()
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 < 0) goto Lac
            java.lang.Object r14 = r14.f548b
            java.lang.Number r14 = (java.lang.Number) r14
            long r4 = r14.longValue()
            r11 = 0
            int r1 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r1 == 0) goto Laa
            long r4 = r14.longValue()
            int r14 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r14 >= 0) goto Lac
        Laa:
            r14 = r9
            goto Lad
        Lac:
            r14 = r10
        Lad:
            if (r14 == 0) goto Lb0
            r6 = r8
        Lb0:
            r13.f13802f0 = r6
            if (r14 == 0) goto Lb5
            r7 = r10
        Lb5:
            r0.setVisibility(r7)
            if (r14 == 0) goto Lc5
            g2.a0 r14 = r13.d0()
            boolean r14 = r14.i()
            r0.e(r9, r14)
        Lc5:
            return
        Lc6:
            r0.setVisibility(r7)
            r13.f13802f0 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anilab.android.ui.player.PlayerActivity.p0(boolean):void");
    }

    @Override // j3.p0
    public final /* synthetic */ void q(int i9, boolean z9) {
    }

    @Override // j3.p0
    public final /* synthetic */ void r(i4.v vVar) {
    }

    @Override // j3.p0
    public final /* synthetic */ void s(int i9, boolean z9) {
    }

    @Override // j3.p0
    public final /* synthetic */ void t(D3.c cVar) {
    }

    @Override // j3.p0
    public final void v(G0 tracks) {
        MaterialButton buttonSD;
        MaterialButton buttonSDP;
        MaterialButton buttonHD;
        MaterialButton buttonFHD;
        MediaInfo c3;
        ArrayList arrayList;
        F0 f02;
        int i9;
        h.e(tracks, "tracks");
        AbstractC0165c abstractC0165c = this.f13799D;
        String str = "binding";
        if (abstractC0165c != null) {
            FreakToggleGroup toggleQuality = abstractC0165c.f3868d0;
            h.d(toggleQuality, "toggleQuality");
            int childCount = toggleQuality.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = toggleQuality.getChildAt(i10);
                if (childAt.getId() == R.id.buttonAuto) {
                    i9 = 0;
                } else {
                    i9 = 8;
                }
                childAt.setVisibility(i9);
            }
            F f9 = tracks.f19338a;
            h.d(f9, "getGroups(...)");
            int size = f9.size();
            int i11 = 0;
            while (true) {
                buttonSD = abstractC0165c.f3874z;
                buttonSDP = abstractC0165c.f3841A;
                buttonHD = abstractC0165c.f3873y;
                buttonFHD = abstractC0165c.f3872x;
                if (i11 >= size) {
                    break;
                }
                AbstractC0165c abstractC0165c2 = abstractC0165c;
                F0 f03 = (F0) f9.get(i11);
                String str2 = str;
                int i12 = size;
                if (f03.f19326b.f5166c == 2) {
                    int i13 = 0;
                    while (i13 < f03.f19325a) {
                        if (!f03.a(i13)) {
                            f02 = f03;
                        } else {
                            M m9 = f03.f19326b.f5167d[i13];
                            h.d(m9, "getTrackFormat(...)");
                            f02 = f03;
                            int i14 = m9.f19441r;
                            if (i14 >= 1080) {
                                h.d(buttonFHD, "buttonFHD");
                                buttonFHD.setVisibility(0);
                            } else if (i14 >= 720) {
                                h.d(buttonHD, "buttonHD");
                                buttonHD.setVisibility(0);
                            } else if (i14 >= 480) {
                                h.d(buttonSDP, "buttonSDP");
                                buttonSDP.setVisibility(0);
                            } else {
                                h.d(buttonSD, "buttonSD");
                                buttonSD.setVisibility(0);
                            }
                        }
                        i13++;
                        f03 = f02;
                    }
                }
                i11++;
                str = str2;
                abstractC0165c = abstractC0165c2;
                size = i12;
            }
            String str3 = str;
            if (!f9.isEmpty()) {
                switch (toggleQuality.getCheckedButtonId()) {
                    case R.id.buttonFHD /* 2131361923 */:
                        h.d(buttonFHD, "buttonFHD");
                        if (buttonFHD.getVisibility() != 0) {
                            toggleQuality.b(R.id.buttonAuto, true);
                            break;
                        }
                        break;
                    case R.id.buttonHD /* 2131361925 */:
                        h.d(buttonHD, "buttonHD");
                        if (buttonHD.getVisibility() != 0) {
                            toggleQuality.b(R.id.buttonAuto, true);
                            break;
                        }
                        break;
                    case R.id.buttonSD /* 2131361950 */:
                        h.d(buttonSD, "buttonSD");
                        if (buttonSD.getVisibility() != 0) {
                            toggleQuality.b(R.id.buttonAuto, true);
                            break;
                        }
                        break;
                    case R.id.buttonSDP /* 2131361951 */:
                        h.d(buttonSDP, "buttonSDP");
                        if (buttonSDP.getVisibility() != 0) {
                            toggleQuality.b(R.id.buttonAuto, true);
                            break;
                        }
                        break;
                }
            }
            if (this.Y) {
                C2077b X8 = X();
                X8.getClass();
                y.d();
                C2079d c9 = X8.f23648c.c();
                if (c9 != null) {
                    y.d();
                    v4.h hVar = c9.j;
                    if (hVar != null && (c3 = hVar.c()) != null && (arrayList = c3.f14613f) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = arrayList.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            Object obj = arrayList.get(i15);
                            i15++;
                            MediaTrack mediaTrack = (MediaTrack) obj;
                            if (mediaTrack.f14626b == 1 && mediaTrack.f14631g == 1) {
                                arrayList2.add(obj);
                            }
                        }
                        AbstractC0165c abstractC0165c3 = this.f13799D;
                        if (abstractC0165c3 != null) {
                            Q2.D d9 = abstractC0165c3.f3853N.j;
                            if (d9 != null) {
                                d9.setCastMediaTrack(arrayList2);
                            }
                        } else {
                            h.h(str3);
                            throw null;
                        }
                    }
                }
            }
            int size3 = f9.size();
            for (int i16 = 0; i16 < size3; i16++) {
                F0 f04 = (F0) f9.get(i16);
                if (f04.f19326b.f5166c == 3) {
                    for (int i17 = 0; i17 < f04.f19325a; i17++) {
                        if (f04.a(i17)) {
                            M m10 = f04.f19326b.f5167d[i17];
                            h.d(m10, "getTrackFormat(...)");
                            if ((m10.f19428d & 2) == 0 && f04.f19329e[i17] && f04.a(i17)) {
                                long j = d0().f17639p.f3444a;
                                for (I2.c cVar : d0().f17639p.f3447d) {
                                    if (h.a(cVar.f3463c, m10.f19426b)) {
                                        I2.f fVar = d0().f17645v;
                                        fVar.getClass();
                                        String str4 = cVar.f3462b;
                                        h.e(str4, "<set-?>");
                                        fVar.f3479h = str4;
                                        I2.f fVar2 = d0().f17645v;
                                        A7.h hVar2 = new A7.h(Long.valueOf(j), Long.valueOf(cVar.f3461a));
                                        fVar2.getClass();
                                        fVar2.j = hVar2;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        h.h("binding");
        throw null;
    }

    @Override // j3.p0
    public final void w(int i9) {
        if (i9 != 3) {
            if (i9 != 4) {
                return;
            }
            this.f13801Z = false;
            V(false);
            d0().l(Z().T(), true);
            return;
        }
        this.f13801Z = true;
        this.f13802f0 = c.f22597a;
    }

    @Override // j3.p0
    public final /* synthetic */ void y(Y3.c cVar) {
    }

    @Override // j3.p0
    public final /* synthetic */ void z(o0 o0Var) {
    }
}
