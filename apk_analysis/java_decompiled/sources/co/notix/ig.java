package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import co.notix.banner.NotixBannerListener;
import co.notix.banner.NotixBannerView;

/* loaded from: classes.dex */
public final class ig extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NotixBannerView f12466a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig(NotixBannerView notixBannerView, E7.d dVar) {
        super(2, dVar);
        this.f12466a = notixBannerView;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new ig(this.f12466a, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ig) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        NotixBannerListener listener = this.f12466a.getListener();
        if (listener != null) {
            listener.onAdFailedToLoad("Ad couldn't be loaded");
        }
        return A7.n.f558a;
    }
}
