package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import e5.C1144a;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public static final long f16427a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f16428b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static C1144a f16429c;

    public static void a(Context context) {
        if (f16429c == null) {
            C1144a c1144a = new C1144a(context);
            f16429c = c1144a;
            synchronized (c1144a.f17202a) {
                c1144a.f17208g = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (f16428b) {
            try {
                if (f16429c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f16429c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c(Context context, E e8, Intent intent) {
        synchronized (f16428b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    f16429c.a(f16427a);
                }
                e8.b(intent).k(new C3.v(20, intent));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ComponentName d(Context context, Intent intent) {
        synchronized (f16428b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f16429c.a(f16427a);
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
