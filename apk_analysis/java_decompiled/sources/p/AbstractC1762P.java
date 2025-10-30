package p;

import android.os.LocaleList;
import android.widget.TextView;

/* renamed from: p.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1762P {
    public static LocaleList a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    public static void b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
