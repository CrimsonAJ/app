package co.notix;

/* loaded from: classes.dex */
public final class pj {

    /* renamed from: a, reason: collision with root package name */
    public final String f12974a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12975b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12976c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12977d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12978e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12979f;

    /* renamed from: g, reason: collision with root package name */
    public final String f12980g;

    /* renamed from: h, reason: collision with root package name */
    public final o f12981h;

    public pj(String user, String appId, String str, String str2, String str3, String str4, String str5, o cnt) {
        kotlin.jvm.internal.h.e(user, "user");
        kotlin.jvm.internal.h.e(appId, "appId");
        kotlin.jvm.internal.h.e(cnt, "cnt");
        this.f12974a = user;
        this.f12975b = appId;
        this.f12976c = str;
        this.f12977d = str2;
        this.f12978e = str3;
        this.f12979f = str4;
        this.f12980g = str5;
        this.f12981h = cnt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pj)) {
            return false;
        }
        pj pjVar = (pj) obj;
        return kotlin.jvm.internal.h.a(this.f12974a, pjVar.f12974a) && kotlin.jvm.internal.h.a(this.f12975b, pjVar.f12975b) && kotlin.jvm.internal.h.a(this.f12976c, pjVar.f12976c) && kotlin.jvm.internal.h.a(this.f12977d, pjVar.f12977d) && kotlin.jvm.internal.h.a(this.f12978e, pjVar.f12978e) && kotlin.jvm.internal.h.a(this.f12979f, pjVar.f12979f) && kotlin.jvm.internal.h.a(this.f12980g, pjVar.f12980g) && kotlin.jvm.internal.h.a(this.f12981h, pjVar.f12981h);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int a5 = h.a(this.f12975b, this.f12974a.hashCode() * 31, 31);
        String str = this.f12976c;
        int i9 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (a5 + hashCode) * 31;
        String str2 = this.f12977d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.f12978e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.f12979f;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        String str5 = this.f12980g;
        if (str5 != null) {
            i9 = str5.hashCode();
        }
        return this.f12981h.hashCode() + ((i13 + i9) * 31);
    }

    public final String toString() {
        return "PingData(user=" + this.f12974a + ", appId=" + this.f12975b + ", var1=" + this.f12976c + ", var2=" + this.f12977d + ", var3=" + this.f12978e + ", var4=" + this.f12979f + ", var5=" + this.f12980g + ", cnt=" + this.f12981h + ')';
    }
}
