package com.google.android.gms.internal.cast;

import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import u4.C2079d;

/* loaded from: classes.dex */
public final class i3 {

    /* renamed from: v, reason: collision with root package name */
    public static final y4.b f14868v = new y4.b("SessionFlowSummary", null);

    /* renamed from: w, reason: collision with root package name */
    public static final String f14869w = "22.1.0";

    /* renamed from: x, reason: collision with root package name */
    public static long f14870x = System.currentTimeMillis();

    /* renamed from: f, reason: collision with root package name */
    public final Y f14876f;

    /* renamed from: g, reason: collision with root package name */
    public final String f14877g;

    /* renamed from: i, reason: collision with root package name */
    public final long f14879i;
    public C2079d j;

    /* renamed from: k, reason: collision with root package name */
    public String f14880k;

    /* renamed from: l, reason: collision with root package name */
    public String f14881l;

    /* renamed from: m, reason: collision with root package name */
    public C0816e1 f14882m;

    /* renamed from: n, reason: collision with root package name */
    public String f14883n;

    /* renamed from: o, reason: collision with root package name */
    public String f14884o;

    /* renamed from: p, reason: collision with root package name */
    public String f14885p;

    /* renamed from: q, reason: collision with root package name */
    public String f14886q;

    /* renamed from: r, reason: collision with root package name */
    public String f14887r;

    /* renamed from: s, reason: collision with root package name */
    public String f14888s;

    /* renamed from: u, reason: collision with root package name */
    public int f14890u;

    /* renamed from: a, reason: collision with root package name */
    public final W f14871a = new W(new C0886w0(22));

    /* renamed from: b, reason: collision with root package name */
    public final List f14872b = Collections.synchronizedList(new ArrayList());

    /* renamed from: c, reason: collision with root package name */
    public final List f14873c = Collections.synchronizedList(new ArrayList());

    /* renamed from: d, reason: collision with root package name */
    public final List f14874d = Collections.synchronizedList(new ArrayList());

    /* renamed from: e, reason: collision with root package name */
    public final Map f14875e = Collections.synchronizedMap(new HashMap());

    /* renamed from: t, reason: collision with root package name */
    public int f14889t = 0;

    /* renamed from: h, reason: collision with root package name */
    public final long f14878h = System.currentTimeMillis();

    public i3(Y y9, String str) {
        this.f14876f = y9;
        this.f14877g = str;
        long j = f14870x;
        f14870x = 1 + j;
        this.f14879i = j;
    }

    public final void a(C2079d c2079d) {
        if (c2079d == null) {
            b(2);
            return;
        }
        F4.y.d();
        CastDevice castDevice = c2079d.f23683k;
        if (castDevice == null) {
            b(3);
            return;
        }
        this.j = c2079d;
        String str = this.f14881l;
        String str2 = castDevice.f14593l;
        if (str == null) {
            this.f14881l = str2;
            this.f14883n = castDevice.f14587e;
            this.f14889t = castDevice.i();
            y4.d k5 = castDevice.k();
            if (k5 != null) {
                this.f14884o = k5.f24924d;
                this.f14885p = k5.f24925e;
                this.f14886q = k5.f24926f;
                this.f14887r = k5.f24927g;
                this.f14888s = k5.f24928h;
            }
            c2079d.b();
            return;
        }
        if (!TextUtils.equals(str, str2)) {
            b(5);
        }
    }

    public final void b(int i9) {
        Integer valueOf = Integer.valueOf(i9 - 1);
        Map map = this.f14875e;
        C0818f c0818f = (C0818f) map.get(valueOf);
        if (c0818f == null) {
            C0818f c0818f2 = new C0818f(new e1.q(i9));
            c0818f2.f14838c = this.f14878h;
            map.put(valueOf, c0818f2);
        } else {
            c0818f.f14839d.incrementAndGet();
            c0818f.f14837b = System.currentTimeMillis();
        }
    }
}
