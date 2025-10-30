package X;

import a.AbstractC0485a;

/* renamed from: X.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0416p extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f8100r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Z f8101s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0416p(Z z9, E7.d dVar) {
        super(2, dVar);
        this.f8101s = z9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C0416p c0416p = new C0416p(this.f8101s, dVar);
        c0416p.f8100r = obj;
        return c0416p;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0416p) create((Z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        boolean z9;
        AbstractC0485a.A(obj);
        Z z10 = (Z) this.f8100r;
        if ((z10 instanceof C0403c) && z10.f8049a <= this.f8101s.f8049a) {
            z9 = true;
        } else {
            z9 = false;
        }
        return Boolean.valueOf(z9);
    }
}
