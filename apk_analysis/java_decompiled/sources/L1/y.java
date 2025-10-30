package L1;

import L2.C0237a;
import L2.C0242f;
import L2.C0244h;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class y extends G7.j implements O7.p {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ A1.g f4563A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ M2.b f4564B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ C0244h f4565C;

    /* renamed from: r, reason: collision with root package name */
    public int f4566r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f4567s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ S f4568t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ L2.F f4569u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C0237a f4570v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ L2.r f4571w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ L2.H f4572x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ L2.t f4573y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C0242f f4574z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(S s9, L2.F f9, C0237a c0237a, L2.r rVar, L2.H h7, L2.t tVar, C0242f c0242f, A1.g gVar, M2.b bVar, C0244h c0244h, E7.d dVar) {
        super(2, dVar);
        this.f4568t = s9;
        this.f4569u = f9;
        this.f4570v = c0237a;
        this.f4571w = rVar;
        this.f4572x = h7;
        this.f4573y = tVar;
        this.f4574z = c0242f;
        this.f4563A = gVar;
        this.f4564B = bVar;
        this.f4565C = c0244h;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        y yVar = new y(this.f4568t, this.f4569u, this.f4570v, this.f4571w, this.f4572x, this.f4573y, this.f4574z, this.f4563A, this.f4564B, this.f4565C, dVar);
        yVar.f4567s = obj;
        return yVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f4566r;
        S s9 = this.f4568t;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            InterfaceC0484z interfaceC0484z = (InterfaceC0484z) this.f4567s;
            s9.d(false, new C0235q(this.f4570v, null));
            s9.d(false, new r(this.f4571w, null));
            s9.d(false, new C0236s(this.f4572x, null));
            this.f4566r = 1;
            if (this.f4569u.a(interfaceC0484z, 2000L, this) == aVar) {
                return aVar;
            }
        }
        s9.d(false, new t(this.f4573y, s9, null));
        A1.g gVar = this.f4563A;
        s9.d(false, new u(this.f4574z, gVar, s9, null));
        s9.d(false, new v(this.f4564B, null));
        s9.d(false, new w(this.f4565C, null));
        s9.d(false, new x(gVar, s9, null));
        return A7.n.f558a;
    }
}
