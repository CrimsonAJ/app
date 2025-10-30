package H2;

import com.anilab.domain.model.Movie;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final long f3073a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f3074b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f3075c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3076d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3077e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f3078f;

    /* renamed from: g, reason: collision with root package name */
    public final Long f3079g;

    /* renamed from: h, reason: collision with root package name */
    public final String f3080h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f3081i;
    public final Movie j;

    public v(long j, Long l9, Integer num, String str, String str2, Integer num2, Long l10, String str3, Long l11, Movie movie) {
        this.f3073a = j;
        this.f3074b = l9;
        this.f3075c = num;
        this.f3076d = str;
        this.f3077e = str2;
        this.f3078f = num2;
        this.f3079g = l10;
        this.f3080h = str3;
        this.f3081i = l11;
        this.j = movie;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f3073a == vVar.f3073a && kotlin.jvm.internal.h.a(this.f3074b, vVar.f3074b) && kotlin.jvm.internal.h.a(this.f3075c, vVar.f3075c) && kotlin.jvm.internal.h.a(this.f3076d, vVar.f3076d) && kotlin.jvm.internal.h.a(this.f3077e, vVar.f3077e) && kotlin.jvm.internal.h.a(this.f3078f, vVar.f3078f) && kotlin.jvm.internal.h.a(this.f3079g, vVar.f3079g) && kotlin.jvm.internal.h.a(this.f3080h, vVar.f3080h) && kotlin.jvm.internal.h.a(this.f3081i, vVar.f3081i) && kotlin.jvm.internal.h.a(this.j, vVar.j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        long j = this.f3073a;
        int i9 = ((int) (j ^ (j >>> 32))) * 31;
        int i10 = 0;
        Long l9 = this.f3074b;
        if (l9 == null) {
            hashCode = 0;
        } else {
            hashCode = l9.hashCode();
        }
        int i11 = (i9 + hashCode) * 31;
        Integer num = this.f3075c;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str = this.f3076d;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str2 = this.f3077e;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        Integer num2 = this.f3078f;
        if (num2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num2.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        Long l10 = this.f3079g;
        if (l10 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = l10.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        String str3 = this.f3080h;
        if (str3 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str3.hashCode();
        }
        int i17 = (i16 + hashCode7) * 31;
        Long l11 = this.f3081i;
        if (l11 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = l11.hashCode();
        }
        int i18 = (i17 + hashCode8) * 31;
        Movie movie = this.j;
        if (movie != null) {
            i10 = movie.hashCode();
        }
        return i18 + i10;
    }

    public final String toString() {
        return "ReleaseCalendar(id=" + this.f3073a + ", movieId=" + this.f3074b + ", episodeNumber=" + this.f3075c + ", episodeName=" + this.f3076d + ", datetime=" + this.f3077e + ", publish=" + this.f3078f + ", createdAt=" + this.f3079g + ", createdBy=" + this.f3080h + ", updateAt=" + this.f3081i + ", movie=" + this.j + ")";
    }
}
