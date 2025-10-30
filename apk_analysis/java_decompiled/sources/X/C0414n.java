package X;

import a.AbstractC0485a;
import b8.InterfaceC0726f;

/* renamed from: X.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0414n extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f8097r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ O f8098s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0414n(O o9, E7.d dVar) {
        super(2, dVar);
        this.f8098s = o9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0414n(this.f8098s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0414n) create((InterfaceC0726f) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f8097r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            this.f8097r = 1;
            if (O.e(this.f8098s, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
