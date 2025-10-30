package co.notix;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class kl {

    /* renamed from: a, reason: collision with root package name */
    public final el f12619a;

    /* renamed from: b, reason: collision with root package name */
    public final cr f12620b;

    /* renamed from: c, reason: collision with root package name */
    public final xq f12621c;

    /* renamed from: d, reason: collision with root package name */
    public final y8 f12622d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0484z f12623e;

    /* renamed from: f, reason: collision with root package name */
    public final og f12624f;

    /* renamed from: g, reason: collision with root package name */
    public final ic f12625g;

    /* renamed from: h, reason: collision with root package name */
    public final l2 f12626h;

    public kl(el pushDataSource, cr subscriberDataSource, xq storage, d9 contextProvider, InterfaceC0484z cs, og notixCallbackReporter, ic json, l2 adCounter) {
        kotlin.jvm.internal.h.e(pushDataSource, "pushDataSource");
        kotlin.jvm.internal.h.e(subscriberDataSource, "subscriberDataSource");
        kotlin.jvm.internal.h.e(storage, "storage");
        kotlin.jvm.internal.h.e(contextProvider, "contextProvider");
        kotlin.jvm.internal.h.e(cs, "cs");
        kotlin.jvm.internal.h.e(notixCallbackReporter, "notixCallbackReporter");
        kotlin.jvm.internal.h.e(json, "json");
        kotlin.jvm.internal.h.e(adCounter, "adCounter");
        this.f12619a = pushDataSource;
        this.f12620b = subscriberDataSource;
        this.f12621c = storage;
        this.f12622d = contextProvider;
        this.f12623e = cs;
        this.f12624f = notixCallbackReporter;
        this.f12625g = json;
        this.f12626h = adCounter;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0071 A[Catch: JSONException -> 0x0099, TryCatch #0 {JSONException -> 0x0099, blocks: (B:13:0x0067, B:15:0x0071, B:18:0x0082, B:19:0x0098), top: B:12:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082 A[Catch: JSONException -> 0x0099, TryCatch #0 {JSONException -> 0x0099, blocks: (B:13:0x0067, B:15:0x0071, B:18:0x0082, B:19:0x0098), top: B:12:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(co.notix.kl r7, java.lang.String r8, E7.d r9) {
        /*
            java.lang.Class<co.notix.o> r0 = co.notix.o.class
            r7.getClass()
            java.lang.String r1 = "ToJsonAdapter for class "
            boolean r2 = r9 instanceof co.notix.fl
            if (r2 == 0) goto L1a
            r2 = r9
            co.notix.fl r2 = (co.notix.fl) r2
            int r3 = r2.f12274h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1a
            int r3 = r3 - r4
            r2.f12274h = r3
            goto L1f
        L1a:
            co.notix.fl r2 = new co.notix.fl
            r2.<init>(r7, r9)
        L1f:
            java.lang.Object r9 = r2.f12272f
            F7.a r3 = F7.a.f2587a
            int r4 = r2.f12274h
            r5 = 1
            if (r4 == 0) goto L40
            if (r4 != r5) goto L38
            org.json.JSONObject r7 = r2.f12271e
            java.lang.String r8 = r2.f12270d
            co.notix.ic r3 = r2.f12269c
            org.json.JSONObject r4 = r2.f12268b
            java.lang.String r2 = r2.f12267a
            a.AbstractC0485a.A(r9)     // Catch: org.json.JSONException -> L9b
            goto L67
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            a.AbstractC0485a.A(r9)
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: org.json.JSONException -> L9a
            r9.<init>(r8)     // Catch: org.json.JSONException -> L9a
            java.lang.String r4 = "cnt"
            co.notix.ic r6 = r7.f12625g     // Catch: org.json.JSONException -> L9a
            co.notix.l2 r7 = r7.f12626h     // Catch: org.json.JSONException -> L9a
            r2.f12267a = r8     // Catch: org.json.JSONException -> L9a
            r2.f12268b = r9     // Catch: org.json.JSONException -> L9a
            r2.f12269c = r6     // Catch: org.json.JSONException -> L9a
            r2.f12270d = r4     // Catch: org.json.JSONException -> L9a
            r2.f12271e = r9     // Catch: org.json.JSONException -> L9a
            r2.f12274h = r5     // Catch: org.json.JSONException -> L9a
            java.lang.Object r7 = r7.a(r2)     // Catch: org.json.JSONException -> L9a
            if (r7 != r3) goto L61
            return r3
        L61:
            r2 = r8
            r8 = r4
            r3 = r6
            r4 = r9
            r9 = r7
            r7 = r4
        L67:
            java.util.LinkedHashMap r3 = r3.f12449a     // Catch: org.json.JSONException -> L99
            java.lang.Object r3 = r3.get(r0)     // Catch: org.json.JSONException -> L99
            co.notix.gr r3 = (co.notix.gr) r3     // Catch: org.json.JSONException -> L99
            if (r3 == 0) goto L82
            java.lang.Object r9 = r3.a(r9)     // Catch: org.json.JSONException -> L99
            r7.put(r8, r9)     // Catch: org.json.JSONException -> L99
            java.lang.String r7 = r4.toString()     // Catch: org.json.JSONException -> L99
            java.lang.String r8 = "{\n            JSONObject…   }.toString()\n        }"
            kotlin.jvm.internal.h.d(r7, r8)     // Catch: org.json.JSONException -> L99
            return r7
        L82:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException     // Catch: org.json.JSONException -> L99
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L99
            r8.<init>(r1)     // Catch: org.json.JSONException -> L99
            r8.append(r0)     // Catch: org.json.JSONException -> L99
            java.lang.String r9 = " not found"
            r8.append(r9)     // Catch: org.json.JSONException -> L99
            java.lang.String r8 = r8.toString()     // Catch: org.json.JSONException -> L99
            r7.<init>(r8)     // Catch: org.json.JSONException -> L99
            throw r7     // Catch: org.json.JSONException -> L99
        L99:
            r8 = r2
        L9a:
            r2 = r8
        L9b:
            co.notix.kd r7 = co.notix.md.f12779a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "invalid pingdata: "
            r8.<init>(r9)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            co.notix.ld.a(r7, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.kl.a(co.notix.kl, java.lang.String, E7.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, E7.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof co.notix.gl
            if (r0 == 0) goto L13
            r0 = r7
            co.notix.gl r0 = (co.notix.gl) r0
            int r1 = r0.f12339c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12339c = r1
            goto L18
        L13:
            co.notix.gl r0 = new co.notix.gl
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f12337a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12339c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0485a.A(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            a.AbstractC0485a.A(r7)
            Y7.z r7 = r5.f12623e
            E7.i r7 = r7.g()
            co.notix.hl r2 = new co.notix.hl
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f12339c = r3
            java.lang.Object r7 = Y7.B.C(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            A7.j r7 = (A7.j) r7
            java.lang.Object r6 = r7.f550a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.kl.a(java.lang.String, E7.d):java.lang.Object");
    }
}
