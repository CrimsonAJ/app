package i7;

/* renamed from: i7.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1385A {
    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|7|(1:(1:(6:11|12|13|14|15|16)(2:19|20))(2:21|22))(6:29|30|31|32|(1:34)|27)|23|24|25))|42|6|7|(0)(0)|23|24|25|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        if (r10 != r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0046, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0033, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
    
        android.util.Log.w("InstallationId", "Error getting Firebase installation id .", r10);
        r9 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(T6.e r9, G7.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof i7.C1410z
            if (r0 == 0) goto L13
            r0 = r10
            i7.z r0 = (i7.C1410z) r0
            int r1 = r0.f18924u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18924u = r1
            goto L18
        L13:
            i7.z r0 = new i7.z
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f18922s
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f18924u
            java.lang.String r3 = ""
            java.lang.String r4 = "InstallationId"
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L48
            if (r2 == r6) goto L3e
            if (r2 != r5) goto L36
            java.lang.Object r9 = r0.f18921r
            java.lang.String r9 = (java.lang.String) r9
            a.AbstractC0485a.A(r10)     // Catch: java.lang.Exception -> L33
            goto L95
        L33:
            r10 = move-exception
            goto L9e
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            java.lang.Object r9 = r0.f18921r
            T6.e r9 = (T6.e) r9
            a.AbstractC0485a.A(r10)     // Catch: java.lang.Exception -> L46
            goto L65
        L46:
            r10 = move-exception
            goto L78
        L48:
            a.AbstractC0485a.A(r10)
            r10 = r9
            T6.d r10 = (T6.d) r10     // Catch: java.lang.Exception -> L46
            f5.q r9 = r10.e()     // Catch: java.lang.Exception -> L46
            java.lang.String r2 = "firebaseInstallations.getToken(false)"
            kotlin.jvm.internal.h.d(r9, r2)     // Catch: java.lang.Exception -> L76
            r0.f18921r = r10     // Catch: java.lang.Exception -> L76
            r0.f18924u = r6     // Catch: java.lang.Exception -> L76
            java.lang.Object r9 = com.google.android.gms.internal.measurement.Y1.a(r9, r0)     // Catch: java.lang.Exception -> L76
            if (r9 != r1) goto L62
            goto L94
        L62:
            r7 = r10
            r10 = r9
            r9 = r7
        L65:
            T6.a r10 = (T6.a) r10     // Catch: java.lang.Exception -> L46
            java.lang.String r10 = r10.f7209a     // Catch: java.lang.Exception -> L46
            java.lang.String r2 = "{\n          firebaseInst…).await().token\n        }"
            kotlin.jvm.internal.h.d(r10, r2)     // Catch: java.lang.Exception -> L46
            r7 = r10
            r10 = r9
            r9 = r7
            goto L7f
        L72:
            r7 = r10
            r10 = r9
            r9 = r7
            goto L78
        L76:
            r9 = move-exception
            goto L72
        L78:
            java.lang.String r2 = "Error getting authentication token."
            android.util.Log.w(r4, r2, r10)
            r10 = r9
            r9 = r3
        L7f:
            T6.d r10 = (T6.d) r10     // Catch: java.lang.Exception -> L33
            f5.q r10 = r10.d()     // Catch: java.lang.Exception -> L33
            java.lang.String r2 = "firebaseInstallations.id"
            kotlin.jvm.internal.h.d(r10, r2)     // Catch: java.lang.Exception -> L33
            r0.f18921r = r9     // Catch: java.lang.Exception -> L33
            r0.f18924u = r5     // Catch: java.lang.Exception -> L33
            java.lang.Object r10 = com.google.android.gms.internal.measurement.Y1.a(r10, r0)     // Catch: java.lang.Exception -> L33
            if (r10 != r1) goto L95
        L94:
            return r1
        L95:
            java.lang.String r0 = "{\n          firebaseInst…ions.id.await()\n        }"
            kotlin.jvm.internal.h.d(r10, r0)     // Catch: java.lang.Exception -> L33
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L33
            r3 = r10
            goto La3
        L9e:
            java.lang.String r0 = "Error getting Firebase installation id ."
            android.util.Log.w(r4, r0, r10)
        La3:
            i7.B r10 = new i7.B
            r10.<init>(r3, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.C1385A.a(T6.e, G7.c):java.lang.Object");
    }
}
