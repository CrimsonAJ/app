package X;

import a.AbstractC0485a;

/* renamed from: X.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0417q extends G7.j implements O7.q {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8102r = 1;

    /* renamed from: s, reason: collision with root package name */
    public int f8103s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f8104t;

    public /* synthetic */ C0417q(int i9, E7.d dVar) {
        super(i9, dVar);
    }

    @Override // O7.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f8102r) {
            case 0:
                return new C0417q((O) this.f8104t, (E7.d) obj3).invokeSuspend(A7.n.f558a);
            default:
                ((Boolean) obj2).getClass();
                C0417q c0417q = new C0417q(3, (E7.d) obj3);
                c0417q.f8104t = (Z.c) obj;
                return c0417q.invokeSuspend(A7.n.f558a);
        }
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f8102r) {
            case 0:
                F7.a aVar = F7.a.f2587a;
                int i9 = this.f8103s;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC0485a.A(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC0485a.A(obj);
                    this.f8103s = 1;
                    if (O.c((O) this.f8104t, this) == aVar) {
                        return aVar;
                    }
                }
                return A7.n.f558a;
            default:
                F7.a aVar2 = F7.a.f2587a;
                int i10 = this.f8103s;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AbstractC0485a.A(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0485a.A(obj);
                Z.c cVar = (Z.c) this.f8104t;
                this.f8103s = 1;
                cVar.getClass();
                Object a5 = Z.c.a(cVar, this);
                if (a5 == aVar2) {
                    return aVar2;
                }
                return a5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0417q(O o9, E7.d dVar) {
        super(3, dVar);
        this.f8104t = o9;
    }
}
