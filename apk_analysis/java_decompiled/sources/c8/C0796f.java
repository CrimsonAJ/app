package c8;

import a.AbstractC0485a;

/* renamed from: c8.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0796f extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f11758r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f11759s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f11760t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0796f(h hVar, E7.d dVar) {
        super(2, dVar);
        this.f11760t = hVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C0796f c0796f = new C0796f(this.f11760t, dVar);
        c0796f.f11759s = obj;
        return c0796f;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0796f) create((a8.r) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f11758r;
        A7.n nVar = A7.n.f558a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return nVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        a8.r rVar = (a8.r) this.f11759s;
        this.f11758r = 1;
        h hVar = this.f11760t;
        hVar.getClass();
        Object c3 = hVar.c(new D(rVar), this);
        if (c3 != aVar) {
            c3 = nVar;
        }
        if (c3 == aVar) {
            return aVar;
        }
        return nVar;
    }
}
