package C2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.data.model.response.ApiResponse;
import com.anilab.data.model.response.MalIdsResponse;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.List;
import u2.C2067a;
import v2.C2101a;
import v2.C2102b;

/* loaded from: classes.dex */
public final class W extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f1305r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g0 f1306s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(g0 g0Var, E7.d dVar) {
        super(2, dVar);
        this.f1306s = g0Var;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new W(this.f1306s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((W) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        List list;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f1305r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            g0 g0Var = this.f1306s;
            B2.b bVar = g0Var.f1359a;
            String n7 = AbstractC0953k1.n(O4.h.t(g0Var.f1360b), g6.o.f17761a.j());
            this.f1305r = 1;
            obj = bVar.b(n7, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        MalIdsResponse malIdsResponse = (MalIdsResponse) ((ApiResponse) obj).f14005c;
        if (malIdsResponse != null) {
            list = malIdsResponse.f14210a;
        } else {
            list = null;
        }
        if (list != null) {
            return new C2102b(list);
        }
        return new C2101a(new C2067a((String) null, 3));
    }
}
