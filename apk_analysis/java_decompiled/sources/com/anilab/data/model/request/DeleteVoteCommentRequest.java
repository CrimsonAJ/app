package com.anilab.data.model.request;

import W.g;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class DeleteVoteCommentRequest {

    /* renamed from: a, reason: collision with root package name */
    public final String f13911a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13912b;

    public DeleteVoteCommentRequest(@InterfaceC1717i(name = "commentId") String str, @InterfaceC1717i(name = "voteType") int i9) {
        this.f13911a = str;
        this.f13912b = i9;
    }

    public final DeleteVoteCommentRequest copy(@InterfaceC1717i(name = "commentId") String str, @InterfaceC1717i(name = "voteType") int i9) {
        return new DeleteVoteCommentRequest(str, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteVoteCommentRequest)) {
            return false;
        }
        DeleteVoteCommentRequest deleteVoteCommentRequest = (DeleteVoteCommentRequest) obj;
        return h.a(this.f13911a, deleteVoteCommentRequest.f13911a) && this.f13912b == deleteVoteCommentRequest.f13912b;
    }

    public final int hashCode() {
        String str = this.f13911a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f13912b;
    }

    public final String toString() {
        return "DeleteVoteCommentRequest(commentId=" + this.f13911a + ", voteType=" + this.f13912b + ")";
    }
}
