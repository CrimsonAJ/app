package i8;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class q {
    public static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f19136k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f19137l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f19138m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f19139a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19140b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19141c;

    /* renamed from: d, reason: collision with root package name */
    public final String f19142d;

    /* renamed from: e, reason: collision with root package name */
    public final String f19143e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f19144f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f19145g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f19146h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f19147i;

    public q(String str, String str2, long j4, String str3, String str4, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f19139a = str;
        this.f19140b = str2;
        this.f19141c = j4;
        this.f19142d = str3;
        this.f19143e = str4;
        this.f19144f = z9;
        this.f19145g = z10;
        this.f19146h = z11;
        this.f19147i = z12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (kotlin.jvm.internal.h.a(qVar.f19139a, this.f19139a) && kotlin.jvm.internal.h.a(qVar.f19140b, this.f19140b) && qVar.f19141c == this.f19141c && kotlin.jvm.internal.h.a(qVar.f19142d, this.f19142d) && kotlin.jvm.internal.h.a(qVar.f19143e, this.f19143e) && qVar.f19144f == this.f19144f && qVar.f19145g == this.f19145g && qVar.f19146h == this.f19146h && qVar.f19147i == this.f19147i) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int i10;
        int i11;
        int c3 = u0.z.c(this.f19140b, u0.z.c(this.f19139a, 527, 31), 31);
        long j4 = this.f19141c;
        int c9 = u0.z.c(this.f19143e, u0.z.c(this.f19142d, (c3 + ((int) (j4 ^ (j4 >>> 32)))) * 31, 31), 31);
        int i12 = 1237;
        if (this.f19144f) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        int i13 = (c9 + i9) * 31;
        if (this.f19145g) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i14 = (i13 + i10) * 31;
        if (this.f19146h) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i15 = (i14 + i11) * 31;
        if (this.f19147i) {
            i12 = 1231;
        }
        return i15 + i12;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19139a);
        sb.append('=');
        sb.append(this.f19140b);
        if (this.f19146h) {
            long j4 = this.f19141c;
            if (j4 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) o8.a.f21749a.get()).format(new Date(j4));
                kotlin.jvm.internal.h.d(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.f19147i) {
            sb.append("; domain=");
            sb.append(this.f19142d);
        }
        sb.append("; path=");
        sb.append(this.f19143e);
        if (this.f19144f) {
            sb.append("; secure");
        }
        if (this.f19145g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "toString()");
        return sb2;
    }
}
