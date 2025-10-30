package co.notix;

import Y7.B;
import Y7.InterfaceC0484z;
import Y7.K;
import a.AbstractC0485a;
import co.notix.callback.NotixCallback;
import co.notix.callback.NotixCallbackStatus;

/* loaded from: classes.dex */
public final class rd extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f13101a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13102b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13103c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd f13104d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f13105e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd(String str, sd sdVar, String str2, E7.d dVar) {
        super(2, dVar);
        this.f13103c = str;
        this.f13104d = sdVar;
        this.f13105e = str2;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        rd rdVar = new rd(this.f13103c, this.f13104d, this.f13105e, dVar);
        rdVar.f13102b = obj;
        return rdVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((rd) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object h7;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f13101a;
        try {
            if (i9 != 0) {
                if (i9 == 1) {
                    AbstractC0485a.A(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC0485a.A(obj);
                String str = this.f13103c;
                sd sdVar = this.f13104d;
                String str2 = this.f13105e;
                if (str.length() != 0) {
                    sdVar.f13164b.getClass();
                    if (xq.a(wq.f13475b.a(), "NOTIX_AUTH_TOKEN") != null) {
                        sdVar.f13164b.getClass();
                        String a5 = xq.a();
                        if (a5 != null) {
                            String c3 = sdVar.f13164b.c();
                            String packageName = ((d9) sdVar.f13165c).a().getPackageName();
                            qd qdVar = sdVar.f13163a;
                            kotlin.jvm.internal.h.d(packageName, "packageName");
                            this.f13101a = 1;
                            qdVar.getClass();
                            obj = B.C(K.f8774b, new pd(qdVar, a5, str2, c3, str, packageName, null), this);
                            if (obj == aVar) {
                                return aVar;
                            }
                        } else {
                            throw new IllegalStateException("manageAudience: app id is empty");
                        }
                    } else {
                        throw new IllegalStateException("manageAudience: authToken is empty");
                    }
                } else {
                    throw new IllegalStateException("manageAudience: audience is empty");
                }
            }
            h7 = (String) obj;
        } catch (Throwable th) {
            h7 = AbstractC0485a.h(th);
        }
        sd sdVar2 = this.f13104d;
        if (!(h7 instanceof A7.i)) {
            kd kdVar = md.f12779a;
            kdVar.getClass();
            kdVar.f12607b.b("audience managed");
            sdVar2.f13167e.a(new NotixCallback.ManageAudience(NotixCallbackStatus.SUCCESS, (String) h7));
        }
        sd sdVar3 = this.f13104d;
        Throwable a9 = A7.j.a(h7);
        if (a9 != null) {
            yn.a(md.f12779a, "couldn't manage audience", a9);
            sdVar3.f13167e.a(new NotixCallback.ManageAudience(NotixCallbackStatus.FAILURE, a9.getMessage()));
        }
        return A7.n.f558a;
    }
}
