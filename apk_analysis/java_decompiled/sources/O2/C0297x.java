package O2;

/* renamed from: O2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0297x {

    /* renamed from: a, reason: collision with root package name */
    public final C2.E f5434a;

    /* renamed from: b, reason: collision with root package name */
    public final G2.a f5435b;

    public C0297x(C2.E movieRepository, G2.a episodeMapper) {
        kotlin.jvm.internal.h.e(movieRepository, "movieRepository");
        kotlin.jvm.internal.h.e(episodeMapper, "episodeMapper");
        this.f5434a = movieRepository;
        this.f5435b = episodeMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r5, G7.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof O2.C0296w
            if (r0 == 0) goto L13
            r0 = r7
            O2.w r0 = (O2.C0296w) r0
            int r1 = r0.f5433u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5433u = r1
            goto L18
        L13:
            O2.w r0 = new O2.w
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f5431s
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f5433u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            O2.x r5 = r0.f5430r
            a.AbstractC0485a.A(r7)
            goto L4d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            a.AbstractC0485a.A(r7)
            r0.f5430r = r4
            r0.f5433u = r3
            C2.E r7 = r4.f5434a
            r7.getClass()
            o7.y r2 = E2.d.f1935a
            C2.t r2 = new C2.t
            r3 = 0
            r2.<init>(r7, r5, r3)
            java.lang.Object r7 = E2.d.a(r2, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r5 = r4
        L4d:
            v2.c r7 = (v2.AbstractC2103c) r7
            boolean r6 = r7 instanceof v2.C2101a
            if (r6 == 0) goto L5c
            v2.a r7 = (v2.C2101a) r7
            java.lang.Throwable r5 = r7.f23761a
            A7.i r5 = a.AbstractC0485a.h(r5)
            return r5
        L5c:
            boolean r6 = r7 instanceof v2.C2102b
            if (r6 == 0) goto L7b
            G2.a r5 = r5.f5435b
            v2.b r7 = (v2.C2102b) r7
            java.lang.Object r6 = r7.f23762a
            com.anilab.data.model.response.ListEpisodeResponse r6 = (com.anilab.data.model.response.ListEpisodeResponse) r6
            r5.getClass()
            java.util.List r5 = G2.a.a(r6)
            B.j r6 = new B.j
            r7 = 10
            r6.<init>(r7)
            java.util.List r5 = B7.k.C0(r5, r6)
            return r5
        L7b:
            A7.b r5 = new A7.b
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.C0297x.a(long, G7.c):java.lang.Object");
    }
}
