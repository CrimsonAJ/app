package co.notix;

/* loaded from: classes.dex */
public final class mq {

    /* renamed from: a, reason: collision with root package name */
    public final tp f12798a;

    /* renamed from: b, reason: collision with root package name */
    public final di f12799b;

    /* renamed from: c, reason: collision with root package name */
    public final xq f12800c;

    /* renamed from: d, reason: collision with root package name */
    public final er f12801d;

    /* renamed from: e, reason: collision with root package name */
    public final er f12802e;

    public mq(wp settingsDataSource, di objectStorageProvider, xq storage) {
        kotlin.jvm.internal.h.e(settingsDataSource, "settingsDataSource");
        kotlin.jvm.internal.h.e(objectStorageProvider, "objectStorageProvider");
        kotlin.jvm.internal.h.e(storage, "storage");
        this.f12798a = settingsDataSource;
        this.f12799b = objectStorageProvider;
        this.f12800c = storage;
        this.f12801d = new er(new lq(this, null));
        this.f12802e = new er(new aq(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (((co.notix.r7) r6).a(r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (r6 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(E7.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof co.notix.bq
            if (r0 == 0) goto L13
            r0 = r6
            co.notix.bq r0 = (co.notix.bq) r0
            int r1 = r0.f11962c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11962c = r1
            goto L18
        L13:
            co.notix.bq r0 = new co.notix.bq
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f11960a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f11962c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            a.AbstractC0485a.A(r6)
            goto L4f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            a.AbstractC0485a.A(r6)
            goto L44
        L36:
            a.AbstractC0485a.A(r6)
            co.notix.er r6 = r5.f12802e
            r0.f11962c = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L44
            goto L4e
        L44:
            co.notix.r7 r6 = (co.notix.r7) r6
            r0.f11962c = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L4f
        L4e:
            return r1
        L4f:
            A7.n r6 = A7.n.f558a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.mq.a(E7.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r6 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0041, code lost:
    
        if (r6 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(E7.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof co.notix.cq
            if (r0 == 0) goto L13
            r0 = r6
            co.notix.cq r0 = (co.notix.cq) r0
            int r1 = r0.f12063c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12063c = r1
            goto L18
        L13:
            co.notix.cq r0 = new co.notix.cq
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f12061a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12063c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            a.AbstractC0485a.A(r6)
            goto L56
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            a.AbstractC0485a.A(r6)
            goto L44
        L36:
            a.AbstractC0485a.A(r6)
            co.notix.er r6 = r5.f12802e
            r0.f12063c = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L44
            goto L55
        L44:
            co.notix.r7 r6 = (co.notix.r7) r6
            co.notix.vh r6 = r6.f13085a
            co.notix.q7 r2 = new co.notix.q7
            r2.<init>(r6)
            r0.f12063c = r3
            java.lang.Object r6 = b8.AbstractC0714M.m(r2, r0)
            if (r6 != r1) goto L56
        L55:
            return r1
        L56:
            A7.j r6 = (A7.j) r6
            java.lang.Object r6 = r6.f550a
            boolean r0 = r6 instanceof A7.i
            r1 = 0
            if (r0 == 0) goto L60
            r6 = r1
        L60:
            co.notix.sp r6 = (co.notix.sp) r6
            if (r6 == 0) goto L67
            co.notix.l9 r6 = r6.f13194a
            return r6
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.mq.b(E7.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (r6 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
    
        if (r6 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(E7.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof co.notix.dq
            if (r0 == 0) goto L13
            r0 = r6
            co.notix.dq r0 = (co.notix.dq) r0
            int r1 = r0.f12124c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12124c = r1
            goto L18
        L13:
            co.notix.dq r0 = new co.notix.dq
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f12122a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12124c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            a.AbstractC0485a.A(r6)
            A7.j r6 = (A7.j) r6
            java.lang.Object r6 = r6.f550a
            goto L53
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            a.AbstractC0485a.A(r6)
            goto L48
        L3a:
            a.AbstractC0485a.A(r6)
            co.notix.er r6 = r5.f12802e
            r0.f12124c = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L48
            goto L52
        L48:
            co.notix.r7 r6 = (co.notix.r7) r6
            r0.f12124c = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L53
        L52:
            return r1
        L53:
            boolean r0 = r6 instanceof A7.i
            r1 = 0
            if (r0 == 0) goto L59
            r6 = r1
        L59:
            co.notix.sp r6 = (co.notix.sp) r6
            if (r6 == 0) goto L60
            co.notix.l9 r6 = r6.f13194a
            return r6
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.mq.c(E7.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (r6 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
    
        if (r6 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(E7.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof co.notix.eq
            if (r0 == 0) goto L13
            r0 = r6
            co.notix.eq r0 = (co.notix.eq) r0
            int r1 = r0.f12199c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12199c = r1
            goto L18
        L13:
            co.notix.eq r0 = new co.notix.eq
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f12197a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12199c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            a.AbstractC0485a.A(r6)
            A7.j r6 = (A7.j) r6
            java.lang.Object r6 = r6.f550a
            goto L53
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            a.AbstractC0485a.A(r6)
            goto L48
        L3a:
            a.AbstractC0485a.A(r6)
            co.notix.er r6 = r5.f12802e
            r0.f12199c = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L48
            goto L52
        L48:
            co.notix.r7 r6 = (co.notix.r7) r6
            r0.f12199c = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L53
        L52:
            return r1
        L53:
            boolean r0 = r6 instanceof A7.i
            r1 = 0
            if (r0 == 0) goto L59
            r6 = r1
        L59:
            co.notix.sp r6 = (co.notix.sp) r6
            if (r6 == 0) goto L60
            co.notix.mp r6 = r6.f13197d
            return r6
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.mq.d(E7.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (r6 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
    
        if (r6 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(E7.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof co.notix.fq
            if (r0 == 0) goto L13
            r0 = r6
            co.notix.fq r0 = (co.notix.fq) r0
            int r1 = r0.f12282c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12282c = r1
            goto L18
        L13:
            co.notix.fq r0 = new co.notix.fq
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f12280a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12282c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            a.AbstractC0485a.A(r6)
            A7.j r6 = (A7.j) r6
            java.lang.Object r6 = r6.f550a
            goto L53
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            a.AbstractC0485a.A(r6)
            goto L48
        L3a:
            a.AbstractC0485a.A(r6)
            co.notix.er r6 = r5.f12802e
            r0.f12282c = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L48
            goto L52
        L48:
            co.notix.r7 r6 = (co.notix.r7) r6
            r0.f12282c = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L53
        L52:
            return r1
        L53:
            boolean r0 = r6 instanceof A7.i
            r1 = 0
            if (r0 == 0) goto L59
            r6 = r1
        L59:
            co.notix.sp r6 = (co.notix.sp) r6
            if (r6 == 0) goto L60
            co.notix.pp r6 = r6.f13196c
            return r6
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.mq.e(E7.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(E7.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof co.notix.jq
            if (r0 == 0) goto L13
            r0 = r5
            co.notix.jq r0 = (co.notix.jq) r0
            int r1 = r0.f12579c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12579c = r1
            goto L18
        L13:
            co.notix.jq r0 = new co.notix.jq
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f12577a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12579c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0485a.A(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            a.AbstractC0485a.A(r5)
            co.notix.er r5 = r4.f12802e
            r0.f12579c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            co.notix.r7 r5 = (co.notix.r7) r5
            co.notix.vh r5 = r5.f13085a
            co.notix.q7 r0 = new co.notix.q7
            r0.<init>(r5)
            co.notix.iq r5 = new co.notix.iq
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.mq.f(E7.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (r6 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
    
        if (r6 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(E7.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof co.notix.kq
            if (r0 == 0) goto L13
            r0 = r6
            co.notix.kq r0 = (co.notix.kq) r0
            int r1 = r0.f12641c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12641c = r1
            goto L18
        L13:
            co.notix.kq r0 = new co.notix.kq
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f12639a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12641c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            a.AbstractC0485a.A(r6)
            A7.j r6 = (A7.j) r6
            java.lang.Object r6 = r6.f550a
            goto L53
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            a.AbstractC0485a.A(r6)
            goto L48
        L3a:
            a.AbstractC0485a.A(r6)
            co.notix.er r6 = r5.f12802e
            r0.f12641c = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L48
            goto L52
        L48:
            co.notix.r7 r6 = (co.notix.r7) r6
            r0.f12641c = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L53
        L52:
            return r1
        L53:
            boolean r0 = r6 instanceof A7.i
            r1 = 0
            if (r0 == 0) goto L59
            r6 = r1
        L59:
            co.notix.sp r6 = (co.notix.sp) r6
            if (r6 == 0) goto L60
            co.notix.rp r6 = r6.f13195b
            return r6
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.mq.g(E7.d):java.lang.Object");
    }
}
