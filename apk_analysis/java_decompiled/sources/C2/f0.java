package C2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.content.SharedPreferences;
import com.anilab.data.model.request.UpdateUserInfoRequest;
import com.anilab.data.model.response.ApiResponse;
import com.anilab.data.model.response.LoginResponse;
import com.anilab.data.model.response.UserInfoResponse;
import com.anilab.data.model.response.UserResponse;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import u2.C2067a;
import v2.C2102b;
import y2.C2203a;

/* loaded from: classes.dex */
public final class f0 extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f1352r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g0 f1353s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Long f1354t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f1355u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, Long l9, String str, E7.d dVar) {
        super(2, dVar);
        this.f1353s = g0Var;
        this.f1354t = l9;
        this.f1355u = str;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new f0(this.f1353s, this.f1354t, this.f1355u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        UserResponse userResponse;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f1352r;
        g0 g0Var = this.f1353s;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            B2.b bVar = g0Var.f1359a;
            String n7 = AbstractC0953k1.n(O4.h.t(g0Var.f1360b), g6.o.f17761a.U0());
            UpdateUserInfoRequest updateUserInfoRequest = new UpdateUserInfoRequest(this.f1354t, this.f1355u);
            this.f1352r = 1;
            obj = bVar.m(n7, updateUserInfoRequest, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        UserInfoResponse userInfoResponse = (UserInfoResponse) ((ApiResponse) obj).f14005c;
        if (userInfoResponse != null) {
            userResponse = userInfoResponse.f14366a;
        } else {
            userResponse = null;
        }
        if (userResponse != null) {
            LoginResponse a5 = g0Var.a();
            if (a5 != null) {
                a5.f14200a = userResponse;
            }
            C2203a c2203a = g0Var.f1360b;
            String o02 = g6.o.f17761a.o0();
            SharedPreferences.Editor edit = c2203a.f24771a.edit();
            edit.putString(o02, c2203a.f24772b.a(LoginResponse.class).d(a5));
            edit.apply();
            return new C2102b(userResponse);
        }
        throw new C2067a((String) null, 2);
    }
}
