package com.anilab.data.model.response;

import W.g;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;
import u0.z;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class CommentVoteTypesResponse {

    /* renamed from: a, reason: collision with root package name */
    public final int f14056a;

    public CommentVoteTypesResponse(@InterfaceC1717i(name = "like") int i9) {
        this.f14056a = i9;
    }

    public final CommentVoteTypesResponse copy(@InterfaceC1717i(name = "like") int i9) {
        return new CommentVoteTypesResponse(i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommentVoteTypesResponse) && this.f14056a == ((CommentVoteTypesResponse) obj).f14056a;
    }

    public final int hashCode() {
        return this.f14056a;
    }

    public final String toString() {
        return z.g(new StringBuilder("CommentVoteTypesResponse(like="), this.f14056a, ")");
    }
}
