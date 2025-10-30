package E2;

import A7.n;
import C2.U;
import G7.j;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class a extends j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f1927r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f1928s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ U f1929t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(U u9, E7.d dVar) {
        super(2, dVar);
        this.f1929t = u9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        a aVar = new a(this.f1929t, dVar);
        aVar.f1928s = obj;
        return aVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f1927r;
        try {
            if (i9 != 0) {
                if (i9 == 1) {
                    AbstractC0485a.A(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC0485a.A(obj);
                InterfaceC0484z interfaceC0484z = (InterfaceC0484z) this.f1928s;
                U u9 = this.f1929t;
                this.f1927r = 1;
                if (u9.invoke(interfaceC0484z, this) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception unused) {
        }
        return n.f558a;
    }
}
