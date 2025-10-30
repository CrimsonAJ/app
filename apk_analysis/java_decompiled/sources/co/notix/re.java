package co.notix;

import b8.InterfaceC0726f;

/* loaded from: classes.dex */
public final class re implements InterfaceC0726f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0726f f13106a;

    public re(InterfaceC0726f interfaceC0726f) {
        this.f13106a = interfaceC0726f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // b8.InterfaceC0726f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, E7.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof co.notix.qe
            if (r0 == 0) goto L13
            r0 = r6
            co.notix.qe r0 = (co.notix.qe) r0
            int r1 = r0.f13037b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13037b = r1
            goto L18
        L13:
            co.notix.qe r0 = new co.notix.qe
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f13036a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f13037b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0485a.A(r6)
            goto L4c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            a.AbstractC0485a.A(r6)
            b8.f r6 = r4.f13106a
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 <= 0) goto L3e
            r5 = r3
            goto L3f
        L3e:
            r5 = 0
        L3f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0.f13037b = r3
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            A7.n r5 = A7.n.f558a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.re.emit(java.lang.Object, E7.d):java.lang.Object");
    }
}
