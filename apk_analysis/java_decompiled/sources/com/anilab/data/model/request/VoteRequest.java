package com.anilab.data.model.request;

import W.g;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class VoteRequest {

    /* renamed from: a, reason: collision with root package name */
    public final long f13975a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13976b;

    public VoteRequest(@InterfaceC1717i(name = "movie_id") long j, @InterfaceC1717i(name = "vote") int i9) {
        this.f13975a = j;
        this.f13976b = i9;
    }

    public final VoteRequest copy(@InterfaceC1717i(name = "movie_id") long j, @InterfaceC1717i(name = "vote") int i9) {
        return new VoteRequest(j, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoteRequest)) {
            return false;
        }
        VoteRequest voteRequest = (VoteRequest) obj;
        return this.f13975a == voteRequest.f13975a && this.f13976b == voteRequest.f13976b;
    }

    public final int hashCode() {
        long j = this.f13975a;
        return (((int) (j ^ (j >>> 32))) * 31) + this.f13976b;
    }

    public final String toString() {
        return "VoteRequest(movieId=" + this.f13975a + ", voteType=" + this.f13976b + ")";
    }
}
