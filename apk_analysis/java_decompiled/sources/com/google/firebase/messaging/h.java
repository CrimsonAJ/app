package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import f5.AbstractC1176h;
import f5.C1177i;
import f5.C1185q;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class h extends Service {
    static final long MESSAGE_TIMEOUT_S = 20;
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    final ExecutorService executor;
    private int lastStartId;
    private final Object lock;
    private int runningTasks;

    public h() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new L4.a("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.lock = new Object();
        this.runningTasks = 0;
    }

    public static AbstractC1176h access$000(h hVar, Intent intent) {
        if (hVar.handleIntentOnMainThread(intent)) {
            return s8.n.p(null);
        }
        C1177i c1177i = new C1177i();
        hVar.executor.execute(new N3.E(hVar, intent, c1177i, 3));
        return c1177i.f17413a;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            B.b(intent);
        }
        synchronized (this.lock) {
            try {
                int i9 = this.runningTasks - 1;
                this.runningTasks = i9;
                if (i9 == 0) {
                    stopSelfResultHook(this.lastStartId);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Intent getStartCommandIntent(Intent intent);

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Service received bind request");
            }
            if (this.binder == null) {
                this.binder = new C(new s4.i((Object) this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.binder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i9, int i10) {
        C1185q c1185q;
        synchronized (this.lock) {
            this.lastStartId = i10;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            a(intent);
            return 2;
        }
        if (handleIntentOnMainThread(startCommandIntent)) {
            c1185q = s8.n.p(null);
        } else {
            C1177i c1177i = new C1177i();
            this.executor.execute(new N3.E(this, startCommandIntent, c1177i, 3));
            c1185q = c1177i.f17413a;
        }
        if (c1185q.i()) {
            a(intent);
            return 2;
        }
        c1185q.b(new C0.e(0), new N1.h(this, 5, intent));
        return 3;
    }

    public boolean stopSelfResultHook(int i9) {
        return stopSelfResult(i9);
    }
}
