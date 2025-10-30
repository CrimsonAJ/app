package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import co.notix.periodicworker.PeriodicWorker;

/* loaded from: classes.dex */
public final class hi extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f12388a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PeriodicWorker f12389b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi(PeriodicWorker periodicWorker, E7.d dVar) {
        super(2, dVar);
        this.f12389b = periodicWorker;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new hi(this.f12389b, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((hi) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f12388a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            lm lmVar = this.f12389b.f12953b;
            this.f12388a = 1;
            if (lmVar.f(this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
