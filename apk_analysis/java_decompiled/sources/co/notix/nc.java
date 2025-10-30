package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import co.notix.lsi.LockScreenInterstitialActivity;
import co.notix.lsi.LockScreenInterstitialCallback;

/* loaded from: classes.dex */
public final class nc extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LockScreenInterstitialActivity f12815a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc(LockScreenInterstitialActivity lockScreenInterstitialActivity, E7.d dVar) {
        super(2, dVar);
        this.f12815a = lockScreenInterstitialActivity;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new nc(this.f12815a, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((nc) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        LockScreenInterstitialCallback lockScreenInterstitialCallback = this.f12815a.f12746z.f13217a;
        if (lockScreenInterstitialCallback != null) {
            lockScreenInterstitialCallback.onAdImpression();
        }
        return A7.n.f558a;
    }
}
