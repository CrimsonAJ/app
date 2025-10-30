package m7;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final o f20899a;

    /* renamed from: b, reason: collision with root package name */
    public final o f20900b;

    public j(o localOverrideSettings, o remoteSettings) {
        kotlin.jvm.internal.h.e(localOverrideSettings, "localOverrideSettings");
        kotlin.jvm.internal.h.e(remoteSettings, "remoteSettings");
        this.f20899a = localOverrideSettings;
        this.f20900b = remoteSettings;
    }

    public final double a() {
        Double b9 = this.f20899a.b();
        if (b9 != null) {
            double doubleValue = b9.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                return doubleValue;
            }
        }
        Double b10 = this.f20900b.b();
        if (b10 != null) {
            double doubleValue2 = b10.doubleValue();
            if (0.0d <= doubleValue2 && doubleValue2 <= 1.0d) {
                return doubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r6.c(r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(G7.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof m7.i
            if (r0 == 0) goto L13
            r0 = r6
            m7.i r0 = (m7.i) r0
            int r1 = r0.f20898u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20898u = r1
            goto L18
        L13:
            m7.i r0 = new m7.i
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f20896s
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f20898u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            a.AbstractC0485a.A(r6)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            m7.j r2 = r0.f20895r
            a.AbstractC0485a.A(r6)
            goto L49
        L38:
            a.AbstractC0485a.A(r6)
            r0.f20895r = r5
            r0.f20898u = r4
            m7.o r6 = r5.f20899a
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L48
            goto L56
        L48:
            r2 = r5
        L49:
            m7.o r6 = r2.f20900b
            r2 = 0
            r0.f20895r = r2
            r0.f20898u = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            A7.n r6 = A7.n.f558a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.j.b(G7.c):java.lang.Object");
    }
}
