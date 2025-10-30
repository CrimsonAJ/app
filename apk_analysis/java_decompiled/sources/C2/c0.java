package C2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.content.SharedPreferences;
import com.anilab.data.model.request.RegisterRequest;
import com.anilab.data.model.response.ApiResponse;
import com.anilab.data.model.response.LoginResponse;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import u2.C2067a;
import v2.C2102b;
import y2.C2203a;

/* loaded from: classes.dex */
public final class c0 extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f1331r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g0 f1332s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f1333t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f1334u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f1335v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(g0 g0Var, String str, String str2, String str3, E7.d dVar) {
        super(2, dVar);
        this.f1332s = g0Var;
        this.f1333t = str;
        this.f1334u = str2;
        this.f1335v = str3;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new c0(this.f1332s, this.f1333t, this.f1334u, this.f1335v, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f1331r;
        g0 g0Var = this.f1332s;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            B2.b bVar = g0Var.f1359a;
            String n7 = AbstractC0953k1.n(O4.h.t(g0Var.f1360b), g6.o.f17761a.J0());
            RegisterRequest registerRequest = new RegisterRequest(this.f1333t, this.f1334u, this.f1335v);
            this.f1331r = 1;
            obj = bVar.B(n7, registerRequest, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        LoginResponse loginResponse = (LoginResponse) ((ApiResponse) obj).f14005c;
        C2203a c2203a = g0Var.f1360b;
        String o02 = g6.o.f17761a.o0();
        SharedPreferences.Editor edit = c2203a.f24771a.edit();
        edit.putString(o02, c2203a.f24772b.a(LoginResponse.class).d(loginResponse));
        edit.apply();
        if (loginResponse != null) {
            return new C2102b(loginResponse);
        }
        throw new C2067a((String) null, 2);
    }
}
