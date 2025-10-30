package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import A6.r;
import Y2.j;
import Y2.s;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.support.v4.media.session.y;
import android.util.Base64;
import e3.f;
import i3.AbstractC1379a;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f14497a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i9 = jobParameters.getExtras().getInt("priority");
        int i10 = jobParameters.getExtras().getInt("attemptNumber");
        s.b(getApplicationContext());
        y a5 = j.a();
        a5.V(string);
        a5.f9333d = AbstractC1379a.b(i9);
        if (string2 != null) {
            a5.f9332c = Base64.decode(string2, 0);
        }
        e3.j jVar = s.a().f8656d;
        j B9 = a5.B();
        r rVar = new r(this, 12, jobParameters);
        jVar.getClass();
        jVar.f17175e.execute(new f(jVar, B9, i10, rVar));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
