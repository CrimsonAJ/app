package R3;

import l4.y;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f6608a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6609b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6610c;

    public f(String str, String str2, String str3) {
        this.f6608a = str;
        this.f6609b = str2;
        this.f6610c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (y.a(this.f6608a, fVar.f6608a) && y.a(this.f6609b, fVar.f6609b) && y.a(this.f6610c, fVar.f6610c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int hashCode = this.f6608a.hashCode() * 31;
        int i10 = 0;
        String str = this.f6609b;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i11 = (hashCode + i9) * 31;
        String str2 = this.f6610c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }
}
