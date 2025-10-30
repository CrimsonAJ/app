package com.anilab.data.model.response;

import W.g;
import java.util.List;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class AvatarListResponse {

    /* renamed from: a, reason: collision with root package name */
    public final List f14010a;

    public AvatarListResponse(@InterfaceC1717i(name = "avatars") List<AvatarResponse> list) {
        this.f14010a = list;
    }

    public final AvatarListResponse copy(@InterfaceC1717i(name = "avatars") List<AvatarResponse> list) {
        return new AvatarListResponse(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AvatarListResponse) && h.a(this.f14010a, ((AvatarListResponse) obj).f14010a);
    }

    public final int hashCode() {
        List list = this.f14010a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "AvatarListResponse(avatars=" + this.f14010a + ")";
    }
}
