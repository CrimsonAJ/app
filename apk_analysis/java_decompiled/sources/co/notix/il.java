package co.notix;

import Y7.B;
import Y7.InterfaceC0484z;
import Y7.K;
import a.AbstractC0485a;
import android.os.Build;
import co.notix.callback.NotixCallback;
import co.notix.callback.NotixCallbackStatus;
import co.notix.domain.RequestVars;

/* loaded from: classes.dex */
public final class il extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f12475a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12476b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kl f12477c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f12478d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il(kl klVar, String str, E7.d dVar) {
        super(2, dVar);
        this.f12477c = klVar;
        this.f12478d = str;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        il ilVar = new il(this.f12477c, this.f12478d, dVar);
        ilVar.f12476b = obj;
        return ilVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((il) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object h7;
        Object C8;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f12475a;
        try {
            if (i9 != 0) {
                if (i9 == 1) {
                    AbstractC0485a.A(obj);
                    C8 = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC0485a.A(obj);
                kl klVar = this.f12477c;
                String str = this.f12478d;
                klVar.f12621c.getClass();
                String a5 = xq.a();
                if (a5 != null) {
                    String c3 = klVar.f12621c.c();
                    String packageName = ((d9) klVar.f12622d).a().getPackageName();
                    long b9 = klVar.f12621c.b();
                    klVar.f12621c.getClass();
                    d9 d9Var = wq.f13475b;
                    RequestVars requestVars = new RequestVars(xq.a(d9Var.a(), "NOTIX_SUBSCRIBE_REQUEST_VAR_1"), xq.a(d9Var.a(), "NOTIX_SUBSCRIBE_REQUEST_VAR_2"), xq.a(d9Var.a(), "NOTIX_SUBSCRIBE_REQUEST_VAR_3"), xq.a(d9Var.a(), "NOTIX_SUBSCRIBE_REQUEST_VAR_4"), xq.a(d9Var.a(), "NOTIX_SUBSCRIBE_REQUEST_VAR_5"));
                    int i10 = Build.VERSION.SDK_INT;
                    cr crVar = klVar.f12620b;
                    kotlin.jvm.internal.h.d(packageName, "packageName");
                    this.f12475a = 1;
                    crVar.getClass();
                    C8 = B.C(K.f8774b, new zq(crVar, c3, packageName, a5, str, b9, "0.1.86", i10, requestVars, null), this);
                    if (C8 == aVar) {
                        return aVar;
                    }
                } else {
                    throw new IllegalStateException("subscribe - invalid data. appId = null");
                }
            }
            h7 = (String) C8;
        } catch (Throwable th) {
            h7 = AbstractC0485a.h(th);
        }
        kl klVar2 = this.f12477c;
        if (!(h7 instanceof A7.i)) {
            kd kdVar = md.f12779a;
            kdVar.getClass();
            kdVar.f12607b.a("subscribe success");
            klVar2.f12624f.a(new NotixCallback.Subscription(NotixCallbackStatus.SUCCESS, (String) h7));
        }
        kl klVar3 = this.f12477c;
        Throwable a9 = A7.j.a(h7);
        if (a9 != null) {
            yn.a(md.f12779a, "subscribe failure", a9);
            klVar3.f12624f.a(new NotixCallback.Subscription(NotixCallbackStatus.FAILURE, a9.getMessage()));
        }
        kl klVar4 = this.f12477c;
        String appId = this.f12478d;
        if (A7.j.a(h7) == null) {
            klVar4.f12621c.getClass();
            kotlin.jvm.internal.h.e(appId, "appId");
            xq.a(wq.f13475b.a(), "NOTIX_DEVICE_TOKEN", appId);
        }
        return A7.n.f558a;
    }
}
