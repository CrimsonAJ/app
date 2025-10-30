package K2;

import C2.O;
import G2.g;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final O f4255a;

    /* renamed from: b, reason: collision with root package name */
    public final g f4256b;

    public b(O settingRepository, g contactUsMapper) {
        h.e(settingRepository, "settingRepository");
        h.e(contactUsMapper, "contactUsMapper");
        this.f4255a = settingRepository;
        this.f4256b = contactUsMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(G7.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof K2.a
            if (r0 == 0) goto L13
            r0 = r5
            K2.a r0 = (K2.a) r0
            int r1 = r0.f4254u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4254u = r1
            goto L18
        L13:
            K2.a r0 = new K2.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4252s
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f4254u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            K2.b r0 = r0.f4251r
            a.AbstractC0485a.A(r5)
            goto L4d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            a.AbstractC0485a.A(r5)
            r0.f4251r = r4
            r0.f4254u = r3
            C2.O r5 = r4.f4255a
            r5.getClass()
            o7.y r2 = E2.d.f1935a
            C2.I r2 = new C2.I
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
            if (r1 == 0) goto L88
            G2.g r0 = r0.f4256b
            v2.b r5 = (v2.C2102b) r5
            java.lang.Object r5 = r5.f23762a
            com.anilab.data.model.response.ContactUsResponse r5 = (com.anilab.data.model.response.ContactUsResponse) r5
            r0.getClass()
            java.lang.String r0 = "dto"
            kotlin.jvm.internal.h.e(r5, r0)
            H2.f r0 = new H2.f
            java.lang.String r1 = ""
            java.lang.String r2 = r5.f14059a
            if (r2 != 0) goto L79
            r2 = r1
        L79:
            java.lang.String r3 = r5.f14060b
            if (r3 != 0) goto L7e
            r3 = r1
        L7e:
            java.lang.String r5 = r5.f14061c
            if (r5 != 0) goto L83
            goto L84
        L83:
            r1 = r5
        L84:
            r0.<init>(r2, r3, r1)
            return r0
        L88:
            A7.b r5 = new A7.b
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.b.a(G7.c):java.lang.Object");
    }
}
