package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import u4.C2077b;
import u4.C2079d;

/* renamed from: com.google.android.gms.internal.cast.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0870s0 {

    /* renamed from: i, reason: collision with root package name */
    public static final y4.b f14972i = new y4.b("ApplicationAnalytics", null);

    /* renamed from: a, reason: collision with root package name */
    public final Y f14973a;

    /* renamed from: b, reason: collision with root package name */
    public final BinderC0822g f14974b;

    /* renamed from: c, reason: collision with root package name */
    public final C0882v0 f14975c;

    /* renamed from: f, reason: collision with root package name */
    public final SharedPreferences f14978f;

    /* renamed from: g, reason: collision with root package name */
    public C0874t0 f14979g;

    /* renamed from: h, reason: collision with root package name */
    public C2079d f14980h;

    /* renamed from: e, reason: collision with root package name */
    public final T4.d f14977e = new T4.d(Looper.getMainLooper(), 4);

    /* renamed from: d, reason: collision with root package name */
    public final RunnableC0893y f14976d = new RunnableC0893y(2, this);

    public C0870s0(SharedPreferences sharedPreferences, Y y9, BinderC0822g binderC0822g, Bundle bundle, String str) {
        this.f14978f = sharedPreferences;
        this.f14973a = y9;
        this.f14974b = binderC0822g;
        this.f14975c = new C0882v0(str, bundle);
    }

    public static void a(C0870s0 c0870s0, int i9) {
        f14972i.b("log session ended with error = %d", Integer.valueOf(i9));
        c0870s0.c();
        c0870s0.f14973a.a(c0870s0.f14975c.a(c0870s0.f14979g, i9), 228);
        c0870s0.f14977e.removeCallbacks(c0870s0.f14976d);
        c0870s0.f14979g = null;
    }

    public static void b(C0870s0 c0870s0) {
        C0874t0 c0874t0 = c0870s0.f14979g;
        c0874t0.getClass();
        SharedPreferences sharedPreferences = c0870s0.f14978f;
        if (sharedPreferences == null) {
            return;
        }
        C0874t0.f14988q.b("Save the ApplicationAnalyticsSession to SharedPreferences %s", sharedPreferences);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("application_id", c0874t0.f14991b);
        edit.putString("receiver_metrics_id", c0874t0.f14992c);
        edit.putLong("analytics_session_id", c0874t0.f14993d);
        edit.putInt("event_sequence_number", c0874t0.f14994e);
        edit.putString("receiver_session_id", c0874t0.f14995f);
        edit.putInt("device_capabilities", c0874t0.f14996g);
        edit.putString("device_model_name", c0874t0.f14997h);
        edit.putString("manufacturer", c0874t0.f14998i);
        edit.putString("product_name", c0874t0.j);
        edit.putString("build_type", c0874t0.f14999k);
        edit.putString("cast_build_version", c0874t0.f15000l);
        edit.putString("system_build_number", c0874t0.f15001m);
        edit.putInt("device_category", c0874t0.f15002n);
        edit.putInt("analytics_session_start_type", c0874t0.f15004p);
        edit.putBoolean("is_output_switcher_enabled", c0874t0.f15003o);
        edit.apply();
    }

    public final void c() {
        CastDevice castDevice;
        if (g()) {
            C2079d c2079d = this.f14980h;
            if (c2079d != null) {
                F4.y.d();
                castDevice = c2079d.f23683k;
            } else {
                castDevice = null;
            }
            if (castDevice != null && !TextUtils.equals(this.f14979g.f14992c, castDevice.f14593l)) {
                f(castDevice);
            }
            F4.y.h(this.f14979g);
            return;
        }
        y4.b bVar = f14972i;
        Log.w(bVar.f24917a, bVar.d("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]));
        d();
    }

    public final void d() {
        boolean z9;
        CastDevice castDevice;
        int i9 = 0;
        f14972i.b("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
        C0874t0 c0874t0 = new C0874t0(this.f14974b);
        C0874t0.f14989r++;
        this.f14979g = c0874t0;
        C2079d c2079d = this.f14980h;
        if (c2079d != null && c2079d.f23680g.i1()) {
            z9 = true;
        } else {
            z9 = false;
        }
        c0874t0.f15003o = z9;
        C0874t0 c0874t02 = this.f14979g;
        F4.y.h(c0874t02);
        y4.b bVar = C2077b.f23643k;
        F4.y.d();
        C2077b c2077b = C2077b.f23645m;
        F4.y.h(c2077b);
        F4.y.d();
        c0874t02.f14991b = c2077b.f23650e.f23658a;
        C2079d c2079d2 = this.f14980h;
        if (c2079d2 == null) {
            castDevice = null;
        } else {
            F4.y.d();
            castDevice = c2079d2.f23683k;
        }
        if (castDevice != null) {
            f(castDevice);
        }
        C0874t0 c0874t03 = this.f14979g;
        F4.y.h(c0874t03);
        C2079d c2079d3 = this.f14980h;
        if (c2079d3 != null) {
            i9 = c2079d3.b();
        }
        c0874t03.f15004p = i9;
        F4.y.h(this.f14979g);
    }

    public final void e() {
        T4.d dVar = this.f14977e;
        F4.y.h(dVar);
        RunnableC0893y runnableC0893y = this.f14976d;
        F4.y.h(runnableC0893y);
        dVar.postDelayed(runnableC0893y, 300000L);
    }

    public final void f(CastDevice castDevice) {
        C0874t0 c0874t0 = this.f14979g;
        if (c0874t0 != null) {
            c0874t0.f14992c = castDevice.f14593l;
            c0874t0.f14996g = castDevice.f14591i.f17061a;
            c0874t0.f14997h = castDevice.f14587e;
            c0874t0.f15002n = castDevice.i();
            y4.d k5 = castDevice.k();
            if (k5 != null) {
                String str = k5.f24924d;
                if (str != null) {
                    c0874t0.f14998i = str;
                }
                String str2 = k5.f24925e;
                if (str2 != null) {
                    c0874t0.j = str2;
                }
                String str3 = k5.f24926f;
                if (str3 != null) {
                    c0874t0.f14999k = str3;
                }
                String str4 = k5.f24927g;
                if (str4 != null) {
                    c0874t0.f15000l = str4;
                }
                String str5 = k5.f24928h;
                if (str5 != null) {
                    c0874t0.f15001m = str5;
                }
            }
        }
    }

    public final boolean g() {
        String str;
        C0874t0 c0874t0 = this.f14979g;
        y4.b bVar = f14972i;
        if (c0874t0 == null) {
            bVar.b("The analytics session is null when matching with application ID.", new Object[0]);
            return false;
        }
        y4.b bVar2 = C2077b.f23643k;
        F4.y.d();
        C2077b c2077b = C2077b.f23645m;
        F4.y.h(c2077b);
        F4.y.d();
        String str2 = c2077b.f23650e.f23658a;
        if (str2 != null && (str = this.f14979g.f14991b) != null && TextUtils.equals(str, str2)) {
            F4.y.h(this.f14979g);
            return true;
        }
        bVar.b("The analytics session doesn't match the application ID %s", str2);
        return false;
    }

    public final boolean h(String str) {
        String str2;
        if (!g()) {
            return false;
        }
        F4.y.h(this.f14979g);
        if (str != null && (str2 = this.f14979g.f14995f) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        f14972i.b("The analytics session doesn't match the receiver session ID %s.", str);
        return false;
    }
}
