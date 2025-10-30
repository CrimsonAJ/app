package co.notix;

import Y7.B;
import Y7.InterfaceC0484z;
import Y7.K;
import a.AbstractC0485a;
import android.os.Build;
import co.notix.callback.NotixCallback;
import co.notix.callback.NotixCallbackStatus;

/* loaded from: classes.dex */
public final class jl extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f12565a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12566b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kl f12567c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl(kl klVar, E7.d dVar) {
        super(2, dVar);
        this.f12567c = klVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        jl jlVar = new jl(this.f12567c, dVar);
        jlVar.f12566b = obj;
        return jlVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((jl) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object h7;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f12565a;
        try {
            if (i9 != 0) {
                if (i9 == 1) {
                    AbstractC0485a.A(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC0485a.A(obj);
                kl klVar = this.f12567c;
                klVar.f12621c.getClass();
                String a5 = xq.a();
                if (a5 != null) {
                    String c3 = klVar.f12621c.c();
                    String packageName = ((d9) klVar.f12622d).a().getPackageName();
                    int i10 = Build.VERSION.SDK_INT;
                    cr crVar = klVar.f12620b;
                    kotlin.jvm.internal.h.d(packageName, "packageName");
                    this.f12565a = 1;
                    crVar.getClass();
                    obj = B.C(K.f8774b, new br(crVar, c3, packageName, a5, "0.1.86", i10, null), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    throw new IllegalStateException("unsubscribe - invalid data. appId = null");
                }
            }
            h7 = (String) obj;
        } catch (Throwable th) {
            h7 = AbstractC0485a.h(th);
        }
        kl klVar2 = this.f12567c;
        if (!(h7 instanceof A7.i)) {
            klVar2.f12624f.a(new NotixCallback.Unsubscription(NotixCallbackStatus.SUCCESS, (String) h7));
        }
        kl klVar3 = this.f12567c;
        Throwable a9 = A7.j.a(h7);
        if (a9 != null) {
            klVar3.f12624f.a(new NotixCallback.Unsubscription(NotixCallbackStatus.FAILURE, a9.getMessage()));
        }
        kl klVar4 = this.f12567c;
        Throwable a10 = A7.j.a(h7);
        if (a10 == null) {
            kd kdVar = md.f12779a;
            kdVar.getClass();
            kdVar.f12607b.a("unsubscribe success");
            klVar4.f12621c.getClass();
            xq.d();
        } else {
            yn.a(md.f12779a, "unsubscribe failure", a10);
        }
        return A7.n.f558a;
    }
}
