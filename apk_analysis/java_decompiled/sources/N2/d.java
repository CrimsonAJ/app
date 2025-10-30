package N2;

import C2.C0059e;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final C0059e f4899a;

    public d(C0059e malRepository) {
        h.e(malRepository, "malRepository");
        this.f4899a = malRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(java.lang.String r8, G7.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof N2.c
            if (r0 == 0) goto L13
            r0 = r9
            N2.c r0 = (N2.c) r0
            int r1 = r0.f4898t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4898t = r1
            goto L18
        L13:
            N2.c r0 = new N2.c
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f4896r
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f4898t
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            a.AbstractC0485a.A(r9)
            goto L48
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            a.AbstractC0485a.A(r9)
            r0.f4898t = r3
            C2.e r9 = r7.f4899a
            r9.getClass()
            o7.y r2 = E2.d.f1935a
            C2.d r2 = new C2.d
            r2.<init>(r9, r8, r4)
            java.lang.Object r9 = E2.d.a(r2, r0)
            if (r9 != r1) goto L48
            return r1
        L48:
            v2.c r9 = (v2.AbstractC2103c) r9
            boolean r8 = r9 instanceof v2.C2102b
            if (r8 == 0) goto L94
            v2.b r9 = (v2.C2102b) r9
            java.lang.Object r8 = r9.f23762a
            com.anilab.data.model.response.MalResponse r8 = (com.anilab.data.model.response.MalResponse) r8
            java.util.List r8 = r8.f14224a
            java.util.ArrayList r9 = new java.util.ArrayList
            r0 = 10
            int r0 = B7.m.f0(r8, r0)
            r9.<init>(r0)
            java.util.Iterator r8 = r8.iterator()
        L65:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L93
            java.lang.Object r0 = r8.next()
            com.anilab.data.model.response.MalDataResponse r0 = (com.anilab.data.model.response.MalDataResponse) r0
            H2.p r1 = new H2.p
            com.anilab.data.model.response.MalListStatusResponse r2 = r0.f14205a
            if (r2 == 0) goto L7f
            java.lang.Integer r3 = new java.lang.Integer
            int r2 = r2.f14213a
            r3.<init>(r2)
            goto L80
        L7f:
            r3 = r4
        L80:
            com.anilab.data.model.response.MalListStatusResponse r2 = r0.f14205a
            if (r2 == 0) goto L87
            java.lang.String r2 = r2.f14214b
            goto L88
        L87:
            r2 = r4
        L88:
            com.anilab.data.model.response.MalNodeResponse r0 = r0.f14206b
            long r5 = r0.f14218a
            r1.<init>(r3, r2, r5)
            r9.add(r1)
            goto L65
        L93:
            return r9
        L94:
            boolean r8 = r9 instanceof v2.C2101a
            if (r8 == 0) goto La1
            v2.a r9 = (v2.C2101a) r9
            java.lang.Throwable r8 = r9.f23761a
            A7.i r8 = a.AbstractC0485a.h(r8)
            return r8
        La1:
            A7.b r8 = new A7.b
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.d.a(java.lang.String, G7.c):java.io.Serializable");
    }
}
