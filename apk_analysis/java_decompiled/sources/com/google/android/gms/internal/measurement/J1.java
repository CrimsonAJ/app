package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class J1 {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f15231g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static volatile C1022y1 f15232h;

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicInteger f15233i;

    /* renamed from: a, reason: collision with root package name */
    public final A6.i f15234a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15235b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15236c;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f15237d = -1;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f15238e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f15239f;

    static {
        new AtomicReference();
        f15233i = new AtomicInteger();
    }

    public /* synthetic */ J1(A6.i iVar, String str, Object obj, int i9) {
        this.f15239f = i9;
        if (((Uri) iVar.f509b) != null) {
            this.f15234a = iVar;
            this.f15235b = str;
            this.f15236c = obj;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public final Object a(Object obj) {
        switch (this.f15239f) {
            case 0:
                if (obj instanceof Long) {
                    return (Long) obj;
                }
                if (obj instanceof String) {
                    try {
                        return Long.valueOf(Long.parseLong((String) obj));
                    } catch (NumberFormatException unused) {
                    }
                }
                Log.e("PhenotypeFlag", "Invalid long value for " + this.f15235b + ": " + obj.toString());
                return null;
            case 1:
                if (obj instanceof Boolean) {
                    return (Boolean) obj;
                }
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (AbstractC0997t1.f15596b.matcher(str).matches()) {
                        return Boolean.TRUE;
                    }
                    if (AbstractC0997t1.f15597c.matcher(str).matches()) {
                        return Boolean.FALSE;
                    }
                }
                Log.e("PhenotypeFlag", "Invalid boolean value for " + this.f15235b + ": " + obj.toString());
                return null;
            case 2:
                if (obj instanceof Double) {
                    return (Double) obj;
                }
                if (obj instanceof Float) {
                    return Double.valueOf(((Float) obj).doubleValue());
                }
                if (obj instanceof String) {
                    try {
                        return Double.valueOf(Double.parseDouble((String) obj));
                    } catch (NumberFormatException unused2) {
                    }
                }
                Log.e("PhenotypeFlag", "Invalid double value for " + this.f15235b + ": " + obj.toString());
                return null;
            default:
                if (obj instanceof String) {
                    return (String) obj;
                }
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x0024, B:13:0x0034, B:16:0x0048, B:19:0x005e, B:21:0x006b, B:23:0x0073, B:25:0x0086, B:27:0x0094, B:30:0x00b9, B:33:0x00c1, B:34:0x00c4, B:35:0x00c8, B:36:0x009d, B:38:0x00a1, B:40:0x00af, B:42:0x00b5, B:46:0x00cd, B:47:0x00cf, B:50:0x0041, B:52:0x00d0), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x0024, B:13:0x0034, B:16:0x0048, B:19:0x005e, B:21:0x006b, B:23:0x0073, B:25:0x0086, B:27:0x0094, B:30:0x00b9, B:33:0x00c1, B:34:0x00c4, B:35:0x00c8, B:36:0x009d, B:38:0x00a1, B:40:0x00af, B:42:0x00b5, B:46:0x00cd, B:47:0x00cf, B:50:0x0041, B:52:0x00d0), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x0024, B:13:0x0034, B:16:0x0048, B:19:0x005e, B:21:0x006b, B:23:0x0073, B:25:0x0086, B:27:0x0094, B:30:0x00b9, B:33:0x00c1, B:34:0x00c4, B:35:0x00c8, B:36:0x009d, B:38:0x00a1, B:40:0x00af, B:42:0x00b5, B:46:0x00cd, B:47:0x00cf, B:50:0x0041, B:52:0x00d0), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005d  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.lang.Runnable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.measurement.J1.f15233i
            int r0 = r0.get()
            int r1 = r9.f15237d
            if (r1 >= r0) goto Ld4
            monitor-enter(r9)
            int r1 = r9.f15237d     // Catch: java.lang.Throwable -> L55
            if (r1 >= r0) goto Ld0
            com.google.android.gms.internal.measurement.y1 r1 = com.google.android.gms.internal.measurement.J1.f15232h     // Catch: java.lang.Throwable -> L55
            O5.a r2 = O5.a.f5486a     // Catch: java.lang.Throwable -> L55
            r3 = 0
            if (r1 == 0) goto L58
            O5.n r2 = r1.f15695b     // Catch: java.lang.Throwable -> L55
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L55
            O5.h r2 = (O5.h) r2     // Catch: java.lang.Throwable -> L55
            boolean r4 = r2.b()     // Catch: java.lang.Throwable -> L55
            if (r4 == 0) goto L58
            java.lang.Object r4 = r2.a()     // Catch: java.lang.Throwable -> L55
            com.google.android.gms.internal.measurement.A1 r4 = (com.google.android.gms.internal.measurement.A1) r4     // Catch: java.lang.Throwable -> L55
            A6.i r5 = r9.f15234a     // Catch: java.lang.Throwable -> L55
            java.lang.Object r5 = r5.f509b     // Catch: java.lang.Throwable -> L55
            android.net.Uri r5 = (android.net.Uri) r5     // Catch: java.lang.Throwable -> L55
            java.lang.String r6 = r9.f15235b     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto L41
            s.i r4 = r4.f15175a     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L55
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L55
            s.i r4 = (s.C1939i) r4     // Catch: java.lang.Throwable -> L55
            goto L45
        L41:
            r4.getClass()     // Catch: java.lang.Throwable -> L55
            r4 = r3
        L45:
            if (r4 != 0) goto L48
            goto L58
        L48:
            java.lang.String r5 = ""
            java.lang.String r5 = r5.concat(r6)     // Catch: java.lang.Throwable -> L55
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L55
            goto L59
        L55:
            r0 = move-exception
            goto Ld2
        L58:
            r4 = r3
        L59:
            if (r1 == 0) goto L5d
            r5 = 1
            goto L5e
        L5d:
            r5 = 0
        L5e:
            java.lang.String r6 = "Must call PhenotypeFlagInitializer.maybeInit() first"
            O4.h.j(r6, r5)     // Catch: java.lang.Throwable -> L55
            A6.i r5 = r9.f15234a     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.f509b     // Catch: java.lang.Throwable -> L55
            android.net.Uri r6 = (android.net.Uri) r6     // Catch: java.lang.Throwable -> L55
            if (r6 == 0) goto Lcd
            android.content.Context r7 = r1.f15694a     // Catch: java.lang.Throwable -> L55
            boolean r7 = com.google.android.gms.internal.measurement.E1.a(r7, r6)     // Catch: java.lang.Throwable -> L55
            if (r7 == 0) goto L83
            android.content.Context r7 = r1.f15694a     // Catch: java.lang.Throwable -> L55
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L55
            com.google.android.gms.internal.measurement.G1 r8 = new com.google.android.gms.internal.measurement.G1     // Catch: java.lang.Throwable -> L55
            r8.<init>()     // Catch: java.lang.Throwable -> L55
            com.google.android.gms.internal.measurement.z1 r6 = com.google.android.gms.internal.measurement.C1027z1.a(r7, r6, r8)     // Catch: java.lang.Throwable -> L55
            goto L84
        L83:
            r6 = r3
        L84:
            if (r6 == 0) goto L99
            java.lang.String r7 = r9.f15235b     // Catch: java.lang.Throwable -> L55
            java.util.Map r6 = r6.b()     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r6.get(r7)     // Catch: java.lang.Throwable -> L55
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L55
            if (r6 == 0) goto L99
            java.lang.Object r6 = r9.a(r6)     // Catch: java.lang.Throwable -> L55
            goto L9a
        L99:
            r6 = r3
        L9a:
            if (r6 == 0) goto L9d
            goto Lb9
        L9d:
            boolean r5 = r5.f508a     // Catch: java.lang.Throwable -> L55
            if (r5 != 0) goto Lb3
            android.content.Context r1 = r1.f15694a     // Catch: java.lang.Throwable -> L55
            com.google.android.gms.internal.measurement.C1 r1 = com.google.android.gms.internal.measurement.C1.e(r1)     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = r9.f15235b     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = r1.h(r5)     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto Lb3
            java.lang.Object r3 = r9.a(r1)     // Catch: java.lang.Throwable -> L55
        Lb3:
            if (r3 != 0) goto Lb8
            java.lang.Object r6 = r9.f15236c     // Catch: java.lang.Throwable -> L55
            goto Lb9
        Lb8:
            r6 = r3
        Lb9:
            boolean r1 = r2.b()     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto Lc8
            if (r4 != 0) goto Lc4
            java.lang.Object r6 = r9.f15236c     // Catch: java.lang.Throwable -> L55
            goto Lc8
        Lc4:
            java.lang.Object r6 = r9.a(r4)     // Catch: java.lang.Throwable -> L55
        Lc8:
            r9.f15238e = r6     // Catch: java.lang.Throwable -> L55
            r9.f15237d = r0     // Catch: java.lang.Throwable -> L55
            goto Ld0
        Lcd:
            android.content.Context r0 = r1.f15694a     // Catch: java.lang.Throwable -> L55
            throw r3     // Catch: java.lang.Throwable -> L55
        Ld0:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L55
            goto Ld4
        Ld2:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L55
            throw r0
        Ld4:
            java.lang.Object r0 = r9.f15238e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.J1.b():java.lang.Object");
    }
}
