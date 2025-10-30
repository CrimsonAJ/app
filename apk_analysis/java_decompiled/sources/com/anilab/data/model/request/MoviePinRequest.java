package com.anilab.data.model.request;

import W.g;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class MoviePinRequest {

    /* renamed from: a, reason: collision with root package name */
    public final long f13934a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13935b;

    public MoviePinRequest(@InterfaceC1717i(name = "movie_id") long j, @InterfaceC1717i(name = "is_pin") int i9) {
        this.f13934a = j;
        this.f13935b = i9;
    }

    public final MoviePinRequest copy(@InterfaceC1717i(name = "movie_id") long j, @InterfaceC1717i(name = "is_pin") int i9) {
        return new MoviePinRequest(j, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoviePinRequest)) {
            return false;
        }
        MoviePinRequest moviePinRequest = (MoviePinRequest) obj;
        return this.f13934a == moviePinRequest.f13934a && this.f13935b == moviePinRequest.f13935b;
    }

    public final int hashCode() {
        long j = this.f13934a;
        return (((int) (j ^ (j >>> 32))) * 31) + this.f13935b;
    }

    public final String toString() {
        return "MoviePinRequest(movieId=" + this.f13934a + ", isPin=" + this.f13935b + ")";
    }
}
