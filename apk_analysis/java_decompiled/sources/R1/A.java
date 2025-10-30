package R1;

import O2.C0288n;
import O2.U;
import b8.AbstractC0714M;
import b8.C0709H;
import b8.C0718Q;

/* loaded from: classes.dex */
public final class A extends M1.r {

    /* renamed from: f, reason: collision with root package name */
    public final O2.B f6495f;

    /* renamed from: g, reason: collision with root package name */
    public final C0288n f6496g;

    /* renamed from: h, reason: collision with root package name */
    public final U f6497h;

    /* renamed from: i, reason: collision with root package name */
    public final C0718Q f6498i;
    public final C0709H j;

    /* renamed from: k, reason: collision with root package name */
    public final C0718Q f6499k;

    /* renamed from: l, reason: collision with root package name */
    public final C0718Q f6500l;

    /* renamed from: m, reason: collision with root package name */
    public I2.a f6501m;

    /* renamed from: n, reason: collision with root package name */
    public final C0718Q f6502n;

    /* renamed from: o, reason: collision with root package name */
    public final C0709H f6503o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6504p;

    public A(O2.B getListEpisodeUseCase, C0288n getAnimeEpisodeUseCase, U hlsParserUseCase) {
        kotlin.jvm.internal.h.e(getListEpisodeUseCase, "getListEpisodeUseCase");
        kotlin.jvm.internal.h.e(getAnimeEpisodeUseCase, "getAnimeEpisodeUseCase");
        kotlin.jvm.internal.h.e(hlsParserUseCase, "hlsParserUseCase");
        this.f6495f = getListEpisodeUseCase;
        this.f6496g = getAnimeEpisodeUseCase;
        this.f6497h = hlsParserUseCase;
        C0718Q c3 = AbstractC0714M.c(B7.t.f1135a);
        this.f6498i = c3;
        this.j = new C0709H(c3);
        this.f6499k = AbstractC0714M.c(B7.y.E(new A7.h(J2.c.f4162b, "")));
        this.f6500l = AbstractC0714M.c(Boolean.FALSE);
        this.f6501m = new I2.a(0L, 0, null, null, null, null, null, 0L, false, false, false, 8191);
        C0718Q c9 = AbstractC0714M.c(new M1.t(v.f6557b));
        this.f6502n = c9;
        this.f6503o = new C0709H(c9);
    }
}
