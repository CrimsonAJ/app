package C3;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final String f1564a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1565b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1566c;

    public x(String str, boolean z9, boolean z10) {
        this.f1564a = str;
        this.f1565b = z9;
        this.f1566c = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && obj.getClass() == x.class) {
                x xVar = (x) obj;
                if (TextUtils.equals(this.f1564a, xVar.f1564a) && this.f1565b == xVar.f1565b && this.f1566c == xVar.f1566c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i9;
        int c3 = u0.z.c(this.f1564a, 31, 31);
        int i10 = 1237;
        if (this.f1565b) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        int i11 = (c3 + i9) * 31;
        if (this.f1566c) {
            i10 = 1231;
        }
        return i11 + i10;
    }
}
