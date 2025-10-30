package O2;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final C2.E f5311a;

    /* renamed from: b, reason: collision with root package name */
    public final G2.s f5312b;

    public H(C2.E movieRepository, G2.s movieMapper) {
        kotlin.jvm.internal.h.e(movieRepository, "movieRepository");
        kotlin.jvm.internal.h.e(movieMapper, "movieMapper");
        this.f5311a = movieRepository;
        this.f5312b = movieMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(long r9, java.util.List r11, G7.c r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof O2.G
            if (r0 == 0) goto L13
            r0 = r12
            O2.G r0 = (O2.G) r0
            int r1 = r0.f5310u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5310u = r1
            goto L18
        L13:
            O2.G r0 = new O2.G
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.f5308s
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f5310u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            O2.H r9 = r0.f5307r
            a.AbstractC0485a.A(r12)
            goto L4f
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            a.AbstractC0485a.A(r12)
            r0.f5307r = r8
            r0.f5310u = r3
            C2.E r3 = r8.f5311a
            r3.getClass()
            o7.y r12 = E2.d.f1935a
            C2.v r2 = new C2.v
            r7 = 0
            r4 = r9
            r6 = r11
            r2.<init>(r3, r4, r6, r7)
            java.lang.Object r12 = E2.d.a(r2, r0)
            if (r12 != r1) goto L4e
            return r1
        L4e:
            r9 = r8
        L4f:
            v2.c r12 = (v2.AbstractC2103c) r12
            boolean r10 = r12 instanceof v2.C2101a
            if (r10 == 0) goto L5e
            v2.a r12 = (v2.C2101a) r12
            java.lang.Throwable r9 = r12.f23761a
            A7.i r9 = a.AbstractC0485a.h(r9)
            return r9
        L5e:
            boolean r10 = r12 instanceof v2.C2102b
            if (r10 == 0) goto L74
            G2.s r9 = r9.f5312b
            v2.b r12 = (v2.C2102b) r12
            java.lang.Object r10 = r12.f23762a
            java.util.List r10 = (java.util.List) r10
            r9.getClass()
            java.util.List r9 = l6.AbstractC1570b.q(r9, r10)
            java.io.Serializable r9 = (java.io.Serializable) r9
            return r9
        L74:
            A7.b r9 = new A7.b
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.H.a(long, java.util.List, G7.c):java.io.Serializable");
    }
}
