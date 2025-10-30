package com.anilab.data.model.request;

import W.g;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class RefreshTokenRequest {

    /* renamed from: a, reason: collision with root package name */
    public final String f13939a;

    public RefreshTokenRequest(@InterfaceC1717i(name = "refreshToken") String refreshToken) {
        h.e(refreshToken, "refreshToken");
        this.f13939a = refreshToken;
    }

    public final RefreshTokenRequest copy(@InterfaceC1717i(name = "refreshToken") String refreshToken) {
        h.e(refreshToken, "refreshToken");
        return new RefreshTokenRequest(refreshToken);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RefreshTokenRequest) && h.a(this.f13939a, ((RefreshTokenRequest) obj).f13939a);
    }

    public final int hashCode() {
        return this.f13939a.hashCode();
    }

    public final String toString() {
        return AbstractC0953k1.q(new StringBuilder("RefreshTokenRequest(refreshToken="), this.f13939a, ")");
    }
}
