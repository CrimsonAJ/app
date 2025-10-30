package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;

/* loaded from: classes.dex */
public final class z extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public A f16535a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f16536b;

    public z(A a5, A a9) {
        this.f16536b = a5;
        this.f16535a = a9;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        A a5 = this.f16536b;
        a5.f16422a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002a A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:3:0x0001, B:8:0x0007, B:12:0x000f, B:14:0x0018, B:16:0x001e, B:21:0x002a, B:22:0x0034), top: B:2:0x0001 }] */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void onReceive(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.firebase.messaging.A r6 = r4.f16535a     // Catch: java.lang.Throwable -> L32
            if (r6 != 0) goto L7
            monitor-exit(r4)
            return
        L7:
            boolean r6 = r6.d()     // Catch: java.lang.Throwable -> L32
            if (r6 != 0) goto Lf
            monitor-exit(r4)
            return
        Lf:
            java.lang.String r6 = "FirebaseMessaging"
            r0 = 3
            boolean r1 = android.util.Log.isLoggable(r6, r0)     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L27
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L32
            r2 = 23
            if (r1 != r2) goto L25
            boolean r6 = android.util.Log.isLoggable(r6, r0)     // Catch: java.lang.Throwable -> L32
            if (r6 == 0) goto L25
            goto L27
        L25:
            r6 = 0
            goto L28
        L27:
            r6 = 1
        L28:
            if (r6 == 0) goto L34
            java.lang.String r6 = "FirebaseMessaging"
            java.lang.String r0 = "Connectivity changed. Starting background sync."
            android.util.Log.d(r6, r0)     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            r5 = move-exception
            goto L49
        L34:
            com.google.firebase.messaging.A r6 = r4.f16535a     // Catch: java.lang.Throwable -> L32
            com.google.firebase.messaging.y r0 = r6.f16425d     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r0.f16532f     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L32
            r2 = 0
            r0.schedule(r6, r2, r1)     // Catch: java.lang.Throwable -> L32
            r5.unregisterReceiver(r4)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            r4.f16535a = r5     // Catch: java.lang.Throwable -> L32
            monitor-exit(r4)
            return
        L49:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.z.onReceive(android.content.Context, android.content.Intent):void");
    }
}
