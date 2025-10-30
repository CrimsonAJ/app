package O2;

/* renamed from: O2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0299z {

    /* renamed from: a, reason: collision with root package name */
    public final C2.E f5440a;

    /* renamed from: b, reason: collision with root package name */
    public final G2.e f5441b;

    public C0299z(C2.E movieRepository, G2.e commentListMapper) {
        kotlin.jvm.internal.h.e(movieRepository, "movieRepository");
        kotlin.jvm.internal.h.e(commentListMapper, "commentListMapper");
        this.f5440a = movieRepository;
        this.f5441b = commentListMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r10, int r12, int r13, G7.c r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof O2.C0298y
            if (r0 == 0) goto L13
            r0 = r14
            O2.y r0 = (O2.C0298y) r0
            int r1 = r0.f5439u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5439u = r1
            goto L18
        L13:
            O2.y r0 = new O2.y
            r0.<init>(r9, r14)
        L18:
            java.lang.Object r14 = r0.f5437s
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f5439u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            O2.z r10 = r0.f5436r
            a.AbstractC0485a.A(r14)
            goto L50
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            a.AbstractC0485a.A(r14)
            r0.f5436r = r9
            r0.f5439u = r3
            C2.E r3 = r9.f5440a
            r3.getClass()
            o7.y r14 = E2.d.f1935a
            C2.o r2 = new C2.o
            r8 = 0
            r4 = r10
            r6 = r12
            r7 = r13
            r2.<init>(r3, r4, r6, r7, r8)
            java.lang.Object r14 = E2.d.a(r2, r0)
            if (r14 != r1) goto L4f
            return r1
        L4f:
            r10 = r9
        L50:
            v2.c r14 = (v2.AbstractC2103c) r14
            boolean r11 = r14 instanceof v2.C2101a
            if (r11 == 0) goto L5f
            v2.a r14 = (v2.C2101a) r14
            java.lang.Throwable r10 = r14.f23761a
            A7.i r10 = a.AbstractC0485a.h(r10)
            return r10
        L5f:
            boolean r11 = r14 instanceof v2.C2102b
            if (r11 == 0) goto L70
            G2.e r10 = r10.f5441b
            v2.b r14 = (v2.C2102b) r14
            java.lang.Object r11 = r14.f23762a
            com.anilab.data.model.response.CommentListResponse r11 = (com.anilab.data.model.response.CommentListResponse) r11
            H2.e r10 = r10.n(r11)
            return r10
        L70:
            A7.b r10 = new A7.b
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.C0299z.a(long, int, int, G7.c):java.lang.Object");
    }
}
