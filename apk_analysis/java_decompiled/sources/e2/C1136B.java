package e2;

import O2.S;
import O2.a0;
import b8.AbstractC0714M;
import b8.C0709H;
import b8.C0718Q;
import com.anilab.domain.model.Movie;

/* renamed from: e2.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1136B extends M1.r {

    /* renamed from: f, reason: collision with root package name */
    public final S f17083f;

    /* renamed from: g, reason: collision with root package name */
    public final P2.e f17084g;

    /* renamed from: h, reason: collision with root package name */
    public final P2.s f17085h;

    /* renamed from: i, reason: collision with root package name */
    public final a0 f17086i;
    public final C0718Q j;

    /* renamed from: k, reason: collision with root package name */
    public final C0709H f17087k;

    /* renamed from: l, reason: collision with root package name */
    public final C0718Q f17088l;

    /* renamed from: m, reason: collision with root package name */
    public final C0718Q f17089m;

    /* renamed from: n, reason: collision with root package name */
    public Movie f17090n;

    public C1136B(S getWatchListUseCase, P2.e checkLoginUserCase, P2.s pinToMyListUseCase, a0 removeFromWatchListUseCase) {
        kotlin.jvm.internal.h.e(getWatchListUseCase, "getWatchListUseCase");
        kotlin.jvm.internal.h.e(checkLoginUserCase, "checkLoginUserCase");
        kotlin.jvm.internal.h.e(pinToMyListUseCase, "pinToMyListUseCase");
        kotlin.jvm.internal.h.e(removeFromWatchListUseCase, "removeFromWatchListUseCase");
        this.f17083f = getWatchListUseCase;
        this.f17084g = checkLoginUserCase;
        this.f17085h = pinToMyListUseCase;
        this.f17086i = removeFromWatchListUseCase;
        C0718Q c3 = AbstractC0714M.c(B7.t.f1135a);
        this.j = c3;
        this.f17087k = new C0709H(c3);
        this.f17088l = AbstractC0714M.c(new M1.t(x.f17134a));
        this.f17089m = AbstractC0714M.c(new M1.t(Boolean.FALSE));
    }
}
