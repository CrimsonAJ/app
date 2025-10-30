package C2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.data.model.request.VoteRequest;
import com.anilab.data.model.response.ApiResponse;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import v2.C2102b;

/* loaded from: classes.dex */
public final class D extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f1264r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ E f1265s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f1266t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1267u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(E e8, long j, int i9, E7.d dVar) {
        super(2, dVar);
        this.f1265s = e8;
        this.f1266t = j;
        this.f1267u = i9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new D(this.f1265s, this.f1266t, this.f1267u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((D) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f1264r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            E e8 = this.f1265s;
            B2.b bVar = e8.f1268a;
            String n7 = AbstractC0953k1.n(O4.h.t(e8.f1269b), g6.o.f17761a.R0());
            VoteRequest voteRequest = new VoteRequest(this.f1266t, this.f1267u);
            this.f1264r = 1;
            obj = bVar.A(n7, voteRequest, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        Object obj2 = ((ApiResponse) obj).f14005c;
        if (obj2 == null) {
            obj2 = A7.n.f558a;
        }
        return new C2102b(obj2);
    }
}
