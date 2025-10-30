package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.C0718Q;
import b8.InterfaceC0707F;

/* loaded from: classes.dex */
public final class x3 extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f13501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c4 f13502b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(c4 c4Var, E7.d dVar) {
        super(2, dVar);
        this.f13502b = c4Var;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new x3(this.f13502b, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((x3) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f13501a;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0485a.A(obj);
            throw new RuntimeException();
        }
        AbstractC0485a.A(obj);
        c4 c4Var = this.f13502b;
        InterfaceC0707F interfaceC0707F = c4Var.f11978e.f13223f;
        w3 w3Var = new w3(c4Var);
        this.f13501a = 1;
        ((C0718Q) interfaceC0707F).collect(w3Var, this);
        return aVar;
    }
}
