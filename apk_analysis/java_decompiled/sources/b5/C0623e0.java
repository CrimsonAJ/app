package b5;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;

/* renamed from: b5.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0623e0 extends AbstractC0674x0 {

    /* renamed from: A, reason: collision with root package name */
    public static final Pair f11083A = new Pair("", 0L);

    /* renamed from: c, reason: collision with root package name */
    public SharedPreferences f11084c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f11085d;

    /* renamed from: e, reason: collision with root package name */
    public SharedPreferences f11086e;

    /* renamed from: f, reason: collision with root package name */
    public C0620d0 f11087f;

    /* renamed from: g, reason: collision with root package name */
    public final C0617c0 f11088g;

    /* renamed from: h, reason: collision with root package name */
    public final A6.t f11089h;

    /* renamed from: i, reason: collision with root package name */
    public String f11090i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public long f11091k;

    /* renamed from: l, reason: collision with root package name */
    public final C0617c0 f11092l;

    /* renamed from: m, reason: collision with root package name */
    public final C0614b0 f11093m;

    /* renamed from: n, reason: collision with root package name */
    public final A6.t f11094n;

    /* renamed from: o, reason: collision with root package name */
    public final com.google.firebase.messaging.s f11095o;

    /* renamed from: p, reason: collision with root package name */
    public final C0614b0 f11096p;

    /* renamed from: q, reason: collision with root package name */
    public final C0617c0 f11097q;

    /* renamed from: r, reason: collision with root package name */
    public final C0617c0 f11098r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f11099s;

    /* renamed from: t, reason: collision with root package name */
    public final C0614b0 f11100t;

    /* renamed from: u, reason: collision with root package name */
    public final C0614b0 f11101u;

    /* renamed from: v, reason: collision with root package name */
    public final C0617c0 f11102v;

    /* renamed from: w, reason: collision with root package name */
    public final A6.t f11103w;

    /* renamed from: x, reason: collision with root package name */
    public final A6.t f11104x;

    /* renamed from: y, reason: collision with root package name */
    public final C0617c0 f11105y;

    /* renamed from: z, reason: collision with root package name */
    public final com.google.firebase.messaging.s f11106z;

    public C0623e0(C0650n0 c0650n0) {
        super(c0650n0);
        this.f11085d = new Object();
        this.f11092l = new C0617c0(this, "session_timeout", 1800000L);
        this.f11093m = new C0614b0(this, "start_new_session", true);
        this.f11097q = new C0617c0(this, "last_pause_time", 0L);
        this.f11098r = new C0617c0(this, "session_id", 0L);
        this.f11094n = new A6.t(this, "non_personalized_ads");
        this.f11095o = new com.google.firebase.messaging.s(this, "last_received_uri_timestamps_by_source");
        this.f11096p = new C0614b0(this, "allow_remote_dynamite", false);
        this.f11088g = new C0617c0(this, "first_open_time", 0L);
        F4.y.e("app_install_time");
        this.f11089h = new A6.t(this, "app_instance_id");
        this.f11100t = new C0614b0(this, "app_backgrounded", false);
        this.f11101u = new C0614b0(this, "deep_link_retrieval_complete", false);
        this.f11102v = new C0617c0(this, "deep_link_retrieval_attempts", 0L);
        this.f11103w = new A6.t(this, "firebase_feature_rollouts");
        this.f11104x = new A6.t(this, "deferred_attribution_cache");
        this.f11105y = new C0617c0(this, "deferred_attribution_cache_timestamp", 0L);
        this.f11106z = new com.google.firebase.messaging.s(this, "default_event_parameters");
    }

    @Override // b5.AbstractC0674x0
    public final boolean m0() {
        return true;
    }

    public final SharedPreferences p0() {
        l0();
        n0();
        if (this.f11086e == null) {
            synchronized (this.f11085d) {
                try {
                    if (this.f11086e == null) {
                        C0650n0 c0650n0 = (C0650n0) this.f1707a;
                        String str = c0650n0.f11221a.getPackageName() + "_preferences";
                        V v8 = c0650n0.f11229i;
                        C0650n0.f(v8);
                        v8.f10978n.c(str, "Default prefs file");
                        this.f11086e = c0650n0.f11221a.getSharedPreferences(str, 0);
                    }
                } finally {
                }
            }
        }
        return this.f11086e;
    }

    public final SharedPreferences q0() {
        l0();
        n0();
        F4.y.h(this.f11084c);
        return this.f11084c;
    }

    public final SparseArray r0() {
        Bundle w7 = this.f11095o.w();
        int[] intArray = w7.getIntArray("uriSources");
        long[] longArray = w7.getLongArray("uriTimestamps");
        if (intArray != null && longArray != null) {
            if (intArray.length != longArray.length) {
                V v8 = ((C0650n0) this.f1707a).f11229i;
                C0650n0.f(v8);
                v8.f10971f.b("Trigger URI source and timestamp array lengths do not match");
                return new SparseArray();
            }
            SparseArray sparseArray = new SparseArray();
            for (int i9 = 0; i9 < intArray.length; i9++) {
                sparseArray.put(intArray[i9], Long.valueOf(longArray[i9]));
            }
            return sparseArray;
        }
        return new SparseArray();
    }

    public final C0 s0() {
        l0();
        return C0.e(q0().getInt("consent_source", 100), q0().getString("consent_settings", "G1"));
    }

    public final void t0(boolean z9) {
        l0();
        V v8 = ((C0650n0) this.f1707a).f11229i;
        C0650n0.f(v8);
        v8.f10978n.c(Boolean.valueOf(z9), "App measurement setting deferred collection");
        SharedPreferences.Editor edit = q0().edit();
        edit.putBoolean("deferred_analytics_collection", z9);
        edit.apply();
    }

    public final boolean u0(long j) {
        if (j - this.f11092l.f() > this.f11097q.f()) {
            return true;
        }
        return false;
    }

    public final boolean v0(u1 u1Var) {
        l0();
        String string = q0().getString("stored_tcf_param", "");
        String c3 = u1Var.c();
        if (!c3.equals(string)) {
            SharedPreferences.Editor edit = q0().edit();
            edit.putString("stored_tcf_param", c3);
            edit.apply();
            return true;
        }
        return false;
    }
}
