package H2;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final Long f3087a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3088b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3089c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3090d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3091e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f3092f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3093g;

    public y(Long l9, String str, String str2, String str3, boolean z9, Long l10, boolean z10) {
        this.f3087a = l9;
        this.f3088b = str;
        this.f3089c = str2;
        this.f3090d = str3;
        this.f3091e = z9;
        this.f3092f = l10;
        this.f3093g = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (kotlin.jvm.internal.h.a(this.f3087a, yVar.f3087a) && kotlin.jvm.internal.h.a(this.f3088b, yVar.f3088b) && kotlin.jvm.internal.h.a(this.f3089c, yVar.f3089c) && kotlin.jvm.internal.h.a(this.f3090d, yVar.f3090d) && this.f3091e == yVar.f3091e && kotlin.jvm.internal.h.a(this.f3092f, yVar.f3092f) && this.f3093g == yVar.f3093g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i9;
        int i10 = 0;
        Long l9 = this.f3087a;
        if (l9 == null) {
            hashCode = 0;
        } else {
            hashCode = l9.hashCode();
        }
        int c3 = u0.z.c(this.f3089c, u0.z.c(this.f3088b, hashCode * 31, 31), 31);
        String str = this.f3090d;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i11 = (c3 + hashCode2) * 31;
        int i12 = 1237;
        if (this.f3091e) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        int i13 = (i11 + i9) * 31;
        Long l10 = this.f3092f;
        if (l10 != null) {
            i10 = l10.hashCode();
        }
        int i14 = (i13 + i10) * 31;
        if (this.f3093g) {
            i12 = 1231;
        }
        return i14 + i12;
    }

    public final String toString() {
        return "User(id=" + this.f3087a + ", name=" + this.f3088b + ", email=" + this.f3089c + ", avatarUrl=" + this.f3090d + ", isEmailVerify=" + this.f3091e + ", avatarId=" + this.f3092f + ", hasPassword=" + this.f3093g + ")";
    }
}
