package co.notix;

import Y7.B;
import Y7.InterfaceC0484z;
import android.app.NotificationManager;
import android.os.Build;
import co.notix.lsi.LockScreenInterstitialCallback;
import co.notix.lsi.LsiInterval;
import co.notix.lsi.NotixLockScreenInterstitialAd;

/* loaded from: classes.dex */
public final class wg implements NotixLockScreenInterstitialAd {

    /* renamed from: a, reason: collision with root package name */
    public final y8 f13440a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0484z f13441b;

    /* renamed from: c, reason: collision with root package name */
    public final lf f13442c;

    /* renamed from: d, reason: collision with root package name */
    public final gd f13443d;

    public wg(d9 contextProvider, InterfaceC0484z cs, lf notificationsPermissionController, gd lsiWorkManager) {
        kotlin.jvm.internal.h.e(contextProvider, "contextProvider");
        kotlin.jvm.internal.h.e(cs, "cs");
        kotlin.jvm.internal.h.e(notificationsPermissionController, "notificationsPermissionController");
        kotlin.jvm.internal.h.e(lsiWorkManager, "lsiWorkManager");
        this.f13440a = contextProvider;
        this.f13441b = cs;
        this.f13442c = notificationsPermissionController;
        this.f13443d = lsiWorkManager;
    }

    @Override // co.notix.lsi.NotixLockScreenInterstitialAd
    public final void cancel() {
        B.r(this.f13441b, null, new ug(this, null), 3);
    }

    @Override // co.notix.lsi.NotixLockScreenInterstitialAd
    public final void schedule(long j) {
        schedule(j, LsiInterval.Optimized.INSTANCE);
    }

    @Override // co.notix.lsi.NotixLockScreenInterstitialAd
    public final void setCallbacks(LockScreenInterstitialCallback callback) {
        kotlin.jvm.internal.h.e(callback, "callback");
        tc tcVar = wq.f13498z;
        tcVar.getClass();
        tcVar.f13217a = callback;
    }

    @Override // co.notix.lsi.NotixLockScreenInterstitialAd
    public final void schedule(long j, LsiInterval interval) {
        boolean canUseFullScreenIntent;
        kotlin.jvm.internal.h.e(interval, "interval");
        if (Build.VERSION.SDK_INT >= 34) {
            Object systemService = ((d9) this.f13440a).a().getSystemService("notification");
            kotlin.jvm.internal.h.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            canUseFullScreenIntent = ((NotificationManager) systemService).canUseFullScreenIntent();
            if (!canUseFullScreenIntent) {
                return;
            }
        }
        B.r(this.f13441b, null, new vg(this, j, interval, null), 3);
    }
}
