package co.notix;

import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class vq extends G7.j implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public int f13391a;

    public vq(E7.d dVar) {
        super(1, dVar);
    }

    @Override // G7.a
    public final E7.d create(E7.d dVar) {
        return new vq(dVar);
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        return new vq((E7.d) obj).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f13391a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        mq mqVar = wq.f13477d;
        this.f13391a = 1;
        Object b9 = mqVar.b(this);
        if (b9 == aVar) {
            return aVar;
        }
        return b9;
    }
}
