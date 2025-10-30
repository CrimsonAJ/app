package com.anilab.data.model.request;

import W.g;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class DeleteContinueWatchRequest {

    /* renamed from: a, reason: collision with root package name */
    public final long f13908a;

    public DeleteContinueWatchRequest(@InterfaceC1717i(name = "movieId") long j) {
        this.f13908a = j;
    }

    public final DeleteContinueWatchRequest copy(@InterfaceC1717i(name = "movieId") long j) {
        return new DeleteContinueWatchRequest(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeleteContinueWatchRequest) && this.f13908a == ((DeleteContinueWatchRequest) obj).f13908a;
    }

    public final int hashCode() {
        long j = this.f13908a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "DeleteContinueWatchRequest(movieId=" + this.f13908a + ")";
    }
}
