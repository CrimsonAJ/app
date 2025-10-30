package L;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public final LocaleList f4451a;

    public j(Object obj) {
        this.f4451a = C3.d.i(obj);
    }

    @Override // L.i
    public final String a() {
        String languageTags;
        languageTags = this.f4451a.toLanguageTags();
        return languageTags;
    }

    @Override // L.i
    public final Object b() {
        return this.f4451a;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        equals = this.f4451a.equals(((i) obj).b());
        return equals;
    }

    @Override // L.i
    public final Locale get(int i9) {
        Locale locale;
        locale = this.f4451a.get(i9);
        return locale;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f4451a.hashCode();
        return hashCode;
    }

    @Override // L.i
    public final boolean isEmpty() {
        boolean isEmpty;
        isEmpty = this.f4451a.isEmpty();
        return isEmpty;
    }

    @Override // L.i
    public final int size() {
        int size;
        size = this.f4451a.size();
        return size;
    }

    public final String toString() {
        String localeList;
        localeList = this.f4451a.toString();
        return localeList;
    }
}
