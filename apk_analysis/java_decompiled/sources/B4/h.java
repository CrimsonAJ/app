package B4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f699b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f700c = false;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f702e = 0;

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f698a = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f701d = new AtomicBoolean();

    public static boolean a(Context context) {
        try {
            if (!f700c) {
                try {
                    PackageInfo c3 = M4.c.a(context).c(64, "com.google.android.gms");
                    i.a(context);
                    if (c3 != null && !i.d(c3, false) && i.d(c3, true)) {
                        f699b = true;
                    } else {
                        f699b = false;
                    }
                    f700c = true;
                } catch (PackageManager.NameNotFoundException e8) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e8);
                    f700c = true;
                }
            }
            if (!f699b && "user".equals(Build.TYPE)) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            f700c = true;
            throw th;
        }
    }

    public static boolean b(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
