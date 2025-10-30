package Q;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static /* bridge */ /* synthetic */ PackageInfo a(PackageManager packageManager, String str, PackageManager.PackageInfoFlags packageInfoFlags) {
        return packageManager.getPackageInfo(str, packageInfoFlags);
    }

    public static /* bridge */ /* synthetic */ PackageManager.PackageInfoFlags b() {
        return PackageManager.PackageInfoFlags.of(0L);
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedCallback e(Object obj) {
        return (OnBackInvokedCallback) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher i(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }
}
