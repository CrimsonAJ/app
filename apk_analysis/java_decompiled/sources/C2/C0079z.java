package C2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.data.model.response.ApiResponse;
import com.anilab.data.model.response.MovieVoteResponse;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import u2.C2067a;
import v2.C2102b;

/* renamed from: C2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0079z extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f1425r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ E f1426s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f1427t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0079z(E e8, long j, E7.d dVar) {
        super(2, dVar);
        this.f1426s = e8;
        this.f1427t = j;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0079z(this.f1426s, this.f1427t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0079z) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f1425r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            E e8 = this.f1426s;
            B2.b bVar = e8.f1268a;
            String n7 = AbstractC0953k1.n(O4.h.t(e8.f1269b), g6.o.f17761a.Z0());
            this.f1425r = 1;
            obj = bVar.t(n7, this.f1427t, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        MovieVoteResponse movieVoteResponse = (MovieVoteResponse) ((ApiResponse) obj).f14005c;
        if (movieVoteResponse != null) {
            return new C2102b(movieVoteResponse.f14265b);
        }
        throw new C2067a((String) null, 3);
    }
}
