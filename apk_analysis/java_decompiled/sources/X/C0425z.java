package X;

import Y7.InterfaceC0484z;

/* renamed from: X.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0425z extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f8134r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ O f8135s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0425z(O o9, E7.d dVar) {
        super(2, dVar);
        this.f8135s = o9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0425z(this.f8135s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0425z) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        if (r7 == r0) goto L19;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r6.f8134r
            A7.n r2 = A7.n.f558a
            X.O r3 = r6.f8135s
            r4 = 1
            r5 = 2
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r5) goto L14
            a.AbstractC0485a.A(r7)
            return r2
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            a.AbstractC0485a.A(r7)
            goto L36
        L20:
            a.AbstractC0485a.A(r7)
            r6.f8134r = r4
            com.google.firebase.messaging.s r7 = r3.f8019i
            java.lang.Object r7 = r7.f16505c
            Y7.n r7 = (Y7.C0473n) r7
            java.lang.Object r7 = r7.o(r6)
            if (r7 != r0) goto L32
            goto L33
        L32:
            r7 = r2
        L33:
            if (r7 != r0) goto L36
            goto L4f
        L36:
            X.Y r7 = r3.h()
            X.t r7 = r7.f8048c
            r1 = -1
            b8.e r7 = b8.AbstractC0714M.f(r7, r1)
            N1.k r1 = new N1.k
            r4 = 3
            r1.<init>(r4, r3)
            r6.f8134r = r5
            java.lang.Object r7 = r7.collect(r1, r6)
            if (r7 != r0) goto L50
        L4f:
            return r0
        L50:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0425z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
