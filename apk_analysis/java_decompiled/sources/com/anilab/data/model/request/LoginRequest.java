package com.anilab.data.model.request;

import W.g;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class LoginRequest {

    /* renamed from: a, reason: collision with root package name */
    public final String f13919a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13920b;

    public LoginRequest(@InterfaceC1717i(name = "email") String email, @InterfaceC1717i(name = "password") String password) {
        h.e(email, "email");
        h.e(password, "password");
        this.f13919a = email;
        this.f13920b = password;
    }

    public final LoginRequest copy(@InterfaceC1717i(name = "email") String email, @InterfaceC1717i(name = "password") String password) {
        h.e(email, "email");
        h.e(password, "password");
        return new LoginRequest(email, password);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginRequest)) {
            return false;
        }
        LoginRequest loginRequest = (LoginRequest) obj;
        return h.a(this.f13919a, loginRequest.f13919a) && h.a(this.f13920b, loginRequest.f13920b);
    }

    public final int hashCode() {
        return this.f13920b.hashCode() + (this.f13919a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoginRequest(email=");
        sb.append(this.f13919a);
        sb.append(", password=");
        return AbstractC0953k1.q(sb, this.f13920b, ")");
    }
}
