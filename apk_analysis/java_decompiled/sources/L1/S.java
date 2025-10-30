package L1;

import L2.C0237a;
import L2.C0240d;
import L2.C0242f;
import L2.C0244h;
import O2.b0;
import Y7.y0;
import android.app.Application;
import androidx.lifecycle.Y;
import b8.AbstractC0714M;
import b8.C0709H;
import b8.C0718Q;

/* loaded from: classes.dex */
public final class S extends M1.r {

    /* renamed from: A, reason: collision with root package name */
    public H2.s f4491A;

    /* renamed from: B, reason: collision with root package name */
    public H2.t f4492B;

    /* renamed from: f, reason: collision with root package name */
    public final P2.e f4493f;

    /* renamed from: g, reason: collision with root package name */
    public final P2.k f4494g;

    /* renamed from: h, reason: collision with root package name */
    public final C0240d f4495h;

    /* renamed from: i, reason: collision with root package name */
    public final L2.G f4496i;
    public final Application j;

    /* renamed from: k, reason: collision with root package name */
    public final P2.g f4497k;

    /* renamed from: l, reason: collision with root package name */
    public final b0 f4498l;

    /* renamed from: m, reason: collision with root package name */
    public final L2.v f4499m;

    /* renamed from: n, reason: collision with root package name */
    public final C0718Q f4500n;

    /* renamed from: o, reason: collision with root package name */
    public final C0718Q f4501o;

    /* renamed from: p, reason: collision with root package name */
    public final C0718Q f4502p;

    /* renamed from: q, reason: collision with root package name */
    public final C0718Q f4503q;

    /* renamed from: r, reason: collision with root package name */
    public final C0718Q f4504r;

    /* renamed from: s, reason: collision with root package name */
    public final C0709H f4505s;

    /* renamed from: t, reason: collision with root package name */
    public final C0718Q f4506t;

    /* renamed from: u, reason: collision with root package name */
    public final C0718Q f4507u;

    /* renamed from: v, reason: collision with root package name */
    public final C0718Q f4508v;

    /* renamed from: w, reason: collision with root package name */
    public final String f4509w;

    /* renamed from: x, reason: collision with root package name */
    public H2.o f4510x;

    /* renamed from: y, reason: collision with root package name */
    public int f4511y;

    /* renamed from: z, reason: collision with root package name */
    public y0 f4512z;

    public S(P2.e checkLoginUserCase, P2.k getUserInfoUseCase, C0240d deviceSyncUseCase, L2.G uuidUseCase, Application application, P2.g continueWatchUseCase, b0 saveWatchedUseCase, L2.v lastLoopUseCase, A1.g gVar, L2.H versionNameUseCase, M2.b getGenresUseCase, L2.t latestVersionUseCase, C0242f getAllSettingsUseCase, C0244h getAvatarsUseCase, L2.r ipInfoUseCase, C0237a cfgUseCase, L2.x netCacheUseCase, L2.F reachableUseCase) {
        kotlin.jvm.internal.h.e(checkLoginUserCase, "checkLoginUserCase");
        kotlin.jvm.internal.h.e(getUserInfoUseCase, "getUserInfoUseCase");
        kotlin.jvm.internal.h.e(deviceSyncUseCase, "deviceSyncUseCase");
        kotlin.jvm.internal.h.e(uuidUseCase, "uuidUseCase");
        kotlin.jvm.internal.h.e(continueWatchUseCase, "continueWatchUseCase");
        kotlin.jvm.internal.h.e(saveWatchedUseCase, "saveWatchedUseCase");
        kotlin.jvm.internal.h.e(lastLoopUseCase, "lastLoopUseCase");
        kotlin.jvm.internal.h.e(versionNameUseCase, "versionNameUseCase");
        kotlin.jvm.internal.h.e(getGenresUseCase, "getGenresUseCase");
        kotlin.jvm.internal.h.e(latestVersionUseCase, "latestVersionUseCase");
        kotlin.jvm.internal.h.e(getAllSettingsUseCase, "getAllSettingsUseCase");
        kotlin.jvm.internal.h.e(getAvatarsUseCase, "getAvatarsUseCase");
        kotlin.jvm.internal.h.e(ipInfoUseCase, "ipInfoUseCase");
        kotlin.jvm.internal.h.e(cfgUseCase, "cfgUseCase");
        kotlin.jvm.internal.h.e(netCacheUseCase, "netCacheUseCase");
        kotlin.jvm.internal.h.e(reachableUseCase, "reachableUseCase");
        this.f4493f = checkLoginUserCase;
        this.f4494g = getUserInfoUseCase;
        this.f4495h = deviceSyncUseCase;
        this.f4496i = uuidUseCase;
        this.j = application;
        this.f4497k = continueWatchUseCase;
        this.f4498l = saveWatchedUseCase;
        this.f4499m = lastLoopUseCase;
        Boolean bool = Boolean.FALSE;
        this.f4500n = AbstractC0714M.c(new M1.t(bool));
        this.f4501o = AbstractC0714M.c(new M1.t(bool));
        this.f4502p = AbstractC0714M.c(new M1.t(bool));
        this.f4503q = AbstractC0714M.c(new M1.t(b2.o.f10500a));
        C0718Q c3 = AbstractC0714M.c(new M1.t(bool));
        this.f4504r = c3;
        this.f4505s = new C0709H(c3);
        this.f4506t = AbstractC0714M.c(new M1.t(F.f4462b));
        this.f4507u = AbstractC0714M.c(new M1.t(B.f4455a));
        this.f4508v = AbstractC0714M.c(new M1.t(bool));
        this.f4509w = netCacheUseCase.a(null);
        this.f4511y = -1;
        d(false, new y(this, reachableUseCase, cfgUseCase, ipInfoUseCase, versionNameUseCase, latestVersionUseCase, getAllSettingsUseCase, gVar, getGenresUseCase, getAvatarsUseCase, null));
        d(false, new z(this, null));
        d(false, new A(this, null));
    }

    public final void g(H2.u uVar) {
        if (uVar.f3065a != -1 && uVar.f3066b != -1) {
            d(false, new J(this, uVar, null));
            d(false, new K(this, uVar, null));
        }
    }

    public final void h(int i9) {
        if (this.f4511y == i9) {
            return;
        }
        this.f4511y = i9;
        y0 y0Var = this.f4512z;
        if (y0Var != null) {
            y0Var.d(null);
        }
        this.f4512z = Y7.B.r(Y.g(this), Y7.K.f8774b, new Q(this, i9, null), 2);
    }
}
