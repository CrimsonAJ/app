package X;

import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class C extends G7.j implements O7.l {

    /* renamed from: r, reason: collision with root package name */
    public Throwable f7956r;

    /* renamed from: s, reason: collision with root package name */
    public int f7957s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ O f7958t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(O o9, E7.d dVar) {
        super(1, dVar);
        this.f7958t = o9;
    }

    @Override // G7.a
    public final E7.d create(E7.d dVar) {
        return new C(this.f7958t, dVar);
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        return ((C) create((E7.d) obj)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        Z z9;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f7957s;
        O o9 = this.f7958t;
        try {
        } catch (Throwable th2) {
            Y h7 = o9.h();
            this.f7956r = th2;
            this.f7957s = 2;
            Integer a5 = h7.a();
            if (a5 != aVar) {
                th = th2;
                obj = a5;
            }
        }
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    th = this.f7956r;
                    AbstractC0485a.A(obj);
                    z9 = new S(th, ((Number) obj).intValue());
                    return new A7.h(z9, Boolean.TRUE);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0485a.A(obj);
        } else {
            AbstractC0485a.A(obj);
            this.f7957s = 1;
            obj = O.g(o9, true, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        z9 = (Z) obj;
        return new A7.h(z9, Boolean.TRUE);
    }
}
