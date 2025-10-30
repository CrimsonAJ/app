package com.anilab.data.model.response;

import W.g;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.List;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class StreamUrlResponse {

    /* renamed from: a, reason: collision with root package name */
    public final Long f14331a;

    /* renamed from: b, reason: collision with root package name */
    public final List f14332b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14333c;

    public StreamUrlResponse(@InterfaceC1717i(name = "serverId") Long l9, @InterfaceC1717i(name = "urls") List<String> list, @InterfaceC1717i(name = "serverName") String str) {
        this.f14331a = l9;
        this.f14332b = list;
        this.f14333c = str;
    }

    public final StreamUrlResponse copy(@InterfaceC1717i(name = "serverId") Long l9, @InterfaceC1717i(name = "urls") List<String> list, @InterfaceC1717i(name = "serverName") String str) {
        return new StreamUrlResponse(l9, list, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreamUrlResponse)) {
            return false;
        }
        StreamUrlResponse streamUrlResponse = (StreamUrlResponse) obj;
        return h.a(this.f14331a, streamUrlResponse.f14331a) && h.a(this.f14332b, streamUrlResponse.f14332b) && h.a(this.f14333c, streamUrlResponse.f14333c);
    }

    public final int hashCode() {
        Long l9 = this.f14331a;
        int hashCode = (l9 == null ? 0 : l9.hashCode()) * 31;
        List list = this.f14332b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f14333c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamUrlResponse(serverId=");
        sb.append(this.f14331a);
        sb.append(", urls=");
        sb.append(this.f14332b);
        sb.append(", serverName=");
        return AbstractC0953k1.q(sb, this.f14333c, ")");
    }
}
