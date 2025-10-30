package co.notix;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class hl extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public kl f12396a;

    /* renamed from: b, reason: collision with root package name */
    public we f12397b;

    /* renamed from: c, reason: collision with root package name */
    public int f12398c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f12399d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kl f12400e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f12401f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl(kl klVar, String str, E7.d dVar) {
        super(2, dVar);
        this.f12400e = klVar;
        this.f12401f = str;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        hl hlVar = new hl(this.f12400e, this.f12401f, dVar);
        hlVar.f12399d = obj;
        return hlVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((hl) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r6.f12398c
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L30
            if (r1 == r4) goto L28
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            co.notix.we r0 = r6.f12397b
            co.notix.kl r1 = r6.f12396a
            java.lang.Object r2 = r6.f12399d
            a.AbstractC0485a.A(r7)
            goto L90
        L1a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L22:
            a.AbstractC0485a.A(r7)     // Catch: java.lang.Throwable -> L26
            goto L61
        L26:
            r7 = move-exception
            goto L64
        L28:
            java.lang.Object r1 = r6.f12399d
            co.notix.el r1 = (co.notix.el) r1
            a.AbstractC0485a.A(r7)     // Catch: java.lang.Throwable -> L26
            goto L49
        L30:
            a.AbstractC0485a.A(r7)
            java.lang.Object r7 = r6.f12399d
            Y7.z r7 = (Y7.InterfaceC0484z) r7
            co.notix.kl r7 = r6.f12400e
            java.lang.String r1 = r6.f12401f
            co.notix.el r5 = r7.f12619a     // Catch: java.lang.Throwable -> L26
            r6.f12399d = r5     // Catch: java.lang.Throwable -> L26
            r6.f12398c = r4     // Catch: java.lang.Throwable -> L26
            java.lang.Object r7 = co.notix.kl.a(r7, r1, r6)     // Catch: java.lang.Throwable -> L26
            if (r7 != r0) goto L48
            goto L8d
        L48:
            r1 = r5
        L49:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L26
            r4 = 0
            r6.f12399d = r4     // Catch: java.lang.Throwable -> L26
            r6.f12398c = r3     // Catch: java.lang.Throwable -> L26
            r1.getClass()     // Catch: java.lang.Throwable -> L26
            f8.d r3 = Y7.K.f8774b     // Catch: java.lang.Throwable -> L26
            co.notix.dl r5 = new co.notix.dl     // Catch: java.lang.Throwable -> L26
            r5.<init>(r1, r7, r4)     // Catch: java.lang.Throwable -> L26
            java.lang.Object r7 = Y7.B.C(r3, r5, r6)     // Catch: java.lang.Throwable -> L26
            if (r7 != r0) goto L61
            goto L8d
        L61:
            co.notix.we r7 = (co.notix.we) r7     // Catch: java.lang.Throwable -> L26
            goto L68
        L64:
            A7.i r7 = a.AbstractC0485a.h(r7)
        L68:
            co.notix.kl r1 = r6.f12400e
            boolean r3 = r7 instanceof A7.i
            if (r3 != 0) goto La1
            r3 = r7
            co.notix.we r3 = (co.notix.we) r3
            co.notix.kd r4 = co.notix.md.f12779a
            r4.getClass()
            co.notix.x8 r4 = r4.f12607b
            java.lang.String r5 = "getPushData success"
            r4.b(r5)
            co.notix.l2 r4 = r1.f12626h
            r6.f12399d = r7
            r6.f12396a = r1
            r6.f12397b = r3
            r6.f12398c = r2
            java.lang.Object r2 = r4.e(r6)
            if (r2 != r0) goto L8e
        L8d:
            return r0
        L8e:
            r2 = r7
            r0 = r3
        L90:
            co.notix.og r7 = r1.f12624f
            co.notix.callback.NotixCallback$PushDataLoad r1 = new co.notix.callback.NotixCallback$PushDataLoad
            co.notix.callback.NotixCallbackStatus r3 = co.notix.callback.NotixCallbackStatus.SUCCESS
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.<init>(r3, r0)
            r7.a(r1)
            r7 = r2
        La1:
            java.lang.String r0 = r6.f12401f
            co.notix.kl r1 = r6.f12400e
            java.lang.Throwable r2 = A7.j.a(r7)
            if (r2 == 0) goto Lce
            co.notix.kd r3 = co.notix.md.f12779a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "getPushData failure pingData = "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            co.notix.yn.a(r3, r0, r2)
            co.notix.og r0 = r1.f12624f
            co.notix.callback.NotixCallback$PushDataLoad r1 = new co.notix.callback.NotixCallback$PushDataLoad
            co.notix.callback.NotixCallbackStatus r3 = co.notix.callback.NotixCallbackStatus.FAILURE
            java.lang.String r2 = r2.getMessage()
            r1.<init>(r3, r2)
            r0.a(r1)
        Lce:
            A7.j r0 = new A7.j
            r0.<init>(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.hl.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
