package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.C0704C;
import b8.InterfaceC0706E;
import b8.InterfaceC0725e;
import c8.AbstractC0793c;

/* loaded from: classes.dex */
public final class v3 extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f13329a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0725e f13330b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c4 f13331c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(InterfaceC0725e interfaceC0725e, c4 c4Var, E7.d dVar) {
        super(2, dVar);
        this.f13330b = interfaceC0725e;
        this.f13331c = c4Var;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new v3(this.f13330b, this.f13331c, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((v3) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f13329a;
        A7.n nVar = A7.n.f558a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return nVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        InterfaceC0725e interfaceC0725e = this.f13330b;
        InterfaceC0706E interfaceC0706E = this.f13331c.f11983k;
        s3 s3Var = new s3(null);
        u3 u3Var = new u3(this.f13331c);
        this.f13329a = 1;
        Object a5 = AbstractC0793c.a(this, new C0704C(s3Var, (E7.d) null), u3Var, new InterfaceC0725e[]{interfaceC0725e, interfaceC0706E});
        if (a5 != aVar) {
            a5 = nVar;
        }
        if (a5 == aVar) {
            return aVar;
        }
        return nVar;
    }
}
