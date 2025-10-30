package D;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public abstract class p {
    public static Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static void b(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static List c(NotificationManager notificationManager) {
        return notificationManager.getNotificationChannels();
    }

    public static void d(Notification.Builder builder, int i9) {
        builder.setBadgeIconType(i9);
    }

    public static void e(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static void f(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void g(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    public static void h(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }
}
