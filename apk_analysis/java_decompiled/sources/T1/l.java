package T1;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class l extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public Object f7025r;

    /* renamed from: s, reason: collision with root package name */
    public int f7026s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p f7027t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p pVar, E7.d dVar) {
        super(2, dVar);
        this.f7027t = pVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new l(this.f7027t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (r4.f(r1, r7) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
    
        if (r8 == r0) goto L20;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r7.f7026s
            r2 = 2
            r3 = 1
            T1.p r4 = r7.f7027t
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            a.AbstractC0485a.A(r8)
            goto L5d
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            a.AbstractC0485a.A(r8)
            A7.j r8 = (A7.j) r8
            java.lang.Object r8 = r8.f550a
            goto L30
        L22:
            a.AbstractC0485a.A(r8)
            A1.g r8 = r4.f7030f
            r7.f7026s = r3
            java.lang.Object r8 = r8.x(r7)
            if (r8 != r0) goto L30
            goto L5c
        L30:
            boolean r1 = r8 instanceof A7.i
            if (r1 != 0) goto L4c
            r1 = r8
            H2.o r1 = (H2.o) r1
            b8.Q r3 = r4.f7031g
            M1.t r5 = new M1.t
            T1.m r6 = new T1.m
            java.util.List r1 = r1.f3041d
            r6.<init>(r1)
            r5.<init>(r6)
            r3.getClass()
            r1 = 0
            r3.j(r1, r5)
        L4c:
            java.lang.Throwable r1 = A7.j.a(r8)
            if (r1 == 0) goto L5d
            r7.f7025r = r8
            r7.f7026s = r2
            java.lang.Object r8 = r4.f(r1, r7)
            if (r8 != r0) goto L5d
        L5c:
            return r0
        L5d:
            A7.n r8 = A7.n.f558a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
