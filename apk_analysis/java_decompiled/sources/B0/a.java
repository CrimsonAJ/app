package B0;

import A7.n;
import C0.g;
import G7.j;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class a extends j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f588r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f589s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, E7.d dVar2) {
        super(2, dVar2);
        this.f589s = dVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new a(this.f589s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f588r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        g gVar = this.f589s.f597a;
        this.f588r = 1;
        Object c3 = gVar.c(this);
        if (c3 == aVar) {
            return aVar;
        }
        return c3;
    }
}
