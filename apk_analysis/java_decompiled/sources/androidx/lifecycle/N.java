package androidx.lifecycle;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class N extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public kotlin.jvm.internal.o f9824r;

    /* renamed from: s, reason: collision with root package name */
    public kotlin.jvm.internal.o f9825s;

    /* renamed from: t, reason: collision with root package name */
    public int f9826t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ D.n f9827u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ EnumC0555p f9828v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0484z f9829w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ G7.j f9830x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public N(D.n nVar, EnumC0555p enumC0555p, InterfaceC0484z interfaceC0484z, O7.p pVar, E7.d dVar) {
        super(2, dVar);
        this.f9827u = nVar;
        this.f9828v = enumC0555p;
        this.f9829w = interfaceC0484z;
        this.f9830x = (G7.j) pVar;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [G7.j, O7.p] */
    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new N(this.f9827u, this.f9828v, this.f9829w, this.f9830x, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((N) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009a  */
    /* JADX WARN: Type inference failed for: r13v0, types: [G7.j, O7.p] */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.internal.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.internal.o, java.lang.Object] */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r14.f9826t
            A7.n r2 = A7.n.f558a
            D.n r3 = r14.f9827u
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L23
            if (r1 != r5) goto L1b
            kotlin.jvm.internal.o r1 = r14.f9825s
            kotlin.jvm.internal.o r5 = r14.f9824r
            a.AbstractC0485a.A(r15)     // Catch: java.lang.Throwable -> L17
            goto L9b
        L17:
            r0 = move-exception
            r15 = r0
            goto Lb1
        L1b:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L23:
            a.AbstractC0485a.A(r15)
            androidx.lifecycle.p r15 = r3.a0()
            androidx.lifecycle.p r1 = androidx.lifecycle.EnumC0555p.f9893a
            if (r15 != r1) goto L30
            goto Lad
        L30:
            kotlin.jvm.internal.o r8 = new kotlin.jvm.internal.o
            r8.<init>()
            kotlin.jvm.internal.o r1 = new kotlin.jvm.internal.o
            r1.<init>()
            androidx.lifecycle.p r15 = r14.f9828v     // Catch: java.lang.Throwable -> Lae
            Y7.z r9 = r14.f9829w     // Catch: java.lang.Throwable -> Lae
            G7.j r13 = r14.f9830x     // Catch: java.lang.Throwable -> Lae
            r14.f9824r = r8     // Catch: java.lang.Throwable -> Lae
            r14.f9825s = r1     // Catch: java.lang.Throwable -> Lae
            r14.f9826t = r5     // Catch: java.lang.Throwable -> Lae
            Y7.h r11 = new Y7.h     // Catch: java.lang.Throwable -> Lae
            E7.d r6 = com.google.android.gms.internal.measurement.D1.A(r14)     // Catch: java.lang.Throwable -> Lae
            r11.<init>(r5, r6)     // Catch: java.lang.Throwable -> Lae
            r11.s()     // Catch: java.lang.Throwable -> Lae
            androidx.lifecycle.m r5 = androidx.lifecycle.EnumC0554o.Companion     // Catch: java.lang.Throwable -> Lae
            r5.getClass()     // Catch: java.lang.Throwable -> Lae
            int r5 = r15.ordinal()     // Catch: java.lang.Throwable -> Lae
            r6 = 4
            r7 = 3
            r10 = 2
            if (r5 == r10) goto L6c
            if (r5 == r7) goto L69
            if (r5 == r6) goto L66
            r5 = r4
            goto L6e
        L66:
            androidx.lifecycle.o r5 = androidx.lifecycle.EnumC0554o.ON_RESUME     // Catch: java.lang.Throwable -> Lae
            goto L6e
        L69:
            androidx.lifecycle.o r5 = androidx.lifecycle.EnumC0554o.ON_START     // Catch: java.lang.Throwable -> Lae
            goto L6e
        L6c:
            androidx.lifecycle.o r5 = androidx.lifecycle.EnumC0554o.ON_CREATE     // Catch: java.lang.Throwable -> Lae
        L6e:
            int r15 = r15.ordinal()     // Catch: java.lang.Throwable -> Lae
            if (r15 == r10) goto L81
            if (r15 == r7) goto L7e
            if (r15 == r6) goto L7a
            r10 = r4
            goto L84
        L7a:
            androidx.lifecycle.o r15 = androidx.lifecycle.EnumC0554o.ON_PAUSE     // Catch: java.lang.Throwable -> Lae
        L7c:
            r10 = r15
            goto L84
        L7e:
            androidx.lifecycle.o r15 = androidx.lifecycle.EnumC0554o.ON_STOP     // Catch: java.lang.Throwable -> Lae
            goto L7c
        L81:
            androidx.lifecycle.o r15 = androidx.lifecycle.EnumC0554o.ON_DESTROY     // Catch: java.lang.Throwable -> Lae
            goto L7c
        L84:
            g8.d r12 = g8.e.a()     // Catch: java.lang.Throwable -> Lae
            androidx.lifecycle.M r6 = new androidx.lifecycle.M     // Catch: java.lang.Throwable -> Lae
            r7 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> Lae
            r1.f20159a = r6     // Catch: java.lang.Throwable -> Lae
            r3.V(r6)     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r15 = r11.r()     // Catch: java.lang.Throwable -> Lae
            if (r15 != r0) goto L9a
            return r0
        L9a:
            r5 = r8
        L9b:
            java.lang.Object r15 = r5.f20159a
            Y7.h0 r15 = (Y7.InterfaceC0465h0) r15
            if (r15 == 0) goto La4
            r15.d(r4)
        La4:
            java.lang.Object r15 = r1.f20159a
            androidx.lifecycle.u r15 = (androidx.lifecycle.InterfaceC0559u) r15
            if (r15 == 0) goto Lad
            r3.g0(r15)
        Lad:
            return r2
        Lae:
            r0 = move-exception
            r15 = r0
            r5 = r8
        Lb1:
            java.lang.Object r0 = r5.f20159a
            Y7.h0 r0 = (Y7.InterfaceC0465h0) r0
            if (r0 == 0) goto Lba
            r0.d(r4)
        Lba:
            java.lang.Object r0 = r1.f20159a
            androidx.lifecycle.u r0 = (androidx.lifecycle.InterfaceC0559u) r0
            if (r0 == 0) goto Lc3
            r3.g0(r0)
        Lc3:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.N.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
