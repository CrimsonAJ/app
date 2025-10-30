package X;

import b8.InterfaceC0725e;

/* renamed from: X.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0419t implements InterfaceC0725e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8110a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8111b;

    public /* synthetic */ C0419t(InterfaceC0725e interfaceC0725e, int i9) {
        this.f8110a = i9;
        this.f8111b = interfaceC0725e;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v16, types: [G7.j, O7.p] */
    @Override // b8.InterfaceC0725e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(b8.InterfaceC0726f r7, E7.d r8) {
        /*
            r6 = this;
            int r0 = r6.f8110a
            switch(r0) {
                case 0: goto L99;
                case 1: goto L7f;
                case 2: goto L69;
                default: goto L5;
            }
        L5:
            boolean r0 = r8 instanceof b8.C0721a
            if (r0 == 0) goto L18
            r0 = r8
            b8.a r0 = (b8.C0721a) r0
            int r1 = r0.f11461u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f11461u = r1
            goto L1d
        L18:
            b8.a r0 = new b8.a
            r0.<init>(r6, r8)
        L1d:
            java.lang.Object r8 = r0.f11459s
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f11461u
            A7.n r3 = A7.n.f558a
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            c8.z r7 = r0.f11458r
            a.AbstractC0485a.A(r8)     // Catch: java.lang.Throwable -> L30
            goto L5a
        L30:
            r8 = move-exception
            goto L65
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            a.AbstractC0485a.A(r8)
            c8.z r8 = new c8.z
            E7.i r2 = r0.getContext()
            r8.<init>(r7, r2)
            r0.f11458r = r8     // Catch: java.lang.Throwable -> L63
            r0.f11461u = r4     // Catch: java.lang.Throwable -> L63
            java.lang.Object r7 = r6.f8111b     // Catch: java.lang.Throwable -> L63
            G7.j r7 = (G7.j) r7     // Catch: java.lang.Throwable -> L63
            java.lang.Object r7 = r7.invoke(r8, r0)     // Catch: java.lang.Throwable -> L63
            if (r7 != r1) goto L55
            goto L56
        L55:
            r7 = r3
        L56:
            if (r7 != r1) goto L59
            goto L5e
        L59:
            r7 = r8
        L5a:
            r7.releaseIntercepted()
            r1 = r3
        L5e:
            return r1
        L5f:
            r5 = r8
            r8 = r7
            r7 = r5
            goto L65
        L63:
            r7 = move-exception
            goto L5f
        L65:
            r7.releaseIntercepted()
            throw r8
        L69:
            X.s r0 = new X.s
            r1 = 1
            r0.<init>(r7, r1)
            java.lang.Object r7 = r6.f8111b
            co.notix.b9 r7 = (co.notix.b9) r7
            java.lang.Object r7 = r7.collect(r0, r8)
            F7.a r8 = F7.a.f2587a
            if (r7 != r8) goto L7c
            goto L7e
        L7c:
            A7.n r7 = A7.n.f558a
        L7e:
            return r7
        L7f:
            kotlin.jvm.internal.m r0 = new kotlin.jvm.internal.m
            r0.<init>()
            b8.q r1 = new b8.q
            r1.<init>(r0, r7)
            java.lang.Object r7 = r6.f8111b
            b8.e r7 = (b8.InterfaceC0725e) r7
            java.lang.Object r7 = r7.collect(r1, r8)
            F7.a r8 = F7.a.f2587a
            if (r7 != r8) goto L96
            goto L98
        L96:
            A7.n r7 = A7.n.f558a
        L98:
            return r7
        L99:
            X.s r0 = new X.s
            r1 = 0
            r0.<init>(r7, r1)
            java.lang.Object r7 = r6.f8111b
            b8.s r7 = (b8.C0739s) r7
            java.lang.Object r7 = r7.collect(r0, r8)
            F7.a r8 = F7.a.f2587a
            if (r7 != r8) goto Lac
            goto Lae
        Lac:
            A7.n r7 = A7.n.f558a
        Lae:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0419t.collect(b8.f, E7.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0419t(O7.p pVar) {
        this.f8110a = 3;
        this.f8111b = (G7.j) pVar;
    }
}
