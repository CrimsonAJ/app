package g2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import java.util.Iterator;

/* renamed from: g2.X, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1221X extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a0 f17618r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f17619s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f17620t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1221X(long j, long j4, E7.d dVar, a0 a0Var) {
        super(2, dVar);
        this.f17618r = a0Var;
        this.f17619s = j;
        this.f17620t = j4;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1221X(this.f17619s, this.f17620t, dVar, this.f17618r);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C1221X c1221x = (C1221X) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c1221x.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        a0 a0Var = this.f17618r;
        Iterator it = a0Var.f17638o.f3471f.iterator();
        while (true) {
            boolean z9 = true;
            if (it.hasNext()) {
                I2.a aVar = (I2.a) it.next();
                long j = a0Var.f17639p.f3444a;
                long j4 = this.f17619s;
                long j9 = this.f17620t;
                if (j4 == j) {
                    aVar.f3452i = j9;
                }
                long j10 = aVar.f3444a;
                if (j10 == j) {
                    aVar.f3452i = j9;
                }
                if (j10 != j4) {
                    z9 = false;
                }
                aVar.j = z9;
            } else {
                a0Var.m(true, true);
                return A7.n.f558a;
            }
        }
    }
}
