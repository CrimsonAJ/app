package co.notix;

import b8.InterfaceC0726f;

/* loaded from: classes.dex */
public final class g5 implements InterfaceC0726f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0726f f12295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o4 f12296b;

    public g5(InterfaceC0726f interfaceC0726f, o4 o4Var) {
        this.f12295a = interfaceC0726f;
        this.f12296b = o4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r2v1, types: [B7.t] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    @Override // b8.InterfaceC0726f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r8, E7.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof co.notix.f5
            if (r0 == 0) goto L13
            r0 = r9
            co.notix.f5 r0 = (co.notix.f5) r0
            int r1 = r0.f12230b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12230b = r1
            goto L18
        L13:
            co.notix.f5 r0 = new co.notix.f5
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f12229a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12230b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0485a.A(r9)
            goto L67
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            a.AbstractC0485a.A(r9)
            b8.f r9 = r7.f12295a
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L5c
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L41:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L5e
            java.lang.Object r4 = r8.next()
            r5 = r4
            co.notix.t4 r5 = (co.notix.t4) r5
            co.notix.o4 r5 = r5.f13209b
            co.notix.o4 r6 = r7.f12296b
            boolean r5 = kotlin.jvm.internal.h.a(r5, r6)
            if (r5 == 0) goto L41
            r2.add(r4)
            goto L41
        L5c:
            B7.t r2 = B7.t.f1135a
        L5e:
            r0.f12230b = r3
            java.lang.Object r8 = r9.emit(r2, r0)
            if (r8 != r1) goto L67
            return r1
        L67:
            A7.n r8 = A7.n.f558a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.g5.emit(java.lang.Object, E7.d):java.lang.Object");
    }
}
