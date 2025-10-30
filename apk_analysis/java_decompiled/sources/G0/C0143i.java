package G0;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* renamed from: G0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0143i extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f2767r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0145k f2768s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0143i(C0145k c0145k, E7.d dVar) {
        super(2, dVar);
        this.f2768s = c0145k;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0143i(this.f2768s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0143i) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f2767r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            C0145k c0145k = this.f2768s;
            this.f2767r = 1;
            if (c0145k.f2773c.e(this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
