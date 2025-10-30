package C2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.content.SharedPreferences;
import com.anilab.data.model.response.MovieConfigResponse;
import u2.C2067a;
import v2.C2101a;
import v2.C2102b;
import y2.C2203a;

/* loaded from: classes.dex */
public final class L extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ O f1280r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(O o9, E7.d dVar) {
        super(2, dVar);
        this.f1280r = o9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new L(this.f1280r, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object h7;
        AbstractC0485a.A(obj);
        C2203a c2203a = this.f1280r.f1287c;
        String c02 = g6.o.f17761a.c0();
        kotlin.jvm.internal.d a5 = kotlin.jvm.internal.p.a(MovieConfigResponse.class);
        boolean equals = a5.equals(kotlin.jvm.internal.p.a(Float.TYPE));
        SharedPreferences sharedPreferences = c2203a.f24771a;
        if (equals) {
            obj2 = (MovieConfigResponse) new Float(sharedPreferences.getFloat(c02, 0.0f));
        } else if (a5.equals(kotlin.jvm.internal.p.a(Integer.TYPE))) {
            obj2 = (MovieConfigResponse) new Integer(sharedPreferences.getInt(c02, 0));
        } else if (a5.equals(kotlin.jvm.internal.p.a(Long.TYPE))) {
            obj2 = (MovieConfigResponse) new Long(sharedPreferences.getLong(c02, 0L));
        } else if (a5.equals(kotlin.jvm.internal.p.a(String.class))) {
            Object string = sharedPreferences.getString(c02, "");
            if (string != null) {
                obj2 = (MovieConfigResponse) string;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.anilab.data.model.response.MovieConfigResponse");
            }
        } else if (a5.equals(kotlin.jvm.internal.p.a(Boolean.TYPE))) {
            obj2 = (MovieConfigResponse) Boolean.valueOf(sharedPreferences.getBoolean(c02, false));
        } else {
            String string2 = sharedPreferences.getString(c02, "");
            if (string2 != null && string2.length() != 0) {
                try {
                    h7 = c2203a.f24772b.a(MovieConfigResponse.class).a(string2);
                } catch (Throwable th) {
                    h7 = AbstractC0485a.h(th);
                }
                if (!(h7 instanceof A7.i)) {
                    obj2 = h7;
                }
            }
            obj2 = null;
        }
        MovieConfigResponse movieConfigResponse = (MovieConfigResponse) obj2;
        if (movieConfigResponse != null) {
            return new C2102b(movieConfigResponse);
        }
        return new C2101a(new C2067a((String) null, 3));
    }
}
