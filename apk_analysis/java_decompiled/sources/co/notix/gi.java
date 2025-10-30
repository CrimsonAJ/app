package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import co.notix.periodicworker.PeriodicWorker;

/* loaded from: classes.dex */
public final class gi extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f12330a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PeriodicWorker f12331b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi(PeriodicWorker periodicWorker, E7.d dVar) {
        super(2, dVar);
        this.f12331b = periodicWorker;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new gi(this.f12331b, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((gi) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f12330a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            jp jpVar = this.f12331b.f12952a;
            this.f12330a = 1;
            if (jpVar.a(this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
