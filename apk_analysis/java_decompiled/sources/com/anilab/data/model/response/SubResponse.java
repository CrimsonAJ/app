package com.anilab.data.model.response;

import W.g;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class SubResponse {

    /* renamed from: a, reason: collision with root package name */
    public final Long f14342a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14343b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14344c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14345d;

    public SubResponse(@InterfaceC1717i(name = "id") Long l9, @InterfaceC1717i(name = "lang_name") String str, @InterfaceC1717i(name = "lang_code") String str2, @InterfaceC1717i(name = "path") String str3) {
        this.f14342a = l9;
        this.f14343b = str;
        this.f14344c = str2;
        this.f14345d = str3;
    }

    public final SubResponse copy(@InterfaceC1717i(name = "id") Long l9, @InterfaceC1717i(name = "lang_name") String str, @InterfaceC1717i(name = "lang_code") String str2, @InterfaceC1717i(name = "path") String str3) {
        return new SubResponse(l9, str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubResponse)) {
            return false;
        }
        SubResponse subResponse = (SubResponse) obj;
        return h.a(this.f14342a, subResponse.f14342a) && h.a(this.f14343b, subResponse.f14343b) && h.a(this.f14344c, subResponse.f14344c) && h.a(this.f14345d, subResponse.f14345d);
    }

    public final int hashCode() {
        Long l9 = this.f14342a;
        int hashCode = (l9 == null ? 0 : l9.hashCode()) * 31;
        String str = this.f14343b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f14344c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f14345d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "SubResponse(id=" + this.f14342a + ", langName=" + this.f14343b + ", langCode=" + this.f14344c + ", link=" + this.f14345d + ")";
    }
}
