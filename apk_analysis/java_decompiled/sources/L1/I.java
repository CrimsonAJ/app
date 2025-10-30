package L1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class I extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f4464r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ S f4465s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(S s9, E7.d dVar) {
        super(2, dVar);
        this.f4465s = s9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new I(this.f4465s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((I) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f4464r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                ((A7.j) obj).getClass();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            S s9 = this.f4465s;
            if (s9.f4493f.f5769a.b()) {
                this.f4464r = 1;
                if (s9.f4494g.a(this) == aVar) {
                    return aVar;
                }
            }
        }
        return A7.n.f558a;
    }
}
