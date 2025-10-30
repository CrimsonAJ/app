package com.anilab.data.model.request;

import W.g;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class ReplyCommentRequest {

    /* renamed from: a, reason: collision with root package name */
    public final String f13947a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13948b;

    public ReplyCommentRequest(@InterfaceC1717i(name = "commentId") String commentId, @InterfaceC1717i(name = "content") String content) {
        h.e(commentId, "commentId");
        h.e(content, "content");
        this.f13947a = commentId;
        this.f13948b = content;
    }

    public final ReplyCommentRequest copy(@InterfaceC1717i(name = "commentId") String commentId, @InterfaceC1717i(name = "content") String content) {
        h.e(commentId, "commentId");
        h.e(content, "content");
        return new ReplyCommentRequest(commentId, content);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplyCommentRequest)) {
            return false;
        }
        ReplyCommentRequest replyCommentRequest = (ReplyCommentRequest) obj;
        return h.a(this.f13947a, replyCommentRequest.f13947a) && h.a(this.f13948b, replyCommentRequest.f13948b);
    }

    public final int hashCode() {
        return this.f13948b.hashCode() + (this.f13947a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReplyCommentRequest(commentId=");
        sb.append(this.f13947a);
        sb.append(", content=");
        return AbstractC0953k1.q(sb, this.f13948b, ")");
    }
}
