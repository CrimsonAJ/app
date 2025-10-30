package c2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.AbstractC0714M;
import b8.C0709H;

/* renamed from: c2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0760f extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f11614r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0763i f11615s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0760f(C0763i c0763i, E7.d dVar) {
        super(2, dVar);
        this.f11615s = c0763i;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0760f(this.f11615s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0760f) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f11614r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            C0763i c0763i = this.f11615s;
            C0709H c0709h = new C0709H(((C0772r) c0763i.f11620D0.getValue()).f11652p);
            C0759e c0759e = new C0759e(c0763i, null);
            this.f11614r = 1;
            if (AbstractC0714M.i(c0709h, c0759e, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
