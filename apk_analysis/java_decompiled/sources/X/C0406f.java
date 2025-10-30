package X;

import a.AbstractC0485a;

/* renamed from: X.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0406f extends G7.j implements O7.l {

    /* renamed from: r, reason: collision with root package name */
    public int f8063r;

    @Override // G7.a
    public final E7.d create(E7.d dVar) {
        return new G7.j(1, dVar);
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        C0406f c0406f = (C0406f) create((E7.d) obj);
        A7.n nVar = A7.n.f558a;
        c0406f.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        int i9 = this.f8063r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return A7.n.f558a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        this.f8063r = 1;
        throw null;
    }
}
