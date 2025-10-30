package s6;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final p f22767a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22768b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22769c;

    public h(int i9, int i10, Class cls) {
        this(p.a(cls), i9, i10);
    }

    public static h a(Class cls) {
        return new h(1, 0, cls);
    }

    public static h b(p pVar) {
        return new h(pVar, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f22767a.equals(hVar.f22767a) && this.f22768b == hVar.f22768b && this.f22769c == hVar.f22769c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f22767a.hashCode() ^ 1000003) * 1000003) ^ this.f22768b) * 1000003) ^ this.f22769c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f22767a);
        sb.append(", type=");
        int i9 = this.f22768b;
        if (i9 == 1) {
            str = "required";
        } else if (i9 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i10 = this.f22769c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    str2 = "deferred";
                } else {
                    throw new AssertionError(AbstractC0953k1.j(i10, "Unsupported injection: "));
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = "direct";
        }
        return AbstractC0953k1.q(sb, str2, "}");
    }

    public h(p pVar, int i9, int i10) {
        Z0.a.d(pVar, "Null dependency anInterface.");
        this.f22767a = pVar;
        this.f22768b = i9;
        this.f22769c = i10;
    }
}
