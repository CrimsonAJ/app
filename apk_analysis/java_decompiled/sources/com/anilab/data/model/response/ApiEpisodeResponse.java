package com.anilab.data.model.response;

import W.g;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class ApiEpisodeResponse {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f13996a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f13997b;

    /* renamed from: c, reason: collision with root package name */
    public final EpisodeDetailResponse f13998c;

    public ApiEpisodeResponse(@InterfaceC1717i(name = "success") Boolean bool, @InterfaceC1717i(name = "code") Integer num, @InterfaceC1717i(name = "result") EpisodeDetailResponse episodeDetailResponse) {
        this.f13996a = bool;
        this.f13997b = num;
        this.f13998c = episodeDetailResponse;
    }

    public final ApiEpisodeResponse copy(@InterfaceC1717i(name = "success") Boolean bool, @InterfaceC1717i(name = "code") Integer num, @InterfaceC1717i(name = "result") EpisodeDetailResponse episodeDetailResponse) {
        return new ApiEpisodeResponse(bool, num, episodeDetailResponse);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiEpisodeResponse)) {
            return false;
        }
        ApiEpisodeResponse apiEpisodeResponse = (ApiEpisodeResponse) obj;
        return h.a(this.f13996a, apiEpisodeResponse.f13996a) && h.a(this.f13997b, apiEpisodeResponse.f13997b) && h.a(this.f13998c, apiEpisodeResponse.f13998c);
    }

    public final int hashCode() {
        Boolean bool = this.f13996a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.f13997b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        EpisodeDetailResponse episodeDetailResponse = this.f13998c;
        return hashCode2 + (episodeDetailResponse != null ? episodeDetailResponse.hashCode() : 0);
    }

    public final String toString() {
        return "ApiEpisodeResponse(success=" + this.f13996a + ", code=" + this.f13997b + ", result=" + this.f13998c + ")";
    }
}
