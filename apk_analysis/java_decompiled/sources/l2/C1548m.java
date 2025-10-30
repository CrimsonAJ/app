package l2;

import O7.p;
import Y7.B;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* renamed from: l2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1548m extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f20212r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1549n f20213s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f20214t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f20215u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1548m(int i9, E7.d dVar, String str, C1549n c1549n) {
        super(2, dVar);
        this.f20213s = c1549n;
        this.f20214t = str;
        this.f20215u = i9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1548m(this.f20215u, dVar, this.f20214t, this.f20213s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1548m) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f20212r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            this.f20212r = 1;
            if (B.g(400L, this) == aVar) {
                return aVar;
            }
        }
        String str = this.f20214t;
        C1549n c1549n = this.f20213s;
        c1549n.d(true, new C1547l(this.f20215u, null, str, c1549n));
        return A7.n.f558a;
    }
}
