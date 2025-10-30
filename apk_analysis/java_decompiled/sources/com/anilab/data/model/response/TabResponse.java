package com.anilab.data.model.response;

import W.g;
import java.util.List;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class TabResponse {

    /* renamed from: a, reason: collision with root package name */
    public final String f14352a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14353b;

    /* renamed from: c, reason: collision with root package name */
    public final List f14354c;

    public TabResponse(@InterfaceC1717i(name = "id") String str, @InterfaceC1717i(name = "title") String str2, @InterfaceC1717i(name = "data") List<MovieResponse> list) {
        this.f14352a = str;
        this.f14353b = str2;
        this.f14354c = list;
    }

    public final TabResponse copy(@InterfaceC1717i(name = "id") String str, @InterfaceC1717i(name = "title") String str2, @InterfaceC1717i(name = "data") List<MovieResponse> list) {
        return new TabResponse(str, str2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabResponse)) {
            return false;
        }
        TabResponse tabResponse = (TabResponse) obj;
        return h.a(this.f14352a, tabResponse.f14352a) && h.a(this.f14353b, tabResponse.f14353b) && h.a(this.f14354c, tabResponse.f14354c);
    }

    public final int hashCode() {
        String str = this.f14352a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f14353b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f14354c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "TabResponse(id=" + this.f14352a + ", title=" + this.f14353b + ", data=" + this.f14354c + ")";
    }
}
