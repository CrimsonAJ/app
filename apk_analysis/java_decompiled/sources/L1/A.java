package L1;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class A extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ S f4454r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(S s9, E7.d dVar) {
        super(2, dVar);
        this.f4454r = s9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new A(this.f4454r, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        A a5 = (A) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        a5.invokeSuspend(nVar);
        return nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r0 == 0) goto L7;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            a.AbstractC0485a.A(r11)
            L1.S r11 = r10.f4454r
            android.app.Application r0 = r11.j
            r1 = 30
            r2 = 0
            if (r0 != 0) goto Ld
            goto L25
        Ld:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 1
            if (r3 < r1) goto L14
        L12:
            r2 = r4
            goto L25
        L14:
            java.lang.String r3 = "android.permission.READ_EXTERNAL_STORAGE"
            int r3 = E.d.a(r0, r3)
            java.lang.String r5 = "android.permission.WRITE_EXTERNAL_STORAGE"
            int r0 = E.d.a(r0, r5)
            if (r3 != 0) goto L25
            if (r0 != 0) goto L25
            goto L12
        L25:
            A7.n r0 = A7.n.f558a
            if (r2 != 0) goto L2b
            goto Lb0
        L2b:
            java.lang.String r2 = "_id"
            int r3 = android.os.Build.VERSION.SDK_INT
            android.app.Application r11 = r11.j
            if (r3 >= r1) goto L34
            goto L73
        L34:
            android.net.Uri r5 = B.a.f()     // Catch: java.lang.Exception -> L73
            java.lang.String r3 = "EXTERNAL_CONTENT_URI"
            kotlin.jvm.internal.h.d(r5, r3)     // Catch: java.lang.Exception -> L73
            android.content.ContentResolver r4 = r11.getContentResolver()     // Catch: java.lang.Exception -> L73
            java.lang.String[] r6 = new java.lang.String[]{r2}     // Catch: java.lang.Exception -> L73
            java.lang.String r7 = "mime_type = ? AND _display_name LIKE 'anilab-latest%.apk'"
            java.lang.String r3 = "application/vnd.android.package-archive"
            java.lang.String[] r8 = new java.lang.String[]{r3}     // Catch: java.lang.Exception -> L73
            r9 = 0
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L73
            if (r3 == 0) goto L73
        L54:
            boolean r6 = r3.moveToNext()     // Catch: java.lang.Exception -> L73
            if (r6 == 0) goto L70
            int r6 = r3.getColumnIndexOrThrow(r2)     // Catch: java.lang.Exception -> L73
            long r6 = r3.getLong(r6)     // Catch: java.lang.Exception -> L73
            android.net.Uri r6 = android.content.ContentUris.withAppendedId(r5, r6)     // Catch: java.lang.Exception -> L73
            java.lang.String r7 = "withAppendedId(...)"
            kotlin.jvm.internal.h.d(r6, r7)     // Catch: java.lang.Exception -> L73
            r7 = 0
            r4.delete(r6, r7, r7)     // Catch: java.lang.Exception -> L73
            goto L54
        L70:
            r3.close()     // Catch: java.lang.Exception -> L73
        L73:
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r1) goto L78
            goto Lb0
        L78:
            java.lang.String r1 = android.os.Environment.DIRECTORY_DOWNLOADS     // Catch: java.lang.Exception -> Lb0
            java.io.File r1 = android.os.Environment.getExternalStoragePublicDirectory(r1)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Exception -> Lb0
            r2 = 2132017363(0x7f1400d3, float:1.9673002E38)
            java.lang.String r11 = r11.getString(r2)     // Catch: java.lang.Exception -> Lb0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb0
            r2.<init>()     // Catch: java.lang.Exception -> Lb0
            r2.append(r1)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r1 = "/"
            r2.append(r1)     // Catch: java.lang.Exception -> Lb0
            r2.append(r11)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r11 = "$"
            r2.append(r11)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r11 = r2.toString()     // Catch: java.lang.Exception -> Lb0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> Lb0
            r1.<init>(r11)     // Catch: java.lang.Exception -> Lb0
            boolean r11 = r1.exists()     // Catch: java.lang.Exception -> Lb0
            if (r11 == 0) goto Lb0
            r1.delete()     // Catch: java.lang.Exception -> Lb0
        Lb0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: L1.A.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
