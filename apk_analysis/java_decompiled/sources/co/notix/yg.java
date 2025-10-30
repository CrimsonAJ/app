package co.notix;

import X.C0419t;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.app.Activity;
import android.content.Intent;
import b8.AbstractC0714M;
import co.notix.push.permissions.NotificationsPermissionActivity;

/* loaded from: classes.dex */
public final class yg extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f13605a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ch f13606b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg(ch chVar, E7.d dVar) {
        super(2, dVar);
        this.f13606b = chVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new yg(this.f13606b, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((yg) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f13605a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            if (this.f13606b.f12025c.b()) {
                y8 y8Var = this.f13606b.f12026d;
                f state = f.RESUMED;
                d9 d9Var = (d9) y8Var;
                d9Var.getClass();
                kotlin.jvm.internal.h.e(state, "state");
                C0419t c0419t = new C0419t(new b9(d9Var.f12078b, d9Var), 2);
                this.f13605a = 1;
                obj = AbstractC0714M.m(c0419t, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                this.f13606b.f12025c.c();
                return A7.n.f558a;
            }
        }
        Activity activity = (Activity) obj;
        activity.startActivity(new Intent(activity, (Class<?>) NotificationsPermissionActivity.class));
        return A7.n.f558a;
    }
}
