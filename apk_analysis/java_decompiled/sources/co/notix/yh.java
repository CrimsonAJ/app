package co.notix;

import Y7.InterfaceC0484z;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class yh {

    /* renamed from: a */
    public final y8 f13607a;

    /* renamed from: b */
    public final InterfaceC0484z f13608b;

    /* renamed from: c */
    public final ic f13609c;

    /* renamed from: d */
    public final String f13610d;

    /* renamed from: e */
    public final A7.e f13611e;

    /* renamed from: f */
    public final g8.a f13612f;

    /* renamed from: g */
    public final g8.a f13613g;

    /* renamed from: h */
    public final LinkedHashMap f13614h;

    public yh(y8 contextProvider, InterfaceC0484z csIo, ic json, String name) {
        kotlin.jvm.internal.h.e(contextProvider, "contextProvider");
        kotlin.jvm.internal.h.e(csIo, "csIo");
        kotlin.jvm.internal.h.e(json, "json");
        kotlin.jvm.internal.h.e(name, "name");
        this.f13607a = contextProvider;
        this.f13608b = csIo;
        this.f13609c = json;
        this.f13610d = name;
        this.f13611e = Z0.a.q(new wh(this));
        this.f13612f = g8.e.a();
        this.f13613g = g8.e.a();
        this.f13614h = new LinkedHashMap();
    }

    public static final /* synthetic */ InterfaceC0484z a(yh yhVar) {
        return yhVar.f13608b;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083 A[Catch: all -> 0x00b8, TRY_LEAVE, TryCatch #0 {all -> 0x00b8, blocks: (B:26:0x0078, B:29:0x0083), top: B:25:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, O7.l r8, O7.l r9, E7.d r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof co.notix.xh
            if (r0 == 0) goto L13
            r0 = r10
            co.notix.xh r0 = (co.notix.xh) r0
            int r1 = r0.f13536h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13536h = r1
            goto L18
        L13:
            co.notix.xh r0 = new co.notix.xh
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f13534f
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f13536h
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L5e
            if (r2 == r4) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r7 = r0.f13533e
            co.notix.yh r7 = (co.notix.yh) r7
            java.lang.Object r8 = r0.f13532d
            co.notix.kh r8 = (co.notix.kh) r8
            java.lang.Object r9 = r0.f13531c
            g8.a r9 = (g8.a) r9
            java.lang.String r1 = r0.f13530b
            co.notix.yh r0 = r0.f13529a
            a.AbstractC0485a.A(r10)     // Catch: java.lang.Throwable -> L3c
            goto La9
        L3c:
            r7 = move-exception
            goto Lba
        L3f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L47:
            java.lang.Object r7 = r0.f13533e
            g8.a r7 = (g8.a) r7
            java.lang.Object r8 = r0.f13532d
            r9 = r8
            O7.l r9 = (O7.l) r9
            java.lang.Object r8 = r0.f13531c
            O7.l r8 = (O7.l) r8
            java.lang.String r2 = r0.f13530b
            co.notix.yh r4 = r0.f13529a
            a.AbstractC0485a.A(r10)
            r10 = r7
            r7 = r4
            goto L78
        L5e:
            a.AbstractC0485a.A(r10)
            g8.a r10 = r6.f13613g
            r0.f13529a = r6
            r0.f13530b = r7
            r0.f13531c = r8
            r0.f13532d = r9
            r0.f13533e = r10
            r0.f13536h = r4
            java.lang.Object r2 = r10.d(r0)
            if (r2 != r1) goto L76
            goto La3
        L76:
            r2 = r7
            r7 = r6
        L78:
            java.util.LinkedHashMap r4 = r7.f13614h     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> Lb8
            co.notix.vh r4 = (co.notix.vh) r4     // Catch: java.lang.Throwable -> Lb8
            if (r4 == 0) goto L83
            goto Lb4
        L83:
            co.notix.kh r4 = new co.notix.kh     // Catch: java.lang.Throwable -> Lb8
            r4.<init>(r7, r2, r8, r9)     // Catch: java.lang.Throwable -> Lb8
            r0.f13529a = r7     // Catch: java.lang.Throwable -> Lb8
            r0.f13530b = r2     // Catch: java.lang.Throwable -> Lb8
            r0.f13531c = r10     // Catch: java.lang.Throwable -> Lb8
            r0.f13532d = r4     // Catch: java.lang.Throwable -> Lb8
            r0.f13533e = r7     // Catch: java.lang.Throwable -> Lb8
            r0.f13536h = r3     // Catch: java.lang.Throwable -> Lb8
            f8.d r8 = Y7.K.f8774b     // Catch: java.lang.Throwable -> Lb8
            co.notix.ih r9 = new co.notix.ih     // Catch: java.lang.Throwable -> Lb8
            co.notix.yh r3 = r4.f12613d     // Catch: java.lang.Throwable -> Lb8
            r9.<init>(r3, r4, r5)     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r8 = Y7.B.C(r8, r9, r0)     // Catch: java.lang.Throwable -> Lb8
            if (r8 != r1) goto La4
        La3:
            return r1
        La4:
            r0 = r7
            r9 = r10
            r1 = r2
            r10 = r8
            r8 = r4
        La9:
            co.notix.vh r4 = new co.notix.vh     // Catch: java.lang.Throwable -> L3c
            r4.<init>(r7, r8, r10)     // Catch: java.lang.Throwable -> L3c
            java.util.LinkedHashMap r7 = r0.f13614h     // Catch: java.lang.Throwable -> L3c
            r7.put(r1, r4)     // Catch: java.lang.Throwable -> L3c
            r10 = r9
        Lb4:
            r10.a(r5)
            return r4
        Lb8:
            r7 = move-exception
            r9 = r10
        Lba:
            r9.a(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.yh.a(java.lang.String, O7.l, O7.l, E7.d):java.lang.Object");
    }
}
