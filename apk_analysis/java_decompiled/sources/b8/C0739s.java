package b8;

/* renamed from: b8.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0739s implements InterfaceC0725e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11515a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0725e f11516b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G7.j f11517c;

    /* JADX WARN: Multi-variable type inference failed */
    public C0739s(InterfaceC0725e interfaceC0725e, O7.p pVar, int i9) {
        this.f11515a = i9;
        switch (i9) {
            case 1:
                this.f11516b = interfaceC0725e;
                this.f11517c = (G7.j) pVar;
                return;
            default:
                this.f11516b = interfaceC0725e;
                this.f11517c = (G7.j) pVar;
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.jvm.internal.k] */
    /* JADX WARN: Type inference failed for: r2v0, types: [G7.j, O7.p] */
    /* JADX WARN: Type inference failed for: r4v0, types: [G7.j, O7.p] */
    @Override // b8.InterfaceC0725e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(b8.InterfaceC0726f r6, E7.d r7) {
        /*
            r5 = this;
            int r0 = r5.f11515a
            switch(r0) {
                case 0: goto L59;
                default: goto L5;
            }
        L5:
            boolean r0 = r7 instanceof b8.C0741u
            if (r0 == 0) goto L18
            r0 = r7
            b8.u r0 = (b8.C0741u) r0
            int r1 = r0.f11524s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f11524s = r1
            goto L1d
        L18:
            b8.u r0 = new b8.u
            r0.<init>(r5, r7)
        L1d:
            java.lang.Object r7 = r0.f11523r
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f11524s
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            b8.q r6 = r0.f11526u
            a.AbstractC0485a.A(r7)     // Catch: c8.C0791a -> L2e
            goto L55
        L2e:
            r7 = move-exception
            goto L51
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            a.AbstractC0485a.A(r7)
            b8.e r7 = r5.f11516b
            b8.q r2 = new b8.q
            G7.j r4 = r5.f11517c
            r2.<init>(r4, r6)
            r0.f11526u = r2     // Catch: c8.C0791a -> L4f
            r0.f11524s = r3     // Catch: c8.C0791a -> L4f
            java.lang.Object r6 = r7.collect(r2, r0)     // Catch: c8.C0791a -> L4f
            if (r6 != r1) goto L55
            goto L57
        L4f:
            r7 = move-exception
            r6 = r2
        L51:
            b8.f r0 = r7.f11746a
            if (r0 != r6) goto L58
        L55:
            A7.n r1 = A7.n.f558a
        L57:
            return r1
        L58:
            throw r7
        L59:
            kotlin.jvm.internal.k r0 = new kotlin.jvm.internal.k
            r0.<init>()
            b8.c r1 = new b8.c
            G7.j r2 = r5.f11517c
            r1.<init>(r0, r6, r2)
            b8.e r6 = r5.f11516b
            java.lang.Object r6 = r6.collect(r1, r7)
            F7.a r7 = F7.a.f2587a
            if (r6 != r7) goto L70
            goto L72
        L70:
            A7.n r6 = A7.n.f558a
        L72:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.C0739s.collect(b8.f, E7.d):java.lang.Object");
    }
}
