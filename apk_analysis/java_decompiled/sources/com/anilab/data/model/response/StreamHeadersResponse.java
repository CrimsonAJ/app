package com.anilab.data.model.response;

import W.g;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class StreamHeadersResponse {

    /* renamed from: a, reason: collision with root package name */
    public final String f14327a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14328b;

    public StreamHeadersResponse(@InterfaceC1717i(name = "key") String str, @InterfaceC1717i(name = "value") String str2) {
        this.f14327a = str;
        this.f14328b = str2;
    }

    public final StreamHeadersResponse copy(@InterfaceC1717i(name = "key") String str, @InterfaceC1717i(name = "value") String str2) {
        return new StreamHeadersResponse(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreamHeadersResponse)) {
            return false;
        }
        StreamHeadersResponse streamHeadersResponse = (StreamHeadersResponse) obj;
        return h.a(this.f14327a, streamHeadersResponse.f14327a) && h.a(this.f14328b, streamHeadersResponse.f14328b);
    }

    public final int hashCode() {
        String str = this.f14327a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f14328b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamHeadersResponse(key=");
        sb.append(this.f14327a);
        sb.append(", value=");
        return AbstractC0953k1.q(sb, this.f14328b, ")");
    }
}
