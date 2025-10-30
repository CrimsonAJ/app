package com.anilab.data.model.response;

import W.g;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class VoteResponse {

    /* renamed from: a, reason: collision with root package name */
    public final int f14396a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14397b;

    public VoteResponse(@InterfaceC1717i(name = "score") int i9, @InterfaceC1717i(name = "count") int i10) {
        this.f14396a = i9;
        this.f14397b = i10;
    }

    public final VoteResponse copy(@InterfaceC1717i(name = "score") int i9, @InterfaceC1717i(name = "count") int i10) {
        return new VoteResponse(i9, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoteResponse)) {
            return false;
        }
        VoteResponse voteResponse = (VoteResponse) obj;
        return this.f14396a == voteResponse.f14396a && this.f14397b == voteResponse.f14397b;
    }

    public final int hashCode() {
        return (this.f14396a * 31) + this.f14397b;
    }

    public final String toString() {
        return "VoteResponse(score=" + this.f14396a + ", count=" + this.f14397b + ")";
    }
}
