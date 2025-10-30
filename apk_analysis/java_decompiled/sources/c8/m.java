package c8;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.InterfaceC0725e;
import b8.InterfaceC0726f;

/* loaded from: classes.dex */
public final class m extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f11781r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f11782s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f11783t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0726f f11784u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, InterfaceC0726f interfaceC0726f, E7.d dVar) {
        super(2, dVar);
        this.f11783t = nVar;
        this.f11784u = interfaceC0726f;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        m mVar = new m(this.f11783t, this.f11784u, dVar);
        mVar.f11782s = obj;
        return mVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.o, java.lang.Object] */
    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f11781r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            InterfaceC0484z interfaceC0484z = (InterfaceC0484z) this.f11782s;
            ?? obj2 = new Object();
            n nVar = this.f11783t;
            InterfaceC0725e interfaceC0725e = nVar.f11767d;
            l lVar = new l(obj2, interfaceC0484z, nVar, this.f11784u);
            this.f11781r = 1;
            if (interfaceC0725e.collect(lVar, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
