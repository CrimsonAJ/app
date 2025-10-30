package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import co.notix.callback.NotixCallback;
import co.notix.callback.NotixCallbackHandler;

/* loaded from: classes.dex */
public final class ng extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ og f12820a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NotixCallback f12821b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng(E7.d dVar, og ogVar, NotixCallback notixCallback) {
        super(2, dVar);
        this.f12820a = ogVar;
        this.f12821b = notixCallback;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new ng(dVar, this.f12820a, this.f12821b);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ng) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        og ogVar = this.f12820a;
        NotixCallbackHandler notixCallbackHandler = ogVar.f12888c;
        if (notixCallbackHandler != null) {
            notixCallbackHandler.handle(((d9) ogVar.f12886a).a(), this.f12821b);
        }
        return A7.n.f558a;
    }
}
