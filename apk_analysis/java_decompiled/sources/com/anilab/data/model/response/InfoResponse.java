package com.anilab.data.model.response;

import W.g;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class InfoResponse {

    /* renamed from: a, reason: collision with root package name */
    public final String f14169a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14170b;

    public InfoResponse(@InterfaceC1717i(name = "ip") String str, @InterfaceC1717i(name = "country") String str2) {
        this.f14169a = str;
        this.f14170b = str2;
    }

    public final InfoResponse copy(@InterfaceC1717i(name = "ip") String str, @InterfaceC1717i(name = "country") String str2) {
        return new InfoResponse(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoResponse)) {
            return false;
        }
        InfoResponse infoResponse = (InfoResponse) obj;
        return h.a(this.f14169a, infoResponse.f14169a) && h.a(this.f14170b, infoResponse.f14170b);
    }

    public final int hashCode() {
        String str = this.f14169a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f14170b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return this.f14170b + ", " + this.f14169a;
    }
}
