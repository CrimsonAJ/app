package e1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import androidx.work.CoroutineWorker;

/* loaded from: classes.dex */
public final class g extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f17046r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f17047s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CoroutineWorker coroutineWorker, E7.d dVar) {
        super(2, dVar);
        this.f17047s = coroutineWorker;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new g(this.f17047s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f17046r;
        CoroutineWorker coroutineWorker = this.f17047s;
        try {
            if (i9 != 0) {
                if (i9 == 1) {
                    AbstractC0485a.A(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC0485a.A(obj);
                this.f17046r = 1;
                obj = coroutineWorker.doWork(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            coroutineWorker.getFuture$work_runtime_ktx_release().j((p) obj);
        } catch (Throwable th) {
            coroutineWorker.getFuture$work_runtime_ktx_release().k(th);
        }
        return A7.n.f558a;
    }
}
