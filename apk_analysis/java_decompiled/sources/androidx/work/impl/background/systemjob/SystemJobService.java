package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import e1.q;
import f1.InterfaceC1159a;
import f1.k;
import java.util.HashMap;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC1159a {

    /* renamed from: c, reason: collision with root package name */
    public static final String f10437c = q.j("SystemJobService");

    /* renamed from: a, reason: collision with root package name */
    public k f10438a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f10439b = new HashMap();

    @Override // f1.InterfaceC1159a
    public final void a(String str, boolean z9) {
        JobParameters jobParameters;
        q.d().a(f10437c, AbstractC0953k1.n(str, " executed on JobScheduler"), new Throwable[0]);
        synchronized (this.f10439b) {
            jobParameters = (JobParameters) this.f10439b.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z9);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            k b02 = k.b0(getApplicationContext());
            this.f10438a = b02;
            b02.f17303m.b(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                q.d().k(f10437c, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        k kVar = this.f10438a;
        if (kVar != null) {
            kVar.f17303m.f(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStartJob(android.app.job.JobParameters r10) {
        /*
            r9 = this;
            java.lang.String r0 = "onStartJob for "
            java.lang.String r1 = "Job is already being executed by SystemJobService: "
            f1.k r2 = r9.f10438a
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L1b
            e1.q r0 = e1.q.d()
            java.lang.String r1 = androidx.work.impl.background.systemjob.SystemJobService.f10437c
            java.lang.String r2 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r5 = new java.lang.Throwable[r4]
            r0.a(r1, r2, r5)
            r9.jobFinished(r10, r3)
            return r4
        L1b:
            java.lang.String r2 = "EXTRA_WORK_SPEC_ID"
            r5 = 0
            android.os.PersistableBundle r6 = r10.getExtras()     // Catch: java.lang.NullPointerException -> L2f
            if (r6 == 0) goto L2f
            boolean r7 = r6.containsKey(r2)     // Catch: java.lang.NullPointerException -> L2f
            if (r7 == 0) goto L2f
            java.lang.String r2 = r6.getString(r2)     // Catch: java.lang.NullPointerException -> L2f
            goto L30
        L2f:
            r2 = r5
        L30:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L44
            e1.q r10 = e1.q.d()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f10437c
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r2 = new java.lang.Throwable[r4]
            r10.c(r0, r1, r2)
            return r4
        L44:
            java.util.HashMap r6 = r9.f10439b
            monitor-enter(r6)
            java.util.HashMap r7 = r9.f10439b     // Catch: java.lang.Throwable -> L68
            boolean r7 = r7.containsKey(r2)     // Catch: java.lang.Throwable -> L68
            if (r7 == 0) goto L6a
            e1.q r10 = e1.q.d()     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f10437c     // Catch: java.lang.Throwable -> L68
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L68
            r3.append(r2)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L68
            java.lang.Throwable[] r2 = new java.lang.Throwable[r4]     // Catch: java.lang.Throwable -> L68
            r10.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L68
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L68
            return r4
        L68:
            r10 = move-exception
            goto Lc4
        L6a:
            e1.q r1 = e1.q.d()     // Catch: java.lang.Throwable -> L68
            java.lang.String r7 = androidx.work.impl.background.systemjob.SystemJobService.f10437c     // Catch: java.lang.Throwable -> L68
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L68
            r8.append(r2)     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> L68
            java.lang.Throwable[] r4 = new java.lang.Throwable[r4]     // Catch: java.lang.Throwable -> L68
            r1.a(r7, r0, r4)     // Catch: java.lang.Throwable -> L68
            java.util.HashMap r0 = r9.f10439b     // Catch: java.lang.Throwable -> L68
            r0.put(r2, r10)     // Catch: java.lang.Throwable -> L68
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L68
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lbe
            b5.G1 r5 = new b5.G1
            r1 = 9
            r5.<init>(r1)
            android.net.Uri[] r1 = com.google.android.material.datepicker.u.y(r10)
            if (r1 == 0) goto La4
            android.net.Uri[] r1 = com.google.android.material.datepicker.u.y(r10)
            java.util.List r1 = java.util.Arrays.asList(r1)
            r5.f10718c = r1
        La4:
            java.lang.String[] r1 = com.google.android.material.datepicker.u.z(r10)
            if (r1 == 0) goto Lb4
            java.lang.String[] r1 = com.google.android.material.datepicker.u.z(r10)
            java.util.List r1 = java.util.Arrays.asList(r1)
            r5.f10717b = r1
        Lb4:
            r1 = 28
            if (r0 < r1) goto Lbe
            android.net.Network r10 = C5.f.g(r10)
            r5.f10719d = r10
        Lbe:
            f1.k r10 = r9.f10438a
            r10.e0(r2, r5)
            return r3
        Lc4:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L68
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStopJob(android.app.job.JobParameters r6) {
        /*
            r5 = this;
            f1.k r0 = r5.f10438a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L14
            e1.q r6 = e1.q.d()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f10437c
            java.lang.String r3 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r6.a(r0, r3, r2)
            return r1
        L14:
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r6 = r6.getExtras()     // Catch: java.lang.NullPointerException -> L27
            if (r6 == 0) goto L27
            boolean r3 = r6.containsKey(r0)     // Catch: java.lang.NullPointerException -> L27
            if (r3 == 0) goto L27
            java.lang.String r6 = r6.getString(r0)     // Catch: java.lang.NullPointerException -> L27
            goto L28
        L27:
            r6 = 0
        L28:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L3c
            e1.q r6 = e1.q.d()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f10437c
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r6.c(r0, r1, r3)
            return r2
        L3c:
            e1.q r0 = e1.q.d()
            java.lang.String r3 = androidx.work.impl.background.systemjob.SystemJobService.f10437c
            java.lang.String r4 = "onStopJob for "
            java.lang.String r4 = u0.z.e(r4, r6)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r0.a(r3, r4, r2)
            java.util.HashMap r0 = r5.f10439b
            monitor-enter(r0)
            java.util.HashMap r2 = r5.f10439b     // Catch: java.lang.Throwable -> L65
            r2.remove(r6)     // Catch: java.lang.Throwable -> L65
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L65
            f1.k r0 = r5.f10438a
            r0.f0(r6)
            f1.k r0 = r5.f10438a
            f1.b r0 = r0.f17303m
            boolean r6 = r0.d(r6)
            r6 = r6 ^ r1
            return r6
        L65:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L65
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStopJob(android.app.job.JobParameters):boolean");
    }
}
