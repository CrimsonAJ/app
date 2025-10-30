package com.anilab.data.model.response;

import W.g;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;
import u0.z;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class VoteCommentResponse {

    /* renamed from: a, reason: collision with root package name */
    public final String f14388a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14389b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14390c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14391d;

    public VoteCommentResponse(@InterfaceC1717i(name = "_id") String id, @InterfaceC1717i(name = "comment") String comment, @InterfaceC1717i(name = "userId") long j, @InterfaceC1717i(name = "type") int i9) {
        h.e(id, "id");
        h.e(comment, "comment");
        this.f14388a = id;
        this.f14389b = comment;
        this.f14390c = j;
        this.f14391d = i9;
    }

    public final VoteCommentResponse copy(@InterfaceC1717i(name = "_id") String id, @InterfaceC1717i(name = "comment") String comment, @InterfaceC1717i(name = "userId") long j, @InterfaceC1717i(name = "type") int i9) {
        h.e(id, "id");
        h.e(comment, "comment");
        return new VoteCommentResponse(id, comment, j, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoteCommentResponse)) {
            return false;
        }
        VoteCommentResponse voteCommentResponse = (VoteCommentResponse) obj;
        return h.a(this.f14388a, voteCommentResponse.f14388a) && h.a(this.f14389b, voteCommentResponse.f14389b) && this.f14390c == voteCommentResponse.f14390c && this.f14391d == voteCommentResponse.f14391d;
    }

    public final int hashCode() {
        int c3 = z.c(this.f14389b, this.f14388a.hashCode() * 31, 31);
        long j = this.f14390c;
        return ((c3 + ((int) (j ^ (j >>> 32)))) * 31) + this.f14391d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoteCommentResponse(id=");
        sb.append(this.f14388a);
        sb.append(", comment=");
        sb.append(this.f14389b);
        sb.append(", userId=");
        sb.append(this.f14390c);
        sb.append(", type=");
        return z.g(sb, this.f14391d, ")");
    }
}
