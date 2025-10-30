package b5;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class X0 extends B {

    /* renamed from: c, reason: collision with root package name */
    public JobScheduler f10989c;

    @Override // b5.B
    public final boolean o0() {
        return true;
    }

    public final int p0() {
        boolean booleanValue;
        m0();
        l0();
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        if (!c0650n0.f11227g.y0(null, E.f10621S0)) {
            return 9;
        }
        if (this.f10989c != null) {
            Boolean w02 = c0650n0.f11227g.w0("google_analytics_sgtm_upload_enabled");
            if (w02 == null) {
                booleanValue = false;
            } else {
                booleanValue = w02.booleanValue();
            }
            if (booleanValue) {
                if (c0650n0.i().j >= 119000) {
                    if (!P1.i1(c0650n0.f11221a, "com.google.android.gms.measurement.AppMeasurementJobService")) {
                        return 3;
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        if (!c0650n0.m().y0()) {
                            return 5;
                        }
                        return 2;
                    }
                    return 4;
                }
                return 6;
            }
            return 8;
        }
        return 7;
    }

    public final void q0(long j) {
        String str;
        JobInfo pendingJob;
        m0();
        l0();
        JobScheduler jobScheduler = this.f10989c;
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        if (jobScheduler != null) {
            pendingJob = jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(c0650n0.f11221a.getPackageName())).hashCode());
            if (pendingJob != null) {
                V v8 = c0650n0.f11229i;
                C0650n0.f(v8);
                v8.f10978n.b("[sgtm] There's an existing pending job, skip this schedule.");
                return;
            }
        }
        int p02 = p0();
        if (p02 == 2) {
            V v9 = c0650n0.f11229i;
            C0650n0.f(v9);
            v9.f10978n.c(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
            JobInfo build = new JobInfo.Builder("measurement-client".concat(String.valueOf(c0650n0.f11221a.getPackageName())).hashCode(), new ComponentName(c0650n0.f11221a, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
            JobScheduler jobScheduler2 = this.f10989c;
            F4.y.h(jobScheduler2);
            int schedule = jobScheduler2.schedule(build);
            V v10 = c0650n0.f11229i;
            C0650n0.f(v10);
            if (schedule == 1) {
                str = "SUCCESS";
            } else {
                str = "FAILURE";
            }
            v10.f10978n.c(str, "[sgtm] Scion upload job scheduled with result");
            return;
        }
        V v11 = c0650n0.f11229i;
        C0650n0.f(v11);
        v11.f10978n.c(AbstractC0953k1.y(p02), "[sgtm] Not eligible for Scion upload");
    }
}
