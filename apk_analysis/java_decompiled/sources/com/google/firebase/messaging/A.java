package com.google.firebase.messaging;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
public final class A implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f16419f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f16420g;

    /* renamed from: h, reason: collision with root package name */
    public static Boolean f16421h;

    /* renamed from: a, reason: collision with root package name */
    public final Context f16422a;

    /* renamed from: b, reason: collision with root package name */
    public final n f16423b;

    /* renamed from: c, reason: collision with root package name */
    public final PowerManager.WakeLock f16424c;

    /* renamed from: d, reason: collision with root package name */
    public final y f16425d;

    /* renamed from: e, reason: collision with root package name */
    public final long f16426e;

    public A(y yVar, Context context, n nVar, long j) {
        this.f16425d = yVar;
        this.f16422a = context;
        this.f16426e = j;
        this.f16423b = nVar;
        this.f16424c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f16419f) {
            try {
                Boolean bool = f16421h;
                if (bool == null) {
                    booleanValue = b(context, "android.permission.ACCESS_NETWORK_STATE", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                f16421h = valueOf;
                booleanValue2 = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue2;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        boolean z9;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z9;
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f16419f) {
            try {
                Boolean bool = f16420g;
                if (bool == null) {
                    booleanValue = b(context, "android.permission.WAKE_LOCK", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                f16420g = valueOf;
                booleanValue2 = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue2;
    }

    public final synchronized boolean d() {
        NetworkInfo networkInfo;
        boolean z9;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f16422a.getSystemService("connectivity");
            if (connectivityManager != null) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } else {
                networkInfo = null;
            }
            if (networkInfo != null) {
                if (networkInfo.isConnected()) {
                    z9 = true;
                }
            }
            z9 = false;
        } catch (Throwable th) {
            throw th;
        }
        return z9;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        y yVar = this.f16425d;
        Context context = this.f16422a;
        boolean c3 = c(context);
        PowerManager.WakeLock wakeLock = this.f16424c;
        if (c3) {
            wakeLock.acquire(g.f16473a);
        }
        try {
            try {
                try {
                    yVar.g(true);
                    if (!this.f16423b.e()) {
                        yVar.g(false);
                        if (!c(context)) {
                            return;
                        }
                    } else if (a(context) && !d()) {
                        new z(this, this).a();
                        if (!c(context)) {
                            return;
                        }
                    } else {
                        if (yVar.i()) {
                            yVar.g(false);
                        } else {
                            yVar.j(this.f16426e);
                        }
                        if (!c(context)) {
                            return;
                        }
                    }
                    wakeLock.release();
                } catch (IOException e8) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e8.getMessage());
                    yVar.g(false);
                    if (c(context)) {
                        wakeLock.release();
                    }
                }
            } catch (Throwable th) {
                if (c(context)) {
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
                throw th;
            }
        } catch (RuntimeException unused2) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
