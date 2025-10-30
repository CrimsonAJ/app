package co.notix;

import a.AbstractC0485a;
import co.notix.lsi.LockScreenInterstitialActivity;

/* loaded from: classes.dex */
public final class lc extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LockScreenInterstitialActivity f12702a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc(LockScreenInterstitialActivity lockScreenInterstitialActivity, E7.d dVar) {
        super(2, dVar);
        this.f12702a = lockScreenInterstitialActivity;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new lc(this.f12702a, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((lc) create((A7.n) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        boolean z9;
        AbstractC0485a.A(obj);
        LockScreenInterstitialActivity lockScreenInterstitialActivity = this.f12702a;
        int i9 = LockScreenInterstitialActivity.f12739D;
        if (lockScreenInterstitialActivity.b().getVisibility() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        return Boolean.valueOf(z9);
    }
}
