package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class rl extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f13130a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13131b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f13132c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ul f13133d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(String str, Throwable th, ul ulVar, E7.d dVar) {
        super(2, dVar);
        this.f13131b = str;
        this.f13132c = th;
        this.f13133d = ulVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new rl(this.f13131b, this.f13132c, this.f13133d, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((rl) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        String str;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f13130a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            ql qlVar = ql.ERROR;
            String str2 = this.f13131b;
            Throwable th = this.f13132c;
            if (th != null) {
                str = O4.h.K(th);
            } else {
                str = null;
            }
            ll llVar = new ll(qlVar, str2, str, System.currentTimeMillis(), true);
            yl ylVar = this.f13133d.f13313b;
            this.f13130a = 1;
            if (((lm) ylVar).b(llVar, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
