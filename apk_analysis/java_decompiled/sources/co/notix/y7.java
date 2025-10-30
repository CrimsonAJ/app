package co.notix;

import Y7.B;
import Y7.InterfaceC0484z;
import Y7.K;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class y7 extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f13579a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c8 f13580b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13581c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ no f13582d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(c8 c8Var, String str, no noVar, E7.d dVar) {
        super(2, dVar);
        this.f13580b = c8Var;
        this.f13581c = str;
        this.f13582d = noVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new y7(this.f13580b, this.f13581c, this.f13582d, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((y7) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f13579a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        c8 c8Var = this.f13580b;
        String str = this.f13581c;
        no noVar = this.f13582d;
        this.f13579a = 1;
        fb fbVar = c8.f11988f;
        c8Var.getClass();
        Object C8 = B.C(K.f8774b, new w7(c8Var, str, noVar, null), this);
        if (C8 == aVar) {
            return aVar;
        }
        return C8;
    }
}
