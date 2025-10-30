package g2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* renamed from: g2.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1216S extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f17588r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f17589s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f17590t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a0 f17591u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1216S(long j, long j4, E7.d dVar, a0 a0Var) {
        super(2, dVar);
        this.f17589s = j;
        this.f17590t = j4;
        this.f17591u = a0Var;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1216S(this.f17589s, this.f17590t, dVar, this.f17591u);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1216S) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        long j;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f17588r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                ((A7.j) obj).getClass();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            long j4 = this.f17589s;
            long j9 = this.f17590t;
            int i10 = 100;
            if (j4 < j9) {
                i10 = (int) ((100 * j4) / j9);
            }
            int i11 = i10;
            if (j4 >= j9) {
                j = j9;
            } else {
                j = j4;
            }
            a0 a0Var = this.f17591u;
            long j10 = a0Var.f17639p.f3444a;
            this.f17588r = 1;
            if (a0Var.j.a(j10, j, i11, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
