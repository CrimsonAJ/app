package com.anilab.data.model.response;

import W.g;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class MovieResponse {

    /* renamed from: a, reason: collision with root package name */
    public final long f14236a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14237b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14238c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14239d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14240e;

    /* renamed from: f, reason: collision with root package name */
    public final String f14241f;

    /* renamed from: g, reason: collision with root package name */
    public final String f14242g;

    /* renamed from: h, reason: collision with root package name */
    public final String f14243h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f14244i;
    public final Integer j;

    /* renamed from: k, reason: collision with root package name */
    public final String f14245k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f14246l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f14247m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f14248n;

    /* renamed from: o, reason: collision with root package name */
    public final Double f14249o;

    /* renamed from: p, reason: collision with root package name */
    public final Long f14250p;

    /* renamed from: q, reason: collision with root package name */
    public final List f14251q;

    /* renamed from: r, reason: collision with root package name */
    public final Integer f14252r;

    /* renamed from: s, reason: collision with root package name */
    public final String f14253s;

    /* renamed from: t, reason: collision with root package name */
    public final String f14254t;

    /* renamed from: u, reason: collision with root package name */
    public final Integer f14255u;

    public MovieResponse(@InterfaceC1717i(name = "id") long j, @InterfaceC1717i(name = "name_english") String str, @InterfaceC1717i(name = "name") String str2, @InterfaceC1717i(name = "name_synonyms") String str3, @InterfaceC1717i(name = "name_japanese") String str4, @InterfaceC1717i(name = "overview") String str5, @InterfaceC1717i(name = "poster_url") String str6, @InterfaceC1717i(name = "premiered_season") String str7, @InterfaceC1717i(name = "premiered_year") Integer num, @InterfaceC1717i(name = "type") Integer num2, @InterfaceC1717i(name = "slug_english") String str8, @InterfaceC1717i(name = "total_episodes") Integer num3, @InterfaceC1717i(name = "latest_episode") Integer num4, @InterfaceC1717i(name = "has_dub") Integer num5, @InterfaceC1717i(name = "mal_score") Double d9, @InterfaceC1717i(name = "update_at") Long l9, @InterfaceC1717i(name = "genres") List<GenreResponse> list, @InterfaceC1717i(name = "in_watch_list") Integer num6, @InterfaceC1717i(name = "rating_type") String str9, @InterfaceC1717i(name = "quality") String str10, @InterfaceC1717i(name = "is_pin") Integer num7) {
        this.f14236a = j;
        this.f14237b = str;
        this.f14238c = str2;
        this.f14239d = str3;
        this.f14240e = str4;
        this.f14241f = str5;
        this.f14242g = str6;
        this.f14243h = str7;
        this.f14244i = num;
        this.j = num2;
        this.f14245k = str8;
        this.f14246l = num3;
        this.f14247m = num4;
        this.f14248n = num5;
        this.f14249o = d9;
        this.f14250p = l9;
        this.f14251q = list;
        this.f14252r = num6;
        this.f14253s = str9;
        this.f14254t = str10;
        this.f14255u = num7;
    }

    public final MovieResponse copy(@InterfaceC1717i(name = "id") long j, @InterfaceC1717i(name = "name_english") String str, @InterfaceC1717i(name = "name") String str2, @InterfaceC1717i(name = "name_synonyms") String str3, @InterfaceC1717i(name = "name_japanese") String str4, @InterfaceC1717i(name = "overview") String str5, @InterfaceC1717i(name = "poster_url") String str6, @InterfaceC1717i(name = "premiered_season") String str7, @InterfaceC1717i(name = "premiered_year") Integer num, @InterfaceC1717i(name = "type") Integer num2, @InterfaceC1717i(name = "slug_english") String str8, @InterfaceC1717i(name = "total_episodes") Integer num3, @InterfaceC1717i(name = "latest_episode") Integer num4, @InterfaceC1717i(name = "has_dub") Integer num5, @InterfaceC1717i(name = "mal_score") Double d9, @InterfaceC1717i(name = "update_at") Long l9, @InterfaceC1717i(name = "genres") List<GenreResponse> list, @InterfaceC1717i(name = "in_watch_list") Integer num6, @InterfaceC1717i(name = "rating_type") String str9, @InterfaceC1717i(name = "quality") String str10, @InterfaceC1717i(name = "is_pin") Integer num7) {
        return new MovieResponse(j, str, str2, str3, str4, str5, str6, str7, num, num2, str8, num3, num4, num5, d9, l9, list, num6, str9, str10, num7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovieResponse)) {
            return false;
        }
        MovieResponse movieResponse = (MovieResponse) obj;
        return this.f14236a == movieResponse.f14236a && h.a(this.f14237b, movieResponse.f14237b) && h.a(this.f14238c, movieResponse.f14238c) && h.a(this.f14239d, movieResponse.f14239d) && h.a(this.f14240e, movieResponse.f14240e) && h.a(this.f14241f, movieResponse.f14241f) && h.a(this.f14242g, movieResponse.f14242g) && h.a(this.f14243h, movieResponse.f14243h) && h.a(this.f14244i, movieResponse.f14244i) && h.a(this.j, movieResponse.j) && h.a(this.f14245k, movieResponse.f14245k) && h.a(this.f14246l, movieResponse.f14246l) && h.a(this.f14247m, movieResponse.f14247m) && h.a(this.f14248n, movieResponse.f14248n) && h.a(this.f14249o, movieResponse.f14249o) && h.a(this.f14250p, movieResponse.f14250p) && h.a(this.f14251q, movieResponse.f14251q) && h.a(this.f14252r, movieResponse.f14252r) && h.a(this.f14253s, movieResponse.f14253s) && h.a(this.f14254t, movieResponse.f14254t) && h.a(this.f14255u, movieResponse.f14255u);
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
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        long j = this.f14236a;
        int i9 = ((int) (j ^ (j >>> 32))) * 31;
        int i10 = 0;
        String str = this.f14237b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (i9 + hashCode) * 31;
        String str2 = this.f14238c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str3 = this.f14239d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.f14240e;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        String str5 = this.f14241f;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        String str6 = this.f14242g;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        String str7 = this.f14243h;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i17 = (i16 + hashCode7) * 31;
        Integer num = this.f14244i;
        if (num == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num.hashCode();
        }
        int i18 = (i17 + hashCode8) * 31;
        Integer num2 = this.j;
        if (num2 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = num2.hashCode();
        }
        int i19 = (i18 + hashCode9) * 31;
        String str8 = this.f14245k;
        if (str8 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str8.hashCode();
        }
        int i20 = (i19 + hashCode10) * 31;
        Integer num3 = this.f14246l;
        if (num3 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = num3.hashCode();
        }
        int i21 = (i20 + hashCode11) * 31;
        Integer num4 = this.f14247m;
        if (num4 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = num4.hashCode();
        }
        int i22 = (i21 + hashCode12) * 31;
        Integer num5 = this.f14248n;
        if (num5 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = num5.hashCode();
        }
        int i23 = (i22 + hashCode13) * 31;
        Double d9 = this.f14249o;
        if (d9 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = d9.hashCode();
        }
        int i24 = (i23 + hashCode14) * 31;
        Long l9 = this.f14250p;
        if (l9 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = l9.hashCode();
        }
        int i25 = (i24 + hashCode15) * 31;
        List list = this.f14251q;
        if (list == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = list.hashCode();
        }
        int i26 = (i25 + hashCode16) * 31;
        Integer num6 = this.f14252r;
        if (num6 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = num6.hashCode();
        }
        int i27 = (i26 + hashCode17) * 31;
        String str9 = this.f14253s;
        if (str9 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = str9.hashCode();
        }
        int i28 = (i27 + hashCode18) * 31;
        String str10 = this.f14254t;
        if (str10 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = str10.hashCode();
        }
        int i29 = (i28 + hashCode19) * 31;
        Integer num7 = this.f14255u;
        if (num7 != null) {
            i10 = num7.hashCode();
        }
        return i29 + i10;
    }

    public final String toString() {
        return "MovieResponse(id=" + this.f14236a + ", title=" + this.f14237b + ", name=" + this.f14238c + ", nameSynonyms=" + this.f14239d + ", nameJapanese=" + this.f14240e + ", overview=" + this.f14241f + ", posterPath=" + this.f14242g + ", numberSeason=" + this.f14243h + ", year=" + this.f14244i + ", type=" + this.j + ", slug=" + this.f14245k + ", numberEpisode=" + this.f14246l + ", latestEpisode=" + this.f14247m + ", hasDub=" + this.f14248n + ", score=" + this.f14249o + ", updateAt=" + this.f14250p + ", genres=" + this.f14251q + ", inWatchList=" + this.f14252r + ", ratingType=" + this.f14253s + ", quality=" + this.f14254t + ", isPin=" + this.f14255u + ")";
    }

    public /* synthetic */ MovieResponse(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, String str8, Integer num3, Integer num4, Integer num5, Double d9, Long l9, List list, Integer num6, String str9, String str10, Integer num7, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3, str4, str5, str6, str7, num, num2, str8, num3, num4, num5, d9, l9, list, (i9 & 131072) != 0 ? null : num6, (i9 & 262144) != 0 ? null : str9, (i9 & 524288) != 0 ? null : str10, (i9 & 1048576) != 0 ? null : num7);
    }
}
