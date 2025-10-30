package i2;

import O7.p;
import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class l extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public Object f18472r;

    /* renamed from: s, reason: collision with root package name */
    public int f18473s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f18474t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f18475u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, long j, E7.d dVar) {
        super(2, dVar);
        this.f18474t = nVar;
        this.f18475u = j;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new l(this.f18474t, this.f18475u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
    
        if (r2.f(r1, r12) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a4, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0030, code lost:
    
        if (r13 == r0) goto L35;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r12.f18473s
            i2.n r2 = r12.f18474t
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            a.AbstractC0485a.A(r13)
            goto La5
        L13:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1b:
            a.AbstractC0485a.A(r13)
            A7.j r13 = (A7.j) r13
            java.lang.Object r13 = r13.f550a
            goto L34
        L23:
            a.AbstractC0485a.A(r13)
            r12.f18473s = r4
            long r5 = r12.f18475u
            O2.P r13 = r2.f18481f
            java.io.Serializable r13 = r13.a(r5, r12)
            if (r13 != r0) goto L34
            goto La4
        L34:
            boolean r1 = r13 instanceof A7.i
            if (r1 != 0) goto L94
            r1 = r13
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            T7.c r6 = new T7.c
            r7 = 5
            r6.<init>(r4, r7, r4)
            java.util.Iterator r4 = r6.iterator()
        L4a:
            r6 = r4
            T7.b r6 = (T7.b) r6
            boolean r6 = r6.f7242c
            r8 = 0
            if (r6 == 0) goto L8c
            r6 = r4
            B7.x r6 = (B7.x) r6
            int r6 = r6.a()
            java.util.Iterator r9 = r1.iterator()
        L5d:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L6f
            java.lang.Object r10 = r9.next()
            r11 = r10
            H2.z r11 = (H2.z) r11
            int r11 = r11.f3094a
            if (r11 != r6) goto L5d
            r8 = r10
        L6f:
            H2.z r8 = (H2.z) r8
            if (r8 != 0) goto L7d
            H2.z r8 = new H2.z
            r9 = 0
            r8.<init>(r6, r9)
            r5.add(r8)
            goto L4a
        L7d:
            int r6 = r8.f3094a
            if (r6 > r7) goto L4a
            int r6 = r2.f18485k
            int r9 = r8.f3095b
            int r6 = r6 + r9
            r2.f18485k = r6
            r5.add(r8)
            goto L4a
        L8c:
            b8.Q r1 = r2.f18484i
            r1.getClass()
            r1.j(r8, r5)
        L94:
            java.lang.Throwable r1 = A7.j.a(r13)
            if (r1 == 0) goto La5
            r12.f18472r = r13
            r12.f18473s = r3
            java.lang.Object r13 = r2.f(r1, r12)
            if (r13 != r0) goto La5
        La4:
            return r0
        La5:
            A7.n r13 = A7.n.f558a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
