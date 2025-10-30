package e1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import androidx.work.CoroutineWorker;

/* loaded from: classes.dex */
public final class f extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public l f17042r;

    /* renamed from: s, reason: collision with root package name */
    public int f17043s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l f17044t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f17045u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l lVar, CoroutineWorker coroutineWorker, E7.d dVar) {
        super(2, dVar);
        this.f17044t = lVar;
        this.f17045u = coroutineWorker;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new f(this.f17044t, this.f17045u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        l lVar;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f17043s;
        if (i9 != 0) {
            if (i9 == 1) {
                lVar = this.f17042r;
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            l lVar2 = this.f17044t;
            this.f17042r = lVar2;
            this.f17043s = 1;
            Object foregroundInfo = this.f17045u.getForegroundInfo(this);
            if (foregroundInfo == aVar) {
                return aVar;
            }
            lVar = lVar2;
            obj = foregroundInfo;
        }
        lVar.f17057a.j(obj);
        return A7.n.f558a;
    }
}
