package b5;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* loaded from: classes.dex */
public final class y1 extends D1 {

    /* renamed from: d, reason: collision with root package name */
    public final AlarmManager f11349d;

    /* renamed from: e, reason: collision with root package name */
    public s1 f11350e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f11351f;

    public y1(J1 j12) {
        super(j12);
        this.f11349d = (AlarmManager) ((C0650n0) this.f1707a).f11221a.getSystemService("alarm");
    }

    @Override // b5.D1
    public final void o0() {
        JobScheduler jobScheduler;
        AlarmManager alarmManager = this.f11349d;
        if (alarmManager != null) {
            alarmManager.cancel(r0());
        }
        if (Build.VERSION.SDK_INT >= 24 && (jobScheduler = (JobScheduler) ((C0650n0) this.f1707a).f11221a.getSystemService("jobscheduler")) != null) {
            jobScheduler.cancel(q0());
        }
    }

    public final void p0() {
        JobScheduler jobScheduler;
        m0();
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        V v8 = c0650n0.f11229i;
        C0650n0.f(v8);
        v8.f10978n.b("Unscheduling upload");
        AlarmManager alarmManager = this.f11349d;
        if (alarmManager != null) {
            alarmManager.cancel(r0());
        }
        s0().a();
        if (Build.VERSION.SDK_INT >= 24 && (jobScheduler = (JobScheduler) c0650n0.f11221a.getSystemService("jobscheduler")) != null) {
            jobScheduler.cancel(q0());
        }
    }

    public final int q0() {
        if (this.f11351f == null) {
            this.f11351f = Integer.valueOf("measurement".concat(String.valueOf(((C0650n0) this.f1707a).f11221a.getPackageName())).hashCode());
        }
        return this.f11351f.intValue();
    }

    public final PendingIntent r0() {
        Context context = ((C0650n0) this.f1707a).f11221a;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.E.f15207a);
    }

    public final AbstractC0652o s0() {
        if (this.f11350e == null) {
            this.f11350e = new s1(this, this.f11361b.f10755l, 1);
        }
        return this.f11350e;
    }
}
