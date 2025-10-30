package com.google.firebase.messaging;

import B6.u0;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import b5.J0;
import b5.R0;
import b6.C0693o;
import c7.C0784d;
import f5.AbstractC1176h;
import f5.C1185q;
import f5.InterfaceC1173e;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l6.C1574f;
import p6.InterfaceC1861b;
import s.C1935e;

/* loaded from: classes.dex */
public class FirebaseMessaging {

    /* renamed from: l, reason: collision with root package name */
    public static u f16440l;

    /* renamed from: n, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f16442n;

    /* renamed from: a, reason: collision with root package name */
    public final C1574f f16443a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f16444b;

    /* renamed from: c, reason: collision with root package name */
    public final C0693o f16445c;

    /* renamed from: d, reason: collision with root package name */
    public final j f16446d;

    /* renamed from: e, reason: collision with root package name */
    public final A6.t f16447e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f16448f;

    /* renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f16449g;

    /* renamed from: h, reason: collision with root package name */
    public final C1185q f16450h;

    /* renamed from: i, reason: collision with root package name */
    public final n f16451i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f16439k = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: m, reason: collision with root package name */
    public static S6.b f16441m = new c7.l(1);

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, com.google.firebase.messaging.n] */
    /* JADX WARN: Type inference failed for: r6v0, types: [b6.o, java.lang.Object] */
    public FirebaseMessaging(C1574f c1574f, S6.b bVar, S6.b bVar2, T6.e eVar, S6.b bVar3, P6.c cVar) {
        final int i9 = 1;
        final int i10 = 0;
        c1574f.a();
        Context context = c1574f.f20587a;
        final ?? obj = new Object();
        obj.f16489b = 0;
        obj.f16490c = context;
        c1574f.a();
        A4.b bVar4 = new A4.b(c1574f.f20587a);
        final ?? obj2 = new Object();
        obj2.f11382a = c1574f;
        obj2.f11383b = obj;
        obj2.f11384c = bVar4;
        obj2.f11385d = bVar;
        obj2.f11386e = bVar2;
        obj2.f11387f = eVar;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new L4.a("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new L4.a("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new L4.a("Firebase-Messaging-File-Io"));
        this.j = false;
        f16441m = bVar3;
        this.f16443a = c1574f;
        this.f16447e = new A6.t(this, cVar);
        c1574f.a();
        final Context context2 = c1574f.f20587a;
        this.f16444b = context2;
        R0 r0 = new R0();
        this.f16451i = obj;
        this.f16445c = obj2;
        this.f16446d = new j(newSingleThreadExecutor);
        this.f16448f = scheduledThreadPoolExecutor;
        this.f16449g = threadPoolExecutor;
        c1574f.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(r0);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f16482b;

            {
                this.f16482b = this;
            }

            private final void a() {
                FirebaseMessaging firebaseMessaging = this.f16482b;
                if (firebaseMessaging.f16447e.i() && firebaseMessaging.i(firebaseMessaging.d())) {
                    synchronized (firebaseMessaging) {
                        if (!firebaseMessaging.j) {
                            firebaseMessaging.h(0L);
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1185q o9;
                int i11;
                switch (i10) {
                    case 0:
                        a();
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging = this.f16482b;
                        final Context context3 = firebaseMessaging.f16444b;
                        u0.B(context3);
                        final boolean g9 = firebaseMessaging.g();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences r5 = M4.a.r(context3);
                            if (!r5.contains("proxy_retention") || r5.getBoolean("proxy_retention", false) != g9) {
                                A4.b bVar5 = (A4.b) firebaseMessaging.f16445c.f11384c;
                                if (bVar5.f336c.J() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", g9);
                                    A4.q b9 = A4.q.b(bVar5.f335b);
                                    synchronized (b9) {
                                        i11 = b9.f378a;
                                        b9.f378a = i11 + 1;
                                    }
                                    o9 = b9.c(new A4.o(i11, 4, bundle, 0));
                                } else {
                                    o9 = s8.n.o(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                o9.d(new C0.e(0), new InterfaceC1173e() { // from class: com.google.firebase.messaging.q
                                    @Override // f5.InterfaceC1173e
                                    public final void o(Object obj3) {
                                        SharedPreferences.Editor edit = M4.a.r(context3).edit();
                                        edit.putBoolean("proxy_retention", g9);
                                        edit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging.g()) {
                            firebaseMessaging.e();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new L4.a("Firebase-Messaging-Topics-Io"));
        int i11 = y.j;
        C1185q e8 = s8.n.e(scheduledThreadPoolExecutor2, new Callable() { // from class: com.google.firebase.messaging.x
            @Override // java.util.concurrent.Callable
            public final Object call() {
                w wVar;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                n nVar = obj;
                C0693o c0693o = obj2;
                synchronized (w.class) {
                    try {
                        WeakReference weakReference = w.f16517d;
                        if (weakReference != null) {
                            wVar = (w) weakReference.get();
                        } else {
                            wVar = null;
                        }
                        if (wVar == null) {
                            w wVar2 = new w(context3.getSharedPreferences("com.google.android.gms.appid", 0), scheduledThreadPoolExecutor3);
                            wVar2.b();
                            w.f16517d = new WeakReference(wVar2);
                            wVar = wVar2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new y(firebaseMessaging, nVar, wVar, c0693o, context3, scheduledThreadPoolExecutor3);
            }
        });
        this.f16450h = e8;
        e8.d(scheduledThreadPoolExecutor, new l(this, i10));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f16482b;

            {
                this.f16482b = this;
            }

            private final void a() {
                FirebaseMessaging firebaseMessaging = this.f16482b;
                if (firebaseMessaging.f16447e.i() && firebaseMessaging.i(firebaseMessaging.d())) {
                    synchronized (firebaseMessaging) {
                        if (!firebaseMessaging.j) {
                            firebaseMessaging.h(0L);
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1185q o9;
                int i112;
                switch (i9) {
                    case 0:
                        a();
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging = this.f16482b;
                        final Context context3 = firebaseMessaging.f16444b;
                        u0.B(context3);
                        final boolean g9 = firebaseMessaging.g();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences r5 = M4.a.r(context3);
                            if (!r5.contains("proxy_retention") || r5.getBoolean("proxy_retention", false) != g9) {
                                A4.b bVar5 = (A4.b) firebaseMessaging.f16445c.f11384c;
                                if (bVar5.f336c.J() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", g9);
                                    A4.q b9 = A4.q.b(bVar5.f335b);
                                    synchronized (b9) {
                                        i112 = b9.f378a;
                                        b9.f378a = i112 + 1;
                                    }
                                    o9 = b9.c(new A4.o(i112, 4, bundle, 0));
                                } else {
                                    o9 = s8.n.o(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                o9.d(new C0.e(0), new InterfaceC1173e() { // from class: com.google.firebase.messaging.q
                                    @Override // f5.InterfaceC1173e
                                    public final void o(Object obj3) {
                                        SharedPreferences.Editor edit = M4.a.r(context3).edit();
                                        edit.putBoolean("proxy_retention", g9);
                                        edit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging.g()) {
                            firebaseMessaging.e();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f16442n == null) {
                    f16442n = new ScheduledThreadPoolExecutor(1, new L4.a("TAG"));
                }
                f16442n.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized u c(Context context) {
        u uVar;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f16440l == null) {
                    f16440l = new u(context);
                }
                uVar = f16440l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return uVar;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(C1574f c1574f) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) c1574f.b(FirebaseMessaging.class);
            F4.y.i(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        AbstractC1176h abstractC1176h;
        t d9 = d();
        if (!i(d9)) {
            return d9.f16509a;
        }
        String c3 = n.c(this.f16443a);
        j jVar = this.f16446d;
        synchronized (jVar) {
            abstractC1176h = (AbstractC1176h) ((C1935e) jVar.f16480b).get(c3);
            if (abstractC1176h != null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Joining ongoing request for: " + c3);
                }
            } else {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + c3);
                }
                C0693o c0693o = this.f16445c;
                abstractC1176h = c0693o.g(c0693o.n(n.c((C1574f) c0693o.f11382a), "*", new Bundle())).m(this.f16449g, new C0784d(this, c3, d9, 1)).e((ExecutorService) jVar.f16479a, new N1.h(jVar, 6, c3));
                ((C1935e) jVar.f16480b).put(c3, abstractC1176h);
            }
        }
        try {
            return (String) s8.n.b(abstractC1176h);
        } catch (InterruptedException | ExecutionException e8) {
            throw new IOException(e8);
        }
    }

    public final t d() {
        String d9;
        t b9;
        u c3 = c(this.f16444b);
        C1574f c1574f = this.f16443a;
        c1574f.a();
        if ("[DEFAULT]".equals(c1574f.f20588b)) {
            d9 = "";
        } else {
            d9 = c1574f.d();
        }
        String c9 = n.c(this.f16443a);
        synchronized (c3) {
            b9 = t.b(((SharedPreferences) c3.f16512a).getString(d9 + "|T|" + c9 + "|*", null));
        }
        return b9;
    }

    public final void e() {
        C1185q o9;
        int i9;
        A4.b bVar = (A4.b) this.f16445c.f11384c;
        if (bVar.f336c.J() >= 241100000) {
            A4.q b9 = A4.q.b(bVar.f335b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (b9) {
                i9 = b9.f378a;
                b9.f378a = i9 + 1;
            }
            o9 = b9.c(new A4.o(i9, 5, bundle, 1)).l(A4.i.f351c, A4.d.f343c);
        } else {
            o9 = s8.n.o(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        o9.d(this.f16448f, new l(this, 1));
    }

    public final synchronized void f(boolean z9) {
        this.j = z9;
    }

    public final boolean g() {
        boolean z9;
        boolean z10;
        String notificationDelegate;
        Context context = this.f16444b;
        u0.B(context);
        if (Build.VERSION.SDK_INT >= 29) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
                return false;
            }
        } else {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                notificationDelegate = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate();
                if ("com.google.android.gms".equals(notificationDelegate)) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "GMS core is set for proxying");
                    }
                    if (this.f16443a.b(InterfaceC1861b.class) != null || (v4.e.l() && f16441m != null)) {
                        return true;
                    }
                }
            } else {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
        }
        return false;
    }

    public final synchronized void h(long j) {
        b(new J0(this, Math.min(Math.max(30L, 2 * j), f16439k)), j);
        this.j = true;
    }

    public final boolean i(t tVar) {
        if (tVar != null) {
            String a5 = this.f16451i.a();
            if (System.currentTimeMillis() <= tVar.f16511c + t.f16508d && a5.equals(tVar.f16510b)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
