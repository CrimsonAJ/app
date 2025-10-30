package k2;

import A7.n;
import O7.p;
import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class l extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f19903r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f19904s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m f19905t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f19906u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(boolean z9, m mVar, long j, E7.d dVar) {
        super(2, dVar);
        this.f19904s = z9;
        this.f19905t = mVar;
        this.f19906u = j;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new l(this.f19904s, this.f19905t, this.f19906u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r7.f19910i.a(r4, r6) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (r7.j.a(r4, r6) == r0) goto L16;
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
            int r1 = r6.f19903r
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 == r3) goto Lc
            if (r1 != r2) goto L15
        Lc:
            a.AbstractC0485a.A(r7)
            A7.j r7 = (A7.j) r7
            r7.getClass()
            goto L3e
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            a.AbstractC0485a.A(r7)
            k2.m r7 = r6.f19905t
            boolean r1 = r6.f19904s
            long r4 = r6.f19906u
            if (r1 == 0) goto L33
            r6.f19903r = r3
            O2.f r7 = r7.f19910i
            java.lang.Object r7 = r7.a(r4, r6)
            if (r7 != r0) goto L3e
            goto L3d
        L33:
            r6.f19903r = r2
            O2.a0 r7 = r7.j
            java.lang.Object r7 = r7.a(r4, r6)
            if (r7 != r0) goto L3e
        L3d:
            return r0
        L3e:
            A7.n r7 = A7.n.f558a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
