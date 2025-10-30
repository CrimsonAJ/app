package t1;

import A7.n;
import O7.p;
import Y7.B;
import Y7.F;
import Y7.InterfaceC0484z;
import Y7.K;
import a.AbstractC0485a;
import d8.o;

/* renamed from: t1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1999h extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f23075r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f23076s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1.i f23077t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2004m f23078u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1999h(C1.i iVar, E7.d dVar, C2004m c2004m) {
        super(2, dVar);
        this.f23077t = iVar;
        this.f23078u = c2004m;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C1999h c1999h = new C1999h(this.f23077t, dVar, this.f23078u);
        c1999h.f23076s = obj;
        return c1999h;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1999h) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f23075r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        InterfaceC0484z interfaceC0484z = (InterfaceC0484z) this.f23076s;
        f8.e eVar = K.f8773a;
        Z7.d dVar = o.f17003a.f9070d;
        C2004m c2004m = this.f23078u;
        C1.i iVar = this.f23077t;
        F c3 = B.c(interfaceC0484z, dVar, new C1998g(iVar, null, c2004m), 2);
        H1.f.c(iVar.f1193c.f1926b).a();
        this.f23075r = 1;
        Object o9 = c3.o(this);
        if (o9 == aVar) {
            return aVar;
        }
        return o9;
    }
}
