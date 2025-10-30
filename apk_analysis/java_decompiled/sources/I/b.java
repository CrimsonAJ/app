package I;

import android.content.Context;
import android.graphics.drawable.Icon;
import android.media.MediaRouter2;
import android.net.Uri;
import android.os.ext.SdkExtensions;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public abstract class b {
    public static Icon a(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static void b(int i9) {
        SdkExtensions.getExtensionVersion(i9);
    }

    public static MediaRouter2 c(Context context) {
        return MediaRouter2.getInstance(context);
    }

    public static CharSequence d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void e(Window window, boolean z9) {
        int i9;
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z9) {
            i9 = systemUiVisibility & (-257);
        } else {
            i9 = systemUiVisibility | 256;
        }
        decorView.setSystemUiVisibility(i9);
        window.setDecorFitsSystemWindows(z9);
    }

    public static void f(Window window, boolean z9) {
        window.setDecorFitsSystemWindows(z9);
    }

    public static void g(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
