package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import co.notix.periodicworker.PeriodicWorker;

/* loaded from: classes.dex */
public final class ii extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f12473a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PeriodicWorker f12474b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii(PeriodicWorker periodicWorker, E7.d dVar) {
        super(2, dVar);
        this.f12474b = periodicWorker;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new ii(this.f12474b, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ii) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f12473a;
        A7.n nVar = A7.n.f558a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            l4 l4Var = this.f12474b.f12956e;
            this.f12473a = 1;
            m5 m5Var = l4Var.f12676c;
            int i10 = l4.f12673i;
            Object a5 = m5Var.a(this);
            if (a5 != aVar) {
                a5 = nVar;
            }
            if (a5 == aVar) {
                return aVar;
            }
        }
        return nVar;
    }
}
