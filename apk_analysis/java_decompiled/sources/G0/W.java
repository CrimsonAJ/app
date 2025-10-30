package G0;

/* loaded from: classes.dex */
public final class W extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f2725r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f2726s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ X f2727t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(X x5, E7.d dVar) {
        super(2, dVar);
        this.f2727t = x5;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        W w7 = new W(this.f2727t, dVar);
        w7.f2726s = obj;
        return w7;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((W) create((K) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0035, code lost:
    
        if (r6 == r0) goto L48;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r1 = r20
            F7.a r0 = F7.a.f2587a
            int r2 = r1.f2725r
            A7.n r3 = A7.n.f558a
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L26
            if (r2 == r4) goto L1c
            if (r2 != r5) goto L14
            a.AbstractC0485a.A(r21)
            return r3
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L1c:
            java.lang.Object r2 = r1.f2726s
            G0.K r2 = (G0.K) r2
            a.AbstractC0485a.A(r21)
            r6 = r21
            goto L39
        L26:
            a.AbstractC0485a.A(r21)
            java.lang.Object r2 = r1.f2726s
            G0.K r2 = (G0.K) r2
            r1.f2726s = r2
            r1.f2725r = r4
            java.lang.Object r6 = r2.b(r1)
            if (r6 != r0) goto L39
            goto La8
        L39:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L43
            goto La9
        L43:
            G0.X r6 = r1.f2727t
            A6.t r7 = r6.f2736h
            java.lang.Object r8 = r7.f541c
            long[] r8 = (long[]) r8
            java.lang.Object r9 = r7.f540b
            java.util.concurrent.locks.ReentrantLock r9 = (java.util.concurrent.locks.ReentrantLock) r9
            r9.lock()
            boolean r10 = r7.f539a     // Catch: java.lang.Throwable -> L80
            r11 = 0
            if (r10 != 0) goto L5c
            r9.unlock()
            r13 = r11
            goto L96
        L5c:
            r10 = 0
            r7.f539a = r10     // Catch: java.lang.Throwable -> L80
            int r12 = r8.length     // Catch: java.lang.Throwable -> L80
            G0.r[] r13 = new G0.r[r12]     // Catch: java.lang.Throwable -> L80
            r14 = r10
            r15 = r14
        L64:
            if (r14 >= r12) goto L8f
            r16 = r8[r14]     // Catch: java.lang.Throwable -> L80
            r18 = 0
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 <= 0) goto L6f
            goto L70
        L6f:
            r4 = r10
        L70:
            java.lang.Object r10 = r7.f542d     // Catch: java.lang.Throwable -> L80
            boolean[] r10 = (boolean[]) r10     // Catch: java.lang.Throwable -> L80
            boolean r5 = r10[r14]     // Catch: java.lang.Throwable -> L80
            if (r4 == r5) goto L85
            r10[r14] = r4     // Catch: java.lang.Throwable -> L80
            if (r4 == 0) goto L82
            G0.r r4 = G0.r.f2801b     // Catch: java.lang.Throwable -> L80
        L7e:
            r15 = 1
            goto L87
        L80:
            r0 = move-exception
            goto Laa
        L82:
            G0.r r4 = G0.r.f2802c     // Catch: java.lang.Throwable -> L80
            goto L7e
        L85:
            G0.r r4 = G0.r.f2800a     // Catch: java.lang.Throwable -> L80
        L87:
            r13[r14] = r4     // Catch: java.lang.Throwable -> L80
            int r14 = r14 + 1
            r4 = 1
            r5 = 2
            r10 = 0
            goto L64
        L8f:
            if (r15 == 0) goto L92
            goto L93
        L92:
            r13 = r11
        L93:
            r9.unlock()
        L96:
            if (r13 == 0) goto La9
            G0.V r4 = new G0.V
            r4.<init>(r13, r6, r2, r11)
            r1.f2726s = r11
            r5 = 2
            r1.f2725r = r5
            java.lang.Object r2 = r2.a(r4, r1)
            if (r2 != r0) goto La9
        La8:
            return r0
        La9:
            return r3
        Laa:
            r9.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: G0.W.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
