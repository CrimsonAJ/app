package com.anilab.data.model.response;

import W.g;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class ReleaseCalendarResponse {

    /* renamed from: a, reason: collision with root package name */
    public final long f14295a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f14296b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f14297c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14298d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14299e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f14300f;

    /* renamed from: g, reason: collision with root package name */
    public final Long f14301g;

    /* renamed from: h, reason: collision with root package name */
    public final String f14302h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f14303i;
    public final MovieResponse j;

    public ReleaseCalendarResponse(@InterfaceC1717i(name = "id") long j, @InterfaceC1717i(name = "movie_id") Long l9, @InterfaceC1717i(name = "episode_number") Integer num, @InterfaceC1717i(name = "episode_name") String str, @InterfaceC1717i(name = "datetime") String str2, @InterfaceC1717i(name = "publish") Integer num2, @InterfaceC1717i(name = "created_at") Long l10, @InterfaceC1717i(name = "created_by") String str3, @InterfaceC1717i(name = "update_at") Long l11, @InterfaceC1717i(name = "movie") MovieResponse movie) {
        h.e(movie, "movie");
        this.f14295a = j;
        this.f14296b = l9;
        this.f14297c = num;
        this.f14298d = str;
        this.f14299e = str2;
        this.f14300f = num2;
        this.f14301g = l10;
        this.f14302h = str3;
        this.f14303i = l11;
        this.j = movie;
    }

    public final ReleaseCalendarResponse copy(@InterfaceC1717i(name = "id") long j, @InterfaceC1717i(name = "movie_id") Long l9, @InterfaceC1717i(name = "episode_number") Integer num, @InterfaceC1717i(name = "episode_name") String str, @InterfaceC1717i(name = "datetime") String str2, @InterfaceC1717i(name = "publish") Integer num2, @InterfaceC1717i(name = "created_at") Long l10, @InterfaceC1717i(name = "created_by") String str3, @InterfaceC1717i(name = "update_at") Long l11, @InterfaceC1717i(name = "movie") MovieResponse movie) {
        h.e(movie, "movie");
        return new ReleaseCalendarResponse(j, l9, num, str, str2, num2, l10, str3, l11, movie);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReleaseCalendarResponse)) {
            return false;
        }
        ReleaseCalendarResponse releaseCalendarResponse = (ReleaseCalendarResponse) obj;
        return this.f14295a == releaseCalendarResponse.f14295a && h.a(this.f14296b, releaseCalendarResponse.f14296b) && h.a(this.f14297c, releaseCalendarResponse.f14297c) && h.a(this.f14298d, releaseCalendarResponse.f14298d) && h.a(this.f14299e, releaseCalendarResponse.f14299e) && h.a(this.f14300f, releaseCalendarResponse.f14300f) && h.a(this.f14301g, releaseCalendarResponse.f14301g) && h.a(this.f14302h, releaseCalendarResponse.f14302h) && h.a(this.f14303i, releaseCalendarResponse.f14303i) && h.a(this.j, releaseCalendarResponse.j);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        long j = this.f14295a;
        int i9 = ((int) (j ^ (j >>> 32))) * 31;
        int i10 = 0;
        Long l9 = this.f14296b;
        if (l9 == null) {
            hashCode = 0;
        } else {
            hashCode = l9.hashCode();
        }
        int i11 = (i9 + hashCode) * 31;
        Integer num = this.f14297c;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str = this.f14298d;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str2 = this.f14299e;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        Integer num2 = this.f14300f;
        if (num2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num2.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        Long l10 = this.f14301g;
        if (l10 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = l10.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        String str3 = this.f14302h;
        if (str3 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str3.hashCode();
        }
        int i17 = (i16 + hashCode7) * 31;
        Long l11 = this.f14303i;
        if (l11 != null) {
            i10 = l11.hashCode();
        }
        return this.j.hashCode() + ((i17 + i10) * 31);
    }

    public final String toString() {
        return "ReleaseCalendarResponse(id=" + this.f14295a + ", movieId=" + this.f14296b + ", episodeNumber=" + this.f14297c + ", episodeName=" + this.f14298d + ", datetime=" + this.f14299e + ", publish=" + this.f14300f + ", createdAt=" + this.f14301g + ", createdBy=" + this.f14302h + ", updateAt=" + this.f14303i + ", movie=" + this.j + ")";
    }
}
