package L1;

import L2.C0242f;
import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class u extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f4552r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0242f f4553s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ A1.g f4554t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ S f4555u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(C0242f c0242f, A1.g gVar, S s9, E7.d dVar) {
        super(2, dVar);
        this.f4553s = c0242f;
        this.f4554t = gVar;
        this.f4555u = s9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new u(this.f4553s, this.f4554t, this.f4555u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r5 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if (r4.f4553s.a(r4) == r0) goto L15;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r4.f4552r
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L25
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            a.AbstractC0485a.A(r5)
            A7.j r5 = (A7.j) r5
            java.lang.Object r5 = r5.f550a
            goto L3e
        L14:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1c:
            a.AbstractC0485a.A(r5)
            A7.j r5 = (A7.j) r5
            r5.getClass()
            goto L33
        L25:
            a.AbstractC0485a.A(r5)
            r4.f4552r = r3
            L2.f r5 = r4.f4553s
            java.io.Serializable r5 = r5.a(r4)
            if (r5 != r0) goto L33
            goto L3d
        L33:
            r4.f4552r = r2
            A1.g r5 = r4.f4554t
            java.lang.Object r5 = r5.x(r4)
            if (r5 != r0) goto L3e
        L3d:
            return r0
        L3e:
            boolean r0 = r5 instanceof A7.i
            if (r0 != 0) goto L48
            H2.o r5 = (H2.o) r5
            L1.S r0 = r4.f4555u
            r0.f4510x = r5
        L48:
            A7.n r5 = A7.n.f558a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: L1.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
