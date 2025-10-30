package co.notix;

import b8.InterfaceC0726f;

/* loaded from: classes.dex */
public final class h4 implements InterfaceC0726f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0726f f12354a;

    public h4(InterfaceC0726f interfaceC0726f) {
        this.f12354a = interfaceC0726f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // b8.InterfaceC0726f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r10, E7.d r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof co.notix.g4
            if (r0 == 0) goto L13
            r0 = r11
            co.notix.g4 r0 = (co.notix.g4) r0
            int r1 = r0.f12293b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12293b = r1
            goto L18
        L13:
            co.notix.g4 r0 = new co.notix.g4
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f12292a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12293b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0485a.A(r11)
            goto L63
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2f:
            a.AbstractC0485a.A(r11)
            b8.f r11 = r9.f12354a
            java.util.List r10 = (java.util.List) r10
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r10 = r10.iterator()
        L3f:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L5a
            java.lang.Object r4 = r10.next()
            r5 = r4
            co.notix.t4 r5 = (co.notix.t4) r5
            long r5 = r5.f13211d
            long r7 = java.lang.System.currentTimeMillis()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L3f
            r2.add(r4)
            goto L3f
        L5a:
            r0.f12293b = r3
            java.lang.Object r10 = r11.emit(r2, r0)
            if (r10 != r1) goto L63
            return r1
        L63:
            A7.n r10 = A7.n.f558a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.h4.emit(java.lang.Object, E7.d):java.lang.Object");
    }
}
