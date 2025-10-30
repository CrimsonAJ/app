package O2;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final C2.E f5323a;

    /* renamed from: b, reason: collision with root package name */
    public final G2.t f5324b;

    public L(C2.E movieRepository, G2.t releaseCalendarMapper) {
        kotlin.jvm.internal.h.e(movieRepository, "movieRepository");
        kotlin.jvm.internal.h.e(releaseCalendarMapper, "releaseCalendarMapper");
        this.f5323a = movieRepository;
        this.f5324b = releaseCalendarMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(long r10, long r12, G7.c r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof O2.K
            if (r0 == 0) goto L13
            r0 = r14
            O2.K r0 = (O2.K) r0
            int r1 = r0.f5322u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5322u = r1
            goto L18
        L13:
            O2.K r0 = new O2.K
            r0.<init>(r9, r14)
        L18:
            java.lang.Object r14 = r0.f5320s
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f5322u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            O2.L r10 = r0.f5319r
            a.AbstractC0485a.A(r14)
            goto L4f
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            a.AbstractC0485a.A(r14)
            r0.f5319r = r9
            r0.f5322u = r3
            C2.E r3 = r9.f5323a
            r3.getClass()
            o7.y r14 = E2.d.f1935a
            C2.x r2 = new C2.x
            r8 = 0
            r4 = r10
            r6 = r12
            r2.<init>(r3, r4, r6, r8)
            java.lang.Object r14 = E2.d.a(r2, r0)
            if (r14 != r1) goto L4e
            return r1
        L4e:
            r10 = r9
        L4f:
            v2.c r14 = (v2.AbstractC2103c) r14
            boolean r11 = r14 instanceof v2.C2101a
            if (r11 == 0) goto L5e
            v2.a r14 = (v2.C2101a) r14
            java.lang.Throwable r10 = r14.f23761a
            A7.i r10 = a.AbstractC0485a.h(r10)
            return r10
        L5e:
            boolean r11 = r14 instanceof v2.C2102b
            if (r11 == 0) goto L74
            G2.t r10 = r10.f5324b
            v2.b r14 = (v2.C2102b) r14
            java.lang.Object r11 = r14.f23762a
            java.util.List r11 = (java.util.List) r11
            r10.getClass()
            java.util.List r10 = l6.AbstractC1570b.q(r10, r11)
            java.io.Serializable r10 = (java.io.Serializable) r10
            return r10
        L74:
            A7.b r10 = new A7.b
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.L.a(long, long, G7.c):java.io.Serializable");
    }
}
