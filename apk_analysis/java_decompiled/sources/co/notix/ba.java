package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class ba extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f11919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ia f11920b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11921c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p8 f11922d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(ia iaVar, String str, p8 p8Var, E7.d dVar) {
        super(2, dVar);
        this.f11920b = iaVar;
        this.f11921c = str;
        this.f11922d = p8Var;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new ba(this.f11920b, this.f11921c, this.f11922d, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ba) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f11919a;
        if (i9 == 0) {
            AbstractC0485a.A(obj);
            ia iaVar = this.f11920b;
            String str = this.f11921c;
            z2 z2Var = z2.f13625a;
            p8 p8Var = this.f11922d;
            this.f11919a = 1;
            if (ia.a(iaVar, str, z2Var, p8Var, this) == aVar) {
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
