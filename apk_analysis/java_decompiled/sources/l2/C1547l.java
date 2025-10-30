package l2;

import O7.p;
import Y7.InterfaceC0484z;

/* renamed from: l2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1547l extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public Object f20207r;

    /* renamed from: s, reason: collision with root package name */
    public int f20208s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f20209t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C1549n f20210u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f20211v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1547l(int i9, E7.d dVar, String str, C1549n c1549n) {
        super(2, dVar);
        this.f20209t = str;
        this.f20210u = c1549n;
        this.f20211v = i9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1547l(this.f20211v, dVar, this.f20209t, this.f20210u);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1547l) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cf, code lost:
    
        if (r6.f(r1, r8) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d1, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
    
        if (r9 == r0) goto L34;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r8.f20208s
            r2 = 0
            r3 = 1
            int r4 = r8.f20211v
            r5 = 2
            l2.n r6 = r8.f20210u
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1e
            if (r1 != r5) goto L16
            a.AbstractC0485a.A(r9)
            goto Ld2
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            a.AbstractC0485a.A(r9)
            A7.j r9 = (A7.j) r9
            java.lang.Object r9 = r9.f550a
            goto L6d
        L26:
            a.AbstractC0485a.A(r9)
            java.lang.String r9 = r8.f20209t
            int r1 = r9.length()
            if (r1 != 0) goto L62
            java.util.ArrayList r9 = r6.f20218h
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L50
            r9 = 0
            r6.f20222m = r9
            Y7.y0 r9 = r6.f20221l
            if (r9 == 0) goto L43
            r9.d(r2)
        L43:
            l2.k r9 = new l2.k
            r9.<init>(r6, r2)
            Y7.y0 r9 = r6.d(r3, r9)
            r6.f20221l = r9
            goto Ld2
        L50:
            A7.h r9 = new A7.h
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.util.ArrayList r1 = r6.f20218h
            r9.<init>(r0, r1)
            b8.Q r0 = r6.f20219i
            r0.getClass()
            r0.j(r2, r9)
            goto Ld2
        L62:
            O2.d0 r1 = r6.f20217g
            r8.f20208s = r3
            java.io.Serializable r9 = r1.a(r4, r8, r9)
            if (r9 != r0) goto L6d
            goto Ld1
        L6d:
            boolean r1 = r9 instanceof A7.i
            if (r1 != 0) goto Lb2
            r1 = r9
            java.util.List r1 = (java.util.List) r1
            if (r4 <= r3) goto La3
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto Lb2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            b8.Q r4 = r6.f20219i
            java.lang.Object r4 = r4.h()
            A7.h r4 = (A7.h) r4
            java.lang.Object r4 = r4.f548b
            java.util.Collection r4 = (java.util.Collection) r4
            r3.addAll(r4)
            r3.addAll(r1)
            A7.h r1 = new A7.h
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r1.<init>(r4, r3)
            b8.Q r3 = r6.f20219i
            r3.getClass()
            r3.j(r2, r1)
            goto Lb2
        La3:
            b8.Q r3 = r6.f20219i
            A7.h r4 = new A7.h
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r4.<init>(r7, r1)
            r3.getClass()
            r3.j(r2, r4)
        Lb2:
            java.lang.Throwable r1 = A7.j.a(r9)
            if (r1 == 0) goto Ld2
            b8.Q r3 = r6.f20220k
            M1.t r4 = new M1.t
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r4.<init>(r7)
            r3.getClass()
            r3.j(r2, r4)
            r8.f20207r = r9
            r8.f20208s = r5
            java.lang.Object r9 = r6.f(r1, r8)
            if (r9 != r0) goto Ld2
        Ld1:
            return r0
        Ld2:
            A7.n r9 = A7.n.f558a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.C1547l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
