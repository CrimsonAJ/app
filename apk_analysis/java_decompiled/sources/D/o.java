package D;

import android.app.Notification;
import android.app.NotificationManager;

/* loaded from: classes.dex */
public abstract class o {
    public static boolean a(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    public static void b(Notification.Action.Builder builder, boolean z9) {
        builder.setAllowGeneratedReplies(z9);
    }

    public static void c(Notification.Builder builder) {
        builder.setRemoteInputHistory(null);
    }
}
