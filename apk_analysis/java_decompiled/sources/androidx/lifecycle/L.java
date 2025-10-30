package androidx.lifecycle;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class L extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public g8.a f9812r;

    /* renamed from: s, reason: collision with root package name */
    public G7.j f9813s;

    /* renamed from: t, reason: collision with root package name */
    public int f9814t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g8.d f9815u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ G7.j f9816v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public L(g8.d dVar, O7.p pVar, E7.d dVar2) {
        super(2, dVar2);
        this.f9815u = dVar;
        this.f9816v = (G7.j) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [G7.j, O7.p] */
    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new L(this.f9815u, this.f9816v, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0039, code lost:
    
        if (r7.d(r6) == r0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [O7.p] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [g8.a] */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r6.f9814t
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L28
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            g8.a r0 = r6.f9812r
            a.AbstractC0485a.A(r7)     // Catch: java.lang.Throwable -> L13
            goto L4f
        L13:
            r7 = move-exception
            goto L59
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            G7.j r1 = r6.f9813s
            O7.p r1 = (O7.p) r1
            g8.a r3 = r6.f9812r
            a.AbstractC0485a.A(r7)
            r7 = r3
            goto L3c
        L28:
            a.AbstractC0485a.A(r7)
            g8.d r7 = r6.f9815u
            r6.f9812r = r7
            G7.j r1 = r6.f9816v
            r6.f9813s = r1
            r6.f9814t = r3
            java.lang.Object r3 = r7.d(r6)
            if (r3 != r0) goto L3c
            goto L4d
        L3c:
            androidx.lifecycle.K r3 = new androidx.lifecycle.K     // Catch: java.lang.Throwable -> L55
            r3.<init>(r1, r4)     // Catch: java.lang.Throwable -> L55
            r6.f9812r = r7     // Catch: java.lang.Throwable -> L55
            r6.f9813s = r4     // Catch: java.lang.Throwable -> L55
            r6.f9814t = r2     // Catch: java.lang.Throwable -> L55
            java.lang.Object r1 = Y7.B.f(r3, r6)     // Catch: java.lang.Throwable -> L55
            if (r1 != r0) goto L4e
        L4d:
            return r0
        L4e:
            r0 = r7
        L4f:
            r0.a(r4)
            A7.n r7 = A7.n.f558a
            return r7
        L55:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L59:
            r0.a(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.L.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
