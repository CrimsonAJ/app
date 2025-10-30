package co.notix;

import b8.InterfaceC0726f;

/* loaded from: classes.dex */
public final class mh implements InterfaceC0726f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vh f12784a;

    public mh(vh vhVar) {
        this.f12784a = vhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        if (Y7.B.C(Y7.K.f8774b, new co.notix.jh(r8.f12613d, r8, r7, null), r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // b8.InterfaceC0726f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, E7.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof co.notix.lh
            if (r0 == 0) goto L13
            r0 = r8
            co.notix.lh r0 = (co.notix.lh) r0
            int r1 = r0.f12713e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12713e = r1
            goto L18
        L13:
            co.notix.lh r0 = new co.notix.lh
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f12711c
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12713e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            a.AbstractC0485a.A(r8)
            goto L6b
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.f12710b
            co.notix.mh r2 = r0.f12709a
            a.AbstractC0485a.A(r8)
            goto L4d
        L3a:
            a.AbstractC0485a.A(r8)
            r0.f12709a = r6
            r0.f12710b = r7
            r0.f12713e = r4
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r8 = Y7.B.g(r4, r0)
            if (r8 != r1) goto L4c
            goto L6a
        L4c:
            r2 = r6
        L4d:
            co.notix.vh r8 = r2.f12784a
            co.notix.kh r8 = r8.f13365a
            r2 = 0
            r0.f12709a = r2
            r0.f12710b = r2
            r0.f12713e = r3
            r8.getClass()
            f8.d r3 = Y7.K.f8774b
            co.notix.jh r4 = new co.notix.jh
            co.notix.yh r5 = r8.f12613d
            r4.<init>(r5, r8, r7, r2)
            java.lang.Object r7 = Y7.B.C(r3, r4, r0)
            if (r7 != r1) goto L6b
        L6a:
            return r1
        L6b:
            A7.n r7 = A7.n.f558a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.mh.emit(java.lang.Object, E7.d):java.lang.Object");
    }
}
