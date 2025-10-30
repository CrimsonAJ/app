package co.notix;

import X.C0419t;
import Y7.B;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.app.Activity;
import android.content.Intent;
import b8.AbstractC0714M;
import co.notix.lsi.LsiInterval;
import co.notix.push.permissions.NotificationsPermissionActivity;

/* loaded from: classes.dex */
public final class vg extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f13361a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wg f13362b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f13363c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LsiInterval f13364d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg(wg wgVar, long j, LsiInterval lsiInterval, E7.d dVar) {
        super(2, dVar);
        this.f13362b = wgVar;
        this.f13363c = j;
        this.f13364d = lsiInterval;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new vg(this.f13362b, this.f13363c, this.f13364d, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((vg) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f13361a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            if (this.f13362b.f13442c.b()) {
                y8 y8Var = this.f13362b.f13440a;
                f state = f.RESUMED;
                d9 d9Var = (d9) y8Var;
                d9Var.getClass();
                kotlin.jvm.internal.h.e(state, "state");
                C0419t c0419t = new C0419t(new b9(d9Var.f12078b, d9Var), 2);
                this.f13361a = 1;
                obj = AbstractC0714M.m(c0419t, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                this.f13362b.f13442c.c();
                gd gdVar = this.f13362b.f13443d;
                long j = this.f13363c;
                LsiInterval interval = this.f13364d;
                gdVar.getClass();
                kotlin.jvm.internal.h.e(interval, "interval");
                B.r(gdVar.f12311b, null, new fd(interval, gdVar, j, null), 3);
                return A7.n.f558a;
            }
        }
        Activity activity = (Activity) obj;
        activity.startActivity(new Intent(activity, (Class<?>) NotificationsPermissionActivity.class));
        gd gdVar2 = this.f13362b.f13443d;
        long j4 = this.f13363c;
        LsiInterval interval2 = this.f13364d;
        gdVar2.getClass();
        kotlin.jvm.internal.h.e(interval2, "interval");
        B.r(gdVar2.f12311b, null, new fd(interval2, gdVar2, j4, null), 3);
        return A7.n.f558a;
    }
}
