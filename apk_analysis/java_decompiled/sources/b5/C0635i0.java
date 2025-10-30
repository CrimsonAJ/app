package b5;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C0954k2;
import com.google.android.gms.internal.measurement.C0974o2;
import com.google.android.gms.internal.measurement.C0978p1;
import com.google.android.gms.internal.measurement.C0983q1;
import com.google.android.gms.internal.measurement.C1016x0;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import l1.C1535g;
import s.C1935e;
import s.C1939i;

/* renamed from: b5.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0635i0 extends D1 implements InterfaceC0625f {

    /* renamed from: d, reason: collision with root package name */
    public final C1935e f11140d;

    /* renamed from: e, reason: collision with root package name */
    public final C1935e f11141e;

    /* renamed from: f, reason: collision with root package name */
    public final C1935e f11142f;

    /* renamed from: g, reason: collision with root package name */
    public final C1935e f11143g;

    /* renamed from: h, reason: collision with root package name */
    public final C1935e f11144h;

    /* renamed from: i, reason: collision with root package name */
    public final C1935e f11145i;
    public final A1.f j;

    /* renamed from: k, reason: collision with root package name */
    public final s4.i f11146k;

    /* renamed from: l, reason: collision with root package name */
    public final C1935e f11147l;

    /* renamed from: m, reason: collision with root package name */
    public final C1935e f11148m;

    /* renamed from: n, reason: collision with root package name */
    public final C1935e f11149n;

    /* JADX WARN: Type inference failed for: r2v1, types: [s.e, s.i] */
    /* JADX WARN: Type inference failed for: r2v2, types: [s.e, s.i] */
    /* JADX WARN: Type inference failed for: r2v3, types: [s.e, s.i] */
    /* JADX WARN: Type inference failed for: r2v4, types: [s.e, s.i] */
    /* JADX WARN: Type inference failed for: r2v5, types: [s.e, s.i] */
    /* JADX WARN: Type inference failed for: r2v6, types: [s.e, s.i] */
    /* JADX WARN: Type inference failed for: r2v7, types: [s.e, s.i] */
    /* JADX WARN: Type inference failed for: r2v8, types: [s.e, s.i] */
    /* JADX WARN: Type inference failed for: r2v9, types: [s.e, s.i] */
    public C0635i0(J1 j12) {
        super(j12);
        this.f11140d = new C1939i(0);
        this.f11141e = new C1939i(0);
        this.f11142f = new C1939i(0);
        this.f11143g = new C1939i(0);
        this.f11144h = new C1939i(0);
        this.f11147l = new C1939i(0);
        this.f11148m = new C1939i(0);
        this.f11149n = new C1939i(0);
        this.f11145i = new C1939i(0);
        this.j = new A1.f(this);
        this.f11146k = new s4.i(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [s.e, s.i] */
    public static final C1935e v0(com.google.android.gms.internal.measurement.F0 f02) {
        ?? c1939i = new C1939i(0);
        for (com.google.android.gms.internal.measurement.J0 j02 : f02.A()) {
            c1939i.put(j02.n(), j02.o());
        }
        return c1939i;
    }

    public static final B0 w0(int i9) {
        int i10 = i9 - 1;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return null;
                    }
                    return B0.AD_PERSONALIZATION;
                }
                return B0.AD_USER_DATA;
            }
            return B0.ANALYTICS_STORAGE;
        }
        return B0.AD_STORAGE;
    }

    public final com.google.android.gms.internal.measurement.F0 A0(String str) {
        m0();
        l0();
        F4.y.e(str);
        t0(str);
        return (com.google.android.gms.internal.measurement.F0) this.f11144h.get(str);
    }

    public final String B0(String str) {
        l0();
        t0(str);
        return (String) this.f11147l.get(str);
    }

    public final boolean C0(String str, B0 b02) {
        l0();
        t0(str);
        com.google.android.gms.internal.measurement.A0 z02 = z0(str);
        if (z02 != null) {
            for (C1016x0 c1016x0 : z02.p()) {
                if (b02 == w0(c1016x0.o())) {
                    if (c1016x0.n() == 2) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public final boolean D0(String str, String str2) {
        Boolean bool;
        l0();
        t0(str);
        if (!"ecommerce_purchase".equals(str2) && !"purchase".equals(str2) && !"refund".equals(str2)) {
            Map map = (Map) this.f11143g.get(str);
            if (map != null && (bool = (Boolean) map.get(str2)) != null) {
                return bool.booleanValue();
            }
            return false;
        }
        return true;
    }

    public final boolean E0(String str, String str2) {
        Boolean bool;
        l0();
        t0(str);
        if (!"1".equals(o(str, "measurement.upload.blacklist_internal")) || !P1.f1(str2)) {
            if ("1".equals(o(str, "measurement.upload.blacklist_public")) && P1.g1(str2)) {
                return true;
            }
            Map map = (Map) this.f11142f.get(str);
            if (map != null && (bool = (Boolean) map.get(str2)) != null) {
                return bool.booleanValue();
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0462, code lost:
    
        r10.m0();
        r10.l0();
        F4.y.e(r32);
        r0 = r10.h1();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r32, java.lang.String.valueOf(r26)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r32, java.lang.String.valueOf(r26)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0485, code lost:
    
        r1 = r24;
        r3 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0344, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0328, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02d3, code lost:
    
        r0 = r5.f11229i;
        b5.C0650n0.f(r0);
        r0 = r0.f10974i;
        r3 = b5.V.t0(r32);
        r4 = java.lang.Integer.valueOf(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02e8, code lost:
    
        if (r9.A() == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02ea, code lost:
    
        r5 = java.lang.Integer.valueOf(r9.o());
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02f7, code lost:
    
        r0.e("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
        r26 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02f6, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0388, code lost:
    
        r26 = r6;
        r6 = r23.t().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0396, code lost:
    
        if (r6.hasNext() == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0398, code lost:
    
        r8 = (com.google.android.gms.internal.measurement.C1006v0) r6.next();
        r10.m0();
        r10.l0();
        F4.y.e(r32);
        F4.y.h(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x03b2, code lost:
    
        if (r8.q().isEmpty() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03de, code lost:
    
        r9 = r8.c();
        r23 = r6;
        r6 = new android.content.ContentValues();
        r6.put(r3, r32);
        r27 = r3;
        r6.put("audience_id", java.lang.Integer.valueOf(r26));
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x03f9, code lost:
    
        if (r8.v() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x03fb, code lost:
    
        r3 = java.lang.Integer.valueOf(r8.n());
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0405, code lost:
    
        r6.put(r0, r3);
        r28 = r0;
        r6.put("property_name", r8.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0417, code lost:
    
        if (r8.w() == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0419, code lost:
    
        r0 = java.lang.Boolean.valueOf(r8.u());
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0423, code lost:
    
        r6.put("session_scoped", r0);
        r6.put("data", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0435, code lost:
    
        if (r10.h1().insertWithOnConflict("property_filters", null, r6, 5) != (-1)) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x044a, code lost:
    
        r6 = r23;
        r3 = r27;
        r0 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0437, code lost:
    
        r0 = r5.f11229i;
        b5.C0650n0.f(r0);
        r0.f10971f.c(b5.V.t0(r32), "Failed to insert property filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0448, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0452, code lost:
    
        r1 = r5.f11229i;
        b5.C0650n0.f(r1);
        r1.f10971f.d(b5.V.t0(r32), r0, "Error storing property filter. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0422, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0404, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03b4, code lost:
    
        r0 = r5.f11229i;
        b5.C0650n0.f(r0);
        r0 = r0.f10974i;
        r3 = b5.V.t0(r32);
        r4 = java.lang.Integer.valueOf(r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03c9, code lost:
    
        if (r8.v() == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03cb, code lost:
    
        r5 = java.lang.Integer.valueOf(r8.n());
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03d5, code lost:
    
        r0.e("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03d4, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0267, code lost:
    
        r8 = r0.t().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0273, code lost:
    
        if (r8.hasNext() == false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x027f, code lost:
    
        if (((com.google.android.gms.internal.measurement.C1006v0) r8.next()).v() != false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0281, code lost:
    
        r0 = r5.f11229i;
        b5.C0650n0.f(r0);
        r0.f10974i.d(b5.V.t0(r32), java.lang.Integer.valueOf(r6), "Property filter with no ID. Audience definition ignored. appId, audienceId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0297, code lost:
    
        r8 = r0.s().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02a3, code lost:
    
        r23 = r0;
        r0 = "filter_id";
        r24 = r1;
        r25 = r3;
        r3 = "app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02b5, code lost:
    
        if (r8.hasNext() == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02b7, code lost:
    
        r9 = (com.google.android.gms.internal.measurement.C0972o0) r8.next();
        r10.m0();
        r10.l0();
        F4.y.e(r32);
        F4.y.h(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02d1, code lost:
    
        if (r9.s().isEmpty() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0302, code lost:
    
        r26 = r6;
        r6 = r9.c();
        r27 = r8;
        r8 = new android.content.ContentValues();
        r8.put("app_id", r32);
        r8.put("audience_id", java.lang.Integer.valueOf(r26));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x031d, code lost:
    
        if (r9.A() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x031f, code lost:
    
        r1 = java.lang.Integer.valueOf(r9.o());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0329, code lost:
    
        r8.put("filter_id", r1);
        r8.put("event_name", r9.s());
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0339, code lost:
    
        if (r9.B() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x033b, code lost:
    
        r0 = java.lang.Boolean.valueOf(r9.y());
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0345, code lost:
    
        r8.put("session_scoped", r0);
        r8.put("data", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0357, code lost:
    
        if (r10.h1().insertWithOnConflict("event_filters", null, r8, 5) != (-1)) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0359, code lost:
    
        r0 = r5.f11229i;
        b5.C0650n0.f(r0);
        r0.f10971f.c(b5.V.t0(r32), "Failed to insert event filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0369, code lost:
    
        r0 = r23;
        r1 = r24;
        r3 = r25;
        r6 = r26;
        r8 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0375, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0376, code lost:
    
        r1 = r5.f11229i;
        b5.C0650n0.f(r1);
        r1.f10971f.d(b5.V.t0(r32), r0, "Error storing event filter. appId");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F0(java.lang.String r32, java.lang.String r33, java.lang.String r34, byte[] r35) {
        /*
            Method dump skipped, instructions count: 1557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0635i0.F0(java.lang.String, java.lang.String, java.lang.String, byte[]):void");
    }

    @Override // b5.InterfaceC0625f
    public final String o(String str, String str2) {
        l0();
        t0(str);
        Map map = (Map) this.f11140d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final boolean p0(String str) {
        l0();
        t0(str);
        C1935e c1935e = this.f11141e;
        if (c1935e.get(str) != null && ((Set) c1935e.get(str)).contains("app_instance_id")) {
            return true;
        }
        return false;
    }

    public final boolean q0(String str) {
        l0();
        t0(str);
        C1935e c1935e = this.f11141e;
        if (c1935e.get(str) != null) {
            if (((Set) c1935e.get(str)).contains("os_version") || ((Set) c1935e.get(str)).contains("device_info")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final com.google.android.gms.internal.measurement.F0 r0(String str, byte[] bArr) {
        Long l9;
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.F0.t();
        }
        try {
            com.google.android.gms.internal.measurement.F0 f02 = (com.google.android.gms.internal.measurement.F0) ((com.google.android.gms.internal.measurement.E0) Z.R0(com.google.android.gms.internal.measurement.F0.s(), bArr)).h();
            V v8 = c0650n0.f11229i;
            C0650n0.f(v8);
            T t7 = v8.f10978n;
            String str2 = null;
            if (f02.H()) {
                l9 = Long.valueOf(f02.p());
            } else {
                l9 = null;
            }
            if (f02.F()) {
                str2 = f02.v();
            }
            t7.d(l9, str2, "Parsed config. version, gmp_app_id");
            return f02;
        } catch (C0954k2 e8) {
            V v9 = c0650n0.f11229i;
            C0650n0.f(v9);
            v9.f10974i.d(V.t0(str), e8, "Unable to merge remote config. appId");
            return com.google.android.gms.internal.measurement.F0.t();
        } catch (RuntimeException e9) {
            V v10 = c0650n0.f11229i;
            C0650n0.f(v10);
            v10.f10974i.d(V.t0(str), e9, "Unable to merge remote config. appId");
            return com.google.android.gms.internal.measurement.F0.t();
        }
    }

    public final void s0(String str, com.google.android.gms.internal.measurement.E0 e02) {
        HashSet hashSet = new HashSet();
        C1939i c1939i = new C1939i(0);
        C1939i c1939i2 = new C1939i(0);
        C1939i c1939i3 = new C1939i(0);
        Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.F0) e02.f15439b).y()).iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.android.gms.internal.measurement.B0) it.next()).n());
        }
        for (int i9 = 0; i9 < ((com.google.android.gms.internal.measurement.F0) e02.f15439b).o(); i9++) {
            com.google.android.gms.internal.measurement.C0 c02 = (com.google.android.gms.internal.measurement.C0) ((com.google.android.gms.internal.measurement.F0) e02.f15439b).r(i9).f();
            boolean isEmpty = c02.k().isEmpty();
            C0650n0 c0650n0 = (C0650n0) this.f1707a;
            if (isEmpty) {
                V v8 = c0650n0.f11229i;
                C0650n0.f(v8);
                v8.f10974i.b("EventConfig contained null event name");
            } else {
                String k5 = c02.k();
                String d9 = D0.d(c02.k(), D0.f10574a, D0.f10576c);
                if (!TextUtils.isEmpty(d9)) {
                    c02.j();
                    com.google.android.gms.internal.measurement.D0.p((com.google.android.gms.internal.measurement.D0) c02.f15439b, d9);
                    e02.j();
                    com.google.android.gms.internal.measurement.F0.D((com.google.android.gms.internal.measurement.F0) e02.f15439b, i9, (com.google.android.gms.internal.measurement.D0) c02.h());
                }
                if (((com.google.android.gms.internal.measurement.D0) c02.f15439b).s() && ((com.google.android.gms.internal.measurement.D0) c02.f15439b).q()) {
                    c1939i.put(k5, Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.D0) c02.f15439b).t() && ((com.google.android.gms.internal.measurement.D0) c02.f15439b).r()) {
                    c1939i2.put(c02.k(), Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.D0) c02.f15439b).u()) {
                    if (((com.google.android.gms.internal.measurement.D0) c02.f15439b).n() >= 2 && ((com.google.android.gms.internal.measurement.D0) c02.f15439b).n() <= 65535) {
                        c1939i3.put(c02.k(), Integer.valueOf(((com.google.android.gms.internal.measurement.D0) c02.f15439b).n()));
                    } else {
                        V v9 = c0650n0.f11229i;
                        C0650n0.f(v9);
                        v9.f10974i.d(c02.k(), Integer.valueOf(((com.google.android.gms.internal.measurement.D0) c02.f15439b).n()), "Invalid sampling rate. Event name, sample rate");
                    }
                }
            }
        }
        this.f11141e.put(str, hashSet);
        this.f11142f.put(str, c1939i);
        this.f11143g.put(str, c1939i2);
        this.f11145i.put(str, c1939i3);
    }

    public final void t0(String str) {
        m0();
        l0();
        F4.y.e(str);
        C1935e c1935e = this.f11144h;
        if (c1935e.get(str) == null) {
            C0649n c0649n = this.f11361b.f10744c;
            J1.J(c0649n);
            android.support.v4.media.session.y k12 = c0649n.k1(str);
            C1935e c1935e2 = this.f11149n;
            C1935e c1935e3 = this.f11148m;
            C1935e c1935e4 = this.f11147l;
            C1935e c1935e5 = this.f11140d;
            if (k12 == null) {
                c1935e5.put(str, null);
                this.f11142f.put(str, null);
                this.f11141e.put(str, null);
                this.f11143g.put(str, null);
                c1935e.put(str, null);
                c1935e4.put(str, null);
                c1935e3.put(str, null);
                c1935e2.put(str, null);
                this.f11145i.put(str, null);
                return;
            }
            com.google.android.gms.internal.measurement.E0 e02 = (com.google.android.gms.internal.measurement.E0) r0(str, (byte[]) k12.f9331b).f();
            s0(str, e02);
            c1935e5.put(str, v0((com.google.android.gms.internal.measurement.F0) e02.h()));
            c1935e.put(str, (com.google.android.gms.internal.measurement.F0) e02.h());
            u0(str, (com.google.android.gms.internal.measurement.F0) e02.h());
            c1935e4.put(str, ((com.google.android.gms.internal.measurement.F0) e02.f15439b).w());
            c1935e3.put(str, (String) k12.f9332c);
            c1935e2.put(str, (String) k12.f9333d);
        }
    }

    public final void u0(String str, com.google.android.gms.internal.measurement.F0 f02) {
        int n7 = f02.n();
        A1.f fVar = this.j;
        if (n7 != 0) {
            C0650n0 c0650n0 = (C0650n0) this.f1707a;
            V v8 = c0650n0.f11229i;
            C0650n0.f(v8);
            v8.f10978n.c(Integer.valueOf(f02.n()), "EES programs found");
            C0983q1 c0983q1 = (C0983q1) f02.z().get(0);
            try {
                com.google.android.gms.internal.measurement.D d9 = new com.google.android.gms.internal.measurement.D();
                C1535g c1535g = d9.f15190a;
                ((HashMap) ((C0974o2) c1535g.f20185d).f15559a).put("internal.remoteConfig", new CallableC0632h0(this, str, 0));
                ((HashMap) ((C0974o2) c1535g.f20185d).f15559a).put("internal.appMetadata", new CallableC0632h0(this, str, 1));
                ((HashMap) ((C0974o2) c1535g.f20185d).f15559a).put("internal.logger", new Q4.b(1, this));
                d9.a(c0983q1);
                fVar.l(str, d9);
                C0650n0.f(v8);
                T t7 = v8.f10978n;
                t7.d(str, Integer.valueOf(c0983q1.n().n()), "EES program loaded for appId, activities");
                for (C0978p1 c0978p1 : c0983q1.n().p()) {
                    C0650n0.f(v8);
                    t7.c(c0978p1.n(), "EES program activity");
                }
                return;
            } catch (com.google.android.gms.internal.measurement.N unused) {
                V v9 = c0650n0.f11229i;
                C0650n0.f(v9);
                v9.f10971f.c(str, "Failed to load EES program. appId");
                return;
            }
        }
        fVar.m(str);
    }

    public final int x0(String str, String str2) {
        Integer num;
        l0();
        t0(str);
        Map map = (Map) this.f11145i.get(str);
        if (map != null && (num = (Integer) map.get(str2)) != null) {
            return num.intValue();
        }
        return 1;
    }

    public final EnumC0678z0 y0(String str, B0 b02) {
        l0();
        t0(str);
        com.google.android.gms.internal.measurement.A0 z02 = z0(str);
        EnumC0678z0 enumC0678z0 = EnumC0678z0.UNINITIALIZED;
        if (z02 != null) {
            Iterator it = z02.r().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1016x0 c1016x0 = (C1016x0) it.next();
                if (w0(c1016x0.o()) == b02) {
                    int n7 = c1016x0.n() - 1;
                    if (n7 != 1) {
                        if (n7 == 2) {
                            return EnumC0678z0.DENIED;
                        }
                    } else {
                        return EnumC0678z0.GRANTED;
                    }
                }
            }
        }
        return enumC0678z0;
    }

    public final com.google.android.gms.internal.measurement.A0 z0(String str) {
        l0();
        t0(str);
        com.google.android.gms.internal.measurement.F0 A02 = A0(str);
        if (A02 != null && A02.E()) {
            return A02.q();
        }
        return null;
    }

    @Override // b5.D1
    public final void o0() {
    }
}
