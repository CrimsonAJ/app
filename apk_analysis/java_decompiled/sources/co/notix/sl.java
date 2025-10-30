package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class sl extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f13188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13189b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ul f13190c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl(String str, ul ulVar, E7.d dVar) {
        super(2, dVar);
        this.f13189b = str;
        this.f13190c = ulVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new sl(this.f13189b, this.f13190c, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((sl) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f13188a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            ll llVar = new ll(ql.IMPORTANT, this.f13189b, null, System.currentTimeMillis(), false);
            yl ylVar = this.f13190c.f13313b;
            this.f13188a = 1;
            if (((lm) ylVar).c(llVar, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
