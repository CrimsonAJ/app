package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import e1.q;
import f1.k;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10433a = q.j("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        q.d().a(f10433a, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            k b02 = k.b0(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (k.f17298s) {
                try {
                    b02.f17306p = goAsync;
                    if (b02.f17305o) {
                        goAsync.finish();
                        b02.f17306p = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e8) {
            q.d().c(f10433a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e8);
        }
    }
}
