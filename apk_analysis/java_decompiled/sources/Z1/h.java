package Z1;

import M1.r;
import M1.t;
import P2.m;
import P2.o;
import b8.AbstractC0714M;
import b8.C0709H;
import b8.C0718Q;

/* loaded from: classes.dex */
public final class h extends r {

    /* renamed from: f, reason: collision with root package name */
    public final m f8944f;

    /* renamed from: g, reason: collision with root package name */
    public final o f8945g;

    /* renamed from: h, reason: collision with root package name */
    public final P2.h f8946h;

    /* renamed from: i, reason: collision with root package name */
    public final C0718Q f8947i;
    public final C0709H j;

    public h(m loginUseCase, o loginWithGoogleUseCase, P2.h getClientIdUseCase) {
        kotlin.jvm.internal.h.e(loginUseCase, "loginUseCase");
        kotlin.jvm.internal.h.e(loginWithGoogleUseCase, "loginWithGoogleUseCase");
        kotlin.jvm.internal.h.e(getClientIdUseCase, "getClientIdUseCase");
        this.f8944f = loginUseCase;
        this.f8945g = loginWithGoogleUseCase;
        this.f8946h = getClientIdUseCase;
        C0718Q c3 = AbstractC0714M.c(new t(Boolean.FALSE));
        this.f8947i = c3;
        this.j = new C0709H(c3);
    }
}
