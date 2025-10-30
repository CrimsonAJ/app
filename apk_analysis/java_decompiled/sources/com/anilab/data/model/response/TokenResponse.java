package com.anilab.data.model.response;

import W.g;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class TokenResponse {

    /* renamed from: a, reason: collision with root package name */
    public String f14362a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14363b;

    public TokenResponse(@InterfaceC1717i(name = "token") String token, @InterfaceC1717i(name = "expires") String expires) {
        h.e(token, "token");
        h.e(expires, "expires");
        this.f14362a = token;
        this.f14363b = expires;
    }

    public final TokenResponse copy(@InterfaceC1717i(name = "token") String token, @InterfaceC1717i(name = "expires") String expires) {
        h.e(token, "token");
        h.e(expires, "expires");
        return new TokenResponse(token, expires);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenResponse)) {
            return false;
        }
        TokenResponse tokenResponse = (TokenResponse) obj;
        return h.a(this.f14362a, tokenResponse.f14362a) && h.a(this.f14363b, tokenResponse.f14363b);
    }

    public final int hashCode() {
        return this.f14363b.hashCode() + (this.f14362a.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC0953k1.q(AbstractC0953k1.r("TokenResponse(token=", this.f14362a, ", expires="), this.f14363b, ")");
    }
}
