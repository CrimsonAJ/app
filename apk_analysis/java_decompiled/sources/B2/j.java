package B2;

import A7.n;
import O7.p;
import Y2.r;
import Y7.B;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.content.SharedPreferences;
import b6.C0693o;
import com.anilab.data.model.response.LoginResponse;
import com.anilab.data.model.response.RefreshTokenResponse;
import com.anilab.data.model.response.TokenDataResponse;
import g6.o;
import i8.G;
import i8.L;
import java.io.IOException;
import v2.AbstractC2103c;
import v2.C2101a;
import v2.C2102b;
import y2.C2203a;

/* loaded from: classes.dex */
public final class j extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public g8.d f631r;

    /* renamed from: s, reason: collision with root package name */
    public int f632s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g8.d f633t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ L f634u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C0693o f635v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g8.d dVar, E7.d dVar2, L l9, C0693o c0693o) {
        super(2, dVar2);
        this.f633t = dVar;
        this.f634u = l9;
        this.f635v = c0693o;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new j(this.f633t, dVar, this.f634u, this.f635v);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        g8.d dVar;
        String str;
        String str2;
        G o9;
        L l9 = this.f634u;
        C0693o c0693o = this.f635v;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f632s;
        if (i9 != 0) {
            if (i9 == 1) {
                dVar = this.f631r;
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            g8.d dVar2 = this.f633t;
            this.f631r = dVar2;
            this.f632s = 1;
            if (dVar2.d(this) == aVar) {
                return aVar;
            }
            dVar = dVar2;
        }
        try {
            int i10 = l9.f19032d;
            G g9 = l9.f19029a;
            if (i10 == 401) {
                c0693o.f11386e = O4.h.z((C2203a) c0693o.f11384c);
                o oVar = o.f17761a;
                String O8 = oVar.O();
                LoginResponse loginResponse = (LoginResponse) c0693o.f11386e;
                if (loginResponse != null) {
                    str = loginResponse.f14201b.f14358a.f14362a;
                } else {
                    str = null;
                }
                String str3 = O8 + " " + str;
                if (g9.f19007c.b("Authorization") != null) {
                    if (!kotlin.jvm.internal.h.a(g9.f19007c.b("Authorization"), str3)) {
                        LoginResponse loginResponse2 = (LoginResponse) c0693o.f11386e;
                        if (loginResponse2 != null) {
                            TokenDataResponse tokenDataResponse = loginResponse2.f14201b;
                            C0693o.b(c0693o, tokenDataResponse.f14358a.f14362a, tokenDataResponse.f14359b.f14362a);
                        }
                        r b9 = g9.b();
                        b9.K("Authorization");
                        b9.n("Authorization", str3);
                        o9 = b9.o();
                    } else {
                        LoginResponse loginResponse3 = (LoginResponse) c0693o.f11386e;
                        if (loginResponse3 != null) {
                            str2 = loginResponse3.f14201b.f14359b.f14362a;
                        } else {
                            str2 = null;
                        }
                        AbstractC2103c abstractC2103c = (AbstractC2103c) B.v(E7.j.f1978a, new k(str2, c0693o, null));
                        if (abstractC2103c instanceof C2102b) {
                            RefreshTokenResponse refreshTokenResponse = (RefreshTokenResponse) ((C2102b) abstractC2103c).f23762a;
                            TokenDataResponse tokenDataResponse2 = refreshTokenResponse.f14289a;
                            C0693o.b(c0693o, tokenDataResponse2.f14358a.f14362a, tokenDataResponse2.f14359b.f14362a);
                            r b10 = g9.b();
                            b10.K("Authorization");
                            b10.n("Authorization", oVar.O() + " " + refreshTokenResponse.f14289a.f14358a.f14362a);
                            o9 = b10.o();
                        } else {
                            if (abstractC2103c instanceof C2101a) {
                                C2203a c2203a = (C2203a) c0693o.f11384c;
                                String key = oVar.o0();
                                kotlin.jvm.internal.h.e(key, "key");
                                SharedPreferences sharedPreferences = c2203a.f24771a;
                                SharedPreferences.Editor edit = sharedPreferences.edit();
                                edit.remove(key);
                                edit.apply();
                                String key2 = oVar.r0();
                                kotlin.jvm.internal.h.e(key2, "key");
                                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                                edit2.remove(key2);
                                edit2.apply();
                                throw new IOException();
                            }
                            throw new RuntimeException();
                        }
                    }
                    dVar.a(null);
                    return o9;
                }
            }
            o9 = null;
            dVar.a(null);
            return o9;
        } catch (Throwable th) {
            dVar.a(null);
            throw th;
        }
    }
}
