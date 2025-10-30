package K4;

import B4.h;
import B4.i;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f4293a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f4294b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f4295c;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f4296d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f4297e;

    /* renamed from: f, reason: collision with root package name */
    public static Boolean f4298f;

    /* renamed from: g, reason: collision with root package name */
    public static String f4299g;

    /* renamed from: h, reason: collision with root package name */
    public static int f4300h;

    /* renamed from: i, reason: collision with root package name */
    public static Boolean f4301i;

    public static String a(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i9 = 0; i9 < length; i9++) {
            char[] cArr = f4293a;
            sb.append(cArr[(bArr[i9] & 240) >>> 4]);
            sb.append(cArr[bArr[i9] & 15]);
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r3 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b() {
        /*
            java.lang.String r0 = "/proc/"
            java.lang.String r1 = K4.b.f4299g
            if (r1 != 0) goto L68
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L13
            java.lang.String r0 = C5.f.r()
            K4.b.f4299g = r0
            goto L68
        L13:
            int r1 = K4.b.f4300h
            if (r1 != 0) goto L1d
            int r1 = android.os.Process.myPid()
            K4.b.f4300h = r1
        L1d:
            r2 = 0
            if (r1 > 0) goto L21
            goto L66
        L21:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L62
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L62
            r3.append(r1)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L62
            java.lang.String r0 = "/cmdline"
            r3.append(r0)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L62
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L62
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L62
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L57
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L57
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L57
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L57
            android.os.StrictMode.setThreadPolicy(r1)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L62
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L63
            F4.y.h(r0)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L63
            java.lang.String r2 = r0.trim()     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L63
        L4e:
            r3.close()     // Catch: java.io.IOException -> L66
            goto L66
        L52:
            r0 = move-exception
            r2 = r3
            goto L5c
        L55:
            r0 = move-exception
            goto L5c
        L57:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r1)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L62
            throw r0     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L62
        L5c:
            if (r2 == 0) goto L61
            r2.close()     // Catch: java.io.IOException -> L61
        L61:
            throw r0
        L62:
            r3 = r2
        L63:
            if (r3 == 0) goto L66
            goto L4e
        L66:
            K4.b.f4299g = r2
        L68:
            java.lang.String r0 = K4.b.f4299g
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K4.b.b():java.lang.String");
    }

    public static byte[] c(Context context, String str) {
        MessageDigest messageDigest;
        PackageInfo c3 = M4.c.a(context).c(64, str);
        Signature[] signatureArr = c3.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            int i9 = 0;
            while (true) {
                if (i9 < 2) {
                    try {
                        messageDigest = MessageDigest.getInstance("SHA1");
                    } catch (NoSuchAlgorithmException unused) {
                    }
                    if (messageDigest != null) {
                        break;
                    }
                    i9++;
                } else {
                    messageDigest = null;
                    break;
                }
            }
            if (messageDigest != null) {
                return messageDigest.digest(c3.signatures[0].toByteArray());
            }
        }
        return null;
    }

    public static boolean d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static boolean e(Context context, int i9) {
        if (g(i9, context, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                i a5 = i.a(context);
                a5.getClass();
                if (packageInfo != null) {
                    if (!i.d(packageInfo, false)) {
                        if (i.d(packageInfo, true)) {
                            if (!h.a((Context) a5.f704a)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static boolean f(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f4295c == null) {
            f4295c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (!f4295c.booleanValue() || Build.VERSION.SDK_INT >= 24) {
            if (f4296d == null) {
                f4296d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            }
            if (f4296d.booleanValue()) {
                if (!d() || Build.VERSION.SDK_INT >= 30) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean g(int i9, Context context, String str) {
        M4.b a5 = M4.c.a(context);
        a5.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a5.f4790a.getSystemService("appops");
            if (appOpsManager != null) {
                appOpsManager.checkPackage(i9, str);
                return true;
            }
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        } catch (SecurityException unused) {
            return false;
        }
    }
}
