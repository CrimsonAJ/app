package co.notix;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class ia {

    /* renamed from: a, reason: collision with root package name */
    public final ej f12444a;

    /* renamed from: b, reason: collision with root package name */
    public final fj f12445b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0484z f12446c;

    /* renamed from: d, reason: collision with root package name */
    public final l2 f12447d;

    /* renamed from: e, reason: collision with root package name */
    public final ic f12448e;

    public ia(ej perseveranceStorage, fj perseveranceWorkManager, InterfaceC0484z cs, l2 adCounter, ic json) {
        kotlin.jvm.internal.h.e(perseveranceStorage, "perseveranceStorage");
        kotlin.jvm.internal.h.e(perseveranceWorkManager, "perseveranceWorkManager");
        kotlin.jvm.internal.h.e(cs, "cs");
        kotlin.jvm.internal.h.e(adCounter, "adCounter");
        kotlin.jvm.internal.h.e(json, "json");
        this.f12444a = perseveranceStorage;
        this.f12445b = perseveranceWorkManager;
        this.f12446c = cs;
        this.f12447d = adCounter;
        this.f12448e = json;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(co.notix.ia r21, java.lang.String r22, co.notix.d3 r23, co.notix.p8 r24, E7.d r25) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.ia.a(co.notix.ia, java.lang.String, co.notix.d3, co.notix.p8, E7.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bc, code lost:
    
        if (r10.a(r12, r2) != r3) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(co.notix.ia r20, java.lang.String r21, co.notix.d3 r22, E7.d r23) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.ia.a(co.notix.ia, java.lang.String, co.notix.d3, E7.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006e A[Catch: JSONException -> 0x0096, TryCatch #0 {JSONException -> 0x0096, blocks: (B:13:0x0064, B:15:0x006e, B:18:0x007f, B:19:0x0095), top: B:12:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f A[Catch: JSONException -> 0x0096, TryCatch #0 {JSONException -> 0x0096, blocks: (B:13:0x0064, B:15:0x006e, B:18:0x007f, B:19:0x0095), top: B:12:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r9, E7.d r10) {
        /*
            r8 = this;
            java.lang.Class<co.notix.o> r0 = co.notix.o.class
            java.lang.String r1 = "ToJsonAdapter for class "
            boolean r2 = r10 instanceof co.notix.u9
            if (r2 == 0) goto L17
            r2 = r10
            co.notix.u9 r2 = (co.notix.u9) r2
            int r3 = r2.f13286h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f13286h = r3
            goto L1c
        L17:
            co.notix.u9 r2 = new co.notix.u9
            r2.<init>(r8, r10)
        L1c:
            java.lang.Object r10 = r2.f13284f
            F7.a r3 = F7.a.f2587a
            int r4 = r2.f13286h
            r5 = 1
            if (r4 == 0) goto L3d
            if (r4 != r5) goto L35
            org.json.JSONObject r9 = r2.f13283e
            java.lang.String r3 = r2.f13282d
            co.notix.ic r4 = r2.f13281c
            org.json.JSONObject r5 = r2.f13280b
            java.lang.String r2 = r2.f13279a
            a.AbstractC0485a.A(r10)     // Catch: org.json.JSONException -> L98
            goto L64
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            a.AbstractC0485a.A(r10)
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: org.json.JSONException -> L97
            r10.<init>(r9)     // Catch: org.json.JSONException -> L97
            java.lang.String r4 = "cnt"
            co.notix.ic r6 = r8.f12448e     // Catch: org.json.JSONException -> L97
            co.notix.l2 r7 = r8.f12447d     // Catch: org.json.JSONException -> L97
            r2.f13279a = r9     // Catch: org.json.JSONException -> L97
            r2.f13280b = r10     // Catch: org.json.JSONException -> L97
            r2.f13281c = r6     // Catch: org.json.JSONException -> L97
            r2.f13282d = r4     // Catch: org.json.JSONException -> L97
            r2.f13283e = r10     // Catch: org.json.JSONException -> L97
            r2.f13286h = r5     // Catch: org.json.JSONException -> L97
            java.lang.Object r2 = r7.a(r2)     // Catch: org.json.JSONException -> L97
            if (r2 != r3) goto L5e
            return r3
        L5e:
            r5 = r10
            r3 = r4
            r4 = r6
            r10 = r2
            r2 = r9
            r9 = r5
        L64:
            java.util.LinkedHashMap r4 = r4.f12449a     // Catch: org.json.JSONException -> L96
            java.lang.Object r4 = r4.get(r0)     // Catch: org.json.JSONException -> L96
            co.notix.gr r4 = (co.notix.gr) r4     // Catch: org.json.JSONException -> L96
            if (r4 == 0) goto L7f
            java.lang.Object r10 = r4.a(r10)     // Catch: org.json.JSONException -> L96
            r9.put(r3, r10)     // Catch: org.json.JSONException -> L96
            java.lang.String r9 = r5.toString()     // Catch: org.json.JSONException -> L96
            java.lang.String r10 = "{\n            JSONObject…   }.toString()\n        }"
            kotlin.jvm.internal.h.d(r9, r10)     // Catch: org.json.JSONException -> L96
            return r9
        L7f:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException     // Catch: org.json.JSONException -> L96
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L96
            r10.<init>(r1)     // Catch: org.json.JSONException -> L96
            r10.append(r0)     // Catch: org.json.JSONException -> L96
            java.lang.String r0 = " not found"
            r10.append(r0)     // Catch: org.json.JSONException -> L96
            java.lang.String r10 = r10.toString()     // Catch: org.json.JSONException -> L96
            r9.<init>(r10)     // Catch: org.json.JSONException -> L96
            throw r9     // Catch: org.json.JSONException -> L96
        L96:
            r9 = r2
        L97:
            r2 = r9
        L98:
            co.notix.kd r9 = co.notix.md.f12779a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "invalid json for event: "
            r10.<init>(r0)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            co.notix.ld.a(r9, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.ia.a(java.lang.String, E7.d):java.lang.Object");
    }
}
