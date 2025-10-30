package M2;

import C2.C0057c;
import G2.n;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final C0057c f4776a;

    /* renamed from: b, reason: collision with root package name */
    public final n f4777b;

    public d(C0057c genreRepository, n genreMapper) {
        h.e(genreRepository, "genreRepository");
        h.e(genreMapper, "genreMapper");
        this.f4776a = genreRepository;
        this.f4777b = genreMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(G7.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof M2.c
            if (r0 == 0) goto L13
            r0 = r5
            M2.c r0 = (M2.c) r0
            int r1 = r0.f4775u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4775u = r1
            goto L18
        L13:
            M2.c r0 = new M2.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4773s
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f4775u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            M2.d r0 = r0.f4772r
            a.AbstractC0485a.A(r5)
            goto L4d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            a.AbstractC0485a.A(r5)
            r0.f4772r = r4
            r0.f4775u = r3
            C2.c r5 = r4.f4776a
            r5.getClass()
            o7.y r2 = E2.d.f1935a
            C2.b r2 = new C2.b
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
            if (r1 == 0) goto L72
            G2.n r0 = r0.f4777b
            v2.b r5 = (v2.C2102b) r5
            java.lang.Object r5 = r5.f23762a
            java.util.List r5 = (java.util.List) r5
            r0.getClass()
            java.util.List r5 = l6.AbstractC1570b.q(r0, r5)
            java.io.Serializable r5 = (java.io.Serializable) r5
            return r5
        L72:
            A7.b r5 = new A7.b
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.d.a(G7.c):java.io.Serializable");
    }
}
