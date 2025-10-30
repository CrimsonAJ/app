package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.AbstractC0714M;
import b8.InterfaceC0725e;

/* loaded from: classes.dex */
public final class z3 extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f13626a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0725e f13627b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c4 f13628c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(InterfaceC0725e interfaceC0725e, c4 c4Var, E7.d dVar) {
        super(2, dVar);
        this.f13627b = interfaceC0725e;
        this.f13628c = c4Var;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new z3(this.f13627b, this.f13628c, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((z3) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f13626a;
        if (i9 == 0) {
            AbstractC0485a.A(obj);
            InterfaceC0725e interfaceC0725e = this.f13627b;
            y3 y3Var = new y3(this.f13628c, null);
            this.f13626a = 1;
            if (AbstractC0714M.i(interfaceC0725e, y3Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0485a.A(obj);
        }
        return A7.n.f558a;
    }
}
