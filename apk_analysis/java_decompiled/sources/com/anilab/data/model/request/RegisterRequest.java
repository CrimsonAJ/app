package com.anilab.data.model.request;

import W.g;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;
import u0.z;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class RegisterRequest {

    /* renamed from: a, reason: collision with root package name */
    public final String f13942a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13943b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13944c;

    public RegisterRequest(@InterfaceC1717i(name = "email") String email, @InterfaceC1717i(name = "name") String name, @InterfaceC1717i(name = "password") String password) {
        h.e(email, "email");
        h.e(name, "name");
        h.e(password, "password");
        this.f13942a = email;
        this.f13943b = name;
        this.f13944c = password;
    }

    public final RegisterRequest copy(@InterfaceC1717i(name = "email") String email, @InterfaceC1717i(name = "name") String name, @InterfaceC1717i(name = "password") String password) {
        h.e(email, "email");
        h.e(name, "name");
        h.e(password, "password");
        return new RegisterRequest(email, name, password);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequest)) {
            return false;
        }
        RegisterRequest registerRequest = (RegisterRequest) obj;
        return h.a(this.f13942a, registerRequest.f13942a) && h.a(this.f13943b, registerRequest.f13943b) && h.a(this.f13944c, registerRequest.f13944c);
    }

    public final int hashCode() {
        return this.f13944c.hashCode() + z.c(this.f13943b, this.f13942a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegisterRequest(email=");
        sb.append(this.f13942a);
        sb.append(", name=");
        sb.append(this.f13943b);
        sb.append(", password=");
        return AbstractC0953k1.q(sb, this.f13944c, ")");
    }
}
