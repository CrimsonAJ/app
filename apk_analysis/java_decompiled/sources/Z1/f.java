package Z1;

import A7.n;
import G7.j;
import O7.p;
import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class f extends j implements p {

    /* renamed from: r, reason: collision with root package name */
    public Object f8935r;

    /* renamed from: s, reason: collision with root package name */
    public int f8936s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f8937t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f8938u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f8939v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, String str, String str2, E7.d dVar) {
        super(2, dVar);
        this.f8937t = hVar;
        this.f8938u = str;
        this.f8939v = str2;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new f(this.f8937t, this.f8938u, this.f8939v, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r2.f(r1, r6) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
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
            int r1 = r6.f8936s
            Z1.h r2 = r6.f8937t
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            a.AbstractC0485a.A(r7)
            goto L6c
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            a.AbstractC0485a.A(r7)
            A7.j r7 = (A7.j) r7
            java.lang.Object r7 = r7.f550a
            goto L44
        L22:
            a.AbstractC0485a.A(r7)
            java.lang.String r7 = r6.f8938u
            java.lang.CharSequence r7 = W7.d.j0(r7)
            java.lang.String r7 = r7.toString()
            java.lang.String r1 = r6.f8939v
            java.lang.CharSequence r1 = W7.d.j0(r1)
            java.lang.String r1 = r1.toString()
            r6.f8936s = r4
            P2.m r4 = r2.f8944f
            java.lang.Object r7 = r4.a(r7, r1, r6)
            if (r7 != r0) goto L44
            goto L6b
        L44:
            boolean r1 = r7 instanceof A7.i
            if (r1 != 0) goto L5b
            r1 = r7
            H2.y r1 = (H2.y) r1
            M1.t r1 = new M1.t
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r1.<init>(r4)
            b8.Q r4 = r2.f8947i
            r4.getClass()
            r5 = 0
            r4.j(r5, r1)
        L5b:
            java.lang.Throwable r1 = A7.j.a(r7)
            if (r1 == 0) goto L6c
            r6.f8935r = r7
            r6.f8936s = r3
            java.lang.Object r7 = r2.f(r1, r6)
            if (r7 != r0) goto L6c
        L6b:
            return r0
        L6c:
            A7.n r7 = A7.n.f558a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Z1.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
