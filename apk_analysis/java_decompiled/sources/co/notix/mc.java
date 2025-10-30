package co.notix;

import Y7.InterfaceC0484z;
import co.notix.lsi.LockScreenInterstitialActivity;

/* loaded from: classes.dex */
public final class mc extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f12776a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LockScreenInterstitialActivity f12777b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f12778c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc(LockScreenInterstitialActivity lockScreenInterstitialActivity, long j, E7.d dVar) {
        super(2, dVar);
        this.f12777b = lockScreenInterstitialActivity;
        this.f12778c = j;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new mc(this.f12777b, this.f12778c, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((mc) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (r8 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0035, code lost:
    
        if (b8.AbstractC0714M.l(r5, r1, r7) == r0) goto L15;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r7.f12776a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L19
            if (r1 != r3) goto L11
            a.AbstractC0485a.A(r8)
            goto L45
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L19:
            a.AbstractC0485a.A(r8)
            goto L38
        L1d:
            a.AbstractC0485a.A(r8)
            co.notix.lsi.LockScreenInterstitialActivity r8 = r7.f12777b
            b8.E r1 = r8.f12742C
            X.t r5 = new X.t
            r6 = 1
            r5.<init>(r1, r6)
            co.notix.lc r1 = new co.notix.lc
            r1.<init>(r8, r2)
            r7.f12776a = r4
            java.lang.Object r8 = b8.AbstractC0714M.l(r5, r1, r7)
            if (r8 != r0) goto L38
            goto L44
        L38:
            co.notix.lsi.LockScreenInterstitialActivity r8 = r7.f12777b
            co.notix.mq r8 = r8.f12740A
            r7.f12776a = r3
            java.lang.Object r8 = r8.d(r7)
            if (r8 != r0) goto L45
        L44:
            return r0
        L45:
            co.notix.mp r8 = (co.notix.mp) r8
            if (r8 == 0) goto L4b
            java.lang.Long r2 = r8.f12797b
        L4b:
            co.notix.lsi.LockScreenInterstitialActivity r8 = r7.f12777b
            if (r2 == 0) goto L54
            long r0 = r2.longValue()
            goto L56
        L54:
            long r0 = r7.f12778c
        L56:
            co.notix.lsi.LockScreenInterstitialActivity.a(r8, r0)
            A7.n r8 = A7.n.f558a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.mc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
