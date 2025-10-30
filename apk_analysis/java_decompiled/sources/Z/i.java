package Z;

import X.InterfaceC0401a;
import X.Y;
import x8.u;
import x8.y;

/* loaded from: classes.dex */
public final class i implements InterfaceC0401a {

    /* renamed from: a, reason: collision with root package name */
    public final u f8894a;

    /* renamed from: b, reason: collision with root package name */
    public final y f8895b;

    /* renamed from: c, reason: collision with root package name */
    public final Y f8896c;

    /* renamed from: d, reason: collision with root package name */
    public final e f8897d;

    /* renamed from: e, reason: collision with root package name */
    public final a f8898e;

    /* renamed from: f, reason: collision with root package name */
    public final g8.d f8899f;

    public i(u fileSystem, y path, Y coordinator, e eVar) {
        kotlin.jvm.internal.h.e(fileSystem, "fileSystem");
        kotlin.jvm.internal.h.e(path, "path");
        kotlin.jvm.internal.h.e(coordinator, "coordinator");
        this.f8894a = fileSystem;
        this.f8895b = path;
        this.f8896c = coordinator;
        this.f8897d = eVar;
        this.f8898e = new a();
        this.f8899f = g8.e.a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(6:36|37|38|40|41|(1:43)(1:44))(2:53|54))|13|14|15|(2:(1:18)|19)(1:21)))|7|(0)(0)|13|14|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[Catch: all -> 0x007d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007d, blocks: (B:21:0x007c, B:31:0x008a, B:28:0x008d, B:27:0x0085), top: B:7:0x0020, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13, types: [Z.i] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [Z.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [Z.i] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.q] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(X.C0417q r8, G7.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof Z.g
            if (r0 == 0) goto L13
            r0 = r9
            Z.g r0 = (Z.g) r0
            int r1 = r0.f8886w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8886w = r1
            goto L18
        L13:
            Z.g r0 = new Z.g
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f8884u
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f8886w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            boolean r8 = r0.f8883t
            Z.c r1 = r0.f8882s
            Z.i r0 = r0.f8881r
            a.AbstractC0485a.A(r9)     // Catch: java.lang.Throwable -> L2e
            goto L6c
        L2e:
            r9 = move-exception
            goto L85
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            a.AbstractC0485a.A(r9)
            Z.a r9 = r7.f8898e
            java.util.concurrent.atomic.AtomicBoolean r9 = r9.f8863a
            boolean r9 = r9.get()
            if (r9 != 0) goto L9d
            g8.d r9 = r7.f8899f
            boolean r9 = r9.g()
            Z.c r2 = new Z.c     // Catch: java.lang.Throwable -> L93
            x8.u r5 = r7.f8894a     // Catch: java.lang.Throwable -> L93
            x8.y r6 = r7.f8895b     // Catch: java.lang.Throwable -> L93
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L93
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L7f
            r0.f8881r = r7     // Catch: java.lang.Throwable -> L7f
            r0.f8882s = r2     // Catch: java.lang.Throwable -> L7f
            r0.f8883t = r9     // Catch: java.lang.Throwable -> L7f
            r0.f8886w = r4     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r8 = r8.invoke(r2, r5, r0)     // Catch: java.lang.Throwable -> L7f
            if (r8 != r1) goto L67
            return r1
        L67:
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            r1 = r2
        L6c:
            r1.close()     // Catch: java.lang.Throwable -> L71
            r1 = r3
            goto L72
        L71:
            r1 = move-exception
        L72:
            if (r1 != 0) goto L7c
            if (r8 == 0) goto L7b
            g8.d r8 = r0.f8899f
            r8.a(r3)
        L7b:
            return r9
        L7c:
            throw r1     // Catch: java.lang.Throwable -> L7d
        L7d:
            r9 = move-exception
            goto L95
        L7f:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            r1 = r2
        L85:
            r1.close()     // Catch: java.lang.Throwable -> L89
            goto L8d
        L89:
            r1 = move-exception
            O4.h.a(r9, r1)     // Catch: java.lang.Throwable -> L7d
        L8d:
            throw r9     // Catch: java.lang.Throwable -> L7d
        L8e:
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            goto L95
        L93:
            r8 = move-exception
            goto L8e
        L95:
            if (r8 == 0) goto L9c
            g8.d r8 = r0.f8899f
            r8.a(r3)
        L9c:
            throw r9
        L9d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "StorageConnection has already been disposed."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.i.a(X.q, G7.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b9 A[Catch: all -> 0x00c9, IOException -> 0x00cc, TRY_ENTER, TryCatch #9 {IOException -> 0x00cc, all -> 0x00c9, blocks: (B:18:0x00b9, B:20:0x00c1, B:24:0x00d6, B:34:0x00e1, B:31:0x00e4, B:30:0x00dc), top: B:7:0x0023, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d6 A[Catch: all -> 0x00c9, IOException -> 0x00cc, TRY_ENTER, TRY_LEAVE, TryCatch #9 {IOException -> 0x00cc, all -> 0x00c9, blocks: (B:18:0x00b9, B:20:0x00c1, B:24:0x00d6, B:34:0x00e1, B:31:0x00e4, B:30:0x00dc), top: B:7:0x0023, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [x8.y] */
    /* JADX WARN: Type inference failed for: r0v4, types: [x8.y] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7, types: [x8.y] */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v8, types: [O7.p] */
    /* JADX WARN: Type inference failed for: r11v14, types: [g8.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [Z.i] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [G7.c, Z.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [x8.u, x8.n] */
    /* JADX WARN: Type inference failed for: r1v6, types: [x8.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [F7.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8, types: [g8.a] */
    /* JADX WARN: Type inference failed for: r8v0, types: [x8.u] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(X.N r10, G7.c r11) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.i.b(X.N, G7.c):java.lang.Object");
    }

    @Override // X.InterfaceC0401a
    public final void close() {
        this.f8898e.f8863a.set(true);
        this.f8897d.invoke();
    }
}
