package C2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.data.model.response.ApiResponse;
import com.anilab.data.model.response.ReplyCommentsResponse;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import u2.C2067a;
import v2.C2102b;

/* renamed from: C2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0076w extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f1416r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ E f1417s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f1418t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0076w(E e8, String str, E7.d dVar) {
        super(2, dVar);
        this.f1417s = e8;
        this.f1418t = str;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0076w(this.f1417s, this.f1418t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0076w) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f1416r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            E e8 = this.f1417s;
            B2.b bVar = e8.f1268a;
            String n7 = AbstractC0953k1.n(O4.h.t(e8.f1269b), g6.o.f17761a.N0());
            this.f1416r = 1;
            obj = bVar.p(n7, this.f1418t, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        ReplyCommentsResponse replyCommentsResponse = (ReplyCommentsResponse) ((ApiResponse) obj).f14005c;
        if (replyCommentsResponse != null) {
            return new C2102b(replyCommentsResponse);
        }
        throw new C2067a((String) null, 2);
    }
}
