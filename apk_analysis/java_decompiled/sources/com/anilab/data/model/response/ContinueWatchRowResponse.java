package com.anilab.data.model.response;

import W.g;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class ContinueWatchRowResponse {

    /* renamed from: a, reason: collision with root package name */
    public final long f14076a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f14077b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f14078c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f14079d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f14080e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f14081f;

    /* renamed from: g, reason: collision with root package name */
    public final Float f14082g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f14083h;

    /* renamed from: i, reason: collision with root package name */
    public final MovieResponse f14084i;

    public ContinueWatchRowResponse(@InterfaceC1717i(name = "id") long j, @InterfaceC1717i(name = "user_id") Long l9, @InterfaceC1717i(name = "movie_id") Long l10, @InterfaceC1717i(name = "episode_id") Long l11, @InterfaceC1717i(name = "episode_number") Integer num, @InterfaceC1717i(name = "time") Long l12, @InterfaceC1717i(name = "percent") Float f9, @InterfaceC1717i(name = "updated_at") Long l13, @InterfaceC1717i(name = "movie") MovieResponse movieResponse) {
        this.f14076a = j;
        this.f14077b = l9;
        this.f14078c = l10;
        this.f14079d = l11;
        this.f14080e = num;
        this.f14081f = l12;
        this.f14082g = f9;
        this.f14083h = l13;
        this.f14084i = movieResponse;
    }

    public final ContinueWatchRowResponse copy(@InterfaceC1717i(name = "id") long j, @InterfaceC1717i(name = "user_id") Long l9, @InterfaceC1717i(name = "movie_id") Long l10, @InterfaceC1717i(name = "episode_id") Long l11, @InterfaceC1717i(name = "episode_number") Integer num, @InterfaceC1717i(name = "time") Long l12, @InterfaceC1717i(name = "percent") Float f9, @InterfaceC1717i(name = "updated_at") Long l13, @InterfaceC1717i(name = "movie") MovieResponse movieResponse) {
        return new ContinueWatchRowResponse(j, l9, l10, l11, num, l12, f9, l13, movieResponse);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContinueWatchRowResponse)) {
            return false;
        }
        ContinueWatchRowResponse continueWatchRowResponse = (ContinueWatchRowResponse) obj;
        return this.f14076a == continueWatchRowResponse.f14076a && h.a(this.f14077b, continueWatchRowResponse.f14077b) && h.a(this.f14078c, continueWatchRowResponse.f14078c) && h.a(this.f14079d, continueWatchRowResponse.f14079d) && h.a(this.f14080e, continueWatchRowResponse.f14080e) && h.a(this.f14081f, continueWatchRowResponse.f14081f) && h.a(this.f14082g, continueWatchRowResponse.f14082g) && h.a(this.f14083h, continueWatchRowResponse.f14083h) && h.a(this.f14084i, continueWatchRowResponse.f14084i);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        long j = this.f14076a;
        int i9 = ((int) (j ^ (j >>> 32))) * 31;
        int i10 = 0;
        Long l9 = this.f14077b;
        if (l9 == null) {
            hashCode = 0;
        } else {
            hashCode = l9.hashCode();
        }
        int i11 = (i9 + hashCode) * 31;
        Long l10 = this.f14078c;
        if (l10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l10.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        Long l11 = this.f14079d;
        if (l11 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l11.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        Integer num = this.f14080e;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        Long l12 = this.f14081f;
        if (l12 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = l12.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        Float f9 = this.f14082g;
        if (f9 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = f9.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        Long l13 = this.f14083h;
        if (l13 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = l13.hashCode();
        }
        int i17 = (i16 + hashCode7) * 31;
        MovieResponse movieResponse = this.f14084i;
        if (movieResponse != null) {
            i10 = movieResponse.hashCode();
        }
        return i17 + i10;
    }

    public final String toString() {
        return "ContinueWatchRowResponse(id=" + this.f14076a + ", userId=" + this.f14077b + ", movieId=" + this.f14078c + ", episodeId=" + this.f14079d + ", number=" + this.f14080e + ", positionMs=" + this.f14081f + ", percent=" + this.f14082g + ", updatedAt=" + this.f14083h + ", movie=" + this.f14084i + ")";
    }
}
