package co.notix;

import Y7.B;
import Y7.InterfaceC0484z;
import Y7.K;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c8 implements t7 {

    /* renamed from: f, reason: collision with root package name */
    public static final fb f11988f = fb.f12237d;

    /* renamed from: g, reason: collision with root package name */
    public static final long f11989g = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final y8 f11990a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0484z f11991b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.e f11992c;

    /* renamed from: d, reason: collision with root package name */
    public final g8.a f11993d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f11994e;

    public c8(d9 contextProvider, InterfaceC0484z csIo) {
        kotlin.jvm.internal.h.e(contextProvider, "contextProvider");
        kotlin.jvm.internal.h.e(csIo, "csIo");
        this.f11990a = contextProvider;
        this.f11991b = csIo;
        this.f11992c = Z0.a.q(new x7(this));
        this.f11993d = g8.e.a();
        this.f11994e = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(co.notix.c8 r5, java.lang.String r6, E7.d r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof co.notix.a8
            if (r0 == 0) goto L16
            r0 = r7
            co.notix.a8 r0 = (co.notix.a8) r0
            int r1 = r0.f11829c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f11829c = r1
            goto L1b
        L16:
            co.notix.a8 r0 = new co.notix.a8
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.f11827a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f11829c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            a.AbstractC0485a.A(r7)
            goto L46
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            a.AbstractC0485a.A(r7)
            f8.d r7 = Y7.K.f8774b
            co.notix.b8 r2 = new co.notix.b8
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f11829c = r3
            java.lang.Object r7 = Y7.B.C(r7, r2, r0)
            if (r7 != r1) goto L46
            return r1
        L46:
            java.lang.String r5 = "private suspend fun getC…tream(it)\n        }\n    }"
            kotlin.jvm.internal.h.d(r7, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.c8.a(co.notix.c8, java.lang.String, E7.d):java.lang.Object");
    }

    public final Object a(String str, no noVar, E7.d dVar) {
        return B.C(K.f8774b, new z7(this, str, noVar, null), dVar);
    }
}
