package M0;

import a.AbstractC0485a;
import java.util.Locale;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f4679a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4680b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4681c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4682d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4683e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4684f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4685g;

    public b(int i9, int i10, String name, String type, String str, boolean z9) {
        int i11;
        h.e(name, "name");
        h.e(type, "type");
        this.f4679a = name;
        this.f4680b = type;
        this.f4681c = z9;
        this.f4682d = i9;
        this.f4683e = str;
        this.f4684f = i10;
        String upperCase = type.toUpperCase(Locale.ROOT);
        h.d(upperCase, "toUpperCase(...)");
        if (W7.d.N(upperCase, "INT")) {
            i11 = 3;
        } else if (!W7.d.N(upperCase, "CHAR") && !W7.d.N(upperCase, "CLOB") && !W7.d.N(upperCase, "TEXT")) {
            if (W7.d.N(upperCase, "BLOB")) {
                i11 = 5;
            } else if (!W7.d.N(upperCase, "REAL") && !W7.d.N(upperCase, "FLOA") && !W7.d.N(upperCase, "DOUB")) {
                i11 = 1;
            } else {
                i11 = 4;
            }
        } else {
            i11 = 2;
        }
        this.f4685g = i11;
    }

    public final boolean equals(Object obj) {
        boolean z9;
        boolean z10;
        if (this != obj) {
            if (obj instanceof b) {
                if (this.f4682d > 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                b bVar = (b) obj;
                if (bVar.f4682d > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z9 == z10 && h.a(this.f4679a, bVar.f4679a) && this.f4681c == bVar.f4681c) {
                    int i9 = bVar.f4684f;
                    String str = bVar.f4683e;
                    int i10 = this.f4684f;
                    String str2 = this.f4683e;
                    if ((i10 != 1 || i9 != 2 || str2 == null || AbstractC0485a.j(str2, str)) && ((i10 != 2 || i9 != 1 || str == null || AbstractC0485a.j(str, str2)) && ((i10 == 0 || i10 != i9 || (str2 == null ? str == null : AbstractC0485a.j(str2, str))) && this.f4685g == bVar.f4685g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i9;
        int hashCode = ((this.f4679a.hashCode() * 31) + this.f4685g) * 31;
        if (this.f4681c) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        return ((hashCode + i9) * 31) + this.f4682d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.f4679a);
        sb.append("',\n            |   type = '");
        sb.append(this.f4680b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.f4685g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.f4681c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.f4682d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.f4683e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return W7.e.C(W7.e.D(sb.toString()));
    }
}
