package Y7;

/* loaded from: classes.dex */
public final class q0 extends G7.i implements O7.p {

    /* renamed from: s, reason: collision with root package name */
    public t0 f8843s;

    /* renamed from: t, reason: collision with root package name */
    public d8.k f8844t;

    /* renamed from: u, reason: collision with root package name */
    public int f8845u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f8846v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r0 f8847w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(E7.d dVar, r0 r0Var) {
        super(dVar);
        this.f8847w = r0Var;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        q0 q0Var = new q0(dVar, this.f8847w);
        q0Var.f8846v = obj;
        return q0Var;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((q0) create((V7.k) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0062 -> B:6:0x0075). Please report as a decompilation issue!!! */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r5.f8845u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            d8.k r1 = r5.f8844t
            Y7.t0 r3 = r5.f8843s
            java.lang.Object r4 = r5.f8846v
            V7.k r4 = (V7.k) r4
            a.AbstractC0485a.A(r6)
            goto L75
        L18:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L20:
            a.AbstractC0485a.A(r6)
            goto L7a
        L24:
            a.AbstractC0485a.A(r6)
            java.lang.Object r6 = r5.f8846v
            V7.k r6 = (V7.k) r6
            Y7.r0 r1 = r5.f8847w
            java.lang.Object r1 = r1.D()
            boolean r4 = r1 instanceof Y7.C0471l
            if (r4 == 0) goto L3f
            Y7.l r1 = (Y7.C0471l) r1
            Y7.r0 r1 = r1.f8821e
            r5.f8845u = r3
            r6.d(r1, r5)
            return r0
        L3f:
            boolean r3 = r1 instanceof Y7.InterfaceC0451a0
            if (r3 == 0) goto L7a
            Y7.a0 r1 = (Y7.InterfaceC0451a0) r1
            Y7.t0 r1 = r1.e()
            if (r1 == 0) goto L7a
            java.lang.Object r3 = r1.h()
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.h.c(r3, r4)
            d8.k r3 = (d8.k) r3
            r4 = r3
            r3 = r1
            r1 = r4
            r4 = r6
        L5a:
            boolean r6 = r1.equals(r3)
            if (r6 != 0) goto L7a
            boolean r6 = r1 instanceof Y7.C0471l
            if (r6 == 0) goto L75
            r6 = r1
            Y7.l r6 = (Y7.C0471l) r6
            r5.f8846v = r4
            r5.f8843s = r3
            r5.f8844t = r1
            r5.f8845u = r2
            Y7.r0 r6 = r6.f8821e
            r4.d(r6, r5)
            return r0
        L75:
            d8.k r1 = r1.i()
            goto L5a
        L7a:
            A7.n r6 = A7.n.f558a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Y7.q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
