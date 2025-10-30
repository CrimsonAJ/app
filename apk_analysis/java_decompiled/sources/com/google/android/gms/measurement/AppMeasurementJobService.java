package com.google.android.gms.measurement;

import A4.j;
import F4.y;
import S5.o;
import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import b5.E;
import b5.InterfaceC0657p1;
import b5.J1;
import b5.V;
import b7.C0701c;
import com.google.android.gms.internal.measurement.C0952k0;
import com.google.android.gms.internal.measurement.Y;
import java.util.Objects;
import z2.C2235a;

@TargetApi(24)
/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements InterfaceC0657p1 {

    /* renamed from: a, reason: collision with root package name */
    public C0701c f15716a;

    public final C0701c a() {
        if (this.f15716a == null) {
            this.f15716a = new C0701c(22, this);
        }
        return this.f15716a;
    }

    @Override // b5.InterfaceC0657p1
    public final boolean k(int i9) {
        throw new UnsupportedOperationException();
    }

    @Override // b5.InterfaceC0657p1
    public final void l(Intent intent) {
    }

    @Override // b5.InterfaceC0657p1
    public final void m(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) a().f11404b).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) a().f11404b).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        a();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        C0701c a5 = a();
        a5.getClass();
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        boolean equals = Objects.equals(string, "com.google.android.gms.measurement.UPLOAD");
        Service service = (Service) a5.f11404b;
        if (equals) {
            y.h(string);
            J1 o02 = J1.o0(service);
            V A2 = o02.A();
            C2235a c2235a = o02.f10755l.f11226f;
            A2.f10978n.c(string, "Local AppMeasurementJobService called. action");
            o02.K().v0(new o(o02, 29, new j(a5, A2, jobParameters, 12)));
        }
        if (Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            y.h(string);
            C0952k0 d9 = C0952k0.d(service, null);
            if (((Boolean) E.f10625U0.a(null)).booleanValue()) {
                o oVar = new o(a5, 28, jobParameters);
                d9.getClass();
                d9.b(new Y(d9, oVar, 1));
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        a();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }
}
