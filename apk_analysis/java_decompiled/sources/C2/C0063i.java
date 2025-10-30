package C2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.content.SharedPreferences;
import com.anilab.data.model.request.CreateVoteRequest;
import com.anilab.data.model.response.ApiResponse;
import com.anilab.data.model.response.CommentConfigResponse;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import v2.C2102b;
import y2.C2203a;

/* renamed from: C2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0063i extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f1367r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ E f1368s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f1369t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0063i(E e8, String str, E7.d dVar) {
        super(2, dVar);
        this.f1368s = e8;
        this.f1369t = str;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0063i(this.f1368s, this.f1369t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0063i) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object h7;
        int i9;
        F7.a aVar = F7.a.f2587a;
        int i10 = this.f1367r;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            E e8 = this.f1368s;
            C2203a c2203a = e8.f1269b;
            String Q7 = g6.o.f17761a.Q();
            kotlin.jvm.internal.d a5 = kotlin.jvm.internal.p.a(CommentConfigResponse.class);
            boolean equals = a5.equals(kotlin.jvm.internal.p.a(Float.TYPE));
            SharedPreferences sharedPreferences = c2203a.f24771a;
            if (equals) {
                obj2 = (CommentConfigResponse) new Float(sharedPreferences.getFloat(Q7, 0.0f));
            } else if (a5.equals(kotlin.jvm.internal.p.a(Integer.TYPE))) {
                obj2 = (CommentConfigResponse) new Integer(sharedPreferences.getInt(Q7, 0));
            } else if (a5.equals(kotlin.jvm.internal.p.a(Long.TYPE))) {
                obj2 = (CommentConfigResponse) new Long(sharedPreferences.getLong(Q7, 0L));
            } else if (a5.equals(kotlin.jvm.internal.p.a(String.class))) {
                Object string = sharedPreferences.getString(Q7, "");
                if (string != null) {
                    obj2 = (CommentConfigResponse) string;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.anilab.data.model.response.CommentConfigResponse");
                }
            } else if (a5.equals(kotlin.jvm.internal.p.a(Boolean.TYPE))) {
                obj2 = (CommentConfigResponse) Boolean.valueOf(sharedPreferences.getBoolean(Q7, false));
            } else {
                String string2 = sharedPreferences.getString(Q7, "");
                if (string2 != null && string2.length() != 0) {
                    try {
                        h7 = c2203a.f24772b.a(CommentConfigResponse.class).a(string2);
                    } catch (Throwable th) {
                        h7 = AbstractC0485a.h(th);
                    }
                    if (!(h7 instanceof A7.i)) {
                        obj2 = h7;
                    }
                }
                obj2 = null;
            }
            CommentConfigResponse commentConfigResponse = (CommentConfigResponse) obj2;
            B2.b bVar = e8.f1268a;
            String n7 = AbstractC0953k1.n(O4.h.t(e8.f1269b), g6.o.f17761a.x());
            if (commentConfigResponse != null) {
                i9 = commentConfigResponse.f14021a.f14056a;
            } else {
                i9 = 1;
            }
            CreateVoteRequest createVoteRequest = new CreateVoteRequest(this.f1369t, i9);
            this.f1367r = 1;
            obj = bVar.o(n7, createVoteRequest, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        Object obj3 = ((ApiResponse) obj).f14005c;
        if (obj3 == null) {
            obj3 = A7.n.f558a;
        }
        return new C2102b(obj3);
    }
}
