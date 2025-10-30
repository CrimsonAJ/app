package W1;

import A7.n;
import G7.j;
import O7.p;
import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class b extends j implements p {

    /* renamed from: r, reason: collision with root package name */
    public Object f7861r;

    /* renamed from: s, reason: collision with root package name */
    public int f7862s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f7863t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, E7.d dVar) {
        super(2, dVar);
        this.f7863t = cVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new b(this.f7863t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r4.f(r1, r5) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
    
        if (r6 == r0) goto L20;
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
            int r1 = r5.f7862s
            r2 = 2
            r3 = 1
            W1.c r4 = r5.f7863t
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            a.AbstractC0485a.A(r6)
            goto L57
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            a.AbstractC0485a.A(r6)
            A7.j r6 = (A7.j) r6
            java.lang.Object r6 = r6.f550a
            goto L30
        L22:
            a.AbstractC0485a.A(r6)
            K2.b r6 = r4.f7864f
            r5.f7862s = r3
            java.lang.Object r6 = r6.a(r5)
            if (r6 != r0) goto L30
            goto L56
        L30:
            boolean r1 = r6 instanceof A7.i
            if (r1 != 0) goto L46
            r1 = r6
            H2.f r1 = (H2.f) r1
            java.lang.String r3 = r1.f3011a
            r4.getClass()
            r4.f7865g = r3
            java.lang.String r3 = r1.f3012b
            r4.f7866h = r3
            java.lang.String r1 = r1.f3013c
            r4.f7867i = r1
        L46:
            java.lang.Throwable r1 = A7.j.a(r6)
            if (r1 == 0) goto L57
            r5.f7861r = r6
            r5.f7862s = r2
            java.lang.Object r6 = r4.f(r1, r5)
            if (r6 != r0) goto L57
        L56:
            return r0
        L57:
            A7.n r6 = A7.n.f558a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
