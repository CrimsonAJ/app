package C2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.data.model.response.ApiResponse;
import com.anilab.data.model.response.PageDataResponse;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.List;
import v2.C2102b;

/* renamed from: C2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0072s extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f1400r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ E f1401s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f1402t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1403u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0072s(int i9, E e8, E7.d dVar, String str) {
        super(2, dVar);
        this.f1401s = e8;
        this.f1402t = str;
        this.f1403u = i9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0072s(this.f1403u, this.f1401s, dVar, this.f1402t);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0072s) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        List list;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f1400r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            E e8 = this.f1401s;
            B2.b bVar = e8.f1268a;
            String n7 = AbstractC0953k1.n(O4.h.t(e8.f1269b), g6.o.f17761a.u0());
            this.f1400r = 1;
            obj = bVar.L(n7, this.f1402t, this.f1403u, 20, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        PageDataResponse pageDataResponse = (PageDataResponse) ((ApiResponse) obj).f14005c;
        if (pageDataResponse != null) {
            list = pageDataResponse.f14273e;
        } else {
            list = null;
        }
        if (list == null) {
            list = B7.t.f1135a;
        }
        return new C2102b(list);
    }
}
