package co.notix;

import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class fg extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f12256a;

    public fg(E7.d dVar) {
        super(2, dVar);
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        fg fgVar = new fg(dVar);
        fgVar.f12256a = ((Boolean) obj).booleanValue();
        return fgVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((fg) create(bool, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        return Boolean.valueOf(!this.f12256a);
    }
}
