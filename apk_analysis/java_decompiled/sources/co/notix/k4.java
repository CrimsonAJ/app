package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class k4 extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f12592a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l4 f12593b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12594c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(l4 l4Var, String str, E7.d dVar) {
        super(2, dVar);
        this.f12593b = l4Var;
        this.f12594c = str;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new k4(this.f12593b, this.f12594c, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k4) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f12592a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            m5 m5Var = this.f12593b.f12676c;
            String str = this.f12594c;
            this.f12592a = 1;
            if (m5Var.a(str, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
