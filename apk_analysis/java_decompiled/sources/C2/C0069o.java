package C2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.data.model.response.ApiResponse;
import com.anilab.data.model.response.CommentListResponse;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import u2.C2067a;
import v2.C2102b;

/* renamed from: C2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0069o extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f1387r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ E f1388s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f1389t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1390u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f1391v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0069o(E e8, long j, int i9, int i10, E7.d dVar) {
        super(2, dVar);
        this.f1388s = e8;
        this.f1389t = j;
        this.f1390u = i9;
        this.f1391v = i10;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0069o(this.f1388s, this.f1389t, this.f1390u, this.f1391v, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0069o) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f1387r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            E e8 = this.f1388s;
            B2.b bVar = e8.f1268a;
            String n7 = AbstractC0953k1.n(O4.h.t(e8.f1269b), g6.o.f17761a.r());
            this.f1387r = 1;
            obj = bVar.M(n7, this.f1389t, this.f1390u, this.f1391v, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        CommentListResponse commentListResponse = (CommentListResponse) ((ApiResponse) obj).f14005c;
        if (commentListResponse != null) {
            return new C2102b(commentListResponse);
        }
        throw new C2067a((String) null, 2);
    }
}
