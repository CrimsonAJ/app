package co.notix;

import Y7.InterfaceC0484z;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l4 implements d4 {

    /* renamed from: g, reason: collision with root package name */
    public static final long f12671g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f12672h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f12673i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0484z f12674a;

    /* renamed from: b, reason: collision with root package name */
    public final m2 f12675b;

    /* renamed from: c, reason: collision with root package name */
    public final m5 f12676c;

    /* renamed from: d, reason: collision with root package name */
    public final xq f12677d;

    /* renamed from: e, reason: collision with root package name */
    public final t7 f12678e;

    /* renamed from: f, reason: collision with root package name */
    public final l2 f12679f;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        long millis = timeUnit.toMillis(30L);
        f12671g = millis;
        long j = millis / 5;
        long millis2 = timeUnit.toMillis(3L);
        if (j > millis2) {
            j = millis2;
        }
        f12672h = j;
    }

    public l4(InterfaceC0484z csIo, u2 adDataSource, m5 adStorage, xq storage, c8 cachingImageLoader, l2 adCounter) {
        kotlin.jvm.internal.h.e(csIo, "csIo");
        kotlin.jvm.internal.h.e(adDataSource, "adDataSource");
        kotlin.jvm.internal.h.e(adStorage, "adStorage");
        kotlin.jvm.internal.h.e(storage, "storage");
        kotlin.jvm.internal.h.e(cachingImageLoader, "cachingImageLoader");
        kotlin.jvm.internal.h.e(adCounter, "adCounter");
        this.f12674a = csIo;
        this.f12675b = adDataSource;
        this.f12676c = adStorage;
        this.f12677d = storage;
        this.f12678e = cachingImageLoader;
        this.f12679f = adCounter;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(co.notix.o4 r14, E7.d r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof co.notix.e4
            if (r0 == 0) goto L13
            r0 = r15
            co.notix.e4 r0 = (co.notix.e4) r0
            int r1 = r0.f12138e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12138e = r1
            goto L18
        L13:
            co.notix.e4 r0 = new co.notix.e4
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f12136c
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12138e
            A7.n r3 = A7.n.f558a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            a.AbstractC0485a.A(r15)
            goto L7e
        L2c:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L34:
            co.notix.o4 r14 = r0.f12135b
            co.notix.l4 r2 = r0.f12134a
            a.AbstractC0485a.A(r15)
        L3b:
            r7 = r14
            goto L4f
        L3d:
            a.AbstractC0485a.A(r15)
            r0.f12134a = r13
            r0.f12135b = r14
            r0.f12138e = r5
            java.lang.Object r15 = r13.b(r14, r0)
            if (r15 != r1) goto L4d
            goto L7d
        L4d:
            r2 = r13
            goto L3b
        L4f:
            r8 = r15
            co.notix.l r8 = (co.notix.l) r8
            if (r8 != 0) goto L55
            return r3
        L55:
            co.notix.m5 r14 = r2.f12676c
            co.notix.t4 r5 = new co.notix.t4
            java.util.UUID r15 = java.util.UUID.randomUUID()
            java.lang.String r6 = r15.toString()
            java.lang.String r15 = "randomUUID().toString()"
            kotlin.jvm.internal.h.d(r6, r15)
            long r9 = java.lang.System.currentTimeMillis()
            long r11 = co.notix.l4.f12671g
            long r9 = r9 + r11
            r5.<init>(r6, r7, r8, r9)
            r15 = 0
            r0.f12134a = r15
            r0.f12135b = r15
            r0.f12138e = r4
            java.lang.Object r14 = r14.a(r5, r0)
            if (r14 != r1) goto L7e
        L7d:
            return r1
        L7e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.l4.a(co.notix.o4, E7.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(2:63|(1:(1:(1:(2:68|69)(2:70|71))(4:72|73|29|(3:31|35|(3:37|(2:39|40)|45)(2:41|42))(2:32|33)))(5:74|75|76|51|(6:53|23|24|(4:26|(2:28|45)|29|(0)(0))|35|(0)(0))(2:54|55)))(10:77|78|79|21|(2:43|44)|23|24|(0)|35|(0)(0)))(4:10|11|12|13))(5:83|84|85|(1:87)|45)|14|15|16|(2:18|(8:20|21|(0)|23|24|(0)|35|(0)(0)))(2:46|(2:48|(3:50|51|(0)(0)))(2:56|57))|45))|92|6|7|(0)(0)|14|15|16|(0)(0)|45) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0174, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0163, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e0 A[Catch: all -> 0x0174, TRY_LEAVE, TryCatch #1 {all -> 0x0174, blocks: (B:16:0x00d1, B:18:0x00e0, B:46:0x010c, B:48:0x0110, B:56:0x016e, B:57:0x0173), top: B:15:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0133 A[Catch: all -> 0x0163, TryCatch #0 {all -> 0x0163, blocks: (B:73:0x0052, B:29:0x014a, B:32:0x014f, B:33:0x0162, B:51:0x012a, B:24:0x012f, B:26:0x0133, B:54:0x0166, B:55:0x016d, B:21:0x00fa, B:43:0x0104, B:44:0x010b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014f A[Catch: all -> 0x0163, TryCatch #0 {all -> 0x0163, blocks: (B:73:0x0052, B:29:0x014a, B:32:0x014f, B:33:0x0162, B:51:0x012a, B:24:0x012f, B:26:0x0133, B:54:0x0166, B:55:0x016d, B:21:0x00fa, B:43:0x0104, B:44:0x010b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0104 A[Catch: all -> 0x0163, TryCatch #0 {all -> 0x0163, blocks: (B:73:0x0052, B:29:0x014a, B:32:0x014f, B:33:0x0162, B:51:0x012a, B:24:0x012f, B:26:0x0133, B:54:0x0166, B:55:0x016d, B:21:0x00fa, B:43:0x0104, B:44:0x010b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010c A[Catch: all -> 0x0174, TRY_ENTER, TryCatch #1 {all -> 0x0174, blocks: (B:16:0x00d1, B:18:0x00e0, B:46:0x010c, B:48:0x0110, B:56:0x016e, B:57:0x0173), top: B:15:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0166 A[Catch: all -> 0x0163, TryCatch #0 {all -> 0x0163, blocks: (B:73:0x0052, B:29:0x014a, B:32:0x014f, B:33:0x0162, B:51:0x012a, B:24:0x012f, B:26:0x0133, B:54:0x0166, B:55:0x016d, B:21:0x00fa, B:43:0x0104, B:44:0x010b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v17, types: [co.notix.l4] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(co.notix.o4 r25, E7.d r26) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.l4.b(co.notix.o4, E7.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(co.notix.o4 r5, E7.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof co.notix.j4
            if (r0 == 0) goto L13
            r0 = r6
            co.notix.j4 r0 = (co.notix.j4) r0
            int r1 = r0.f12514c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12514c = r1
            goto L18
        L13:
            co.notix.j4 r0 = new co.notix.j4
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f12512a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12514c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0485a.A(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            a.AbstractC0485a.A(r6)
            co.notix.m5 r6 = r4.f12676c
            r0.f12514c = r3
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            b8.e r6 = (b8.InterfaceC0725e) r6
            co.notix.i4 r5 = new co.notix.i4
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.l4.c(co.notix.o4, E7.d):java.lang.Object");
    }
}
