package com.anilab.data.model.response;

import W.g;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class SyncMalResponse {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14349a;

    public SyncMalResponse(@InterfaceC1717i(name = "is_sync") boolean z9) {
        this.f14349a = z9;
    }

    public final SyncMalResponse copy(@InterfaceC1717i(name = "is_sync") boolean z9) {
        return new SyncMalResponse(z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SyncMalResponse) && this.f14349a == ((SyncMalResponse) obj).f14349a;
    }

    public final int hashCode() {
        if (this.f14349a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return "SyncMalResponse(isSync=" + this.f14349a + ")";
    }
}
