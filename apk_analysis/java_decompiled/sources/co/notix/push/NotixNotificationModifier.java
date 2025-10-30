package co.notix.push;

import android.content.Context;
import androidx.annotation.Keep;
import co.notix.push.data.NotificationOverrides;

/* loaded from: classes.dex */
public interface NotixNotificationModifier {
    @Keep
    NotificationOverrides modify(Context context, NotificationOverrides notificationOverrides);
}
