package L1;

import L2.C0244h;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class w extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f4558r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0244h f4559s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(C0244h c0244h, E7.d dVar) {
        super(2, dVar);
        this.f4559s = c0244h;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new w(this.f4559s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f4558r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                ((A7.j) obj).getClass();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            this.f4558r = 1;
            if (this.f4559s.a(this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
