package b5;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: b5.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0621d1 extends B {

    /* renamed from: c, reason: collision with root package name */
    public volatile C0612a1 f11064c;

    /* renamed from: d, reason: collision with root package name */
    public volatile C0612a1 f11065d;

    /* renamed from: e, reason: collision with root package name */
    public C0612a1 f11066e;

    /* renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap f11067f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.W f11068g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f11069h;

    /* renamed from: i, reason: collision with root package name */
    public volatile C0612a1 f11070i;
    public C0612a1 j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11071k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f11072l;

    public C0621d1(C0650n0 c0650n0) {
        super(c0650n0);
        this.f11072l = new Object();
        this.f11067f = new ConcurrentHashMap();
    }

    @Override // b5.B
    public final boolean o0() {
        return false;
    }

    public final void p0(String str, C0612a1 c0612a1, boolean z9) {
        C0612a1 c0612a12;
        C0612a1 c0612a13;
        String str2;
        if (this.f11064c == null) {
            c0612a12 = this.f11065d;
        } else {
            c0612a12 = this.f11064c;
        }
        C0612a1 c0612a14 = c0612a12;
        if (c0612a1.f11020b == null) {
            if (str != null) {
                str2 = t0(str);
            } else {
                str2 = null;
            }
            c0612a13 = new C0612a1(c0612a1.f11019a, str2, c0612a1.f11021c, c0612a1.f11023e, c0612a1.f11024f);
        } else {
            c0612a13 = c0612a1;
        }
        this.f11065d = this.f11064c;
        this.f11064c = c0612a13;
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        c0650n0.f11233n.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C0647m0 c0647m0 = c0650n0.j;
        C0650n0.f(c0647m0);
        c0647m0.v0(new RunnableC0615b1(this, c0612a13, c0612a14, elapsedRealtime, z9));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q0(b5.C0612a1 r18, b5.C0612a1 r19, long r20, boolean r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0621d1.q0(b5.a1, b5.a1, long, boolean, android.os.Bundle):void");
    }

    public final void r0(C0612a1 c0612a1, boolean z9, long j) {
        boolean z10;
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        C0677z c0677z = c0650n0.f11236q;
        C0650n0.c(c0677z);
        c0650n0.f11233n.getClass();
        c0677z.o0(SystemClock.elapsedRealtime());
        if (c0612a1 != null && c0612a1.f11022d) {
            z10 = true;
        } else {
            z10 = false;
        }
        t1 t1Var = c0650n0.f11230k;
        C0650n0.e(t1Var);
        if (t1Var.f11319f.a(j, z10, z9) && c0612a1 != null) {
            c0612a1.f11022d = false;
        }
    }

    public final C0612a1 s0(boolean z9) {
        m0();
        l0();
        if (!z9) {
            return this.f11066e;
        }
        C0612a1 c0612a1 = this.f11066e;
        if (c0612a1 != null) {
            return c0612a1;
        }
        return this.j;
    }

    public final String t0(String str) {
        String str2;
        if (str == null) {
            return "Activity";
        }
        String[] split = str.split("\\.");
        int length = split.length;
        if (length > 0) {
            str2 = split[length - 1];
        } else {
            str2 = "";
        }
        int length2 = str2.length();
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        c0650n0.f11227g.getClass();
        if (length2 > 500) {
            c0650n0.f11227g.getClass();
            return str2.substring(0, 500);
        }
        return str2;
    }

    public final void u0(com.google.android.gms.internal.measurement.W w7, Bundle bundle) {
        Bundle bundle2;
        if (((C0650n0) this.f1707a).f11227g.z0() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f11067f.put(Integer.valueOf(w7.f15322a), new C0612a1(bundle2.getLong("id"), bundle2.getString("name"), bundle2.getString("referrer_name")));
        }
    }

    public final C0612a1 v0(com.google.android.gms.internal.measurement.W w7) {
        F4.y.h(w7);
        Integer valueOf = Integer.valueOf(w7.f15322a);
        ConcurrentHashMap concurrentHashMap = this.f11067f;
        C0612a1 c0612a1 = (C0612a1) concurrentHashMap.get(valueOf);
        if (c0612a1 == null) {
            String t02 = t0(w7.f15323b);
            P1 p12 = ((C0650n0) this.f1707a).f11231l;
            C0650n0.d(p12);
            C0612a1 c0612a12 = new C0612a1(p12.w1(), null, t02);
            concurrentHashMap.put(valueOf, c0612a12);
            c0612a1 = c0612a12;
        }
        if (this.f11070i != null) {
            return this.f11070i;
        }
        return c0612a1;
    }
}
