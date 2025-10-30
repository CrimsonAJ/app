package com.anilab.data.model.response;

import W.g;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class GenreResponse {

    /* renamed from: a, reason: collision with root package name */
    public final long f14147a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14148b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14149c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f14150d;

    public GenreResponse(@InterfaceC1717i(name = "id") long j, @InterfaceC1717i(name = "name") String str, @InterfaceC1717i(name = "slug") String str2, @InterfaceC1717i(name = "publish") Integer num) {
        this.f14147a = j;
        this.f14148b = str;
        this.f14149c = str2;
        this.f14150d = num;
    }

    public final GenreResponse copy(@InterfaceC1717i(name = "id") long j, @InterfaceC1717i(name = "name") String str, @InterfaceC1717i(name = "slug") String str2, @InterfaceC1717i(name = "publish") Integer num) {
        return new GenreResponse(j, str, str2, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenreResponse)) {
            return false;
        }
        GenreResponse genreResponse = (GenreResponse) obj;
        return this.f14147a == genreResponse.f14147a && h.a(this.f14148b, genreResponse.f14148b) && h.a(this.f14149c, genreResponse.f14149c) && h.a(this.f14150d, genreResponse.f14150d);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        long j = this.f14147a;
        int i9 = ((int) (j ^ (j >>> 32))) * 31;
        int i10 = 0;
        String str = this.f14148b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (i9 + hashCode) * 31;
        String str2 = this.f14149c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        Integer num = this.f14150d;
        if (num != null) {
            i10 = num.hashCode();
        }
        return i12 + i10;
    }

    public final String toString() {
        return "GenreResponse(id=" + this.f14147a + ", name=" + this.f14148b + ", slug=" + this.f14149c + ", publish=" + this.f14150d + ")";
    }
}
