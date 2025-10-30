package com.anilab.data.model.request;

import W.g;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;
import u0.z;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class ContinueWatchRequest {

    /* renamed from: a, reason: collision with root package name */
    public final long f13894a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13895b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13896c;

    public ContinueWatchRequest(@InterfaceC1717i(name = "episode_id") long j, @InterfaceC1717i(name = "time") long j4, @InterfaceC1717i(name = "percent") int i9) {
        this.f13894a = j;
        this.f13895b = j4;
        this.f13896c = i9;
    }

    public final ContinueWatchRequest copy(@InterfaceC1717i(name = "episode_id") long j, @InterfaceC1717i(name = "time") long j4, @InterfaceC1717i(name = "percent") int i9) {
        return new ContinueWatchRequest(j, j4, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContinueWatchRequest)) {
            return false;
        }
        ContinueWatchRequest continueWatchRequest = (ContinueWatchRequest) obj;
        return this.f13894a == continueWatchRequest.f13894a && this.f13895b == continueWatchRequest.f13895b && this.f13896c == continueWatchRequest.f13896c;
    }

    public final int hashCode() {
        long j = this.f13894a;
        int i9 = ((int) (j ^ (j >>> 32))) * 31;
        long j4 = this.f13895b;
        return ((i9 + ((int) ((j4 >>> 32) ^ j4))) * 31) + this.f13896c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContinueWatchRequest(episodeId=");
        sb.append(this.f13894a);
        sb.append(", time=");
        sb.append(this.f13895b);
        sb.append(", percent=");
        return z.g(sb, this.f13896c, ")");
    }
}
