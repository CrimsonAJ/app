package B2;

import A7.n;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b6.C0693o;
import com.anilab.data.model.request.RefreshTokenRequest;
import com.anilab.data.model.response.ApiResponse;
import com.anilab.data.model.response.RefreshTokenResponse;
import g6.o;
import java.io.IOException;
import u2.C2067a;
import v2.C2101a;
import v2.C2102b;
import y2.C2203a;
import z8.C2266o;

/* loaded from: classes.dex */
public final class k extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f636r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f637s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0693o f638t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, C0693o c0693o, E7.d dVar) {
        super(2, dVar);
        this.f637s = str;
        this.f638t = c0693o;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new k(this.f637s, this.f638t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        C0693o c0693o = this.f638t;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f636r;
        try {
            if (i9 != 0) {
                if (i9 == 1) {
                    AbstractC0485a.A(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC0485a.A(obj);
                String str = this.f637s;
                if (str == null) {
                    return new C2101a(new IOException());
                }
                Object value = ((A7.l) c0693o.f11387f).getValue();
                kotlin.jvm.internal.h.d(value, "getValue(...)");
                String str2 = O4.h.t((C2203a) c0693o.f11384c) + o.f17761a.I0();
                RefreshTokenRequest refreshTokenRequest = new RefreshTokenRequest(str);
                this.f636r = 1;
                obj = ((d) value).a(str2, refreshTokenRequest, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            RefreshTokenResponse refreshTokenResponse = (RefreshTokenResponse) ((ApiResponse) obj).f14005c;
            if (refreshTokenResponse == null) {
                return new C2101a(new IOException());
            }
            return new C2102b(refreshTokenResponse);
        } catch (Exception e8) {
            if ((e8 instanceof C2266o) && ((C2266o) e8).f25620a == 401) {
                return new C2101a(new IOException());
            }
            return new C2101a(new C2067a("", 2));
        }
    }
}
