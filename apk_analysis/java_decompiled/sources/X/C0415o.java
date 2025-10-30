package X;

import a.AbstractC0485a;

/* renamed from: X.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0415o extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f8099r;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.o, E7.d, G7.j] */
    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        ?? jVar = new G7.j(2, dVar);
        jVar.f8099r = obj;
        return jVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0415o) create((Z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        return Boolean.valueOf(!(((Z) this.f8099r) instanceof P));
    }
}
