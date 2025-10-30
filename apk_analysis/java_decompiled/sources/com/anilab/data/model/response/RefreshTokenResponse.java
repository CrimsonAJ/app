package com.anilab.data.model.response;

import W.g;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class RefreshTokenResponse {

    /* renamed from: a, reason: collision with root package name */
    public final TokenDataResponse f14289a;

    public RefreshTokenResponse(@InterfaceC1717i(name = "tokens") TokenDataResponse tokens) {
        h.e(tokens, "tokens");
        this.f14289a = tokens;
    }

    public final RefreshTokenResponse copy(@InterfaceC1717i(name = "tokens") TokenDataResponse tokens) {
        h.e(tokens, "tokens");
        return new RefreshTokenResponse(tokens);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RefreshTokenResponse) && h.a(this.f14289a, ((RefreshTokenResponse) obj).f14289a);
    }

    public final int hashCode() {
        return this.f14289a.hashCode();
    }

    public final String toString() {
        return "RefreshTokenResponse(tokens=" + this.f14289a + ")";
    }
}
