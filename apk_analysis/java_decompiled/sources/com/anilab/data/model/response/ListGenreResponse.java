package com.anilab.data.model.response;

import W.g;
import java.util.List;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class ListGenreResponse {

    /* renamed from: a, reason: collision with root package name */
    public final List f14189a;

    public ListGenreResponse(@InterfaceC1717i(name = "genres") List<GenreResponse> genres) {
        h.e(genres, "genres");
        this.f14189a = genres;
    }

    public final ListGenreResponse copy(@InterfaceC1717i(name = "genres") List<GenreResponse> genres) {
        h.e(genres, "genres");
        return new ListGenreResponse(genres);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ListGenreResponse) && h.a(this.f14189a, ((ListGenreResponse) obj).f14189a);
    }

    public final int hashCode() {
        return this.f14189a.hashCode();
    }

    public final String toString() {
        return "ListGenreResponse(genres=" + this.f14189a + ")";
    }
}
