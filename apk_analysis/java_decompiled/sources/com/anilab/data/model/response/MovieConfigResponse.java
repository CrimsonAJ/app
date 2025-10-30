package com.anilab.data.model.response;

import W.g;
import java.util.List;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class MovieConfigResponse {

    /* renamed from: a, reason: collision with root package name */
    public final List f14229a;

    /* renamed from: b, reason: collision with root package name */
    public final List f14230b;

    /* renamed from: c, reason: collision with root package name */
    public final List f14231c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14232d;

    public MovieConfigResponse(@InterfaceC1717i(name = "airingStatus") List<FilterConfigResponse> airingStatus, @InterfaceC1717i(name = "types") List<FilterConfigResponse> movieTypes, @InterfaceC1717i(name = "order") List<FilterConfigResponse> orders, @InterfaceC1717i(name = "orderDefault") String orderDefault) {
        h.e(airingStatus, "airingStatus");
        h.e(movieTypes, "movieTypes");
        h.e(orders, "orders");
        h.e(orderDefault, "orderDefault");
        this.f14229a = airingStatus;
        this.f14230b = movieTypes;
        this.f14231c = orders;
        this.f14232d = orderDefault;
    }

    public final MovieConfigResponse copy(@InterfaceC1717i(name = "airingStatus") List<FilterConfigResponse> airingStatus, @InterfaceC1717i(name = "types") List<FilterConfigResponse> movieTypes, @InterfaceC1717i(name = "order") List<FilterConfigResponse> orders, @InterfaceC1717i(name = "orderDefault") String orderDefault) {
        h.e(airingStatus, "airingStatus");
        h.e(movieTypes, "movieTypes");
        h.e(orders, "orders");
        h.e(orderDefault, "orderDefault");
        return new MovieConfigResponse(airingStatus, movieTypes, orders, orderDefault);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovieConfigResponse)) {
            return false;
        }
        MovieConfigResponse movieConfigResponse = (MovieConfigResponse) obj;
        return h.a(this.f14229a, movieConfigResponse.f14229a) && h.a(this.f14230b, movieConfigResponse.f14230b) && h.a(this.f14231c, movieConfigResponse.f14231c) && h.a(this.f14232d, movieConfigResponse.f14232d);
    }

    public final int hashCode() {
        return this.f14232d.hashCode() + ((this.f14231c.hashCode() + ((this.f14230b.hashCode() + (this.f14229a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MovieConfigResponse(airingStatus=" + this.f14229a + ", movieTypes=" + this.f14230b + ", orders=" + this.f14231c + ", orderDefault=" + this.f14232d + ")";
    }
}
