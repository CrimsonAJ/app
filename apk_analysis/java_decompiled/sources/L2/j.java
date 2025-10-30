package L2;

import C2.O;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final O f4606a;

    /* renamed from: b, reason: collision with root package name */
    public final G2.i f4607b;

    public j(O settingRepository, G2.i downloaderMapper) {
        kotlin.jvm.internal.h.e(settingRepository, "settingRepository");
        kotlin.jvm.internal.h.e(downloaderMapper, "downloaderMapper");
        this.f4606a = settingRepository;
        this.f4607b = downloaderMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(G7.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof L2.i
            if (r0 == 0) goto L13
            r0 = r5
            L2.i r0 = (L2.i) r0
            int r1 = r0.f4605u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4605u = r1
            goto L18
        L13:
            L2.i r0 = new L2.i
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4603s
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f4605u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            L2.j r0 = r0.f4602r
            a.AbstractC0485a.A(r5)
            goto L4d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            a.AbstractC0485a.A(r5)
            r0.f4602r = r4
            r0.f4605u = r3
            C2.O r5 = r4.f4606a
            r5.getClass()
            o7.y r2 = E2.d.f1935a
            C2.J r2 = new C2.J
            r3 = 0
            r2.<init>(r5, r3)
            java.lang.Object r5 = E2.d.a(r2, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            r0 = r4
        L4d:
            v2.c r5 = (v2.AbstractC2103c) r5
            boolean r1 = r5 instanceof v2.C2101a
            if (r1 == 0) goto L5c
            v2.a r5 = (v2.C2101a) r5
            java.lang.Throwable r5 = r5.f23761a
            A7.i r5 = a.AbstractC0485a.h(r5)
            return r5
        L5c:
            boolean r1 = r5 instanceof v2.C2102b
            if (r1 == 0) goto L70
            G2.i r0 = r0.f4607b
            v2.b r5 = (v2.C2102b) r5
            java.lang.Object r5 = r5.f23762a
            com.anilab.data.model.response.DownloaderResponse r5 = (com.anilab.data.model.response.DownloaderResponse) r5
            r0.getClass()
            H2.h r5 = G2.i.a(r5)
            return r5
        L70:
            A7.b r5 = new A7.b
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.j.a(G7.c):java.lang.Object");
    }
}
