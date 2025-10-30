package C2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.data.model.response.ApiResponse;
import com.anilab.data.model.response.PageDataResponse;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.ArrayList;
import java.util.List;
import v2.C2102b;

/* renamed from: C2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0066l extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f1376r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ E f1377s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f1378t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Integer f1379u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Integer f1380v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f1381w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1382x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0066l(E e8, int i9, Integer num, Integer num2, String str, ArrayList arrayList, E7.d dVar) {
        super(2, dVar);
        this.f1377s = e8;
        this.f1378t = i9;
        this.f1379u = num;
        this.f1380v = num2;
        this.f1381w = str;
        this.f1382x = arrayList;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        ArrayList arrayList = this.f1382x;
        return new C0066l(this.f1377s, this.f1378t, this.f1379u, this.f1380v, this.f1381w, arrayList, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0066l) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        List list;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f1376r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            E e8 = this.f1377s;
            B2.b bVar = e8.f1268a;
            String n7 = AbstractC0953k1.n(O4.h.t(e8.f1269b), g6.o.f17761a.H());
            this.f1376r = 1;
            obj = bVar.N(n7, this.f1378t, this.f1379u, this.f1380v, this.f1381w, this.f1382x, 20, this);
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
