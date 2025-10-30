package com.anilab.data.model.response;

import W.g;
import java.util.List;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class HomeResponse {

    /* renamed from: a, reason: collision with root package name */
    public final String f14155a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14156b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f14157c;

    /* renamed from: d, reason: collision with root package name */
    public final List f14158d;

    /* renamed from: e, reason: collision with root package name */
    public final List f14159e;

    /* renamed from: f, reason: collision with root package name */
    public final List f14160f;

    /* renamed from: g, reason: collision with root package name */
    public List f14161g;

    public HomeResponse(@InterfaceC1717i(name = "id") String str, @InterfaceC1717i(name = "title") String str2, @InterfaceC1717i(name = "type") Integer num, @InterfaceC1717i(name = "data") List<MovieResponse> list, @InterfaceC1717i(name = "filter") List<FilterResponse> list2, @InterfaceC1717i(name = "tabs") List<TabResponse> list3, @InterfaceC1717i(name = "continue-watch") List<ContinueWatchRowResponse> list4) {
        this.f14155a = str;
        this.f14156b = str2;
        this.f14157c = num;
        this.f14158d = list;
        this.f14159e = list2;
        this.f14160f = list3;
        this.f14161g = list4;
    }

    public final HomeResponse copy(@InterfaceC1717i(name = "id") String str, @InterfaceC1717i(name = "title") String str2, @InterfaceC1717i(name = "type") Integer num, @InterfaceC1717i(name = "data") List<MovieResponse> list, @InterfaceC1717i(name = "filter") List<FilterResponse> list2, @InterfaceC1717i(name = "tabs") List<TabResponse> list3, @InterfaceC1717i(name = "continue-watch") List<ContinueWatchRowResponse> list4) {
        return new HomeResponse(str, str2, num, list, list2, list3, list4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeResponse)) {
            return false;
        }
        HomeResponse homeResponse = (HomeResponse) obj;
        return h.a(this.f14155a, homeResponse.f14155a) && h.a(this.f14156b, homeResponse.f14156b) && h.a(this.f14157c, homeResponse.f14157c) && h.a(this.f14158d, homeResponse.f14158d) && h.a(this.f14159e, homeResponse.f14159e) && h.a(this.f14160f, homeResponse.f14160f) && h.a(this.f14161g, homeResponse.f14161g);
    }

    public final int hashCode() {
        String str = this.f14155a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f14156b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f14157c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.f14158d;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f14159e;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f14160f;
        int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.f14161g;
        return hashCode6 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        return "HomeResponse(id=" + this.f14155a + ", title=" + this.f14156b + ", type=" + this.f14157c + ", data=" + this.f14158d + ", filter=" + this.f14159e + ", tabs=" + this.f14160f + ", continueWatch=" + this.f14161g + ")";
    }
}
