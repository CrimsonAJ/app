package i;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class q {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales;
        LocaleList locales2;
        boolean equals;
        locales = configuration.getLocales();
        locales2 = configuration2.getLocales();
        equals = locales.equals(locales2);
        if (!equals) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    public static L.g b(Configuration configuration) {
        LocaleList locales;
        String languageTags;
        locales = configuration.getLocales();
        languageTags = locales.toLanguageTags();
        return L.g.b(languageTags);
    }

    public static void c(L.g gVar) {
        LocaleList forLanguageTags;
        forLanguageTags = LocaleList.forLanguageTags(gVar.f4447a.a());
        LocaleList.setDefault(forLanguageTags);
    }

    public static void d(Configuration configuration, L.g gVar) {
        LocaleList forLanguageTags;
        forLanguageTags = LocaleList.forLanguageTags(gVar.f4447a.a());
        configuration.setLocales(forLanguageTags);
    }
}
