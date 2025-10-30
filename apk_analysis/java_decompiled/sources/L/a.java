package L;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class a {
    static {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 30) {
            I.b.b(30);
        }
        if (i9 >= 30) {
            I.b.b(31);
        }
        if (i9 >= 30) {
            I.b.b(33);
        }
        if (i9 >= 30) {
            I.b.b(1000000);
        }
    }

    public static final boolean a() {
        Integer num;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 31) {
            if (i9 >= 30) {
                String CODENAME = Build.VERSION.CODENAME;
                kotlin.jvm.internal.h.d(CODENAME, "CODENAME");
                if (!"REL".equals(CODENAME)) {
                    Locale locale = Locale.ROOT;
                    String upperCase = CODENAME.toUpperCase(locale);
                    kotlin.jvm.internal.h.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    Integer num2 = null;
                    if (upperCase.equals("BAKLAVA")) {
                        num = 0;
                    } else {
                        num = null;
                    }
                    String upperCase2 = "S".toUpperCase(locale);
                    kotlin.jvm.internal.h.d(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    if (upperCase2.equals("BAKLAVA")) {
                        num2 = 0;
                    }
                    if (num != null && num2 != null) {
                        if (num.intValue() >= num2.intValue()) {
                            return true;
                        }
                    } else if (num == null && num2 == null) {
                        String upperCase3 = CODENAME.toUpperCase(locale);
                        kotlin.jvm.internal.h.d(upperCase3, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                        String upperCase4 = "S".toUpperCase(locale);
                        kotlin.jvm.internal.h.d(upperCase4, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                        if (upperCase3.compareTo(upperCase4) >= 0) {
                            return true;
                        }
                    } else if (num != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
}
