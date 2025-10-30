package q2;

import Y7.B;
import Y7.InterfaceC0484z;
import Y7.K;
import a.AbstractC0485a;

/* renamed from: q2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1894w extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f22275r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1895x f22276s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1894w(C1895x c1895x, E7.d dVar) {
        super(2, dVar);
        this.f22276s = c1895x;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1894w(this.f22276s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1894w) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f22275r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            f8.d dVar = K.f8774b;
            C1893v c1893v = new C1893v(this.f22276s, null);
            this.f22275r = 1;
            if (B.C(dVar, c1893v, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
