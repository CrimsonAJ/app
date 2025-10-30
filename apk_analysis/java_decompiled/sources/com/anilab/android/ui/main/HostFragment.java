package com.anilab.android.ui.main;

import A7.e;
import A7.f;
import B7.i;
import B7.l;
import I1.n;
import J1.S;
import N1.s;
import N1.t;
import W.g;
import Y2.r;
import Y7.B;
import Z0.a;
import android.content.Intent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Y;
import androidx.navigation.fragment.NavHostFragment;
import b2.AbstractC0588a;
import b2.C0594g;
import b2.C0597j;
import b2.C0598k;
import b2.C0599l;
import co.notix.R;
import com.anilab.android.ui.player.PlayerActivity;
import com.anilab.domain.model.Movie;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import i0.AbstractActivityC1369y;
import i0.AbstractComponentCallbacksC1366v;
import j2.C1435b;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;
import u0.C;
import u0.C2030a;
import u0.C2042m;
import u0.H;
import x0.C2156a;

/* loaded from: classes.dex */
public final class HostFragment extends AbstractC0588a<C0599l, S> {

    /* renamed from: F0, reason: collision with root package name */
    public final r f13783F0;

    public HostFragment() {
        e p9 = a.p(f.f545a, new N1.r(23, new N1.r(22, this)));
        this.f13783F0 = M4.a.i(this, p.a(C0599l.class), new s(p9, 28), new s(p9, 29), new t(this, p9, 14));
    }

    public static void y0(HostFragment hostFragment, Movie movie) {
        h.e(movie, "movie");
        hostFragment.j0(new n(movie, null, null));
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void L() {
        C0599l h02 = h0();
        h02.getClass();
        h02.d(false, new C0598k(h02, null));
    }

    @Override // M1.n
    public final int f0() {
        return R.layout.fragment_host;
    }

    @Override // M1.n
    public final void k0(int i9) {
        AbstractActivityC1369y k5;
        if (i9 != R.id.imageClearContinue) {
            if (i9 != R.id.layoutContinue || (k5 = k()) == null) {
                return;
            }
            int i10 = PlayerActivity.f13798w0;
            Intent intent = new Intent(k5, (Class<?>) PlayerActivity.class);
            intent.putExtra("extra_recently_watched", true);
            this.f4702z0.a(intent);
            return;
        }
        C0599l h02 = h0();
        h02.getClass();
        h02.d(false, new C0597j(h02, null));
        ConstraintLayout layoutContinue = ((S) e0()).f3771y;
        h.d(layoutContinue, "layoutContinue");
        layoutContinue.setVisibility(8);
    }

    @Override // M1.n
    public final List m0(g gVar) {
        S s9 = (S) gVar;
        return l.b0(s9.f3769w, s9.f3771y);
    }

    @Override // M1.n
    public final void n0(boolean z9) {
        int i9;
        LinearProgressIndicator loading = ((S) e0()).f3772z;
        h.d(loading, "loading");
        if (z9) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        loading.setVisibility(i9);
    }

    @Override // M1.n
    public final void p0() {
        NavHostFragment navHostFragment;
        H h7;
        AbstractComponentCallbacksC1366v B9 = l().B(R.id.nestedNavHostFragment);
        if (B9 instanceof NavHostFragment) {
            navHostFragment = (NavHostFragment) B9;
        } else {
            navHostFragment = null;
        }
        if (navHostFragment != null) {
            h7 = navHostFragment.e0();
        } else {
            h7 = null;
        }
        if (h7 != null) {
            BottomNavigationView bottomNavView = ((S) e0()).f3768v;
            h.d(bottomNavView, "bottomNavView");
            bottomNavView.setOnItemSelectedListener(new C1435b(19, h7));
            C2156a c2156a = new C2156a(new WeakReference(bottomNavView), h7);
            h7.f23408p.add(c2156a);
            i iVar = h7.f23400g;
            if (!iVar.isEmpty()) {
                C2042m c2042m = (C2042m) iVar.last();
                C c3 = c2042m.f23496b;
                c2042m.a();
                c2156a.a(h7, c3);
            }
        }
        B.r(Y.f(this), null, new C0594g(null, this), 3);
        C0599l h02 = h0();
        h02.getClass();
        h02.d(false, new C0598k(h02, null));
    }

    @Override // M1.B
    public final void u0() {
        j0(new C2030a(R.id.goToSelectPlayer));
    }

    @Override // M1.B
    public final void v0() {
        j0(new C2030a(R.id.goToSelectSubtitleForPlayer));
    }

    @Override // M1.n
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public final C0599l h0() {
        return (C0599l) this.f13783F0.getValue();
    }
}
