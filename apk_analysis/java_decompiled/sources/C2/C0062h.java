package C2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.data.model.request.ReplyCommentRequest;
import com.anilab.data.model.response.ApiResponse;
import com.anilab.data.model.response.CommentResponse;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import u2.C2067a;
import v2.C2102b;

/* renamed from: C2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0062h extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f1363r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ E f1364s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f1365t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f1366u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0062h(E e8, String str, String str2, E7.d dVar) {
        super(2, dVar);
        this.f1364s = e8;
        this.f1365t = str;
        this.f1366u = str2;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0062h(this.f1364s, this.f1365t, this.f1366u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0062h) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f1363r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            E e8 = this.f1364s;
            B2.b bVar = e8.f1268a;
            String n7 = AbstractC0953k1.n(O4.h.t(e8.f1269b), g6.o.f17761a.c());
            ReplyCommentRequest replyCommentRequest = new ReplyCommentRequest(this.f1365t, this.f1366u);
            this.f1363r = 1;
            obj = bVar.c(n7, replyCommentRequest, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        CommentResponse commentResponse = (CommentResponse) ((ApiResponse) obj).f14005c;
        if (commentResponse != null) {
            return new C2102b(commentResponse);
        }
        throw new C2067a((String) null, 2);
    }
}
