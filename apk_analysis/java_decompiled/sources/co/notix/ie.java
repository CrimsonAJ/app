package co.notix;

/* loaded from: classes.dex */
public final class ie implements ee {

    /* renamed from: a, reason: collision with root package name */
    public final xq f12455a;

    /* renamed from: b, reason: collision with root package name */
    public final y8 f12456b;

    /* renamed from: c, reason: collision with root package name */
    public final lf f12457c;

    /* renamed from: d, reason: collision with root package name */
    public final de f12458d;

    /* renamed from: e, reason: collision with root package name */
    public final og f12459e;

    /* renamed from: f, reason: collision with root package name */
    public final ic f12460f;

    public ie(xq storage, d9 contextProvider, lf notificationsPermissionController, de metricsDataSource, og notixCallbackReporter, ic json) {
        kotlin.jvm.internal.h.e(storage, "storage");
        kotlin.jvm.internal.h.e(contextProvider, "contextProvider");
        kotlin.jvm.internal.h.e(notificationsPermissionController, "notificationsPermissionController");
        kotlin.jvm.internal.h.e(metricsDataSource, "metricsDataSource");
        kotlin.jvm.internal.h.e(notixCallbackReporter, "notixCallbackReporter");
        kotlin.jvm.internal.h.e(json, "json");
        this.f12455a = storage;
        this.f12456b = contextProvider;
        this.f12457c = notificationsPermissionController;
        this.f12458d = metricsDataSource;
        this.f12459e = notixCallbackReporter;
        this.f12460f = json;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(E7.d r13) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.ie.a(E7.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(2:24|(1:26))(2:27|28))|11|12|(1:14)(1:18)|15|16))|32|6|7|(0)(0)|11|12|(0)(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a9, code lost:
    
        r13 = a.AbstractC0485a.h(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(E7.d r13) {
        /*
            r12 = this;
            java.lang.Class<co.notix.xd> r0 = co.notix.xd.class
            java.lang.String r1 = "ToJsonAdapter for class "
            boolean r2 = r13 instanceof co.notix.ge
            if (r2 == 0) goto L17
            r2 = r13
            co.notix.ge r2 = (co.notix.ge) r2
            int r3 = r2.f12318c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f12318c = r3
            goto L1c
        L17:
            co.notix.ge r2 = new co.notix.ge
            r2.<init>(r12, r13)
        L1c:
            java.lang.Object r13 = r2.f12316a
            F7.a r3 = F7.a.f2587a
            int r4 = r2.f12318c
            r5 = 1
            if (r4 == 0) goto L37
            if (r4 != r5) goto L2f
            a.AbstractC0485a.A(r13)     // Catch: java.lang.Throwable -> L2b
            goto L8f
        L2b:
            r0 = move-exception
            r13 = r0
            goto La9
        L2f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L37:
            a.AbstractC0485a.A(r13)
            co.notix.xd r6 = new co.notix.xd     // Catch: java.lang.Throwable -> L2b
            co.notix.xq r13 = r12.f12455a     // Catch: java.lang.Throwable -> L2b
            long r7 = r13.b()     // Catch: java.lang.Throwable -> L2b
            co.notix.xq r13 = r12.f12455a     // Catch: java.lang.Throwable -> L2b
            java.lang.String r9 = r13.c()     // Catch: java.lang.Throwable -> L2b
            co.notix.y8 r13 = r12.f12456b     // Catch: java.lang.Throwable -> L2b
            co.notix.d9 r13 = (co.notix.d9) r13     // Catch: java.lang.Throwable -> L2b
            android.content.Context r13 = r13.a()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r10 = r13.getPackageName()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r13 = "contextProvider.appContext.packageName"
            kotlin.jvm.internal.h.d(r10, r13)     // Catch: java.lang.Throwable -> L2b
            co.notix.xq r13 = r12.f12455a     // Catch: java.lang.Throwable -> L2b
            r13.getClass()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r11 = co.notix.xq.a()     // Catch: java.lang.Throwable -> L2b
            r6.<init>(r7, r9, r10, r11)     // Catch: java.lang.Throwable -> L2b
            co.notix.ic r13 = r12.f12460f     // Catch: java.lang.Throwable -> L2b
            java.util.LinkedHashMap r13 = r13.f12449a     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r13 = r13.get(r0)     // Catch: java.lang.Throwable -> L2b
            co.notix.gr r13 = (co.notix.gr) r13     // Catch: java.lang.Throwable -> L2b
            if (r13 == 0) goto L92
            java.lang.Object r13 = r13.a(r6)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L2b
            co.notix.de r0 = r12.f12458d     // Catch: java.lang.Throwable -> L2b
            r2.f12318c = r5     // Catch: java.lang.Throwable -> L2b
            r0.getClass()     // Catch: java.lang.Throwable -> L2b
            f8.d r1 = Y7.K.f8774b     // Catch: java.lang.Throwable -> L2b
            co.notix.ce r4 = new co.notix.ce     // Catch: java.lang.Throwable -> L2b
            r5 = 0
            r4.<init>(r0, r13, r5)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r13 = Y7.B.C(r1, r4, r2)     // Catch: java.lang.Throwable -> L2b
            if (r13 != r3) goto L8f
            return r3
        L8f:
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L2b
            goto Lad
        L92:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L2b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L2b
            r2.append(r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = " not found"
            r2.append(r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L2b
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L2b
            throw r13     // Catch: java.lang.Throwable -> L2b
        La9:
            A7.i r13 = a.AbstractC0485a.h(r13)
        Lad:
            java.lang.Throwable r0 = A7.j.a(r13)
            if (r0 != 0) goto Lc2
            java.lang.String r13 = (java.lang.String) r13
            co.notix.kd r13 = co.notix.md.f12779a
            r13.getClass()
            co.notix.x8 r13 = r13.f12607b
            java.lang.String r0 = "app_update tracked"
            r13.a(r0)
            goto Lc9
        Lc2:
            co.notix.kd r13 = co.notix.md.f12779a
            java.lang.String r1 = "couldn't send app_update event"
            co.notix.yn.a(r13, r1, r0)
        Lc9:
            A7.n r13 = A7.n.f558a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.ie.b(E7.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(E7.d r28) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.ie.c(E7.d):java.lang.Object");
    }
}
