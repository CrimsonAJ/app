package L1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class v extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f4556r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ M2.b f4557s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(M2.b bVar, E7.d dVar) {
        super(2, dVar);
        this.f4557s = bVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new v(this.f4557s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f4556r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                ((A7.j) obj).getClass();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            this.f4556r = 1;
            if (this.f4557s.a(this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
