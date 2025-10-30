package com.anilab.data.model.request;

import W.g;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;
import u0.z;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class SyncRequest {

    /* renamed from: a, reason: collision with root package name */
    public final int f13959a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13960b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13961c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13962d;

    public SyncRequest(@InterfaceC1717i(name = "is_logged") int i9, @InterfaceC1717i(name = "device_unique_id") String deviceUniqueId, @InterfaceC1717i(name = "fcm_token") String fcmToken, @InterfaceC1717i(name = "platform") String platform) {
        h.e(deviceUniqueId, "deviceUniqueId");
        h.e(fcmToken, "fcmToken");
        h.e(platform, "platform");
        this.f13959a = i9;
        this.f13960b = deviceUniqueId;
        this.f13961c = fcmToken;
        this.f13962d = platform;
    }

    public final SyncRequest copy(@InterfaceC1717i(name = "is_logged") int i9, @InterfaceC1717i(name = "device_unique_id") String deviceUniqueId, @InterfaceC1717i(name = "fcm_token") String fcmToken, @InterfaceC1717i(name = "platform") String platform) {
        h.e(deviceUniqueId, "deviceUniqueId");
        h.e(fcmToken, "fcmToken");
        h.e(platform, "platform");
        return new SyncRequest(i9, deviceUniqueId, fcmToken, platform);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncRequest)) {
            return false;
        }
        SyncRequest syncRequest = (SyncRequest) obj;
        return this.f13959a == syncRequest.f13959a && h.a(this.f13960b, syncRequest.f13960b) && h.a(this.f13961c, syncRequest.f13961c) && h.a(this.f13962d, syncRequest.f13962d);
    }

    public final int hashCode() {
        return this.f13962d.hashCode() + z.c(this.f13961c, z.c(this.f13960b, this.f13959a * 31, 31), 31);
    }

    public final String toString() {
        return "SyncRequest(isLogged=" + this.f13959a + ", deviceUniqueId=" + this.f13960b + ", fcmToken=" + this.f13961c + ", platform=" + this.f13962d + ")";
    }
}
