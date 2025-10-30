package co.notix;

import co.notix.lsi.LockScreenInterstitialActivity;
import co.notix.lsi.LockScreenInterstitialCallback;

/* loaded from: classes.dex */
public final class rc extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LockScreenInterstitialActivity f13100a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc(LockScreenInterstitialActivity lockScreenInterstitialActivity) {
        super(0);
        this.f13100a = lockScreenInterstitialActivity;
    }

    @Override // O7.a
    public final Object invoke() {
        LockScreenInterstitialCallback lockScreenInterstitialCallback = this.f13100a.f12746z.f13217a;
        if (lockScreenInterstitialCallback != null) {
            lockScreenInterstitialCallback.onAdClicked();
        }
        return A7.n.f558a;
    }
}
