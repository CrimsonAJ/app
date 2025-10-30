package com.anilab.data.model.request;

import W.g;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class ChangePasswordRequest {

    /* renamed from: a, reason: collision with root package name */
    public final String f13884a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13885b;

    public ChangePasswordRequest(@InterfaceC1717i(name = "old_password") String str, @InterfaceC1717i(name = "new_password") String newPassword) {
        h.e(newPassword, "newPassword");
        this.f13884a = str;
        this.f13885b = newPassword;
    }

    public final ChangePasswordRequest copy(@InterfaceC1717i(name = "old_password") String str, @InterfaceC1717i(name = "new_password") String newPassword) {
        h.e(newPassword, "newPassword");
        return new ChangePasswordRequest(str, newPassword);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangePasswordRequest)) {
            return false;
        }
        ChangePasswordRequest changePasswordRequest = (ChangePasswordRequest) obj;
        return h.a(this.f13884a, changePasswordRequest.f13884a) && h.a(this.f13885b, changePasswordRequest.f13885b);
    }

    public final int hashCode() {
        String str = this.f13884a;
        return this.f13885b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangePasswordRequest(oldPassword=");
        sb.append(this.f13884a);
        sb.append(", newPassword=");
        return AbstractC0953k1.q(sb, this.f13885b, ")");
    }
}
