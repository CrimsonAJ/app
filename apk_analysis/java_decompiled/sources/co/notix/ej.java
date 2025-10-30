package co.notix;

/* loaded from: classes.dex */
public final class ej {

    /* renamed from: a, reason: collision with root package name */
    public final di f12177a;

    /* renamed from: b, reason: collision with root package name */
    public final er f12178b;

    /* renamed from: c, reason: collision with root package name */
    public final er f12179c;

    public ej(di objectStorageProvider) {
        kotlin.jvm.internal.h.e(objectStorageProvider, "objectStorageProvider");
        this.f12177a = objectStorageProvider;
        this.f12178b = new er(new bj(this, null));
        this.f12179c = new er(new zi(this, null));
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
    public final java.lang.Object a(co.notix.ni r6, E7.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof co.notix.oi
            if (r0 == 0) goto L13
            r0 = r7
            co.notix.oi r0 = (co.notix.oi) r0
            int r1 = r0.f12897d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12897d = r1
            goto L18
        L13:
            co.notix.oi r0 = new co.notix.oi
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f12895b
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12897d
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
            co.notix.ni r6 = r0.f12894a
            a.AbstractC0485a.A(r7)
            goto L48
        L38:
            a.AbstractC0485a.A(r7)
            co.notix.er r7 = r5.f12179c
            r0.f12894a = r6
            r0.f12897d = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L48
            goto L5a
        L48:
            co.notix.vh r7 = (co.notix.vh) r7
            co.notix.pi r2 = new co.notix.pi
            r2.<init>(r6)
            r6 = 0
            r0.f12894a = r6
            r0.f12897d = r3
            java.lang.Object r6 = r7.b(r2, r0)
            if (r6 != r1) goto L5b
        L5a:
            return r1
        L5b:
            A7.n r6 = A7.n.f558a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.ej.a(co.notix.ni, E7.d):java.lang.Object");
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
            boolean r0 = r6 instanceof co.notix.aj
            if (r0 == 0) goto L13
            r0 = r6
            co.notix.aj r0 = (co.notix.aj) r0
            int r1 = r0.f11853c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11853c = r1
            goto L18
        L13:
            co.notix.aj r0 = new co.notix.aj
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f11851a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f11853c
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
            co.notix.er r6 = r5.f12179c
            r0.f11853c = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L44
            goto L4e
        L44:
            co.notix.vh r6 = (co.notix.vh) r6
            r0.f11853c = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L4f
        L4e:
            return r1
        L4f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.ej.b(E7.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (((co.notix.vh) r6).a(r0) != r1) goto L22;
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
            boolean r0 = r6 instanceof co.notix.qi
            if (r0 == 0) goto L13
            r0 = r6
            co.notix.qi r0 = (co.notix.qi) r0
            int r1 = r0.f13055c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13055c = r1
            goto L18
        L13:
            co.notix.qi r0 = new co.notix.qi
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f13053a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f13055c
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
            co.notix.er r6 = r5.f12179c
            r0.f13055c = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L44
            goto L4e
        L44:
            co.notix.vh r6 = (co.notix.vh) r6
            r0.f13055c = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L4f
        L4e:
            return r1
        L4f:
            A7.n r6 = A7.n.f558a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.ej.a(E7.d):java.lang.Object");
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
            boolean r0 = r7 instanceof co.notix.ri
            if (r0 == 0) goto L13
            r0 = r7
            co.notix.ri r0 = (co.notix.ri) r0
            int r1 = r0.f13126d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13126d = r1
            goto L18
        L13:
            co.notix.ri r0 = new co.notix.ri
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f13124b
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f13126d
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
            java.lang.String r6 = r0.f13123a
            a.AbstractC0485a.A(r7)
            goto L48
        L38:
            a.AbstractC0485a.A(r7)
            co.notix.er r7 = r5.f12179c
            r0.f13123a = r6
            r0.f13126d = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L48
            goto L5a
        L48:
            co.notix.vh r7 = (co.notix.vh) r7
            co.notix.si r2 = new co.notix.si
            r2.<init>(r6)
            r6 = 0
            r0.f13123a = r6
            r0.f13126d = r3
            java.lang.Object r6 = r7.b(r2, r0)
            if (r6 != r1) goto L5b
        L5a:
            return r1
        L5b:
            A7.n r6 = A7.n.f558a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.ej.a(java.lang.String, E7.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (((co.notix.vh) r8).b(r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v2, types: [O7.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, co.notix.ij r7, E7.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof co.notix.cj
            if (r0 == 0) goto L13
            r0 = r8
            co.notix.cj r0 = (co.notix.cj) r0
            int r1 = r0.f12044e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12044e = r1
            goto L18
        L13:
            co.notix.cj r0 = new co.notix.cj
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f12042c
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12044e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            a.AbstractC0485a.A(r8)
            goto L61
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            O7.l r7 = r0.f12041b
            java.lang.String r6 = r0.f12040a
            a.AbstractC0485a.A(r8)
            goto L4c
        L3a:
            a.AbstractC0485a.A(r8)
            co.notix.er r8 = r5.f12179c
            r0.f12040a = r6
            r0.f12041b = r7
            r0.f12044e = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L4c
            goto L60
        L4c:
            co.notix.vh r8 = (co.notix.vh) r8
            co.notix.dj r2 = new co.notix.dj
            r2.<init>(r6, r7)
            r6 = 0
            r0.f12040a = r6
            r0.f12041b = r6
            r0.f12044e = r3
            java.lang.Object r6 = r8.b(r2, r0)
            if (r6 != r1) goto L61
        L60:
            return r1
        L61:
            A7.n r6 = A7.n.f558a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.ej.a(java.lang.String, co.notix.ij, E7.d):java.lang.Object");
    }
}
