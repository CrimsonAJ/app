package b5;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class s1 extends AbstractC0652o {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11307e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11308f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1(Object obj, InterfaceC0676y0 interfaceC0676y0, int i9) {
        super(interfaceC0676y0);
        this.f11307e = i9;
        this.f11308f = obj;
    }

    @Override // b5.AbstractC0652o
    public final void b() {
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        switch (this.f11307e) {
            case 0:
                N3.X x5 = (N3.X) this.f11308f;
                t1 t1Var = (t1) x5.f5024d;
                t1Var.l0();
                C0650n0 c0650n0 = (C0650n0) t1Var.f1707a;
                c0650n0.f11233n.getClass();
                x5.a(SystemClock.elapsedRealtime(), false, false);
                C0677z c0677z = c0650n0.f11236q;
                C0650n0.c(c0677z);
                c0650n0.f11233n.getClass();
                c0677z.o0(SystemClock.elapsedRealtime());
                return;
            case 1:
                y1 y1Var = (y1) this.f11308f;
                y1Var.p0();
                V v8 = ((C0650n0) y1Var.f1707a).f11229i;
                C0650n0.f(v8);
                v8.f10978n.b("Starting upload from DelayedRunnable");
                y1Var.f11361b.X();
                return;
            default:
                J1 j12 = (J1) this.f11308f;
                j12.K().l0();
                String str = (String) j12.f10760q.pollFirst();
                if (str != null) {
                    j12.S().getClass();
                    j12.f10750g0 = SystemClock.elapsedRealtime();
                    j12.A().f10978n.c(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    Context context = j12.f10755l.f11221a;
                    if (Build.VERSION.SDK_INT >= 34) {
                        makeBasic = BroadcastOptions.makeBasic();
                        shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
                        bundle = shareIdentityEnabled.toBundle();
                        context.sendBroadcast(intent, null, bundle);
                    } else {
                        context.sendBroadcast(intent);
                    }
                }
                j12.B();
                return;
        }
    }
}
