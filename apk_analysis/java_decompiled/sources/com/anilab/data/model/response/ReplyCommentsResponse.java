package com.anilab.data.model.response;

import W.g;
import java.util.List;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class ReplyCommentsResponse {

    /* renamed from: a, reason: collision with root package name */
    public final List f14310a;

    /* renamed from: b, reason: collision with root package name */
    public final List f14311b;

    /* renamed from: c, reason: collision with root package name */
    public final List f14312c;

    public ReplyCommentsResponse(@InterfaceC1717i(name = "comments") List<CommentResponse> list, @InterfaceC1717i(name = "users") List<UserResponse> list2, @InterfaceC1717i(name = "voteData") List<VoteCommentResponse> list3) {
        this.f14310a = list;
        this.f14311b = list2;
        this.f14312c = list3;
    }

    public final ReplyCommentsResponse copy(@InterfaceC1717i(name = "comments") List<CommentResponse> list, @InterfaceC1717i(name = "users") List<UserResponse> list2, @InterfaceC1717i(name = "voteData") List<VoteCommentResponse> list3) {
        return new ReplyCommentsResponse(list, list2, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplyCommentsResponse)) {
            return false;
        }
        ReplyCommentsResponse replyCommentsResponse = (ReplyCommentsResponse) obj;
        return h.a(this.f14310a, replyCommentsResponse.f14310a) && h.a(this.f14311b, replyCommentsResponse.f14311b) && h.a(this.f14312c, replyCommentsResponse.f14312c);
    }

    public final int hashCode() {
        List list = this.f14310a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f14311b;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f14312c;
        return hashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        return "ReplyCommentsResponse(comments=" + this.f14310a + ", users=" + this.f14311b + ", votes=" + this.f14312c + ")";
    }
}
