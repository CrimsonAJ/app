package Z1;

import A7.n;
import G7.j;
import O7.p;
import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class g extends j implements p {

    /* renamed from: r, reason: collision with root package name */
    public Object f8940r;

    /* renamed from: s, reason: collision with root package name */
    public int f8941s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f8942t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f8943u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, String str, E7.d dVar) {
        super(2, dVar);
        this.f8942t = hVar;
        this.f8943u = str;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new g(this.f8942t, this.f8943u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r2.f(r1, r6) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002f, code lost:
    
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
            int r1 = r6.f8941s
            Z1.h r2 = r6.f8942t
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            a.AbstractC0485a.A(r7)
            goto L5a
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            a.AbstractC0485a.A(r7)
            A7.j r7 = (A7.j) r7
            java.lang.Object r7 = r7.f550a
            goto L32
        L22:
            a.AbstractC0485a.A(r7)
            r6.f8941s = r4
            java.lang.String r7 = r6.f8943u
            P2.o r1 = r2.f8945g
            java.lang.Object r7 = r1.a(r7, r6)
            if (r7 != r0) goto L32
            goto L59
        L32:
            boolean r1 = r7 instanceof A7.i
            if (r1 != 0) goto L49
            r1 = r7
            H2.y r1 = (H2.y) r1
            M1.t r1 = new M1.t
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r1.<init>(r4)
            b8.Q r4 = r2.f8947i
            r4.getClass()
            r5 = 0
            r4.j(r5, r1)
        L49:
            java.lang.Throwable r1 = A7.j.a(r7)
            if (r1 == 0) goto L5a
            r6.f8940r = r7
            r6.f8941s = r3
            java.lang.Object r7 = r2.f(r1, r6)
            if (r7 != r0) goto L5a
        L59:
            return r0
        L5a:
            A7.n r7 = A7.n.f558a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Z1.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
