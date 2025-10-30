package com.anilab.data.model.response;

import W.g;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class AllSettingsResponse {

    /* renamed from: a, reason: collision with root package name */
    public final DownloaderResponse f13980a;

    /* renamed from: b, reason: collision with root package name */
    public final MovieConfigResponse f13981b;

    /* renamed from: c, reason: collision with root package name */
    public final CommentConfigResponse f13982c;

    /* renamed from: d, reason: collision with root package name */
    public final ContactUsResponse f13983d;

    /* renamed from: e, reason: collision with root package name */
    public final SrcConfigResponse f13984e;

    /* renamed from: f, reason: collision with root package name */
    public final ListPlayerResponse f13985f;

    /* renamed from: g, reason: collision with root package name */
    public final String f13986g;

    /* renamed from: h, reason: collision with root package name */
    public final String f13987h;

    public AllSettingsResponse(@InterfaceC1717i(name = "download") DownloaderResponse downloaderResponse, @InterfaceC1717i(name = "movieConfig") MovieConfigResponse movieConfigResponse, @InterfaceC1717i(name = "commentConfig") CommentConfigResponse commentConfigResponse, @InterfaceC1717i(name = "contactUs") ContactUsResponse contactUsResponse, @InterfaceC1717i(name = "srcConfig") SrcConfigResponse srcConfigResponse, @InterfaceC1717i(name = "player") ListPlayerResponse listPlayerResponse, @InterfaceC1717i(name = "app_token") String str, @InterfaceC1717i(name = "client_id") String str2) {
        this.f13980a = downloaderResponse;
        this.f13981b = movieConfigResponse;
        this.f13982c = commentConfigResponse;
        this.f13983d = contactUsResponse;
        this.f13984e = srcConfigResponse;
        this.f13985f = listPlayerResponse;
        this.f13986g = str;
        this.f13987h = str2;
    }

    public final AllSettingsResponse copy(@InterfaceC1717i(name = "download") DownloaderResponse downloaderResponse, @InterfaceC1717i(name = "movieConfig") MovieConfigResponse movieConfigResponse, @InterfaceC1717i(name = "commentConfig") CommentConfigResponse commentConfigResponse, @InterfaceC1717i(name = "contactUs") ContactUsResponse contactUsResponse, @InterfaceC1717i(name = "srcConfig") SrcConfigResponse srcConfigResponse, @InterfaceC1717i(name = "player") ListPlayerResponse listPlayerResponse, @InterfaceC1717i(name = "app_token") String str, @InterfaceC1717i(name = "client_id") String str2) {
        return new AllSettingsResponse(downloaderResponse, movieConfigResponse, commentConfigResponse, contactUsResponse, srcConfigResponse, listPlayerResponse, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllSettingsResponse)) {
            return false;
        }
        AllSettingsResponse allSettingsResponse = (AllSettingsResponse) obj;
        return h.a(this.f13980a, allSettingsResponse.f13980a) && h.a(this.f13981b, allSettingsResponse.f13981b) && h.a(this.f13982c, allSettingsResponse.f13982c) && h.a(this.f13983d, allSettingsResponse.f13983d) && h.a(this.f13984e, allSettingsResponse.f13984e) && h.a(this.f13985f, allSettingsResponse.f13985f) && h.a(this.f13986g, allSettingsResponse.f13986g) && h.a(this.f13987h, allSettingsResponse.f13987h);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i9;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int i10 = 0;
        DownloaderResponse downloaderResponse = this.f13980a;
        if (downloaderResponse == null) {
            hashCode = 0;
        } else {
            hashCode = downloaderResponse.hashCode();
        }
        int i11 = hashCode * 31;
        MovieConfigResponse movieConfigResponse = this.f13981b;
        if (movieConfigResponse == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = movieConfigResponse.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        CommentConfigResponse commentConfigResponse = this.f13982c;
        if (commentConfigResponse == null) {
            i9 = 0;
        } else {
            i9 = commentConfigResponse.f14021a.f14056a;
        }
        int i13 = (i12 + i9) * 31;
        ContactUsResponse contactUsResponse = this.f13983d;
        if (contactUsResponse == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = contactUsResponse.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        SrcConfigResponse srcConfigResponse = this.f13984e;
        if (srcConfigResponse == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = srcConfigResponse.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        ListPlayerResponse listPlayerResponse = this.f13985f;
        if (listPlayerResponse == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = listPlayerResponse.hashCode();
        }
        int i16 = (i15 + hashCode5) * 31;
        String str = this.f13986g;
        if (str == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str.hashCode();
        }
        int i17 = (i16 + hashCode6) * 31;
        String str2 = this.f13987h;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i17 + i10;
    }

    public final String toString() {
        return "AllSettingsResponse(downloader=" + this.f13980a + ", movieConfig=" + this.f13981b + ", commentConfig=" + this.f13982c + ", contactUs=" + this.f13983d + ", srcConfig=" + this.f13984e + ", player=" + this.f13985f + ", appToken=" + this.f13986g + ", clientID=" + this.f13987h + ")";
    }
}
