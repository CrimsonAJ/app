package S1;

import B7.t;
import M1.r;
import P2.y;
import b8.AbstractC0714M;
import b8.C0709H;
import b8.C0718Q;

/* loaded from: classes.dex */
public final class l extends r {

    /* renamed from: f, reason: collision with root package name */
    public final P2.i f6727f;

    /* renamed from: g, reason: collision with root package name */
    public final y f6728g;

    /* renamed from: h, reason: collision with root package name */
    public final L2.l f6729h;

    /* renamed from: i, reason: collision with root package name */
    public final C0718Q f6730i;
    public final C0709H j;

    /* renamed from: k, reason: collision with root package name */
    public final C0718Q f6731k;

    /* renamed from: l, reason: collision with root package name */
    public final C0709H f6732l;

    /* renamed from: m, reason: collision with root package name */
    public Long f6733m;

    public l(P2.i getLocalUserUseCase, y updateAvatarUseCase, L2.l getLocalAvatarsUseCase) {
        Long l9;
        kotlin.jvm.internal.h.e(getLocalUserUseCase, "getLocalUserUseCase");
        kotlin.jvm.internal.h.e(updateAvatarUseCase, "updateAvatarUseCase");
        kotlin.jvm.internal.h.e(getLocalAvatarsUseCase, "getLocalAvatarsUseCase");
        this.f6727f = getLocalUserUseCase;
        this.f6728g = updateAvatarUseCase;
        this.f6729h = getLocalAvatarsUseCase;
        C0718Q c3 = AbstractC0714M.c(Boolean.FALSE);
        this.f6730i = c3;
        this.j = new C0709H(c3);
        C0718Q c9 = AbstractC0714M.c(t.f1135a);
        this.f6731k = c9;
        this.f6732l = new C0709H(c9);
        H2.y a5 = getLocalUserUseCase.a();
        if (a5 != null) {
            l9 = a5.f3092f;
        } else {
            l9 = null;
        }
        this.f6733m = l9;
        d(false, new j(this, null));
    }
}
