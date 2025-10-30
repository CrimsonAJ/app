package L;

import android.content.Context;
import android.content.res.Configuration;
import android.icu.text.DecimalFormatSymbols;
import android.os.LocaleList;
import android.os.UserManager;
import android.text.Html;
import android.text.Spanned;
import android.view.PointerIcon;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class d {
    public static LocaleList a(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    public static Spanned b(String str) {
        return Html.fromHtml(str, 63);
    }

    public static DecimalFormatSymbols c(Locale locale) {
        return DecimalFormatSymbols.getInstance(locale);
    }

    public static LocaleList d(Configuration configuration) {
        return configuration.getLocales();
    }

    public static PointerIcon e(Context context) {
        return PointerIcon.getSystemIcon(context, 1002);
    }

    public static boolean f(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
