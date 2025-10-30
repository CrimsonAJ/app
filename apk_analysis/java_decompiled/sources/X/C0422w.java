package X;

import a.AbstractC0485a;

/* renamed from: X.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0422w extends G7.j implements O7.l {

    /* renamed from: r, reason: collision with root package name */
    public int f8121r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ G f8122s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0422w(G g9, E7.d dVar) {
        super(1, dVar);
        this.f8122s = g9;
    }

    @Override // G7.a
    public final E7.d create(E7.d dVar) {
        return new C0422w(this.f8122s, dVar);
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        return ((C0422w) create((E7.d) obj)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f8121r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        this.f8121r = 1;
        Object invoke = this.f8122s.invoke(this);
        if (invoke == aVar) {
            return aVar;
        }
        return invoke;
    }
}
