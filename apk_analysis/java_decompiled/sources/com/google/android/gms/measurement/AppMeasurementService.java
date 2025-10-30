package com.google.android.gms.measurement;

import S5.o;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import b5.BinderC0672w0;
import b5.C0650n0;
import b5.InterfaceC0657p1;
import b5.J1;
import b5.V;
import b5.V0;
import b7.C0701c;
import l0.AbstractC1528a;

/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements InterfaceC0657p1 {

    /* renamed from: a, reason: collision with root package name */
    public C0701c f15718a;

    public final C0701c a() {
        if (this.f15718a == null) {
            this.f15718a = new C0701c(22, this);
        }
        return this.f15718a;
    }

    @Override // b5.InterfaceC0657p1
    public final boolean k(int i9) {
        return stopSelfResult(i9);
    }

    @Override // b5.InterfaceC0657p1
    public final void l(Intent intent) {
        SparseArray sparseArray = AbstractC1528a.f20164a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = AbstractC1528a.f20164a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // b5.InterfaceC0657p1
    public final void m(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        C0701c a5 = a();
        a5.getClass();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC0672w0(J1.o0((Service) a5.f11404b));
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
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

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i9, int i10) {
        C0701c a5 = a();
        if (intent == null) {
            a5.getClass();
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = (Service) a5.f11404b;
        V v8 = C0650n0.l(service, null, null).f11229i;
        C0650n0.f(v8);
        String action = intent.getAction();
        v8.f10978n.d(Integer.valueOf(i10), action, "Local AppMeasurementService called. startId, action");
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            V0 v02 = new V0(a5, i10, v8, intent);
            J1 o02 = J1.o0(service);
            o02.K().v0(new o(o02, 29, v02));
            return 2;
        }
        return 2;
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
