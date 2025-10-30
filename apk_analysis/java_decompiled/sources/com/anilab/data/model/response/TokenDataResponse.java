package com.anilab.data.model.response;

import W.g;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class TokenDataResponse {

    /* renamed from: a, reason: collision with root package name */
    public final TokenResponse f14358a;

    /* renamed from: b, reason: collision with root package name */
    public final TokenResponse f14359b;

    public TokenDataResponse(@InterfaceC1717i(name = "access") TokenResponse accessToken, @InterfaceC1717i(name = "refresh") TokenResponse refreshToken) {
        h.e(accessToken, "accessToken");
        h.e(refreshToken, "refreshToken");
        this.f14358a = accessToken;
        this.f14359b = refreshToken;
    }

    public final TokenDataResponse copy(@InterfaceC1717i(name = "access") TokenResponse accessToken, @InterfaceC1717i(name = "refresh") TokenResponse refreshToken) {
        h.e(accessToken, "accessToken");
        h.e(refreshToken, "refreshToken");
        return new TokenDataResponse(accessToken, refreshToken);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenDataResponse)) {
            return false;
        }
        TokenDataResponse tokenDataResponse = (TokenDataResponse) obj;
        return h.a(this.f14358a, tokenDataResponse.f14358a) && h.a(this.f14359b, tokenDataResponse.f14359b);
    }

    public final int hashCode() {
        return this.f14359b.hashCode() + (this.f14358a.hashCode() * 31);
    }

    public final String toString() {
        return "TokenDataResponse(accessToken=" + this.f14358a + ", refreshToken=" + this.f14359b + ")";
    }
}
