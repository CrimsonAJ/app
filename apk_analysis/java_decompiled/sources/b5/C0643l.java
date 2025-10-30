package b5;

/* renamed from: b5.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0643l {

    /* renamed from: a, reason: collision with root package name */
    public final String f11175a;

    /* renamed from: b, reason: collision with root package name */
    public long f11176b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0649n f11177c;

    public C0643l(C0649n c0649n, String str) {
        this.f11177c = c0649n;
        F4.y.e(str);
        this.f11175a = str;
        this.f11176b = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d8 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a() {
        /*
            r21 = this;
            r1 = r21
            b5.n r2 = r1.f11177c
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            long r4 = r1.f11176b
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r1.f11175a
            java.lang.String[] r9 = new java.lang.String[]{r4, r0}
            java.lang.String r8 = "app_id = ? and rowid > ?"
            java.lang.String r13 = "1000"
            r14 = 0
            android.database.sqlite.SQLiteDatabase r5 = r2.h1()     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            java.lang.String r6 = "raw_events"
            java.lang.String r15 = "rowid"
            java.lang.String r16 = "name"
            java.lang.String r17 = "timestamp"
            java.lang.String r18 = "metadata_fingerprint"
            java.lang.String r19 = "data"
            java.lang.String r20 = "realtime"
            java.lang.String[] r7 = new java.lang.String[]{r15, r16, r17, r18, r19, r20}     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            java.lang.String r12 = "rowid"
            r10 = 0
            r11 = 0
            android.database.Cursor r14 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            boolean r0 = r14.moveToFirst()     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            if (r0 == 0) goto Lbf
        L3e:
            r0 = 0
            long r6 = r14.getLong(r0)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            r5 = 3
            long r8 = r14.getLong(r5)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            r5 = 5
            long r10 = r14.getLong(r5)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            r12 = 1
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            r10 = 1
            if (r5 != 0) goto L55
            r0 = r10
        L55:
            r5 = 4
            byte[] r5 = r14.getBlob(r5)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            long r11 = r1.f11176b     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            int r11 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r11 <= 0) goto L62
            r1.f11176b = r6     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
        L62:
            com.google.android.gms.internal.measurement.U0 r11 = com.google.android.gms.internal.measurement.V0.r()     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1 java.io.IOException -> La3
            com.google.android.gms.internal.measurement.a2 r5 = b5.Z.R0(r11, r5)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1 java.io.IOException -> La3
            com.google.android.gms.internal.measurement.U0 r5 = (com.google.android.gms.internal.measurement.U0) r5     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1 java.io.IOException -> La3
            java.lang.String r10 = r14.getString(r10)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            if (r10 != 0) goto L74
            java.lang.String r10 = ""
        L74:
            r5.j()     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            com.google.android.gms.internal.measurement.b2 r11 = r5.f15439b     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            com.google.android.gms.internal.measurement.V0 r11 = (com.google.android.gms.internal.measurement.V0) r11     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            com.google.android.gms.internal.measurement.V0.z(r11, r10)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            r10 = 2
            long r10 = r14.getLong(r10)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            r5.j()     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            com.google.android.gms.internal.measurement.b2 r12 = r5.f15439b     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            com.google.android.gms.internal.measurement.V0 r12 = (com.google.android.gms.internal.measurement.V0) r12     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            com.google.android.gms.internal.measurement.V0.C(r10, r12)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            r10 = r5
            b5.k r5 = new b5.k     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            com.google.android.gms.internal.measurement.b2 r10 = r10.h()     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            r11 = r10
            com.google.android.gms.internal.measurement.V0 r11 = (com.google.android.gms.internal.measurement.V0) r11     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            r10 = r0
            r5.<init>(r6, r8, r10, r11)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            r3.add(r5)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            goto Lb8
        L9f:
            r0 = move-exception
            goto Ldc
        La1:
            r0 = move-exception
            goto Lc2
        La3:
            r0 = move-exception
            java.lang.Object r5 = r2.f1707a     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            b5.n0 r5 = (b5.C0650n0) r5     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            b5.V r5 = r5.f11229i     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            b5.C0650n0.f(r5)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            b5.T r5 = r5.f10971f     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            java.lang.String r6 = "Data loss. Failed to merge raw event. appId"
            b5.U r7 = b5.V.t0(r4)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            r5.d(r7, r0, r6)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
        Lb8:
            boolean r0 = r14.moveToNext()     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            if (r0 != 0) goto L3e
            goto Ld6
        Lbf:
            java.util.List r3 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            goto Ld6
        Lc2:
            java.lang.Object r2 = r2.f1707a     // Catch: java.lang.Throwable -> L9f
            b5.n0 r2 = (b5.C0650n0) r2     // Catch: java.lang.Throwable -> L9f
            b5.V r2 = r2.f11229i     // Catch: java.lang.Throwable -> L9f
            b5.C0650n0.f(r2)     // Catch: java.lang.Throwable -> L9f
            b5.T r2 = r2.f10971f     // Catch: java.lang.Throwable -> L9f
            java.lang.String r5 = "Data loss. Error querying raw events batch. appId"
            b5.U r4 = b5.V.t0(r4)     // Catch: java.lang.Throwable -> L9f
            r2.d(r4, r0, r5)     // Catch: java.lang.Throwable -> L9f
        Ld6:
            if (r14 == 0) goto Ldb
            r14.close()
        Ldb:
            return r3
        Ldc:
            if (r14 == 0) goto Le1
            r14.close()
        Le1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0643l.a():java.util.List");
    }

    public C0643l(C0649n c0649n, String str, long j) {
        this.f11177c = c0649n;
        F4.y.e(str);
        this.f11175a = str;
        this.f11176b = c0649n.d1(-1L, "select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)});
    }
}
