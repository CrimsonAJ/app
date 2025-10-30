package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class nf extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f12818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O7.l f12819b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf(O7.l lVar, E7.d dVar) {
        super(2, dVar);
        this.f12819b = lVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new nf(this.f12819b, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((nf) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f12818a;
        if (i9 == 0) {
            AbstractC0485a.A(obj);
            O7.l lVar = this.f12819b;
            this.f12818a = 1;
            if (lVar.invoke(this) == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0485a.A(obj);
        }
        return A7.n.f558a;
    }
}
