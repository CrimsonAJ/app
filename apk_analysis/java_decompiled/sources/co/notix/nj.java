package co.notix;

/* loaded from: classes.dex */
public abstract class nj {
    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:20|21))(3:22|23|(1:25))|11|12|(2:14|15)(2:17|18)))|28|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        r6 = a.AbstractC0485a.h(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(co.notix.s8 r4, org.json.JSONObject r5, E7.d r6) {
        /*
            boolean r0 = r6 instanceof co.notix.mj
            if (r0 == 0) goto L13
            r0 = r6
            co.notix.mj r0 = (co.notix.mj) r0
            int r1 = r0.f12786b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12786b = r1
            goto L18
        L13:
            co.notix.mj r0 = new co.notix.mj
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f12785a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12786b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0485a.A(r6)     // Catch: java.lang.Throwable -> L4c
            goto L49
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            a.AbstractC0485a.A(r6)
            co.notix.td r6 = r4.a()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r5 = r6.a(r5)     // Catch: java.lang.Throwable -> L4c
            co.notix.u8 r5 = (co.notix.u8) r5     // Catch: java.lang.Throwable -> L4c
            co.notix.t8 r4 = r4.c()     // Catch: java.lang.Throwable -> L4c
            r0.f12786b = r3     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r6 = r4.a(r5, r0)     // Catch: java.lang.Throwable -> L4c
            if (r6 != r1) goto L49
            return r1
        L49:
            co.notix.v8 r6 = (co.notix.v8) r6     // Catch: java.lang.Throwable -> L4c
            goto L51
        L4c:
            r4 = move-exception
            A7.i r6 = a.AbstractC0485a.h(r4)
        L51:
            java.lang.Throwable r4 = A7.j.a(r6)
            if (r4 != 0) goto L5a
            co.notix.v8 r6 = (co.notix.v8) r6
            goto L73
        L5a:
            co.notix.kd r5 = co.notix.md.f12779a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "perseverance: command finished with unexpected exception "
            r6.<init>(r0)
            java.lang.String r0 = r4.getMessage()
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.a(r6, r4)
            co.notix.v8 r6 = co.notix.v8.FAILURE
        L73:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.nj.a(co.notix.s8, org.json.JSONObject, E7.d):java.lang.Object");
    }
}
