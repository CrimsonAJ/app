package co.notix;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class o3 extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public g8.a f12856a;

    /* renamed from: b, reason: collision with root package name */
    public c4 f12857b;

    /* renamed from: c, reason: collision with root package name */
    public int f12858c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c4 f12859d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(c4 c4Var, E7.d dVar) {
        super(2, dVar);
        this.f12859d = c4Var;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new o3(this.f12859d, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((o3) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r9.f12858c
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L34
            if (r1 == r5) goto L2c
            if (r1 == r4) goto L22
            if (r1 != r3) goto L1a
            g8.a r0 = r9.f12856a
            a.AbstractC0485a.A(r10)     // Catch: java.lang.Throwable -> L17
            goto L8b
        L17:
            r10 = move-exception
            goto L94
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            co.notix.c4 r1 = r9.f12857b
            g8.a r4 = r9.f12856a
            a.AbstractC0485a.A(r10)     // Catch: java.lang.Throwable -> L2a
            goto L5a
        L2a:
            r10 = move-exception
            goto L93
        L2c:
            co.notix.c4 r1 = r9.f12857b
            g8.a r6 = r9.f12856a
            a.AbstractC0485a.A(r10)
            goto L4a
        L34:
            a.AbstractC0485a.A(r10)
            co.notix.c4 r10 = r9.f12859d
            g8.a r1 = r10.f11981h
            r9.f12856a = r1
            r9.f12857b = r10
            r9.f12858c = r5
            java.lang.Object r6 = r1.d(r9)
            if (r6 != r0) goto L48
            goto L89
        L48:
            r6 = r1
            r1 = r10
        L4a:
            r1.j = r5     // Catch: java.lang.Throwable -> L91
            r9.f12856a = r6     // Catch: java.lang.Throwable -> L91
            r9.f12857b = r1     // Catch: java.lang.Throwable -> L91
            r9.f12858c = r4     // Catch: java.lang.Throwable -> L91
            java.lang.Object r10 = co.notix.c4.a(r1, r9)     // Catch: java.lang.Throwable -> L91
            if (r10 != r0) goto L59
            goto L89
        L59:
            r4 = r6
        L5a:
            co.notix.t4 r10 = (co.notix.t4) r10     // Catch: java.lang.Throwable -> L2a
            co.notix.d4 r5 = r1.f11975b     // Catch: java.lang.Throwable -> L2a
            java.lang.String r6 = r10.f13208a     // Catch: java.lang.Throwable -> L2a
            co.notix.l4 r5 = (co.notix.l4) r5     // Catch: java.lang.Throwable -> L2a
            r5.getClass()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r7 = "id"
            kotlin.jvm.internal.h.e(r6, r7)     // Catch: java.lang.Throwable -> L2a
            Y7.z r7 = r5.f12674a     // Catch: java.lang.Throwable -> L2a
            co.notix.k4 r8 = new co.notix.k4     // Catch: java.lang.Throwable -> L2a
            r8.<init>(r5, r6, r2)     // Catch: java.lang.Throwable -> L2a
            Y7.B.r(r7, r2, r8, r3)     // Catch: java.lang.Throwable -> L2a
            b8.E r5 = r1.f11983k     // Catch: java.lang.Throwable -> L2a
            co.notix.qj r6 = co.notix.qj.f13056a     // Catch: java.lang.Throwable -> L2a
            r5.d(r6)     // Catch: java.lang.Throwable -> L2a
            co.notix.l r10 = r10.f13210c     // Catch: java.lang.Throwable -> L2a
            r9.f12856a = r4     // Catch: java.lang.Throwable -> L2a
            r9.f12857b = r2     // Catch: java.lang.Throwable -> L2a
            r9.f12858c = r3     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r10 = co.notix.c4.a(r1, r10, r9)     // Catch: java.lang.Throwable -> L2a
            if (r10 != r0) goto L8a
        L89:
            return r0
        L8a:
            r0 = r4
        L8b:
            co.notix.g r10 = (co.notix.g) r10     // Catch: java.lang.Throwable -> L17
            r0.a(r2)
            return r10
        L91:
            r10 = move-exception
            r4 = r6
        L93:
            r0 = r4
        L94:
            r0.a(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.o3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
