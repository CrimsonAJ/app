package E;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.mediarouter.app.C0568d;

/* loaded from: classes.dex */
public abstract class b {
    public static Intent a(Context context, C0568d c0568d, IntentFilter intentFilter) {
        return context.registerReceiver(c0568d, intentFilter, null, null, 0);
    }

    public static Intent b(Context context, C0568d c0568d, IntentFilter intentFilter) {
        return context.registerReceiver(c0568d, intentFilter, null, null, 2);
    }

    public static void c(Context context, Intent intent) {
        context.startForegroundService(intent);
    }
}
