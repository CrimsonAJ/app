package C2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.content.SharedPreferences;
import com.anilab.data.model.response.ListPlayerResponse;
import java.io.IOException;
import v2.C2101a;
import v2.C2102b;
import y2.C2203a;

/* loaded from: classes.dex */
public final class M extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ O f1281r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(O o9, E7.d dVar) {
        super(2, dVar);
        this.f1281r = o9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new M(this.f1281r, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((M) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object h7;
        AbstractC0485a.A(obj);
        C2203a c2203a = this.f1281r.f1287c;
        String g02 = g6.o.f17761a.g0();
        kotlin.jvm.internal.d a5 = kotlin.jvm.internal.p.a(ListPlayerResponse.class);
        boolean equals = a5.equals(kotlin.jvm.internal.p.a(Float.TYPE));
        SharedPreferences sharedPreferences = c2203a.f24771a;
        if (equals) {
            obj2 = (ListPlayerResponse) new Float(sharedPreferences.getFloat(g02, 0.0f));
        } else if (a5.equals(kotlin.jvm.internal.p.a(Integer.TYPE))) {
            obj2 = (ListPlayerResponse) new Integer(sharedPreferences.getInt(g02, 0));
        } else if (a5.equals(kotlin.jvm.internal.p.a(Long.TYPE))) {
            obj2 = (ListPlayerResponse) new Long(sharedPreferences.getLong(g02, 0L));
        } else if (a5.equals(kotlin.jvm.internal.p.a(String.class))) {
            Object string = sharedPreferences.getString(g02, "");
            if (string != null) {
                obj2 = (ListPlayerResponse) string;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.anilab.data.model.response.ListPlayerResponse");
            }
        } else if (a5.equals(kotlin.jvm.internal.p.a(Boolean.TYPE))) {
            obj2 = (ListPlayerResponse) Boolean.valueOf(sharedPreferences.getBoolean(g02, false));
        } else {
            String string2 = sharedPreferences.getString(g02, "");
            if (string2 != null && string2.length() != 0) {
                try {
                    h7 = c2203a.f24772b.a(ListPlayerResponse.class).a(string2);
                } catch (Throwable th) {
                    h7 = AbstractC0485a.h(th);
                }
                if (!(h7 instanceof A7.i)) {
                    obj2 = h7;
                }
            }
            obj2 = null;
        }
        ListPlayerResponse listPlayerResponse = (ListPlayerResponse) obj2;
        if (listPlayerResponse != null) {
            return new C2102b(listPlayerResponse);
        }
        return new C2101a(new IOException());
    }
}
