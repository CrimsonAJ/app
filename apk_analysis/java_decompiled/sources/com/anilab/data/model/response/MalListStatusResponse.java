package com.anilab.data.model.response;

import W.g;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class MalListStatusResponse {

    /* renamed from: a, reason: collision with root package name */
    public final int f14213a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14214b;

    public MalListStatusResponse(@InterfaceC1717i(name = "num_episodes_watched") int i9, @InterfaceC1717i(name = "status") String status) {
        h.e(status, "status");
        this.f14213a = i9;
        this.f14214b = status;
    }

    public final MalListStatusResponse copy(@InterfaceC1717i(name = "num_episodes_watched") int i9, @InterfaceC1717i(name = "status") String status) {
        h.e(status, "status");
        return new MalListStatusResponse(i9, status);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MalListStatusResponse)) {
            return false;
        }
        MalListStatusResponse malListStatusResponse = (MalListStatusResponse) obj;
        return this.f14213a == malListStatusResponse.f14213a && h.a(this.f14214b, malListStatusResponse.f14214b);
    }

    public final int hashCode() {
        return this.f14214b.hashCode() + (this.f14213a * 31);
    }

    public final String toString() {
        return "MalListStatusResponse(numEpisodesWatched=" + this.f14213a + ", status=" + this.f14214b + ")";
    }
}
