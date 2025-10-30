package co.notix;

import Y7.B;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class p3 extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public O7.l f12921a;

    /* renamed from: b, reason: collision with root package name */
    public int f12922b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O7.l f12923c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c4 f12924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f12925e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(O7.l lVar, c4 c4Var, long j, E7.d dVar) {
        super(2, dVar);
        this.f12923c = lVar;
        this.f12924d = c4Var;
        this.f12925e = j;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new p3(this.f12923c, this.f12924d, this.f12925e, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((p3) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        O7.l lVar;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f12922b;
        if (i9 != 0) {
            if (i9 == 1) {
                lVar = this.f12921a;
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            O7.l lVar2 = this.f12923c;
            c4 c4Var = this.f12924d;
            long j = this.f12925e;
            this.f12921a = lVar2;
            this.f12922b = 1;
            c4Var.getClass();
            Object D8 = B.D(j, new o3(c4Var, null), this);
            if (D8 == aVar) {
                return aVar;
            }
            lVar = lVar2;
            obj = D8;
        }
        lVar.invoke(obj);
        return A7.n.f558a;
    }
}
