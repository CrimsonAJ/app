package U1;

import O7.p;
import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class k extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f7268r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f7269s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, E7.d dVar) {
        super(2, dVar);
        this.f7269s = lVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new k(this.f7269s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r6 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0031, code lost:
    
        if (r6 == r0) goto L18;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r5.f7268r
            r2 = 2
            r3 = 1
            U1.l r4 = r5.f7269s
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            a.AbstractC0485a.A(r6)
            A7.j r6 = (A7.j) r6
            java.lang.Object r6 = r6.f550a
            goto L4a
        L16:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1e:
            a.AbstractC0485a.A(r6)
            A7.j r6 = (A7.j) r6
            java.lang.Object r6 = r6.f550a
            goto L34
        L26:
            a.AbstractC0485a.A(r6)
            M2.d r6 = r4.f7270f
            r5.f7268r = r3
            java.io.Serializable r6 = r6.a(r5)
            if (r6 != r0) goto L34
            goto L49
        L34:
            boolean r1 = r6 instanceof A7.i
            if (r1 != 0) goto L3f
            java.util.List r6 = (java.util.List) r6
            b8.Q r1 = r4.f7272h
            r1.i(r6)
        L3f:
            L2.n r6 = r4.f7271g
            r5.f7268r = r2
            java.lang.Object r6 = r6.a(r5)
            if (r6 != r0) goto L4a
        L49:
            return r0
        L4a:
            boolean r0 = r6 instanceof A7.i
            if (r0 != 0) goto L65
            H2.q r6 = (H2.q) r6
            b8.Q r0 = r4.f7274k
            java.util.List r1 = r6.f3047c
            r0.i(r1)
            java.util.List r0 = r6.f3046b
            b8.Q r1 = r4.f7273i
            r1.i(r0)
            java.util.List r6 = r6.f3045a
            b8.Q r0 = r4.j
            r0.i(r6)
        L65:
            A7.n r6 = A7.n.f558a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: U1.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
