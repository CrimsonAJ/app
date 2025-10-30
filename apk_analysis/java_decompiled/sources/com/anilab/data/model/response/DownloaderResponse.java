package com.anilab.data.model.response;

import W.g;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class DownloaderResponse {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f14091a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14092b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14093c;

    public DownloaderResponse(@InterfaceC1717i(name = "allow") Integer num, @InterfaceC1717i(name = "deeplink") String str, @InterfaceC1717i(name = "url_download") String str2) {
        this.f14091a = num;
        this.f14092b = str;
        this.f14093c = str2;
    }

    public final DownloaderResponse copy(@InterfaceC1717i(name = "allow") Integer num, @InterfaceC1717i(name = "deeplink") String str, @InterfaceC1717i(name = "url_download") String str2) {
        return new DownloaderResponse(num, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloaderResponse)) {
            return false;
        }
        DownloaderResponse downloaderResponse = (DownloaderResponse) obj;
        return h.a(this.f14091a, downloaderResponse.f14091a) && h.a(this.f14092b, downloaderResponse.f14092b) && h.a(this.f14093c, downloaderResponse.f14093c);
    }

    public final int hashCode() {
        Integer num = this.f14091a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f14092b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f14093c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloaderResponse(allow=");
        sb.append(this.f14091a);
        sb.append(", deeplink=");
        sb.append(this.f14092b);
        sb.append(", urlDownload=");
        return AbstractC0953k1.q(sb, this.f14093c, ")");
    }
}
