package a2;

import A7.n;
import O7.p;
import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class j extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public Object f9097r;

    /* renamed from: s, reason: collision with root package name */
    public int f9098s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f9099t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, E7.d dVar) {
        super(2, dVar);
        this.f9099t = kVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new j(this.f9099t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r2.f(r1, r6) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
    
        if (r7 == r0) goto L20;
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
            int r1 = r6.f9098s
            a2.k r2 = r6.f9099t
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            a.AbstractC0485a.A(r7)
            goto L53
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            a.AbstractC0485a.A(r7)
            A7.j r7 = (A7.j) r7
            java.lang.Object r7 = r7.f550a
            goto L30
        L22:
            a.AbstractC0485a.A(r7)
            r6.f9098s = r4
            P2.q r7 = r2.f9100f
            java.lang.Object r7 = r7.a(r6)
            if (r7 != r0) goto L30
            goto L52
        L30:
            boolean r1 = r7 instanceof A7.i
            if (r1 != 0) goto L42
            r1 = r7
            A7.n r1 = (A7.n) r1
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            b8.Q r4 = r2.f9101g
            r4.getClass()
            r5 = 0
            r4.j(r5, r1)
        L42:
            java.lang.Throwable r1 = A7.j.a(r7)
            if (r1 == 0) goto L53
            r6.f9097r = r7
            r6.f9098s = r3
            java.lang.Object r7 = r2.f(r1, r6)
            if (r7 != r0) goto L53
        L52:
            return r0
        L53:
            A7.n r7 = A7.n.f558a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
