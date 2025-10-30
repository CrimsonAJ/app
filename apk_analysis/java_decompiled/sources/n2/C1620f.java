package n2;

import A7.i;
import A7.n;
import G7.j;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* renamed from: n2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1620f extends j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f21059r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f21060s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1620f(g gVar, E7.d dVar) {
        super(2, dVar);
        this.f21060s = gVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1620f(this.f21060s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1620f) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object a5;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f21059r;
        g gVar = this.f21060s;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                a5 = ((A7.j) obj).f550a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            this.f21059r = 1;
            a5 = gVar.f21061f.a(this);
            if (a5 == aVar) {
                return aVar;
            }
        }
        if (!(a5 instanceof i)) {
            gVar.f21062g = (H2.h) a5;
        }
        return n.f558a;
    }
}
