package com.anilab.data.model.request;

import W.g;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class MovieIdRequest {

    /* renamed from: a, reason: collision with root package name */
    public final long f13931a;

    public MovieIdRequest(@InterfaceC1717i(name = "movie_id") long j) {
        this.f13931a = j;
    }

    public final MovieIdRequest copy(@InterfaceC1717i(name = "movie_id") long j) {
        return new MovieIdRequest(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MovieIdRequest) && this.f13931a == ((MovieIdRequest) obj).f13931a;
    }

    public final int hashCode() {
        long j = this.f13931a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "MovieIdRequest(movieId=" + this.f13931a + ")";
    }
}
