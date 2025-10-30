package b5;

import P5.AbstractC0349q;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.K3;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import z2.C2235a;

/* loaded from: classes.dex */
public final class S0 extends B {

    /* renamed from: c, reason: collision with root package name */
    public R0 f10943c;

    /* renamed from: d, reason: collision with root package name */
    public O0.c f10944d;

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArraySet f10945e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10946f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f10947g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f10948h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10949i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public M0 f10950k;

    /* renamed from: l, reason: collision with root package name */
    public M0 f10951l;

    /* renamed from: m, reason: collision with root package name */
    public PriorityQueue f10952m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10953n;

    /* renamed from: o, reason: collision with root package name */
    public C0 f10954o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicLong f10955p;

    /* renamed from: q, reason: collision with root package name */
    public long f10956q;

    /* renamed from: r, reason: collision with root package name */
    public final s4.i f10957r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10958s;

    /* renamed from: t, reason: collision with root package name */
    public M0 f10959t;

    /* renamed from: u, reason: collision with root package name */
    public L0 f10960u;

    /* renamed from: v, reason: collision with root package name */
    public M0 f10961v;

    /* renamed from: w, reason: collision with root package name */
    public final s4.i f10962w;

    public S0(C0650n0 c0650n0) {
        super(c0650n0);
        this.f10945e = new CopyOnWriteArraySet();
        this.f10948h = new Object();
        this.f10949i = false;
        this.j = 1;
        this.f10958s = true;
        this.f10962w = new s4.i(this);
        this.f10947g = new AtomicReference();
        this.f10954o = C0.f10564c;
        this.f10956q = -1L;
        this.f10955p = new AtomicLong(0L);
        this.f10957r = new s4.i(c0650n0);
    }

    public static void p0(S0 s02, C0 c02, long j, boolean z9) {
        s02.l0();
        s02.m0();
        C0650n0 c0650n0 = (C0650n0) s02.f1707a;
        C0623e0 c0623e0 = c0650n0.f11228h;
        C0650n0.d(c0623e0);
        C0 s03 = c0623e0.s0();
        long j4 = s02.f10956q;
        int i9 = c02.f10566b;
        V v8 = c0650n0.f11229i;
        if (j <= j4 && C0.l(s03.f10566b, i9)) {
            C0650n0.f(v8);
            v8.f10976l.c(c02, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        C0623e0 c0623e02 = c0650n0.f11228h;
        C0650n0.d(c0623e02);
        c0623e02.l0();
        if (C0.l(i9, c0623e02.q0().getInt("consent_source", 100))) {
            SharedPreferences.Editor edit = c0623e02.q0().edit();
            edit.putString("consent_settings", c02.j());
            edit.putInt("consent_source", i9);
            edit.apply();
            C0650n0.f(v8);
            v8.f10978n.c(c02, "Setting storage consent(FE)");
            s02.f10956q = j;
            if (c0650n0.m().x0()) {
                C0648m1 m9 = c0650n0.m();
                m9.l0();
                m9.m0();
                m9.C0(new RunnableC0624e1(m9, 0));
            } else {
                C0648m1 m10 = c0650n0.m();
                m10.l0();
                m10.m0();
                if (m10.w0()) {
                    m10.C0(new RunnableC0636i1(m10, m10.z0(false), 4));
                }
            }
            if (z9) {
                c0650n0.m().r0(new AtomicReference());
                return;
            }
            return;
        }
        C0650n0.f(v8);
        v8.f10976l.c(Integer.valueOf(i9), "Lower precedence consent source ignored, proposed source");
    }

    public final void A0(Bundle bundle, long j) {
        F4.y.h(bundle);
        Bundle bundle2 = new Bundle(bundle);
        boolean isEmpty = TextUtils.isEmpty(bundle2.getString("app_id"));
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        if (!isEmpty) {
            V v8 = c0650n0.f11229i;
            C0650n0.f(v8);
            v8.f10974i.b("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        D0.a(bundle2, "app_id", String.class, null);
        D0.a(bundle2, "origin", String.class, null);
        D0.a(bundle2, "name", String.class, null);
        D0.a(bundle2, "value", Object.class, null);
        D0.a(bundle2, "trigger_event_name", String.class, null);
        D0.a(bundle2, "trigger_timeout", Long.class, 0L);
        D0.a(bundle2, "timed_out_event_name", String.class, null);
        D0.a(bundle2, "timed_out_event_params", Bundle.class, null);
        D0.a(bundle2, "triggered_event_name", String.class, null);
        D0.a(bundle2, "triggered_event_params", Bundle.class, null);
        D0.a(bundle2, "time_to_live", Long.class, 0L);
        D0.a(bundle2, "expired_event_name", String.class, null);
        D0.a(bundle2, "expired_event_params", Bundle.class, null);
        F4.y.e(bundle2.getString("name"));
        F4.y.e(bundle2.getString("origin"));
        F4.y.h(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        P1 p12 = c0650n0.f11231l;
        C0650n0.d(p12);
        int s1 = p12.s1(string);
        O o9 = c0650n0.f11232m;
        V v9 = c0650n0.f11229i;
        if (s1 == 0) {
            P1 p13 = c0650n0.f11231l;
            C0650n0.d(p13);
            if (p13.o1(obj, string) == 0) {
                Object t02 = p13.t0(obj, string);
                if (t02 == null) {
                    C0650n0.f(v9);
                    v9.f10971f.d(o9.f(string), obj, "Unable to normalize conditional user property value");
                    return;
                }
                D0.e(bundle2, t02);
                long j4 = bundle2.getLong("trigger_timeout");
                if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j4 > 15552000000L || j4 < 1)) {
                    C0650n0.f(v9);
                    v9.f10971f.d(o9.f(string), Long.valueOf(j4), "Invalid conditional user property timeout");
                    return;
                }
                long j9 = bundle2.getLong("time_to_live");
                if (j9 <= 15552000000L && j9 >= 1) {
                    C0647m0 c0647m0 = c0650n0.j;
                    C0650n0.f(c0647m0);
                    c0647m0.v0(new I0(this, bundle2, 1));
                    return;
                } else {
                    C0650n0.f(v9);
                    v9.f10971f.d(o9.f(string), Long.valueOf(j9), "Invalid conditional user property time to live");
                    return;
                }
            }
            C0650n0.f(v9);
            v9.f10971f.d(o9.f(string), obj, "Invalid conditional user property value");
            return;
        }
        C0650n0.f(v9);
        v9.f10971f.c(o9.f(string), "Invalid conditional user property name");
    }

    public final void B0(Bundle bundle, int i9, long j) {
        Object obj;
        EnumC0678z0 enumC0678z0;
        String str;
        String string;
        m0();
        C0 c02 = C0.f10564c;
        B0[] b0Arr = A0.STORAGE.f10548a;
        int length = b0Arr.length;
        int i10 = 0;
        while (true) {
            obj = null;
            if (i10 >= length) {
                break;
            }
            String str2 = b0Arr[i10].f10562a;
            if (bundle.containsKey(str2) && (string = bundle.getString(str2)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i10++;
        }
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        if (obj != null) {
            V v8 = c0650n0.f11229i;
            C0650n0.f(v8);
            v8.f10975k.c(obj, "Ignoring invalid consent setting");
            V v9 = c0650n0.f11229i;
            C0650n0.f(v9);
            v9.f10975k.b("Valid consent values are 'granted', 'denied'");
        }
        C0647m0 c0647m0 = c0650n0.j;
        C0650n0.f(c0647m0);
        boolean x02 = c0647m0.x0();
        C0 d9 = C0.d(i9, bundle);
        Iterator it = d9.f10565a.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            enumC0678z0 = EnumC0678z0.UNINITIALIZED;
            if (!hasNext) {
                break;
            } else if (((EnumC0678z0) it.next()) != enumC0678z0) {
                E0(d9, x02);
                break;
            }
        }
        C0655p a5 = C0655p.a(i9, bundle);
        Iterator it2 = a5.f11270e.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((EnumC0678z0) it2.next()) != enumC0678z0) {
                C0(a5, x02);
                break;
            }
        }
        Boolean d10 = C0655p.d(bundle);
        if (d10 != null) {
            if (i9 == -30) {
                str = "tcf";
            } else {
                str = "app";
            }
            String str3 = str;
            if (x02) {
                G0(j, d10.toString(), str3, "allow_personalized_ads");
            } else {
                F0(str3, "allow_personalized_ads", d10.toString(), false, j);
            }
        }
    }

    public final void C0(C0655p c0655p, boolean z9) {
        S5.o oVar = new S5.o(this, c0655p, 23, false);
        if (z9) {
            l0();
            oVar.run();
        } else {
            C0647m0 c0647m0 = ((C0650n0) this.f1707a).j;
            C0650n0.f(c0647m0);
            c0647m0.v0(oVar);
        }
    }

    public final void D0(C0 c02) {
        boolean z9;
        Boolean bool;
        l0();
        if ((c02.k(B0.ANALYTICS_STORAGE) && c02.k(B0.AD_STORAGE)) || ((C0650n0) this.f1707a).m().w0()) {
            z9 = true;
        } else {
            z9 = false;
        }
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        C0647m0 c0647m0 = c0650n0.j;
        C0650n0.f(c0647m0);
        c0647m0.l0();
        if (z9 != c0650n0.f11217C) {
            C0647m0 c0647m02 = c0650n0.j;
            C0650n0.f(c0647m02);
            c0647m02.l0();
            c0650n0.f11217C = z9;
            C0623e0 c0623e0 = ((C0650n0) this.f1707a).f11228h;
            C0650n0.d(c0623e0);
            c0623e0.l0();
            if (c0623e0.q0().contains("measurement_enabled_from_api")) {
                bool = Boolean.valueOf(c0623e0.q0().getBoolean("measurement_enabled_from_api", true));
            } else {
                bool = null;
            }
            if (!z9 || bool == null || bool.booleanValue()) {
                H0(Boolean.valueOf(z9), false);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:75:0x0116
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public final void E0(b5.C0 r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.S0.E0(b5.C0, boolean):void");
    }

    public final void F0(String str, String str2, Object obj, boolean z9, long j) {
        int i9;
        String str3;
        int i10 = 0;
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        if (z9) {
            P1 p12 = c0650n0.f11231l;
            C0650n0.d(p12);
            i9 = p12.s1(str2);
        } else {
            P1 p13 = c0650n0.f11231l;
            C0650n0.d(p13);
            if (p13.Z0("user property", str2)) {
                if (!p13.W0("user property", D0.f10582i, null, str2)) {
                    i9 = 15;
                } else {
                    ((C0650n0) p13.f1707a).getClass();
                    if (p13.V0("user property", 24, str2)) {
                        i9 = 0;
                    }
                }
            }
            i9 = 6;
        }
        s4.i iVar = this.f10962w;
        if (i9 != 0) {
            C0650n0.d(c0650n0.f11231l);
            String v02 = P1.v0(str2, true, 24);
            if (str2 != null) {
                i10 = str2.length();
            }
            C0650n0.d(c0650n0.f11231l);
            P1.F0(iVar, null, i9, "_ev", v02, i10);
            return;
        }
        if (str == null) {
            str3 = "app";
        } else {
            str3 = str;
        }
        if (obj != null) {
            P1 p14 = c0650n0.f11231l;
            C0650n0.d(p14);
            int o12 = p14.o1(obj, str2);
            P1 p15 = c0650n0.f11231l;
            if (o12 != 0) {
                C0650n0.d(p15);
                String v03 = P1.v0(str2, true, 24);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i10 = obj.toString().length();
                }
                C0650n0.d(p15);
                P1.F0(iVar, null, o12, "_ev", v03, i10);
                return;
            }
            C0650n0.d(p15);
            Object t02 = p15.t0(obj, str2);
            if (t02 != null) {
                C0647m0 c0647m0 = c0650n0.j;
                C0650n0.f(c0647m0);
                c0647m0.v0(new RunnableC0664s0(this, str3, str2, t02, j, 1));
                return;
            }
            return;
        }
        C0647m0 c0647m02 = c0650n0.j;
        C0650n0.f(c0647m02);
        c0647m02.v0(new RunnableC0664s0(this, str3, str2, null, j, 1));
    }

    public final void G0(long j, Object obj, String str, String str2) {
        String str3;
        boolean s02;
        long j4;
        Object obj2 = obj;
        F4.y.e(str);
        F4.y.e(str2);
        l0();
        m0();
        boolean equals = "allow_personalized_ads".equals(str2);
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        if (equals) {
            String str4 = "_npa";
            if (obj2 instanceof String) {
                String str5 = (String) obj2;
                if (!TextUtils.isEmpty(str5)) {
                    String lowerCase = str5.toLowerCase(Locale.ENGLISH);
                    String str6 = "false";
                    if (true != "false".equals(lowerCase)) {
                        j4 = 0;
                    } else {
                        j4 = 1;
                    }
                    obj2 = Long.valueOf(j4);
                    C0623e0 c0623e0 = c0650n0.f11228h;
                    C0650n0.d(c0623e0);
                    if (j4 == 1) {
                        str6 = "true";
                    }
                    c0623e0.f11094n.n(str6);
                    V v8 = c0650n0.f11229i;
                    C0650n0.f(v8);
                    v8.f10978n.d("non_personalized_ads(_npa)", obj2, "Setting user property(FE)");
                    str3 = str4;
                }
            }
            if (obj2 == null) {
                C0623e0 c0623e02 = c0650n0.f11228h;
                C0650n0.d(c0623e02);
                c0623e02.f11094n.n("unset");
            } else {
                str4 = str2;
            }
            V v82 = c0650n0.f11229i;
            C0650n0.f(v82);
            v82.f10978n.d("non_personalized_ads(_npa)", obj2, "Setting user property(FE)");
            str3 = str4;
        } else {
            str3 = str2;
        }
        Object obj3 = obj2;
        if (!c0650n0.a()) {
            V v9 = c0650n0.f11229i;
            C0650n0.f(v9);
            v9.f10978n.b("User property not set since app measurement is disabled");
            return;
        }
        if (!c0650n0.b()) {
            return;
        }
        M1 m12 = new M1(j, obj3, str3, str);
        C0648m1 m9 = c0650n0.m();
        m9.l0();
        m9.m0();
        m9.D0();
        N j9 = ((C0650n0) m9.f1707a).j();
        j9.getClass();
        Parcel obtain = Parcel.obtain();
        android.support.v4.media.a.b(m12, obtain);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            V v10 = ((C0650n0) j9.f1707a).f11229i;
            C0650n0.f(v10);
            v10.f10972g.b("User property too long for local database. Sending directly to service");
            s02 = false;
        } else {
            s02 = j9.s0(1, marshall);
        }
        m9.C0(new A4.k(m9, m9.z0(true), s02, m12, 1));
    }

    public final void H0(Boolean bool, boolean z9) {
        l0();
        m0();
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        V v8 = c0650n0.f11229i;
        C0650n0.f(v8);
        v8.f10977m.c(bool, "Setting app measurement enabled (FE)");
        C0623e0 c0623e0 = c0650n0.f11228h;
        C0650n0.d(c0623e0);
        c0623e0.l0();
        SharedPreferences.Editor edit = c0623e0.q0().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
        if (z9) {
            c0623e0.l0();
            SharedPreferences.Editor edit2 = c0623e0.q0().edit();
            if (bool != null) {
                edit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit2.remove("measurement_enabled_from_api");
            }
            edit2.apply();
        }
        C0647m0 c0647m0 = c0650n0.j;
        C0650n0.f(c0647m0);
        c0647m0.l0();
        if (!c0650n0.f11217C && (bool == null || bool.booleanValue())) {
            return;
        }
        I0();
    }

    public final void I0() {
        long j;
        l0();
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        C0623e0 c0623e0 = c0650n0.f11228h;
        C0650n0.d(c0623e0);
        String m9 = c0623e0.f11094n.m();
        if (m9 != null) {
            boolean equals = "unset".equals(m9);
            K4.a aVar = c0650n0.f11233n;
            if (equals) {
                aVar.getClass();
                G0(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                if (true != "true".equals(m9)) {
                    j = 0;
                } else {
                    j = 1;
                }
                Long valueOf = Long.valueOf(j);
                aVar.getClass();
                G0(System.currentTimeMillis(), valueOf, "app", "_npa");
            }
        }
        boolean a5 = c0650n0.a();
        V v8 = c0650n0.f11229i;
        if (a5 && this.f10958s) {
            C0650n0.f(v8);
            v8.f10977m.b("Recording app launch after enabling measurement for the first time (FE)");
            q0();
            t1 t1Var = c0650n0.f11230k;
            C0650n0.e(t1Var);
            t1Var.f11318e.L();
            C0647m0 c0647m0 = c0650n0.j;
            C0650n0.f(c0647m0);
            c0647m0.v0(new K0(this, 2));
            return;
        }
        C0650n0.f(v8);
        v8.f10977m.b("Updating Scion state (FE)");
        C0648m1 m10 = c0650n0.m();
        m10.l0();
        m10.m0();
        m10.C0(new RunnableC0636i1(m10, m10.z0(true), 3));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [b5.G0, java.lang.Object] */
    public final PriorityQueue J0() {
        Comparator comparing;
        if (this.f10952m == null) {
            comparing = Comparator.comparing(new Object(), new B.j(12));
            this.f10952m = C3.d.p(comparing);
        }
        return this.f10952m;
    }

    @Override // b5.B
    public final boolean o0() {
        return false;
    }

    public final void q0() {
        l0();
        m0();
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        if (c0650n0.b()) {
            C0628g c0628g = c0650n0.f11227g;
            ((C0650n0) c0628g.f1707a).getClass();
            Boolean w02 = c0628g.w0("google_analytics_deferred_deep_link_enabled");
            if (w02 != null && w02.booleanValue()) {
                V v8 = c0650n0.f11229i;
                C0650n0.f(v8);
                v8.f10977m.b("Deferred Deep Link feature enabled.");
                C0647m0 c0647m0 = c0650n0.j;
                C0650n0.f(c0647m0);
                c0647m0.v0(new K0(this, 0));
            }
            C0648m1 m9 = c0650n0.m();
            m9.l0();
            m9.m0();
            Q1 z02 = m9.z0(true);
            m9.D0();
            C0650n0 c0650n02 = (C0650n0) m9.f1707a;
            c0650n02.f11227g.y0(null, E.f10672m1);
            c0650n02.j().s0(3, new byte[0]);
            m9.C0(new RunnableC0636i1(m9, z02, 1));
            this.f10958s = false;
            C0623e0 c0623e0 = c0650n0.f11228h;
            C0650n0.d(c0623e0);
            c0623e0.l0();
            String string = c0623e0.q0().getString("previous_os_version", null);
            ((C0650n0) c0623e0.f1707a).h().n0();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = c0623e0.q0().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                c0650n0.h().n0();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    w0("auto", "_ou", bundle);
                }
            }
        }
    }

    public final void r0(String str, String str2, Bundle bundle) {
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        c0650n0.f11233n.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        F4.y.e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        C0647m0 c0647m0 = c0650n0.j;
        C0650n0.f(c0647m0);
        c0647m0.v0(new I0(this, bundle2, 2));
    }

    public final void s0() {
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        if ((c0650n0.f11221a.getApplicationContext() instanceof Application) && this.f10943c != null) {
            ((Application) c0650n0.f11221a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f10943c);
        }
    }

    public final void t0() {
        K3.b();
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        if (c0650n0.f11227g.y0(null, E.f10631X0)) {
            C0647m0 c0647m0 = c0650n0.j;
            C0650n0.f(c0647m0);
            boolean x02 = c0647m0.x0();
            V v8 = c0650n0.f11229i;
            if (!x02) {
                if (!C2235a.f()) {
                    m0();
                    C0650n0.f(v8);
                    v8.f10978n.b("Getting trigger URIs (FE)");
                    AtomicReference atomicReference = new AtomicReference();
                    C0650n0.f(c0647m0);
                    c0647m0.q0(atomicReference, 10000L, "get trigger URIs", new H0(this, atomicReference, 0));
                    List list = (List) atomicReference.get();
                    if (list == null) {
                        C0650n0.f(v8);
                        v8.f10971f.b("Timed out waiting for get trigger URIs");
                        return;
                    } else {
                        C0650n0.f(c0647m0);
                        c0647m0.v0(new S5.o(this, 20, list));
                        return;
                    }
                }
                C0650n0.f(v8);
                v8.f10971f.b("Cannot get trigger URIs from main thread");
                return;
            }
            C0650n0.f(v8);
            v8.f10971f.b("Cannot get trigger URIs from analytics worker thread");
        }
    }

    public final void u0() {
        C0650n0 c0650n0;
        String str;
        u1 u1Var;
        u1 u1Var2;
        S0 s02;
        String str2;
        String str3;
        int i9;
        com.google.android.gms.internal.measurement.M1 m12;
        boolean z9;
        boolean z10;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int a5;
        int a9;
        int a10;
        int a11;
        Object obj6;
        Object obj7;
        com.google.android.gms.internal.measurement.L1 l12;
        Object obj8;
        Object obj9;
        com.google.android.gms.internal.measurement.M1 m13;
        l0();
        C0650n0 c0650n02 = (C0650n0) this.f1707a;
        V v8 = c0650n02.f11229i;
        C0650n0.f(v8);
        v8.f10977m.b("Handle tcf update.");
        C0623e0 c0623e0 = c0650n02.f11228h;
        C0650n0.d(c0623e0);
        SharedPreferences p02 = c0623e0.p0();
        HashMap hashMap = new HashMap();
        D d9 = E.f10666k1;
        int i10 = 2;
        int i11 = 1;
        if (((Boolean) d9.a(null)).booleanValue()) {
            P5.S s9 = w1.f11342a;
            com.google.android.gms.internal.measurement.L1 l13 = com.google.android.gms.internal.measurement.L1.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            v1 v1Var = v1.f11335a;
            c0650n0 = c0650n02;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(l13, v1Var);
            com.google.android.gms.internal.measurement.L1 l14 = com.google.android.gms.internal.measurement.L1.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            v1 v1Var2 = v1.f11336b;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry(l14, v1Var2);
            com.google.android.gms.internal.measurement.L1 l15 = com.google.android.gms.internal.measurement.L1.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry3 = new AbstractMap.SimpleImmutableEntry(l15, v1Var);
            com.google.android.gms.internal.measurement.L1 l16 = com.google.android.gms.internal.measurement.L1.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry4 = new AbstractMap.SimpleImmutableEntry(l16, v1Var);
            com.google.android.gms.internal.measurement.L1 l17 = com.google.android.gms.internal.measurement.L1.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
            List asList = Arrays.asList(simpleImmutableEntry, simpleImmutableEntry2, simpleImmutableEntry3, simpleImmutableEntry4, new AbstractMap.SimpleImmutableEntry(l17, v1Var2), new AbstractMap.SimpleImmutableEntry(com.google.android.gms.internal.measurement.L1.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, v1Var2), new AbstractMap.SimpleImmutableEntry(com.google.android.gms.internal.measurement.L1.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, v1Var2));
            if (u0.z.i(asList)) {
                i9 = asList.size();
            } else {
                i9 = 4;
            }
            A3.E e8 = new A3.E(i9, 6);
            e8.p(asList);
            P5.X d10 = e8.d();
            int i12 = P5.I.f5906c;
            P5.e0 e0Var = new P5.e0("CH");
            char[] cArr = new char[5];
            int a12 = w1.a(p02, "IABTCF_CmpSdkID");
            int a13 = w1.a(p02, "IABTCF_PolicyVersion");
            int a14 = w1.a(p02, "IABTCF_gdprApplies");
            int a15 = w1.a(p02, "IABTCF_PurposeOneTreatment");
            int a16 = w1.a(p02, "IABTCF_EnableAdvertiserConsentMode");
            String b9 = w1.b(p02, "IABTCF_PublisherCC");
            A3.E e9 = new A3.E(4, 6);
            P5.f0 it = d10.keySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                m12 = com.google.android.gms.internal.measurement.M1.PURPOSE_RESTRICTION_UNDEFINED;
                P5.f0 f0Var = it;
                if (!hasNext) {
                    break;
                }
                com.google.android.gms.internal.measurement.L1 l18 = (com.google.android.gms.internal.measurement.L1) f0Var.next();
                char[] cArr2 = cArr;
                String str4 = b9;
                String b10 = w1.b(p02, "IABTCF_PublisherRestrictions" + l18.a());
                if (!TextUtils.isEmpty(b10) && b10.length() >= 755) {
                    int digit = Character.digit(b10.charAt(754), 10);
                    m13 = com.google.android.gms.internal.measurement.M1.PURPOSE_RESTRICTION_NOT_ALLOWED;
                    if (digit >= 0 && digit <= com.google.android.gms.internal.measurement.M1.values().length && digit != 0) {
                        if (digit != i11) {
                            if (digit == i10) {
                                m12 = com.google.android.gms.internal.measurement.M1.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                            }
                        } else {
                            m12 = com.google.android.gms.internal.measurement.M1.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                        }
                    }
                    e9.n(l18, m13);
                    it = f0Var;
                    cArr = cArr2;
                    b9 = str4;
                    i10 = 2;
                    i11 = 1;
                }
                m13 = m12;
                e9.n(l18, m13);
                it = f0Var;
                cArr = cArr2;
                b9 = str4;
                i10 = 2;
                i11 = 1;
            }
            char[] cArr3 = cArr;
            String str5 = b9;
            P5.X d11 = e9.d();
            String b11 = w1.b(p02, "IABTCF_PurposeConsents");
            String b12 = w1.b(p02, "IABTCF_VendorConsents");
            if (!TextUtils.isEmpty(b12) && b12.length() >= 755 && b12.charAt(754) == '1') {
                z9 = true;
            } else {
                z9 = false;
            }
            String b13 = w1.b(p02, "IABTCF_PurposeLegitimateInterests");
            String b14 = w1.b(p02, "IABTCF_VendorLegitimateInterests");
            if (!TextUtils.isEmpty(b14) && b14.length() >= 755 && b14.charAt(754) == '1') {
                z10 = true;
            } else {
                z10 = false;
            }
            cArr3[0] = '2';
            com.google.android.gms.internal.measurement.M1 m14 = (com.google.android.gms.internal.measurement.M1) d11.get(l13);
            com.google.android.gms.internal.measurement.M1 m15 = (com.google.android.gms.internal.measurement.M1) d11.get(l15);
            com.google.android.gms.internal.measurement.M1 m16 = (com.google.android.gms.internal.measurement.M1) d11.get(l16);
            com.google.android.gms.internal.measurement.M1 m17 = (com.google.android.gms.internal.measurement.M1) d11.get(l17);
            A3.E e10 = new A3.E(4, 6);
            e10.n("Version", "2");
            if (true != z9) {
                obj = "0";
            } else {
                obj = "1";
            }
            boolean z11 = z9;
            e10.n("VendorConsent", obj);
            if (true != z10) {
                obj2 = "0";
            } else {
                obj2 = "1";
            }
            e10.n("VendorLegitimateInterest", obj2);
            if (a14 != 1) {
                obj3 = "0";
            } else {
                obj3 = "1";
            }
            e10.n("gdprApplies", obj3);
            if (a16 != 1) {
                obj4 = "0";
            } else {
                obj4 = "1";
            }
            e10.n("EnableAdvertiserConsentMode", obj4);
            e10.n("PolicyVersion", String.valueOf(a13));
            e10.n("CmpSdkID", String.valueOf(a12));
            if (a15 != 1) {
                obj5 = "0";
            } else {
                obj5 = "1";
            }
            e10.n("PurposeOneTreatment", obj5);
            e10.n("PublisherCC", str5);
            if (m14 != null) {
                a5 = m14.a();
            } else {
                a5 = m12.a();
            }
            e10.n("PublisherRestrictions1", String.valueOf(a5));
            if (m15 != null) {
                a9 = m15.a();
            } else {
                a9 = m12.a();
            }
            e10.n("PublisherRestrictions3", String.valueOf(a9));
            if (m16 != null) {
                a10 = m16.a();
            } else {
                a10 = m12.a();
            }
            e10.n("PublisherRestrictions4", String.valueOf(a10));
            if (m17 != null) {
                a11 = m17.a();
            } else {
                a11 = m12.a();
            }
            e10.n("PublisherRestrictions7", String.valueOf(a11));
            String f9 = w1.f(l13, b11, b13);
            String f10 = w1.f(l15, b11, b13);
            String f11 = w1.f(l16, b11, b13);
            boolean z12 = z10;
            String f12 = w1.f(l17, b11, b13);
            AbstractC0349q.b("Purpose1", f9);
            AbstractC0349q.b("Purpose3", f10);
            AbstractC0349q.b("Purpose4", f11);
            AbstractC0349q.b("Purpose7", f12);
            e10.p(P5.X.b(4, new Object[]{"Purpose1", f9, "Purpose3", f10, "Purpose4", f11, "Purpose7", f12}, null).entrySet());
            if (true != w1.c(l13, d10, d11, e0Var, cArr3, a16, a14, a15, str5, b11, b13, z11, z12)) {
                obj6 = "0";
            } else {
                obj6 = "1";
            }
            if (true != w1.c(l15, d10, d11, e0Var, cArr3, a16, a14, a15, str5, b11, b13, z11, z12)) {
                obj7 = "0";
            } else {
                obj7 = "1";
            }
            if (true != w1.c(l16, d10, d11, e0Var, cArr3, a16, a14, a15, str5, b11, b13, z11, z12)) {
                l12 = l17;
                obj8 = "0";
            } else {
                l12 = l17;
                obj8 = "1";
            }
            if (true != w1.c(l12, d10, d11, e0Var, cArr3, a16, a14, a15, str5, b11, b13, z11, z12)) {
                obj9 = "0";
            } else {
                obj9 = "1";
            }
            e10.p(P5.X.b(5, new Object[]{"AuthorizePurpose1", obj6, "AuthorizePurpose3", obj7, "AuthorizePurpose4", obj8, "AuthorizePurpose7", obj9, "PurposeDiagnostics", new String(cArr3)}, null).entrySet());
            u1Var = new u1(e10.d());
            str = "";
        } else {
            c0650n0 = c0650n02;
            String b15 = w1.b(p02, "IABTCF_VendorConsents");
            str = "";
            if (!str.equals(b15) && b15.length() > 754) {
                hashMap.put("GoogleConsent", String.valueOf(b15.charAt(754)));
            }
            int a17 = w1.a(p02, "IABTCF_gdprApplies");
            if (a17 != -1) {
                hashMap.put("gdprApplies", String.valueOf(a17));
            }
            int a18 = w1.a(p02, "IABTCF_EnableAdvertiserConsentMode");
            if (a18 != -1) {
                hashMap.put("EnableAdvertiserConsentMode", String.valueOf(a18));
            }
            int a19 = w1.a(p02, "IABTCF_PolicyVersion");
            if (a19 != -1) {
                hashMap.put("PolicyVersion", String.valueOf(a19));
            }
            String b16 = w1.b(p02, "IABTCF_PurposeConsents");
            if (!str.equals(b16)) {
                hashMap.put("PurposeConsents", b16);
            }
            int a20 = w1.a(p02, "IABTCF_CmpSdkID");
            if (a20 != -1) {
                hashMap.put("CmpSdkID", String.valueOf(a20));
            }
            u1Var = new u1(hashMap);
        }
        C0650n0 c0650n03 = c0650n0;
        V v9 = c0650n03.f11229i;
        C0650n0.f(v9);
        T t7 = v9.f10978n;
        t7.c(u1Var, "Tcf preferences read");
        boolean y02 = c0650n03.f11227g.y0(null, d9);
        K4.a aVar = c0650n03.f11233n;
        if (y02) {
            c0623e0.l0();
            String string = c0623e0.q0().getString("stored_tcf_param", str);
            HashMap hashMap2 = new HashMap();
            if (TextUtils.isEmpty(string)) {
                u1Var2 = new u1(hashMap2);
            } else {
                for (String str6 : string.split(";")) {
                    String[] split = str6.split("=");
                    if (split.length >= 2 && w1.f11342a.contains(split[0])) {
                        hashMap2.put(split[0], split[1]);
                    }
                }
                u1Var2 = new u1(hashMap2);
            }
            if (c0623e0.v0(u1Var)) {
                Bundle a21 = u1Var.a();
                C0650n0.f(v9);
                t7.c(a21, "Consent generated from Tcf");
                if (a21 != Bundle.EMPTY) {
                    aVar.getClass();
                    s02 = this;
                    s02.B0(a21, -30, System.currentTimeMillis());
                } else {
                    s02 = this;
                }
                Bundle bundle = new Bundle();
                HashMap hashMap3 = u1Var2.f11327a;
                if (hashMap3.isEmpty() || ((String) hashMap3.get("Version")) != null) {
                    str2 = "0";
                } else {
                    str2 = "1";
                }
                Bundle a22 = u1Var.a();
                Bundle a23 = u1Var2.a();
                if (a22.size() == a23.size() && Objects.equals(a22.getString("ad_storage"), a23.getString("ad_storage")) && Objects.equals(a22.getString("ad_personalization"), a23.getString("ad_personalization")) && Objects.equals(a22.getString("ad_user_data"), a23.getString("ad_user_data"))) {
                    str3 = "0";
                } else {
                    str3 = "1";
                }
                bundle.putString("_tcfm", str2.concat(str3));
                String str7 = (String) u1Var.f11327a.get("PurposeDiagnostics");
                if (TextUtils.isEmpty(str7)) {
                    str7 = "200000";
                }
                bundle.putString("_tcfd2", str7);
                bundle.putString("_tcfd", u1Var.b());
                s02.w0("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        if (c0623e0.v0(u1Var)) {
            Bundle a24 = u1Var.a();
            C0650n0.f(v9);
            t7.c(a24, "Consent generated from Tcf");
            if (a24 != Bundle.EMPTY) {
                aVar.getClass();
                B0(a24, -30, System.currentTimeMillis());
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_tcfd", u1Var.b());
            w0("auto", "_tcf", bundle2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r0 > 500) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        if (r5 > 500) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v0(java.lang.String r15, java.lang.String r16, android.os.Bundle r17, boolean r18, boolean r19, long r20) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.S0.v0(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    public final void w0(String str, String str2, Bundle bundle) {
        l0();
        ((C0650n0) this.f1707a).f11233n.getClass();
        x0(System.currentTimeMillis(), bundle, str, str2);
    }

    public final void x0(long j, Bundle bundle, String str, String str2) {
        l0();
        boolean z9 = true;
        if (this.f10944d != null && !P1.f1(str2)) {
            z9 = false;
        }
        y0(str, str2, j, bundle, true, z9, true);
    }

    public final void y0(String str, String str2, long j, Bundle bundle, boolean z9, boolean z10, boolean z11) {
        S0 s02;
        K4.a aVar;
        boolean z12;
        boolean z13;
        Bundle bundle2;
        long j4;
        boolean b9;
        S0 s03;
        String str3;
        C0650n0 c0650n0;
        long j9;
        long j10;
        String str4;
        boolean s04;
        Bundle[] bundleArr;
        int i9;
        int i10;
        Class<?> cls;
        String str5 = str;
        F4.y.e(str5);
        F4.y.h(bundle);
        l0();
        m0();
        C0650n0 c0650n02 = (C0650n0) this.f1707a;
        boolean a5 = c0650n02.a();
        V v8 = c0650n02.f11229i;
        if (a5) {
            List list = c0650n02.i().f10787k;
            if (list != null && !list.contains(str2)) {
                C0650n0.f(v8);
                v8.f10977m.d(str2, str5, "Dropping non-safelisted event. event name, origin");
                return;
            }
            if (!this.f10946f) {
                this.f10946f = true;
                try {
                    boolean z14 = c0650n02.f11225e;
                    Context context = c0650n02.f11221a;
                    if (!z14) {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader());
                    } else {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                    }
                    try {
                        cls.getDeclaredMethod("initialize", Context.class).invoke(null, context);
                    } catch (Exception e8) {
                        C0650n0.f(v8);
                        v8.f10974i.c(e8, "Failed to invoke Tag Manager's initialize() method");
                    }
                } catch (ClassNotFoundException unused) {
                    C0650n0.f(v8);
                    v8.f10976l.b("Tag Manager is not found and thus will not be used");
                }
            }
            boolean equals = "_cmp".equals(str2);
            K4.a aVar2 = c0650n02.f11233n;
            if (equals && bundle.containsKey("gclid")) {
                String string = bundle.getString("gclid");
                aVar2.getClass();
                aVar = aVar2;
                G0(System.currentTimeMillis(), string, "auto", "_lgclid");
                s02 = this;
            } else {
                s02 = this;
                aVar = aVar2;
            }
            P1 p12 = c0650n02.f11231l;
            C0623e0 c0623e0 = c0650n02.f11228h;
            if (z9 && !P1.j[0].equals(str2)) {
                C0650n0.d(p12);
                C0650n0.d(c0623e0);
                p12.C0(bundle, c0623e0.f11106z.w());
            }
            s4.i iVar = s02.f10962w;
            O o9 = c0650n02.f11232m;
            if (!z11 && !"_iap".equals(str2)) {
                C0650n0.d(p12);
                int i11 = 2;
                if (p12.Z0("event", str2)) {
                    if (!p12.W0("event", D0.f10574a, D0.f10575b, str2)) {
                        i11 = 13;
                    } else {
                        ((C0650n0) p12.f1707a).getClass();
                        if (p12.V0("event", 40, str2)) {
                            i11 = 0;
                        }
                    }
                }
                if (i11 != 0) {
                    C0650n0.f(v8);
                    v8.f10973h.c(o9.d(str2), "Invalid public event name. Event will not be logged (FE)");
                    C0650n0.d(p12);
                    String v02 = P1.v0(str2, true, 40);
                    if (str2 != null) {
                        i10 = str2.length();
                    } else {
                        i10 = 0;
                    }
                    P1.F0(iVar, null, i11, "_ev", v02, i10);
                    return;
                }
            }
            C0621d1 c0621d1 = c0650n02.f11234o;
            C0650n0.e(c0621d1);
            C0612a1 s05 = c0621d1.s0(false);
            if (s05 != null && !bundle.containsKey("_sc")) {
                s05.f11022d = true;
            }
            if (z9 && !z11) {
                z12 = true;
            } else {
                z12 = false;
            }
            P1.B0(s05, bundle, z12);
            boolean equals2 = "am".equals(str5);
            boolean f12 = P1.f1(str2);
            if (z9 && s02.f10944d != null && !f12) {
                if (equals2) {
                    bundle2 = bundle;
                    z13 = true;
                } else {
                    C0650n0.f(v8);
                    v8.f10977m.d(o9.d(str2), o9.b(bundle), "Passing event to registered event handler (FE)");
                    F4.y.h(s02.f10944d);
                    O0.c cVar = s02.f10944d;
                    cVar.getClass();
                    try {
                        ((com.google.android.gms.internal.measurement.Q) cVar.f5263b).t0(j, bundle, str5, str2);
                        return;
                    } catch (RemoteException e9) {
                        C0650n0 c0650n03 = ((AppMeasurementDynamiteService) cVar.f5264c).f15719e;
                        if (c0650n03 != null) {
                            V v9 = c0650n03.f11229i;
                            C0650n0.f(v9);
                            v9.f10974i.c(e9, "Event interceptor threw exception");
                            return;
                        }
                        return;
                    }
                }
            } else {
                z13 = equals2;
                bundle2 = bundle;
            }
            if (c0650n02.b()) {
                C0650n0.d(p12);
                int p13 = p12.p1(str2);
                if (p13 != 0) {
                    C0650n0.f(v8);
                    v8.f10973h.c(o9.d(str2), "Invalid event name. Event will not be logged (FE)");
                    String v03 = P1.v0(str2, true, 40);
                    if (str2 != null) {
                        i9 = str2.length();
                    } else {
                        i9 = 0;
                    }
                    C0650n0.d(p12);
                    P1.F0(iVar, null, p13, "_ev", v03, i9);
                    return;
                }
                Bundle p02 = p12.p0(str2, bundle2, Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si")), z11);
                F4.y.h(p02);
                C0650n0.e(c0621d1);
                C0612a1 s06 = c0621d1.s0(false);
                t1 t1Var = c0650n02.f11230k;
                boolean z15 = z13;
                if (s06 != null && "_ae".equals(str2)) {
                    C0650n0.e(t1Var);
                    N3.X x5 = t1Var.f11319f;
                    ((C0650n0) ((t1) x5.f5024d).f1707a).f11233n.getClass();
                    j4 = 0;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j11 = elapsedRealtime - x5.f5022b;
                    x5.f5022b = elapsedRealtime;
                    if (j11 > 0) {
                        p12.z0(p02, j11);
                    }
                } else {
                    j4 = 0;
                }
                boolean equals3 = "auto".equals(str5);
                C0650n0 c0650n04 = (C0650n0) p12.f1707a;
                if (!equals3 && "_ssr".equals(str2)) {
                    String string2 = p02.getString("_ffr");
                    int i12 = K4.d.f4302a;
                    if (string2 != null && !string2.trim().isEmpty()) {
                        if (string2 != null) {
                            string2 = string2.trim();
                        }
                    } else {
                        string2 = null;
                    }
                    C0623e0 c0623e02 = c0650n04.f11228h;
                    C0650n0.d(c0623e02);
                    if (!Objects.equals(string2, c0623e02.f11103w.m())) {
                        C0623e0 c0623e03 = c0650n04.f11228h;
                        C0650n0.d(c0623e03);
                        c0623e03.f11103w.n(string2);
                    } else {
                        V v10 = c0650n04.f11229i;
                        C0650n0.f(v10);
                        v10.f10977m.b("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                } else if ("_ae".equals(str2)) {
                    C0623e0 c0623e04 = c0650n04.f11228h;
                    C0650n0.d(c0623e04);
                    String m9 = c0623e04.f11103w.m();
                    if (!TextUtils.isEmpty(m9)) {
                        p02.putString("_ffr", m9);
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(p02);
                if (c0650n02.f11227g.y0(null, E.f10640b1)) {
                    C0650n0.e(t1Var);
                    t1Var.l0();
                    b9 = t1Var.f11317d;
                } else {
                    C0650n0.d(c0623e0);
                    b9 = c0623e0.f11100t.b();
                }
                C0650n0.d(c0623e0);
                if (c0623e0.f11097q.f() > j4) {
                    if (c0623e0.u0(j) && b9) {
                        C0650n0.f(v8);
                        v8.f10978n.b("Current session is expired, remove the session number, ID, and engagement time");
                        aVar.getClass();
                        c0650n0 = c0650n02;
                        str3 = "_ae";
                        j10 = j;
                        G0(System.currentTimeMillis(), null, "auto", "_sid");
                        aVar.getClass();
                        G0(System.currentTimeMillis(), null, "auto", "_sno");
                        aVar.getClass();
                        G0(System.currentTimeMillis(), null, "auto", "_se");
                        s03 = this;
                        j9 = j4;
                        c0623e0.f11098r.g(j9);
                    } else {
                        s03 = this;
                        str3 = "_ae";
                        c0650n0 = c0650n02;
                        j10 = j;
                        j9 = j4;
                    }
                } else {
                    s03 = this;
                    str3 = "_ae";
                    c0650n0 = c0650n02;
                    j9 = j4;
                    j10 = j;
                }
                if (p02.getLong("extend_session", j9) == 1) {
                    C0650n0.f(v8);
                    v8.f10978n.b("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    C0650n0.e(t1Var);
                    t1Var.f11318e.N(j10);
                }
                ArrayList arrayList2 = new ArrayList(p02.keySet());
                Collections.sort(arrayList2);
                int size = arrayList2.size();
                for (int i13 = 0; i13 < size; i13++) {
                    String str6 = (String) arrayList2.get(i13);
                    if (str6 != null) {
                        C0650n0.d(p12);
                        Object obj = p02.get(str6);
                        if (obj instanceof Bundle) {
                            bundleArr = new Bundle[]{(Bundle) obj};
                        } else if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList3 = (ArrayList) obj;
                            bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                        } else {
                            bundleArr = null;
                        }
                        if (bundleArr != null) {
                            p02.putParcelableArray(str6, bundleArr);
                        }
                    }
                }
                int i14 = 0;
                while (i14 < arrayList.size()) {
                    Bundle bundle3 = (Bundle) arrayList.get(i14);
                    if (i14 != 0) {
                        str4 = "_ep";
                    } else {
                        str4 = str2;
                    }
                    bundle3.putString("_o", str5);
                    if (z10) {
                        bundle3 = p12.y1(bundle3);
                    }
                    Bundle bundle4 = bundle3;
                    P1 p14 = p12;
                    C0665t c0665t = new C0665t(str4, new C0663s(bundle4), str5, j10);
                    C0648m1 m10 = c0650n0.m();
                    m10.getClass();
                    m10.l0();
                    m10.m0();
                    m10.D0();
                    N j12 = ((C0650n0) m10.f1707a).j();
                    j12.getClass();
                    Parcel obtain = Parcel.obtain();
                    android.support.v4.media.a.a(c0665t, obtain, 0);
                    byte[] marshall = obtain.marshall();
                    obtain.recycle();
                    if (marshall.length > 131072) {
                        V v11 = ((C0650n0) j12.f1707a).f11229i;
                        C0650n0.f(v11);
                        v11.f10972g.b("Event is too long for local database. Sending event directly to service");
                        s04 = false;
                    } else {
                        s04 = j12.s0(0, marshall);
                    }
                    m10.C0(new A4.k(m10, m10.z0(true), s04, c0665t, 2));
                    if (!z15) {
                        Iterator it = s03.f10945e.iterator();
                        while (it.hasNext()) {
                            ((E0) it.next()).a(j, new Bundle(bundle4), str, str2);
                        }
                    }
                    i14++;
                    j10 = j;
                    p12 = p14;
                    str5 = str;
                }
                C0650n0.e(c0621d1);
                if (c0621d1.s0(false) != null && str3.equals(str2)) {
                    C0650n0.e(t1Var);
                    aVar.getClass();
                    t1Var.f11319f.a(SystemClock.elapsedRealtime(), true, true);
                    return;
                }
                return;
            }
            return;
        }
        C0650n0.f(v8);
        v8.f10977m.b("Event not sent since app measurement is disabled");
    }

    public final void z0() {
        x1 x1Var;
        l0();
        this.f10953n = false;
        if (!J0().isEmpty() && !this.f10949i && (x1Var = (x1) J0().poll()) != null) {
            C0650n0 c0650n0 = (C0650n0) this.f1707a;
            P1 p12 = c0650n0.f11231l;
            C0650n0.d(p12);
            B0.d q02 = p12.q0();
            if (q02 != null) {
                this.f10949i = true;
                V v8 = c0650n0.f11229i;
                C0650n0.f(v8);
                T t7 = v8.f10978n;
                String str = x1Var.f11345a;
                t7.c(str, "Registering trigger URI");
                S5.p e8 = q02.e(Uri.parse(str));
                if (e8 == null) {
                    this.f10949i = false;
                    J0().add(x1Var);
                } else {
                    e8.a(new S5.o(e8, 0, new O0.c(this, x1Var, 13, false)), new D4.q(2, this));
                }
            }
        }
    }
}
