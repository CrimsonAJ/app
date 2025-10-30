package i7;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.C0733m;

/* loaded from: classes.dex */
public final class F extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f18749r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ K f18750s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(K k5, E7.d dVar) {
        super(2, dVar);
        this.f18750s = k5;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new F(this.f18750s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((F) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f18749r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            K k5 = this.f18750s;
            C0733m c0733m = k5.f18765d;
            N1.k kVar = new N1.k(6, k5);
            this.f18749r = 1;
            if (c0733m.collect(kVar, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
