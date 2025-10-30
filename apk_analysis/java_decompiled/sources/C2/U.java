package C2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.data.model.request.ContinueWatchRequest;
import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class U extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f1296r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g0 f1297s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f1298t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f1299u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f1300v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(int i9, long j, long j4, g0 g0Var, E7.d dVar) {
        super(2, dVar);
        this.f1297s = g0Var;
        this.f1298t = j;
        this.f1299u = j4;
        this.f1300v = i9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        long j = this.f1299u;
        return new U(this.f1300v, this.f1298t, j, this.f1297s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((U) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f1296r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            g0 g0Var = this.f1297s;
            B2.b bVar = g0Var.f1359a;
            String n7 = AbstractC0953k1.n(O4.h.t(g0Var.f1360b), g6.o.f17761a.w());
            ContinueWatchRequest continueWatchRequest = new ContinueWatchRequest(this.f1298t, this.f1299u, this.f1300v);
            this.f1296r = 1;
            if (bVar.f(n7, continueWatchRequest, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
