package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import f5.C1185q;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class E implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16433a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f16434b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f16435c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f16436d;

    /* renamed from: e, reason: collision with root package name */
    public C f16437e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16438f;

    public E(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f16436d = new ArrayDeque();
        this.f16438f = false;
        Context applicationContext = context.getApplicationContext();
        this.f16433a = applicationContext;
        this.f16434b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f16435c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f16436d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                C c3 = this.f16437e;
                if (c3 != null && c3.isBinderAlive()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                    }
                    this.f16437e.a((D) this.f16436d.poll());
                } else {
                    c();
                    return;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized C1185q b(Intent intent) {
        D d9;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            d9 = new D(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f16435c;
            d9.f16432b.f17413a.b(scheduledThreadPoolExecutor, new C3.v(22, scheduledThreadPoolExecutor.schedule(new A6.s(16, d9), 20L, TimeUnit.SECONDS)));
            this.f16436d.add(d9);
            a();
        } catch (Throwable th) {
            throw th;
        }
        return d9.f16432b.f17413a;
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.f16438f);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (!this.f16438f) {
            this.f16438f = true;
            try {
            } catch (SecurityException e8) {
                Log.e("FirebaseMessaging", "Exception while binding the service", e8);
            }
            if (!J4.a.b().a(this.f16433a, this.f16434b, this, 65)) {
                Log.e("FirebaseMessaging", "binding to the service failed");
                this.f16438f = false;
                while (true) {
                    ArrayDeque arrayDeque = this.f16436d;
                    if (!arrayDeque.isEmpty()) {
                        ((D) arrayDeque.poll()).f16432b.d(null);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f16438f = false;
            if (!(iBinder instanceof C)) {
                Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
                while (true) {
                    ArrayDeque arrayDeque = this.f16436d;
                    if (!arrayDeque.isEmpty()) {
                        ((D) arrayDeque.poll()).f16432b.d(null);
                    } else {
                        return;
                    }
                }
            } else {
                this.f16437e = (C) iBinder;
                a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
