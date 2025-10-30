package com.anilab.data.model.response;

import W.g;
import java.util.List;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class WatchListIdResponse {

    /* renamed from: a, reason: collision with root package name */
    public final List f14400a;

    public WatchListIdResponse(@InterfaceC1717i(name = "ids") List<Long> list) {
        this.f14400a = list;
    }

    public final WatchListIdResponse copy(@InterfaceC1717i(name = "ids") List<Long> list) {
        return new WatchListIdResponse(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WatchListIdResponse) && h.a(this.f14400a, ((WatchListIdResponse) obj).f14400a);
    }

    public final int hashCode() {
        List list = this.f14400a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "WatchListIdResponse(ids=" + this.f14400a + ")";
    }
}
