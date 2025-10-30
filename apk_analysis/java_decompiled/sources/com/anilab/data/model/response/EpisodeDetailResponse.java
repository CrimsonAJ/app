package com.anilab.data.model.response;

import W.g;
import java.util.List;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class EpisodeDetailResponse {

    /* renamed from: a, reason: collision with root package name */
    public final Long f14097a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f14098b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f14099c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f14100d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14101e;

    /* renamed from: f, reason: collision with root package name */
    public final String f14102f;

    /* renamed from: g, reason: collision with root package name */
    public final String f14103g;

    /* renamed from: h, reason: collision with root package name */
    public final String f14104h;

    /* renamed from: i, reason: collision with root package name */
    public final String f14105i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final String f14106k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f14107l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f14108m;

    /* renamed from: n, reason: collision with root package name */
    public final Long f14109n;

    /* renamed from: o, reason: collision with root package name */
    public final Long f14110o;

    /* renamed from: p, reason: collision with root package name */
    public final StreamingResponse f14111p;

    /* renamed from: q, reason: collision with root package name */
    public final List f14112q;

    /* renamed from: r, reason: collision with root package name */
    public final List f14113r;

    /* renamed from: s, reason: collision with root package name */
    public final List f14114s;

    /* renamed from: t, reason: collision with root package name */
    public final List f14115t;

    /* renamed from: u, reason: collision with root package name */
    public final List f14116u;

    /* renamed from: v, reason: collision with root package name */
    public final List f14117v;

    public EpisodeDetailResponse(@InterfaceC1717i(name = "id") Long l9, @InterfaceC1717i(name = "movie_id") Long l10, @InterfaceC1717i(name = "movie_mal_id") Long l11, @InterfaceC1717i(name = "number") Integer num, @InterfaceC1717i(name = "name") String str, @InterfaceC1717i(name = "name_english") String str2, @InterfaceC1717i(name = "name_japanese") String str3, @InterfaceC1717i(name = "slug") String str4, @InterfaceC1717i(name = "slug_english") String str5, @InterfaceC1717i(name = "overview") String str6, @InterfaceC1717i(name = "aired") String str7, @InterfaceC1717i(name = "is_filler") Integer num2, @InterfaceC1717i(name = "publish") Integer num3, @InterfaceC1717i(name = "created_at") Long l12, @InterfaceC1717i(name = "updated_at") Long l13, @InterfaceC1717i(name = "dataStream") StreamingResponse streamingResponse, @InterfaceC1717i(name = "subs") List<SubResponse> list, @InterfaceC1717i(name = "headers") List<StreamHeadersResponse> list2, @InterfaceC1717i(name = "sub_intro") List<String> list3, @InterfaceC1717i(name = "sub_outro") List<String> list4, @InterfaceC1717i(name = "dub_intro") List<String> list5, @InterfaceC1717i(name = "dub_outro") List<String> list6) {
        this.f14097a = l9;
        this.f14098b = l10;
        this.f14099c = l11;
        this.f14100d = num;
        this.f14101e = str;
        this.f14102f = str2;
        this.f14103g = str3;
        this.f14104h = str4;
        this.f14105i = str5;
        this.j = str6;
        this.f14106k = str7;
        this.f14107l = num2;
        this.f14108m = num3;
        this.f14109n = l12;
        this.f14110o = l13;
        this.f14111p = streamingResponse;
        this.f14112q = list;
        this.f14113r = list2;
        this.f14114s = list3;
        this.f14115t = list4;
        this.f14116u = list5;
        this.f14117v = list6;
    }

    public final EpisodeDetailResponse copy(@InterfaceC1717i(name = "id") Long l9, @InterfaceC1717i(name = "movie_id") Long l10, @InterfaceC1717i(name = "movie_mal_id") Long l11, @InterfaceC1717i(name = "number") Integer num, @InterfaceC1717i(name = "name") String str, @InterfaceC1717i(name = "name_english") String str2, @InterfaceC1717i(name = "name_japanese") String str3, @InterfaceC1717i(name = "slug") String str4, @InterfaceC1717i(name = "slug_english") String str5, @InterfaceC1717i(name = "overview") String str6, @InterfaceC1717i(name = "aired") String str7, @InterfaceC1717i(name = "is_filler") Integer num2, @InterfaceC1717i(name = "publish") Integer num3, @InterfaceC1717i(name = "created_at") Long l12, @InterfaceC1717i(name = "updated_at") Long l13, @InterfaceC1717i(name = "dataStream") StreamingResponse streamingResponse, @InterfaceC1717i(name = "subs") List<SubResponse> list, @InterfaceC1717i(name = "headers") List<StreamHeadersResponse> list2, @InterfaceC1717i(name = "sub_intro") List<String> list3, @InterfaceC1717i(name = "sub_outro") List<String> list4, @InterfaceC1717i(name = "dub_intro") List<String> list5, @InterfaceC1717i(name = "dub_outro") List<String> list6) {
        return new EpisodeDetailResponse(l9, l10, l11, num, str, str2, str3, str4, str5, str6, str7, num2, num3, l12, l13, streamingResponse, list, list2, list3, list4, list5, list6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpisodeDetailResponse)) {
            return false;
        }
        EpisodeDetailResponse episodeDetailResponse = (EpisodeDetailResponse) obj;
        return h.a(this.f14097a, episodeDetailResponse.f14097a) && h.a(this.f14098b, episodeDetailResponse.f14098b) && h.a(this.f14099c, episodeDetailResponse.f14099c) && h.a(this.f14100d, episodeDetailResponse.f14100d) && h.a(this.f14101e, episodeDetailResponse.f14101e) && h.a(this.f14102f, episodeDetailResponse.f14102f) && h.a(this.f14103g, episodeDetailResponse.f14103g) && h.a(this.f14104h, episodeDetailResponse.f14104h) && h.a(this.f14105i, episodeDetailResponse.f14105i) && h.a(this.j, episodeDetailResponse.j) && h.a(this.f14106k, episodeDetailResponse.f14106k) && h.a(this.f14107l, episodeDetailResponse.f14107l) && h.a(this.f14108m, episodeDetailResponse.f14108m) && h.a(this.f14109n, episodeDetailResponse.f14109n) && h.a(this.f14110o, episodeDetailResponse.f14110o) && h.a(this.f14111p, episodeDetailResponse.f14111p) && h.a(this.f14112q, episodeDetailResponse.f14112q) && h.a(this.f14113r, episodeDetailResponse.f14113r) && h.a(this.f14114s, episodeDetailResponse.f14114s) && h.a(this.f14115t, episodeDetailResponse.f14115t) && h.a(this.f14116u, episodeDetailResponse.f14116u) && h.a(this.f14117v, episodeDetailResponse.f14117v);
    }

    public final int hashCode() {
        Long l9 = this.f14097a;
        int hashCode = (l9 == null ? 0 : l9.hashCode()) * 31;
        Long l10 = this.f14098b;
        int hashCode2 = (hashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f14099c;
        int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Integer num = this.f14100d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f14101e;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f14102f;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f14103g;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f14104h;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f14105i;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.j;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f14106k;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num2 = this.f14107l;
        int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f14108m;
        int hashCode13 = (hashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l12 = this.f14109n;
        int hashCode14 = (hashCode13 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f14110o;
        int hashCode15 = (hashCode14 + (l13 == null ? 0 : l13.hashCode())) * 31;
        StreamingResponse streamingResponse = this.f14111p;
        int hashCode16 = (hashCode15 + (streamingResponse == null ? 0 : streamingResponse.hashCode())) * 31;
        List list = this.f14112q;
        int hashCode17 = (hashCode16 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f14113r;
        int hashCode18 = (hashCode17 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f14114s;
        int hashCode19 = (hashCode18 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.f14115t;
        int hashCode20 = (hashCode19 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.f14116u;
        int hashCode21 = (hashCode20 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List list6 = this.f14117v;
        return hashCode21 + (list6 != null ? list6.hashCode() : 0);
    }

    public final String toString() {
        return "EpisodeDetailResponse(id=" + this.f14097a + ", movieId=" + this.f14098b + ", movieMalId=" + this.f14099c + ", number=" + this.f14100d + ", name=" + this.f14101e + ", nameEnglish=" + this.f14102f + ", nameJapanese=" + this.f14103g + ", slug=" + this.f14104h + ", slugEnglish=" + this.f14105i + ", overview=" + this.j + ", aired=" + this.f14106k + ", isFiller=" + this.f14107l + ", publish=" + this.f14108m + ", createdAt=" + this.f14109n + ", updatedAt=" + this.f14110o + ", streaming=" + this.f14111p + ", subs=" + this.f14112q + ", headers=" + this.f14113r + ", subIntro=" + this.f14114s + ", subOutro=" + this.f14115t + ", dubIntro=" + this.f14116u + ", dubOutro=" + this.f14117v + ")";
    }
}
