package com.anilab.data.model.response;

import W.g;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class LoginResponse {

    /* renamed from: a, reason: collision with root package name */
    public UserResponse f14200a;

    /* renamed from: b, reason: collision with root package name */
    public final TokenDataResponse f14201b;

    public LoginResponse(@InterfaceC1717i(name = "user") UserResponse user, @InterfaceC1717i(name = "tokens") TokenDataResponse tokens) {
        h.e(user, "user");
        h.e(tokens, "tokens");
        this.f14200a = user;
        this.f14201b = tokens;
    }

    public final LoginResponse copy(@InterfaceC1717i(name = "user") UserResponse user, @InterfaceC1717i(name = "tokens") TokenDataResponse tokens) {
        h.e(user, "user");
        h.e(tokens, "tokens");
        return new LoginResponse(user, tokens);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginResponse)) {
            return false;
        }
        LoginResponse loginResponse = (LoginResponse) obj;
        return h.a(this.f14200a, loginResponse.f14200a) && h.a(this.f14201b, loginResponse.f14201b);
    }

    public final int hashCode() {
        return this.f14201b.hashCode() + (this.f14200a.hashCode() * 31);
    }

    public final String toString() {
        return "LoginResponse(user=" + this.f14200a + ", tokens=" + this.f14201b + ")";
    }
}
