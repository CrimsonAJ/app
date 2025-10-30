package co.notix;

import X.C0419t;
import Y7.B;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.AbstractC0714M;
import co.notix.lsi.LockScreenInterstitialActivity;

/* loaded from: classes.dex */
public final class oc extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f12878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LockScreenInterstitialActivity f12879b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc(LockScreenInterstitialActivity lockScreenInterstitialActivity, E7.d dVar) {
        super(2, dVar);
        this.f12879b = lockScreenInterstitialActivity;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new oc(this.f12879b, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((oc) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f12878a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            C0419t c0419t = new C0419t(this.f12879b.f12742C, 1);
            this.f12878a = 1;
            if (AbstractC0714M.m(c0419t, this) == aVar) {
                return aVar;
            }
        }
        LockScreenInterstitialActivity lockScreenInterstitialActivity = this.f12879b;
        ia iaVar = lockScreenInterstitialActivity.f12743w;
        String data = ((i) lockScreenInterstitialActivity.c()).f12423h;
        iaVar.getClass();
        kotlin.jvm.internal.h.e(data, "data");
        B.r(iaVar.f12446c, null, new ea(iaVar, data, null), 3);
        LockScreenInterstitialActivity lockScreenInterstitialActivity2 = this.f12879b;
        B.r(lockScreenInterstitialActivity2.f12744x.f12782a, null, new nc(lockScreenInterstitialActivity2, null), 3);
        return A7.n.f558a;
    }
}
