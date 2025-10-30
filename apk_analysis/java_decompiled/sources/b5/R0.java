package b5;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.C0952k0;
import java.util.ArrayDeque;
import java.util.Objects;
import l6.C1574f;
import p6.C1862c;
import p6.InterfaceC1861b;
import q6.AbstractC1916a;

/* loaded from: classes.dex */
public final class R0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10926a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10927b;

    public R0(S0 s02) {
        this.f10926a = 0;
        this.f10927b = s02;
    }

    public void a(Intent intent) {
        boolean equals;
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f10927b;
                    if (!arrayDeque.contains(string)) {
                        arrayDeque.add(string);
                    } else {
                        return;
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e8) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e8);
        }
        if (bundle == null) {
            equals = false;
        } else {
            equals = "1".equals(bundle.getString("google.c.a.e"));
        }
        if (equals) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    InterfaceC1861b interfaceC1861b = (InterfaceC1861b) C1574f.c().b(InterfaceC1861b.class);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    if (interfaceC1861b != null) {
                        String string2 = bundle.getString("google.c.a.c_id");
                        C1862c c1862c = (C1862c) interfaceC1861b;
                        if (AbstractC1916a.c("fcm") && AbstractC1916a.d("fcm", "_ln")) {
                            C0952k0 c0952k0 = (C0952k0) c1862c.f22197a.f22734a;
                            c0952k0.getClass();
                            c0952k0.b(new com.google.android.gms.internal.measurement.X(c0952k0, string2, 0));
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("source", "Firebase");
                        bundle2.putString("medium", "notification");
                        bundle2.putString("campaign", string2);
                        c1862c.a("fcm", "_cmp", bundle2);
                    } else {
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            v4.e.J("_no", bundle);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[Catch: all -> 0x0028, RuntimeException -> 0x002b, TryCatch #1 {RuntimeException -> 0x002b, blocks: (B:3:0x0009, B:5:0x0019, B:7:0x001f, B:12:0x0049, B:15:0x0050, B:17:0x0063, B:19:0x006b, B:24:0x007b, B:28:0x0088, B:35:0x002e, B:37:0x0035, B:39:0x0041), top: B:2:0x0009, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(com.google.android.gms.internal.measurement.W r9, android.os.Bundle r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f10927b
            b5.S0 r0 = (b5.S0) r0
            java.lang.Object r0 = r0.f1707a
            r1 = r0
            b5.n0 r1 = (b5.C0650n0) r1
            b5.V r0 = r1.f11229i     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            b5.C0650n0.f(r0)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            b5.T r0 = r0.f10978n     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            java.lang.String r2 = "onActivityCreated"
            r0.b(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            android.content.Intent r0 = r9.f15324c     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r0 == 0) goto L97
            android.net.Uri r2 = r0.getData()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r2 == 0) goto L2e
            boolean r3 = r2.isHierarchical()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r3 != 0) goto L26
            goto L2e
        L26:
            r5 = r2
            goto L47
        L28:
            r0 = move-exception
            goto Lb5
        L2b:
            r0 = move-exception
            goto La0
        L2e:
            android.os.Bundle r2 = r0.getExtras()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            r3 = 0
            if (r2 == 0) goto L46
            java.lang.String r4 = "com.android.vending.referral_url"
            java.lang.String r2 = r2.getString(r4)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r4 != 0) goto L46
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            goto L26
        L46:
            r5 = r3
        L47:
            if (r5 == 0) goto L97
            boolean r2 = r5.isHierarchical()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r2 != 0) goto L50
            goto L97
        L50:
            b5.P1 r2 = r1.f11231l     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            b5.C0650n0.d(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            java.lang.String r2 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r0 = r0.getStringExtra(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            java.lang.String r2 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r2 != 0) goto L78
            java.lang.String r2 = "https://www.google.com"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r2 != 0) goto L78
            java.lang.String r2 = "android-app://com.google.appcrawler"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r0 == 0) goto L74
            goto L78
        L74:
            java.lang.String r0 = "auto"
        L76:
            r6 = r0
            goto L7b
        L78:
            java.lang.String r0 = "gs"
            goto L76
        L7b:
            java.lang.String r0 = "referrer"
            java.lang.String r7 = r5.getQueryParameter(r0)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r10 != 0) goto L86
            r0 = 1
        L84:
            r4 = r0
            goto L88
        L86:
            r0 = 0
            goto L84
        L88:
            b5.m0 r0 = r1.j     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            b5.C0650n0.f(r0)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            b5.P0 r2 = new b5.P0     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            r0.v0(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            goto Lac
        L97:
            b5.d1 r0 = r1.f11234o
            b5.C0650n0.e(r0)
            r0.u0(r9, r10)
            return
        La0:
            b5.V r2 = r1.f11229i     // Catch: java.lang.Throwable -> L28
            b5.C0650n0.f(r2)     // Catch: java.lang.Throwable -> L28
            b5.T r2 = r2.f10971f     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "Throwable caught in onActivityCreated"
            r2.c(r0, r3)     // Catch: java.lang.Throwable -> L28
        Lac:
            b5.d1 r0 = r1.f11234o
            b5.C0650n0.e(r0)
            r0.u0(r9, r10)
            return
        Lb5:
            b5.d1 r1 = r1.f11234o
            b5.C0650n0.e(r1)
            r1.u0(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.R0.j(com.google.android.gms.internal.measurement.W, android.os.Bundle):void");
    }

    public void k(com.google.android.gms.internal.measurement.W w7) {
        C0621d1 c0621d1 = ((C0650n0) ((S0) this.f10927b).f1707a).f11234o;
        C0650n0.e(c0621d1);
        synchronized (c0621d1.f11072l) {
            try {
                if (Objects.equals(c0621d1.f11068g, w7)) {
                    c0621d1.f11068g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!((C0650n0) c0621d1.f1707a).f11227g.z0()) {
            return;
        }
        c0621d1.f11067f.remove(Integer.valueOf(w7.f15322a));
    }

    public void l(com.google.android.gms.internal.measurement.W w7) {
        C0650n0 c0650n0 = (C0650n0) ((S0) this.f10927b).f1707a;
        C0621d1 c0621d1 = c0650n0.f11234o;
        C0650n0.e(c0621d1);
        synchronized (c0621d1.f11072l) {
            c0621d1.f11071k = false;
            c0621d1.f11069h = true;
        }
        C0650n0 c0650n02 = (C0650n0) c0621d1.f1707a;
        c0650n02.f11233n.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!c0650n02.f11227g.z0()) {
            c0621d1.f11064c = null;
            C0647m0 c0647m0 = c0650n02.j;
            C0650n0.f(c0647m0);
            c0647m0.v0(new RunnableC0669v(c0621d1, elapsedRealtime, 1));
        } else {
            C0612a1 v02 = c0621d1.v0(w7);
            c0621d1.f11065d = c0621d1.f11064c;
            c0621d1.f11064c = null;
            C0647m0 c0647m02 = c0650n02.j;
            C0650n0.f(c0647m02);
            c0647m02.v0(new J0(c0621d1, v02, elapsedRealtime));
        }
        t1 t1Var = c0650n0.f11230k;
        C0650n0.e(t1Var);
        C0650n0 c0650n03 = (C0650n0) t1Var.f1707a;
        c0650n03.f11233n.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        C0647m0 c0647m03 = c0650n03.j;
        C0650n0.f(c0647m03);
        c0647m03.v0(new RunnableC0660q1(t1Var, elapsedRealtime2, 1));
    }

    public void m(com.google.android.gms.internal.measurement.W w7) {
        C0650n0 c0650n0 = (C0650n0) ((S0) this.f10927b).f1707a;
        t1 t1Var = c0650n0.f11230k;
        C0650n0.e(t1Var);
        C0650n0 c0650n02 = (C0650n0) t1Var.f1707a;
        c0650n02.f11233n.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C0647m0 c0647m0 = c0650n02.j;
        C0650n0.f(c0647m0);
        c0647m0.v0(new RunnableC0660q1(t1Var, elapsedRealtime, 0));
        C0621d1 c0621d1 = c0650n0.f11234o;
        C0650n0.e(c0621d1);
        Object obj = c0621d1.f11072l;
        synchronized (obj) {
            c0621d1.f11071k = true;
            if (!Objects.equals(w7, c0621d1.f11068g)) {
                synchronized (obj) {
                    c0621d1.f11068g = w7;
                    c0621d1.f11069h = false;
                    C0650n0 c0650n03 = (C0650n0) c0621d1.f1707a;
                    if (c0650n03.f11227g.z0()) {
                        c0621d1.f11070i = null;
                        C0647m0 c0647m02 = c0650n03.j;
                        C0650n0.f(c0647m02);
                        c0647m02.v0(new RunnableC0618c1(c0621d1, 1));
                    }
                }
            }
        }
        C0650n0 c0650n04 = (C0650n0) c0621d1.f1707a;
        if (!c0650n04.f11227g.z0()) {
            c0621d1.f11064c = c0621d1.f11070i;
            C0647m0 c0647m03 = c0650n04.j;
            C0650n0.f(c0647m03);
            c0647m03.v0(new RunnableC0618c1(c0621d1, 0));
            return;
        }
        c0621d1.p0(w7.f15323b, c0621d1.v0(w7), false);
        C0677z c0677z = ((C0650n0) c0621d1.f1707a).f11236q;
        C0650n0.c(c0677z);
        C0650n0 c0650n05 = (C0650n0) c0677z.f1707a;
        c0650n05.f11233n.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        C0647m0 c0647m04 = c0650n05.j;
        C0650n0.f(c0647m04);
        c0647m04.v0(new RunnableC0669v(c0677z, elapsedRealtime2, 0));
    }

    public void n(com.google.android.gms.internal.measurement.W w7, Bundle bundle) {
        C0612a1 c0612a1;
        C0621d1 c0621d1 = ((C0650n0) ((S0) this.f10927b).f1707a).f11234o;
        C0650n0.e(c0621d1);
        if (((C0650n0) c0621d1.f1707a).f11227g.z0() && bundle != null && (c0612a1 = (C0612a1) c0621d1.f11067f.get(Integer.valueOf(w7.f15322a))) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", c0612a1.f11021c);
            bundle2.putString("name", c0612a1.f11019a);
            bundle2.putString("referrer_name", c0612a1.f11020b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f10926a) {
            case 0:
                j(com.google.android.gms.internal.measurement.W.f(activity), bundle);
                return;
            default:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    if (Build.VERSION.SDK_INT <= 25) {
                        new Handler(Looper.getMainLooper()).post(new A6.r(this, 9, intent));
                        return;
                    } else {
                        a(intent);
                        return;
                    }
                }
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f10926a) {
            case 0:
                k(com.google.android.gms.internal.measurement.W.f(activity));
                return;
            default:
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f10926a) {
            case 0:
                l(com.google.android.gms.internal.measurement.W.f(activity));
                return;
            default:
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f10926a) {
            case 0:
                m(com.google.android.gms.internal.measurement.W.f(activity));
                return;
            default:
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.f10926a) {
            case 0:
                n(com.google.android.gms.internal.measurement.W.f(activity), bundle);
                return;
            default:
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i9 = this.f10926a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i9 = this.f10926a;
    }

    public R0() {
        this.f10926a = 1;
        this.f10927b = new ArrayDeque(10);
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    private final void d(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void i(Activity activity) {
    }

    private final void e(Activity activity, Bundle bundle) {
    }
}
