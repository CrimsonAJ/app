package b5;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicInteger;
import z2.C2235a;

/* renamed from: b5.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0650n0 implements InterfaceC0676y0 {

    /* renamed from: f0, reason: collision with root package name */
    public static volatile C0650n0 f11214f0;

    /* renamed from: A, reason: collision with root package name */
    public long f11215A;

    /* renamed from: B, reason: collision with root package name */
    public volatile Boolean f11216B;

    /* renamed from: C, reason: collision with root package name */
    public volatile boolean f11217C;

    /* renamed from: D, reason: collision with root package name */
    public int f11218D;

    /* renamed from: X, reason: collision with root package name */
    public int f11219X;

    /* renamed from: Z, reason: collision with root package name */
    public final long f11220Z;

    /* renamed from: a, reason: collision with root package name */
    public final Context f11221a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11222b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11223c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11224d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11225e;

    /* renamed from: f, reason: collision with root package name */
    public final C2235a f11226f;

    /* renamed from: g, reason: collision with root package name */
    public final C0628g f11227g;

    /* renamed from: h, reason: collision with root package name */
    public final C0623e0 f11228h;

    /* renamed from: i, reason: collision with root package name */
    public final V f11229i;
    public final C0647m0 j;

    /* renamed from: k, reason: collision with root package name */
    public final t1 f11230k;

    /* renamed from: l, reason: collision with root package name */
    public final P1 f11231l;

    /* renamed from: m, reason: collision with root package name */
    public final O f11232m;

    /* renamed from: n, reason: collision with root package name */
    public final K4.a f11233n;

    /* renamed from: o, reason: collision with root package name */
    public final C0621d1 f11234o;

    /* renamed from: p, reason: collision with root package name */
    public final S0 f11235p;

    /* renamed from: q, reason: collision with root package name */
    public final C0677z f11236q;

    /* renamed from: r, reason: collision with root package name */
    public final W0 f11237r;

    /* renamed from: s, reason: collision with root package name */
    public final String f11238s;

    /* renamed from: t, reason: collision with root package name */
    public N f11239t;

    /* renamed from: u, reason: collision with root package name */
    public C0648m1 f11240u;

    /* renamed from: v, reason: collision with root package name */
    public C0658q f11241v;

    /* renamed from: w, reason: collision with root package name */
    public L f11242w;

    /* renamed from: x, reason: collision with root package name */
    public X0 f11243x;

    /* renamed from: z, reason: collision with root package name */
    public Boolean f11245z;

    /* renamed from: y, reason: collision with root package name */
    public boolean f11244y = false;
    public final AtomicInteger Y = new AtomicInteger(0);

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008f, code lost:
    
        throw r11;
     */
    /* JADX WARN: Type inference failed for: r3v6, types: [b5.g, D.n] */
    /* JADX WARN: Type inference failed for: r5v4, types: [b5.W0, b5.x0] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, O5.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0650n0(b5.F0 r11) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0650n0.<init>(b5.F0):void");
    }

    public static final void c(AbstractC0609A abstractC0609A) {
        if (abstractC0609A != null) {
        } else {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void d(D.n nVar) {
        if (nVar != null) {
        } else {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void e(B b9) {
        if (b9 != null) {
            if (b9.f10556b) {
                return;
            } else {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(b9.getClass())));
            }
        }
        throw new IllegalStateException("Component not created");
    }

    public static final void f(AbstractC0674x0 abstractC0674x0) {
        if (abstractC0674x0 != null) {
            if (abstractC0674x0.f11344b) {
                return;
            } else {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC0674x0.getClass())));
            }
        }
        throw new IllegalStateException("Component not created");
    }

    public static C0650n0 l(Context context, com.google.android.gms.internal.measurement.U u9, Long l9) {
        Bundle bundle;
        if (u9 != null && (u9.f15307e == null || u9.f15308f == null)) {
            u9 = new com.google.android.gms.internal.measurement.U(u9.f15303a, u9.f15304b, u9.f15305c, u9.f15306d, null, null, u9.f15309g, null);
        }
        F4.y.h(context);
        F4.y.h(context.getApplicationContext());
        if (f11214f0 == null) {
            synchronized (C0650n0.class) {
                try {
                    if (f11214f0 == null) {
                        f11214f0 = new C0650n0(new F0(context, u9, l9));
                    }
                } finally {
                }
            }
        } else if (u9 != null && (bundle = u9.f15309g) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            F4.y.h(f11214f0);
            f11214f0.f11216B = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        F4.y.h(f11214f0);
        return f11214f0;
    }

    @Override // b5.InterfaceC0676y0
    public final V A() {
        V v8 = this.f11229i;
        f(v8);
        return v8;
    }

    @Override // b5.InterfaceC0676y0
    public final Context G() {
        return this.f11221a;
    }

    @Override // b5.InterfaceC0676y0
    public final C0647m0 K() {
        C0647m0 c0647m0 = this.j;
        f(c0647m0);
        return c0647m0;
    }

    @Override // b5.InterfaceC0676y0
    public final K4.a S() {
        return this.f11233n;
    }

    public final boolean a() {
        if (g() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r6.f11215A) > 1000) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            r6 = this;
            boolean r0 = r6.f11244y
            if (r0 == 0) goto Lbb
            b5.m0 r0 = r6.j
            f(r0)
            r0.l0()
            java.lang.Boolean r0 = r6.f11245z
            K4.a r1 = r6.f11233n
            if (r0 == 0) goto L34
            long r2 = r6.f11215A
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L34
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lb4
            r1.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r6.f11215A
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto Lb4
        L34:
            r1.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.f11215A = r0
            b5.P1 r0 = r6.f11231l
            d(r0)
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = r0.a1(r1)
            b5.g r2 = r6.f11227g
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L76
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r0.a1(r1)
            if (r1 == 0) goto L76
            android.content.Context r1 = r6.f11221a
            M4.b r5 = M4.c.a(r1)
            boolean r5 = r5.d()
            if (r5 != 0) goto L74
            boolean r5 = r2.o0()
            if (r5 != 0) goto L74
            boolean r5 = b5.P1.h1(r1)
            if (r5 == 0) goto L76
            boolean r1 = b5.P1.j1(r1)
            if (r1 == 0) goto L76
        L74:
            r1 = r3
            goto L77
        L76:
            r1 = r4
        L77:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            r6.f11245z = r5
            if (r1 == 0) goto Lb4
            b5.L r1 = r6.i()
            java.lang.String r1 = r1.s0()
            b5.L r5 = r6.i()
            java.lang.String r5 = r5.q0()
            boolean r0 = r0.U0(r1, r5)
            if (r0 != 0) goto Lae
            r0 = 0
            b5.D r1 = b5.E.f10684q1
            boolean r0 = r2.y0(r0, r1)
            if (r0 != 0) goto Lad
            b5.L r0 = r6.i()
            java.lang.String r0 = r0.q0()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lad
            goto Lae
        Lad:
            r3 = r4
        Lae:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r6.f11245z = r0
        Lb4:
            java.lang.Boolean r0 = r6.f11245z
            boolean r0 = r0.booleanValue()
            return r0
        Lbb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0650n0.b():boolean");
    }

    public final int g() {
        Boolean bool;
        C0647m0 c0647m0 = this.j;
        f(c0647m0);
        c0647m0.l0();
        C0628g c0628g = this.f11227g;
        if (c0628g.m0()) {
            return 1;
        }
        f(c0647m0);
        c0647m0.l0();
        if (this.f11217C) {
            C0623e0 c0623e0 = this.f11228h;
            d(c0623e0);
            c0623e0.l0();
            if (c0623e0.q0().contains("measurement_enabled")) {
                bool = Boolean.valueOf(c0623e0.q0().getBoolean("measurement_enabled", true));
            } else {
                bool = null;
            }
            if (bool != null) {
                if (!bool.booleanValue()) {
                    return 3;
                }
                return 0;
            }
            C2235a c2235a = ((C0650n0) c0628g.f1707a).f11226f;
            Boolean w02 = c0628g.w0("firebase_analytics_collection_enabled");
            if (w02 != null) {
                if (!w02.booleanValue()) {
                    return 4;
                }
                return 0;
            }
            if (this.f11216B != null && !this.f11216B.booleanValue()) {
                return 7;
            }
            return 0;
        }
        return 8;
    }

    public final C0658q h() {
        f(this.f11241v);
        return this.f11241v;
    }

    public final L i() {
        e(this.f11242w);
        return this.f11242w;
    }

    public final N j() {
        e(this.f11239t);
        return this.f11239t;
    }

    public final O k() {
        return this.f11232m;
    }

    public final C0648m1 m() {
        e(this.f11240u);
        return this.f11240u;
    }

    public final String n() {
        if (this.f11227g.y0(null, E.f10684q1)) {
            return null;
        }
        return this.f11222b;
    }

    @Override // b5.InterfaceC0676y0
    public final C2235a p() {
        return this.f11226f;
    }
}
