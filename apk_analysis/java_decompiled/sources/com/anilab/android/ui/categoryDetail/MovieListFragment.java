package com.anilab.android.ui.categoryDetail;

import A7.e;
import A7.f;
import A7.l;
import G0.C0142h;
import J1.A;
import M1.n;
import N1.a;
import N1.j;
import N1.q;
import N1.s;
import N1.t;
import N1.u;
import N1.y;
import W.g;
import Y2.r;
import Y7.B;
import android.view.View;
import androidx.lifecycle.Y;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b5.G1;
import co.notix.R;
import com.anilab.android.ui.categoryDetail.MovieListFragment;
import com.anilab.domain.model.Shortcut;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class MovieListFragment extends a<y, A> {

    /* renamed from: D0, reason: collision with root package name */
    public final r f13736D0;

    /* renamed from: E0, reason: collision with root package name */
    public final G1 f13737E0;

    /* renamed from: F0, reason: collision with root package name */
    public final l f13738F0;

    /* renamed from: G0, reason: collision with root package name */
    public final l f13739G0;

    public MovieListFragment() {
        e p9 = Z0.a.p(f.f545a, new N1.r(0, new q(this, 1)));
        this.f13736D0 = M4.a.i(this, p.a(y.class), new s(p9, 0), new s(p9, 1), new t(this, p9, 0));
        this.f13737E0 = new G1(p.a(u.class), new q(this, 0));
        final int i9 = 0;
        this.f13738F0 = Z0.a.q(new O7.a(this) { // from class: N1.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MovieListFragment f4848b;

            {
                this.f4848b = this;
            }

            @Override // O7.a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        MovieListFragment movieListFragment = this.f4848b;
                        Shortcut shortcut = movieListFragment.s0().f4874a;
                        return new f(shortcut.f14442d, kotlin.jvm.internal.h.a(movieListFragment.s0().f4874a.f14439a, "recentlyUpdated"), new C0142h(1, movieListFragment, MovieListFragment.class, "onMovieClick", "onMovieClick(Lcom/anilab/domain/model/Movie;)V", 0, 1), new i(2, movieListFragment, MovieListFragment.class, "onUpdateWatchList", "onUpdateWatchList(Lcom/anilab/domain/model/Movie;Z)V", 0, 0));
                    default:
                        MovieListFragment movieListFragment2 = this.f4848b;
                        return new j(movieListFragment2, ((A) movieListFragment2.e0()).f3607z.getLayoutManager());
                }
            }
        });
        final int i10 = 1;
        this.f13739G0 = Z0.a.q(new O7.a(this) { // from class: N1.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MovieListFragment f4848b;

            {
                this.f4848b = this;
            }

            @Override // O7.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        MovieListFragment movieListFragment = this.f4848b;
                        Shortcut shortcut = movieListFragment.s0().f4874a;
                        return new f(shortcut.f14442d, kotlin.jvm.internal.h.a(movieListFragment.s0().f4874a.f14439a, "recentlyUpdated"), new C0142h(1, movieListFragment, MovieListFragment.class, "onMovieClick", "onMovieClick(Lcom/anilab/domain/model/Movie;)V", 0, 1), new i(2, movieListFragment, MovieListFragment.class, "onUpdateWatchList", "onUpdateWatchList(Lcom/anilab/domain/model/Movie;Z)V", 0, 0));
                    default:
                        MovieListFragment movieListFragment2 = this.f4848b;
                        return new j(movieListFragment2, ((A) movieListFragment2.e0()).f3607z.getLayoutManager());
                }
            }
        });
    }

    @Override // M1.n
    public final int f0() {
        return R.layout.fragment_category_detail;
    }

    @Override // M1.n
    public final void k0(int i9) {
        if (i9 != R.id.buttonBack) {
            if (i9 != R.id.buttonSearch) {
                return;
            }
            i0(R.id.goToSearch, null);
            return;
        }
        n.q0(this);
    }

    @Override // M1.n
    public final void l0() {
        B.r(Y.f(this), null, new N1.p(null, this), 3);
        h0().g(s0().f4874a, 1, false);
    }

    @Override // M1.n
    public final List m0(g gVar) {
        A a5 = (A) gVar;
        return B7.l.b0(a5.f3603v, a5.f3604w);
    }

    @Override // M1.n
    public final void n0(boolean z9) {
        int i9 = 8;
        if (h0().f4890m) {
            LinearProgressIndicator loadingLoadMore = ((A) e0()).f3606y;
            h.d(loadingLoadMore, "loadingLoadMore");
            if (z9) {
                i9 = 0;
            }
            loadingLoadMore.setVisibility(i9);
            return;
        }
        View view = ((A) e0()).f3605x.f7853k;
        h.d(view, "getRoot(...)");
        if (z9) {
            i9 = 0;
        }
        view.setVisibility(i9);
    }

    @Override // M1.n
    public final void p0() {
        A a5 = (A) e0();
        RecyclerView recyclerView = a5.f3607z;
        recyclerView.setHasFixedSize(true);
        l lVar = this.f13738F0;
        recyclerView.setAdapter((N1.f) lVar.getValue());
        boolean z9 = s0().f4874a.f14442d;
        View view = a5.f7853k;
        if (z9) {
            int integer = q().getInteger(R.integer.span_count);
            view.getContext();
            if (1 > integer || integer >= 4) {
                integer = 2;
            }
            recyclerView.setLayoutManager(new GridLayoutManager(integer));
        } else {
            view.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
        }
        a5.f3601A.setOnRefreshListener(new N1.h(a5, 0, this));
        a5.f3602B.setText(s0().f4874a.f14440b);
        androidx.recyclerview.widget.a layoutManager = recyclerView.getLayoutManager();
        l lVar2 = this.f13739G0;
        if (layoutManager != null) {
            j jVar = (j) lVar2.getValue();
            jVar.getClass();
            jVar.f4750i = layoutManager;
        }
        recyclerView.j((j) lVar2.getValue());
        ((N1.f) lVar.getValue()).f4846i = h0().j.f5769a.b();
    }

    public final u s0() {
        return (u) this.f13737E0.getValue();
    }

    @Override // M1.n
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public final y h0() {
        return (y) this.f13736D0.getValue();
    }
}
