package com.anilab.data.model.response;

import W.g;
import java.util.List;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class PageDataResponse<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f14269a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f14270b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f14271c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f14272d;

    /* renamed from: e, reason: collision with root package name */
    public final List f14273e;

    public PageDataResponse(@InterfaceC1717i(name = "page") Integer num, @InterfaceC1717i(name = "limit") Integer num2, @InterfaceC1717i(name = "total_pages") Integer num3, @InterfaceC1717i(name = "count") Integer num4, @InterfaceC1717i(name = "rows") List<? extends T> list) {
        this.f14269a = num;
        this.f14270b = num2;
        this.f14271c = num3;
        this.f14272d = num4;
        this.f14273e = list;
    }

    public final PageDataResponse<T> copy(@InterfaceC1717i(name = "page") Integer num, @InterfaceC1717i(name = "limit") Integer num2, @InterfaceC1717i(name = "total_pages") Integer num3, @InterfaceC1717i(name = "count") Integer num4, @InterfaceC1717i(name = "rows") List<? extends T> list) {
        return new PageDataResponse<>(num, num2, num3, num4, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageDataResponse)) {
            return false;
        }
        PageDataResponse pageDataResponse = (PageDataResponse) obj;
        return h.a(this.f14269a, pageDataResponse.f14269a) && h.a(this.f14270b, pageDataResponse.f14270b) && h.a(this.f14271c, pageDataResponse.f14271c) && h.a(this.f14272d, pageDataResponse.f14272d) && h.a(this.f14273e, pageDataResponse.f14273e);
    }

    public final int hashCode() {
        Integer num = this.f14269a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f14270b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f14271c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f14272d;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List list = this.f14273e;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "PageDataResponse(page=" + this.f14269a + ", limit=" + this.f14270b + ", totalPages=" + this.f14271c + ", count=" + this.f14272d + ", result=" + this.f14273e + ")";
    }
}
