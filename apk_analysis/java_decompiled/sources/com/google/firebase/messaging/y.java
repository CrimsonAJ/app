package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import b6.C0693o;
import f5.C1177i;
import f5.C1185q;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import s.C1935e;
import s.C1939i;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: i, reason: collision with root package name */
    public static final long f16526i = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f16527a;

    /* renamed from: b, reason: collision with root package name */
    public final n f16528b;

    /* renamed from: c, reason: collision with root package name */
    public final C0693o f16529c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f16530d;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f16532f;

    /* renamed from: h, reason: collision with root package name */
    public final w f16534h;

    /* renamed from: e, reason: collision with root package name */
    public final C1935e f16531e = new C1939i(0);

    /* renamed from: g, reason: collision with root package name */
    public boolean f16533g = false;

    /* JADX WARN: Type inference failed for: r0v0, types: [s.e, s.i] */
    public y(FirebaseMessaging firebaseMessaging, n nVar, w wVar, C0693o c0693o, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f16530d = firebaseMessaging;
        this.f16528b = nVar;
        this.f16534h = wVar;
        this.f16529c = c0693o;
        this.f16527a = context;
        this.f16532f = scheduledThreadPoolExecutor;
    }

    public static void b(C1185q c1185q) {
        try {
            try {
                s8.n.c(c1185q, 30L, TimeUnit.SECONDS);
            } catch (TimeoutException e8) {
                e = e8;
                throw new IOException("SERVICE_NOT_AVAILABLE", e);
            }
        } catch (InterruptedException | TimeoutException e9) {
            e = e9;
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e10);
            }
            throw ((IOException) cause);
        }
    }

    public static boolean e() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            if (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void a(v vVar, C1177i c1177i) {
        ArrayDeque arrayDeque;
        synchronized (this.f16531e) {
            try {
                String str = vVar.f16516c;
                if (this.f16531e.containsKey(str)) {
                    arrayDeque = (ArrayDeque) this.f16531e.get(str);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.f16531e.put(str, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(c1177i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str) {
        String a5 = this.f16530d.a();
        C0693o c0693o = this.f16529c;
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        b(c0693o.g(c0693o.n(a5, "/topics/" + str, bundle)));
    }

    public final void d(String str) {
        String a5 = this.f16530d.a();
        C0693o c0693o = this.f16529c;
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        b(c0693o.g(c0693o.n(a5, "/topics/" + str, bundle)));
    }

    public final void f(v vVar) {
        synchronized (this.f16531e) {
            try {
                String str = vVar.f16516c;
                if (!this.f16531e.containsKey(str)) {
                    return;
                }
                ArrayDeque arrayDeque = (ArrayDeque) this.f16531e.get(str);
                C1177i c1177i = (C1177i) arrayDeque.poll();
                if (c1177i != null) {
                    c1177i.b(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.f16531e.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void g(boolean z9) {
        this.f16533g = z9;
    }

    public final void h() {
        boolean z9;
        if (this.f16534h.a() != null) {
            synchronized (this) {
                z9 = this.f16533g;
            }
            if (!z9) {
                j(0L);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d A[Catch: IOException -> 0x0040, TryCatch #1 {IOException -> 0x0040, blocks: (B:8:0x0027, B:17:0x0056, B:19:0x005c, B:23:0x0071, B:25:0x007a, B:28:0x008d, B:30:0x0096, B:33:0x0036, B:36:0x0043), top: B:7:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i() {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.y.i():boolean");
    }

    public final void j(long j4) {
        long min = Math.min(Math.max(30L, 2 * j4), f16526i);
        this.f16532f.schedule(new A(this, this.f16527a, this.f16528b, min), j4, TimeUnit.SECONDS);
        g(true);
    }
}
