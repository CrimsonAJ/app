package com.anilab.data.model.response;

import W.g;
import java.util.List;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class RelatedMovieResponse {

    /* renamed from: a, reason: collision with root package name */
    public final List f14292a;

    public RelatedMovieResponse(@InterfaceC1717i(name = "movies") List<MovieResponse> movies) {
        h.e(movies, "movies");
        this.f14292a = movies;
    }

    public final RelatedMovieResponse copy(@InterfaceC1717i(name = "movies") List<MovieResponse> movies) {
        h.e(movies, "movies");
        return new RelatedMovieResponse(movies);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RelatedMovieResponse) && h.a(this.f14292a, ((RelatedMovieResponse) obj).f14292a);
    }

    public final int hashCode() {
        return this.f14292a.hashCode();
    }

    public final String toString() {
        return "RelatedMovieResponse(movies=" + this.f14292a + ")";
    }
}
