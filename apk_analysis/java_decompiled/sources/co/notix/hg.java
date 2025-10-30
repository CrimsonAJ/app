package co.notix;

import co.notix.banner.NotixBannerListener;
import co.notix.banner.NotixBannerView;

/* loaded from: classes.dex */
public final class hg extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NotixBannerView f12382a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg(NotixBannerView notixBannerView) {
        super(0);
        this.f12382a = notixBannerView;
    }

    @Override // O7.a
    public final Object invoke() {
        NotixBannerListener listener = this.f12382a.getListener();
        if (listener != null) {
            listener.onAdLoaded();
        }
        return A7.n.f558a;
    }
}
