package com.anilab.data.model.response;

import W.g;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class MalNodeResponse {

    /* renamed from: a, reason: collision with root package name */
    public final long f14218a;

    public MalNodeResponse(@InterfaceC1717i(name = "id") long j) {
        this.f14218a = j;
    }

    public final MalNodeResponse copy(@InterfaceC1717i(name = "id") long j) {
        return new MalNodeResponse(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MalNodeResponse) && this.f14218a == ((MalNodeResponse) obj).f14218a;
    }

    public final int hashCode() {
        long j = this.f14218a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "MalNodeResponse(id=" + this.f14218a + ")";
    }
}
