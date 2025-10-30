package C2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.data.model.request.SyncMalRequest;
import com.anilab.data.model.response.ApiResponse;
import com.anilab.data.model.response.SyncMalResponse;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.ArrayList;
import u2.C2067a;
import v2.C2101a;
import v2.C2102b;

/* loaded from: classes.dex */
public final class e0 extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f1344r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g0 f1345s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1346t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f1347u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var, ArrayList arrayList, boolean z9, E7.d dVar) {
        super(2, dVar);
        this.f1345s = g0Var;
        this.f1346t = arrayList;
        this.f1347u = z9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new e0(this.f1345s, this.f1346t, this.f1347u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f1344r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            g0 g0Var = this.f1345s;
            B2.b bVar = g0Var.f1359a;
            String n7 = AbstractC0953k1.n(O4.h.t(g0Var.f1360b), g6.o.f17761a.S0());
            SyncMalRequest syncMalRequest = new SyncMalRequest(this.f1346t, this.f1347u ? 1 : 0);
            this.f1344r = 1;
            obj = bVar.j(n7, syncMalRequest, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        SyncMalResponse syncMalResponse = (SyncMalResponse) ((ApiResponse) obj).f14005c;
        if (syncMalResponse != null && syncMalResponse.f14349a) {
            return new C2102b(A7.n.f558a);
        }
        return new C2101a(new C2067a((String) null, 3));
    }
}
