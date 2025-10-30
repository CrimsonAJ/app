package co.notix;

import Y7.InterfaceC0484z;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class di {

    /* renamed from: a, reason: collision with root package name */
    public final y8 f12100a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0484z f12101b;

    /* renamed from: c, reason: collision with root package name */
    public final ic f12102c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f12103d;

    /* renamed from: e, reason: collision with root package name */
    public final g8.a f12104e;

    public di(d9 contextProvider, InterfaceC0484z csIo, ic json) {
        kotlin.jvm.internal.h.e(contextProvider, "contextProvider");
        kotlin.jvm.internal.h.e(csIo, "csIo");
        kotlin.jvm.internal.h.e(json, "json");
        this.f12100a = contextProvider;
        this.f12101b = csIo;
        this.f12102c = json;
        this.f12103d = new LinkedHashMap();
        this.f12104e = g8.e.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[Catch: all -> 0x0068, TRY_LEAVE, TryCatch #0 {all -> 0x0068, blocks: (B:12:0x004d, B:14:0x0057), top: B:11:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, E7.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof co.notix.ci
            if (r0 == 0) goto L13
            r0 = r8
            co.notix.ci r0 = (co.notix.ci) r0
            int r1 = r0.f12039f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12039f = r1
            goto L18
        L13:
            co.notix.ci r0 = new co.notix.ci
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f12037d
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12039f
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            g8.a r7 = r0.f12036c
            java.lang.String r1 = r0.f12035b
            co.notix.di r0 = r0.f12034a
            a.AbstractC0485a.A(r8)
            r8 = r7
            r7 = r1
            goto L4c
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            a.AbstractC0485a.A(r8)
            g8.a r8 = r6.f12104e
            r0.f12034a = r6
            r0.f12035b = r7
            r0.f12036c = r8
            r0.f12039f = r3
            java.lang.Object r0 = r8.d(r0)
            if (r0 != r1) goto L4b
            return r1
        L4b:
            r0 = r6
        L4c:
            r1 = 0
            java.util.LinkedHashMap r2 = r0.f12103d     // Catch: java.lang.Throwable -> L68
            java.lang.Object r2 = r2.get(r7)     // Catch: java.lang.Throwable -> L68
            co.notix.yh r2 = (co.notix.yh) r2     // Catch: java.lang.Throwable -> L68
            if (r2 != 0) goto L6a
            co.notix.yh r2 = new co.notix.yh     // Catch: java.lang.Throwable -> L68
            co.notix.y8 r3 = r0.f12100a     // Catch: java.lang.Throwable -> L68
            Y7.z r4 = r0.f12101b     // Catch: java.lang.Throwable -> L68
            co.notix.ic r5 = r0.f12102c     // Catch: java.lang.Throwable -> L68
            r2.<init>(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L68
            java.util.LinkedHashMap r0 = r0.f12103d     // Catch: java.lang.Throwable -> L68
            r0.put(r7, r2)     // Catch: java.lang.Throwable -> L68
            goto L6a
        L68:
            r7 = move-exception
            goto L6e
        L6a:
            r8.a(r1)
            return r2
        L6e:
            r8.a(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.di.a(java.lang.String, E7.d):java.lang.Object");
    }
}
