package com.anilab.data.model.response;

import W.g;
import java.util.List;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class SrcConfigResponse {

    /* renamed from: a, reason: collision with root package name */
    public final String f14320a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f14321b;

    /* renamed from: c, reason: collision with root package name */
    public final List f14322c;

    public SrcConfigResponse(@InterfaceC1717i(name = "host_name") String str, @InterfaceC1717i(name = "timeout") Long l9, @InterfaceC1717i(name = "server_list") List<Integer> list) {
        this.f14320a = str;
        this.f14321b = l9;
        this.f14322c = list;
    }

    public final SrcConfigResponse copy(@InterfaceC1717i(name = "host_name") String str, @InterfaceC1717i(name = "timeout") Long l9, @InterfaceC1717i(name = "server_list") List<Integer> list) {
        return new SrcConfigResponse(str, l9, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SrcConfigResponse)) {
            return false;
        }
        SrcConfigResponse srcConfigResponse = (SrcConfigResponse) obj;
        return h.a(this.f14320a, srcConfigResponse.f14320a) && h.a(this.f14321b, srcConfigResponse.f14321b) && h.a(this.f14322c, srcConfigResponse.f14322c);
    }

    public final int hashCode() {
        String str = this.f14320a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l9 = this.f14321b;
        int hashCode2 = (hashCode + (l9 == null ? 0 : l9.hashCode())) * 31;
        List list = this.f14322c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "SrcConfigResponse(hostName=" + this.f14320a + ", timeout=" + this.f14321b + ", serverList=" + this.f14322c + ")";
    }
}
