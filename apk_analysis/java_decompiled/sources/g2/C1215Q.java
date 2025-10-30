package g2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* renamed from: g2.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1215Q extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f17584r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a0 f17585s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f17586t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f17587u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1215Q(boolean z9, a0 a0Var, long j, long j4, E7.d dVar) {
        super(2, dVar);
        this.f17584r = z9;
        this.f17585s = a0Var;
        this.f17586t = j;
        this.f17587u = j4;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1215Q(this.f17584r, this.f17585s, this.f17586t, this.f17587u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C1215Q c1215q = (C1215Q) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c1215q.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        if (!this.f17584r) {
            a0 a0Var = this.f17585s;
            a0Var.f17635l.a(a0Var.j(this.f17586t, this.f17587u));
        }
        return A7.n.f558a;
    }
}
