package C2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.data.model.request.MoviePinRequest;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import v2.C2102b;

/* loaded from: classes.dex */
public final class b0 extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f1325r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g0 f1326s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f1327t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f1328u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(g0 g0Var, long j, boolean z9, E7.d dVar) {
        super(2, dVar);
        this.f1326s = g0Var;
        this.f1327t = j;
        this.f1328u = z9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new b0(this.f1326s, this.f1327t, this.f1328u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f1325r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            g0 g0Var = this.f1326s;
            B2.b bVar = g0Var.f1359a;
            String n7 = AbstractC0953k1.n(O4.h.t(g0Var.f1360b), g6.o.f17761a.G0());
            MoviePinRequest moviePinRequest = new MoviePinRequest(this.f1327t, this.f1328u ? 1 : 0);
            this.f1325r = 1;
            if (bVar.H(n7, moviePinRequest, this) == aVar) {
                return aVar;
            }
        }
        return new C2102b(A7.n.f558a);
    }
}
