package C2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.data.model.response.ApiResponse;
import com.anilab.data.model.response.ScheduleResponse;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.List;
import v2.C2102b;

/* renamed from: C2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0077x extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f1419r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ E f1420s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f1421t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f1422u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0077x(E e8, long j, long j4, E7.d dVar) {
        super(2, dVar);
        this.f1420s = e8;
        this.f1421t = j;
        this.f1422u = j4;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0077x(this.f1420s, this.f1421t, this.f1422u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0077x) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        List list;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f1419r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            E e8 = this.f1420s;
            B2.b bVar = e8.f1268a;
            String n7 = AbstractC0953k1.n(O4.h.t(e8.f1269b), g6.o.f17761a.O0());
            this.f1419r = 1;
            obj = bVar.K(n7, this.f1421t, this.f1422u, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        ScheduleResponse scheduleResponse = (ScheduleResponse) ((ApiResponse) obj).f14005c;
        if (scheduleResponse != null) {
            list = scheduleResponse.f14317a;
        } else {
            list = null;
        }
        if (list == null) {
            list = B7.t.f1135a;
        }
        return new C2102b(list);
    }
}
