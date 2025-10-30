package co.notix;

/* loaded from: classes.dex */
public final class nb extends t8 {

    /* renamed from: a, reason: collision with root package name */
    public final ma f12814a;

    public nb(ma eventRepository) {
        kotlin.jvm.internal.h.e(eventRepository, "eventRepository");
        this.f12814a = eventRepository;
    }

    @Override // co.notix.t8
    public final /* bridge */ /* synthetic */ Object a(u8 u8Var, mj mjVar) {
        return a((ob) u8Var, (E7.d) mjVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(co.notix.ob r8, E7.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof co.notix.mb
            if (r0 == 0) goto L13
            r0 = r9
            co.notix.mb r0 = (co.notix.mb) r0
            int r1 = r0.f12775c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12775c = r1
            goto L18
        L13:
            co.notix.mb r0 = new co.notix.mb
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f12773a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12775c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0485a.A(r9)
            goto L4d
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            a.AbstractC0485a.A(r9)
            co.notix.ma r9 = r7.f12814a
            java.lang.String r2 = r8.f12876a
            co.notix.d3 r8 = r8.f12877b
            r0.f12775c = r3
            Y7.z r4 = r9.f12772c
            E7.i r4 = r4.g()
            co.notix.la r5 = new co.notix.la
            r6 = 0
            r5.<init>(r9, r2, r8, r6)
            java.lang.Object r9 = Y7.B.C(r4, r5, r0)
            if (r9 != r1) goto L4d
            return r1
        L4d:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            if (r8 != r3) goto L58
            co.notix.v8 r8 = co.notix.v8.SUCCESS
            return r8
        L58:
            if (r8 != 0) goto L5d
            co.notix.v8 r8 = co.notix.v8.RETRY
            return r8
        L5d:
            A7.b r8 = new A7.b
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.nb.a(co.notix.ob, E7.d):java.lang.Object");
    }
}
