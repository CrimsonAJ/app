package com.anilab.data.model.response;

import W.g;
import java.util.List;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class ListPlayerResponse {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f14192a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f14193b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f14194c;

    /* renamed from: d, reason: collision with root package name */
    public final List f14195d;

    public ListPlayerResponse(@InterfaceC1717i(name = "allowed") Boolean bool, @InterfaceC1717i(name = "percent_show") Integer num, @InterfaceC1717i(name = "force") Integer num2, @InterfaceC1717i(name = "players") List<PlayerResponse> list) {
        this.f14192a = bool;
        this.f14193b = num;
        this.f14194c = num2;
        this.f14195d = list;
    }

    public final ListPlayerResponse copy(@InterfaceC1717i(name = "allowed") Boolean bool, @InterfaceC1717i(name = "percent_show") Integer num, @InterfaceC1717i(name = "force") Integer num2, @InterfaceC1717i(name = "players") List<PlayerResponse> list) {
        return new ListPlayerResponse(bool, num, num2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListPlayerResponse)) {
            return false;
        }
        ListPlayerResponse listPlayerResponse = (ListPlayerResponse) obj;
        return h.a(this.f14192a, listPlayerResponse.f14192a) && h.a(this.f14193b, listPlayerResponse.f14193b) && h.a(this.f14194c, listPlayerResponse.f14194c) && h.a(this.f14195d, listPlayerResponse.f14195d);
    }

    public final int hashCode() {
        Boolean bool = this.f14192a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.f14193b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f14194c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.f14195d;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ListPlayerResponse(allowed=" + this.f14192a + ", percentShow=" + this.f14193b + ", force=" + this.f14194c + ", players=" + this.f14195d + ")";
    }
}
