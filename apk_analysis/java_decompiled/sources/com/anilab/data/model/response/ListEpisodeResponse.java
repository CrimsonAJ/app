package com.anilab.data.model.response;

import W.g;
import java.util.List;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class ListEpisodeResponse {

    /* renamed from: a, reason: collision with root package name */
    public final List f14184a;

    /* renamed from: b, reason: collision with root package name */
    public final List f14185b;

    public ListEpisodeResponse(@InterfaceC1717i(name = "episodes") List<EpisodeResponse> list, @InterfaceC1717i(name = "continueWatch") List<ContinueWatchResponse> list2) {
        this.f14184a = list;
        this.f14185b = list2;
    }

    public final ListEpisodeResponse copy(@InterfaceC1717i(name = "episodes") List<EpisodeResponse> list, @InterfaceC1717i(name = "continueWatch") List<ContinueWatchResponse> list2) {
        return new ListEpisodeResponse(list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListEpisodeResponse)) {
            return false;
        }
        ListEpisodeResponse listEpisodeResponse = (ListEpisodeResponse) obj;
        return h.a(this.f14184a, listEpisodeResponse.f14184a) && h.a(this.f14185b, listEpisodeResponse.f14185b);
    }

    public final int hashCode() {
        List list = this.f14184a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f14185b;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "ListEpisodeResponse(episodes=" + this.f14184a + ", continueWatch=" + this.f14185b + ")";
    }
}
