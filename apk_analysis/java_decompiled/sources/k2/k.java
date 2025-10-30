package k2;

import A7.n;
import O7.p;
import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class k extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public Object f19900r;

    /* renamed from: s, reason: collision with root package name */
    public int f19901s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m f19902t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, E7.d dVar) {
        super(2, dVar);
        this.f19902t = mVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new k(this.f19902t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
    
        if (r7.f(r1, r18) == r6) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
    
        if (r0 == r6) goto L29;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r5 = r18
            F7.a r6 = F7.a.f2587a
            int r0 = r5.f19901s
            k2.m r7 = r5.f19902t
            r8 = 2
            r1 = 1
            if (r0 == 0) goto L27
            if (r0 == r1) goto L1d
            if (r0 != r8) goto L15
            a.AbstractC0485a.A(r19)
            goto Lbe
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1d:
            a.AbstractC0485a.A(r19)
            r0 = r19
            A7.j r0 = (A7.j) r0
            java.lang.Object r0 = r0.f550a
            goto L71
        L27:
            a.AbstractC0485a.A(r19)
            java.util.Calendar r9 = java.util.Calendar.getInstance()
            int r11 = r9.get(r8)
            int r10 = r9.get(r1)
            r12 = 1
            r13 = 0
            r14 = 0
            r15 = 0
            r9.set(r10, r11, r12, r13, r14, r15)
            java.util.Date r0 = r9.getTime()
            long r2 = r0.getTime()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r12 = (long) r0
            long r2 = r2 / r12
            r0 = 5
            int r0 = r9.getActualMaximum(r0)
            r15 = 59
            r16 = r12
            r13 = 23
            r14 = 59
            r12 = r0
            r9.set(r10, r11, r12, r13, r14, r15)
            java.util.Date r0 = r9.getTime()
            long r9 = r0.getTime()
            long r9 = r9 / r16
            r5.f19901s = r1
            O2.L r0 = r7.f19907f
            r1 = r2
            r3 = r9
            java.io.Serializable r0 = r0.a(r1, r3, r5)
            if (r0 != r6) goto L71
            goto Lbd
        L71:
            boolean r1 = r0 instanceof A7.i
            if (r1 != 0) goto Lad
            r1 = r0
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r2 = r1.iterator()
        L7c:
            boolean r3 = r2.hasNext()
            r4 = 0
            if (r3 == 0) goto La5
            java.lang.Object r3 = r2.next()
            H2.v r3 = (H2.v) r3
            com.anilab.domain.model.Movie r9 = r3.j
            if (r9 == 0) goto L7c
            O2.E r10 = r7.f19909h
            java.util.List r10 = r10.a()
            com.anilab.domain.model.Movie r3 = r3.j
            if (r3 == 0) goto L9e
            java.lang.Long r4 = new java.lang.Long
            long r11 = r3.f14414a
            r4.<init>(r11)
        L9e:
            boolean r3 = B7.k.l0(r10, r4)
            r9.f14428p = r3
            goto L7c
        La5:
            b8.Q r2 = r7.f19911k
            r2.getClass()
            r2.j(r4, r1)
        Lad:
            java.lang.Throwable r1 = A7.j.a(r0)
            if (r1 == 0) goto Lbe
            r5.f19900r = r0
            r5.f19901s = r8
            java.lang.Object r0 = r7.f(r1, r5)
            if (r0 != r6) goto Lbe
        Lbd:
            return r6
        Lbe:
            A7.n r0 = A7.n.f558a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
