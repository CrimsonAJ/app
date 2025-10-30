package L;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public final class h implements i {

    /* renamed from: c, reason: collision with root package name */
    public static final Locale[] f4448c = new Locale[0];

    /* renamed from: a, reason: collision with root package name */
    public final Locale[] f4449a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4450b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else {
            if (split.length == 1) {
                new Locale(split[0]);
                return;
            }
            throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
        }
    }

    public h(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f4449a = f4448c;
            this.f4450b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i9 = 0; i9 < localeArr.length; i9++) {
            Locale locale = localeArr[i9];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    sb.append(locale2.getLanguage());
                    String country = locale2.getCountry();
                    if (country != null && !country.isEmpty()) {
                        sb.append('-');
                        sb.append(locale2.getCountry());
                    }
                    if (i9 < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException(A0.a.m("list[", i9, "] is null"));
            }
        }
        this.f4449a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f4450b = sb.toString();
    }

    @Override // L.i
    public final String a() {
        return this.f4450b;
    }

    @Override // L.i
    public final Object b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        Locale[] localeArr = ((h) obj).f4449a;
        Locale[] localeArr2 = this.f4449a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i9 = 0; i9 < localeArr2.length; i9++) {
            if (!localeArr2[i9].equals(localeArr[i9])) {
                return false;
            }
        }
        return true;
    }

    @Override // L.i
    public final Locale get(int i9) {
        if (i9 >= 0) {
            Locale[] localeArr = this.f4449a;
            if (i9 < localeArr.length) {
                return localeArr[i9];
            }
            return null;
        }
        return null;
    }

    public final int hashCode() {
        int i9 = 1;
        for (Locale locale : this.f4449a) {
            i9 = (i9 * 31) + locale.hashCode();
        }
        return i9;
    }

    @Override // L.i
    public final boolean isEmpty() {
        if (this.f4449a.length == 0) {
            return true;
        }
        return false;
    }

    @Override // L.i
    public final int size() {
        return this.f4449a.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i9 = 0;
        while (true) {
            Locale[] localeArr = this.f4449a;
            if (i9 < localeArr.length) {
                sb.append(localeArr[i9]);
                if (i9 < localeArr.length - 1) {
                    sb.append(',');
                }
                i9++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
