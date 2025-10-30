package C2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.content.SharedPreferences;
import com.anilab.data.model.response.ListGenreResponse;
import java.util.List;
import v2.C2102b;
import y2.C2203a;

/* renamed from: C2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0056b extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0057c f1324r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0056b(C0057c c0057c, E7.d dVar) {
        super(2, dVar);
        this.f1324r = c0057c;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0056b(this.f1324r, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0056b) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object h7;
        AbstractC0485a.A(obj);
        C2203a c2203a = this.f1324r.f1330b;
        String Y = g6.o.f17761a.Y();
        kotlin.jvm.internal.d a5 = kotlin.jvm.internal.p.a(ListGenreResponse.class);
        boolean equals = a5.equals(kotlin.jvm.internal.p.a(Float.TYPE));
        SharedPreferences sharedPreferences = c2203a.f24771a;
        List list = null;
        if (equals) {
            obj2 = (ListGenreResponse) new Float(sharedPreferences.getFloat(Y, 0.0f));
        } else if (a5.equals(kotlin.jvm.internal.p.a(Integer.TYPE))) {
            obj2 = (ListGenreResponse) new Integer(sharedPreferences.getInt(Y, 0));
        } else if (a5.equals(kotlin.jvm.internal.p.a(Long.TYPE))) {
            obj2 = (ListGenreResponse) new Long(sharedPreferences.getLong(Y, 0L));
        } else if (a5.equals(kotlin.jvm.internal.p.a(String.class))) {
            Object string = sharedPreferences.getString(Y, "");
            if (string != null) {
                obj2 = (ListGenreResponse) string;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.anilab.data.model.response.ListGenreResponse");
            }
        } else if (a5.equals(kotlin.jvm.internal.p.a(Boolean.TYPE))) {
            obj2 = (ListGenreResponse) Boolean.valueOf(sharedPreferences.getBoolean(Y, false));
        } else {
            String string2 = sharedPreferences.getString(Y, "");
            if (string2 != null && string2.length() != 0) {
                try {
                    h7 = c2203a.f24772b.a(ListGenreResponse.class).a(string2);
                } catch (Throwable th) {
                    h7 = AbstractC0485a.h(th);
                }
                if (!(h7 instanceof A7.i)) {
                    obj2 = h7;
                }
            }
            obj2 = null;
        }
        ListGenreResponse listGenreResponse = (ListGenreResponse) obj2;
        if (listGenreResponse != null) {
            list = listGenreResponse.f14189a;
        }
        if (list == null) {
            list = B7.t.f1135a;
        }
        return new C2102b(list);
    }
}
