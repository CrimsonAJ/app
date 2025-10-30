package co.notix;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class yk extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f13618a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zk f13619b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk(zk zkVar, E7.d dVar) {
        super(2, dVar);
        this.f13619b = zkVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new yk(this.f13619b, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((yk) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
    
        if (r11 == r2) goto L21;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 1
            r1 = 2
            F7.a r2 = F7.a.f2587a
            int r3 = r10.f13618a
            A7.n r4 = A7.n.f558a
            if (r3 == 0) goto L1e
            if (r3 == r0) goto L1a
            if (r3 != r1) goto L12
            a.AbstractC0485a.A(r11)
            goto L6c
        L12:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1a:
            a.AbstractC0485a.A(r11)
            goto L2e
        L1e:
            a.AbstractC0485a.A(r11)
            co.notix.zk r11 = r10.f13619b
            co.notix.mq r11 = r11.f13692c
            r10.f13618a = r0
            java.lang.Object r11 = r11.f(r10)
            if (r11 != r2) goto L2e
            goto L6b
        L2e:
            b8.e r11 = (b8.InterfaceC0725e) r11
            co.notix.zk r3 = r10.f13619b
            co.notix.lf r3 = r3.f13694e
            A7.e r3 = r3.f12707c
            java.lang.Object r3 = r3.getValue()
            b8.O r3 = (b8.InterfaceC0716O) r3
            co.notix.zk r5 = r10.f13619b
            co.notix.na r6 = r5.f13695f
            co.notix.ra r6 = (co.notix.ra) r6
            b8.O r6 = r6.f13096e
            co.notix.xk r7 = new co.notix.xk
            r8 = 0
            r7.<init>(r5, r8)
            r5 = 3
            b8.e[] r5 = new b8.InterfaceC0725e[r5]
            r9 = 0
            r5[r9] = r3
            r5[r0] = r6
            r5[r1] = r11
            r10.f13618a = r1
            c8.x r11 = c8.x.f11808a
            b8.C r0 = new b8.C
            r0.<init>(r8, r7)
            java.lang.Object r11 = c8.AbstractC0793c.a(r10, r0, r11, r5)
            if (r11 != r2) goto L64
            goto L65
        L64:
            r11 = r4
        L65:
            if (r11 != r2) goto L68
            goto L69
        L68:
            r11 = r4
        L69:
            if (r11 != r2) goto L6c
        L6b:
            return r2
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.yk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
