package com.anilab.data.model.response;

import W.g;
import java.util.List;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class MalIdsResponse {

    /* renamed from: a, reason: collision with root package name */
    public final List f14210a;

    public MalIdsResponse(@InterfaceC1717i(name = "ids") List<Long> ids) {
        h.e(ids, "ids");
        this.f14210a = ids;
    }

    public final MalIdsResponse copy(@InterfaceC1717i(name = "ids") List<Long> ids) {
        h.e(ids, "ids");
        return new MalIdsResponse(ids);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MalIdsResponse) && h.a(this.f14210a, ((MalIdsResponse) obj).f14210a);
    }

    public final int hashCode() {
        return this.f14210a.hashCode();
    }

    public final String toString() {
        return "MalIdsResponse(ids=" + this.f14210a + ")";
    }
}
