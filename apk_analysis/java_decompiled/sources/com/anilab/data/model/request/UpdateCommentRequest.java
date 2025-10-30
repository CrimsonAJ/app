package com.anilab.data.model.request;

import W.g;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class UpdateCommentRequest {

    /* renamed from: a, reason: collision with root package name */
    public final String f13966a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13967b;

    public UpdateCommentRequest(@InterfaceC1717i(name = "id") String commentId, @InterfaceC1717i(name = "content") String content) {
        h.e(commentId, "commentId");
        h.e(content, "content");
        this.f13966a = commentId;
        this.f13967b = content;
    }

    public final UpdateCommentRequest copy(@InterfaceC1717i(name = "id") String commentId, @InterfaceC1717i(name = "content") String content) {
        h.e(commentId, "commentId");
        h.e(content, "content");
        return new UpdateCommentRequest(commentId, content);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateCommentRequest)) {
            return false;
        }
        UpdateCommentRequest updateCommentRequest = (UpdateCommentRequest) obj;
        return h.a(this.f13966a, updateCommentRequest.f13966a) && h.a(this.f13967b, updateCommentRequest.f13967b);
    }

    public final int hashCode() {
        return this.f13967b.hashCode() + (this.f13966a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateCommentRequest(commentId=");
        sb.append(this.f13966a);
        sb.append(", content=");
        return AbstractC0953k1.q(sb, this.f13967b, ")");
    }
}
