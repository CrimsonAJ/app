package com.anilab.android.ui.search;

import A7.e;
import A7.f;
import A7.l;
import G0.C0142h;
import J1.AbstractC0204u0;
import K5.ViewOnClickListenerC0215a;
import M1.n;
import N1.t;
import R1.q;
import W.g;
import Y2.r;
import Y7.B;
import Z0.a;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.Y;
import androidx.recyclerview.widget.RecyclerView;
import c2.C0762h;
import co.notix.R;
import com.anilab.android.ui.search.SearchFragment;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;
import l2.AbstractC1536a;
import l2.C1537b;
import l2.C1539d;
import l2.C1544i;
import l2.C1549n;
import l2.C1550o;

/* loaded from: classes.dex */
public final class SearchFragment extends AbstractC1536a<C1549n, AbstractC0204u0> {

    /* renamed from: D0, reason: collision with root package name */
    public final r f13828D0;

    /* renamed from: E0, reason: collision with root package name */
    public final l f13829E0;

    /* renamed from: F0, reason: collision with root package name */
    public final l f13830F0;

    /* renamed from: G0, reason: collision with root package name */
    public final l f13831G0;

    public SearchFragment() {
        e p9 = a.p(f.f545a, new e2.e(11, new e2.e(10, this)));
        this.f13828D0 = M4.a.i(this, p.a(C1549n.class), new C0762h(p9, 22), new C0762h(p9, 23), new t(this, p9, 26));
        final int i9 = 0;
        this.f13829E0 = a.q(new O7.a(this) { // from class: l2.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SearchFragment f20193b;

            {
                this.f20193b = this;
            }

            @Override // O7.a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        return new C1550o(new C0142h(1, this.f20193b, SearchFragment.class, "onMovieClick", "onMovieClick(Lcom/anilab/domain/model/Movie;)V", 0, 9));
                    case 1:
                        return new C1537b(new C0142h(1, this.f20193b, SearchFragment.class, "onMovieClick", "onMovieClick(Lcom/anilab/domain/model/Movie;)V", 0, 8));
                    default:
                        SearchFragment searchFragment = this.f20193b;
                        return new C1539d(searchFragment, ((AbstractC0204u0) searchFragment.e0()).f4098B.getLayoutManager());
                }
            }
        });
        final int i10 = 1;
        this.f13830F0 = a.q(new O7.a(this) { // from class: l2.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SearchFragment f20193b;

            {
                this.f20193b = this;
            }

            @Override // O7.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return new C1550o(new C0142h(1, this.f20193b, SearchFragment.class, "onMovieClick", "onMovieClick(Lcom/anilab/domain/model/Movie;)V", 0, 9));
                    case 1:
                        return new C1537b(new C0142h(1, this.f20193b, SearchFragment.class, "onMovieClick", "onMovieClick(Lcom/anilab/domain/model/Movie;)V", 0, 8));
                    default:
                        SearchFragment searchFragment = this.f20193b;
                        return new C1539d(searchFragment, ((AbstractC0204u0) searchFragment.e0()).f4098B.getLayoutManager());
                }
            }
        });
        final int i11 = 2;
        this.f13831G0 = a.q(new O7.a(this) { // from class: l2.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SearchFragment f20193b;

            {
                this.f20193b = this;
            }

            @Override // O7.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return new C1550o(new C0142h(1, this.f20193b, SearchFragment.class, "onMovieClick", "onMovieClick(Lcom/anilab/domain/model/Movie;)V", 0, 9));
                    case 1:
                        return new C1537b(new C0142h(1, this.f20193b, SearchFragment.class, "onMovieClick", "onMovieClick(Lcom/anilab/domain/model/Movie;)V", 0, 8));
                    default:
                        SearchFragment searchFragment = this.f20193b;
                        return new C1539d(searchFragment, ((AbstractC0204u0) searchFragment.e0()).f4098B.getLayoutManager());
                }
            }
        });
    }

    @Override // M1.n
    public final int f0() {
        return R.layout.fragment_search;
    }

    @Override // M1.n
    public final void k0(int i9) {
        if (i9 != R.id.buttonBack) {
            if (i9 != R.id.buttonFilter) {
                return;
            }
            i0(R.id.searchToFilter, null);
            return;
        }
        n.q0(this);
    }

    @Override // M1.n
    public final void l0() {
        B.r(Y.f(this), null, new C1544i(null, this), 3);
    }

    @Override // M1.n
    public final List m0(g gVar) {
        AbstractC0204u0 abstractC0204u0 = (AbstractC0204u0) gVar;
        return B7.l.b0(abstractC0204u0.f4101v, abstractC0204u0.f4103x);
    }

    @Override // M1.n
    public final void n0(boolean z9) {
        if (z9) {
            if (h0().f20222m) {
                LinearProgressIndicator loadingLoadMore = ((AbstractC0204u0) e0()).f4097A;
                h.d(loadingLoadMore, "loadingLoadMore");
                loadingLoadMore.setVisibility(0);
                return;
            } else {
                View view = ((AbstractC0204u0) e0()).f4105z.f7853k;
                h.d(view, "getRoot(...)");
                view.setVisibility(0);
                return;
            }
        }
        View view2 = ((AbstractC0204u0) e0()).f4105z.f7853k;
        h.d(view2, "getRoot(...)");
        view2.setVisibility(8);
        LinearProgressIndicator loadingLoadMore2 = ((AbstractC0204u0) e0()).f4097A;
        h.d(loadingLoadMore2, "loadingLoadMore");
        loadingLoadMore2.setVisibility(8);
    }

    @Override // M1.n
    public final void p0() {
        AbstractC0204u0 abstractC0204u0 = (AbstractC0204u0) e0();
        abstractC0204u0.f4102w.setOnClickListener(new ViewOnClickListenerC0215a(16, abstractC0204u0));
        AppCompatEditText searchView = abstractC0204u0.f4100D;
        h.d(searchView, "searchView");
        searchView.addTextChangedListener(new P1.p(abstractC0204u0, 1));
        searchView.addTextChangedListener(new q(abstractC0204u0, this, 3));
        RecyclerView recyclerView = abstractC0204u0.f4099C;
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter((C1550o) this.f13829E0.getValue());
        RecyclerView recyclerView2 = abstractC0204u0.f4098B;
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setAdapter((C1537b) this.f13830F0.getValue());
        androidx.recyclerview.widget.a layoutManager = recyclerView2.getLayoutManager();
        l lVar = this.f13831G0;
        if (layoutManager != null) {
            C1539d c1539d = (C1539d) lVar.getValue();
            c1539d.getClass();
            c1539d.f4750i = layoutManager;
        }
        recyclerView2.j((C1539d) lVar.getValue());
    }

    @Override // M1.n
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public final C1549n h0() {
        return (C1549n) this.f13828D0.getValue();
    }
}
