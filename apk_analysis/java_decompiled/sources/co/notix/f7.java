package co.notix;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class f7 {
    public static PackageInfo a(PackageManager packageManager, String packageName) {
        PackageInfo packageInfo;
        String str;
        PackageManager.PackageInfoFlags of;
        kotlin.jvm.internal.h.e(packageManager, "<this>");
        kotlin.jvm.internal.h.e(packageName, "packageName");
        if (Build.VERSION.SDK_INT >= 33) {
            of = PackageManager.PackageInfoFlags.of(0);
            packageInfo = packageManager.getPackageInfo(packageName, of);
            str = "{\n        getPackageInfo…of(flags.toLong()))\n    }";
        } else {
            packageInfo = packageManager.getPackageInfo(packageName, 0);
            str = "{\n        @Suppress(\"DEP…packageName, flags)\n    }";
        }
        kotlin.jvm.internal.h.d(packageInfo, str);
        return packageInfo;
    }
}
