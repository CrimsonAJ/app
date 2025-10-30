package com.anilab.data.model.response;

import W.g;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class VersionSettingsResponse {

    /* renamed from: a, reason: collision with root package name */
    public final LatestVersionResponse f14385a;

    public VersionSettingsResponse(@InterfaceC1717i(name = "latest_version") LatestVersionResponse version) {
        h.e(version, "version");
        this.f14385a = version;
    }

    public final VersionSettingsResponse copy(@InterfaceC1717i(name = "latest_version") LatestVersionResponse version) {
        h.e(version, "version");
        return new VersionSettingsResponse(version);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VersionSettingsResponse) && h.a(this.f14385a, ((VersionSettingsResponse) obj).f14385a);
    }

    public final int hashCode() {
        return this.f14385a.hashCode();
    }

    public final String toString() {
        return "VersionSettingsResponse(version=" + this.f14385a + ")";
    }
}
