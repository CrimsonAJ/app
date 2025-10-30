package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class aa extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f11832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ia f11833b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11834c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p8 f11835d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(ia iaVar, String str, p8 p8Var, E7.d dVar) {
        super(2, dVar);
        this.f11833b = iaVar;
        this.f11834c = str;
        this.f11835d = p8Var;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new aa(this.f11833b, this.f11834c, this.f11835d, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((aa) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f11832a;
        if (i9 == 0) {
            AbstractC0485a.A(obj);
            ia iaVar = this.f11833b;
            String str = this.f11834c;
            y2 y2Var = y2.f13572a;
            p8 p8Var = this.f11835d;
            this.f11832a = 1;
            if (ia.a(iaVar, str, y2Var, p8Var, this) == aVar) {
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
