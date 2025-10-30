package com.anilab.android.ui.movieDetail;

import A7.e;
import A7.f;
import A7.l;
import G0.C0142h;
import H2.h;
import H2.s;
import I5.k;
import J1.AbstractC0172e0;
import L2.u;
import M1.D;
import M1.n;
import N1.t;
import P.ViewTreeObserverOnPreDrawListenerC0316q;
import R1.C0383b;
import R1.q;
import W.g;
import W7.d;
import Y2.r;
import Y7.B;
import Y7.y0;
import Z0.a;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.E;
import androidx.lifecycle.V;
import androidx.lifecycle.Y;
import androidx.recyclerview.widget.RecyclerView;
import b5.G1;
import b8.C0718Q;
import c2.C0762h;
import co.notix.R;
import com.anilab.android.ui.movieDetail.MovieDetailFragment;
import com.anilab.android.ui.views.FreakLoading;
import com.anilab.domain.model.Movie;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import d2.AbstractC1110d;
import d2.C1108b;
import d2.C1112f;
import d2.G;
import d2.H;
import d2.J;
import d2.K;
import d2.L;
import d2.v;
import d2.w;
import d2.x;
import d2.y;
import d2.z;
import i0.AbstractActivityC1369y;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.p;
import t1.C1992a;
import t1.C2004m;
import u0.C2030a;
import u0.C2042m;
import u4.AbstractC2076a;

/* loaded from: classes.dex */
public final class MovieDetailFragment extends AbstractC1110d<K, AbstractC0172e0> {

    /* renamed from: F0, reason: collision with root package name */
    public final r f13787F0;

    /* renamed from: G0, reason: collision with root package name */
    public final G1 f13788G0;

    /* renamed from: H0, reason: collision with root package name */
    public final l f13789H0;

    /* renamed from: I0, reason: collision with root package name */
    public final l f13790I0;

    /* renamed from: J0, reason: collision with root package name */
    public y0 f13791J0;

    public MovieDetailFragment() {
        e p9 = a.p(f.f545a, new y8.f(1, new w(this, 1)));
        this.f13787F0 = M4.a.i(this, p.a(K.class), new C0762h(p9, 6), new C0762h(p9, 7), new t(this, p9, 18));
        this.f13788G0 = new G1(p.a(x.class), new w(this, 0));
        final int i9 = 0;
        this.f13789H0 = a.q(new O7.a(this) { // from class: d2.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MovieDetailFragment f16783b;

            {
                this.f16783b = this;
            }

            @Override // O7.a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        MovieDetailFragment movieDetailFragment = this.f16783b;
                        return new C1108b(movieDetailFragment.x0().f16822a, new C1112f(movieDetailFragment, 0));
                    default:
                        return new L(new C0142h(1, this.f16783b, MovieDetailFragment.class, "onMovieClick", "onMovieClick(Lcom/anilab/domain/model/Movie;)V", 0, 5));
                }
            }
        });
        final int i10 = 1;
        this.f13790I0 = a.q(new O7.a(this) { // from class: d2.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MovieDetailFragment f16783b;

            {
                this.f16783b = this;
            }

            @Override // O7.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        MovieDetailFragment movieDetailFragment = this.f16783b;
                        return new C1108b(movieDetailFragment.x0().f16822a, new C1112f(movieDetailFragment, 0));
                    default:
                        return new L(new C0142h(1, this.f16783b, MovieDetailFragment.class, "onMovieClick", "onMovieClick(Lcom/anilab/domain/model/Movie;)V", 0, 5));
                }
            }
        });
    }

    public final void A0(Movie movie) {
        int i9;
        AbstractC0172e0 abstractC0172e0 = (AbstractC0172e0) e0();
        Context context = ((AbstractC0172e0) e0()).f7853k.getContext();
        if (movie.f14428p) {
            i9 = R.color.colorRed;
        } else {
            i9 = R.color.white;
        }
        abstractC0172e0.f3911w.setImageTintList(ColorStateList.valueOf(context.getColor(i9)));
    }

    @Override // M1.n
    public final int f0() {
        return R.layout.fragment_movie_detail;
    }

    @Override // M1.n
    public final void k0(int i9) {
        switch (i9) {
            case R.id.buttonBack /* 2131361905 */:
                n.q0(this);
                return;
            case R.id.buttonBookmark /* 2131361907 */:
                if (!h0().f16752l.f5769a.b()) {
                    j0(new C2030a(R.id.goToLogin));
                    return;
                }
                K h02 = h0();
                Movie movie = x0().f16822a;
                boolean z9 = !x0().f16822a.f14428p;
                h02.getClass();
                h02.d(false, new J(z9, h02, movie.f14414a, null));
                x0().f16822a.f14428p = !x0().f16822a.f14428p;
                A0(x0().f16822a);
                return;
            case R.id.buttonDownload /* 2131361918 */:
                if (h0().f16744A) {
                    o0(new D(R.string.no_server_found));
                    return;
                }
                h hVar = h0().f16766z;
                if (hVar != null && hVar.f3023a) {
                    j0(new y(x0().f16822a));
                    return;
                } else {
                    o0(new D(R.string.message_not_allow_download));
                    return;
                }
            case R.id.buttonPlay /* 2131361942 */:
                if (k() != null) {
                    if (h0().f16744A) {
                        o0(new D(R.string.no_server_found));
                        return;
                    } else {
                        t0(new s(x0().f16822a.f14414a, x0().f16822a.f14416c, x0().f16822a.f14415b, 0L, x0().f16822a.f14420g, x0().f16822a.f14417d, 8));
                        return;
                    }
                }
                return;
            case R.id.buttonShare /* 2131361958 */:
                String a5 = u.a(h0().f16756p, x0().f16822a.f14414a, 2);
                if (d.U(a5)) {
                    o0(new D(R.string.msg_comming_soon));
                    return;
                }
                try {
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.putExtra("android.intent.extra.TEXT", a5);
                    intent.setType("text/plain");
                    d0(Intent.createChooser(intent, r(R.string.label_share)));
                    return;
                } catch (Exception unused) {
                    o0(new D(R.string.msg_unknown_error));
                    return;
                }
            case R.id.imageStar /* 2131362254 */:
            case R.id.textRating /* 2131362766 */:
                j0(new z(x0().f16822a));
                return;
            case R.id.textComment /* 2131362715 */:
                i0(R.id.comment, a.c(new A7.h("EXTRA_MOVIE_ID", Long.valueOf(x0().f16822a.f14414a))));
                return;
            default:
                return;
        }
    }

    @Override // M1.B, M1.n
    public final void l0() {
        boolean z9;
        super.l0();
        B.r(Y.f(this), null, new d2.s(null, this), 3);
        K h02 = h0();
        Movie movie = x0().f16822a;
        h02.getClass();
        C0718Q c0718q = h02.f16757q;
        if (c0718q.h() != null) {
            return;
        }
        if (c0718q.h() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        h02.d(z9, new G(h02, movie, null));
        h02.d(false, new H(h02, movie, null));
    }

    @Override // M1.n
    public final List m0(g gVar) {
        AbstractC0172e0 abstractC0172e0 = (AbstractC0172e0) gVar;
        return B7.l.b0(abstractC0172e0.f3910v, abstractC0172e0.f3914z, abstractC0172e0.f3913y, abstractC0172e0.f3911w, abstractC0172e0.f3890A, abstractC0172e0.f3899J, abstractC0172e0.f3904P, abstractC0172e0.f3894E);
    }

    @Override // M1.n
    public final void n0(boolean z9) {
        int i9;
        FreakLoading layoutLoading = ((AbstractC0172e0) e0()).f3896G;
        kotlin.jvm.internal.h.d(layoutLoading, "layoutLoading");
        if (z9) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        layoutLoading.setVisibility(i9);
    }

    /* JADX WARN: Type inference failed for: r3v16, types: [androidx.lifecycle.E, androidx.lifecycle.U] */
    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.lifecycle.E, androidx.lifecycle.U] */
    @Override // M1.n
    public final void p0() {
        V v8;
        Context context;
        final int i9 = 0;
        final int i10 = 1;
        z0(x0().f16822a);
        AbstractC0172e0 abstractC0172e0 = (AbstractC0172e0) e0();
        abstractC0172e0.f3901M.postDelayed(new A6.s(21, abstractC0172e0), 2000L);
        RecyclerView recyclerView = abstractC0172e0.f3897H;
        recyclerView.setHasFixedSize(true);
        RecyclerView recyclerView2 = abstractC0172e0.f3898I;
        recyclerView2.setHasFixedSize(true);
        recyclerView.setAdapter((C1108b) this.f13789H0.getValue());
        recyclerView2.setAdapter((L) this.f13790I0.getValue());
        abstractC0172e0.f3893D.setOnClickListener(new k(abstractC0172e0, 15, this));
        AppCompatEditText inputSearchEpisode = abstractC0172e0.f3895F;
        kotlin.jvm.internal.h.d(inputSearchEpisode, "inputSearchEpisode");
        inputSearchEpisode.addTextChangedListener(new q(abstractC0172e0, this, i10));
        inputSearchEpisode.setOnEditorActionListener(new C0383b(1, this));
        abstractC0172e0.f3906R.setOnClickListener(new View.OnClickListener(this) { // from class: d2.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MovieDetailFragment f16787b;

            {
                this.f16787b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        MovieDetailFragment movieDetailFragment = this.f16787b;
                        Movie movie = (Movie) ((C0718Q) movieDetailFragment.h0().f16758r.f11422a).h();
                        if (movie != null) {
                            String fullDetail = movie.f14418e;
                            kotlin.jvm.internal.h.e(fullDetail, "fullDetail");
                            movieDetailFragment.j0(new C1106A(fullDetail));
                            return;
                        }
                        return;
                    default:
                        MovieDetailFragment movieDetailFragment2 = this.f16787b;
                        Movie movie2 = (Movie) ((C0718Q) movieDetailFragment2.h0().f16758r.f11422a).h();
                        if (movie2 != null) {
                            String fullDetail2 = movie2.f14418e;
                            kotlin.jvm.internal.h.e(fullDetail2, "fullDetail");
                            movieDetailFragment2.j0(new C1106A(fullDetail2));
                            return;
                        }
                        return;
                }
            }
        });
        abstractC0172e0.f3902N.setOnClickListener(new View.OnClickListener(this) { // from class: d2.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MovieDetailFragment f16787b;

            {
                this.f16787b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        MovieDetailFragment movieDetailFragment = this.f16787b;
                        Movie movie = (Movie) ((C0718Q) movieDetailFragment.h0().f16758r.f11422a).h();
                        if (movie != null) {
                            String fullDetail = movie.f14418e;
                            kotlin.jvm.internal.h.e(fullDetail, "fullDetail");
                            movieDetailFragment.j0(new C1106A(fullDetail));
                            return;
                        }
                        return;
                    default:
                        MovieDetailFragment movieDetailFragment2 = this.f16787b;
                        Movie movie2 = (Movie) ((C0718Q) movieDetailFragment2.h0().f16758r.f11422a).h();
                        if (movie2 != null) {
                            String fullDetail2 = movie2.f14418e;
                            kotlin.jvm.internal.h.e(fullDetail2, "fullDetail");
                            movieDetailFragment2.j0(new C1106A(fullDetail2));
                            return;
                        }
                        return;
                }
            }
        });
        E e8 = null;
        if (!h0().f16746C) {
            AbstractActivityC1369y k5 = k();
            if (k5 != null) {
                context = k5.getApplicationContext();
            } else {
                context = null;
            }
            if (context != null) {
                AbstractC2076a.a(context, ((AbstractC0172e0) e0()).f3912x);
            }
        }
        C2042m c2042m = (C2042m) AbstractC1002u1.A(this).f23400g.g();
        if (c2042m != null && (v8 = (V) c2042m.f23504k.getValue()) != null) {
            LinkedHashMap linkedHashMap = v8.f9845c;
            Object obj = linkedHashMap.get("UPDATE_VOTE");
            if (obj instanceof E) {
                e8 = (E) obj;
            }
            if (e8 == null) {
                LinkedHashMap linkedHashMap2 = v8.f9843a;
                if (linkedHashMap2.containsKey("UPDATE_VOTE")) {
                    ?? e9 = new E(linkedHashMap2.get("UPDATE_VOTE"));
                    e9.f9840l = "UPDATE_VOTE";
                    e9.f9841m = v8;
                    e8 = e9;
                } else {
                    ?? e10 = new E();
                    e10.f9840l = "UPDATE_VOTE";
                    e10.f9841m = v8;
                    e8 = e10;
                }
                linkedHashMap.put("UPDATE_VOTE", e8);
            }
            e8.d(t(), new d2.u(0, new C1112f(this, 1)));
        }
        String str = x0().f16823b;
        String str2 = x0().f16824c;
        if (h0().f16745B && str != null && str2 != null) {
            h0().f16745B = false;
            i0(R.id.comment, a.c(new A7.h("EXTRA_MOVIE_ID", Long.valueOf(x0().f16822a.f14414a)), new A7.h("EXTRA_PARENT_ID", x0().f16823b), new A7.h("EXTRA_CHILD_ID", x0().f16824c)));
        }
    }

    @Override // M1.B
    public final void u0() {
        j0(new C2030a(R.id.goToSelectPlayer));
    }

    @Override // M1.B
    public final void v0() {
        j0(new C2030a(R.id.goToSelectSubtitleForPlayer));
    }

    public final x x0() {
        return (x) this.f13788G0.getValue();
    }

    @Override // M1.n
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public final K h0() {
        return (K) this.f13787F0.getValue();
    }

    public final void z0(Movie movie) {
        boolean z9;
        int i9;
        int i10;
        int i11 = 0;
        if (movie == null) {
            return;
        }
        x0().f16822a.f14430r = movie.f14430r;
        x0().f16822a.f14428p = movie.f14428p;
        AbstractC0172e0 abstractC0172e0 = (AbstractC0172e0) e0();
        AppCompatImageView imageMovie = abstractC0172e0.f3892C;
        kotlin.jvm.internal.h.d(imageMovie, "imageMovie");
        String J8 = W7.l.J(movie.f14415b, "313x438", "963x900");
        C2004m a5 = C1992a.a(imageMovie.getContext());
        C1.h hVar = new C1.h(imageMovie.getContext());
        hVar.f1179c = J8;
        hVar.b(imageMovie);
        a5.b(hVar.a());
        abstractC0172e0.f3901M.setText(movie.f14416c);
        abstractC0172e0.f3904P.setText(String.valueOf(movie.f14430r));
        int i12 = movie.f14420g;
        Integer valueOf = Integer.valueOf(i12);
        if (i12 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        String str = null;
        if (!z9) {
            valueOf = null;
        }
        if (valueOf != null) {
            str = valueOf.toString();
        }
        abstractC0172e0.f3907S.setText(str);
        abstractC0172e0.f3900L.setText(s(R.string.format_genre, movie.a()));
        String str2 = movie.f14418e;
        AppCompatTextView appCompatTextView = abstractC0172e0.f3902N;
        appCompatTextView.setText(str2);
        ViewTreeObserverOnPreDrawListenerC0316q.a(appCompatTextView, new v(appCompatTextView, abstractC0172e0, movie));
        String str3 = movie.f14431s;
        AppCompatTextView appCompatTextView2 = abstractC0172e0.f3905Q;
        appCompatTextView2.setText(str3);
        if (!d.U(str3)) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        appCompatTextView2.setVisibility(i9);
        String str4 = movie.f14432t;
        AppCompatTextView appCompatTextView3 = abstractC0172e0.f3903O;
        appCompatTextView3.setText(str4);
        if (!d.U(str4)) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        appCompatTextView3.setVisibility(i10);
        AppCompatTextView textDUB = abstractC0172e0.K;
        kotlin.jvm.internal.h.d(textDUB, "textDUB");
        if (movie.f14424l != 1) {
            i11 = 8;
        }
        textDUB.setVisibility(i11);
        A0(movie);
    }
}
