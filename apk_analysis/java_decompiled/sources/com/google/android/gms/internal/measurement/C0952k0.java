package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.measurement.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0952k0 {

    /* renamed from: i, reason: collision with root package name */
    public static volatile C0952k0 f15512i;

    /* renamed from: a, reason: collision with root package name */
    public final String f15513a = "FA";

    /* renamed from: b, reason: collision with root package name */
    public final K4.a f15514b = K4.a.f4292a;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f15515c;

    /* renamed from: d, reason: collision with root package name */
    public final s4.i f15516d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f15517e;

    /* renamed from: f, reason: collision with root package name */
    public int f15518f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15519g;

    /* renamed from: h, reason: collision with root package name */
    public volatile J f15520h;

    public C0952k0(Context context, Bundle bundle) {
        int i9 = 0;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0927f0());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f15515c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f15516d = new s4.i(this);
        this.f15517e = new ArrayList();
        try {
            if (b5.D0.g(context, b5.D0.b(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, C0952k0.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f15519g = true;
                    Log.w(this.f15513a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        b(new C0902a0(this, context, bundle, i9));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f15513a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C0947j0(this));
        }
    }

    public static C0952k0 d(Context context, Bundle bundle) {
        F4.y.h(context);
        if (f15512i == null) {
            synchronized (C0952k0.class) {
                try {
                    if (f15512i == null) {
                        f15512i = new C0952k0(context, bundle);
                    }
                } finally {
                }
            }
        }
        return f15512i;
    }

    public final void a(Exception exc, boolean z9, boolean z10) {
        this.f15519g |= z9;
        String str = this.f15513a;
        if (z9) {
            Log.w(str, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z10) {
            b(new Y(this, exc));
        }
        Log.w(str, "Error with data collection. Data lost.", exc);
    }

    public final void b(AbstractRunnableC0932g0 abstractRunnableC0932g0) {
        this.f15515c.execute(abstractRunnableC0932g0);
    }

    public final int c(String str) {
        G g9 = new G();
        b(new C0902a0(this, str, g9, 1));
        Integer num = (Integer) G.Q(g9.g(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final List e(String str, String str2) {
        G g9 = new G();
        b(new Z(this, str, str2, g9, 1));
        List list = (List) G.Q(g9.g(5000L), List.class);
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        return list;
    }

    public final Map f(String str, String str2, boolean z9) {
        G g9 = new G();
        b(new C0922e0(this, str, str2, z9, g9));
        Bundle g10 = g9.g(5000L);
        if (g10 != null && g10.size() != 0) {
            HashMap hashMap = new HashMap(g10.size());
            for (String str3 : g10.keySet()) {
                Object obj = g10.get(str3);
                if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                    hashMap.put(str3, obj);
                }
            }
            return hashMap;
        }
        return Collections.EMPTY_MAP;
    }
}
