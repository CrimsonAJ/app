package com.anilab.data.model.request;

import W.g;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class UpdateUserInfoRequest {

    /* renamed from: a, reason: collision with root package name */
    public final Long f13970a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13971b;

    public UpdateUserInfoRequest(@InterfaceC1717i(name = "avatar_id") Long l9, @InterfaceC1717i(name = "name") String name) {
        h.e(name, "name");
        this.f13970a = l9;
        this.f13971b = name;
    }

    public final UpdateUserInfoRequest copy(@InterfaceC1717i(name = "avatar_id") Long l9, @InterfaceC1717i(name = "name") String name) {
        h.e(name, "name");
        return new UpdateUserInfoRequest(l9, name);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateUserInfoRequest)) {
            return false;
        }
        UpdateUserInfoRequest updateUserInfoRequest = (UpdateUserInfoRequest) obj;
        return h.a(this.f13970a, updateUserInfoRequest.f13970a) && h.a(this.f13971b, updateUserInfoRequest.f13971b);
    }

    public final int hashCode() {
        Long l9 = this.f13970a;
        return this.f13971b.hashCode() + ((l9 == null ? 0 : l9.hashCode()) * 31);
    }

    public final String toString() {
        return "UpdateUserInfoRequest(avatarId=" + this.f13970a + ", name=" + this.f13971b + ")";
    }
}
