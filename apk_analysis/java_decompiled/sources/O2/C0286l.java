package O2;

/* renamed from: O2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0286l {

    /* renamed from: a, reason: collision with root package name */
    public final C2.E f5398a;

    /* renamed from: b, reason: collision with root package name */
    public final G2.s f5399b;

    public C0286l(C2.E movieRepository, G2.s movieMapper) {
        kotlin.jvm.internal.h.e(movieRepository, "movieRepository");
        kotlin.jvm.internal.h.e(movieMapper, "movieMapper");
        this.f5398a = movieRepository;
        this.f5399b = movieMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(int r13, com.anilab.domain.model.FilterConfig r14, com.anilab.domain.model.FilterConfig r15, com.anilab.domain.model.FilterConfig r16, java.util.List r17, G7.c r18) {
        /*
            r12 = this;
            r0 = r18
            boolean r1 = r0 instanceof O2.C0285k
            if (r1 == 0) goto L15
            r1 = r0
            O2.k r1 = (O2.C0285k) r1
            int r2 = r1.f5397u
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f5397u = r2
            goto L1a
        L15:
            O2.k r1 = new O2.k
            r1.<init>(r12, r0)
        L1a:
            java.lang.Object r0 = r1.f5395s
            F7.a r2 = F7.a.f2587a
            int r3 = r1.f5397u
            r4 = 1
            if (r3 == 0) goto L34
            if (r3 != r4) goto L2c
            O2.l r13 = r1.f5394r
            a.AbstractC0485a.A(r0)
            goto L9d
        L2c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L34:
            a.AbstractC0485a.A(r0)
            java.lang.String r8 = r14.f14404b
            java.lang.String r14 = r15.f14404b
            r0 = 0
            if (r14 == 0) goto L4b
            int r14 = java.lang.Integer.parseInt(r14)
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r14)
            r6 = r3
        L48:
            r14 = r16
            goto L4d
        L4b:
            r6 = r0
            goto L48
        L4d:
            java.lang.String r14 = r14.f14404b
            if (r14 == 0) goto L5a
            int r14 = java.lang.Integer.parseInt(r14)
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r14)
        L5a:
            r7 = r0
            java.util.ArrayList r9 = new java.util.ArrayList
            r14 = 10
            r0 = r17
            int r14 = B7.m.f0(r0, r14)
            r9.<init>(r14)
            java.util.Iterator r14 = r0.iterator()
        L6c:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L83
            java.lang.Object r0 = r14.next()
            com.anilab.domain.model.Genre r0 = (com.anilab.domain.model.Genre) r0
            long r10 = r0.f14405a
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r10)
            r9.add(r0)
            goto L6c
        L83:
            r1.f5394r = r12
            r1.f5397u = r4
            C2.E r4 = r12.f5398a
            r4.getClass()
            o7.y r14 = E2.d.f1935a
            C2.l r3 = new C2.l
            r10 = 0
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r0 = E2.d.a(r3, r1)
            if (r0 != r2) goto L9c
            return r2
        L9c:
            r13 = r12
        L9d:
            v2.c r0 = (v2.AbstractC2103c) r0
            boolean r14 = r0 instanceof v2.C2101a
            if (r14 == 0) goto Lac
            v2.a r0 = (v2.C2101a) r0
            java.lang.Throwable r13 = r0.f23761a
            A7.i r13 = a.AbstractC0485a.h(r13)
            return r13
        Lac:
            boolean r14 = r0 instanceof v2.C2102b
            if (r14 == 0) goto Lc2
            G2.s r13 = r13.f5399b
            v2.b r0 = (v2.C2102b) r0
            java.lang.Object r14 = r0.f23762a
            java.util.List r14 = (java.util.List) r14
            r13.getClass()
            java.util.List r13 = l6.AbstractC1570b.q(r13, r14)
            java.io.Serializable r13 = (java.io.Serializable) r13
            return r13
        Lc2:
            A7.b r13 = new A7.b
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.C0286l.a(int, com.anilab.domain.model.FilterConfig, com.anilab.domain.model.FilterConfig, com.anilab.domain.model.FilterConfig, java.util.List, G7.c):java.io.Serializable");
    }
}
