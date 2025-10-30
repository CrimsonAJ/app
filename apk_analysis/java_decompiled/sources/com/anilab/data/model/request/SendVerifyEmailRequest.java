package com.anilab.data.model.request;

import W.g;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class SendVerifyEmailRequest {

    /* renamed from: a, reason: collision with root package name */
    public final String f13951a;

    public SendVerifyEmailRequest(@InterfaceC1717i(name = "email") String email) {
        h.e(email, "email");
        this.f13951a = email;
    }

    public final SendVerifyEmailRequest copy(@InterfaceC1717i(name = "email") String email) {
        h.e(email, "email");
        return new SendVerifyEmailRequest(email);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SendVerifyEmailRequest) && h.a(this.f13951a, ((SendVerifyEmailRequest) obj).f13951a);
    }

    public final int hashCode() {
        return this.f13951a.hashCode();
    }

    public final String toString() {
        return AbstractC0953k1.q(new StringBuilder("SendVerifyEmailRequest(email="), this.f13951a, ")");
    }
}
