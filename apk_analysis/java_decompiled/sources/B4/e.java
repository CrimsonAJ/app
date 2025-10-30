package B4;

import android.app.NotificationChannel;
import android.content.pm.PackageManager;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static /* bridge */ /* synthetic */ boolean B(Drawable drawable) {
        return drawable instanceof AdaptiveIconDrawable;
    }

    public static /* synthetic */ NotificationChannel b() {
        return new NotificationChannel("notix_lsi", "Important News", 4);
    }

    public static /* synthetic */ NotificationChannel c(int i9, String str) {
        return new NotificationChannel(str, "News", i9);
    }

    public static /* bridge */ /* synthetic */ NotificationChannel f(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* synthetic */ NotificationChannel g(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* bridge */ /* synthetic */ boolean z(PackageManager packageManager) {
        return packageManager.isInstantApp();
    }
}
