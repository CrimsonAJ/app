package R3;

import l4.y;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f6619a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6620b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6621c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6622d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6623e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f6619a = str;
        this.f6620b = str2;
        this.f6621c = str3;
        this.f6622d = str4;
        this.f6623e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (y.a(this.f6619a, iVar.f6619a) && y.a(this.f6620b, iVar.f6620b) && y.a(this.f6621c, iVar.f6621c) && y.a(this.f6622d, iVar.f6622d) && y.a(this.f6623e, iVar.f6623e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        String str = this.f6619a;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i14 = (527 + i9) * 31;
        String str2 = this.f6620b;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (i14 + i10) * 31;
        String str3 = this.f6621c;
        if (str3 != null) {
            i11 = str3.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        String str4 = this.f6622d;
        if (str4 != null) {
            i12 = str4.hashCode();
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        String str5 = this.f6623e;
        if (str5 != null) {
            i13 = str5.hashCode();
        }
        return i17 + i13;
    }
}
