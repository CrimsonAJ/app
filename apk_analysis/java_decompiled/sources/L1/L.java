package L1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class L extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f4471r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ S f4472s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f4473t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(S s9, String str, E7.d dVar) {
        super(2, dVar);
        this.f4472s = s9;
        this.f4473t = str;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new L(this.f4472s, this.f4473t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f4471r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                ((A7.j) obj).getClass();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            S s9 = this.f4472s;
            this.f4471r = 1;
            if (s9.f4495h.a(this.f4473t, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
