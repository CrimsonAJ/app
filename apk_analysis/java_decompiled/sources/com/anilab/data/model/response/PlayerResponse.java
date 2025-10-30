package com.anilab.data.model.response;

import W.g;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class PlayerResponse {

    /* renamed from: a, reason: collision with root package name */
    public final long f14277a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14278b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14279c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f14280d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f14281e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f14282f;

    /* renamed from: g, reason: collision with root package name */
    public final String f14283g;

    /* renamed from: h, reason: collision with root package name */
    public final String f14284h;

    public PlayerResponse(@InterfaceC1717i(name = "id") long j, @InterfaceC1717i(name = "name") String str, @InterfaceC1717i(name = "logo_path") String str2, @InterfaceC1717i(name = "is_free") Integer num, @InterfaceC1717i(name = "is_recommended") Integer num2, @InterfaceC1717i(name = "star") Integer num3, @InterfaceC1717i(name = "link_download") String str3, @InterfaceC1717i(name = "deeplink") String str4) {
        this.f14277a = j;
        this.f14278b = str;
        this.f14279c = str2;
        this.f14280d = num;
        this.f14281e = num2;
        this.f14282f = num3;
        this.f14283g = str3;
        this.f14284h = str4;
    }

    public final PlayerResponse copy(@InterfaceC1717i(name = "id") long j, @InterfaceC1717i(name = "name") String str, @InterfaceC1717i(name = "logo_path") String str2, @InterfaceC1717i(name = "is_free") Integer num, @InterfaceC1717i(name = "is_recommended") Integer num2, @InterfaceC1717i(name = "star") Integer num3, @InterfaceC1717i(name = "link_download") String str3, @InterfaceC1717i(name = "deeplink") String str4) {
        return new PlayerResponse(j, str, str2, num, num2, num3, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerResponse)) {
            return false;
        }
        PlayerResponse playerResponse = (PlayerResponse) obj;
        return this.f14277a == playerResponse.f14277a && h.a(this.f14278b, playerResponse.f14278b) && h.a(this.f14279c, playerResponse.f14279c) && h.a(this.f14280d, playerResponse.f14280d) && h.a(this.f14281e, playerResponse.f14281e) && h.a(this.f14282f, playerResponse.f14282f) && h.a(this.f14283g, playerResponse.f14283g) && h.a(this.f14284h, playerResponse.f14284h);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        long j = this.f14277a;
        int i9 = ((int) (j ^ (j >>> 32))) * 31;
        int i10 = 0;
        String str = this.f14278b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (i9 + hashCode) * 31;
        String str2 = this.f14279c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        Integer num = this.f14280d;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        Integer num2 = this.f14281e;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        Integer num3 = this.f14282f;
        if (num3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num3.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        String str3 = this.f14283g;
        if (str3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str3.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        String str4 = this.f14284h;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i16 + i10;
    }

    public final String toString() {
        return "PlayerResponse(id=" + this.f14277a + ", name=" + this.f14278b + ", logoPath=" + this.f14279c + ", isFree=" + this.f14280d + ", isRecommended=" + this.f14281e + ", star=" + this.f14282f + ", linkDownLoad=" + this.f14283g + ", deepLink=" + this.f14284h + ")";
    }
}
