package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import b5.C0650n0;
import b5.V;
import l0.AbstractC1528a;
import o1.C1671f;

/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends AbstractC1528a {

    /* renamed from: c, reason: collision with root package name */
    public C1671f f15717c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f15717c == null) {
            this.f15717c = new C1671f(26, this);
        }
        C1671f c1671f = this.f15717c;
        c1671f.getClass();
        V v8 = C0650n0.l(context, null, null).f11229i;
        C0650n0.f(v8);
        if (intent == null) {
            v8.f10974i.b("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        v8.f10978n.c(action, "Local receiver got");
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            v8.f10978n.b("Starting wakeful intent.");
            ((AppMeasurementReceiver) c1671f.f21473b).getClass();
            SparseArray sparseArray = AbstractC1528a.f20164a;
            synchronized (sparseArray) {
                try {
                    int i9 = AbstractC1528a.f20165b;
                    int i10 = i9 + 1;
                    AbstractC1528a.f20165b = i10;
                    if (i10 <= 0) {
                        AbstractC1528a.f20165b = 1;
                    }
                    className.putExtra("androidx.contentpager.content.wakelockid", i9);
                    ComponentName startService = context.startService(className);
                    if (startService == null) {
                        return;
                    }
                    PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                    newWakeLock.setReferenceCounted(false);
                    newWakeLock.acquire(60000L);
                    sparseArray.put(i9, newWakeLock);
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            v8.f10974i.b("Install Referrer Broadcasts are deprecated");
        }
    }
}
