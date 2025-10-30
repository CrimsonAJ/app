package com.anilab.android.ui.filterResult;

import A7.e;
import A7.f;
import A7.l;
import C2.P;
import G0.C0142h;
import J1.L;
import N1.s;
import N1.t;
import V1.b;
import V1.d;
import V1.i;
import V1.j;
import V1.k;
import V1.n;
import V1.o;
import W.g;
import Y2.r;
import Y7.B;
import Z0.a;
import androidx.lifecycle.Y;
import androidx.recyclerview.widget.RecyclerView;
import b5.G1;
import co.notix.R;
import com.anilab.android.ui.filterResult.FilterResultFragment;
import com.anilab.domain.model.FilterConfig;
import com.anilab.domain.model.Genre;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class FilterResultFragment extends o<n, L> {

    /* renamed from: D0, reason: collision with root package name */
    public final r f13766D0;

    /* renamed from: E0, reason: collision with root package name */
    public final l f13767E0;

    /* renamed from: F0, reason: collision with root package name */
    public final l f13768F0;

    /* renamed from: G0, reason: collision with root package name */
    public final l f13769G0;

    /* renamed from: H0, reason: collision with root package name */
    public final G1 f13770H0;

    public FilterResultFragment() {
        e p9 = a.p(f.f545a, new N1.r(12, new j(this, 1)));
        this.f13766D0 = M4.a.i(this, p.a(n.class), new s(p9, 16), new s(p9, 17), new t(this, p9, 8));
        this.f13767E0 = a.q(new P(12));
        final int i9 = 0;
        this.f13768F0 = a.q(new O7.a(this) { // from class: V1.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FilterResultFragment f7619b;

            {
                this.f7619b = this;
            }

            @Override // O7.a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        return new p(new C0142h(1, this.f7619b, FilterResultFragment.class, "onMovieClick", "onMovieClick(Lcom/anilab/domain/model/Movie;)V", 0, 3));
                    default:
                        FilterResultFragment filterResultFragment = this.f7619b;
                        return new d(filterResultFragment, ((L) filterResultFragment.e0()).f3714z.getLayoutManager());
                }
            }
        });
        final int i10 = 1;
        this.f13769G0 = a.q(new O7.a(this) { // from class: V1.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FilterResultFragment f7619b;

            {
                this.f7619b = this;
            }

            @Override // O7.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return new p(new C0142h(1, this.f7619b, FilterResultFragment.class, "onMovieClick", "onMovieClick(Lcom/anilab/domain/model/Movie;)V", 0, 3));
                    default:
                        FilterResultFragment filterResultFragment = this.f7619b;
                        return new d(filterResultFragment, ((L) filterResultFragment.e0()).f3714z.getLayoutManager());
                }
            }
        });
        this.f13770H0 = new G1(p.a(k.class), new j(this, 0));
    }

    @Override // M1.n
    public final int f0() {
        return R.layout.fragment_filter_result;
    }

    @Override // M1.n
    public final void k0(int i9) {
        if (i9 != R.id.buttonBack && i9 != R.id.buttonFilter) {
            return;
        }
        M1.n.q0(this);
    }

    @Override // M1.n
    public final void l0() {
        B.r(Y.f(this), null, new i(null, this), 3);
        h0().g(1, s0().f7633b, s0().f7632a, s0().f7634c, B7.j.o0(s0().f7635d));
    }

    @Override // M1.n
    public final List m0(g gVar) {
        L l9 = (L) gVar;
        return B7.l.b0(l9.f3711w, l9.f3710v);
    }

    @Override // M1.n
    public final void n0(boolean z9) {
        int i9;
        LinearProgressIndicator loadingLoadMore = ((L) e0()).f3712x;
        h.d(loadingLoadMore, "loadingLoadMore");
        if (z9) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        loadingLoadMore.setVisibility(i9);
    }

    @Override // M1.n
    public final void p0() {
        L l9 = (L) e0();
        l lVar = this.f13767E0;
        l9.f3713y.setAdapter((b) lVar.getValue());
        RecyclerView recyclerView = l9.f3714z;
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter((V1.p) this.f13768F0.getValue());
        androidx.recyclerview.widget.a layoutManager = recyclerView.getLayoutManager();
        l lVar2 = this.f13769G0;
        if (layoutManager != null) {
            d dVar = (d) lVar2.getValue();
            dVar.getClass();
            dVar.f4750i = layoutManager;
        }
        l9.f3709A.setOnRefreshListener(new N1.h(l9, 2, this));
        ArrayList arrayList = new ArrayList();
        arrayList.add(s0().f7634c);
        arrayList.add(s0().f7632a);
        arrayList.add(s0().f7633b);
        Genre[] genreArr = s0().f7635d;
        ArrayList arrayList2 = new ArrayList(genreArr.length);
        for (Genre genre : genreArr) {
            String str = genre.f14406b;
            arrayList2.add(new FilterConfig(str, str));
        }
        arrayList.addAll(arrayList2);
        recyclerView.j((d) lVar2.getValue());
        ((b) lVar.getValue()).o(arrayList);
    }

    public final k s0() {
        return (k) this.f13770H0.getValue();
    }

    @Override // M1.n
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public final n h0() {
        return (n) this.f13766D0.getValue();
    }
}
