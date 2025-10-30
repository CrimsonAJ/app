package com.anilab.data.model.response;

import W.g;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class CommentResponse {

    /* renamed from: a, reason: collision with root package name */
    public final String f14042a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14043b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14044c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14045d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f14046e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f14047f;

    /* renamed from: g, reason: collision with root package name */
    public final String f14048g;

    /* renamed from: h, reason: collision with root package name */
    public final long f14049h;

    /* renamed from: i, reason: collision with root package name */
    public final long f14050i;

    public CommentResponse(@InterfaceC1717i(name = "_id") String id, @InterfaceC1717i(name = "userId") long j, @InterfaceC1717i(name = "movieId") long j4, @InterfaceC1717i(name = "content") String str, @InterfaceC1717i(name = "totalLike") Integer num, @InterfaceC1717i(name = "totalChildren") Integer num2, @InterfaceC1717i(name = "parentId") String str2, @InterfaceC1717i(name = "createdAt") long j9, @InterfaceC1717i(name = "updatedAt") long j10) {
        h.e(id, "id");
        this.f14042a = id;
        this.f14043b = j;
        this.f14044c = j4;
        this.f14045d = str;
        this.f14046e = num;
        this.f14047f = num2;
        this.f14048g = str2;
        this.f14049h = j9;
        this.f14050i = j10;
    }

    public final CommentResponse copy(@InterfaceC1717i(name = "_id") String id, @InterfaceC1717i(name = "userId") long j, @InterfaceC1717i(name = "movieId") long j4, @InterfaceC1717i(name = "content") String str, @InterfaceC1717i(name = "totalLike") Integer num, @InterfaceC1717i(name = "totalChildren") Integer num2, @InterfaceC1717i(name = "parentId") String str2, @InterfaceC1717i(name = "createdAt") long j9, @InterfaceC1717i(name = "updatedAt") long j10) {
        h.e(id, "id");
        return new CommentResponse(id, j, j4, str, num, num2, str2, j9, j10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentResponse)) {
            return false;
        }
        CommentResponse commentResponse = (CommentResponse) obj;
        return h.a(this.f14042a, commentResponse.f14042a) && this.f14043b == commentResponse.f14043b && this.f14044c == commentResponse.f14044c && h.a(this.f14045d, commentResponse.f14045d) && h.a(this.f14046e, commentResponse.f14046e) && h.a(this.f14047f, commentResponse.f14047f) && h.a(this.f14048g, commentResponse.f14048g) && this.f14049h == commentResponse.f14049h && this.f14050i == commentResponse.f14050i;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f14042a.hashCode() * 31;
        long j = this.f14043b;
        int i9 = (hashCode4 + ((int) (j ^ (j >>> 32)))) * 31;
        long j4 = this.f14044c;
        int i10 = (i9 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        int i11 = 0;
        String str = this.f14045d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (i10 + hashCode) * 31;
        Integer num = this.f14046e;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        Integer num2 = this.f14047f;
        if (num2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num2.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        String str2 = this.f14048g;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        int i15 = (i14 + i11) * 31;
        long j9 = this.f14049h;
        int i16 = (i15 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f14050i;
        return i16 + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "CommentResponse(id=" + this.f14042a + ", userId=" + this.f14043b + ", movieId=" + this.f14044c + ", content=" + this.f14045d + ", totalLike=" + this.f14046e + ", totalChildren=" + this.f14047f + ", parentId=" + this.f14048g + ", createdAt=" + this.f14049h + ", updatedAt=" + this.f14050i + ")";
    }
}
