package com.anilab.data.model.response;

import W.g;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class CommentInfoResponse {

    /* renamed from: a, reason: collision with root package name */
    public final CommentResponse f14024a;

    /* renamed from: b, reason: collision with root package name */
    public final UserResponse f14025b;

    public CommentInfoResponse(@InterfaceC1717i(name = "comment") CommentResponse commentResponse, @InterfaceC1717i(name = "child_comment") UserResponse userResponse) {
        this.f14024a = commentResponse;
        this.f14025b = userResponse;
    }

    public final CommentInfoResponse copy(@InterfaceC1717i(name = "comment") CommentResponse commentResponse, @InterfaceC1717i(name = "child_comment") UserResponse userResponse) {
        return new CommentInfoResponse(commentResponse, userResponse);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentInfoResponse)) {
            return false;
        }
        CommentInfoResponse commentInfoResponse = (CommentInfoResponse) obj;
        return h.a(this.f14024a, commentInfoResponse.f14024a) && h.a(this.f14025b, commentInfoResponse.f14025b);
    }

    public final int hashCode() {
        CommentResponse commentResponse = this.f14024a;
        int hashCode = (commentResponse == null ? 0 : commentResponse.hashCode()) * 31;
        UserResponse userResponse = this.f14025b;
        return hashCode + (userResponse != null ? userResponse.hashCode() : 0);
    }

    public final String toString() {
        return "CommentInfoResponse(comment=" + this.f14024a + ", author=" + this.f14025b + ")";
    }
}
