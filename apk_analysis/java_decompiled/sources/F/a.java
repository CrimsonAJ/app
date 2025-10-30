package F;

import android.content.pm.PackageInfo;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes.dex */
public abstract class a {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler b(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static String[] c(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static long d(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static int e(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String f(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int g(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int h(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int i(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int j(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int k(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static PrecomputedText.Params l(AppCompatTextView appCompatTextView) {
        return appCompatTextView.getTextMetricsParams();
    }

    public static int m(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri n(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static void o(TextView textView, int i9) {
        textView.setFirstBaselineToTopHeight(i9);
    }

    public static boolean p(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
