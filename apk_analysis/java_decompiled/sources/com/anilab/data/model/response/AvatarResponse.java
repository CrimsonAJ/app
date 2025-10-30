package com.anilab.data.model.response;

import W.g;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;
import u0.z;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class AvatarResponse {

    /* renamed from: a, reason: collision with root package name */
    public final long f14013a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14014b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14015c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14016d;

    public AvatarResponse(@InterfaceC1717i(name = "id") long j, @InterfaceC1717i(name = "url") String url, @InterfaceC1717i(name = "path") String path, @InterfaceC1717i(name = "group") int i9) {
        h.e(url, "url");
        h.e(path, "path");
        this.f14013a = j;
        this.f14014b = url;
        this.f14015c = path;
        this.f14016d = i9;
    }

    public final AvatarResponse copy(@InterfaceC1717i(name = "id") long j, @InterfaceC1717i(name = "url") String url, @InterfaceC1717i(name = "path") String path, @InterfaceC1717i(name = "group") int i9) {
        h.e(url, "url");
        h.e(path, "path");
        return new AvatarResponse(j, url, path, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarResponse)) {
            return false;
        }
        AvatarResponse avatarResponse = (AvatarResponse) obj;
        return this.f14013a == avatarResponse.f14013a && h.a(this.f14014b, avatarResponse.f14014b) && h.a(this.f14015c, avatarResponse.f14015c) && this.f14016d == avatarResponse.f14016d;
    }

    public final int hashCode() {
        long j = this.f14013a;
        return z.c(this.f14015c, z.c(this.f14014b, ((int) (j ^ (j >>> 32))) * 31, 31), 31) + this.f14016d;
    }

    public final String toString() {
        return "AvatarResponse(id=" + this.f14013a + ", url=" + this.f14014b + ", path=" + this.f14015c + ", group=" + this.f14016d + ")";
    }
}
