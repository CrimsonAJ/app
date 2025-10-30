package co.notix;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class q3 extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public g8.a f13014a;

    /* renamed from: b, reason: collision with root package name */
    public c4 f13015b;

    /* renamed from: c, reason: collision with root package name */
    public int f13016c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c4 f13017d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(c4 c4Var, E7.d dVar) {
        super(2, dVar);
        this.f13017d = c4Var;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new q3(this.f13017d, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((q3) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0051, code lost:
    
        if (r7.d(r10) == r0) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087 A[Catch: all -> 0x002d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x002d, blocks: (B:23:0x0029, B:24:0x0079, B:28:0x0087, B:34:0x0034, B:35:0x006a), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v5, types: [g8.a] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r10.f13016c
            r2 = 0
            r3 = 3
            r4 = 4
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L40
            if (r1 == r6) goto L38
            if (r1 == r5) goto L30
            if (r1 == r3) goto L25
            if (r1 != r4) goto L1d
            g8.a r0 = r10.f13014a
            a.AbstractC0485a.A(r11)     // Catch: java.lang.Throwable -> L1a
            goto Lb6
        L1a:
            r11 = move-exception
            goto Lbc
        L1d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L25:
            co.notix.c4 r1 = r10.f13015b
            g8.a r5 = r10.f13014a
            a.AbstractC0485a.A(r11)     // Catch: java.lang.Throwable -> L2d
            goto L79
        L2d:
            r11 = move-exception
            goto Lbe
        L30:
            co.notix.c4 r1 = r10.f13015b
            g8.a r5 = r10.f13014a
            a.AbstractC0485a.A(r11)     // Catch: java.lang.Throwable -> L2d
            goto L6a
        L38:
            co.notix.c4 r1 = r10.f13015b
            g8.a r7 = r10.f13014a
            a.AbstractC0485a.A(r11)
            goto L54
        L40:
            a.AbstractC0485a.A(r11)
            co.notix.c4 r1 = r10.f13017d
            g8.a r7 = r1.f11981h
            r10.f13014a = r7
            r10.f13015b = r1
            r10.f13016c = r6
            java.lang.Object r11 = r7.d(r10)
            if (r11 != r0) goto L54
            goto Lb4
        L54:
            r1.j = r6     // Catch: java.lang.Throwable -> Lc0
            r10.f13014a = r7     // Catch: java.lang.Throwable -> Lc0
            r10.f13015b = r1     // Catch: java.lang.Throwable -> Lc0
            r10.f13016c = r5     // Catch: java.lang.Throwable -> Lc0
            co.notix.d4 r11 = r1.f11975b     // Catch: java.lang.Throwable -> Lc0
            co.notix.o4 r5 = r1.f11974a     // Catch: java.lang.Throwable -> Lc0
            co.notix.l4 r11 = (co.notix.l4) r11     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r11 = r11.c(r5, r10)     // Catch: java.lang.Throwable -> Lc0
            if (r11 != r0) goto L69
            goto Lb4
        L69:
            r5 = r7
        L6a:
            b8.e r11 = (b8.InterfaceC0725e) r11     // Catch: java.lang.Throwable -> L2d
            r10.f13014a = r5     // Catch: java.lang.Throwable -> L2d
            r10.f13015b = r1     // Catch: java.lang.Throwable -> L2d
            r10.f13016c = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r11 = b8.AbstractC0714M.m(r11, r10)     // Catch: java.lang.Throwable -> L2d
            if (r11 != r0) goto L79
            goto Lb4
        L79:
            java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r11 = B7.k.q0(r11)     // Catch: java.lang.Throwable -> L2d
            co.notix.t4 r11 = (co.notix.t4) r11     // Catch: java.lang.Throwable -> L2d
            if (r11 != 0) goto L87
            r5.a(r2)
            return r2
        L87:
            co.notix.d4 r6 = r1.f11975b     // Catch: java.lang.Throwable -> L2d
            java.lang.String r7 = r11.f13208a     // Catch: java.lang.Throwable -> L2d
            co.notix.l4 r6 = (co.notix.l4) r6     // Catch: java.lang.Throwable -> L2d
            r6.getClass()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r8 = "id"
            kotlin.jvm.internal.h.e(r7, r8)     // Catch: java.lang.Throwable -> L2d
            Y7.z r8 = r6.f12674a     // Catch: java.lang.Throwable -> L2d
            co.notix.k4 r9 = new co.notix.k4     // Catch: java.lang.Throwable -> L2d
            r9.<init>(r6, r7, r2)     // Catch: java.lang.Throwable -> L2d
            Y7.B.r(r8, r2, r9, r3)     // Catch: java.lang.Throwable -> L2d
            b8.E r3 = r1.f11983k     // Catch: java.lang.Throwable -> L2d
            co.notix.qj r6 = co.notix.qj.f13056a     // Catch: java.lang.Throwable -> L2d
            r3.d(r6)     // Catch: java.lang.Throwable -> L2d
            co.notix.l r11 = r11.f13210c     // Catch: java.lang.Throwable -> L2d
            r10.f13014a = r5     // Catch: java.lang.Throwable -> L2d
            r10.f13015b = r2     // Catch: java.lang.Throwable -> L2d
            r10.f13016c = r4     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r11 = co.notix.c4.a(r1, r11, r10)     // Catch: java.lang.Throwable -> L2d
            if (r11 != r0) goto Lb5
        Lb4:
            return r0
        Lb5:
            r0 = r5
        Lb6:
            co.notix.g r11 = (co.notix.g) r11     // Catch: java.lang.Throwable -> L1a
            r0.a(r2)
            return r11
        Lbc:
            r7 = r0
            goto Lc1
        Lbe:
            r7 = r5
            goto Lc1
        Lc0:
            r11 = move-exception
        Lc1:
            r7.a(r2)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.q3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
