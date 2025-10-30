package co.notix;

/* loaded from: classes.dex */
public final class r7 {

    /* renamed from: a, reason: collision with root package name */
    public final vh f13085a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13086b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13087c;

    /* renamed from: d, reason: collision with root package name */
    public final O7.l f13088d;

    /* renamed from: e, reason: collision with root package name */
    public final g8.a f13089e;

    public r7(vh field, long j, long j4, O7.l fetcher) {
        kotlin.jvm.internal.h.e(field, "field");
        kotlin.jvm.internal.h.e(fetcher, "fetcher");
        this.f13085a = field;
        this.f13086b = j;
        this.f13087c = j4;
        this.f13088d = fetcher;
        this.f13089e = g8.e.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(E7.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof co.notix.l7
            if (r0 == 0) goto L13
            r0 = r8
            co.notix.l7 r0 = (co.notix.l7) r0
            int r1 = r0.f12688e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12688e = r1
            goto L18
        L13:
            co.notix.l7 r0 = new co.notix.l7
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f12686c
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12688e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L44
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.f12684a
            g8.a r0 = (g8.a) r0
            a.AbstractC0485a.A(r8)     // Catch: java.lang.Throwable -> L2f
            goto L67
        L2f:
            r8 = move-exception
            goto L71
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            g8.a r2 = r0.f12685b
            java.lang.Object r4 = r0.f12684a
            co.notix.r7 r4 = (co.notix.r7) r4
            a.AbstractC0485a.A(r8)
            r8 = r2
            goto L57
        L44:
            a.AbstractC0485a.A(r8)
            g8.a r8 = r7.f13089e
            r0.f12684a = r7
            r0.f12685b = r8
            r0.f12688e = r4
            java.lang.Object r2 = r8.d(r0)
            if (r2 != r1) goto L56
            goto L65
        L56:
            r4 = r7
        L57:
            co.notix.vh r2 = r4.f13085a     // Catch: java.lang.Throwable -> L6d
            r0.f12684a = r8     // Catch: java.lang.Throwable -> L6d
            r0.f12685b = r5     // Catch: java.lang.Throwable -> L6d
            r0.f12688e = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L6d
            if (r0 != r1) goto L66
        L65:
            return r1
        L66:
            r0 = r8
        L67:
            r0.a(r5)
            A7.n r8 = A7.n.f558a
            return r8
        L6d:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L71:
            r0.a(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.r7.a(E7.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5 A[Catch: all -> 0x0067, TryCatch #1 {all -> 0x0067, blocks: (B:32:0x00e6, B:36:0x00f5, B:37:0x00f7, B:50:0x0063, B:51:0x009c, B:53:0x00a0, B:54:0x00a8, B:56:0x00ad, B:57:0x00b2, B:73:0x00b0), top: B:49:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a0 A[Catch: all -> 0x0067, TryCatch #1 {all -> 0x0067, blocks: (B:32:0x00e6, B:36:0x00f5, B:37:0x00f7, B:50:0x0063, B:51:0x009c, B:53:0x00a0, B:54:0x00a8, B:56:0x00ad, B:57:0x00b2, B:73:0x00b0), top: B:49:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ad A[Catch: all -> 0x0067, TryCatch #1 {all -> 0x0067, blocks: (B:32:0x00e6, B:36:0x00f5, B:37:0x00f7, B:50:0x0063, B:51:0x009c, B:53:0x00a0, B:54:0x00a8, B:56:0x00ad, B:57:0x00b2, B:73:0x00b0), top: B:49:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b0 A[Catch: all -> 0x0067, TryCatch #1 {all -> 0x0067, blocks: (B:32:0x00e6, B:36:0x00f5, B:37:0x00f7, B:50:0x0063, B:51:0x009c, B:53:0x00a0, B:54:0x00a8, B:56:0x00ad, B:57:0x00b2, B:73:0x00b0), top: B:49:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(E7.d r17) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.r7.b(E7.d):java.lang.Object");
    }
}
