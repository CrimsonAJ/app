package t1;

import A7.n;
import O7.p;
import Y7.B;
import Y7.InterfaceC0484z;
import Y7.K;
import a.AbstractC0485a;
import d8.o;
import u0.z;

/* renamed from: t1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1996e extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f23066r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C2004m f23067s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1.i f23068t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1996e(C1.i iVar, E7.d dVar, C2004m c2004m) {
        super(2, dVar);
        this.f23067s = c2004m;
        this.f23068t = iVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1996e(this.f23068t, dVar, this.f23067s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1996e) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object C8;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f23066r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        this.f23066r = 1;
        C2004m c2004m = this.f23067s;
        C1.i iVar = this.f23068t;
        if (z.i(iVar.f1193c)) {
            C8 = B.f(new C1999h(iVar, null, c2004m), this);
        } else {
            f8.e eVar = K.f8773a;
            C8 = B.C(o.f17003a.f9070d, new C2000i(iVar, null, c2004m), this);
        }
        if (C8 == aVar) {
            return aVar;
        }
        return C8;
    }
}
