package androidx.work.impl.background.systemalarm;

import A4.j;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import e1.q;
import f1.k;
import u0.z;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10432a = q.j("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            q.d().a(f10432a, z.e("Ignoring unknown action ", str), new Throwable[0]);
        } else {
            k.b0(context).f17301k.i(new j(intent, context, goAsync()));
        }
    }
}
