package b5;

import android.content.SharedPreferences;
import java.io.Serializable;

/* renamed from: b5.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0620d0 {

    /* renamed from: a, reason: collision with root package name */
    public long f11059a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11060b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f11061c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f11062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0676y0 f11063e;

    public /* synthetic */ C0620d0(J1 j12) {
        this.f11063e = j12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (r2 < java.lang.Math.max(0, ((java.lang.Integer) b5.E.j.a(null)).intValue())) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        if (r2 >= java.lang.Math.max(0, ((java.lang.Integer) b5.E.j.a(null)).intValue())) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(long r11, com.google.android.gms.internal.measurement.V0 r13) {
        /*
            r10 = this;
            java.io.Serializable r0 = r10.f11062d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto Ld
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f11062d = r0
        Ld:
            java.io.Serializable r0 = r10.f11061c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L1a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f11061c = r0
        L1a:
            java.io.Serializable r0 = r10.f11062d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L45
            java.io.Serializable r0 = r10.f11062d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.measurement.V0 r0 = (com.google.android.gms.internal.measurement.V0) r0
            long r2 = r0.q()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r6 = 60
            long r2 = r2 / r6
            long r2 = r2 / r6
            long r8 = r13.q()
            long r8 = r8 / r4
            long r8 = r8 / r6
            long r8 = r8 / r6
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto Lcc
        L45:
            long r2 = r10.f11059a
            int r0 = r13.d()
            long r4 = (long) r0
            long r2 = r2 + r4
            b5.y0 r0 = r10.f11063e
            b5.J1 r0 = (b5.J1) r0
            b5.g r4 = r0.h0()
            b5.D r5 = b5.E.r1
            r6 = 0
            boolean r4 = r4.y0(r6, r5)
            if (r4 == 0) goto L81
            java.io.Serializable r4 = r10.f11062d
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L9a
            r0.h0()
            b5.D r4 = b5.E.j
            java.lang.Object r4 = r4.a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = java.lang.Math.max(r1, r4)
            long r4 = (long) r4
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 >= 0) goto Lcc
            goto L9a
        L81:
            r0.h0()
            b5.D r4 = b5.E.j
            java.lang.Object r4 = r4.a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = java.lang.Math.max(r1, r4)
            long r4 = (long) r4
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L9a
            goto Lcc
        L9a:
            r10.f11059a = r2
            java.io.Serializable r2 = r10.f11062d
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r13)
            java.io.Serializable r13 = r10.f11061c
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r13.add(r11)
            java.io.Serializable r11 = r10.f11062d
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            int r11 = r11.size()
            r0.h0()
            b5.D r12 = b5.E.f10664k
            java.lang.Object r12 = r12.a(r6)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r13 = 1
            int r12 = java.lang.Math.max(r13, r12)
            if (r11 < r12) goto Lcd
        Lcc:
            return r1
        Lcd:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0620d0.a(long, com.google.android.gms.internal.measurement.V0):boolean");
    }

    public void b() {
        C0623e0 c0623e0 = (C0623e0) this.f11063e;
        c0623e0.l0();
        ((C0650n0) c0623e0.f1707a).f11233n.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = c0623e0.q0().edit();
        edit.remove((String) this.f11061c);
        edit.remove((String) this.f11062d);
        edit.putLong((String) this.f11060b, currentTimeMillis);
        edit.apply();
    }

    public /* synthetic */ C0620d0(C0623e0 c0623e0, long j) {
        this.f11063e = c0623e0;
        F4.y.e("health_monitor");
        F4.y.b(j > 0);
        this.f11060b = "health_monitor:start";
        this.f11061c = "health_monitor:count";
        this.f11062d = "health_monitor:value";
        this.f11059a = j;
    }
}
