package co.notix;

/* loaded from: classes.dex */
public final class kh {

    /* renamed from: a, reason: collision with root package name */
    public final String f12610a;

    /* renamed from: b, reason: collision with root package name */
    public final O7.l f12611b;

    /* renamed from: c, reason: collision with root package name */
    public final O7.l f12612c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yh f12613d;

    public kh(yh yhVar, String name, O7.l serializer, O7.l deserializer) {
        kotlin.jvm.internal.h.e(name, "name");
        kotlin.jvm.internal.h.e(serializer, "serializer");
        kotlin.jvm.internal.h.e(deserializer, "deserializer");
        this.f12613d = yhVar;
        this.f12610a = name;
        this.f12611b = serializer;
        this.f12612c = deserializer;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058 A[Catch: all -> 0x0064, TRY_LEAVE, TryCatch #0 {all -> 0x0064, blocks: (B:12:0x004a, B:14:0x0058), top: B:11:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(E7.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof co.notix.hh
            if (r0 == 0) goto L13
            r0 = r5
            co.notix.hh r0 = (co.notix.hh) r0
            int r1 = r0.f12387e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12387e = r1
            goto L18
        L13:
            co.notix.hh r0 = new co.notix.hh
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f12385c
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12387e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            co.notix.yh r1 = r0.f12384b
            g8.a r0 = r0.f12383a
            a.AbstractC0485a.A(r5)
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            a.AbstractC0485a.A(r5)
            co.notix.yh r5 = r4.f12613d
            g8.a r2 = r5.f13612f
            r0.f12383a = r2
            r0.f12384b = r5
            r0.f12387e = r3
            java.lang.Object r0 = r2.d(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r1 = r5
            r0 = r2
        L49:
            r5 = 0
            A7.e r2 = r1.f13611e     // Catch: java.lang.Throwable -> L64
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L64
            java.io.File r2 = (java.io.File) r2     // Catch: java.lang.Throwable -> L64
            boolean r2 = r2.exists()     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto L66
            A7.e r1 = r1.f13611e     // Catch: java.lang.Throwable -> L64
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L64
            java.io.File r1 = (java.io.File) r1     // Catch: java.lang.Throwable -> L64
            r1.delete()     // Catch: java.lang.Throwable -> L64
            goto L66
        L64:
            r1 = move-exception
            goto L6c
        L66:
            r0.a(r5)
            A7.n r5 = A7.n.f558a
            return r5
        L6c:
            r0.a(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.kh.a(E7.d):java.lang.Object");
    }
}
