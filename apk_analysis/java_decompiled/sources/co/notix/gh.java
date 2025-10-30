package co.notix;

import Y7.B;
import Y7.K;
import java.util.Set;

/* loaded from: classes.dex */
public final class gh implements dh {

    /* renamed from: a, reason: collision with root package name */
    public final ib f12324a;

    /* renamed from: b, reason: collision with root package name */
    public final xq f12325b;

    /* renamed from: c, reason: collision with root package name */
    public final y8 f12326c;

    /* renamed from: d, reason: collision with root package name */
    public final co f12327d;

    /* renamed from: e, reason: collision with root package name */
    public final O7.l f12328e;

    /* renamed from: f, reason: collision with root package name */
    public final O7.l f12329f;

    public gh(ib httpClient, xq storage, d9 contextProvider, co requestBodyInstanceInfoFiller, uq getDomains, vq getCachedDomains) {
        kotlin.jvm.internal.h.e(httpClient, "httpClient");
        kotlin.jvm.internal.h.e(storage, "storage");
        kotlin.jvm.internal.h.e(contextProvider, "contextProvider");
        kotlin.jvm.internal.h.e(requestBodyInstanceInfoFiller, "requestBodyInstanceInfoFiller");
        kotlin.jvm.internal.h.e(getDomains, "getDomains");
        kotlin.jvm.internal.h.e(getCachedDomains, "getCachedDomains");
        this.f12324a = httpClient;
        this.f12325b = storage;
        this.f12326c = contextProvider;
        this.f12327d = requestBodyInstanceInfoFiller;
        this.f12328e = getDomains;
        this.f12329f = getCachedDomains;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(co.notix.gh r4, java.lang.String r5, java.util.Map r6, co.notix.kb r7, java.util.Set r8, O7.l r9, E7.d r10) {
        /*
            r4.getClass()
            boolean r0 = r10 instanceof co.notix.fh
            if (r0 == 0) goto L16
            r0 = r10
            co.notix.fh r0 = (co.notix.fh) r0
            int r1 = r0.f12261e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f12261e = r1
            goto L1b
        L16:
            co.notix.fh r0 = new co.notix.fh
            r0.<init>(r4, r10)
        L1b:
            java.lang.Object r10 = r0.f12259c
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12261e
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            O7.l r9 = r0.f12258b
            java.util.Set r8 = r0.f12257a
            a.AbstractC0485a.A(r10)     // Catch: java.lang.Throwable -> L77
            goto L53
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            a.AbstractC0485a.A(r10)
            co.notix.ib r4 = r4.f12324a     // Catch: java.lang.Throwable -> L77
            r0.f12257a = r8     // Catch: java.lang.Throwable -> L77
            r0.f12258b = r9     // Catch: java.lang.Throwable -> L77
            r0.f12261e = r3     // Catch: java.lang.Throwable -> L77
            r4.getClass()     // Catch: java.lang.Throwable -> L77
            f8.d r4 = Y7.K.f8774b     // Catch: java.lang.Throwable -> L77
            co.notix.hb r10 = new co.notix.hb     // Catch: java.lang.Throwable -> L77
            r2 = 0
            r10.<init>(r5, r6, r7, r2)     // Catch: java.lang.Throwable -> L77
            java.lang.Object r10 = Y7.B.C(r4, r10, r0)     // Catch: java.lang.Throwable -> L77
            if (r10 != r1) goto L53
            return r1
        L53:
            co.notix.lb r10 = (co.notix.lb) r10     // Catch: java.lang.Throwable -> L77
            co.notix.io r4 = co.notix.io.BAD_STATUS_CODE     // Catch: java.lang.Throwable -> L77
            boolean r4 = r8.contains(r4)     // Catch: java.lang.Throwable -> L77
            if (r4 == 0) goto L70
            int r4 = r10.f12700a     // Catch: java.lang.Throwable -> L77
            r5 = 200(0xc8, float:2.8E-43)
            if (r5 > r4) goto L68
            r5 = 300(0x12c, float:4.2E-43)
            if (r4 >= r5) goto L68
            goto L70
        L68:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L77
            java.lang.String r5 = "bad status code"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L77
            throw r4     // Catch: java.lang.Throwable -> L77
        L70:
            java.lang.String r4 = r10.f12701b     // Catch: java.lang.Throwable -> L77
            java.lang.Object r4 = r9.invoke(r4)     // Catch: java.lang.Throwable -> L77
            return r4
        L77:
            r4 = move-exception
            A7.i r4 = a.AbstractC0485a.h(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.gh.a(co.notix.gh, java.lang.String, java.util.Map, co.notix.kb, java.util.Set, O7.l, E7.d):java.lang.Object");
    }

    public final Object a(int i9, String str, boolean z9, Cdo cdo, O7.l lVar, no noVar, Set set, E7.d dVar) {
        return B.C(K.f8774b, new eh(cdo, this, i9, str, z9, set, lVar, noVar, null), dVar);
    }
}
