package com.anilab.data.model.request;

import W.g;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class CreateVoteRequest {

    /* renamed from: a, reason: collision with root package name */
    public final String f13900a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13901b;

    public CreateVoteRequest(@InterfaceC1717i(name = "commentId") String commentId, @InterfaceC1717i(name = "voteType") int i9) {
        h.e(commentId, "commentId");
        this.f13900a = commentId;
        this.f13901b = i9;
    }

    public final CreateVoteRequest copy(@InterfaceC1717i(name = "commentId") String commentId, @InterfaceC1717i(name = "voteType") int i9) {
        h.e(commentId, "commentId");
        return new CreateVoteRequest(commentId, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateVoteRequest)) {
            return false;
        }
        CreateVoteRequest createVoteRequest = (CreateVoteRequest) obj;
        return h.a(this.f13900a, createVoteRequest.f13900a) && this.f13901b == createVoteRequest.f13901b;
    }

    public final int hashCode() {
        return (this.f13900a.hashCode() * 31) + this.f13901b;
    }

    public final String toString() {
        return "CreateVoteRequest(commentId=" + this.f13900a + ", voteType=" + this.f13901b + ")";
    }
}
