package com.anilab.data.model.response;

import W.g;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class CommentConfigResponse {

    /* renamed from: a, reason: collision with root package name */
    public final CommentVoteTypesResponse f14021a;

    public CommentConfigResponse(@InterfaceC1717i(name = "commentVoteTypes") CommentVoteTypesResponse commentVoteTypes) {
        h.e(commentVoteTypes, "commentVoteTypes");
        this.f14021a = commentVoteTypes;
    }

    public final CommentConfigResponse copy(@InterfaceC1717i(name = "commentVoteTypes") CommentVoteTypesResponse commentVoteTypes) {
        h.e(commentVoteTypes, "commentVoteTypes");
        return new CommentConfigResponse(commentVoteTypes);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommentConfigResponse) && h.a(this.f14021a, ((CommentConfigResponse) obj).f14021a);
    }

    public final int hashCode() {
        return this.f14021a.f14056a;
    }

    public final String toString() {
        return "CommentConfigResponse(commentVoteTypes=" + this.f14021a + ")";
    }
}
