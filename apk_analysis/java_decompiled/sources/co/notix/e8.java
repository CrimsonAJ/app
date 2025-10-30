package co.notix;

/* loaded from: classes.dex */
public final class e8 extends t8 {

    /* renamed from: a, reason: collision with root package name */
    public final ma f12146a;

    public e8(ma eventRepository) {
        kotlin.jvm.internal.h.e(eventRepository, "eventRepository");
        this.f12146a = eventRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(co.notix.f8 r7, E7.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof co.notix.d8
            if (r0 == 0) goto L13
            r0 = r8
            co.notix.d8 r0 = (co.notix.d8) r0
            int r1 = r0.f12076c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12076c = r1
            goto L18
        L13:
            co.notix.d8 r0 = new co.notix.d8
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f12074a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12076c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0485a.A(r8)
            goto L4b
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            a.AbstractC0485a.A(r8)
            co.notix.ma r8 = r6.f12146a
            java.lang.String r7 = r7.f12233a
            r0.f12076c = r3
            Y7.z r2 = r8.f12772c
            E7.i r2 = r2.g()
            co.notix.ja r4 = new co.notix.ja
            r5 = 0
            r4.<init>(r8, r7, r5)
            java.lang.Object r8 = Y7.B.C(r2, r4, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 != r3) goto L56
            co.notix.v8 r7 = co.notix.v8.SUCCESS
            return r7
        L56:
            if (r7 != 0) goto L5b
            co.notix.v8 r7 = co.notix.v8.RETRY
            return r7
        L5b:
            A7.b r7 = new A7.b
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.e8.a(co.notix.f8, E7.d):java.lang.Object");
    }

    @Override // co.notix.t8
    public final /* bridge */ /* synthetic */ Object a(u8 u8Var, mj mjVar) {
        return a((f8) u8Var, (E7.d) mjVar);
    }
}
