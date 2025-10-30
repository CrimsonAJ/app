package C2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.content.SharedPreferences;
import com.anilab.data.model.request.LogoutRequest;
import com.anilab.data.model.response.LoginResponse;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.io.IOException;
import v2.C2101a;
import v2.C2102b;
import y2.C2203a;

/* loaded from: classes.dex */
public final class a0 extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f1322r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g0 f1323s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(g0 g0Var, E7.d dVar) {
        super(2, dVar);
        this.f1323s = g0Var;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new a0(this.f1323s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object h7;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f1322r;
        g0 g0Var = this.f1323s;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            C2203a c2203a = g0Var.f1360b;
            String o02 = g6.o.f17761a.o0();
            kotlin.jvm.internal.d a5 = kotlin.jvm.internal.p.a(LoginResponse.class);
            boolean equals = a5.equals(kotlin.jvm.internal.p.a(Float.TYPE));
            SharedPreferences sharedPreferences = c2203a.f24771a;
            if (equals) {
                obj2 = (LoginResponse) new Float(sharedPreferences.getFloat(o02, 0.0f));
            } else if (a5.equals(kotlin.jvm.internal.p.a(Integer.TYPE))) {
                obj2 = (LoginResponse) new Integer(sharedPreferences.getInt(o02, 0));
            } else if (a5.equals(kotlin.jvm.internal.p.a(Long.TYPE))) {
                obj2 = (LoginResponse) new Long(sharedPreferences.getLong(o02, 0L));
            } else if (a5.equals(kotlin.jvm.internal.p.a(String.class))) {
                Object string = sharedPreferences.getString(o02, "");
                if (string != null) {
                    obj2 = (LoginResponse) string;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.anilab.data.model.response.LoginResponse");
                }
            } else if (a5.equals(kotlin.jvm.internal.p.a(Boolean.TYPE))) {
                obj2 = (LoginResponse) Boolean.valueOf(sharedPreferences.getBoolean(o02, false));
            } else {
                String string2 = sharedPreferences.getString(o02, "");
                if (string2 != null && string2.length() != 0) {
                    try {
                        h7 = c2203a.f24772b.a(LoginResponse.class).a(string2);
                    } catch (Throwable th) {
                        h7 = AbstractC0485a.h(th);
                    }
                    if (!(h7 instanceof A7.i)) {
                        obj2 = h7;
                    }
                }
                obj2 = null;
            }
            LoginResponse loginResponse = (LoginResponse) obj2;
            if (loginResponse == null) {
                return new C2101a(new IOException());
            }
            String str = loginResponse.f14201b.f14359b.f14362a;
            B2.b bVar = g0Var.f1359a;
            String n7 = AbstractC0953k1.n(O4.h.t(g0Var.f1360b), g6.o.f17761a.y0());
            LogoutRequest logoutRequest = new LogoutRequest(str);
            this.f1322r = 1;
            obj = bVar.F(n7, logoutRequest, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C2102b c2102b = new C2102b(obj);
        C2203a c2203a2 = g0Var.f1360b;
        g6.o oVar = g6.o.f17761a;
        String key = oVar.o0();
        kotlin.jvm.internal.h.e(key, "key");
        SharedPreferences sharedPreferences2 = c2203a2.f24771a;
        SharedPreferences.Editor edit = sharedPreferences2.edit();
        edit.remove(key);
        edit.apply();
        String key2 = oVar.r0();
        kotlin.jvm.internal.h.e(key2, "key");
        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
        edit2.remove(key2);
        edit2.apply();
        return c2102b;
    }
}
