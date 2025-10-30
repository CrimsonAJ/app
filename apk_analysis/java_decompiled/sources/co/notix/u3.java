package co.notix;

import b8.InterfaceC0726f;

/* loaded from: classes.dex */
public final class u3 implements InterfaceC0726f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c4 f13271a;

    public u3(c4 c4Var) {
        this.f13271a = c4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ac, code lost:
    
        if (Y7.B.g(3, r0) != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ae, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a1, code lost:
    
        if (((co.notix.l4) r11).a(r10, r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // b8.InterfaceC0726f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.util.List r10, E7.d r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof co.notix.t3
            if (r0 == 0) goto L13
            r0 = r11
            co.notix.t3 r0 = (co.notix.t3) r0
            int r1 = r0.f13207c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13207c = r1
            goto L18
        L13:
            co.notix.t3 r0 = new co.notix.t3
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f13205a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f13207c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            a.AbstractC0485a.A(r11)
            goto Laf
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            a.AbstractC0485a.A(r11)
            goto La4
        L37:
            a.AbstractC0485a.A(r11)
            co.notix.c4 r11 = r9.f13271a
            r11.getClass()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
        L48:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L69
            java.lang.Object r2 = r10.next()
            r5 = r2
            co.notix.t4 r5 = (co.notix.t4) r5
            long r5 = r5.f13211d
            long r7 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r7
            long r7 = co.notix.l4.f12672h
            long r5 = r5 - r7
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L48
            r11.add(r2)
            goto L48
        L69:
            int r10 = r11.size()
            co.notix.c4 r11 = r9.f13271a
            java.util.concurrent.ConcurrentHashMap r2 = r11.f11982i
            java.util.Collection r2 = r2.values()
            java.lang.String r5 = "loaders.values"
            kotlin.jvm.internal.h.d(r2, r5)
            java.lang.Comparable r2 = B7.k.x0(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L87
            int r2 = r2.intValue()
            goto L88
        L87:
            r2 = 0
        L88:
            boolean r11 = r11.j
            if (r11 == 0) goto L8d
            goto L91
        L8d:
            int r2 = java.lang.Math.min(r2, r4)
        L91:
            if (r10 >= r2) goto La4
            co.notix.c4 r10 = r9.f13271a
            co.notix.d4 r11 = r10.f11975b
            co.notix.o4 r10 = r10.f11974a
            r0.f13207c = r4
            co.notix.l4 r11 = (co.notix.l4) r11
            java.lang.Object r10 = r11.a(r10, r0)
            if (r10 != r1) goto La4
            goto Lae
        La4:
            r0.f13207c = r3
            r10 = 3
            java.lang.Object r10 = Y7.B.g(r10, r0)
            if (r10 != r1) goto Laf
        Lae:
            return r1
        Laf:
            A7.n r10 = A7.n.f558a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.u3.emit(java.util.List, E7.d):java.lang.Object");
    }
}
