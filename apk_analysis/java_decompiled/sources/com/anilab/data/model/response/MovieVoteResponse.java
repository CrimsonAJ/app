package com.anilab.data.model.response;

import W.g;
import java.util.List;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class MovieVoteResponse {

    /* renamed from: a, reason: collision with root package name */
    public final long f14264a;

    /* renamed from: b, reason: collision with root package name */
    public final List f14265b;

    public MovieVoteResponse(@InterfaceC1717i(name = "movieId") long j, @InterfaceC1717i(name = "voteData") List<VoteResponse> voteData) {
        h.e(voteData, "voteData");
        this.f14264a = j;
        this.f14265b = voteData;
    }

    public final MovieVoteResponse copy(@InterfaceC1717i(name = "movieId") long j, @InterfaceC1717i(name = "voteData") List<VoteResponse> voteData) {
        h.e(voteData, "voteData");
        return new MovieVoteResponse(j, voteData);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovieVoteResponse)) {
            return false;
        }
        MovieVoteResponse movieVoteResponse = (MovieVoteResponse) obj;
        return this.f14264a == movieVoteResponse.f14264a && h.a(this.f14265b, movieVoteResponse.f14265b);
    }

    public final int hashCode() {
        long j = this.f14264a;
        return this.f14265b.hashCode() + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        return "MovieVoteResponse(movieId=" + this.f14264a + ", voteData=" + this.f14265b + ")";
    }
}
