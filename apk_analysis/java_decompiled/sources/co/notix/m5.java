package co.notix;

/* loaded from: classes.dex */
public final class m5 {

    /* renamed from: a, reason: collision with root package name */
    public final di f12760a;

    /* renamed from: b, reason: collision with root package name */
    public final er f12761b;

    /* renamed from: c, reason: collision with root package name */
    public final er f12762c;

    public m5(di objectStorageProvider) {
        kotlin.jvm.internal.h.e(objectStorageProvider, "objectStorageProvider");
        this.f12760a = objectStorageProvider;
        this.f12761b = new er(new l5(this, null));
        this.f12762c = new er(new e5(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (((co.notix.vh) r7).b(r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(co.notix.t4 r6, E7.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof co.notix.u4
            if (r0 == 0) goto L13
            r0 = r7
            co.notix.u4 r0 = (co.notix.u4) r0
            int r1 = r0.f13275d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13275d = r1
            goto L18
        L13:
            co.notix.u4 r0 = new co.notix.u4
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f13273b
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f13275d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            a.AbstractC0485a.A(r7)
            goto L5b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            co.notix.t4 r6 = r0.f13272a
            a.AbstractC0485a.A(r7)
            goto L48
        L38:
            a.AbstractC0485a.A(r7)
            co.notix.er r7 = r5.f12762c
            r0.f13272a = r6
            r0.f13275d = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L48
            goto L5a
        L48:
            co.notix.vh r7 = (co.notix.vh) r7
            co.notix.v4 r2 = new co.notix.v4
            r2.<init>(r6)
            r6 = 0
            r0.f13272a = r6
            r0.f13275d = r3
            java.lang.Object r6 = r7.b(r2, r0)
            if (r6 != r1) goto L5b
        L5a:
            return r1
        L5b:
            A7.n r6 = A7.n.f558a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.m5.a(co.notix.t4, E7.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (((co.notix.vh) r6).b(r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
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
            boolean r0 = r6 instanceof co.notix.w4
            if (r0 == 0) goto L13
            r0 = r6
            co.notix.w4 r0 = (co.notix.w4) r0
            int r1 = r0.f13402c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13402c = r1
            goto L18
        L13:
            co.notix.w4 r0 = new co.notix.w4
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f13400a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f13402c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            a.AbstractC0485a.A(r6)
            goto L51
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
            co.notix.er r6 = r5.f12762c
            r0.f13402c = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L44
            goto L50
        L44:
            co.notix.vh r6 = (co.notix.vh) r6
            co.notix.x4 r2 = co.notix.x4.f13503a
            r0.f13402c = r3
            java.lang.Object r6 = r6.b(r2, r0)
            if (r6 != r1) goto L51
        L50:
            return r1
        L51:
            A7.n r6 = A7.n.f558a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.m5.a(E7.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(co.notix.o4 r5, E7.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof co.notix.i5
            if (r0 == 0) goto L13
            r0 = r6
            co.notix.i5 r0 = (co.notix.i5) r0
            int r1 = r0.f12434d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12434d = r1
            goto L18
        L13:
            co.notix.i5 r0 = new co.notix.i5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f12432b
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12434d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            co.notix.o4 r5 = r0.f12431a
            a.AbstractC0485a.A(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            a.AbstractC0485a.A(r6)
            co.notix.er r6 = r4.f12762c
            r0.f12431a = r5
            r0.f12434d = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            b8.e r6 = (b8.InterfaceC0725e) r6
            co.notix.h5 r0 = new co.notix.h5
            r0.<init>(r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.m5.a(co.notix.o4, E7.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (((co.notix.vh) r7).b(r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, E7.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof co.notix.j5
            if (r0 == 0) goto L13
            r0 = r7
            co.notix.j5 r0 = (co.notix.j5) r0
            int r1 = r0.f12518d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12518d = r1
            goto L18
        L13:
            co.notix.j5 r0 = new co.notix.j5
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f12516b
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12518d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            a.AbstractC0485a.A(r7)
            goto L5b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.f12515a
            a.AbstractC0485a.A(r7)
            goto L48
        L38:
            a.AbstractC0485a.A(r7)
            co.notix.er r7 = r5.f12762c
            r0.f12515a = r6
            r0.f12518d = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L48
            goto L5a
        L48:
            co.notix.vh r7 = (co.notix.vh) r7
            co.notix.k5 r2 = new co.notix.k5
            r2.<init>(r6)
            r6 = 0
            r0.f12515a = r6
            r0.f12518d = r3
            java.lang.Object r6 = r7.b(r2, r0)
            if (r6 != r1) goto L5b
        L5a:
            return r1
        L5b:
            A7.n r6 = A7.n.f558a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.m5.a(java.lang.String, E7.d):java.lang.Object");
    }
}
