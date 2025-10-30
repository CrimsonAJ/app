package L;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final g f4446b = a(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    public final i f4447a;

    public g(i iVar) {
        this.f4447a = iVar;
    }

    public static g a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new g(new j(d.a(localeArr)));
        }
        return new g(new h(localeArr));
    }

    public static g b(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i9 = 0; i9 < length; i9++) {
                String str2 = split[i9];
                int i10 = f.f4445a;
                localeArr[i9] = Locale.forLanguageTag(str2);
            }
            return a(localeArr);
        }
        return f4446b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (this.f4447a.equals(((g) obj).f4447a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4447a.hashCode();
    }

    public final String toString() {
        return this.f4447a.toString();
    }
}
