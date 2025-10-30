package i2;

import O7.p;
import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class m extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public Object f18476r;

    /* renamed from: s, reason: collision with root package name */
    public int f18477s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f18478t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f18479u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f18480v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, long j, int i9, E7.d dVar) {
        super(2, dVar);
        this.f18478t = nVar;
        this.f18479u = j;
        this.f18480v = i9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new m(this.f18478t, this.f18479u, this.f18480v, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
    
        if (r11 == r0) goto L28;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r10.f18477s
            A7.n r2 = A7.n.f558a
            i2.n r3 = r10.f18478t
            r4 = 0
            r5 = 2
            r6 = 1
            b8.Q r7 = r3.j
            if (r1 == 0) goto L27
            if (r1 == r6) goto L1f
            if (r1 != r5) goto L17
            a.AbstractC0485a.A(r11)
            return r2
        L17:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1f:
            a.AbstractC0485a.A(r11)
            A7.j r11 = (A7.j) r11
            java.lang.Object r11 = r11.f550a
            goto L4f
        L27:
            a.AbstractC0485a.A(r11)
            P2.e r11 = r3.f18483h
            C2.g0 r11 = r11.f5769a
            boolean r11 = r11.b()
            if (r11 != 0) goto L3d
            i2.k r11 = i2.k.f18470c
            r7.getClass()
            r7.j(r4, r11)
            return r2
        L3d:
            int r11 = r10.f18480v
            if (r11 >= r6) goto L42
            r11 = r6
        L42:
            r10.f18477s = r6
            long r8 = r10.f18479u
            O2.f0 r1 = r3.f18482g
            java.lang.Object r11 = r1.a(r8, r11, r10)
            if (r11 != r0) goto L4f
            goto L6b
        L4f:
            boolean r1 = r11 instanceof A7.i
            if (r1 != 0) goto L5b
            i2.k r1 = i2.k.f18469b
            r7.getClass()
            r7.j(r4, r1)
        L5b:
            java.lang.Throwable r1 = A7.j.a(r11)
            if (r1 == 0) goto L6c
            r10.f18476r = r11
            r10.f18477s = r5
            java.lang.Object r11 = r3.f(r1, r10)
            if (r11 != r0) goto L6c
        L6b:
            return r0
        L6c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
