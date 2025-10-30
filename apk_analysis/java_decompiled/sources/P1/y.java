package P1;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class y extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public Object f5755r;

    /* renamed from: s, reason: collision with root package name */
    public int f5756s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ G f5757t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ H2.c f5758u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(G g9, H2.c cVar, E7.d dVar) {
        super(2, dVar);
        this.f5757t = g9;
        this.f5758u = cVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new y(this.f5757t, this.f5758u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cf, code lost:
    
        if (r2.f(r1, r12) == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d1, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0032, code lost:
    
        if (r13 == r0) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r12.f5756s
            P1.G r2 = r12.f5757t
            r3 = 1
            H2.c r4 = r12.f5758u
            r5 = 2
            if (r1 == 0) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r5) goto L15
            a.AbstractC0485a.A(r13)
            goto Ld2
        L15:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1d:
            a.AbstractC0485a.A(r13)
            A7.j r13 = (A7.j) r13
            java.lang.Object r13 = r13.f550a
            goto L36
        L25:
            a.AbstractC0485a.A(r13)
            java.lang.String r13 = r4.f2986a
            r12.f5756s = r3
            O2.Y r1 = r2.f5696n
            java.lang.Object r13 = r1.a(r13, r12)
            if (r13 != r0) goto L36
            goto Ld1
        L36:
            boolean r1 = r13 instanceof A7.i
            if (r1 != 0) goto Lc1
            b8.Q r1 = r2.f5698p
            java.lang.Object r6 = r1.h()
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.ArrayList r6 = B7.k.I0(r6)
            boolean r7 = r4.f2998n
            if (r7 != 0) goto L51
            long r7 = r2.f5703u
            r9 = -1
            long r7 = r7 + r9
            r2.f5703u = r7
        L51:
            java.lang.String r7 = r4.f2997m
            r8 = 0
            if (r7 == 0) goto Laf
            java.util.LinkedHashMap r9 = r2.f5701s
            java.lang.Object r10 = r9.get(r13)
            java.util.List r10 = (java.util.List) r10
            if (r10 == 0) goto L68
            java.util.ArrayList r10 = B7.k.I0(r10)
            r10.remove(r4)
            goto L69
        L68:
            r10 = r8
        L69:
            if (r10 != 0) goto L6d
            B7.t r10 = B7.t.f1135a
        L6d:
            r9.put(r7, r10)
            java.lang.Object r9 = r1.h()
            java.util.List r9 = (java.util.List) r9
            java.util.Iterator r9 = r9.iterator()
            r10 = 0
        L7b:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L93
            java.lang.Object r11 = r9.next()
            H2.c r11 = (H2.c) r11
            java.lang.String r11 = r11.f2986a
            boolean r11 = r11.equals(r7)
            if (r11 == 0) goto L90
            goto L94
        L90:
            int r10 = r10 + 1
            goto L7b
        L93:
            r10 = -1
        L94:
            if (r10 < 0) goto Laf
            java.lang.Object r7 = r1.h()
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = r7.get(r10)
            H2.c r7 = (H2.c) r7
            int r9 = r7.f2991f
            int r9 = r9 - r3
            r3 = 131039(0x1ffdf, float:1.83625E-40)
            H2.c r3 = H2.c.a(r7, r9, r3)
            r6.set(r10, r3)
        Laf:
            r6.remove(r4)
            P1.x r3 = new P1.x
            r7 = 0
            r3.<init>(r4, r7)
            B7.q.j0(r6, r3)
            r1.getClass()
            r1.j(r8, r6)
        Lc1:
            java.lang.Throwable r1 = A7.j.a(r13)
            if (r1 == 0) goto Ld2
            r12.f5755r = r13
            r12.f5756s = r5
            java.lang.Object r13 = r2.f(r1, r12)
            if (r13 != r0) goto Ld2
        Ld1:
            return r0
        Ld2:
            A7.n r13 = A7.n.f558a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: P1.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
