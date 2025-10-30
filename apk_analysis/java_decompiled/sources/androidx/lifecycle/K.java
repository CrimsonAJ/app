package androidx.lifecycle;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class K extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f9809r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f9810s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ O7.p f9811t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(O7.p pVar, E7.d dVar) {
        super(2, dVar);
        this.f9811t = pVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        K k5 = new K(this.f9811t, dVar);
        k5.f9810s = obj;
        return k5;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((K) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f9809r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            InterfaceC0484z interfaceC0484z = (InterfaceC0484z) this.f9810s;
            this.f9809r = 1;
            if (this.f9811t.invoke(interfaceC0484z, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
