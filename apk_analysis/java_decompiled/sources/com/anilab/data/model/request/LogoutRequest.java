package com.anilab.data.model.request;

import W.g;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class LogoutRequest {

    /* renamed from: a, reason: collision with root package name */
    public final String f13928a;

    public LogoutRequest(@InterfaceC1717i(name = "refreshToken") String refreshToken) {
        h.e(refreshToken, "refreshToken");
        this.f13928a = refreshToken;
    }

    public final LogoutRequest copy(@InterfaceC1717i(name = "refreshToken") String refreshToken) {
        h.e(refreshToken, "refreshToken");
        return new LogoutRequest(refreshToken);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LogoutRequest) && h.a(this.f13928a, ((LogoutRequest) obj).f13928a);
    }

    public final int hashCode() {
        return this.f13928a.hashCode();
    }

    public final String toString() {
        return AbstractC0953k1.q(new StringBuilder("LogoutRequest(refreshToken="), this.f13928a, ")");
    }
}
