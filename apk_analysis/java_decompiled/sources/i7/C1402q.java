package i7;

/* renamed from: i7.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1402q extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: e, reason: collision with root package name */
    public static final C1402q f18906e = new C1402q(1, 0);

    /* renamed from: f, reason: collision with root package name */
    public static final C1402q f18907f = new C1402q(1, 1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18908d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1402q(int i9, int i10) {
        super(i9);
        this.f18908d = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        r1 = android.app.Application.getProcessName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        r1 = android.app.Application.getProcessName();
     */
    @Override // O7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.f18908d
            switch(r0) {
                case 0: goto L4f;
                default: goto L5;
            }
        L5:
            X.b r4 = (X.C0402b) r4
            java.lang.String r0 = "ex"
            kotlin.jvm.internal.h.e(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CorruptionException in sessions DataStore in "
            r0.<init>(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 <= r2) goto L23
            java.lang.String r1 = Q.d.k()
            java.lang.String r2 = "myProcessName()"
            kotlin.jvm.internal.h.d(r1, r2)
            goto L37
        L23:
            r2 = 28
            if (r1 < r2) goto L2e
            java.lang.String r1 = C5.f.r()
            if (r1 == 0) goto L2e
            goto L37
        L2e:
            java.lang.String r1 = K4.b.b()
            if (r1 == 0) goto L35
            goto L37
        L35:
            java.lang.String r1 = ""
        L37:
            r0.append(r1)
            r1 = 46
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FirebaseSessions"
            android.util.Log.w(r1, r0, r4)
            b0.b r4 = new b0.b
            r0 = 1
            r4.<init>(r0)
            return r4
        L4f:
            X.b r4 = (X.C0402b) r4
            java.lang.String r0 = "ex"
            kotlin.jvm.internal.h.e(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CorruptionException in settings DataStore in "
            r0.<init>(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 <= r2) goto L6d
            java.lang.String r1 = Q.d.k()
            java.lang.String r2 = "myProcessName()"
            kotlin.jvm.internal.h.d(r1, r2)
            goto L81
        L6d:
            r2 = 28
            if (r1 < r2) goto L78
            java.lang.String r1 = C5.f.r()
            if (r1 == 0) goto L78
            goto L81
        L78:
            java.lang.String r1 = K4.b.b()
            if (r1 == 0) goto L7f
            goto L81
        L7f:
            java.lang.String r1 = ""
        L81:
            r0.append(r1)
            r1 = 46
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FirebaseSessions"
            android.util.Log.w(r1, r0, r4)
            b0.b r4 = new b0.b
            r0 = 1
            r4.<init>(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.C1402q.invoke(java.lang.Object):java.lang.Object");
    }
}
