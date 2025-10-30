package d2;

import O2.C0280f;
import O2.C0299z;
import O2.P;
import O2.a0;
import b8.AbstractC0714M;
import b8.C0709H;
import b8.C0718Q;
import com.anilab.android.App;

/* loaded from: classes.dex */
public final class K extends M1.r {

    /* renamed from: A, reason: collision with root package name */
    public boolean f16744A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f16745B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f16746C;

    /* renamed from: f, reason: collision with root package name */
    public final O0.c f16747f;

    /* renamed from: g, reason: collision with root package name */
    public final O2.B f16748g;

    /* renamed from: h, reason: collision with root package name */
    public final O2.H f16749h;

    /* renamed from: i, reason: collision with root package name */
    public final O2.E f16750i;
    public final a0 j;

    /* renamed from: k, reason: collision with root package name */
    public final C0280f f16751k;

    /* renamed from: l, reason: collision with root package name */
    public final P2.e f16752l;

    /* renamed from: m, reason: collision with root package name */
    public final P f16753m;

    /* renamed from: n, reason: collision with root package name */
    public final L2.j f16754n;

    /* renamed from: o, reason: collision with root package name */
    public final C0299z f16755o;

    /* renamed from: p, reason: collision with root package name */
    public final L2.u f16756p;

    /* renamed from: q, reason: collision with root package name */
    public final C0718Q f16757q;

    /* renamed from: r, reason: collision with root package name */
    public final C0709H f16758r;

    /* renamed from: s, reason: collision with root package name */
    public final C0718Q f16759s;

    /* renamed from: t, reason: collision with root package name */
    public final C0709H f16760t;

    /* renamed from: u, reason: collision with root package name */
    public final C0718Q f16761u;

    /* renamed from: v, reason: collision with root package name */
    public final C0709H f16762v;

    /* renamed from: w, reason: collision with root package name */
    public final C0718Q f16763w;

    /* renamed from: x, reason: collision with root package name */
    public final C0709H f16764x;

    /* renamed from: y, reason: collision with root package name */
    public final C0718Q f16765y;

    /* renamed from: z, reason: collision with root package name */
    public H2.h f16766z;

    public K(O0.c cVar, O2.B getListEpisodeUseCase, O2.H getRelateMovieUseCase, O2.E getLocalWatchListUseCase, a0 removeFromWatchListUseCase, C0280f addToWatchListUseCase, P2.e checkLoginUserCase, P getVoteMovieUseCase, L2.j getDownloaderUseCase, C0299z getListCommentUseCase, L2.u linkUseCase) {
        kotlin.jvm.internal.h.e(getListEpisodeUseCase, "getListEpisodeUseCase");
        kotlin.jvm.internal.h.e(getRelateMovieUseCase, "getRelateMovieUseCase");
        kotlin.jvm.internal.h.e(getLocalWatchListUseCase, "getLocalWatchListUseCase");
        kotlin.jvm.internal.h.e(removeFromWatchListUseCase, "removeFromWatchListUseCase");
        kotlin.jvm.internal.h.e(addToWatchListUseCase, "addToWatchListUseCase");
        kotlin.jvm.internal.h.e(checkLoginUserCase, "checkLoginUserCase");
        kotlin.jvm.internal.h.e(getVoteMovieUseCase, "getVoteMovieUseCase");
        kotlin.jvm.internal.h.e(getDownloaderUseCase, "getDownloaderUseCase");
        kotlin.jvm.internal.h.e(getListCommentUseCase, "getListCommentUseCase");
        kotlin.jvm.internal.h.e(linkUseCase, "linkUseCase");
        this.f16747f = cVar;
        this.f16748g = getListEpisodeUseCase;
        this.f16749h = getRelateMovieUseCase;
        this.f16750i = getLocalWatchListUseCase;
        this.j = removeFromWatchListUseCase;
        this.f16751k = addToWatchListUseCase;
        this.f16752l = checkLoginUserCase;
        this.f16753m = getVoteMovieUseCase;
        this.f16754n = getDownloaderUseCase;
        this.f16755o = getListCommentUseCase;
        this.f16756p = linkUseCase;
        C0718Q c3 = AbstractC0714M.c(null);
        this.f16757q = c3;
        this.f16758r = new C0709H(c3);
        B7.t tVar = B7.t.f1135a;
        C0718Q c9 = AbstractC0714M.c(tVar);
        this.f16759s = c9;
        this.f16760t = new C0709H(c9);
        C0718Q c10 = AbstractC0714M.c(tVar);
        this.f16761u = c10;
        this.f16762v = new C0709H(c10);
        C0718Q c11 = AbstractC0714M.c(new M1.t(Boolean.FALSE));
        this.f16763w = c11;
        this.f16764x = new C0709H(c11);
        this.f16765y = AbstractC0714M.c(null);
        this.f16745B = true;
        this.f16746C = App.f13716i.get();
        d(false, new C(this, null));
    }
}
