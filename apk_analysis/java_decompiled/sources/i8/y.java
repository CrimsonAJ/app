package i8;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: k, reason: collision with root package name */
    public static final char[] f19168k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f19169a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19170b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19171c;

    /* renamed from: d, reason: collision with root package name */
    public final String f19172d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19173e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f19174f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f19175g;

    /* renamed from: h, reason: collision with root package name */
    public final String f19176h;

    /* renamed from: i, reason: collision with root package name */
    public final String f19177i;
    public final boolean j;

    public y(String scheme, String str, String str2, String host, int i9, ArrayList arrayList, ArrayList arrayList2, String str3, String str4) {
        kotlin.jvm.internal.h.e(scheme, "scheme");
        kotlin.jvm.internal.h.e(host, "host");
        this.f19169a = scheme;
        this.f19170b = str;
        this.f19171c = str2;
        this.f19172d = host;
        this.f19173e = i9;
        this.f19174f = arrayList;
        this.f19175g = arrayList2;
        this.f19176h = str3;
        this.f19177i = str4;
        this.j = scheme.equals("https");
    }

    public final String a() {
        if (this.f19171c.length() == 0) {
            return "";
        }
        int length = this.f19169a.length() + 3;
        String str = this.f19177i;
        String substring = str.substring(W7.d.R(str, ':', length, 4) + 1, W7.d.R(str, '@', 0, 6));
        kotlin.jvm.internal.h.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        int length = this.f19169a.length() + 3;
        String str = this.f19177i;
        int R2 = W7.d.R(str, '/', length, 4);
        String substring = str.substring(R2, k8.c.g(str, R2, str.length(), "?#"));
        kotlin.jvm.internal.h.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        int length = this.f19169a.length() + 3;
        String str = this.f19177i;
        int R2 = W7.d.R(str, '/', length, 4);
        int g9 = k8.c.g(str, R2, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (R2 < g9) {
            int i9 = R2 + 1;
            int f9 = k8.c.f(str, '/', i9, g9);
            String substring = str.substring(i9, f9);
            kotlin.jvm.internal.h.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            R2 = f9;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f19175g == null) {
            return null;
        }
        String str = this.f19177i;
        int R2 = W7.d.R(str, '?', 0, 6) + 1;
        String substring = str.substring(R2, k8.c.f(str, '#', R2, str.length()));
        kotlin.jvm.internal.h.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        if (this.f19170b.length() == 0) {
            return "";
        }
        int length = this.f19169a.length() + 3;
        String str = this.f19177i;
        String substring = str.substring(length, k8.c.g(str, length, str.length(), ":@"));
        kotlin.jvm.internal.h.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof y) && kotlin.jvm.internal.h.a(((y) obj).f19177i, this.f19177i)) {
            return true;
        }
        return false;
    }

    public final x f() {
        int i9;
        ArrayList arrayList;
        x xVar = new x();
        String scheme = this.f19169a;
        xVar.f19160a = scheme;
        xVar.f19161b = e();
        xVar.f19162c = a();
        xVar.f19163d = this.f19172d;
        kotlin.jvm.internal.h.e(scheme, "scheme");
        int i10 = -1;
        if (scheme.equals("http")) {
            i9 = 80;
        } else if (scheme.equals("https")) {
            i9 = 443;
        } else {
            i9 = -1;
        }
        int i11 = this.f19173e;
        if (i11 != i9) {
            i10 = i11;
        }
        xVar.f19164e = i10;
        ArrayList arrayList2 = xVar.f19165f;
        arrayList2.clear();
        arrayList2.addAll(c());
        String d9 = d();
        String str = null;
        if (d9 != null) {
            arrayList = r.h(r.c(d9, 0, 0, " \"'<>#", 211));
        } else {
            arrayList = null;
        }
        xVar.f19166g = arrayList;
        if (this.f19176h != null) {
            String str2 = this.f19177i;
            str = str2.substring(W7.d.R(str2, '#', 0, 6) + 1);
            kotlin.jvm.internal.h.d(str, "this as java.lang.String).substring(startIndex)");
        }
        xVar.f19167h = str;
        return xVar;
    }

    public final x g(String link) {
        kotlin.jvm.internal.h.e(link, "link");
        try {
            x xVar = new x();
            xVar.e(this, link);
            return xVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String h() {
        x g9 = g("/...");
        kotlin.jvm.internal.h.b(g9);
        g9.f19161b = r.c("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        g9.f19162c = r.c("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        return g9.b().f19177i;
    }

    public final int hashCode() {
        return this.f19177i.hashCode();
    }

    public final URI i() {
        String str;
        String str2;
        x f9 = f();
        String str3 = f9.f19163d;
        String str4 = null;
        if (str3 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            kotlin.jvm.internal.h.d(compile, "compile(...)");
            str = compile.matcher(str3).replaceAll("");
            kotlin.jvm.internal.h.d(str, "replaceAll(...)");
        } else {
            str = null;
        }
        f9.f19163d = str;
        ArrayList arrayList = f9.f19165f;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.set(i9, r.c((String) arrayList.get(i9), 0, 0, "[]", 227));
        }
        ArrayList arrayList2 = f9.f19166g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                String str5 = (String) arrayList2.get(i10);
                if (str5 != null) {
                    str2 = r.c(str5, 0, 0, "\\^`{|}", 195);
                } else {
                    str2 = null;
                }
                arrayList2.set(i10, str2);
            }
        }
        String str6 = f9.f19167h;
        if (str6 != null) {
            str4 = r.c(str6, 0, 0, " \"#<>\\^`{|}", 163);
        }
        f9.f19167h = str4;
        String xVar = f9.toString();
        try {
            return new URI(xVar);
        } catch (URISyntaxException e8) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                kotlin.jvm.internal.h.d(compile2, "compile(...)");
                String replaceAll = compile2.matcher(xVar).replaceAll("");
                kotlin.jvm.internal.h.d(replaceAll, "replaceAll(...)");
                URI create = URI.create(replaceAll);
                kotlin.jvm.internal.h.d(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e8);
            }
        }
    }

    public final String toString() {
        return this.f19177i;
    }
}
