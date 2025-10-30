package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.C0718Q;
import b8.InterfaceC0707F;

/* loaded from: classes.dex */
public final class pe extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f12949a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ te f12950b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f12951c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe(te teVar, boolean z9, E7.d dVar) {
        super(2, dVar);
        this.f12950b = teVar;
        this.f12951c = z9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new pe(this.f12950b, this.f12951c, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((pe) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f12949a;
        A7.n nVar = A7.n.f558a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return nVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        InterfaceC0707F interfaceC0707F = this.f12950b.f13222e;
        Boolean valueOf = Boolean.valueOf(this.f12951c);
        this.f12949a = 1;
        ((C0718Q) interfaceC0707F).emit(valueOf, this);
        if (nVar == aVar) {
            return aVar;
        }
        return nVar;
    }
}
