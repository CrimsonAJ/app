package O2;

/* renamed from: O2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0276b {

    /* renamed from: a, reason: collision with root package name */
    public final C2.E f5363a;

    /* renamed from: b, reason: collision with root package name */
    public final G2.f f5364b;

    public C0276b(C2.E movieRepository, G2.f commentMapper) {
        kotlin.jvm.internal.h.e(movieRepository, "movieRepository");
        kotlin.jvm.internal.h.e(commentMapper, "commentMapper");
        this.f5363a = movieRepository;
        this.f5364b = commentMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r9, java.lang.String r11, G7.c r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof O2.C0275a
            if (r0 == 0) goto L13
            r0 = r12
            O2.a r0 = (O2.C0275a) r0
            int r1 = r0.f5361u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5361u = r1
            goto L18
        L13:
            O2.a r0 = new O2.a
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.f5359s
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f5361u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            O2.b r9 = r0.f5358r
            a.AbstractC0485a.A(r12)
            goto L4f
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            a.AbstractC0485a.A(r12)
            r0.f5358r = r8
            r0.f5361u = r3
            C2.E r3 = r8.f5363a
            r3.getClass()
            o7.y r12 = E2.d.f1935a
            C2.f r2 = new C2.f
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
            if (r10 == 0) goto L72
            G2.f r9 = r9.f5364b
            v2.b r12 = (v2.C2102b) r12
            java.lang.Object r10 = r12.f23762a
            com.anilab.data.model.response.CommentResponse r10 = (com.anilab.data.model.response.CommentResponse) r10
            r9.getClass()
            H2.c r9 = G2.f.a(r10)
            return r9
        L72:
            A7.b r9 = new A7.b
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.C0276b.a(long, java.lang.String, G7.c):java.lang.Object");
    }
}
