package com.anilab.data.model.response;

import W.g;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class UserInfoResponse {

    /* renamed from: a, reason: collision with root package name */
    public final UserResponse f14366a;

    public UserInfoResponse(@InterfaceC1717i(name = "user") UserResponse user) {
        h.e(user, "user");
        this.f14366a = user;
    }

    public final UserInfoResponse copy(@InterfaceC1717i(name = "user") UserResponse user) {
        h.e(user, "user");
        return new UserInfoResponse(user);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserInfoResponse) && h.a(this.f14366a, ((UserInfoResponse) obj).f14366a);
    }

    public final int hashCode() {
        return this.f14366a.hashCode();
    }

    public final String toString() {
        return "UserInfoResponse(user=" + this.f14366a + ")";
    }
}
