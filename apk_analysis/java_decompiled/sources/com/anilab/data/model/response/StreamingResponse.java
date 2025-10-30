package com.anilab.data.model.response;

import W.g;
import java.util.List;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class StreamingResponse {

    /* renamed from: a, reason: collision with root package name */
    public final List f14338a;

    /* renamed from: b, reason: collision with root package name */
    public final List f14339b;

    public StreamingResponse(@InterfaceC1717i(name = "sub") List<String> list, @InterfaceC1717i(name = "dub") List<String> list2) {
        this.f14338a = list;
        this.f14339b = list2;
    }

    public final StreamingResponse copy(@InterfaceC1717i(name = "sub") List<String> list, @InterfaceC1717i(name = "dub") List<String> list2) {
        return new StreamingResponse(list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreamingResponse)) {
            return false;
        }
        StreamingResponse streamingResponse = (StreamingResponse) obj;
        return h.a(this.f14338a, streamingResponse.f14338a) && h.a(this.f14339b, streamingResponse.f14339b);
    }

    public final int hashCode() {
        List list = this.f14338a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f14339b;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "StreamingResponse(subs=" + this.f14338a + ", dubs=" + this.f14339b + ")";
    }
}
