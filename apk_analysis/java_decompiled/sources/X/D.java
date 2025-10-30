package X;

import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class D extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public Throwable f7959r;

    /* renamed from: s, reason: collision with root package name */
    public int f7960s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ boolean f7961t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ O f7962u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7963v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(O o9, int i9, E7.d dVar) {
        super(2, dVar);
        this.f7962u = o9;
        this.f7963v = i9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        D d9 = new D(this.f7962u, this.f7963v, dVar);
        d9.f7961t = ((Boolean) obj).booleanValue();
        return d9;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((D) create(bool, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        int i9;
        boolean z9;
        Z z10;
        boolean z11;
        F7.a aVar = F7.a.f2587a;
        boolean z12 = this.f7960s;
        O o9 = this.f7962u;
        try {
        } catch (Throwable th2) {
            if (z12 != 0) {
                Y h7 = o9.h();
                this.f7959r = th2;
                this.f7961t = z12;
                this.f7960s = 2;
                Integer a5 = h7.a();
                if (a5 != aVar) {
                    z9 = z12;
                    th = th2;
                    obj = a5;
                }
            } else {
                boolean z13 = z12;
                th = th2;
                i9 = this.f7963v;
                z9 = z13;
            }
        }
        if (z12 != 0) {
            if (z12 != 1) {
                if (z12 == 2) {
                    z9 = this.f7961t;
                    th = this.f7959r;
                    AbstractC0485a.A(obj);
                    i9 = ((Number) obj).intValue();
                    S s9 = new S(th, i9);
                    z11 = z9;
                    z10 = s9;
                    return new A7.h(z10, Boolean.valueOf(z11));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z14 = this.f7961t;
            AbstractC0485a.A(obj);
            z12 = z14;
        } else {
            AbstractC0485a.A(obj);
            boolean z15 = this.f7961t;
            this.f7961t = z15;
            this.f7960s = 1;
            obj = O.g(o9, z15, this);
            z12 = z15;
            if (obj == aVar) {
                return aVar;
            }
        }
        z10 = (Z) obj;
        z11 = z12;
        return new A7.h(z10, Boolean.valueOf(z11));
    }
}
