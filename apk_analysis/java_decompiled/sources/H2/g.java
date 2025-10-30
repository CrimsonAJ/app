package H2;

import com.anilab.domain.model.Movie;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f3014a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f3015b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f3016c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f3017d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3018e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3019f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3020g;

    /* renamed from: h, reason: collision with root package name */
    public final long f3021h;

    /* renamed from: i, reason: collision with root package name */
    public final Movie f3022i;

    public g(long j, Long l9, Long l10, Long l11, int i9, long j4, int i10, long j9, Movie movie) {
        this.f3014a = j;
        this.f3015b = l9;
        this.f3016c = l10;
        this.f3017d = l11;
        this.f3018e = i9;
        this.f3019f = j4;
        this.f3020g = i10;
        this.f3021h = j9;
        this.f3022i = movie;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f3014a == gVar.f3014a && kotlin.jvm.internal.h.a(this.f3015b, gVar.f3015b) && kotlin.jvm.internal.h.a(this.f3016c, gVar.f3016c) && kotlin.jvm.internal.h.a(this.f3017d, gVar.f3017d) && this.f3018e == gVar.f3018e && this.f3019f == gVar.f3019f && this.f3020g == gVar.f3020g && this.f3021h == gVar.f3021h && kotlin.jvm.internal.h.a(this.f3022i, gVar.f3022i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        long j = this.f3014a;
        int i9 = ((int) (j ^ (j >>> 32))) * 31;
        int i10 = 0;
        Long l9 = this.f3015b;
        if (l9 == null) {
            hashCode = 0;
        } else {
            hashCode = l9.hashCode();
        }
        int i11 = (i9 + hashCode) * 31;
        Long l10 = this.f3016c;
        if (l10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l10.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        Long l11 = this.f3017d;
        if (l11 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l11.hashCode();
        }
        int i13 = (((i12 + hashCode3) * 31) + this.f3018e) * 31;
        long j4 = this.f3019f;
        int i14 = (((i13 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f3020g) * 31;
        long j9 = this.f3021h;
        int i15 = (i14 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        Movie movie = this.f3022i;
        if (movie != null) {
            i10 = movie.hashCode();
        }
        return i15 + i10;
    }

    public final String toString() {
        return "ContinueWatch(id=" + this.f3014a + ", userId=" + this.f3015b + ", movieId=" + this.f3016c + ", episodeId=" + this.f3017d + ", episodeNumber=" + this.f3018e + ", time=" + this.f3019f + ", percent=" + this.f3020g + ", updatedAt=" + this.f3021h + ", movie=" + this.f3022i + ")";
    }
}
