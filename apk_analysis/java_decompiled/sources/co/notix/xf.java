package co.notix;

import Y7.InterfaceC0484z;
import co.notix.banner.NotixBannerView;

/* loaded from: classes.dex */
public final class xf extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f13522a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ boolean f13523b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0484z f13524c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ NotixBannerView f13525d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf(InterfaceC0484z interfaceC0484z, NotixBannerView notixBannerView, E7.d dVar) {
        super(2, dVar);
        this.f13524c = interfaceC0484z;
        this.f13525d = notixBannerView;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        xf xfVar = new xf(this.f13524c, this.f13525d, dVar);
        xfVar.f13523b = ((Boolean) obj).booleanValue();
        return xfVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((xf) create(bool, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x001c, code lost:
    
        if (r9.f13523b == false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003f -> B:5:0x0042). Please report as a decompilation issue!!! */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r9.f13522a
            A7.n r2 = A7.n.f558a
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            a.AbstractC0485a.A(r10)
            goto L42
        Lf:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L17:
            a.AbstractC0485a.A(r10)
            boolean r10 = r9.f13523b
            if (r10 != 0) goto L1f
            goto L66
        L1f:
            Y7.z r10 = r9.f13524c
            E7.i r10 = r10.g()
            Y7.g0 r1 = Y7.C0463g0.f8811a
            E7.g r10 = r10.get(r1)
            Y7.h0 r10 = (Y7.InterfaceC0465h0) r10
            if (r10 == 0) goto L34
            boolean r10 = r10.a()
            goto L35
        L34:
            r10 = r3
        L35:
            if (r10 == 0) goto L66
            r9.f13522a = r3
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r10 = Y7.B.g(r4, r9)
            if (r10 != r0) goto L42
            return r0
        L42:
            co.notix.banner.NotixBannerView r10 = r9.f13525d
            b8.F r10 = co.notix.banner.NotixBannerView.access$getTimeVisibleF$p(r10)
        L48:
            r1 = r10
            b8.Q r1 = (b8.C0718Q) r1
            java.lang.Object r4 = r1.h()
            r5 = r4
            java.lang.Number r5 = (java.lang.Number) r5
            long r5 = r5.longValue()
            r7 = 1000(0x3e8, float:1.401E-42)
            long r7 = (long) r7
            long r5 = r5 + r7
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r5)
            boolean r1 = r1.g(r4, r7)
            if (r1 == 0) goto L48
            goto L1f
        L66:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.xf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
