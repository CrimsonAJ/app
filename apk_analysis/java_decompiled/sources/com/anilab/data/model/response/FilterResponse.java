package com.anilab.data.model.response;

import W.g;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class FilterResponse {

    /* renamed from: a, reason: collision with root package name */
    public final String f14143a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14144b;

    public FilterResponse(@InterfaceC1717i(name = "id") String str, @InterfaceC1717i(name = "title") String str2) {
        this.f14143a = str;
        this.f14144b = str2;
    }

    public final FilterResponse copy(@InterfaceC1717i(name = "id") String str, @InterfaceC1717i(name = "title") String str2) {
        return new FilterResponse(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterResponse)) {
            return false;
        }
        FilterResponse filterResponse = (FilterResponse) obj;
        return h.a(this.f14143a, filterResponse.f14143a) && h.a(this.f14144b, filterResponse.f14144b);
    }

    public final int hashCode() {
        String str = this.f14143a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f14144b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterResponse(id=");
        sb.append(this.f14143a);
        sb.append(", title=");
        return AbstractC0953k1.q(sb, this.f14144b, ")");
    }
}
