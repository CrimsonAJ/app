package d2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class C extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f16715r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ K f16716s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(K k5, E7.d dVar) {
        super(2, dVar);
        this.f16716s = k5;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C(this.f16716s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object a5;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f16715r;
        K k5 = this.f16716s;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                a5 = ((A7.j) obj).f550a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            L2.j jVar = k5.f16754n;
            this.f16715r = 1;
            a5 = jVar.a(this);
            if (a5 == aVar) {
                return aVar;
            }
        }
        if (!(a5 instanceof A7.i)) {
            k5.f16766z = (H2.h) a5;
        }
        return A7.n.f558a;
    }
}
