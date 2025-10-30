package co.notix;

import co.notix.banner.NotixBannerView;

/* loaded from: classes.dex */
public final class kg extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NotixBannerView f12609a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg(NotixBannerView notixBannerView) {
        super(0);
        this.f12609a = notixBannerView;
    }

    @Override // O7.a
    public final Object invoke() {
        this.f12609a.loadOnce();
        return A7.n.f558a;
    }
}
