package co.notix;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class sk {

    /* renamed from: d, reason: collision with root package name */
    public static final long f13184d = TimeUnit.DAYS.toMillis(1);

    /* renamed from: a, reason: collision with root package name */
    public final er f13185a;

    /* renamed from: b, reason: collision with root package name */
    public final er f13186b;

    /* renamed from: c, reason: collision with root package name */
    public final er f13187c;

    public sk(di objectStorageProvider) {
        kotlin.jvm.internal.h.e(objectStorageProvider, "objectStorageProvider");
        er a5 = ai.a(objectStorageProvider, "pull_manager");
        this.f13185a = new er(new ok(a5, "ad_freq", null));
        this.f13186b = new er(new rk(a5, "first_pull_timestamp", null));
        this.f13187c = new er(new lk(a5, "timestamps", null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (((co.notix.vh) r8).a(r4, (E7.d) r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r6, E7.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof co.notix.xj
            if (r0 == 0) goto L13
            r0 = r8
            co.notix.xj r0 = (co.notix.xj) r0
            int r1 = r0.f13542e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13542e = r1
            goto L18
        L13:
            co.notix.xj r0 = new co.notix.xj
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f13540c
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f13542e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            a.AbstractC0485a.A(r8)
            goto L60
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            long r6 = r0.f13539b
            co.notix.sk r2 = r0.f13538a
            a.AbstractC0485a.A(r8)
            goto L4d
        L3a:
            a.AbstractC0485a.A(r8)
            co.notix.er r8 = r5.f13187c
            r0.f13538a = r5
            r0.f13539b = r6
            r0.f13542e = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L4c
            goto L5f
        L4c:
            r2 = r5
        L4d:
            co.notix.vh r8 = (co.notix.vh) r8
            co.notix.yj r4 = new co.notix.yj
            r4.<init>(r2, r6)
            r6 = 0
            r0.f13538a = r6
            r0.f13542e = r3
            java.lang.Object r6 = r8.a(r4, r0)
            if (r6 != r1) goto L60
        L5f:
            return r1
        L60:
            A7.n r6 = A7.n.f558a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.sk.a(long, E7.d):java.lang.Object");
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
            boolean r0 = r6 instanceof co.notix.ak
            if (r0 == 0) goto L13
            r0 = r6
            co.notix.ak r0 = (co.notix.ak) r0
            int r1 = r0.f11856c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11856c = r1
            goto L18
        L13:
            co.notix.ak r0 = new co.notix.ak
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f11854a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f11856c
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
            co.notix.er r6 = r5.f13185a
            r0.f11856c = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L44
            goto L4e
        L44:
            co.notix.vh r6 = (co.notix.vh) r6
            r0.f11856c = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L4f
        L4e:
            return r1
        L4f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.sk.b(E7.d):java.lang.Object");
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
    public final java.lang.Object c(E7.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof co.notix.bk
            if (r0 == 0) goto L13
            r0 = r6
            co.notix.bk r0 = (co.notix.bk) r0
            int r1 = r0.f11944c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11944c = r1
            goto L18
        L13:
            co.notix.bk r0 = new co.notix.bk
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f11942a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f11944c
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
            co.notix.er r6 = r5.f13186b
            r0.f11944c = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L44
            goto L4e
        L44:
            co.notix.vh r6 = (co.notix.vh) r6
            r0.f11944c = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L4f
        L4e:
            return r1
        L4f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.sk.c(E7.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x009e, code lost:
    
        if (((co.notix.vh) r5).a(r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0092, code lost:
    
        if (r5 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (((co.notix.vh) r5).a(r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        if (r5 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        if (((co.notix.vh) r5).a(r0) != r1) goto L25;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x001e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(E7.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof co.notix.zj
            if (r0 == 0) goto L13
            r0 = r5
            co.notix.zj r0 = (co.notix.zj) r0
            int r1 = r0.f13690d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13690d = r1
            goto L18
        L13:
            co.notix.zj r0 = new co.notix.zj
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f13688b
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f13690d
            switch(r2) {
                case 0: goto L4a;
                case 1: goto L44;
                case 2: goto L3e;
                case 3: goto L38;
                case 4: goto L32;
                case 5: goto L2e;
                case 6: goto L29;
                default: goto L21;
            }
        L21:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L29:
            a.AbstractC0485a.A(r5)
            goto La1
        L2e:
            a.AbstractC0485a.A(r5)
            goto L95
        L32:
            co.notix.sk r2 = r0.f13687a
            a.AbstractC0485a.A(r5)
            goto L86
        L38:
            co.notix.sk r2 = r0.f13687a
            a.AbstractC0485a.A(r5)
            goto L78
        L3e:
            co.notix.sk r2 = r0.f13687a
            a.AbstractC0485a.A(r5)
            goto L6a
        L44:
            co.notix.sk r2 = r0.f13687a
            a.AbstractC0485a.A(r5)
            goto L5c
        L4a:
            a.AbstractC0485a.A(r5)
            co.notix.er r5 = r4.f13185a
            r0.f13687a = r4
            r2 = 1
            r0.f13690d = r2
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L5b
            goto La0
        L5b:
            r2 = r4
        L5c:
            co.notix.vh r5 = (co.notix.vh) r5
            r0.f13687a = r2
            r3 = 2
            r0.f13690d = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L6a
            goto La0
        L6a:
            co.notix.er r5 = r2.f13186b
            r0.f13687a = r2
            r3 = 3
            r0.f13690d = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L78
            goto La0
        L78:
            co.notix.vh r5 = (co.notix.vh) r5
            r0.f13687a = r2
            r3 = 4
            r0.f13690d = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L86
            goto La0
        L86:
            co.notix.er r5 = r2.f13187c
            r2 = 0
            r0.f13687a = r2
            r2 = 5
            r0.f13690d = r2
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L95
            goto La0
        L95:
            co.notix.vh r5 = (co.notix.vh) r5
            r2 = 6
            r0.f13690d = r2
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto La1
        La0:
            return r1
        La1:
            A7.n r5 = A7.n.f558a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.sk.a(E7.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r7, E7.d r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof co.notix.ck
            if (r0 == 0) goto L13
            r0 = r9
            co.notix.ck r0 = (co.notix.ck) r0
            int r1 = r0.f12049e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12049e = r1
            goto L18
        L13:
            co.notix.ck r0 = new co.notix.ck
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f12047c
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12049e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            long r7 = r0.f12046b
            co.notix.sk r0 = r0.f12045a
            a.AbstractC0485a.A(r9)
            goto L61
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            long r7 = r0.f12046b
            co.notix.sk r2 = r0.f12045a
            a.AbstractC0485a.A(r9)
            goto L51
        L3e:
            a.AbstractC0485a.A(r9)
            co.notix.er r9 = r6.f13187c
            r0.f12045a = r6
            r0.f12046b = r7
            r0.f12049e = r4
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L50
            goto L5f
        L50:
            r2 = r6
        L51:
            co.notix.vh r9 = (co.notix.vh) r9
            r0.f12045a = r2
            r0.f12046b = r7
            r0.f12049e = r3
            java.lang.Object r9 = r9.b(r0)
            if (r9 != r1) goto L60
        L5f:
            return r1
        L60:
            r0 = r2
        L61:
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L93
            r0.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
        L71:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L8e
            java.lang.Object r1 = r9.next()
            r2 = r1
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            long r4 = co.notix.sk.f13184d
            long r4 = r7 - r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L71
            r0.add(r1)
            goto L71
        L8e:
            int r7 = r0.size()
            goto L94
        L93:
            r7 = 0
        L94:
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.sk.b(long, E7.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (((co.notix.vh) r8).a(r2, r0) != r1) goto L22;
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
    public final java.lang.Object c(long r6, E7.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof co.notix.ek
            if (r0 == 0) goto L13
            r0 = r8
            co.notix.ek r0 = (co.notix.ek) r0
            int r1 = r0.f12183d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12183d = r1
            goto L18
        L13:
            co.notix.ek r0 = new co.notix.ek
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f12181b
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12183d
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
            long r6 = r0.f12180a
            a.AbstractC0485a.A(r8)
            goto L48
        L38:
            a.AbstractC0485a.A(r8)
            co.notix.er r8 = r5.f13186b
            r0.f12180a = r6
            r0.f12183d = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L48
            goto L57
        L48:
            co.notix.vh r8 = (co.notix.vh) r8
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r6)
            r0.f12183d = r3
            java.lang.Object r6 = r8.a(r2, r0)
            if (r6 != r1) goto L58
        L57:
            return r1
        L58:
            A7.n r6 = A7.n.f558a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.sk.c(long, E7.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (((co.notix.vh) r7).a(r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
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
    public final java.lang.Object a(int r6, E7.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof co.notix.dk
            if (r0 == 0) goto L13
            r0 = r7
            co.notix.dk r0 = (co.notix.dk) r0
            int r1 = r0.f12110d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12110d = r1
            goto L18
        L13:
            co.notix.dk r0 = new co.notix.dk
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f12108b
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12110d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            a.AbstractC0485a.A(r7)
            goto L58
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            int r6 = r0.f12107a
            a.AbstractC0485a.A(r7)
            goto L48
        L38:
            a.AbstractC0485a.A(r7)
            co.notix.er r7 = r5.f13185a
            r0.f12107a = r6
            r0.f12110d = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L48
            goto L57
        L48:
            co.notix.vh r7 = (co.notix.vh) r7
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r6)
            r0.f12110d = r3
            java.lang.Object r6 = r7.a(r2, r0)
            if (r6 != r1) goto L58
        L57:
            return r1
        L58:
            A7.n r6 = A7.n.f558a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.sk.a(int, E7.d):java.lang.Object");
    }
}
