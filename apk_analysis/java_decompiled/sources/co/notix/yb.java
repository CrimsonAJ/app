package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class yb extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f13594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zb f13595b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(zb zbVar, E7.d dVar) {
        super(2, dVar);
        this.f13595b = zbVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new yb(this.f13595b, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((yb) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f13594a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            zb zbVar = this.f13595b;
            this.f13594a = 1;
            if (zbVar.a(this) == aVar) {
                return aVar;
            }
        }
        this.f13595b.f();
        this.f13595b.a();
        this.f13595b.d();
        this.f13595b.a(5000L);
        return A7.n.f558a;
    }
}
