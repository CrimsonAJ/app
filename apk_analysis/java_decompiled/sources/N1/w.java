package N1;

import Y7.InterfaceC0484z;
import com.anilab.domain.model.Shortcut;

/* loaded from: classes.dex */
public final class w extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public Object f4875r;

    /* renamed from: s, reason: collision with root package name */
    public int f4876s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y f4877t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Shortcut f4878u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f4879v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, Shortcut shortcut, int i9, E7.d dVar) {
        super(2, dVar);
        this.f4877t = yVar;
        this.f4878u = shortcut;
        this.f4879v = i9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new w(this.f4877t, this.f4878u, this.f4879v, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00eb, code lost:
    
        if (r4.f(r1, r12) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ed, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0034, code lost:
    
        if (r13 == r0) goto L33;
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
            int r1 = r12.f4876s
            int r2 = r12.f4879v
            r3 = 2
            N1.y r4 = r12.f4877t
            r5 = 1
            if (r1 == 0) goto L25
            if (r1 == r5) goto L1d
            if (r1 != r3) goto L15
            a.AbstractC0485a.A(r13)
            goto Lee
        L15:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1d:
            a.AbstractC0485a.A(r13)
            A7.j r13 = (A7.j) r13
            java.lang.Object r13 = r13.f550a
            goto L38
        L25:
            a.AbstractC0485a.A(r13)
            O2.D r13 = r4.f4884f
            com.anilab.domain.model.Shortcut r1 = r12.f4878u
            r12.f4876s = r5
            java.lang.String r1 = r1.f14439a
            java.io.Serializable r13 = r13.a(r2, r12, r1)
            if (r13 != r0) goto L38
            goto Led
        L38:
            boolean r1 = r13 instanceof A7.i
            r6 = 0
            if (r1 != 0) goto Lce
            r1 = r13
            java.util.List r1 = (java.util.List) r1
            r7 = 10
            if (r2 <= r5) goto L96
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto Lce
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            b8.Q r5 = r4.f4888k
            java.lang.Object r5 = r5.h()
            java.util.Collection r5 = (java.util.Collection) r5
            r2.addAll(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            int r7 = B7.m.f0(r1, r7)
            r5.<init>(r7)
            java.util.Iterator r1 = r1.iterator()
        L67:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L8a
            java.lang.Object r7 = r1.next()
            com.anilab.domain.model.Movie r7 = (com.anilab.domain.model.Movie) r7
            O2.E r8 = r4.f4887i
            java.util.List r8 = r8.a()
            long r9 = r7.f14414a
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r9)
            boolean r8 = r8.contains(r11)
            r7.f14428p = r8
            r5.add(r7)
            goto L67
        L8a:
            r2.addAll(r5)
            b8.Q r1 = r4.f4888k
            r1.getClass()
            r1.j(r6, r2)
            goto Lce
        L96:
            b8.Q r2 = r4.f4888k
            java.util.ArrayList r5 = new java.util.ArrayList
            int r7 = B7.m.f0(r1, r7)
            r5.<init>(r7)
            java.util.Iterator r1 = r1.iterator()
        La5:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto Lc8
            java.lang.Object r7 = r1.next()
            com.anilab.domain.model.Movie r7 = (com.anilab.domain.model.Movie) r7
            O2.E r8 = r4.f4887i
            java.util.List r8 = r8.a()
            long r9 = r7.f14414a
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r9)
            boolean r8 = r8.contains(r11)
            r7.f14428p = r8
            r5.add(r7)
            goto La5
        Lc8:
            r2.getClass()
            r2.j(r6, r5)
        Lce:
            java.lang.Throwable r1 = A7.j.a(r13)
            if (r1 == 0) goto Lee
            b8.Q r2 = r4.f4889l
            M1.t r5 = new M1.t
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r5.<init>(r7)
            r2.getClass()
            r2.j(r6, r5)
            r12.f4875r = r13
            r12.f4876s = r3
            java.lang.Object r13 = r4.f(r1, r12)
            if (r13 != r0) goto Lee
        Led:
            return r0
        Lee:
            A7.n r13 = A7.n.f558a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
