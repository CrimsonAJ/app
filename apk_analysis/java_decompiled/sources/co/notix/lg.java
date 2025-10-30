package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class lg extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O7.a f12708a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg(O7.a aVar, E7.d dVar) {
        super(2, dVar);
        this.f12708a = aVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new lg(this.f12708a, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((lg) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        this.f12708a.invoke();
        return A7.n.f558a;
    }
}
