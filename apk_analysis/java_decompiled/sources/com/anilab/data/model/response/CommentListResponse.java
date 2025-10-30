package com.anilab.data.model.response;

import W.g;
import java.util.List;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class CommentListResponse {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f14029a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f14030b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f14031c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f14032d;

    /* renamed from: e, reason: collision with root package name */
    public final List f14033e;

    /* renamed from: f, reason: collision with root package name */
    public final List f14034f;

    /* renamed from: g, reason: collision with root package name */
    public final List f14035g;

    public CommentListResponse(@InterfaceC1717i(name = "page") Integer num, @InterfaceC1717i(name = "limit") Integer num2, @InterfaceC1717i(name = "total_pages") Integer num3, @InterfaceC1717i(name = "count") Long l9, @InterfaceC1717i(name = "rows") List<CommentResponse> list, @InterfaceC1717i(name = "users") List<UserResponse> list2, @InterfaceC1717i(name = "voteData") List<VoteCommentResponse> list3) {
        this.f14029a = num;
        this.f14030b = num2;
        this.f14031c = num3;
        this.f14032d = l9;
        this.f14033e = list;
        this.f14034f = list2;
        this.f14035g = list3;
    }

    public final CommentListResponse copy(@InterfaceC1717i(name = "page") Integer num, @InterfaceC1717i(name = "limit") Integer num2, @InterfaceC1717i(name = "total_pages") Integer num3, @InterfaceC1717i(name = "count") Long l9, @InterfaceC1717i(name = "rows") List<CommentResponse> list, @InterfaceC1717i(name = "users") List<UserResponse> list2, @InterfaceC1717i(name = "voteData") List<VoteCommentResponse> list3) {
        return new CommentListResponse(num, num2, num3, l9, list, list2, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentListResponse)) {
            return false;
        }
        CommentListResponse commentListResponse = (CommentListResponse) obj;
        return h.a(this.f14029a, commentListResponse.f14029a) && h.a(this.f14030b, commentListResponse.f14030b) && h.a(this.f14031c, commentListResponse.f14031c) && h.a(this.f14032d, commentListResponse.f14032d) && h.a(this.f14033e, commentListResponse.f14033e) && h.a(this.f14034f, commentListResponse.f14034f) && h.a(this.f14035g, commentListResponse.f14035g);
    }

    public final int hashCode() {
        Integer num = this.f14029a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f14030b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f14031c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l9 = this.f14032d;
        int hashCode4 = (hashCode3 + (l9 == null ? 0 : l9.hashCode())) * 31;
        List list = this.f14033e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f14034f;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f14035g;
        return hashCode6 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        return "CommentListResponse(page=" + this.f14029a + ", limit=" + this.f14030b + ", totalPages=" + this.f14031c + ", count=" + this.f14032d + ", result=" + this.f14033e + ", users=" + this.f14034f + ", votes=" + this.f14035g + ")";
    }
}
