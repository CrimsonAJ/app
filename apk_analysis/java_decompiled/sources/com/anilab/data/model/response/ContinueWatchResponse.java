package com.anilab.data.model.response;

import W.g;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class ContinueWatchResponse {

    /* renamed from: a, reason: collision with root package name */
    public final Long f14064a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f14065b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f14066c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f14067d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f14068e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f14069f;

    /* renamed from: g, reason: collision with root package name */
    public final Float f14070g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f14071h;

    public ContinueWatchResponse(@InterfaceC1717i(name = "id") Long l9, @InterfaceC1717i(name = "user_id") Long l10, @InterfaceC1717i(name = "movie_id") Long l11, @InterfaceC1717i(name = "episode_id") Long l12, @InterfaceC1717i(name = "episode_number") Integer num, @InterfaceC1717i(name = "time") Long l13, @InterfaceC1717i(name = "percent") Float f9, @InterfaceC1717i(name = "updated_at") Long l14) {
        this.f14064a = l9;
        this.f14065b = l10;
        this.f14066c = l11;
        this.f14067d = l12;
        this.f14068e = num;
        this.f14069f = l13;
        this.f14070g = f9;
        this.f14071h = l14;
    }

    public final ContinueWatchResponse copy(@InterfaceC1717i(name = "id") Long l9, @InterfaceC1717i(name = "user_id") Long l10, @InterfaceC1717i(name = "movie_id") Long l11, @InterfaceC1717i(name = "episode_id") Long l12, @InterfaceC1717i(name = "episode_number") Integer num, @InterfaceC1717i(name = "time") Long l13, @InterfaceC1717i(name = "percent") Float f9, @InterfaceC1717i(name = "updated_at") Long l14) {
        return new ContinueWatchResponse(l9, l10, l11, l12, num, l13, f9, l14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContinueWatchResponse)) {
            return false;
        }
        ContinueWatchResponse continueWatchResponse = (ContinueWatchResponse) obj;
        return h.a(this.f14064a, continueWatchResponse.f14064a) && h.a(this.f14065b, continueWatchResponse.f14065b) && h.a(this.f14066c, continueWatchResponse.f14066c) && h.a(this.f14067d, continueWatchResponse.f14067d) && h.a(this.f14068e, continueWatchResponse.f14068e) && h.a(this.f14069f, continueWatchResponse.f14069f) && h.a(this.f14070g, continueWatchResponse.f14070g) && h.a(this.f14071h, continueWatchResponse.f14071h);
    }

    public final int hashCode() {
        Long l9 = this.f14064a;
        int hashCode = (l9 == null ? 0 : l9.hashCode()) * 31;
        Long l10 = this.f14065b;
        int hashCode2 = (hashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f14066c;
        int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.f14067d;
        int hashCode4 = (hashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Integer num = this.f14068e;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Long l13 = this.f14069f;
        int hashCode6 = (hashCode5 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Float f9 = this.f14070g;
        int hashCode7 = (hashCode6 + (f9 == null ? 0 : f9.hashCode())) * 31;
        Long l14 = this.f14071h;
        return hashCode7 + (l14 != null ? l14.hashCode() : 0);
    }

    public final String toString() {
        return "ContinueWatchResponse(id=" + this.f14064a + ", userId=" + this.f14065b + ", movieId=" + this.f14066c + ", episodeId=" + this.f14067d + ", number=" + this.f14068e + ", positionMs=" + this.f14069f + ", percent=" + this.f14070g + ", updatedAt=" + this.f14071h + ")";
    }
}
