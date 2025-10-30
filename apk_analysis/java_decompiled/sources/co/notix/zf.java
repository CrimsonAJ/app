package co.notix;

import b8.C0718Q;
import b8.InterfaceC0707F;
import b8.InterfaceC0726f;
import co.notix.banner.NotixBannerView;

/* loaded from: classes.dex */
public final class zf implements InterfaceC0726f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NotixBannerView f13677a;

    public zf(NotixBannerView notixBannerView) {
        this.f13677a = notixBannerView;
    }

    @Override // b8.InterfaceC0726f
    public final Object emit(Object obj, E7.d dVar) {
        InterfaceC0707F interfaceC0707F;
        ((Number) obj).longValue();
        interfaceC0707F = this.f13677a.timeVisibleF;
        Long l9 = new Long(0L);
        C0718Q c0718q = (C0718Q) interfaceC0707F;
        c0718q.getClass();
        c0718q.j(null, l9);
        this.f13677a.loadOnce();
        return A7.n.f558a;
    }
}
