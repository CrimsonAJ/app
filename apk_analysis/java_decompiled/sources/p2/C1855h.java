package p2;

import L2.t;
import M1.r;
import P2.k;
import b8.AbstractC0714M;
import b8.C0709H;
import b8.C0718Q;
import com.anilab.domain.model.LatestVersion;

/* renamed from: p2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1855h extends r {

    /* renamed from: f, reason: collision with root package name */
    public final P2.e f22157f;

    /* renamed from: g, reason: collision with root package name */
    public final k f22158g;

    /* renamed from: h, reason: collision with root package name */
    public final P2.d f22159h;

    /* renamed from: i, reason: collision with root package name */
    public final t f22160i;
    public final C0718Q j;

    /* renamed from: k, reason: collision with root package name */
    public final C0709H f22161k;

    /* renamed from: l, reason: collision with root package name */
    public LatestVersion f22162l;

    public C1855h(P2.e checkLoginUserCase, k getUserInfoUseCase, P2.d checkFirstRunUseCase, t latestVersionUseCase) {
        kotlin.jvm.internal.h.e(checkLoginUserCase, "checkLoginUserCase");
        kotlin.jvm.internal.h.e(getUserInfoUseCase, "getUserInfoUseCase");
        kotlin.jvm.internal.h.e(checkFirstRunUseCase, "checkFirstRunUseCase");
        kotlin.jvm.internal.h.e(latestVersionUseCase, "latestVersionUseCase");
        this.f22157f = checkLoginUserCase;
        this.f22158g = getUserInfoUseCase;
        this.f22159h = checkFirstRunUseCase;
        this.f22160i = latestVersionUseCase;
        C0718Q c3 = AbstractC0714M.c(new M1.t(EnumC1853f.f22147a));
        this.j = c3;
        this.f22161k = new C0709H(c3);
        this.f22162l = new LatestVersion();
        d(false, new C1854g(this, false, null));
    }
}
