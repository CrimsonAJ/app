package co.notix;

import b8.InterfaceC0726f;
import co.notix.banner.NotixBannerView;

/* loaded from: classes.dex */
public final class bg implements InterfaceC0726f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0726f f11932a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NotixBannerView f11933b;

    public bg(InterfaceC0726f interfaceC0726f, NotixBannerView notixBannerView) {
        this.f11932a = interfaceC0726f;
        this.f11933b = notixBannerView;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // b8.InterfaceC0726f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r9, E7.d r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof co.notix.ag
            if (r0 == 0) goto L13
            r0 = r10
            co.notix.ag r0 = (co.notix.ag) r0
            int r1 = r0.f11847b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11847b = r1
            goto L18
        L13:
            co.notix.ag r0 = new co.notix.ag
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f11846a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f11847b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0485a.A(r10)
            goto L58
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            a.AbstractC0485a.A(r10)
            b8.f r10 = r8.f11932a
            r2 = r9
            java.lang.Number r2 = (java.lang.Number) r2
            long r4 = r2.longValue()
            co.notix.banner.NotixBannerView r2 = r8.f11933b
            co.notix.banner.BannerRequest r2 = co.notix.banner.NotixBannerView.access$getRequest$p(r2)
            if (r2 == 0) goto L48
            long r6 = r2.getRefreshIntervalMillis()
            goto L4b
        L48:
            r6 = 60000(0xea60, double:2.9644E-319)
        L4b:
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L58
            r0.f11847b = r3
            java.lang.Object r9 = r10.emit(r9, r0)
            if (r9 != r1) goto L58
            return r1
        L58:
            A7.n r9 = A7.n.f558a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.bg.emit(java.lang.Object, E7.d):java.lang.Object");
    }
}
