package co.notix;

import Y7.B;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import co.notix.appopen.AppOpenActivity;

/* loaded from: classes.dex */
public final class v6 extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppOpenActivity f13338a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(AppOpenActivity appOpenActivity, E7.d dVar) {
        super(2, dVar);
        this.f13338a = appOpenActivity;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new v6(this.f13338a, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((v6) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        String stringExtra = this.f13338a.getIntent().getStringExtra("start_id");
        A7.n nVar = A7.n.f558a;
        if (stringExtra != null) {
            d dVar = this.f13338a.f11874a;
            dVar.getClass();
            e7 e7Var = (e7) ((e) dVar.f12066b.get(stringExtra));
            if (e7Var != null) {
                AppOpenActivity appOpenActivity = this.f13338a;
                appOpenActivity.f11878e = e7Var.f12142a;
                appOpenActivity.f11879f = e7Var.f12143b;
                appOpenActivity.f11880g = e7Var.f12144c;
                appOpenActivity.a();
                return nVar;
            }
        }
        AppOpenActivity appOpenActivity2 = this.f13338a;
        p8 reason = p8.ERROR;
        ia iaVar = appOpenActivity2.f11875b;
        c7 c7Var = appOpenActivity2.f11878e;
        if (c7Var != null) {
            String data = c7Var.f11987a.f12423h;
            iaVar.getClass();
            kotlin.jvm.internal.h.e(data, "data");
            kotlin.jvm.internal.h.e(reason, "reason");
            B.r(iaVar.f12446c, null, new z9(iaVar, data, reason, null), 3);
            appOpenActivity2.finish();
            return nVar;
        }
        kotlin.jvm.internal.h.h("appOpenData");
        throw null;
    }
}
