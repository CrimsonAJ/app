package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import s.C1934d;
import s.C1935e;
import s.C1939i;

/* renamed from: com.google.android.gms.internal.measurement.z1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1027z1 {

    /* renamed from: h, reason: collision with root package name */
    public static final C1935e f15701h = new C1939i(0);

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f15702i = {"key", "value"};

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f15703a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f15704b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f15705c;

    /* renamed from: d, reason: collision with root package name */
    public final C1007v1 f15706d;

    /* renamed from: f, reason: collision with root package name */
    public volatile Map f15708f;

    /* renamed from: e, reason: collision with root package name */
    public final Object f15707e = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f15709g = new ArrayList();

    public C1027z1(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        contentResolver.getClass();
        uri.getClass();
        this.f15703a = contentResolver;
        this.f15704b = uri;
        this.f15705c = runnable;
        this.f15706d = new C1007v1(1, this);
    }

    public static C1027z1 a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C1027z1 c1027z1;
        synchronized (C1027z1.class) {
            C1935e c1935e = f15701h;
            c1027z1 = (C1027z1) c1935e.get(uri);
            if (c1027z1 == null) {
                try {
                    C1027z1 c1027z12 = new C1027z1(contentResolver, uri, runnable);
                    try {
                        contentResolver.registerContentObserver(uri, false, c1027z12.f15706d);
                        c1935e.put(uri, c1027z12);
                    } catch (SecurityException unused) {
                    }
                    c1027z1 = c1027z12;
                } catch (SecurityException unused2) {
                }
            }
        }
        return c1027z1;
    }

    public static synchronized void c() {
        synchronized (C1027z1.class) {
            try {
                C1935e c1935e = f15701h;
                Iterator it = ((C1934d) c1935e.values()).iterator();
                while (it.hasNext()) {
                    C1027z1 c1027z1 = (C1027z1) it.next();
                    c1027z1.f15703a.unregisterContentObserver(c1027z1.f15706d);
                }
                c1935e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0052  */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.StrictMode$ThreadPolicy, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map b() {
        /*
            r5 = this;
            java.util.Map r0 = r5.f15708f
            if (r0 != 0) goto L4f
            java.lang.Object r1 = r5.f15707e
            monitor-enter(r1)
            java.util.Map r0 = r5.f15708f     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L4b
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L2a
            com.google.android.gms.internal.measurement.o2 r2 = new com.google.android.gms.internal.measurement.o2     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
            java.lang.Object r2 = r2.a()     // Catch: java.lang.SecurityException -> L19 java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30
            goto L24
        L19:
            long r3 = android.os.Binder.clearCallingIdentity()     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
            java.lang.Object r2 = r2.a()     // Catch: java.lang.Throwable -> L34
            android.os.Binder.restoreCallingIdentity(r3)     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
        L24:
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
        L26:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L2a
            goto L43
        L2a:
            r0 = move-exception
            goto L4d
        L2c:
            r2 = move-exception
            goto L47
        L2e:
            r2 = move-exception
            goto L39
        L30:
            r2 = move-exception
            goto L39
        L32:
            r2 = move-exception
            goto L39
        L34:
            r2 = move-exception
            android.os.Binder.restoreCallingIdentity(r3)     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
            throw r2     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
        L39:
            java.lang.String r3 = "ConfigurationContentLdr"
            java.lang.String r4 = "Unable to query ContentProvider, using default values"
            android.util.Log.w(r3, r4, r2)     // Catch: java.lang.Throwable -> L2c
            java.util.Map r2 = java.util.Collections.EMPTY_MAP     // Catch: java.lang.Throwable -> L2c
            goto L26
        L43:
            r5.f15708f = r2     // Catch: java.lang.Throwable -> L2a
            r0 = r2
            goto L4b
        L47:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L2a
            throw r2     // Catch: java.lang.Throwable -> L2a
        L4b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            goto L4f
        L4d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            throw r0
        L4f:
            if (r0 == 0) goto L52
            return r0
        L52:
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1027z1.b():java.util.Map");
    }
}
