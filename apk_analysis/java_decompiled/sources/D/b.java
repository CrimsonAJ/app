package D;

import android.os.Handler;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f1662a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f1663b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f1664c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f1665d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f1666e;

    /* renamed from: f, reason: collision with root package name */
    public static final Method f1667f;

    /* renamed from: g, reason: collision with root package name */
    public static final Handler f1668g;

    /* JADX WARN: Can't wrap try/catch for region: R(19:1|(2:2|3)|4|(2:5|6)|7|(2:8|9)|10|(12:33|34|13|(6:29|30|16|(3:24|25|26)|20|21)|15|16|(1:18)|24|25|26|20|21)|12|13|(0)|15|16|(0)|24|25|26|20|21) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            r0 = 3
            java.lang.Class<android.os.IBinder> r1 = android.os.IBinder.class
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r3 = 2
            r4 = 0
            r5 = 1
            java.lang.Class<android.app.Activity> r6 = android.app.Activity.class
            android.os.Handler r7 = new android.os.Handler
            android.os.Looper r8 = android.os.Looper.getMainLooper()
            r7.<init>(r8)
            D.b.f1668g = r7
            r7 = 0
            java.lang.String r8 = "android.app.ActivityThread"
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Throwable -> L1d
            goto L1e
        L1d:
            r8 = r7
        L1e:
            D.b.f1662a = r8
            java.lang.String r8 = "mMainThread"
            java.lang.reflect.Field r8 = r6.getDeclaredField(r8)     // Catch: java.lang.Throwable -> L2a
            r8.setAccessible(r5)     // Catch: java.lang.Throwable -> L2a
            goto L2b
        L2a:
            r8 = r7
        L2b:
            D.b.f1663b = r8
            java.lang.String r8 = "mToken"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r8)     // Catch: java.lang.Throwable -> L37
            r6.setAccessible(r5)     // Catch: java.lang.Throwable -> L37
            goto L38
        L37:
            r6 = r7
        L38:
            D.b.f1664c = r6
            java.lang.Class r6 = D.b.f1662a
            java.lang.String r8 = "performStopActivity"
            if (r6 != 0) goto L42
        L40:
            r6 = r7
            goto L53
        L42:
            java.lang.Class[] r9 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L40
            r9[r4] = r1     // Catch: java.lang.Throwable -> L40
            r9[r5] = r2     // Catch: java.lang.Throwable -> L40
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r9[r3] = r10     // Catch: java.lang.Throwable -> L40
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r8, r9)     // Catch: java.lang.Throwable -> L40
            r6.setAccessible(r5)     // Catch: java.lang.Throwable -> L40
        L53:
            D.b.f1665d = r6
            java.lang.Class r6 = D.b.f1662a
            if (r6 != 0) goto L5b
        L59:
            r6 = r7
            goto L68
        L5b:
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L59
            r9[r4] = r1     // Catch: java.lang.Throwable -> L59
            r9[r5] = r2     // Catch: java.lang.Throwable -> L59
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r8, r9)     // Catch: java.lang.Throwable -> L59
            r6.setAccessible(r5)     // Catch: java.lang.Throwable -> L59
        L68:
            D.b.f1666e = r6
            java.lang.Class r6 = D.b.f1662a
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 26
            if (r8 == r9) goto L76
            r9 = 27
            if (r8 != r9) goto La5
        L76:
            if (r6 != 0) goto L79
            goto La5
        L79:
            java.lang.String r8 = "requestRelaunchActivity"
            r9 = 9
            java.lang.Class[] r9 = new java.lang.Class[r9]     // Catch: java.lang.Throwable -> La5
            r9[r4] = r1     // Catch: java.lang.Throwable -> La5
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r9[r5] = r1     // Catch: java.lang.Throwable -> La5
            r9[r3] = r1     // Catch: java.lang.Throwable -> La5
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> La5
            r9[r0] = r1     // Catch: java.lang.Throwable -> La5
            r0 = 4
            r9[r0] = r2     // Catch: java.lang.Throwable -> La5
            java.lang.Class<android.content.res.Configuration> r0 = android.content.res.Configuration.class
            r1 = 5
            r9[r1] = r0     // Catch: java.lang.Throwable -> La5
            r1 = 6
            r9[r1] = r0     // Catch: java.lang.Throwable -> La5
            r0 = 7
            r9[r0] = r2     // Catch: java.lang.Throwable -> La5
            r0 = 8
            r9[r0] = r2     // Catch: java.lang.Throwable -> La5
            java.lang.reflect.Method r0 = r6.getDeclaredMethod(r8, r9)     // Catch: java.lang.Throwable -> La5
            r0.setAccessible(r5)     // Catch: java.lang.Throwable -> La5
            r7 = r0
        La5:
            D.b.f1667f = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D.b.<clinit>():void");
    }
}
