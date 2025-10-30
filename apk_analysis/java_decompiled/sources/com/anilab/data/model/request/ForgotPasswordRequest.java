package com.anilab.data.model.request;

import W.g;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class ForgotPasswordRequest {

    /* renamed from: a, reason: collision with root package name */
    public final String f13916a;

    public ForgotPasswordRequest(@InterfaceC1717i(name = "email") String email) {
        h.e(email, "email");
        this.f13916a = email;
    }

    public final ForgotPasswordRequest copy(@InterfaceC1717i(name = "email") String email) {
        h.e(email, "email");
        return new ForgotPasswordRequest(email);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ForgotPasswordRequest) && h.a(this.f13916a, ((ForgotPasswordRequest) obj).f13916a);
    }

    public final int hashCode() {
        return this.f13916a.hashCode();
    }

    public final String toString() {
        return AbstractC0953k1.q(new StringBuilder("ForgotPasswordRequest(email="), this.f13916a, ")");
    }
}
