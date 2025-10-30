package co.notix;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f12649a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12650b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12651c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12652d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12653e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12654f;

    /* renamed from: g, reason: collision with root package name */
    public final String f12655g;

    /* renamed from: h, reason: collision with root package name */
    public final String f12656h;

    public l(String str, String str2, String str3, String str4, String str5, String impressionData, String str6, String str7) {
        kotlin.jvm.internal.h.e(impressionData, "impressionData");
        this.f12649a = str;
        this.f12650b = str2;
        this.f12651c = str3;
        this.f12652d = str4;
        this.f12653e = str5;
        this.f12654f = impressionData;
        this.f12655g = str6;
        this.f12656h = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.h.a(this.f12649a, lVar.f12649a) && kotlin.jvm.internal.h.a(this.f12650b, lVar.f12650b) && kotlin.jvm.internal.h.a(this.f12651c, lVar.f12651c) && kotlin.jvm.internal.h.a(this.f12652d, lVar.f12652d) && kotlin.jvm.internal.h.a(this.f12653e, lVar.f12653e) && kotlin.jvm.internal.h.a(this.f12654f, lVar.f12654f) && kotlin.jvm.internal.h.a(this.f12655g, lVar.f12655g) && kotlin.jvm.internal.h.a(this.f12656h, lVar.f12656h);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        String str = this.f12649a;
        int i9 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.f12650b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.f12651c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.f12652d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        String str5 = this.f12653e;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int a5 = h.a(this.f12654f, (i13 + hashCode5) * 31, 31);
        String str6 = this.f12655g;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i14 = (a5 + hashCode6) * 31;
        String str7 = this.f12656h;
        if (str7 != null) {
            i9 = str7.hashCode();
        }
        return i14 + i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdContentDto(title=");
        sb.append(this.f12649a);
        sb.append(", description=");
        sb.append(this.f12650b);
        sb.append(", imageUrl=");
        sb.append(this.f12651c);
        sb.append(", iconUrl=");
        sb.append(this.f12652d);
        sb.append(", targetUrl=");
        sb.append(this.f12653e);
        sb.append(", impressionData=");
        sb.append(this.f12654f);
        sb.append(", nurl=");
        sb.append(this.f12655g);
        sb.append(", adm=");
        return AbstractC0953k1.p(sb, this.f12656h, ')');
    }
}
