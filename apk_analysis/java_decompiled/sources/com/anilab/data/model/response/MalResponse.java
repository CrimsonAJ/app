package com.anilab.data.model.response;

import W.g;
import java.util.List;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class MalResponse {

    /* renamed from: a, reason: collision with root package name */
    public final List f14224a;

    /* renamed from: b, reason: collision with root package name */
    public final MalPagingResponse f14225b;

    public MalResponse(@InterfaceC1717i(name = "data") List<MalDataResponse> malData, @InterfaceC1717i(name = "paging") MalPagingResponse malPagingResponse) {
        h.e(malData, "malData");
        this.f14224a = malData;
        this.f14225b = malPagingResponse;
    }

    public final MalResponse copy(@InterfaceC1717i(name = "data") List<MalDataResponse> malData, @InterfaceC1717i(name = "paging") MalPagingResponse malPagingResponse) {
        h.e(malData, "malData");
        return new MalResponse(malData, malPagingResponse);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MalResponse)) {
            return false;
        }
        MalResponse malResponse = (MalResponse) obj;
        return h.a(this.f14224a, malResponse.f14224a) && h.a(this.f14225b, malResponse.f14225b);
    }

    public final int hashCode() {
        int hashCode = this.f14224a.hashCode() * 31;
        MalPagingResponse malPagingResponse = this.f14225b;
        return hashCode + (malPagingResponse == null ? 0 : malPagingResponse.hashCode());
    }

    public final String toString() {
        return "MalResponse(malData=" + this.f14224a + ", paging=" + this.f14225b + ")";
    }
}
