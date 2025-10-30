package co.notix;

/* loaded from: classes.dex */
public final class vn {

    /* renamed from: a, reason: collision with root package name */
    public final di f13381a;

    /* renamed from: b, reason: collision with root package name */
    public final er f13382b;

    /* renamed from: c, reason: collision with root package name */
    public final er f13383c;

    /* renamed from: d, reason: collision with root package name */
    public final er f13384d;

    /* renamed from: e, reason: collision with root package name */
    public final er f13385e;

    /* renamed from: f, reason: collision with root package name */
    public final er f13386f;

    public vn(di objectStorageProvider) {
        kotlin.jvm.internal.h.e(objectStorageProvider, "objectStorageProvider");
        this.f13381a = objectStorageProvider;
        this.f13382b = new er(new mn(this, null));
        this.f13383c = new er(new xm(this, null));
        this.f13384d = new er(new en(this, null));
        this.f13385e = new er(new tn(this, null));
        this.f13386f = new er(new ln(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (((co.notix.vh) r9).b(r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(co.notix.pl r6, long r7, E7.d r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof co.notix.mm
            if (r0 == 0) goto L13
            r0 = r9
            co.notix.mm r0 = (co.notix.mm) r0
            int r1 = r0.f12793e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12793e = r1
            goto L18
        L13:
            co.notix.mm r0 = new co.notix.mm
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f12791c
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12793e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            a.AbstractC0485a.A(r9)
            goto L5f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            long r7 = r0.f12790b
            co.notix.pl r6 = r0.f12789a
            a.AbstractC0485a.A(r9)
            goto L4c
        L3a:
            a.AbstractC0485a.A(r9)
            co.notix.er r9 = r5.f13383c
            r0.f12789a = r6
            r0.f12790b = r7
            r0.f12793e = r4
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L4c
            goto L5e
        L4c:
            co.notix.vh r9 = (co.notix.vh) r9
            co.notix.nm r2 = new co.notix.nm
            r2.<init>(r6, r7)
            r6 = 0
            r0.f12789a = r6
            r0.f12793e = r3
            java.lang.Object r6 = r9.b(r2, r0)
            if (r6 != r1) goto L5f
        L5e:
            return r1
        L5f:
            A7.n r6 = A7.n.f558a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.vn.a(co.notix.pl, long, E7.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (r6 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(E7.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof co.notix.qm
            if (r0 == 0) goto L13
            r0 = r6
            co.notix.qm r0 = (co.notix.qm) r0
            int r1 = r0.f13066c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13066c = r1
            goto L18
        L13:
            co.notix.qm r0 = new co.notix.qm
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f13064a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f13066c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            a.AbstractC0485a.A(r6)
            return r6
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
            co.notix.er r6 = r5.f13386f
            r0.f13066c = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L44
            goto L4e
        L44:
            co.notix.vh r6 = (co.notix.vh) r6
            r0.f13066c = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L4f
        L4e:
            return r1
        L4f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.vn.b(E7.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (r7 == r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v3, types: [O7.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(co.notix.fm r6, E7.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof co.notix.om
            if (r0 == 0) goto L13
            r0 = r7
            co.notix.om r0 = (co.notix.om) r0
            int r1 = r0.f12906d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12906d = r1
            goto L18
        L13:
            co.notix.om r0 = new co.notix.om
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f12904b
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12906d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            a.AbstractC0485a.A(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            O7.l r6 = r0.f12903a
            a.AbstractC0485a.A(r7)
            goto L48
        L38:
            a.AbstractC0485a.A(r7)
            co.notix.er r7 = r5.f13384d
            r0.f12903a = r6
            r0.f12906d = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L48
            goto L55
        L48:
            co.notix.vh r7 = (co.notix.vh) r7
            r2 = 0
            r0.f12903a = r2
            r0.f12906d = r3
            java.lang.Object r6 = r7.a(r6, r0)
            if (r6 != r1) goto L56
        L55:
            return r1
        L56:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.vn.a(co.notix.fm, E7.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (r6 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(E7.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof co.notix.pm
            if (r0 == 0) goto L13
            r0 = r6
            co.notix.pm r0 = (co.notix.pm) r0
            int r1 = r0.f12992c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12992c = r1
            goto L18
        L13:
            co.notix.pm r0 = new co.notix.pm
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f12990a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12992c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            a.AbstractC0485a.A(r6)
            return r6
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
            co.notix.er r6 = r5.f13383c
            r0.f12992c = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L44
            goto L4e
        L44:
            co.notix.vh r6 = (co.notix.vh) r6
            r0.f12992c = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L4f
        L4e:
            return r1
        L4f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.vn.a(E7.d):java.lang.Object");
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
    public final java.lang.Object a(java.util.Set r6, E7.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof co.notix.fn
            if (r0 == 0) goto L13
            r0 = r7
            co.notix.fn r0 = (co.notix.fn) r0
            int r1 = r0.f12279d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12279d = r1
            goto L18
        L13:
            co.notix.fn r0 = new co.notix.fn
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f12277b
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12279d
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
            java.util.Set r6 = r0.f12276a
            a.AbstractC0485a.A(r7)
            goto L48
        L38:
            a.AbstractC0485a.A(r7)
            co.notix.er r7 = r5.f13383c
            r0.f12276a = r6
            r0.f12279d = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L48
            goto L5a
        L48:
            co.notix.vh r7 = (co.notix.vh) r7
            co.notix.gn r2 = new co.notix.gn
            r2.<init>(r6)
            r6 = 0
            r0.f12276a = r6
            r0.f12279d = r3
            java.lang.Object r6 = r7.b(r2, r0)
            if (r6 != r1) goto L5b
        L5a:
            return r1
        L5b:
            A7.n r6 = A7.n.f558a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.vn.a(java.util.Set, E7.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (((co.notix.vh) r8).b(r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r6, E7.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof co.notix.hn
            if (r0 == 0) goto L13
            r0 = r8
            co.notix.hn r0 = (co.notix.hn) r0
            int r1 = r0.f12410d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12410d = r1
            goto L18
        L13:
            co.notix.hn r0 = new co.notix.hn
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f12408b
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12410d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            a.AbstractC0485a.A(r8)
            goto L58
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            long r6 = r0.f12407a
            a.AbstractC0485a.A(r8)
            goto L48
        L38:
            a.AbstractC0485a.A(r8)
            co.notix.er r8 = r5.f13386f
            r0.f12407a = r6
            r0.f12410d = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L48
            goto L57
        L48:
            co.notix.vh r8 = (co.notix.vh) r8
            co.notix.in r2 = new co.notix.in
            r2.<init>(r6)
            r0.f12410d = r3
            java.lang.Object r6 = r8.b(r2, r0)
            if (r6 != r1) goto L58
        L57:
            return r1
        L58:
            A7.n r6 = A7.n.f558a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.vn.a(long, E7.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (r7 == r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v3, types: [O7.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(co.notix.gm r6, E7.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof co.notix.un
            if (r0 == 0) goto L13
            r0 = r7
            co.notix.un r0 = (co.notix.un) r0
            int r1 = r0.f13318d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13318d = r1
            goto L18
        L13:
            co.notix.un r0 = new co.notix.un
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f13316b
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f13318d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            a.AbstractC0485a.A(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            O7.l r6 = r0.f13315a
            a.AbstractC0485a.A(r7)
            goto L48
        L38:
            a.AbstractC0485a.A(r7)
            co.notix.er r7 = r5.f13385e
            r0.f13315a = r6
            r0.f13318d = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L48
            goto L55
        L48:
            co.notix.vh r7 = (co.notix.vh) r7
            r2 = 0
            r0.f13315a = r2
            r0.f13318d = r3
            java.lang.Object r6 = r7.b(r6, r0)
            if (r6 != r1) goto L56
        L55:
            return r1
        L56:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.vn.a(co.notix.gm, E7.d):java.lang.Object");
    }
}
