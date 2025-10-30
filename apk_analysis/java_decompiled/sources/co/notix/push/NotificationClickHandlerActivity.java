package co.notix.push;

import A7.i;
import A7.j;
import Y7.B;
import a.AbstractC0485a;
import android.app.Activity;
import android.os.Bundle;
import co.notix.fr;
import co.notix.ia;
import co.notix.md;
import co.notix.wq;
import co.notix.x9;
import co.notix.xq;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class NotificationClickHandlerActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public final ia f12997a = wq.g();

    /* renamed from: b, reason: collision with root package name */
    public final fr f12998b = wq.G();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [A7.i] */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        NotixTargetEventHandler notixTargetEventHandler;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("click_data");
        NotixTargetEventHandler notixTargetEventHandler2 = null;
        if (stringExtra != null) {
            ia iaVar = this.f12997a;
            iaVar.getClass();
            B.r(iaVar.f12446c, null, new x9(iaVar, stringExtra, null), 3);
        }
        String stringExtra2 = getIntent().getStringExtra("event");
        fr frVar = this.f12998b;
        NotixTargetEventHandler notixTargetEventHandler3 = frVar.f12284b;
        if (notixTargetEventHandler3 == null) {
            frVar.f12283a.getClass();
            String a5 = xq.a(wq.f13475b.a(), "NOTIX_TARGET_EVENT_HANDLER_CLASS");
            if (a5 != null) {
                try {
                    Object newInstance = Class.forName(a5).getConstructor(null).newInstance(null);
                    h.c(newInstance, "null cannot be cast to non-null type co.notix.push.NotixTargetEventHandler");
                    notixTargetEventHandler = (NotixTargetEventHandler) newInstance;
                } catch (Throwable th) {
                    notixTargetEventHandler = AbstractC0485a.h(th);
                }
                Throwable a9 = j.a(notixTargetEventHandler);
                if (a9 != null) {
                    md.f12779a.a("Unable to instantiate NotixTargetEventHandler. Make sure that the provided class has a public no argument constructor. " + a9.getMessage(), a9);
                }
                if (!(notixTargetEventHandler instanceof i)) {
                    notixTargetEventHandler2 = notixTargetEventHandler;
                }
                notixTargetEventHandler2 = notixTargetEventHandler2;
            }
            frVar.f12284b = notixTargetEventHandler2;
            notixTargetEventHandler3 = notixTargetEventHandler2;
        }
        if (notixTargetEventHandler3 != null) {
            notixTargetEventHandler3.handle(this, stringExtra2);
        }
        finish();
    }
}
