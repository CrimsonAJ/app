package j2;

import M1.r;
import M1.t;
import P2.o;
import P2.u;
import b8.AbstractC0714M;
import b8.C0709H;
import b8.C0718Q;

/* loaded from: classes.dex */
public final class j extends r {

    /* renamed from: f, reason: collision with root package name */
    public final u f19222f;

    /* renamed from: g, reason: collision with root package name */
    public final o f19223g;

    /* renamed from: h, reason: collision with root package name */
    public final P2.h f19224h;

    /* renamed from: i, reason: collision with root package name */
    public final C0718Q f19225i;
    public final C0709H j;

    public j(u registerUseCase, o loginWithGoogleUseCase, P2.h getClientIdUseCase) {
        kotlin.jvm.internal.h.e(registerUseCase, "registerUseCase");
        kotlin.jvm.internal.h.e(loginWithGoogleUseCase, "loginWithGoogleUseCase");
        kotlin.jvm.internal.h.e(getClientIdUseCase, "getClientIdUseCase");
        this.f19222f = registerUseCase;
        this.f19223g = loginWithGoogleUseCase;
        this.f19224h = getClientIdUseCase;
        C0718Q c3 = AbstractC0714M.c(new t(g.f19207a));
        this.f19225i = c3;
        this.j = new C0709H(c3);
    }
}
