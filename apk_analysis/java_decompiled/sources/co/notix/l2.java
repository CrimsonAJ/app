package co.notix;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l2 {

    /* renamed from: m, reason: collision with root package name */
    public static final long f12658m = TimeUnit.DAYS.toMillis(1);

    /* renamed from: a, reason: collision with root package name */
    public final er f12659a;

    /* renamed from: b, reason: collision with root package name */
    public final er f12660b;

    /* renamed from: c, reason: collision with root package name */
    public final er f12661c;

    /* renamed from: d, reason: collision with root package name */
    public final er f12662d;

    /* renamed from: e, reason: collision with root package name */
    public final er f12663e;

    /* renamed from: f, reason: collision with root package name */
    public final er f12664f;

    /* renamed from: g, reason: collision with root package name */
    public final er f12665g;

    /* renamed from: h, reason: collision with root package name */
    public final er f12666h;

    /* renamed from: i, reason: collision with root package name */
    public final er f12667i;
    public final er j;

    /* renamed from: k, reason: collision with root package name */
    public final er f12668k;

    /* renamed from: l, reason: collision with root package name */
    public final er f12669l;

    public l2(di objectStorageProvider) {
        kotlin.jvm.internal.h.e(objectStorageProvider, "objectStorageProvider");
        er a5 = ai.a(objectStorageProvider, "ad_counter");
        this.f12659a = new er(new p1(a5, "pnt", null));
        this.f12660b = new er(new d0(a5, "pnd", null));
        this.f12661c = new er(new s1(a5, "lnt", null));
        this.f12662d = new er(new k0(a5, "lnd", null));
        this.f12663e = new er(new v1(a5, "rnt", null));
        this.f12664f = new er(new r0(a5, "rnd", null));
        this.f12665g = new er(new y1(a5, "rst", null));
        this.f12666h = new er(new y0(a5, "rsd", null));
        this.f12667i = new er(new b2(a5, "int", null));
        this.j = new er(new f1(a5, "ind", null));
        this.f12668k = new er(new e2(a5, "ist", null));
        this.f12669l = new er(new m1(a5, "isd", null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (r6 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
        if (r6 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(co.notix.er r5, E7.d r6) {
        /*
            boolean r0 = r6 instanceof co.notix.v
            if (r0 == 0) goto L13
            r0 = r6
            co.notix.v r0 = (co.notix.v) r0
            int r1 = r0.f13324b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13324b = r1
            goto L18
        L13:
            co.notix.v r0 = new co.notix.v
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f13323a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f13324b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            a.AbstractC0485a.A(r6)
            goto L4d
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            a.AbstractC0485a.A(r6)
            goto L42
        L36:
            a.AbstractC0485a.A(r6)
            r0.f13324b = r4
            java.lang.Object r6 = r5.a(r0)
            if (r6 != r1) goto L42
            goto L4c
        L42:
            co.notix.vh r6 = (co.notix.vh) r6
            r0.f13324b = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L4d
        L4c:
            return r1
        L4d:
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L56
            int r5 = r6.intValue()
            goto L57
        L56:
            r5 = 0
        L57:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.l2.c(co.notix.er, E7.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(co.notix.er r8, E7.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof co.notix.p
            if (r0 == 0) goto L13
            r0 = r9
            co.notix.p r0 = (co.notix.p) r0
            int r1 = r0.f12916e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12916e = r1
            goto L18
        L13:
            co.notix.p r0 = new co.notix.p
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f12914c
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12916e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            long r1 = r0.f12913b
            co.notix.l2 r8 = r0.f12912a
            a.AbstractC0485a.A(r9)
            goto L69
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            long r4 = r0.f12913b
            co.notix.l2 r8 = r0.f12912a
            a.AbstractC0485a.A(r9)
            goto L54
        L3e:
            a.AbstractC0485a.A(r9)
            long r5 = java.lang.System.currentTimeMillis()
            r0.f12912a = r7
            r0.f12913b = r5
            r0.f12916e = r4
            java.lang.Object r9 = r8.a(r0)
            if (r9 != r1) goto L52
            goto L67
        L52:
            r8 = r7
            r4 = r5
        L54:
            co.notix.vh r9 = (co.notix.vh) r9
            co.notix.q r2 = new co.notix.q
            r2.<init>(r8, r4)
            r0.f12912a = r8
            r0.f12913b = r4
            r0.f12916e = r3
            java.lang.Object r9 = r9.a(r2, r0)
            if (r9 != r1) goto L68
        L67:
            return r1
        L68:
            r1 = r4
        L69:
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L79
            r8.getClass()
            java.util.ArrayList r8 = a(r9, r1)
            int r8 = r8.size()
            goto L7a
        L79:
            r8 = 0
        L7a:
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.l2.a(co.notix.er, E7.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (r7 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(co.notix.er r6, E7.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof co.notix.s
            if (r0 == 0) goto L13
            r0 = r7
            co.notix.s r0 = (co.notix.s) r0
            int r1 = r0.f13142c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13142c = r1
            goto L18
        L13:
            co.notix.s r0 = new co.notix.s
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f13140a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f13142c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
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
            a.AbstractC0485a.A(r7)
            goto L42
        L36:
            a.AbstractC0485a.A(r7)
            r0.f13142c = r4
            java.lang.Object r7 = r6.a(r0)
            if (r7 != r1) goto L42
            goto L4e
        L42:
            co.notix.vh r7 = (co.notix.vh) r7
            co.notix.t r6 = co.notix.t.f13198a
            r0.f13142c = r3
            java.lang.Object r6 = r7.a(r6, r0)
            if (r6 != r1) goto L4f
        L4e:
            return r1
        L4f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.l2.b(co.notix.er, E7.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r2.a(r6, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(E7.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof co.notix.h2
            if (r0 == 0) goto L13
            r0 = r6
            co.notix.h2 r0 = (co.notix.h2) r0
            int r1 = r0.f12350d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12350d = r1
            goto L18
        L13:
            co.notix.h2 r0 = new co.notix.h2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f12348b
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12350d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            a.AbstractC0485a.A(r6)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            co.notix.l2 r2 = r0.f12347a
            a.AbstractC0485a.A(r6)
            goto L49
        L38:
            a.AbstractC0485a.A(r6)
            co.notix.er r6 = r5.f12667i
            r0.f12347a = r5
            r0.f12350d = r4
            java.lang.Object r6 = r5.b(r6, r0)
            if (r6 != r1) goto L48
            goto L56
        L48:
            r2 = r5
        L49:
            co.notix.er r6 = r2.j
            r4 = 0
            r0.f12347a = r4
            r0.f12350d = r3
            java.lang.Object r6 = r2.a(r6, r0)
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            A7.n r6 = A7.n.f558a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.l2.d(E7.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r2.a(r6, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(E7.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof co.notix.i2
            if (r0 == 0) goto L13
            r0 = r6
            co.notix.i2 r0 = (co.notix.i2) r0
            int r1 = r0.f12429d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12429d = r1
            goto L18
        L13:
            co.notix.i2 r0 = new co.notix.i2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f12427b
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12429d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            a.AbstractC0485a.A(r6)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            co.notix.l2 r2 = r0.f12426a
            a.AbstractC0485a.A(r6)
            goto L49
        L38:
            a.AbstractC0485a.A(r6)
            co.notix.er r6 = r5.f12663e
            r0.f12426a = r5
            r0.f12429d = r4
            java.lang.Object r6 = r5.b(r6, r0)
            if (r6 != r1) goto L48
            goto L56
        L48:
            r2 = r5
        L49:
            co.notix.er r6 = r2.f12664f
            r4 = 0
            r0.f12426a = r4
            r0.f12429d = r3
            java.lang.Object r6 = r2.a(r6, r0)
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            A7.n r6 = A7.n.f558a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.l2.e(E7.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r2.a(r6, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(E7.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof co.notix.j2
            if (r0 == 0) goto L13
            r0 = r6
            co.notix.j2 r0 = (co.notix.j2) r0
            int r1 = r0.f12504d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12504d = r1
            goto L18
        L13:
            co.notix.j2 r0 = new co.notix.j2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f12502b
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12504d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            a.AbstractC0485a.A(r6)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            co.notix.l2 r2 = r0.f12501a
            a.AbstractC0485a.A(r6)
            goto L49
        L38:
            a.AbstractC0485a.A(r6)
            co.notix.er r6 = r5.f12661c
            r0.f12501a = r5
            r0.f12504d = r4
            java.lang.Object r6 = r5.b(r6, r0)
            if (r6 != r1) goto L48
            goto L56
        L48:
            r2 = r5
        L49:
            co.notix.er r6 = r2.f12662d
            r4 = 0
            r0.f12501a = r4
            r0.f12504d = r3
            java.lang.Object r6 = r2.a(r6, r0)
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            A7.n r6 = A7.n.f558a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.l2.f(E7.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r2.a(r6, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(E7.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof co.notix.k2
            if (r0 == 0) goto L13
            r0 = r6
            co.notix.k2 r0 = (co.notix.k2) r0
            int r1 = r0.f12588d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12588d = r1
            goto L18
        L13:
            co.notix.k2 r0 = new co.notix.k2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f12586b
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12588d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            a.AbstractC0485a.A(r6)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            co.notix.l2 r2 = r0.f12585a
            a.AbstractC0485a.A(r6)
            goto L49
        L38:
            a.AbstractC0485a.A(r6)
            co.notix.er r6 = r5.f12659a
            r0.f12585a = r5
            r0.f12588d = r4
            java.lang.Object r6 = r5.b(r6, r0)
            if (r6 != r1) goto L48
            goto L56
        L48:
            r2 = r5
        L49:
            co.notix.er r6 = r2.f12660b
            r4 = 0
            r0.f12585a = r4
            r0.f12588d = r3
            java.lang.Object r6 = r2.a(r6, r0)
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            A7.n r6 = A7.n.f558a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.l2.g(E7.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r2.a(r6, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(E7.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof co.notix.f2
            if (r0 == 0) goto L13
            r0 = r6
            co.notix.f2 r0 = (co.notix.f2) r0
            int r1 = r0.f12215d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12215d = r1
            goto L18
        L13:
            co.notix.f2 r0 = new co.notix.f2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f12213b
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12215d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            a.AbstractC0485a.A(r6)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            co.notix.l2 r2 = r0.f12212a
            a.AbstractC0485a.A(r6)
            goto L49
        L38:
            a.AbstractC0485a.A(r6)
            co.notix.er r6 = r5.f12668k
            r0.f12212a = r5
            r0.f12215d = r4
            java.lang.Object r6 = r5.b(r6, r0)
            if (r6 != r1) goto L48
            goto L56
        L48:
            r2 = r5
        L49:
            co.notix.er r6 = r2.f12669l
            r4 = 0
            r0.f12212a = r4
            r0.f12215d = r3
            java.lang.Object r6 = r2.a(r6, r0)
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            A7.n r6 = A7.n.f558a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.l2.b(E7.d):java.lang.Object");
    }

    public static ArrayList a(List list, long j) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Number) obj).longValue() >= j - f12658m) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r2.a(r6, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(E7.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof co.notix.g2
            if (r0 == 0) goto L13
            r0 = r6
            co.notix.g2 r0 = (co.notix.g2) r0
            int r1 = r0.f12289d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12289d = r1
            goto L18
        L13:
            co.notix.g2 r0 = new co.notix.g2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f12287b
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12289d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            a.AbstractC0485a.A(r6)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            co.notix.l2 r2 = r0.f12286a
            a.AbstractC0485a.A(r6)
            goto L49
        L38:
            a.AbstractC0485a.A(r6)
            co.notix.er r6 = r5.f12665g
            r0.f12286a = r5
            r0.f12289d = r4
            java.lang.Object r6 = r5.b(r6, r0)
            if (r6 != r1) goto L48
            goto L56
        L48:
            r2 = r5
        L49:
            co.notix.er r6 = r2.f12666h
            r4 = 0
            r0.f12286a = r4
            r0.f12289d = r3
            java.lang.Object r6 = r2.a(r6, r0)
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            A7.n r6 = A7.n.f558a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.l2.c(E7.d):java.lang.Object");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0022. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(E7.d r21) {
        /*
            Method dump skipped, instructions count: 1026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.l2.a(E7.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
    
        if (r11 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(co.notix.er r7, co.notix.l2 r8, long r9, E7.d r11) {
        /*
            boolean r0 = r11 instanceof co.notix.w
            if (r0 == 0) goto L13
            r0 = r11
            co.notix.w r0 = (co.notix.w) r0
            int r1 = r0.f13395d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13395d = r1
            goto L18
        L13:
            co.notix.w r0 = new co.notix.w
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f13394c
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f13395d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            long r7 = r0.f13393b
            co.notix.l2 r9 = r0.f13392a
            a.AbstractC0485a.A(r11)
            goto L60
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            long r9 = r0.f13393b
            co.notix.l2 r8 = r0.f13392a
            a.AbstractC0485a.A(r11)
            goto L4e
        L3e:
            a.AbstractC0485a.A(r11)
            r0.f13392a = r8
            r0.f13393b = r9
            r0.f13395d = r4
            java.lang.Object r11 = r7.a(r0)
            if (r11 != r1) goto L4e
            goto L5c
        L4e:
            co.notix.vh r11 = (co.notix.vh) r11
            r0.f13392a = r8
            r0.f13393b = r9
            r0.f13395d = r3
            java.lang.Object r11 = r11.b(r0)
            if (r11 != r1) goto L5d
        L5c:
            return r1
        L5d:
            r5 = r9
            r9 = r8
            r7 = r5
        L60:
            java.util.List r11 = (java.util.List) r11
            if (r11 == 0) goto L70
            r9.getClass()
            java.util.ArrayList r7 = a(r11, r7)
            int r7 = r7.size()
            goto L71
        L70:
            r7 = 0
        L71:
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.l2.a(co.notix.er, co.notix.l2, long, E7.d):java.lang.Object");
    }
}
