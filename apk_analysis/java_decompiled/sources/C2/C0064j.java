package C2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.data.model.request.DeleteCommentRequest;
import com.anilab.data.model.response.ApiResponse;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import v2.C2102b;

/* renamed from: C2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0064j extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f1370r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ E f1371s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f1372t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0064j(E e8, String str, E7.d dVar) {
        super(2, dVar);
        this.f1371s = e8;
        this.f1372t = str;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0064j(this.f1371s, this.f1372t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0064j) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f1370r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            E e8 = this.f1371s;
            B2.b bVar = e8.f1268a;
            String n7 = AbstractC0953k1.n(O4.h.t(e8.f1269b), g6.o.f17761a.y());
            DeleteCommentRequest deleteCommentRequest = new DeleteCommentRequest(this.f1372t);
            this.f1370r = 1;
            obj = bVar.n(n7, deleteCommentRequest, this);
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
