package com.google.android.gms.measurement.internal;

import F4.y;
import N4.a;
import N4.b;
import O0.c;
import Q2.RunnableC0359b;
import S5.o;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import b5.A1;
import b5.C0612a1;
import b5.C0621d1;
import b5.C0628g;
import b5.C0647m0;
import b5.C0650n0;
import b5.C0663s;
import b5.C0665t;
import b5.C0677z;
import b5.C1;
import b5.D;
import b5.D0;
import b5.E;
import b5.E0;
import b5.H0;
import b5.I0;
import b5.J0;
import b5.L1;
import b5.N0;
import b5.P0;
import b5.P1;
import b5.R0;
import b5.RunnableC0659q0;
import b5.RunnableC0666t0;
import b5.S0;
import b5.T;
import b5.V;
import b5.W0;
import b5.Y;
import b5.Y0;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.I;
import com.google.android.gms.internal.measurement.L;
import com.google.android.gms.internal.measurement.O;
import com.google.android.gms.internal.measurement.Q;
import com.google.android.gms.internal.measurement.U;
import com.google.android.gms.internal.measurement.W;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import s.C1935e;
import s.C1939i;
import z2.C2235a;

@DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends I {

    /* renamed from: e, reason: collision with root package name */
    public C0650n0 f15719e;

    /* renamed from: f, reason: collision with root package name */
    public final C1935e f15720f;

    public static void $r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc(AppMeasurementDynamiteService appMeasurementDynamiteService, O o9) {
        try {
            o9.c();
        } catch (RemoteException e8) {
            C0650n0 c0650n0 = appMeasurementDynamiteService.f15719e;
            y.h(c0650n0);
            V v8 = c0650n0.f11229i;
            C0650n0.f(v8);
            v8.f10974i.c(e8, "Failed to call IDynamiteUploadBatchesCallback");
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [s.e, s.i] */
    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.f15719e = null;
        this.f15720f = new C1939i(0);
    }

    public final void Q(String str, L l9) {
        g();
        P1 p12 = this.f15719e.f11231l;
        C0650n0.d(p12);
        p12.N0(str, l9);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void beginAdUnitExposure(String str, long j) {
        g();
        C0677z c0677z = this.f15719e.f11236q;
        C0650n0.c(c0677z);
        c0677z.m0(j, str);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        g();
        S0 s02 = this.f15719e.f11235p;
        C0650n0.e(s02);
        s02.r0(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void clearMeasurementEnabled(long j) {
        g();
        S0 s02 = this.f15719e.f11235p;
        C0650n0.e(s02);
        s02.m0();
        C0647m0 c0647m0 = ((C0650n0) s02.f1707a).j;
        C0650n0.f(c0647m0);
        c0647m0.v0(new o(s02, null, 22, false));
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void endAdUnitExposure(String str, long j) {
        g();
        C0677z c0677z = this.f15719e.f11236q;
        C0650n0.c(c0677z);
        c0677z.n0(j, str);
    }

    public final void g() {
        if (this.f15719e != null) {
        } else {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void generateEventId(L l9) {
        g();
        P1 p12 = this.f15719e.f11231l;
        C0650n0.d(p12);
        long w12 = p12.w1();
        g();
        P1 p13 = this.f15719e.f11231l;
        C0650n0.d(p13);
        p13.M0(l9, w12);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void getAppInstanceId(L l9) {
        g();
        C0647m0 c0647m0 = this.f15719e.j;
        C0650n0.f(c0647m0);
        c0647m0.v0(new RunnableC0666t0(this, l9, 0));
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void getCachedAppInstanceId(L l9) {
        g();
        S0 s02 = this.f15719e.f11235p;
        C0650n0.e(s02);
        Q((String) s02.f10947g.get(), l9);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void getConditionalUserProperties(String str, String str2, L l9) {
        g();
        C0647m0 c0647m0 = this.f15719e.j;
        C0650n0.f(c0647m0);
        c0647m0.v0(new RunnableC0659q0(this, l9, str, str2, 6));
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void getCurrentScreenClass(L l9) {
        String str;
        g();
        S0 s02 = this.f15719e.f11235p;
        C0650n0.e(s02);
        C0621d1 c0621d1 = ((C0650n0) s02.f1707a).f11234o;
        C0650n0.e(c0621d1);
        C0612a1 c0612a1 = c0621d1.f11064c;
        if (c0612a1 != null) {
            str = c0612a1.f11020b;
        } else {
            str = null;
        }
        Q(str, l9);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void getCurrentScreenName(L l9) {
        String str;
        g();
        S0 s02 = this.f15719e.f11235p;
        C0650n0.e(s02);
        C0621d1 c0621d1 = ((C0650n0) s02.f1707a).f11234o;
        C0650n0.e(c0621d1);
        C0612a1 c0612a1 = c0621d1.f11064c;
        if (c0612a1 != null) {
            str = c0612a1.f11019a;
        } else {
            str = null;
        }
        Q(str, l9);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void getGmpAppId(L l9) {
        g();
        S0 s02 = this.f15719e.f11235p;
        C0650n0.e(s02);
        C0650n0 c0650n0 = (C0650n0) s02.f1707a;
        String str = null;
        if (!c0650n0.f11227g.y0(null, E.f10684q1) && c0650n0.n() != null) {
            str = c0650n0.n();
        } else {
            try {
                str = D0.g(c0650n0.f11221a, c0650n0.f11238s);
            } catch (IllegalStateException e8) {
                V v8 = c0650n0.f11229i;
                C0650n0.f(v8);
                v8.f10971f.c(e8, "getGoogleAppId failed with exception");
            }
        }
        Q(str, l9);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void getMaxUserProperties(String str, L l9) {
        g();
        S0 s02 = this.f15719e.f11235p;
        C0650n0.e(s02);
        y.e(str);
        ((C0650n0) s02.f1707a).getClass();
        g();
        P1 p12 = this.f15719e.f11231l;
        C0650n0.d(p12);
        p12.L0(l9, 25);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void getSessionId(L l9) {
        g();
        S0 s02 = this.f15719e.f11235p;
        C0650n0.e(s02);
        C0647m0 c0647m0 = ((C0650n0) s02.f1707a).j;
        C0650n0.f(c0647m0);
        c0647m0.v0(new o(s02, l9, 21, false));
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void getTestFlag(L l9, int i9) {
        g();
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            return;
                        }
                        P1 p12 = this.f15719e.f11231l;
                        C0650n0.d(p12);
                        S0 s02 = this.f15719e.f11235p;
                        C0650n0.e(s02);
                        AtomicReference atomicReference = new AtomicReference();
                        C0647m0 c0647m0 = ((C0650n0) s02.f1707a).j;
                        C0650n0.f(c0647m0);
                        p12.H0(l9, ((Boolean) c0647m0.q0(atomicReference, 15000L, "boolean test flag value", new H0(s02, atomicReference, 2))).booleanValue());
                        return;
                    }
                    P1 p13 = this.f15719e.f11231l;
                    C0650n0.d(p13);
                    S0 s03 = this.f15719e.f11235p;
                    C0650n0.e(s03);
                    AtomicReference atomicReference2 = new AtomicReference();
                    C0647m0 c0647m02 = ((C0650n0) s03.f1707a).j;
                    C0650n0.f(c0647m02);
                    p13.L0(l9, ((Integer) c0647m02.q0(atomicReference2, 15000L, "int test flag value", new H0(s03, atomicReference2, 5))).intValue());
                    return;
                }
                P1 p14 = this.f15719e.f11231l;
                C0650n0.d(p14);
                S0 s04 = this.f15719e.f11235p;
                C0650n0.e(s04);
                AtomicReference atomicReference3 = new AtomicReference();
                C0647m0 c0647m03 = ((C0650n0) s04.f1707a).j;
                C0650n0.f(c0647m03);
                double doubleValue = ((Double) c0647m03.q0(atomicReference3, 15000L, "double test flag value", new H0(s04, atomicReference3, 6))).doubleValue();
                Bundle bundle = new Bundle();
                bundle.putDouble("r", doubleValue);
                try {
                    l9.v0(bundle);
                    return;
                } catch (RemoteException e8) {
                    V v8 = ((C0650n0) p14.f1707a).f11229i;
                    C0650n0.f(v8);
                    v8.f10974i.c(e8, "Error returning double value to wrapper");
                    return;
                }
            }
            P1 p15 = this.f15719e.f11231l;
            C0650n0.d(p15);
            S0 s05 = this.f15719e.f11235p;
            C0650n0.e(s05);
            AtomicReference atomicReference4 = new AtomicReference();
            C0647m0 c0647m04 = ((C0650n0) s05.f1707a).j;
            C0650n0.f(c0647m04);
            p15.M0(l9, ((Long) c0647m04.q0(atomicReference4, 15000L, "long test flag value", new H0(s05, atomicReference4, 4))).longValue());
            return;
        }
        P1 p16 = this.f15719e.f11231l;
        C0650n0.d(p16);
        S0 s06 = this.f15719e.f11235p;
        C0650n0.e(s06);
        AtomicReference atomicReference5 = new AtomicReference();
        C0647m0 c0647m05 = ((C0650n0) s06.f1707a).j;
        C0650n0.f(c0647m05);
        p16.N0((String) c0647m05.q0(atomicReference5, 15000L, "String test flag value", new H0(s06, atomicReference5, 3)), l9);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void getUserProperties(String str, String str2, boolean z9, L l9) {
        g();
        C0647m0 c0647m0 = this.f15719e.j;
        C0650n0.f(c0647m0);
        c0647m0.v0(new P0(this, l9, str, str2, z9, 0));
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void initForTests(Map map) {
        g();
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void initialize(a aVar, U u9, long j) {
        C0650n0 c0650n0 = this.f15719e;
        if (c0650n0 == null) {
            Context context = (Context) b.i1(aVar);
            y.h(context);
            this.f15719e = C0650n0.l(context, u9, Long.valueOf(j));
        } else {
            V v8 = c0650n0.f11229i;
            C0650n0.f(v8);
            v8.f10974i.b("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void isDataCollectionEnabled(L l9) {
        g();
        C0647m0 c0647m0 = this.f15719e.j;
        C0650n0.f(c0647m0);
        c0647m0.v0(new RunnableC0666t0(this, l9, 1));
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void logEvent(String str, String str2, Bundle bundle, boolean z9, boolean z10, long j) {
        g();
        S0 s02 = this.f15719e.f11235p;
        C0650n0.e(s02);
        s02.v0(str, str2, bundle, z9, z10, j);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void logEventAndBundle(String str, String str2, Bundle bundle, L l9, long j) {
        Bundle bundle2;
        g();
        y.e(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        C0665t c0665t = new C0665t(str2, new C0663s(bundle), "app", j);
        C0647m0 c0647m0 = this.f15719e.j;
        C0650n0.f(c0647m0);
        c0647m0.v0(new RunnableC0659q0(this, l9, c0665t, str));
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void logHealthData(int i9, String str, a aVar, a aVar2, a aVar3) {
        Object i12;
        Object i13;
        g();
        Object obj = null;
        if (aVar == null) {
            i12 = null;
        } else {
            i12 = b.i1(aVar);
        }
        if (aVar2 == null) {
            i13 = null;
        } else {
            i13 = b.i1(aVar2);
        }
        if (aVar3 != null) {
            obj = b.i1(aVar3);
        }
        Object obj2 = obj;
        V v8 = this.f15719e.f11229i;
        C0650n0.f(v8);
        v8.x0(i9, true, false, str, i12, i13, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityCreated(a aVar, Bundle bundle, long j) {
        g();
        Activity activity = (Activity) b.i1(aVar);
        y.h(activity);
        onActivityCreatedByScionActivityInfo(W.f(activity), bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityCreatedByScionActivityInfo(W w7, Bundle bundle, long j) {
        g();
        S0 s02 = this.f15719e.f11235p;
        C0650n0.e(s02);
        R0 r0 = s02.f10943c;
        if (r0 != null) {
            S0 s03 = this.f15719e.f11235p;
            C0650n0.e(s03);
            s03.s0();
            r0.j(w7, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityDestroyed(a aVar, long j) {
        g();
        Activity activity = (Activity) b.i1(aVar);
        y.h(activity);
        onActivityDestroyedByScionActivityInfo(W.f(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityDestroyedByScionActivityInfo(W w7, long j) {
        g();
        S0 s02 = this.f15719e.f11235p;
        C0650n0.e(s02);
        R0 r0 = s02.f10943c;
        if (r0 != null) {
            S0 s03 = this.f15719e.f11235p;
            C0650n0.e(s03);
            s03.s0();
            r0.k(w7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityPaused(a aVar, long j) {
        g();
        Activity activity = (Activity) b.i1(aVar);
        y.h(activity);
        onActivityPausedByScionActivityInfo(W.f(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityPausedByScionActivityInfo(W w7, long j) {
        g();
        S0 s02 = this.f15719e.f11235p;
        C0650n0.e(s02);
        R0 r0 = s02.f10943c;
        if (r0 != null) {
            S0 s03 = this.f15719e.f11235p;
            C0650n0.e(s03);
            s03.s0();
            r0.l(w7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityResumed(a aVar, long j) {
        g();
        Activity activity = (Activity) b.i1(aVar);
        y.h(activity);
        onActivityResumedByScionActivityInfo(W.f(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityResumedByScionActivityInfo(W w7, long j) {
        g();
        S0 s02 = this.f15719e.f11235p;
        C0650n0.e(s02);
        R0 r0 = s02.f10943c;
        if (r0 != null) {
            S0 s03 = this.f15719e.f11235p;
            C0650n0.e(s03);
            s03.s0();
            r0.m(w7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void onActivitySaveInstanceState(a aVar, L l9, long j) {
        g();
        Activity activity = (Activity) b.i1(aVar);
        y.h(activity);
        onActivitySaveInstanceStateByScionActivityInfo(W.f(activity), l9, j);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void onActivitySaveInstanceStateByScionActivityInfo(W w7, L l9, long j) {
        g();
        S0 s02 = this.f15719e.f11235p;
        C0650n0.e(s02);
        R0 r0 = s02.f10943c;
        Bundle bundle = new Bundle();
        if (r0 != null) {
            S0 s03 = this.f15719e.f11235p;
            C0650n0.e(s03);
            s03.s0();
            r0.n(w7, bundle);
        }
        try {
            l9.v0(bundle);
        } catch (RemoteException e8) {
            V v8 = this.f15719e.f11229i;
            C0650n0.f(v8);
            v8.f10974i.c(e8, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityStarted(a aVar, long j) {
        g();
        Activity activity = (Activity) b.i1(aVar);
        y.h(activity);
        onActivityStartedByScionActivityInfo(W.f(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityStartedByScionActivityInfo(W w7, long j) {
        g();
        S0 s02 = this.f15719e.f11235p;
        C0650n0.e(s02);
        if (s02.f10943c != null) {
            S0 s03 = this.f15719e.f11235p;
            C0650n0.e(s03);
            s03.s0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityStopped(a aVar, long j) {
        g();
        Activity activity = (Activity) b.i1(aVar);
        y.h(activity);
        onActivityStoppedByScionActivityInfo(W.f(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void onActivityStoppedByScionActivityInfo(W w7, long j) {
        g();
        S0 s02 = this.f15719e.f11235p;
        C0650n0.e(s02);
        if (s02.f10943c != null) {
            S0 s03 = this.f15719e.f11235p;
            C0650n0.e(s03);
            s03.s0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void performAction(Bundle bundle, L l9, long j) {
        g();
        l9.v0(null);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void registerOnMeasurementEventListener(Q q9) {
        Object obj;
        g();
        C1935e c1935e = this.f15720f;
        synchronized (c1935e) {
            try {
                obj = (E0) c1935e.get(Integer.valueOf(q9.c()));
                if (obj == null) {
                    obj = new L1(this, q9);
                    c1935e.put(Integer.valueOf(q9.c()), obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        S0 s02 = this.f15719e.f11235p;
        C0650n0.e(s02);
        s02.m0();
        if (!s02.f10945e.add(obj)) {
            V v8 = ((C0650n0) s02.f1707a).f11229i;
            C0650n0.f(v8);
            v8.f10974i.b("OnEventListener already registered");
        }
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void resetAnalyticsData(long j) {
        g();
        S0 s02 = this.f15719e.f11235p;
        C0650n0.e(s02);
        s02.f10947g.set(null);
        C0647m0 c0647m0 = ((C0650n0) s02.f1707a).j;
        C0650n0.f(c0647m0);
        c0647m0.v0(new N0(s02, j, 1));
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void retrieveAndUploadBatches(O o9) {
        Y0 y02;
        g();
        C0628g c0628g = this.f15719e.f11227g;
        D d9 = E.f10621S0;
        if (c0628g.y0(null, d9)) {
            S0 s02 = this.f15719e.f11235p;
            C0650n0.e(s02);
            C0650n0 c0650n0 = (C0650n0) s02.f1707a;
            if (c0650n0.f11227g.y0(null, d9)) {
                s02.m0();
                C0647m0 c0647m0 = c0650n0.j;
                C0650n0.f(c0647m0);
                if (!c0647m0.x0()) {
                    C0647m0 c0647m02 = c0650n0.j;
                    C0650n0.f(c0647m02);
                    if (Thread.currentThread() == c0647m02.f11189d) {
                        V v8 = c0650n0.f11229i;
                        C0650n0.f(v8);
                        v8.f10971f.b("Cannot retrieve and upload batches from analytics network thread");
                        return;
                    }
                    if (!C2235a.f()) {
                        V v9 = c0650n0.f11229i;
                        C0650n0.f(v9);
                        v9.f10978n.b("[sgtm] Started client-side batch upload work.");
                        boolean z9 = false;
                        int i9 = 0;
                        int i10 = 0;
                        loop0: while (!z9) {
                            V v10 = c0650n0.f11229i;
                            C0650n0.f(v10);
                            v10.f10978n.b("[sgtm] Getting upload batches from service (FE)");
                            AtomicReference atomicReference = new AtomicReference();
                            C0647m0 c0647m03 = c0650n0.j;
                            C0650n0.f(c0647m03);
                            c0647m03.q0(atomicReference, 10000L, "[sgtm] Getting upload batches", new H0(s02, atomicReference, 1));
                            C1 c12 = (C1) atomicReference.get();
                            if (c12 == null) {
                                break;
                            }
                            List list = c12.f10567a;
                            if (list.isEmpty()) {
                                break;
                            }
                            V v11 = c0650n0.f11229i;
                            C0650n0.f(v11);
                            v11.f10978n.c(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
                            i9 += list.size();
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    A1 a12 = (A1) it.next();
                                    try {
                                        URL url = new URI(a12.f10551c).toURL();
                                        AtomicReference atomicReference2 = new AtomicReference();
                                        b5.L i11 = ((C0650n0) s02.f1707a).i();
                                        i11.m0();
                                        y.h(i11.f10784g);
                                        String str = i11.f10784g;
                                        C0650n0 c0650n02 = (C0650n0) s02.f1707a;
                                        V v12 = c0650n02.f11229i;
                                        C0650n0.f(v12);
                                        T t7 = v12.f10978n;
                                        Long valueOf = Long.valueOf(a12.f10549a);
                                        t7.e("[sgtm] Uploading data from app. row_id, url, uncompressed size", valueOf, a12.f10551c, Integer.valueOf(a12.f10550b.length));
                                        if (!TextUtils.isEmpty(a12.f10555g)) {
                                            V v13 = c0650n02.f11229i;
                                            C0650n0.f(v13);
                                            v13.f10978n.d(valueOf, a12.f10555g, "[sgtm] Uploading data from app. row_id");
                                        }
                                        HashMap hashMap = new HashMap();
                                        Bundle bundle = a12.f10552d;
                                        for (String str2 : bundle.keySet()) {
                                            String string = bundle.getString(str2);
                                            if (!TextUtils.isEmpty(string)) {
                                                hashMap.put(str2, string);
                                            }
                                        }
                                        W0 w02 = c0650n02.f11237r;
                                        C0650n0.f(w02);
                                        byte[] bArr = a12.f10550b;
                                        android.support.v4.media.session.y yVar = new android.support.v4.media.session.y(s02, atomicReference2, a12, 28);
                                        w02.n0();
                                        y.h(url);
                                        y.h(bArr);
                                        C0647m0 c0647m04 = ((C0650n0) w02.f1707a).j;
                                        C0650n0.f(c0647m04);
                                        c0647m04.u0(new Y(w02, str, url, bArr, hashMap, yVar));
                                        try {
                                            P1 p12 = c0650n02.f11231l;
                                            C0650n0.d(p12);
                                            C0650n0 c0650n03 = (C0650n0) p12.f1707a;
                                            c0650n03.f11233n.getClass();
                                            long currentTimeMillis = System.currentTimeMillis() + 60000;
                                            synchronized (atomicReference2) {
                                                for (long j = 60000; atomicReference2.get() == null && j > 0; j = currentTimeMillis - System.currentTimeMillis()) {
                                                    try {
                                                        atomicReference2.wait(j);
                                                        c0650n03.f11233n.getClass();
                                                    } catch (Throwable th) {
                                                        throw th;
                                                        break loop0;
                                                    }
                                                }
                                            }
                                        } catch (InterruptedException unused) {
                                            V v14 = ((C0650n0) s02.f1707a).f11229i;
                                            C0650n0.f(v14);
                                            v14.f10974i.b("[sgtm] Interrupted waiting for uploading batch");
                                        }
                                        if (atomicReference2.get() == null) {
                                            y02 = Y0.UNKNOWN;
                                        } else {
                                            y02 = (Y0) atomicReference2.get();
                                        }
                                    } catch (MalformedURLException | URISyntaxException e8) {
                                        V v15 = ((C0650n0) s02.f1707a).f11229i;
                                        C0650n0.f(v15);
                                        v15.f10971f.e("[sgtm] Bad upload url for row_id", a12.f10551c, Long.valueOf(a12.f10549a), e8);
                                        y02 = Y0.FAILURE;
                                    }
                                    if (y02 == Y0.SUCCESS) {
                                        i10++;
                                    } else if (y02 == Y0.BACKOFF) {
                                        z9 = true;
                                        break;
                                    }
                                } else {
                                    z9 = false;
                                    break;
                                }
                            }
                        }
                        V v16 = c0650n0.f11229i;
                        C0650n0.f(v16);
                        v16.f10978n.d(Integer.valueOf(i9), Integer.valueOf(i10), "[sgtm] Completed client-side batch upload work. total, success");
                        $r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc(this, o9);
                        return;
                    }
                    V v17 = c0650n0.f11229i;
                    C0650n0.f(v17);
                    v17.f10971f.b("Cannot retrieve and upload batches from main thread");
                    return;
                }
                V v18 = c0650n0.f11229i;
                C0650n0.f(v18);
                v18.f10971f.b("Cannot retrieve and upload batches from analytics worker thread");
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void setConditionalUserProperty(Bundle bundle, long j) {
        g();
        if (bundle == null) {
            V v8 = this.f15719e.f11229i;
            C0650n0.f(v8);
            v8.f10971f.b("Conditional user property must not be null");
        } else {
            S0 s02 = this.f15719e.f11235p;
            C0650n0.e(s02);
            s02.A0(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void setConsent(Bundle bundle, long j) {
        g();
        S0 s02 = this.f15719e.f11235p;
        C0650n0.e(s02);
        C0647m0 c0647m0 = ((C0650n0) s02.f1707a).j;
        C0650n0.f(c0647m0);
        c0647m0.w0(new J0(s02, bundle, j));
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void setConsentThirdParty(Bundle bundle, long j) {
        g();
        S0 s02 = this.f15719e.f11235p;
        C0650n0.e(s02);
        s02.B0(bundle, -20, j);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void setCurrentScreen(a aVar, String str, String str2, long j) {
        g();
        Activity activity = (Activity) b.i1(aVar);
        y.h(activity);
        setCurrentScreenByScionActivityInfo(W.f(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if (r3 <= 500) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
    
        if (r3 <= 500) goto L39;
     */
    @Override // com.google.android.gms.internal.measurement.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.W r6, java.lang.String r7, java.lang.String r8, long r9) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.W, java.lang.String, java.lang.String, long):void");
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void setDataCollectionEnabled(boolean z9) {
        g();
        S0 s02 = this.f15719e.f11235p;
        C0650n0.e(s02);
        s02.m0();
        C0647m0 c0647m0 = ((C0650n0) s02.f1707a).j;
        C0650n0.f(c0647m0);
        c0647m0.v0(new RunnableC0359b(s02, z9));
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void setDefaultEventParameters(Bundle bundle) {
        Bundle bundle2;
        g();
        S0 s02 = this.f15719e.f11235p;
        C0650n0.e(s02);
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = new Bundle(bundle);
        }
        C0647m0 c0647m0 = ((C0650n0) s02.f1707a).j;
        C0650n0.f(c0647m0);
        c0647m0.v0(new I0(s02, bundle2, 0));
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void setEventInterceptor(Q q9) {
        boolean z9;
        g();
        c cVar = new c(this, q9, 15, false);
        C0647m0 c0647m0 = this.f15719e.j;
        C0650n0.f(c0647m0);
        if (c0647m0.x0()) {
            S0 s02 = this.f15719e.f11235p;
            C0650n0.e(s02);
            s02.l0();
            s02.m0();
            c cVar2 = s02.f10944d;
            if (cVar != cVar2) {
                if (cVar2 == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                y.j("EventInterceptor already set.", z9);
            }
            s02.f10944d = cVar;
            return;
        }
        C0647m0 c0647m02 = this.f15719e.j;
        C0650n0.f(c0647m02);
        c0647m02.v0(new o(this, cVar, 24, false));
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.T t7) {
        g();
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void setMeasurementEnabled(boolean z9, long j) {
        g();
        S0 s02 = this.f15719e.f11235p;
        C0650n0.e(s02);
        Boolean valueOf = Boolean.valueOf(z9);
        s02.m0();
        C0647m0 c0647m0 = ((C0650n0) s02.f1707a).j;
        C0650n0.f(c0647m0);
        c0647m0.v0(new o(s02, valueOf, 22, false));
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void setMinimumSessionDuration(long j) {
        g();
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void setSessionTimeoutDuration(long j) {
        g();
        S0 s02 = this.f15719e.f11235p;
        C0650n0.e(s02);
        C0647m0 c0647m0 = ((C0650n0) s02.f1707a).j;
        C0650n0.f(c0647m0);
        c0647m0.v0(new N0(s02, j, 0));
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void setSgtmDebugInfo(Intent intent) {
        g();
        S0 s02 = this.f15719e.f11235p;
        C0650n0.e(s02);
        Uri data = intent.getData();
        C0650n0 c0650n0 = (C0650n0) s02.f1707a;
        if (data == null) {
            V v8 = c0650n0.f11229i;
            C0650n0.f(v8);
            v8.f10976l.b("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter != null && queryParameter.equals("1")) {
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (!TextUtils.isEmpty(queryParameter2)) {
                V v9 = c0650n0.f11229i;
                C0650n0.f(v9);
                v9.f10976l.c(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
                c0650n0.f11227g.f11119c = queryParameter2;
                return;
            }
            return;
        }
        V v10 = c0650n0.f11229i;
        C0650n0.f(v10);
        v10.f10976l.b("[sgtm] Preview Mode was not enabled.");
        c0650n0.f11227g.f11119c = null;
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void setUserId(String str, long j) {
        g();
        S0 s02 = this.f15719e.f11235p;
        C0650n0.e(s02);
        C0650n0 c0650n0 = (C0650n0) s02.f1707a;
        if (str != null && TextUtils.isEmpty(str)) {
            V v8 = c0650n0.f11229i;
            C0650n0.f(v8);
            v8.f10974i.b("User ID must be non-empty or null");
        } else {
            C0647m0 c0647m0 = c0650n0.j;
            C0650n0.f(c0647m0);
            c0647m0.v0(new o(s02, 19, str));
            s02.F0(null, "_id", str, true, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void setUserProperty(String str, String str2, a aVar, boolean z9, long j) {
        g();
        Object i12 = b.i1(aVar);
        S0 s02 = this.f15719e.f11235p;
        C0650n0.e(s02);
        s02.F0(str, str2, i12, z9, j);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public void unregisterOnMeasurementEventListener(Q q9) {
        Object obj;
        g();
        C1935e c1935e = this.f15720f;
        synchronized (c1935e) {
            obj = (E0) c1935e.remove(Integer.valueOf(q9.c()));
        }
        if (obj == null) {
            obj = new L1(this, q9);
        }
        S0 s02 = this.f15719e.f11235p;
        C0650n0.e(s02);
        s02.m0();
        if (!s02.f10945e.remove(obj)) {
            V v8 = ((C0650n0) s02.f1707a).f11229i;
            C0650n0.f(v8);
            v8.f10974i.b("OnEventListener had not been registered");
        }
    }
}
