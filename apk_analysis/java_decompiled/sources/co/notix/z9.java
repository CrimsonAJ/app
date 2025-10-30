package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class z9 extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f13643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ia f13644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13645c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p8 f13646d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9(ia iaVar, String str, p8 p8Var, E7.d dVar) {
        super(2, dVar);
        this.f13644b = iaVar;
        this.f13645c = str;
        this.f13646d = p8Var;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new z9(this.f13644b, this.f13645c, this.f13646d, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((z9) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f13643a;
        if (i9 == 0) {
            AbstractC0485a.A(obj);
            ia iaVar = this.f13644b;
            String str = this.f13645c;
            v2 v2Var = v2.f13328a;
            p8 p8Var = this.f13646d;
            this.f13643a = 1;
            if (ia.a(iaVar, str, v2Var, p8Var, this) == aVar) {
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
