package h1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import e1.q;

/* renamed from: h1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1264c extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17837a = q.j("ConstraintProxy");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        q.d().a(f17837a, String.format("onReceive : %s", intent), new Throwable[0]);
        String str = C1263b.f17833d;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
