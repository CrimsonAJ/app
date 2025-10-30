package l1;

import android.content.Intent;
import android.content.IntentFilter;
import e1.q;
import u0.z;

/* renamed from: l1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1530b extends AbstractC1531c {

    /* renamed from: i, reason: collision with root package name */
    public static final String f20167i = q.j("BatteryNotLowTracker");

    @Override // l1.AbstractC1532d
    public final Object a() {
        Intent registerReceiver = this.f20172b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z9 = false;
        if (registerReceiver == null) {
            q.d().c(f20167i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        float intExtra = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
        if (registerReceiver.getIntExtra("status", -1) == 1 || intExtra > 0.15f) {
            z9 = true;
        }
        return Boolean.valueOf(z9);
    }

    @Override // l1.AbstractC1531c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // l1.AbstractC1531c
    public final void g(Intent intent) {
        if (intent.getAction() != null) {
            q.d().a(f20167i, z.e("Received ", intent.getAction()), new Throwable[0]);
            String action = intent.getAction();
            action.getClass();
            if (!action.equals("android.intent.action.BATTERY_OKAY")) {
                if (!action.equals("android.intent.action.BATTERY_LOW")) {
                    return;
                }
                c(Boolean.FALSE);
                return;
            }
            c(Boolean.TRUE);
        }
    }
}
