package O1;

import A7.n;
import G7.j;
import O7.p;
import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class f extends j implements p {

    /* renamed from: r, reason: collision with root package name */
    public Object f5276r;

    /* renamed from: s, reason: collision with root package name */
    public int f5277s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f5278t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f5279u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f5280v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f5281w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, String str2, g gVar, String str3, E7.d dVar) {
        super(2, dVar);
        this.f5278t = str;
        this.f5279u = str2;
        this.f5280v = gVar;
        this.f5281w = str3;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new f(this.f5278t, this.f5279u, this.f5280v, this.f5281w, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r10 == r0) goto L25;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r9.f5277s
            A7.n r2 = A7.n.f558a
            O1.g r3 = r9.f5280v
            r4 = 0
            r5 = 2
            r6 = 1
            b8.Q r7 = r3.f5284h
            if (r1 == 0) goto L27
            if (r1 == r6) goto L1f
            if (r1 != r5) goto L17
            a.AbstractC0485a.A(r10)
            return r2
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            a.AbstractC0485a.A(r10)
            A7.j r10 = (A7.j) r10
            java.lang.Object r10 = r10.f550a
            goto L5f
        L27:
            a.AbstractC0485a.A(r10)
            java.lang.String r10 = r9.f5278t
            java.lang.CharSequence r1 = W7.d.j0(r10)
            java.lang.String r1 = r1.toString()
            java.lang.String r8 = r9.f5279u
            java.lang.CharSequence r8 = W7.d.j0(r8)
            java.lang.String r8 = r8.toString()
            boolean r1 = kotlin.jvm.internal.h.a(r1, r8)
            if (r1 != 0) goto L52
            M1.t r10 = new M1.t
            O1.e r0 = O1.e.f5273b
            r10.<init>(r0)
            r7.getClass()
            r7.j(r4, r10)
            return r2
        L52:
            r9.f5277s = r6
            java.lang.String r1 = r9.f5281w
            P2.b r6 = r3.f5282f
            java.lang.Object r10 = r6.a(r1, r10, r9)
            if (r10 != r0) goto L5f
            goto L83
        L5f:
            boolean r1 = r10 instanceof A7.i
            if (r1 != 0) goto L73
            r1 = r10
            A7.n r1 = (A7.n) r1
            M1.t r1 = new M1.t
            O1.e r6 = O1.e.f5274c
            r1.<init>(r6)
            r7.getClass()
            r7.j(r4, r1)
        L73:
            java.lang.Throwable r1 = A7.j.a(r10)
            if (r1 == 0) goto L84
            r9.f5276r = r10
            r9.f5277s = r5
            java.lang.Object r10 = r3.f(r1, r9)
            if (r10 != r0) goto L84
        L83:
            return r0
        L84:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
