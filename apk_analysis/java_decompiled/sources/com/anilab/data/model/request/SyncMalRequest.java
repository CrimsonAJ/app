package com.anilab.data.model.request;

import W.g;
import java.util.List;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class SyncMalRequest {

    /* renamed from: a, reason: collision with root package name */
    public final List f13954a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13955b;

    public SyncMalRequest(@InterfaceC1717i(name = "ids") List<Long> ids, @InterfaceC1717i(name = "is_replace") int i9) {
        h.e(ids, "ids");
        this.f13954a = ids;
        this.f13955b = i9;
    }

    public final SyncMalRequest copy(@InterfaceC1717i(name = "ids") List<Long> ids, @InterfaceC1717i(name = "is_replace") int i9) {
        h.e(ids, "ids");
        return new SyncMalRequest(ids, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncMalRequest)) {
            return false;
        }
        SyncMalRequest syncMalRequest = (SyncMalRequest) obj;
        return h.a(this.f13954a, syncMalRequest.f13954a) && this.f13955b == syncMalRequest.f13955b;
    }

    public final int hashCode() {
        return (this.f13954a.hashCode() * 31) + this.f13955b;
    }

    public final String toString() {
        return "SyncMalRequest(ids=" + this.f13954a + ", isReplace=" + this.f13955b + ")";
    }
}
