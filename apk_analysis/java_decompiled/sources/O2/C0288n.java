package O2;

/* renamed from: O2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0288n {

    /* renamed from: a, reason: collision with root package name */
    public final C2.E f5404a;

    /* renamed from: b, reason: collision with root package name */
    public final G2.j f5405b;

    public C0288n(C2.E movieRepository, G2.j episodeDetailMapper) {
        kotlin.jvm.internal.h.e(movieRepository, "movieRepository");
        kotlin.jvm.internal.h.e(episodeDetailMapper, "episodeDetailMapper");
        this.f5404a = movieRepository;
        this.f5405b = episodeDetailMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r5, G7.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof O2.C0287m
            if (r0 == 0) goto L13
            r0 = r7
            O2.m r0 = (O2.C0287m) r0
            int r1 = r0.f5403u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5403u = r1
            goto L18
        L13:
            O2.m r0 = new O2.m
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f5401s
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f5403u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            O2.n r5 = r0.f5400r
            a.AbstractC0485a.A(r7)
            goto L4d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            a.AbstractC0485a.A(r7)
            r0.f5400r = r4
            r0.f5403u = r3
            C2.E r7 = r4.f5404a
            r7.getClass()
            o7.y r2 = E2.d.f1935a
            C2.m r2 = new C2.m
            r3 = 0
            r2.<init>(r7, r5, r3)
            java.lang.Object r7 = E2.d.a(r2, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r5 = r4
        L4d:
            v2.c r7 = (v2.AbstractC2103c) r7
            G2.j r5 = r5.f5405b
            java.lang.Object r5 = Z0.a.n(r7, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.C0288n.a(long, G7.c):java.lang.Object");
    }
}
