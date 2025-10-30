package L1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class x extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f4560r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ A1.g f4561s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ S f4562t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(A1.g gVar, S s9, E7.d dVar) {
        super(2, dVar);
        this.f4561s = gVar;
        this.f4562t = s9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new x(this.f4561s, this.f4562t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object x5;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f4560r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                x5 = ((A7.j) obj).f550a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            this.f4560r = 1;
            x5 = this.f4561s.x(this);
            if (x5 == aVar) {
                return aVar;
            }
        }
        if (!(x5 instanceof A7.i)) {
            this.f4562t.f4510x = (H2.o) x5;
        }
        return A7.n.f558a;
    }
}
