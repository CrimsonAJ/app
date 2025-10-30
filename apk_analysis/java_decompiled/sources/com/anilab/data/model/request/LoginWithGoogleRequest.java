package com.anilab.data.model.request;

import W.g;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class LoginWithGoogleRequest {

    /* renamed from: a, reason: collision with root package name */
    public final String f13923a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13924b;

    public LoginWithGoogleRequest(@InterfaceC1717i(name = "token") String idToken, @InterfaceC1717i(name = "provider") String provider) {
        h.e(idToken, "idToken");
        h.e(provider, "provider");
        this.f13923a = idToken;
        this.f13924b = provider;
    }

    public final LoginWithGoogleRequest copy(@InterfaceC1717i(name = "token") String idToken, @InterfaceC1717i(name = "provider") String provider) {
        h.e(idToken, "idToken");
        h.e(provider, "provider");
        return new LoginWithGoogleRequest(idToken, provider);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginWithGoogleRequest)) {
            return false;
        }
        LoginWithGoogleRequest loginWithGoogleRequest = (LoginWithGoogleRequest) obj;
        return h.a(this.f13923a, loginWithGoogleRequest.f13923a) && h.a(this.f13924b, loginWithGoogleRequest.f13924b);
    }

    public final int hashCode() {
        return this.f13924b.hashCode() + (this.f13923a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoginWithGoogleRequest(idToken=");
        sb.append(this.f13923a);
        sb.append(", provider=");
        return AbstractC0953k1.q(sb, this.f13924b, ")");
    }

    public /* synthetic */ LoginWithGoogleRequest(String str, String str2, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i9 & 2) != 0 ? "google" : str2);
    }
}
