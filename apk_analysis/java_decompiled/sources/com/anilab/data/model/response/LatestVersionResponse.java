package com.anilab.data.model.response;

import W.g;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class LatestVersionResponse {

    /* renamed from: a, reason: collision with root package name */
    public final long f14173a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14174b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f14175c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14176d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14177e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f14178f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f14179g;

    public LatestVersionResponse(@InterfaceC1717i(name = "id") long j, @InterfaceC1717i(name = "version") String str, @InterfaceC1717i(name = "version_code") Integer num, @InterfaceC1717i(name = "change_log") String str2, @InterfaceC1717i(name = "link_download") String str3, @InterfaceC1717i(name = "force_updated") Integer num2, @InterfaceC1717i(name = "status") Integer num3) {
        this.f14173a = j;
        this.f14174b = str;
        this.f14175c = num;
        this.f14176d = str2;
        this.f14177e = str3;
        this.f14178f = num2;
        this.f14179g = num3;
    }

    public final LatestVersionResponse copy(@InterfaceC1717i(name = "id") long j, @InterfaceC1717i(name = "version") String str, @InterfaceC1717i(name = "version_code") Integer num, @InterfaceC1717i(name = "change_log") String str2, @InterfaceC1717i(name = "link_download") String str3, @InterfaceC1717i(name = "force_updated") Integer num2, @InterfaceC1717i(name = "status") Integer num3) {
        return new LatestVersionResponse(j, str, num, str2, str3, num2, num3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatestVersionResponse)) {
            return false;
        }
        LatestVersionResponse latestVersionResponse = (LatestVersionResponse) obj;
        return this.f14173a == latestVersionResponse.f14173a && h.a(this.f14174b, latestVersionResponse.f14174b) && h.a(this.f14175c, latestVersionResponse.f14175c) && h.a(this.f14176d, latestVersionResponse.f14176d) && h.a(this.f14177e, latestVersionResponse.f14177e) && h.a(this.f14178f, latestVersionResponse.f14178f) && h.a(this.f14179g, latestVersionResponse.f14179g);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        long j = this.f14173a;
        int i9 = ((int) (j ^ (j >>> 32))) * 31;
        int i10 = 0;
        String str = this.f14174b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (i9 + hashCode) * 31;
        Integer num = this.f14175c;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str2 = this.f14176d;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str3 = this.f14177e;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        Integer num2 = this.f14178f;
        if (num2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num2.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        Integer num3 = this.f14179g;
        if (num3 != null) {
            i10 = num3.hashCode();
        }
        return i15 + i10;
    }

    public final String toString() {
        return "LatestVersionResponse(id=" + this.f14173a + ", version=" + this.f14174b + ", versionCode=" + this.f14175c + ", changeLog=" + this.f14176d + ", linkDownload=" + this.f14177e + ", forceUpdate=" + this.f14178f + ", status=" + this.f14179g + ")";
    }
}
