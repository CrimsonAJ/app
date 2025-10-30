package l2;

import O7.p;
import Y7.InterfaceC0484z;

/* renamed from: l2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1546k extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public Object f20204r;

    /* renamed from: s, reason: collision with root package name */
    public int f20205s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1549n f20206t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1546k(C1549n c1549n, E7.d dVar) {
        super(2, dVar);
        this.f20206t = c1549n;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1546k(this.f20206t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1546k) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r4.f(r1, r6) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
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
            int r1 = r6.f20205s
            r2 = 2
            r3 = 1
            l2.n r4 = r6.f20206t
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            a.AbstractC0485a.A(r7)
            goto L62
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
            O2.N r7 = r4.f20216f
            r6.f20205s = r3
            java.io.Serializable r7 = r7.a(r6)
            if (r7 != r0) goto L30
            goto L61
        L30:
            boolean r1 = r7 instanceof A7.i
            if (r1 != 0) goto L51
            r1 = r7
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r3 = r4.f20218h
            r3.clear()
            java.util.ArrayList r3 = r4.f20218h
            r3.addAll(r1)
            A7.h r3 = new A7.h
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r3.<init>(r5, r1)
            b8.Q r1 = r4.f20219i
            r1.getClass()
            r5 = 0
            r1.j(r5, r3)
        L51:
            java.lang.Throwable r1 = A7.j.a(r7)
            if (r1 == 0) goto L62
            r6.f20204r = r7
            r6.f20205s = r2
            java.lang.Object r7 = r4.f(r1, r6)
            if (r7 != r0) goto L62
        L61:
            return r0
        L62:
            A7.n r7 = A7.n.f558a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.C1546k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
