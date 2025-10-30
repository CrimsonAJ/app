package com.anilab.data.model.response;

import W.g;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class FilterConfigResponse {

    /* renamed from: a, reason: collision with root package name */
    public final String f14139a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14140b;

    public FilterConfigResponse(@InterfaceC1717i(name = "title") String str, @InterfaceC1717i(name = "value") String str2) {
        this.f14139a = str;
        this.f14140b = str2;
    }

    public final FilterConfigResponse copy(@InterfaceC1717i(name = "title") String str, @InterfaceC1717i(name = "value") String str2) {
        return new FilterConfigResponse(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterConfigResponse)) {
            return false;
        }
        FilterConfigResponse filterConfigResponse = (FilterConfigResponse) obj;
        return h.a(this.f14139a, filterConfigResponse.f14139a) && h.a(this.f14140b, filterConfigResponse.f14140b);
    }

    public final int hashCode() {
        String str = this.f14139a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f14140b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterConfigResponse(title=");
        sb.append(this.f14139a);
        sb.append(", value=");
        return AbstractC0953k1.q(sb, this.f14140b, ")");
    }
}
