package com.anilab.data.model.request;

import W.g;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class CommentRequest {

    /* renamed from: a, reason: collision with root package name */
    public final long f13889a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13890b;

    public CommentRequest(@InterfaceC1717i(name = "movie_id") long j, @InterfaceC1717i(name = "content") String content) {
        h.e(content, "content");
        this.f13889a = j;
        this.f13890b = content;
    }

    public final CommentRequest copy(@InterfaceC1717i(name = "movie_id") long j, @InterfaceC1717i(name = "content") String content) {
        h.e(content, "content");
        return new CommentRequest(j, content);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentRequest)) {
            return false;
        }
        CommentRequest commentRequest = (CommentRequest) obj;
        return this.f13889a == commentRequest.f13889a && h.a(this.f13890b, commentRequest.f13890b);
    }

    public final int hashCode() {
        long j = this.f13889a;
        return this.f13890b.hashCode() + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        return "CommentRequest(movieId=" + this.f13889a + ", content=" + this.f13890b + ")";
    }
}
