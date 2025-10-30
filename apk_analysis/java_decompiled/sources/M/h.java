package M;

import F0.z0;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s.C1939i;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final z0 f4665a = new z0(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f4666b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f4667c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1939i f4668d;

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), (ThreadFactory) new Object());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f4666b = threadPoolExecutor;
        f4667c = new Object();
        f4668d = new C1939i(0);
    }

    public static String a(List list, int i9) {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb.append(((d) list.get(i10)).f4655e);
            sb.append("-");
            sb.append(i9);
            if (i10 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[Catch: all -> 0x00b4, TRY_LEAVE, TryCatch #2 {all -> 0x00b4, NameNotFoundException -> 0x00aa, all -> 0x0073, all -> 0x00a5, blocks: (B:3:0x0008, B:5:0x0010, B:10:0x0019, B:11:0x001d, B:17:0x004d, B:20:0x0056, B:22:0x005c, B:24:0x0062, B:27:0x006f, B:29:0x0090, B:32:0x009c, B:37:0x0074, B:38:0x0077, B:39:0x0078, B:42:0x008b, B:45:0x00a6, B:46:0x00a9, B:48:0x002b, B:50:0x0033, B:53:0x0037, B:55:0x003b, B:57:0x0046, B:66:0x00aa, B:26:0x0069, B:41:0x0085), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[Catch: all -> 0x00b4, TRY_ENTER, TryCatch #2 {all -> 0x00b4, NameNotFoundException -> 0x00aa, all -> 0x0073, all -> 0x00a5, blocks: (B:3:0x0008, B:5:0x0010, B:10:0x0019, B:11:0x001d, B:17:0x004d, B:20:0x0056, B:22:0x005c, B:24:0x0062, B:27:0x006f, B:29:0x0090, B:32:0x009c, B:37:0x0074, B:38:0x0077, B:39:0x0078, B:42:0x008b, B:45:0x00a6, B:46:0x00a9, B:48:0x002b, B:50:0x0033, B:53:0x0037, B:55:0x003b, B:57:0x0046, B:66:0x00aa, B:26:0x0069, B:41:0x0085), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090 A[Catch: all -> 0x00b4, TRY_LEAVE, TryCatch #2 {all -> 0x00b4, NameNotFoundException -> 0x00aa, all -> 0x0073, all -> 0x00a5, blocks: (B:3:0x0008, B:5:0x0010, B:10:0x0019, B:11:0x001d, B:17:0x004d, B:20:0x0056, B:22:0x005c, B:24:0x0062, B:27:0x006f, B:29:0x0090, B:32:0x009c, B:37:0x0074, B:38:0x0077, B:39:0x0078, B:42:0x008b, B:45:0x00a6, B:46:0x00a9, B:48:0x002b, B:50:0x0033, B:53:0x0037, B:55:0x003b, B:57:0x0046, B:66:0x00aa, B:26:0x0069, B:41:0x0085), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c A[Catch: all -> 0x00b4, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00b4, NameNotFoundException -> 0x00aa, all -> 0x0073, all -> 0x00a5, blocks: (B:3:0x0008, B:5:0x0010, B:10:0x0019, B:11:0x001d, B:17:0x004d, B:20:0x0056, B:22:0x005c, B:24:0x0062, B:27:0x006f, B:29:0x0090, B:32:0x009c, B:37:0x0074, B:38:0x0077, B:39:0x0078, B:42:0x008b, B:45:0x00a6, B:46:0x00a9, B:48:0x002b, B:50:0x0033, B:53:0x0037, B:55:0x003b, B:57:0x0046, B:66:0x00aa, B:26:0x0069, B:41:0x0085), top: B:2:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static M.g b(java.lang.String r8, android.content.Context r9, java.util.List r10, int r11) {
        /*
            r0 = 1
            java.lang.String r1 = "getFontSync"
            B6.u0.d(r1)
            F0.z0 r1 = M.h.f4665a
            java.lang.Object r2 = r1.h(r8)     // Catch: java.lang.Throwable -> Lb4
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2     // Catch: java.lang.Throwable -> Lb4
            if (r2 == 0) goto L19
            M.g r8 = new M.g     // Catch: java.lang.Throwable -> Lb4
            r8.<init>(r2)     // Catch: java.lang.Throwable -> Lb4
            android.os.Trace.endSection()
            return r8
        L19:
            A3.f r10 = M.c.a(r9, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Laa java.lang.Throwable -> Lb4
            int r2 = r10.f127a     // Catch: java.lang.Throwable -> Lb4
            r3 = 0
            java.util.List r10 = r10.f128b
            r4 = -3
            if (r2 == 0) goto L2b
            if (r2 == r0) goto L29
        L27:
            r2 = r4
            goto L4b
        L29:
            r2 = -2
            goto L4b
        L2b:
            java.lang.Object r2 = r10.get(r3)     // Catch: java.lang.Throwable -> Lb4
            M.i[] r2 = (M.i[]) r2     // Catch: java.lang.Throwable -> Lb4
            if (r2 == 0) goto L4a
            int r5 = r2.length     // Catch: java.lang.Throwable -> Lb4
            if (r5 != 0) goto L37
            goto L4a
        L37:
            int r5 = r2.length     // Catch: java.lang.Throwable -> Lb4
            r6 = r3
        L39:
            if (r6 >= r5) goto L48
            r7 = r2[r6]     // Catch: java.lang.Throwable -> Lb4
            int r7 = r7.f4673e     // Catch: java.lang.Throwable -> Lb4
            if (r7 == 0) goto L46
            if (r7 >= 0) goto L44
            goto L27
        L44:
            r2 = r7
            goto L4b
        L46:
            int r6 = r6 + r0
            goto L39
        L48:
            r2 = r3
            goto L4b
        L4a:
            r2 = r0
        L4b:
            if (r2 == 0) goto L56
            M.g r8 = new M.g     // Catch: java.lang.Throwable -> Lb4
            r8.<init>(r2)     // Catch: java.lang.Throwable -> Lb4
            android.os.Trace.endSection()
            return r8
        L56:
            int r2 = r10.size()     // Catch: java.lang.Throwable -> Lb4
            if (r2 <= r0) goto L78
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lb4
            r2 = 29
            if (r0 < r2) goto L78
            M4.a r0 = H.f.f2921a     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r0 = "TypefaceCompat.createFromFontInfoWithFallback"
            B6.u0.d(r0)     // Catch: java.lang.Throwable -> Lb4
            M4.a r0 = H.f.f2921a     // Catch: java.lang.Throwable -> L73
            android.graphics.Typeface r9 = r0.f(r9, r10, r11)     // Catch: java.lang.Throwable -> L73
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb4
            goto L8e
        L73:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb4
            throw r8     // Catch: java.lang.Throwable -> Lb4
        L78:
            java.lang.Object r10 = r10.get(r3)     // Catch: java.lang.Throwable -> Lb4
            M.i[] r10 = (M.i[]) r10     // Catch: java.lang.Throwable -> Lb4
            M4.a r0 = H.f.f2921a     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r0 = "TypefaceCompat.createFromFontInfo"
            B6.u0.d(r0)     // Catch: java.lang.Throwable -> Lb4
            M4.a r0 = H.f.f2921a     // Catch: java.lang.Throwable -> La5
            android.graphics.Typeface r9 = r0.e(r9, r10, r11)     // Catch: java.lang.Throwable -> La5
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb4
        L8e:
            if (r9 == 0) goto L9c
            r1.l(r8, r9)     // Catch: java.lang.Throwable -> Lb4
            M.g r8 = new M.g     // Catch: java.lang.Throwable -> Lb4
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lb4
            android.os.Trace.endSection()
            return r8
        L9c:
            M.g r8 = new M.g     // Catch: java.lang.Throwable -> Lb4
            r8.<init>(r4)     // Catch: java.lang.Throwable -> Lb4
            android.os.Trace.endSection()
            return r8
        La5:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb4
            throw r8     // Catch: java.lang.Throwable -> Lb4
        Laa:
            M.g r8 = new M.g     // Catch: java.lang.Throwable -> Lb4
            r9 = -1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lb4
            android.os.Trace.endSection()
            return r8
        Lb4:
            r8 = move-exception
            android.os.Trace.endSection()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: M.h.b(java.lang.String, android.content.Context, java.util.List, int):M.g");
    }
}
