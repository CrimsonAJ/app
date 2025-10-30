package co.notix;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class lm implements yl {

    /* renamed from: f, reason: collision with root package name */
    public static final long f12727f = TimeUnit.HOURS.toMillis(1);

    /* renamed from: a, reason: collision with root package name */
    public final xl f12728a;

    /* renamed from: b, reason: collision with root package name */
    public final y8 f12729b;

    /* renamed from: c, reason: collision with root package name */
    public final vn f12730c;

    /* renamed from: d, reason: collision with root package name */
    public final mq f12731d;

    /* renamed from: e, reason: collision with root package name */
    public final g8.a f12732e;

    public lm(xl remoteLoggerDataSource, d9 contextProvider, vn remoteLoggerStorage, mq settingsRepository) {
        kotlin.jvm.internal.h.e(remoteLoggerDataSource, "remoteLoggerDataSource");
        kotlin.jvm.internal.h.e(contextProvider, "contextProvider");
        kotlin.jvm.internal.h.e(remoteLoggerStorage, "remoteLoggerStorage");
        kotlin.jvm.internal.h.e(settingsRepository, "settingsRepository");
        this.f12728a = remoteLoggerDataSource;
        this.f12729b = contextProvider;
        this.f12730c = remoteLoggerStorage;
        this.f12731d = settingsRepository;
        this.f12732e = g8.e.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0026. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0116 A[Catch: all -> 0x00c1, TryCatch #2 {all -> 0x00c1, blocks: (B:97:0x009a, B:99:0x0156, B:104:0x00ac, B:105:0x0129, B:110:0x013c, B:114:0x00bb, B:117:0x0105, B:119:0x0116), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x020b A[Catch: all -> 0x0254, TRY_LEAVE, TryCatch #3 {all -> 0x0254, blocks: (B:21:0x0201, B:23:0x020b, B:25:0x0219), top: B:20:0x0201 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0281 A[Catch: all -> 0x0040, TryCatch #1 {all -> 0x0040, blocks: (B:13:0x003b, B:14:0x0229, B:31:0x0264, B:33:0x0281, B:34:0x028c, B:38:0x029e), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01cd A[Catch: all -> 0x0257, TryCatch #5 {all -> 0x0257, blocks: (B:18:0x0053, B:24:0x0215, B:49:0x006b, B:51:0x01b8, B:53:0x01bc, B:56:0x01c3, B:57:0x01c7, B:59:0x01cd, B:62:0x01d9, B:68:0x01de, B:69:0x01e5, B:72:0x01e6), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0187 A[Catch: all -> 0x0260, TRY_ENTER, TryCatch #0 {all -> 0x0260, blocks: (B:80:0x017b, B:84:0x0187, B:86:0x0192), top: B:79:0x017b }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v16, types: [g8.a] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v4, types: [g8.a] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(co.notix.ll r24, E7.d r25) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.lm.a(co.notix.ll, E7.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(co.notix.ll r18, E7.d r19) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.lm.b(co.notix.ll, E7.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(E7.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof co.notix.cm
            if (r0 == 0) goto L13
            r0 = r5
            co.notix.cm r0 = (co.notix.cm) r0
            int r1 = r0.f12053c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12053c = r1
            goto L18
        L13:
            co.notix.cm r0 = new co.notix.cm
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f12051a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12053c
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
            co.notix.mq r5 = r4.f12731d
            r0.f12053c = r3
            java.lang.Object r5 = r5.g(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            co.notix.rp r5 = (co.notix.rp) r5
            if (r5 == 0) goto L47
            co.notix.ql r5 = r5.f13137a
            if (r5 != 0) goto L46
            goto L47
        L46:
            return r5
        L47:
            co.notix.ql r5 = co.notix.ql.NONE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.lm.c(E7.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(E7.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof co.notix.dm
            if (r0 == 0) goto L13
            r0 = r5
            co.notix.dm r0 = (co.notix.dm) r0
            int r1 = r0.f12117c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12117c = r1
            goto L18
        L13:
            co.notix.dm r0 = new co.notix.dm
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f12115a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12117c
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
            co.notix.vn r5 = r4.f12730c
            r0.f12117c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L46
            long r0 = r5.longValue()
            goto L48
        L46:
            r0 = 0
        L48:
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.lm.d(E7.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0067, code lost:
    
        if (r10 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(E7.d r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof co.notix.hm
            if (r0 == 0) goto L13
            r0 = r10
            co.notix.hm r0 = (co.notix.hm) r0
            int r1 = r0.f12406e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12406e = r1
            goto L18
        L13:
            co.notix.hm r0 = new co.notix.hm
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f12404c
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12406e
            A7.n r3 = A7.n.f558a
            r4 = 1
            r5 = 3
            r6 = 2
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3f
            if (r2 == r6) goto L37
            if (r2 != r5) goto L2f
            a.AbstractC0485a.A(r10)
            return r3
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L37:
            java.util.List r2 = r0.f12403b
            co.notix.lm r4 = r0.f12402a
            a.AbstractC0485a.A(r10)
            goto L6a
        L3f:
            co.notix.lm r2 = r0.f12402a
            a.AbstractC0485a.A(r10)
            r4 = r2
            goto L57
        L46:
            a.AbstractC0485a.A(r10)
            co.notix.vn r10 = r9.f12730c
            r0.f12402a = r9
            r0.f12406e = r4
            java.lang.Object r10 = r10.a(r0)
            if (r10 != r1) goto L56
            goto Lc1
        L56:
            r4 = r9
        L57:
            r2 = r10
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L5d
            goto Lc2
        L5d:
            r0.f12402a = r4
            r0.f12403b = r2
            r0.f12406e = r6
            java.lang.Object r10 = r4.c(r0)
            if (r10 != r1) goto L6a
            goto Lc1
        L6a:
            co.notix.ql r10 = (co.notix.ql) r10
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r2 = r2.iterator()
        L75:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L8e
            java.lang.Object r7 = r2.next()
            r8 = r7
            co.notix.pl r8 = (co.notix.pl) r8
            co.notix.ql r8 = r8.f12984b
            int r8 = r8.compareTo(r10)
            if (r8 <= 0) goto L75
            r6.add(r7)
            goto L75
        L8e:
            java.util.ArrayList r10 = new java.util.ArrayList
            r2 = 10
            int r2 = B7.m.f0(r6, r2)
            r10.<init>(r2)
            int r2 = r6.size()
            r7 = 0
        L9e:
            if (r7 >= r2) goto Lae
            java.lang.Object r8 = r6.get(r7)
            int r7 = r7 + 1
            co.notix.pl r8 = (co.notix.pl) r8
            java.lang.String r8 = r8.f12983a
            r10.add(r8)
            goto L9e
        Lae:
            java.util.Set r10 = B7.k.K0(r10)
            co.notix.vn r2 = r4.f12730c
            r4 = 0
            r0.f12402a = r4
            r0.f12403b = r4
            r0.f12406e = r5
            java.lang.Object r10 = r2.a(r10, r0)
            if (r10 != r1) goto Lc2
        Lc1:
            return r1
        Lc2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.lm.e(E7.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(5:5|6|7|(1:(1:(1:(1:(1:(10:14|15|16|17|(8:19|20|(2:22|23)|25|(3:27|(4:30|(2:32|33)(1:35)|34|28)|36)(1:54)|(1:38)(1:53)|39|(2:42|(2:44|23)(5:45|46|(2:49|47)|50|51)))|55|56|(1:58)(1:61)|59|60)(2:63|64))(6:65|66|46|(1:47)|50|51))(12:67|68|25|(0)(0)|(0)(0)|39|(2:42|(0)(0))|55|56|(0)(0)|59|60))(14:69|70|20|(0)|25|(0)(0)|(0)(0)|39|(0)|55|56|(0)(0)|59|60))(1:71))(3:74|(1:76)|23)|72))|79|6|7|(0)(0)|72) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x019c, code lost:
    
        if (r0.a(r6, r2) != r3) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x009b, code lost:
    
        if (r0 != r3) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0049, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b0, code lost:
    
        r0 = a.AbstractC0485a.h(r0);
        r11 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c7 A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:15:0x0044, B:16:0x019f, B:20:0x00ad, B:25:0x00c3, B:27:0x00c7, B:28:0x00d0, B:30:0x00d6, B:32:0x00e5, B:38:0x00ed, B:39:0x00f3, B:42:0x00f9, B:46:0x015c, B:47:0x0176, B:49:0x017c, B:51:0x0188, B:66:0x0060, B:68:0x006f), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:15:0x0044, B:16:0x019f, B:20:0x00ad, B:25:0x00c3, B:27:0x00c7, B:28:0x00d0, B:30:0x00d6, B:32:0x00e5, B:38:0x00ed, B:39:0x00f3, B:42:0x00f9, B:46:0x015c, B:47:0x0176, B:49:0x017c, B:51:0x0188, B:66:0x0060, B:68:0x006f), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017c A[Catch: all -> 0x0049, LOOP:1: B:47:0x0176->B:49:0x017c, LOOP_END, TryCatch #0 {all -> 0x0049, blocks: (B:15:0x0044, B:16:0x019f, B:20:0x00ad, B:25:0x00c3, B:27:0x00c7, B:28:0x00d0, B:30:0x00d6, B:32:0x00e5, B:38:0x00ed, B:39:0x00f3, B:42:0x00f9, B:46:0x015c, B:47:0x0176, B:49:0x017c, B:51:0x0188, B:66:0x0060, B:68:0x006f), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x019c -> B:16:0x019f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(E7.d r22) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.lm.f(E7.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(co.notix.ll r9, E7.d r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof co.notix.jm
            if (r0 == 0) goto L13
            r0 = r10
            co.notix.jm r0 = (co.notix.jm) r0
            int r1 = r0.f12572e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12572e = r1
            goto L18
        L13:
            co.notix.jm r0 = new co.notix.jm
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f12570c
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12572e
            A7.n r3 = A7.n.f558a
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L49
            if (r2 == r6) goto L41
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            a.AbstractC0485a.A(r10)
            goto L83
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            co.notix.pl r9 = r0.f12569b
            java.lang.Object r2 = r0.f12568a
            co.notix.vn r2 = (co.notix.vn) r2
            a.AbstractC0485a.A(r10)
            goto L6f
        L41:
            java.lang.Object r9 = r0.f12568a
            co.notix.lm r9 = (co.notix.lm) r9
            a.AbstractC0485a.A(r10)
            goto L58
        L49:
            a.AbstractC0485a.A(r10)
            r0.f12568a = r8
            r0.f12572e = r6
            java.lang.Object r10 = r8.a(r9, r0)
            if (r10 != r1) goto L57
            goto L82
        L57:
            r9 = r8
        L58:
            co.notix.pl r10 = (co.notix.pl) r10
            if (r10 != 0) goto L5d
            return r3
        L5d:
            co.notix.vn r2 = r9.f12730c
            r0.f12568a = r2
            r0.f12569b = r10
            r0.f12572e = r5
            java.lang.Object r9 = r9.b(r0)
            if (r9 != r1) goto L6c
            goto L82
        L6c:
            r7 = r10
            r10 = r9
            r9 = r7
        L6f:
            java.lang.Number r10 = (java.lang.Number) r10
            long r5 = r10.longValue()
            r10 = 0
            r0.f12568a = r10
            r0.f12569b = r10
            r0.f12572e = r4
            java.lang.Object r9 = r2.a(r9, r5, r0)
            if (r9 != r1) goto L83
        L82:
            return r1
        L83:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.lm.c(co.notix.ll, E7.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(E7.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof co.notix.am
            if (r0 == 0) goto L13
            r0 = r5
            co.notix.am r0 = (co.notix.am) r0
            int r1 = r0.f11867c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11867c = r1
            goto L18
        L13:
            co.notix.am r0 = new co.notix.am
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f11865a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f11867c
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
            co.notix.mq r5 = r4.f12731d
            r0.f11867c = r3
            java.lang.Object r5 = r5.g(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            co.notix.rp r5 = (co.notix.rp) r5
            if (r5 == 0) goto L4a
            java.lang.Long r5 = r5.f13138b
            if (r5 == 0) goto L4a
            long r0 = r5.longValue()
            goto L4c
        L4a:
            r0 = 1000(0x3e8, double:4.94E-321)
        L4c:
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.lm.b(E7.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(E7.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof co.notix.zl
            if (r0 == 0) goto L13
            r0 = r5
            co.notix.zl r0 = (co.notix.zl) r0
            int r1 = r0.f13700c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13700c = r1
            goto L18
        L13:
            co.notix.zl r0 = new co.notix.zl
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f13698a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f13700c
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
            co.notix.mq r5 = r4.f12731d
            r0.f13700c = r3
            java.lang.Object r5 = r5.g(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            co.notix.rp r5 = (co.notix.rp) r5
            if (r5 == 0) goto L54
            co.notix.qp r5 = r5.f13139c
            if (r5 == 0) goto L54
            java.lang.Long r5 = r5.f13072d
            if (r5 == 0) goto L54
            long r0 = r5.longValue()
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
        L4f:
            long r0 = r5.toMillis(r0)
            goto L59
        L54:
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.DAYS
            r0 = 1
            goto L4f
        L59:
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.lm.a(E7.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(co.notix.ql r5, E7.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof co.notix.bm
            if (r0 == 0) goto L13
            r0 = r6
            co.notix.bm r0 = (co.notix.bm) r0
            int r1 = r0.f11952d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11952d = r1
            goto L18
        L13:
            co.notix.bm r0 = new co.notix.bm
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f11950b
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f11952d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            co.notix.ql r5 = r0.f11949a
            a.AbstractC0485a.A(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            a.AbstractC0485a.A(r6)
            co.notix.mq r6 = r4.f12731d
            r0.f11949a = r5
            r0.f11952d = r3
            java.lang.Object r6 = r6.g(r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            co.notix.rp r6 = (co.notix.rp) r6
            if (r6 == 0) goto L48
            co.notix.qp r6 = r6.f13139c
            goto L49
        L48:
            r6 = 0
        L49:
            int r5 = r5.ordinal()
            r0 = 2
            if (r5 == r0) goto L67
            r0 = 3
            if (r5 == r0) goto L5d
            if (r6 == 0) goto L5a
            java.lang.Long r5 = r6.f13071c
            if (r5 == 0) goto L5a
            goto L6d
        L5a:
            r5 = 20
            goto L74
        L5d:
            if (r6 == 0) goto L64
            java.lang.Long r5 = r6.f13069a
            if (r5 == 0) goto L64
            goto L6d
        L64:
            r5 = 500(0x1f4, double:2.47E-321)
            goto L74
        L67:
            if (r6 == 0) goto L72
            java.lang.Long r5 = r6.f13070b
            if (r5 == 0) goto L72
        L6d:
            long r5 = r5.longValue()
            goto L74
        L72:
            r5 = 30
        L74:
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.lm.a(co.notix.ql, E7.d):java.lang.Object");
    }
}
