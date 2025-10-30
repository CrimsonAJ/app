package A4;

import android.os.Build;
import android.util.Log;
import java.util.Objects;

/* loaded from: classes.dex */
public final class g extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z9) {
        if (Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            if (Log.isLoggable("CloudMessengerCompat", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("CloudMessengerCompat", 3))) {
                Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
                return h.class;
            }
            return h.class;
        }
        return super.loadClass(str, z9);
    }
}
